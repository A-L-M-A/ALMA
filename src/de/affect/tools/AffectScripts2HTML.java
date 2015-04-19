/*
 * AffectScripts2HTML.java
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

// i/o stuff
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// java utils
import java.util.Date;
import java.util.Timer;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.concurrent.Semaphore;

// own data types
import de.affect.mood.Mood;
import de.affect.emotion.EmotionType;

// managers
import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;

// own xml stuff
import de.affect.xml.AffectInputDocument.AffectInput;
import de.affect.xml.AffectScriptDocument;
import de.affect.xml.AffectScriptDocument.AffectScript.Item;
import de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect;

// xbeans stuff
import java.util.List;
import org.apache.xmlbeans.XmlException;

// statics
import static java.util.logging.Logger.global;
import static de.affect.util.FileHelper.createFileHelper;

/**
 * Class for generating HTML files out of affectscripts.
 */
public class AffectScripts2HTML {
  // script categories

  private static final String sCONTEXT_GOODRELATION = "Bruno und Anne sind Nachbarn und verstehen sich prima";
  private static final String sCONTEXT_GOODRELATION_ID = "Anne und Bruno verstehen sich gut/moegen sich";
  private static final String sCONTEXT_BADRELATION = "Clementine und Anne moegen sich nicht";
  private static final String sCONTEXT_BADRELATION_ID = "Anne und Clementine moegen sich nicht";
  private static final String sCONTEXT_UNKNOWN_ID = "Unknown";

  // dictionary, files and scripts
  private AffectManager fAffectManager = null;
  private AffectDictionary fDictionary;
  private String fScriptsDir;
  private String fOutfile;
  private HashMap<String, ArrayList<AffectScriptData>> fAffectScripts = new HashMap<String, ArrayList<AffectScriptData>>();

  // script timer and execution time
  private Timer fScriptTimer = new Timer(true);
  private long fScriptTime = 0;

  // flags
  private boolean fShowFilename;
  private boolean fShowTags;
  private boolean fGenerateQuestions;
  private boolean fGenerateEmotions;
  private boolean fGenerateMoods;

  // wait for script lock 
  private Semaphore fLock = new Semaphore(0, true);

  /**
   * Main routine.
   * Converts all scripts in provided directory into a single HTML file.
   * @param args Program arguments.
   * @throws IOException If any file cannot be opened.
   * @throws XmlException If the affect manager could not be properly initialized.
   */
  public static void main(String[] args) throws IOException, XmlException {
    if (args.length < 4) {
      System.out.println("Missing arguments.");
      System.out.println("Usage: AffectScripts2HTML <computation specification> <character definition> <dictionary file> <language> <scripts directory> <output html file> <show filenames> <show tags> <generate questions> <generate emotion> <generate mood>");
      return;
    }
    AffectScripts2HTML as2h = new AffectScripts2HTML(args[0], args[1], args[2], args[3], args[4], args[5],
      Boolean.parseBoolean(args[6]), Boolean.parseBoolean(args[7]),
      Boolean.parseBoolean(args[8]), Boolean.parseBoolean(args[9]),
      Boolean.parseBoolean(args[10]));
    as2h.convert();
    as2h.finish();
  }

  /**
   * Convert affectscripts contained in given script dir into a human readable HTML file.
   * @param compSpecs Computation specification file (only needed if generating emotions or moods).
   * @param defSpecs Character definitions file (only needed if generating emotions or moods).
   * @param dictFile The dictionary file to use.
   * @param language The language used for converting tags.
   * @param scriptsDir Where the scripts are stored.
   * @param outFile The filename of the HTML file that is to be created.
   * @param showFilename Whether to show or not to show the filename.
   * @param showTags Indicates whether tag annotations should be displayed or removed.
   * @param generateQuestions Append the generated questions. If showTags is true questions about the tag will be included additionally.
   * @param generateEmotions If true and generateQuestions is true each script is executed and questions about the characters emotions will be generated.
   * @param generateMoods Same as generateEmotions but for moods.
   * @throws IOException If any file cannot be opened.
   * @throws XmlException If the affect manager could not be properly initialized.
   */
  public AffectScripts2HTML(String compSpecs, String defSpecs, String dictFile, String language, String scriptsDir, String outFile,
    boolean showFilename, boolean showTags, boolean generateQuestions,
    boolean generateEmotions, boolean generateMoods) throws IOException, XmlException {
    // set i/o stuff
    createFileHelper();
    fScriptsDir = scriptsDir;
    fOutfile = outFile;
    fDictionary = new AffectDictionary(new File(dictFile));
    fDictionary.setLanguage(language);
    // set flags
    fShowFilename = showFilename;
    fShowTags = showTags;
    fGenerateQuestions = generateQuestions;
    fGenerateEmotions = generateEmotions;
    fGenerateMoods = generateMoods;
    // initialize affect manager if need to
    if (fGenerateEmotions || fGenerateMoods) {
      fAffectManager = new AffectManager(compSpecs, defSpecs, false);
    }
  }

  /**
   * Classifies an affectScriptDocument according to its context content, and  stores it.
   * @param doc an AffecScriptDocument object
   */
  public void classification(String name, AffectScriptDocument doc) {
    AffectScriptDocument.AffectScript script = doc.getAffectScript();
    if (script.isSetContext()) {
      String context = script.getContext();
      String key = "";
      if (context.contains(sCONTEXT_GOODRELATION)) {
        key = sCONTEXT_GOODRELATION_ID;
      } else if (context.contains(sCONTEXT_BADRELATION)) {
        key = sCONTEXT_BADRELATION_ID;
      } else {
        key = sCONTEXT_UNKNOWN_ID;
      }
      ArrayList<AffectScriptData> aSD = fAffectScripts.get(key);
      // if category is not present, add it
      aSD = (aSD == null) ? new ArrayList<AffectScriptData>() : aSD;
      // store name and script document
      aSD.add(new AffectScriptData(name, doc));
      // put both in category hashtable 
      fAffectScripts.put(key, aSD);
    }
  }

  public String convertAll() {
    StringBuffer output = new StringBuffer();
    AffectManager.sLog.info("Converting scripts of " + fAffectScripts.size() + " categories");
    for (String key : fAffectScripts.keySet()) {
      // category
      if (!key.equals(sCONTEXT_UNKNOWN_ID)) {
        output.append("<h3>" + key + "</h3>");
      }
      // process scripts
      ArrayList<AffectScriptData> allAffectScriptData = fAffectScripts.get(key);
      int index = 0, amount = allAffectScriptData.size();
      AffectManager.sLog.info("Converting " + amount + " scripts of category '" + key + "'.");
      for (AffectScriptData asd : allAffectScriptData) {
        if (fShowFilename) {
          output.append("<h4>" + asd.fName + "</h4>");
        }
        AffectManager.sLog.info("Processing script " + asd.fName);
        output.append(convert(asd.fScriptDoc, (key.equals(sCONTEXT_UNKNOWN_ID) ? true : false)));
        output.append("<br><hr><br>\n");
        AffectManager.sLog.info("Category done to " + (100.0 * ((float) ++index) / ((float) amount)) + "%.");
      }
    }
    AffectManager.sLog.info("All categories done");
    return output.toString();
  }

  /**
   * Converts and AffectScriptDocument into a readable html questionaire
   * @param doc an AffecScriptDocument object
   */
  public String convert(AffectScriptDocument doc, boolean includeSituation) {
    StringBuilder output = new StringBuilder();
    StringBuilder questions = new StringBuilder();
    AffectScriptDocument.AffectScript script = doc.getAffectScript();
    if (script.isSetContext() && includeSituation) {
      output.append("<b>Situation</b>:<br>");
      output.append(script.getContext());
      output.append("<br><br>");
    }
    // build dialog context
    int lines = 0;
    List<Item> items = script.getItemList();
    int signalCnt = 0;
    for (Item item : items) {
      // no context present
      if (!item.isSetContext()) {
        continue;
      }
      // get context (and associated signal)
      String context = item.getContext();
      if (item.isSetAffectInput()) {
        String signal = null;
        AffectInput ai = item.getAffectInput();
        if (ai.isSetAct()) {
          signal = "[" + fDictionary.translate(ai.getAct().getType()) + " " + ai.getAct().getAddressee() + "]";
        } else if (ai.isSetEvent()) {
          signal = "[" + fDictionary.translate(ai.getEvent().getType().toString()) + "]";
        } else if (ai.isSetAction()) {
          signal = "[" + fDictionary.translate(ai.getAction().getType().toString()) + "]";
        } else if (ai.isSetObject()) {
          signal = "[" + fDictionary.translate(ai.getObject().getType().toString()) + "]";
        }
        if (signal != null) {
          signalCnt++;
          context = (fShowTags) ? context.replaceAll("\\[signal\\]", "<b>" + signal + "</b>" + (fGenerateQuestions ? "(" + signalCnt + ")" : "")) : context.replaceAll("\\[signal\\]", "");
          if (fShowTags && fGenerateQuestions) {
            if (signalCnt == 1) {
              questions.append("<br><i>Wie realistisch fanden Sie den obigen Text?</i><br>\n");
              questions.append(buildQuestion("gar nicht", "sehr", -1));
              questions.append("<br><i>Wie gut wird der Dialogbeitrag durch die Aussage in den eckigen Klammern beschrieben?</i><br>\n");
            }
            questions.append(buildQuestion("gar nicht", "sehr gut", signalCnt));
          }
        }
      }
      // highlight turns
      String[] turns = context.split("\n");
      for (int j = 0; j < turns.length; ++j) {
        String text = turns[j].trim();
        String[] turn = text.split(":", 2);
        if (turn.length > 1) {
          text = turn[1];
          // consider the case a : is used in the text
          String perfomer = turn[0];
          if (!perfomer.contains(" ")) {
            output.append("<b>");
            output.append(perfomer);
            output.append(":</b>");
          } else {
            output.append(perfomer).append(":");
          }
        }
        output.append(text);
        // append newline
        if (j < turns.length - 1) {
          output.append("<br>");
        }
      }
      // append newlines
      output.append("<br>");
    }
    // if generating emotions/moods wait until script is finished
    if (fAffectManager != null) {
      fScriptTime = System.currentTimeMillis();
      new ScriptExecutionTask(items, 0, questions);
      fLock.acquireUninterruptibly();
    }
    // append questions?
    if (fGenerateQuestions || fGenerateEmotions || fGenerateMoods) {
      output.append(questions);
    }
    // done
    return output.toString();
  }

  /**
   * Build dimensional part of the question dialog.
   */
  private String buildQuestion(String left, String right, int number) {
    StringBuilder output = new StringBuilder();
    output.append("<br>");
    if (number != -1) {
      output.append("(" + number + ") ");
    }
    output.append(left);
    output.append("&nbsp;");
    for (int i = 1; i <= 5; ++i) {
      output.append("<td width=\"70\">&#x25A2" + ((i < 5) ? "&nbsp;&nbsp;&nbsp;" : "&nbsp;") + "</td>");
    }
    output.append(right);
    output.append("<br>");
    return output.toString();
  }

  /**
   * Loads a given File and returns an AffectScriptDocument, if the file is valid
   * @param affectScript an File containing an affect script document
   * @return an AffectScriptDocument
   */
  private AffectScriptDocument load(File affectScript) {
    try {
      return AffectScriptDocument.Factory.parse(affectScript);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }
    return null;
  }

  public void save(String out) {
    try {
      FileWriter fw = new FileWriter(new File(fOutfile));
      fw.write(out);
      fw.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void convert() {
    try {
      StringBuilder outHTML = new StringBuilder();
      outHTML.append("<html>\n<head>\n</head>\n<body>\n");
      // read e	very aml File in dir
      File[] amlFiles = (new File(fScriptsDir)).listFiles();
      for (File amlFile : amlFiles) {
        String name = amlFile.getName();
        if (name.endsWith("aml")) {
          name = name.substring(0, name.indexOf("."));
          classification(name, load(amlFile));
        }
      }
      outHTML.append(convertAll());
      outHTML.append("</body>\n</html>\n");
      save(outHTML.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Finish convertion and stop affectmanager (if running).
   */
  public void finish() {
    if (fAffectManager != null) {
      fAffectManager.stopAll();
    }
  }

  /**
   * Script execution task.
   */
  private class ScriptExecutionTask extends TimerTask {
    // complete script

    private List<Item> fScript;

    // current item
    private Item fItem;

    // item index
    private int fIndex;

    // questions
    private StringBuilder fQuestions;

    /**
     * Create new script execution task.
     * This task will automatically schedule itself.
     * @param script The complete script.
     * @param index The index of the item this task should execute.
     * @param questions Where to append the questions
     */
    public ScriptExecutionTask(List<Item> script, int index, StringBuilder questions) {
      // init vars
      fScript = script;
      fItem = script.get(index);
      fIndex = index;
      fQuestions = questions;

      // schedule task
      fScriptTimer.schedule(this, new Date(fScriptTime + fItem.getTime()));
    }

    /**
     * Execute the task.
     */
    public void run() {
      // process the item
      try {
        // process affect input
        if (fItem.isSetAffectInput()) {
          fAffectManager.processSignal(fItem.getAffectInput());
        }

        // TODO: implement appraisal handling
        /*if (m_item.isSetAppraisal()) {
        }*/

        // reset character
        if (fItem.isSetResetCharacter()) {
          String characterName = fItem.getResetCharacter().getName().trim();
          CharacterManager character = fAffectManager.getCharacterByName(characterName);
          character.setPersonality(character.getPersonality());
        }
      } catch (Exception exception) {
        AffectManager.sLog.severe("Error while processing affect input item " + fIndex + ".");
        exception.printStackTrace();
      }

      // schedule the next item
      AffectManager.sLog.info("--> Script done to " + (100.0 * ((float) ++fIndex) / ((float) fScript.size())) + "%.");
      if (fIndex < fScript.size()) {
        new ScriptExecutionTask(fScript, fIndex, fQuestions);
        return;
      }

      // build questions
      for (CharacterManager character : fAffectManager.getCharacters()) {
        // get name
        String name = character.getName();

        // insert emotion question
        if (fGenerateEmotions) {
          EmotionType emotion = character.getCurrentEmotions().getDominantEmotion().getType();
          if (emotion != EmotionType.Undefined) {
            fQuestions.append("<br><i>Bei " + name + " wurde die Emotion <b><font color=\"#cf420b\">" + fDictionary.translate(emotion.toString()) + "</font></b> ausgel&ouml;st. Wie passend fanden Sie diese?</i><br>\n");
            fQuestions.append(buildQuestion("gar nicht", "sehr gut", -1));
          }
        }

        // insert mood question
        if (fGenerateMoods) {
          Mood dMood = character.defaultMood(), cMood = character.getCurrentMood();
          String source = fDictionary.translate(dMood.getMoodWordIntensity()) + " " + fDictionary.translate(dMood.getMoodWord());
          String target = fDictionary.translate(cMood.getMoodWordIntensity()) + " " + fDictionary.translate(cMood.getMoodWord());
          if (!source.equals(target)) {
            fQuestions.append("<br><i>Wie passend finden Sie die bei " + name + " stattgefundene Stimmungs&auml;nderung von <b>" + source + "</b> nach <b><font color=\"#e1cb12\">" + target + "</font></b>.</i><br>\n");
            fQuestions.append(buildQuestion("gar nicht", "sehr gut", -1));
          }
        }
      }

      // done
      fLock.release();
    }
  }

  /**
   * Tiny class to store script data.
   */
  private class AffectScriptData {

    public String fName = null;
    public AffectScriptDocument fScriptDoc = null;

    AffectScriptData(String name, AffectScriptDocument scriptDoc) {
      fName = name;
      fScriptDoc = scriptDoc;
    }
  }
}
