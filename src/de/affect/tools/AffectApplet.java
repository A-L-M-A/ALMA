/*
 * AffectApplet.java
 *
 * Copyright (c) 2004, 2005, 2006, 2007, 2008, Patrick Gebhard, DFKI GmbH
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in 
 *     the documentation and/or other materials provided with the 
 *     distribution.
 *
 *   - Neither the name of the DFKI GmbH nor the names of its contributors
 *     may be used to endorse or promote products derived from this software
 *     without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE. 
 */
package de.affect.tools;

// applet stuff
import java.applet.Applet;

// i/o stuff
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// utils
import java.util.Date;
import java.util.Timer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;

// netscape stuff
//import netscape.javascript.JSObject;

// managers
import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;

// own data types
import de.affect.mood.Mood;

// own utils
import de.affect.manage.event.AffectUpdateEvent;
import de.affect.manage.event.AffectUpdateListener;

// own xml stuff
import de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect;
import de.affect.xml.AffectScriptDocument.AffectScript.Item;
import de.affect.xml.AffectScriptDocument;
import de.affect.xml.AffectInputDocument.AffectInput;
import de.affect.xml.EmotionType;
import de.affect.xml.MoodType;
import java.net.URL;
import java.util.List;

/**
 * The affect applet encapsulates an instance of the affect manager.
 * @author Gernot Gebhard, 2005 (based on the conceptual work of Patrick Gebhard) 
 */
public class AffectApplet extends Applet implements AffectUpdateListener {
  // document instance

  //private JSObject m_document = null;

  // affectmanager instance
  private AffectManager m_manager = null;

  // affectscript document
  private AffectScriptDocument m_doc = null;

  // affect evaluation data
  private AffectEvaluation m_evalDoc = null;

  // current affect script
  private List<Item> m_script = null;

  // script execution time
  private long m_time = 0;

  // script timer
  private Timer m_timer = new Timer(true);

  // current script execution task
  private ScriptExecutionTask m_task = null;

  // internal lock
  private Semaphore m_inner = new Semaphore(1, true);

  // lock for 'outer' affairs
  private Semaphore m_outer = new Semaphore(1, true);

  // all available characters
  private HashSet<String> m_characters = new HashSet<String>();

  // cached character data
  private HashMap<String, String[]> m_cache = new HashMap<String, String[]>();

  // display control vars
  private boolean m_display_emotion = true;
  private boolean m_display_default = true;
  private boolean m_display_mood = true;
  private boolean m_display_tendency = true;
  private boolean m_display_query = true;

  // dictionary
  private AffectDictionary m_dictionary = null;

  /**
   * Initialize the affect applet.
   */
  public void init() {
    // access document
    AffectManager.sLog.info("Initializing AffectApplet...");
    //m_document = getAppletContext()..showDocument(this);//JSObject.getWindow(this);

    // init affect manager
    try {
      // init schtuff
      m_dictionary = new AffectDictionary(parameter("dictionary"));
      m_evalDoc = new AffectEvaluation(parameter("evalDir"));

      // get computation
      InputStream computation = getClass().getResourceAsStream(parameter("compSpecs"));
      if (computation == null) {
        throw new RuntimeException("Cannot open stream to '" + parameter("compSpecs") + "'.");
      }

      // get defintion 
      InputStream definition = getClass().getResourceAsStream(parameter("defSpecs"));
      if (definition == null) {
        throw new RuntimeException("Cannot open stream to '" + parameter("defSpecs") + "'.");
      }

      // create affect manager
      m_manager = new AffectManager(computation, definition, false);

      // init the javascript interface
      call("init", new Object[0]);

      // listen to affect manager
      m_manager.addAffectUpdateListener(this);
    } // simply rethrow runtime excpetions
    catch (RuntimeException exception) {
      throw exception;
    } // something went wrong so make the applet crash
    catch (Exception exception) {
      throw new RuntimeException(exception);
    }
  }

  /**
   * This is called when everything in init has worked fine.
   */
  public void start() {
    if (m_manager != null) {
      AffectManager.sLog.info("Done.");
    } else {
      AffectManager.sLog.info("Failed.");
    }
  }

  /**
   * Stop the affect script applet.
   */
  public void stop() {
    AffectManager.sLog.info("Stopping AffectApplet...");
    if (m_manager != null) {
      m_manager.stopAll();
      m_manager.removeAffectUpdateListener(this);
    }
  }

  /**
   * Set language.
   * Warns if the given language is unknown.
   * @param language New interface language.
   */
  public void setLanguage(String language) {
    m_dictionary.setLanguage(language);
  }

  /**
   * Set list of available characters.
   * The applet knows which characters are available but does not know which should be displayed.
   * This function is called by javascript and thus is also included in the critical section.
   * @param characters A ',' separated list of characters.
   * @param emotion Dominant Emotion should be displayed?
   * @param def Show default mood?
   * @param mood Mood should be displayed?
   * @param tendency Mood tendency should be displayed?
   * @param query User query enabled?
   */
  public void setDisplay(String characters, boolean emotion, boolean def, boolean mood, boolean tendency, boolean query) {
    // either affect update or this function may operate on html site
    m_outer.acquireUninterruptibly();

    // do the thing
    try {
      // setup stuff
      m_display_emotion = emotion;
      m_display_default = def;
      m_display_mood = mood;
      m_display_tendency = tendency;
      m_display_query = query;

      // create display
      m_characters.clear();
      String display = "<table border=\"1\" cellpadding=\"2\" cellspacing=\"2\" width=\"100%\" height=\"100%\">";
      for (String name : characters.split(",")) {
        // insert character
        display += "<tr align=\"left\"><td><h1><b>" + name + "</b></h1><br><div id=\"" + name + "\">";
        m_characters.add(name);
        String[] data = m_cache.get(name);
        if (data == null) {
          m_cache.put(name, data = new String[]{"-", "- ", "- ", "- "});
        }

        // character details
        if (m_display_emotion) {
          display += "<br>" + data[0];
        }
        if (m_display_default) {
          display += "<br>" + data[1];
        }
        if (m_display_mood) {
          display += "<br>" + data[2];
        }
        if (m_display_tendency) {
          display += "<br>" + data[3];
        }

        // done
        display += "</div></td></tr>";
      }
      display += "</table>";
      call("setDisplay", new Object[]{"content", display});
    } catch (Exception exception) {
      exception.printStackTrace();
    }

    // done
    m_outer.release();
  }

  /**
   * Set the dialog contents by extracting the context information out of the 
   * given script file respectively displaying an ordinary html file
   * This will additonally load the associated script.
   * @param file The name of the script file.
   */
  public void setDialog(String file) {
    // parse script file
    StringBuilder output = new StringBuilder();
    int lines = 0;
    if (file.endsWith(".aml")) {
      try {
        m_doc = AffectScriptDocument.Factory.parse(getClass().getResourceAsStream(file));
        lines = buildDialog(m_doc, output);
      } catch (Exception exception) {
        output.append("An internal error has occured.<br><br>" + exception.getMessage());
        AffectManager.sLog.severe("Cannot play given script: " + file);
        exception.printStackTrace();
      }
      try {
        call("showPlayButton", new Object[]{"Auswirkungen berechnen"});
        call("hideNextButton", null);
      } catch (Exception exception) {
        exception.printStackTrace();
      }
    }

    // read html file
    if (file.endsWith(".html")) {
      output.append(loadHTML(getClass().getResourceAsStream(file)));
      try {
        call("hidePlayButton", null);
        call("showNextButton", new Object[]{" Weiter "});
      } catch (Exception exception) {
        exception.printStackTrace();
      }
    }

    // display dialog
    try {
      call("setDialog", new Object[]{output.toString(), lines});
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  /**
   * Show question dialog.
   */
  public void setQuestion() {
    // question
    StringBuilder output = null;

    // acquire information for each available character
    if (m_display_query && (m_display_emotion || m_display_mood)) {
      output = new StringBuilder();
      for (String name : m_characters) {
        // generate question
        CharacterManager character = m_manager.getCharacterByName(name);
        output.append("<br><br><span class=\"question\">Wie passend fanden sie die bei " + name);

        // query emotion
        if (m_display_emotion) {
          String dominantEmotion = character.getCurrentEmotions().getDominantEmotion().getType().toString();
          output.append(" ausgel&ouml;ste Emotion <span class=\"emot\">");
          output.append(m_dictionary.translate(dominantEmotion));
          output.append("</span>?</span> ");
          buildQuestion("emotion", name, dominantEmotion, output);
        } // query mood
        else {
          Mood mood = character.getCurrentMood();
          String intensity = m_dictionary.translate(mood.getMoodWordIntensity());
          Mood defMood = character.defaultMood();
          String defIntensity = m_dictionary.translate(defMood.getMoodWordIntensity());
          output.append(" stattgefundene Stimmungs&auml;nderung von <span class=\"defmood\">");
          output.append(defIntensity);
          output.append(" ");
          output.append(m_dictionary.translate(defMood.getMoodWord()));
          output.append("</span> nach <span class=\"mood\">");
          if (intensity.length() > 0) {
            output.append(intensity);
            output.append(" ");
          }
          output.append(m_dictionary.translate(mood.getMoodWord()));
          output.append("</span>?</span>");
          buildQuestion("mood", name, intensity + mood.getMoodWord(), output);
        }
      }
    }

    // display question and clear highlighting after a second
    try {
      Thread.sleep(1000);
      call("clear", null);
      if (output != null) {
        call("setQuestion", new Object[]{output.toString()});
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }

    // update play button
    try {
      call("showPlayButton", new Object[]{"Nochmal berechnen"});
      call("showNextButton", new Object[]{"Weiter"});
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  /**
   * Play previously loaded script.
   */
  public void play() {
    // only run script if there is no active script
    if ((m_doc != null) && (m_script == null) && m_inner.tryAcquire()) {
      m_script = m_doc.getAffectScript().getItemList();
      m_time = System.currentTimeMillis();
      m_task = new ScriptExecutionTask(0, 0);
    } // we are busy -> forget it
    else {
      AffectManager.sLog.info("Cannot play given script because another one is currently being executed.");
    }
  }

  /**
   * Cancel current active script.
   */
  public void cancel() {
    // cancel current active script if there is a script
    if (m_script != null) {
      try {
        // lock up
        m_inner.acquire();

        // if there is a task running cancel it, and be done
        if (m_task != null) {
          m_task.cancel();
        }

        // release lock
        m_inner.release();
      } // if this happens it means that the applet is going down, so its no big deal
      catch (InterruptedException exception) {
      }
    }
  }

  /**
   * Handle affect update event.
   * @param event Current affect update event.
   */
  public void update(AffectUpdateEvent event) {
    // either javascript or this function may operate at once
    if (!m_outer.tryAcquire()) {
      return;
    }

    // do the thing
    try {
      for (CharacterAffect character : event.getUpdate().getAffectOutput().getCharacterAffectList()) {
        // access cached data or create new cache
        String name = character.getName();
        String[] data = m_cache.get(name);
        if (data == null) {
          m_cache.put(name, data = new String[]{"-", "- ", "- ", "- "});
        }

        // get character data
        EmotionType emotion = character.getDominantEmotion();
        MoodType def = character.getDefaultMood();
        MoodType mood = character.getMood();
        MoodType tendency = character.getMoodTendency();
        String tendencyName = (tendency.getMoodword() != null) ? tendency.getMoodword().toString() : "-";
        String tendencyIntensity = (tendency.getIntensity() != null) ? tendency.getIntensity().toString() : "";

        // compute new values and check for changes
        if ((update(data, 0, (intensity(emotion.getValue()) == 0.0) ? "-" : "<span class=\"emot\">" + m_dictionary.translate(emotion.getName().toString()) + "</span>") || update(data, 1, "<span class=\"default\">" + m_dictionary.translate(def.getIntensity().toString()) + " " + m_dictionary.translate(def.getMoodword().toString()) + "</span>") || update(data, 2, "<span class=\"mood\">" + m_dictionary.translate(mood.getIntensity().toString()) + " " + m_dictionary.translate(mood.getMoodword().toString()) + "</span>") || update(data, 3, "<span class=\"tendency\">" + m_dictionary.translate(tendencyIntensity) + " " + m_dictionary.translate(tendencyName) + "</span>")) && m_characters.contains(name)) {
          String display = "";
          if (m_display_emotion) {
            display += "<br>" + data[0];
          }
          if (m_display_default) {
            display += "<br>" + data[1];
          }
          if (m_display_mood) {
            display += "<br>" + data[2];
          }
          if (m_display_tendency) {
            display += "<br>" + data[3];
          }
          call("setDisplay", new Object[]{name, display});
        }
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }

    // be gone
    m_outer.release();
  }

  /**
   * Get value of given parameter.
   * @param name Parameter name.
   * @return Parameter value.
   * @throws Exception If the given paramter is not set.
   */
  private String parameter(String name) throws Exception {
    String value = getParameter(name);
    if (value == null) {
      throw new Exception("Required parameter '" + name + "' is missing.");
    }
    return value;
  }

  /**
   * Call javascript function.
   * To make sure that the call does not hang the system start it in a new thread.
   * @param function Function name.
   * @param args Function arguments.
   */
  private void call(final String function, final Object[] args) throws Exception {


    //if (m_document != null) {
      (new Thread() {

      @Override
        public void run() {
        try {
          getAppletContext().showDocument(new URL("javascript:" + function + "(\"" + args.toString() + "\")"));
          } catch(Exception e) {
            e.printStackTrace();
          }
          //m_document.call(function, args);

        }
      }).start();
    //}
  }

  /**
   * Update array at the given index with given value and report if a change has occured.
   * @param array The array to update.
   * @param index The array index.
   * @param value The new value.
   * @return True if the entry had to be updated.
   */
  private boolean update(String[] array, int index, String value) {
    // update
    if (!array[index].equals(value)) {
      array[index] = value;
      return true;
    }

    // not necessary
    return false;
  }

  /**
   * Get the intensitity encoded in the given string.
   * @param str String encoded intentsity. 
   * @return Encoded intensitiy.
   */
  private double intensity(String str) {
    // special case
    if ("null".equals(str)) {
      return 0.0;
    }

    // try to parse double
    try {
      return Double.parseDouble(str);
    } catch (Exception exception) {
      return 1.0;
    }
  }

  /**
   * Add answer to evaluation.
   * @param entity To whatever the anser belongs to.
   * @param type Type of the answer.
   * @param value Well the answer.
   */
  public void addAnswer(String entity, String type, String value) {
    m_evalDoc.add(entity, type, value, "0");
  }

  /**
   * Add answer to evaluation.
   * @param entity To whatever the anser belongs to.
   * @param type Type of the answer.
   * @param value Well the answer.
   * @param topic Current topic.
   */
  public void addAnswer(String entity, String type, String value, String topic) {
    m_evalDoc.add(entity, type, value, topic);
  }

  /**
   * Save and clear evaluation data.
   */
  public void saveEvaluationData() {
    m_evalDoc.save();
    m_evalDoc.clear();
  }

  /**
   * Reads an HTML file and displays it.
   * This function only reads the "real" contents of the HTML file,
   * which is everything between <body> and </body>.
   * @param in InputStream of the HTML file.
   * @return HTML as string.
   */
  private String loadHTML(InputStream in) {
    StringBuilder out = new StringBuilder();
    try {
      BufferedReader inReader = new BufferedReader(new InputStreamReader(in));
      int state = 0;
      String line;
      while ((state < 2) && ((line = inReader.readLine().trim()) != null)) {
        // find <body> tag
        if (state == 0) {
          int index = line.indexOf("<body>");
          if (index != -1) {
            state = 1;
            line = line.substring(index + 6);
          } else {
            continue;
          }
        }

        // find </body> tag
        if (state == 1) {
          int index = line.indexOf("</body>");
          if (index != -1) {
            state = 2;
            line = line.substring(0, index);
          }
        }

        // insert line
        out.append(line).append('\n');
      }
      inReader.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return out.toString();
  }

  /**
   * Build the dialog based on context information given by an ALMA affect script.
   * @param doc An alma affect script (xml) document
   * @param output Where to put the output into.
   * @return The number of highlightable lines.
   */
  private int buildDialog(AffectScriptDocument doc, StringBuilder output) {
    // add global context
    AffectScriptDocument.AffectScript script = doc.getAffectScript();
    if (script.isSetContext()) {
      output.append("<b>Situation</b>:<br>");
      output.append(script.getContext());
      output.append("<br><br>");
    }

    // build dialog context
    int lines = 0;
    List<Item> items = script.getItemList();
    for (Item item : items) {
      if (!item.isSetContext()) {
        continue;
      }

      // get context (and associated signal)
      String context = item.getContext();
      if (item.isSetAffectInput()) {
        String signal = null;
        AffectInput ai = item.getAffectInput();
        if (ai.isSetAct()) {
          signal = "[" + m_dictionary.translate(ai.getAct().getType()) + " " + ai.getAct().getAddressee() + "]";
        } else if (ai.isSetEvent()) {
          signal = "[" + m_dictionary.translate(ai.getEvent().getType().toString()) + "]";
        } else if (ai.isSetAction()) {
          signal = "[" + m_dictionary.translate(ai.getAction().getType().toString()) + "]";
        } else if (ai.isSetObject()) {
          signal = "[" + m_dictionary.translate(ai.getObject().getType().toString()) + "]";
        }
        if (signal != null) {
          context = context.replaceAll("\\[signal\\]", "<b>" + signal + "</b>");
        }
      }

      // append line information
      output.append("<span id=\"dialogline");
      output.append(lines++);
      output.append("\" class=\"inactive\">");

      // highlight turns
      String[] turns = context.split("\n");
      for (int j = 0; j < turns.length; ++j) {
        String text = turns[j].trim();
        String[] turn = text.split(":", 2);
        if (turn.length > 1) {
          text = turn[1];
          output.append("<b>");
          output.append(turn[0]);
          output.append(":</b>");
        }
        output.append(text);

        // append newline
        if (j < turns.length - 1) {
          output.append("<br>");
        }
      }

      // done with this "line"
      output.append("</span>");
      if (items.indexOf(item) < items.size()) {
        output.append("<br>");
      }
    }

    // done
    return lines;
  }

  /**
   * Build (part of) the question dialog.
   * @param type Question type.
   * @param name Character name.
   * @param output Where to put the dialog into.
   */
  private void buildQuestion(String type, String name, String affectType, StringBuilder output) {
    output.append("<table width=\"490\">");
    output.append("<tr>");
    output.append("<td width=\"70\"><span class=\"question\">gar nicht</span></td>");
    for (int i = 1; i <= 5; ++i) {
      output.append("<td width=\"70\"><input name=\"");
      output.append(type);
      output.append('_');
      output.append(name);
      output.append(" value=\"");
      output.append(i);
      output.append("\" type=\"radio\" onClick=\"document.affect.addAnswer('" + name + "','" + affectType + "','" + i + "',current)\"></td>");
    }
    output.append("<td width=\"70\"><span class=\"question\">sehr</span></td>");
    output.append("</tr>");
    output.append("</table>");
  }

  /**
   * Script execution task.
   */
  private class ScriptExecutionTask extends TimerTask {
    // item index

    private int m_index;

    // line index
    private int m_line;

    // script item
    private Item m_item;

    // indicates if this task has been cancelled
    private boolean m_cancelled;

    /**
     * Create new script execution task.
     * This task will automatically schedule itself.
     * @param index The index of the item this task should execute.
     * @param line The index of the line that should be highlighted.
     */
    public ScriptExecutionTask(int index, int line) {
      // init vars
      m_index = index;
      m_line = line;
      m_item = m_script.get(m_index);
      m_cancelled = false;

      // schedule task
      m_timer.schedule(this, new Date(m_time + m_item.getTime()));

      // release lock to enable script cancellation
      m_inner.release();
    }

    /**
     * Execute the task.
     */
    public void run() {
      // execute the task
      try {
        // acquire the lock
        m_inner.acquire();

        // at this point it is possible that we have been cancelled
        if (m_cancelled) {
          m_task = null;
          m_script = null;
          m_inner.release();
          return;
        }

        // process the item
        try {
          // first highlight the line if necessary
          if (m_item.isSetContext()) {
            call("highlight", new Object[]{m_line++});
          }

          // process affect input
          if (m_item.isSetAffectInput()) {
            m_manager.processSignal(m_item.getAffectInput());
          }

          // TODO: implement appraisal handling
	  /*if (m_item.isSetAppraisal()) {

          }*/

          // reset character
          if (m_item.isSetResetCharacter()) {
            String characterName = m_item.getResetCharacter().getName().trim();
            CharacterManager character = m_manager.getCharacterByName(characterName);
            // setting the personality resets a character affective state
            character.setPersonality(character.getPersonality());
          }
        } catch (Exception exception) {
          AffectManager.sLog.severe("Error while processing affect input item " + m_index + ".");
          exception.printStackTrace();
        }

        // schedule the next item
        if (++m_index < m_script.size()) {
          m_task = new ScriptExecutionTask(m_index, m_line);
          return;
        }

        // we are done with the script
        m_task = null;
        m_script = null;
        m_inner.release();

        // display query
        setQuestion();
      } // we have been interrupted
      catch (InterruptedException exception) {
        AffectManager.sLog.warning("Script execution has been interrupted abnormally.");
      }
    }

    /**
     * Cancel this task.
     * This function should only be called if the task has not yet acquired the lock.
     * @return Always true.
     */
    public boolean cancel() {
      if (super.cancel()) {
        m_task = null;
        m_script = null;
      }
      m_cancelled = true;
      return true;
    }
  }
}
