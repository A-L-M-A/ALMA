/*
 * InteractionSimulationPanel.java
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
package de.affect.gui.simulation;

import java.io.File;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import org.apache.xmlbeans.XmlOptions;

import de.affect.manage.AffectManager;
import de.affect.manage.GroupManager;
import de.affect.manage.CharacterManager;
import de.affect.data.ActType;
import de.affect.mood.MoodType;
import de.affect.emotion.EmotionType;
import de.affect.manage.event.AffectInputEvent;
import de.affect.manage.event.AffectInputListener;
import de.affect.xml.AffectScriptDocument;
import de.affect.xml.AffectScriptDocument.AffectScript;
import de.affect.xml.AffectInputDocument.AffectInput;

import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;

import static de.affect.gui.Helpers.mediumButtonSize;
import static de.affect.gui.Helpers.getFillerBox;
import static de.affect.util.FileHelper.sALMAScriptPath;
import static de.affect.util.FileHelper.sALMADefaultScriptFile;
import static de.affect.util.FileHelper.sRecordIcon;
import static de.affect.util.FileHelper.sPlayIcon;
import static de.affect.util.FileHelper.sRunningIcon;
import static de.affect.util.FileHelper.sStopIcon;
import static de.affect.xml.util.Helpers.getPerformer;
import static de.affect.xml.util.Helpers.getAddressee;
import static de.affect.xml.util.Helpers.getListener;

/**
 * Interaction simulation panel
 *
 * @author Gernot Gebhard, 2004-2005 (initial release)
 * @author Patrick Gebhard, 2005 (added script player functionality)
 */
public class InteractionSimulationPanel extends JPanel implements ActionListener, AffectInputListener {
  // available groups

  JComboBox m_groups = new JComboBox();
  // editing dialog
  InteractionEditDialog m_dialog = new InteractionEditDialog(this);
  // circle panel
  InteractionCirclePanel m_circle;
  // affect script stuff
  AffectScriptViewPanel fScriptViewer;
  // split pane for circle panel and script
  private JSplitPane fSplitpane;
  // State indicator	
  JLabel fStateIndicator = new JLabel("-", (Icon) sStopIcon, LEFT);
  // Current script file name
  JLabel fCurrentScriptFileName = new JLabel("-", RIGHT);
  // buttons
  JButton saveButton = new JButton("Save");
  JButton loadButton = new JButton("Load");
  JButton recordButton = new JButton("Record", (Icon) sRecordIcon);
  JButton playButton = new JButton("Play", (Icon) sPlayIcon);
  JButton clearButton = new JButton("Clear");
  // Script playing realisation
  Timer fScriptPlayer = null;
  // get the master of all processes
  private static AffectManager.InterfaceHolder affectManager = AffectManager.sInterface;

  /**
   * Constructor.
   *
   * @param source Color for sources of interactions.
   * @param direct Color for directly affected characters.
   * @param indirect Color for indirectly affected characters.
   * @param idle Color for idle characters.
   * @param thin Size of thin lines.
   * @param thick Size of thick lines.
   * @param offset Offset for circle labels.
   */
  public InteractionSimulationPanel(Color source, Color direct, Color indirect, Color idle,
    int thin, int thick, int offset) {
    // main layout
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    JPanel upperPanel = new JPanel();
    upperPanel.setLayout(new GridLayout(1, 1));

    // circle panel
    JPanel circlePanel = new JPanel();
    circlePanel.setLayout(new BoxLayout(circlePanel, BoxLayout.Y_AXIS));
    circlePanel.add(m_groups);
    circlePanel.add(m_circle = new InteractionCirclePanel(this, source, direct, indirect, idle, thin, thick, offset));

    upperPanel.add(circlePanel);

    // finish groups combobox tengfei
    m_groups.addActionListener(this);
    m_groups.setMaximumSize(new Dimension(5000, 24));
    for (GroupManager group : affectManager.getGroups()) {
      affectManager.removeGroup(group.getName());
    }
    String characters = "";
    for (int i = 0; i < affectManager.getCharacters().length; ++i)
    {
        characters += affectManager.getCharacters()[i].getName();
        if (i < affectManager.getCharacters().length-1)
         characters += ",";
    }
    affectManager.addGroup("All Characters", characters);
    
    for (GroupManager group : affectManager.getGroups()) {
      m_groups.addItem(group.getName());
    }

    // affect script stuff
    JPanel scriptPanel = new JPanel();
    scriptPanel.setLayout(new BoxLayout(scriptPanel, BoxLayout.X_AXIS));
    fScriptViewer = new AffectScriptViewPanel(this);
    scriptPanel.add(fScriptViewer);

    // add (panel);

    fSplitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, circlePanel, scriptPanel);
    fSplitpane.setDividerLocation(225);
    fSplitpane.setResizeWeight(0.25);
    fSplitpane.setOneTouchExpandable(true);
    fSplitpane.setContinuousLayout(true);

    upperPanel.add(fSplitpane);
    add(upperPanel);

    // buttons
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    //panel.setMinimumSize(new Dimension(800, 24));
    panel.setMaximumSize(new Dimension(5000, 24));
    saveButton.setMinimumSize(mediumButtonSize);
    saveButton.setPreferredSize(mediumButtonSize);
    saveButton.setMaximumSize(mediumButtonSize);
    saveButton.setActionCommand("save");
    saveButton.addActionListener(this);
    loadButton.setMinimumSize(mediumButtonSize);
    loadButton.setPreferredSize(mediumButtonSize);
    loadButton.setMaximumSize(mediumButtonSize);
    loadButton.setActionCommand("load");
    loadButton.addActionListener(this);
    recordButton.setMinimumSize(mediumButtonSize);
    recordButton.setPreferredSize(mediumButtonSize);
    recordButton.setMaximumSize(mediumButtonSize);
    recordButton.setActionCommand("record");
    recordButton.addActionListener(this);
    playButton.setMinimumSize(mediumButtonSize);
    playButton.setPreferredSize(mediumButtonSize);
    playButton.setMaximumSize(mediumButtonSize);
    playButton.setActionCommand("play");
    playButton.addActionListener(this);
    clearButton.setMinimumSize(mediumButtonSize);
    clearButton.setPreferredSize(mediumButtonSize);
    clearButton.setMaximumSize(mediumButtonSize);
    clearButton.setActionCommand("clear");
    clearButton.addActionListener(this);
    fStateIndicator.setEnabled(false);
    fStateIndicator.setMinimumSize(new Dimension(170, 24));
    fStateIndicator.setPreferredSize(new Dimension(170, 24));
    panel.add(fStateIndicator);
    panel.add(getFillerBox(0, 0, 5000, 0));
    panel.add(fCurrentScriptFileName);
    panel.add(getFillerBox(10, 4, 10, 4));
    panel.add(saveButton);
    panel.add(loadButton);
    panel.add(getFillerBox(4, 4, 4, 4));
    panel.add(recordButton);
    panel.add(playButton);
    panel.add(getFillerBox(4, 4, 4, 4));
    panel.add(clearButton);
    add(panel);
  }

  /**
   * The
   * <code>ScriptExecutionTask</code> class realizes the execution of affect
   * scripts.
   */
  private class ScriptExecutionTask extends TimerTask {

    private int fId;
    private AffectScript.Item fAsi = null;

    private ScriptExecutionTask(AffectScript.Item asi, int id) {
      fId = id;
      fAsi = asi;
    }

    public void run() {
      fScriptViewer.setSelectedRow(fId);
      // let the affectmanager do its job ...
      fStateIndicator.setText("Playing script - " + fAsi.getTime());
      // show it on the interaction circle
      if (fAsi.isSetAffectInput()) {
        AffectInput ai = fAsi.getAffectInput();
        m_circle.update(getPerformer(ai), getAddressee(ai), getListener(ai), 1000);
        affectManager.processSignal(fAsi.getAffectInput());
      }
      if (fAsi.isSetAppraisal()) {
        // TODO
      }
      if (fAsi.isSetResetCharacter()) {
        String characterName = fAsi.getResetCharacter().getName().trim();
        m_circle.update(characterName, null, null, 1000);
        CharacterManager character = affectManager.getCharacterByName(characterName);
        // setting the personality resets a character affective state to its default
        character.setPersonality(character.getPersonality());
      }
    }
  }

  /**
   * The
   * <code>PlayExecutionEndTask</code> informs, that script playing is over.
   */
  private class PlayExecutionEndTask extends TimerTask {

    private PlayExecutionEndTask() {
    }

    public void run() {
      stopPlayActions();
    }
  }

  /**
   * The
   * <code>ScriptExecutionAnimationTask</code> informs on playing a script by
   * animation
   */
  private class ScriptExecutionAnimationTask extends TimerTask {

    Icon fIcon = null;

    private ScriptExecutionAnimationTask(Icon icon) {
      fIcon = icon;
    }

    public void run() {
      fStateIndicator.setIcon((Icon) fIcon);
    }
  }

  /**
   * Highlight relationships and activities.
   *
   * @param source Source character.
   * @param direct Directly affected characters.
   * @param indirect Indirectly affected characters.
   * @param timeout Timeout before resetting display.
   */
  public void update(String source, String[] direct, String[] indirect, long timeout) {
    m_circle.update(source, direct, indirect, timeout);
  }

  /**
   * Access character name list.
   *
   * @param exclude Character to exclude from list.
   */
  public String[] characters(String exclude) {
    return m_circle.characters(exclude);
  }

  /**
   * Show edit dialog.
   *
   * @param source Character this thing is all about.
   * @param type Interaction type (ignored if item is not null).
   * @param item AffectScript item to edit.
   */
  void showEditDialog(InteractionCharacter source, String type, AffectScript.Item item) {
    m_dialog.show(source, type, item);
  }

  /**
   * Add or replace affectscript item.
   *
   * @param replace AffectScript item to replace (null if none to replace).
   * @param asi affect script item to add.
   * @param normalize Normalize time.
   */
  void addScriptItem(AffectScript.Item replace, AffectScript.Item asi, boolean normalize) {
    try {
      fScriptViewer.addScriptItem(replace, asi, normalize);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Gets new affect input. Implements the AffectInputListener
   *
   * @param aie new affect input
   */
  public void updateInput(AffectInputEvent aie) {
    AffectScript.Item asi = AffectScript.Item.Factory.newInstance();
    asi.setTime(System.currentTimeMillis());
    AffectInput ai = aie.getAffectInput();
    asi.setAffectInput(ai);
    // show it at the circle panel
    m_circle.update(getPerformer(ai), getAddressee(ai), getListener(ai), 3000);
    try {
      fScriptViewer.addScriptItem(null, asi, true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void startRecording() {
    affectManager.addAffectInputListener(this);
    m_groups.setEnabled(false);
    m_circle.setMenuEnabled(false);
    fScriptViewer.setMenuEnabled(false);
    fStateIndicator.setEnabled(true);
    fStateIndicator.setIcon((Icon) sRecordIcon);
    fStateIndicator.setText("Recording ...");
    recordButton.setIcon((Icon) sStopIcon);
    recordButton.setText("Stop");
    recordButton.setActionCommand("stoprecord");
    loadButton.setEnabled(false);
    saveButton.setEnabled(false);
    playButton.setEnabled(false);
    clearButton.setEnabled(false);
  }

  /**
   * Gets action events. Implements the ActionListener
   *
   * @param e a elicited action event
   */
  public void actionPerformed(ActionEvent e) {
    // display group
    if (e.getSource() == m_groups) {
      m_circle.clear();
      if (m_groups.getSelectedIndex() != -1) {
        GroupManager group = affectManager.getGroupByName(m_groups.getSelectedItem().toString());
        if (group != null) {
          for (CharacterManager character : group.getCharacters()) {
            m_circle.addCharacter(character.getName(),
              character.getAppraisalRuleKeys("Basic"),
              ActType.getNames(),
              EmotionType.getNames(),
              MoodType.getNames());
          }
        }
      }
    } // save affectscript
    else if (e.getActionCommand().equals("save")) {
      AffectScriptDocument asd = AffectScriptDocument.Factory.newInstance();
      AffectScriptDocument.AffectScript as = AffectScriptDocument.AffectScript.Factory.newInstance();
      LinkedList<AffectScript.Item> asiList = fScriptViewer.getScript();
      int size = asiList.size();
      if (size > 0) {
        AffectScriptDocument.AffectScript.Item[] asis =
          new AffectScriptDocument.AffectScript.Item[size];
        int cnt = 0;
        for (Iterator<AffectScript.Item> it = asiList.iterator(); it.hasNext();) {
          asis[cnt++] = it.next();
        }
        as.setItemArray(asis);
        as.setContext(fScriptViewer.getScriptContext());
        asd.setAffectScript(as);
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(sALMAScriptPath);
        if (fCurrentScriptFileName.getText().equals("-")) {
          chooser.setSelectedFile(sALMADefaultScriptFile);
        } else {
          chooser.setSelectedFile(new File(fCurrentScriptFileName.getText()));
        }
        int returnVal = chooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
          try {
            fCurrentScriptFileName.setText(chooser.getSelectedFile().getName());
            XmlOptions options = new XmlOptions();
            options.setSaveNamespacesFirst();
            options.setSavePrettyPrint();
            options.setCharacterEncoding("ISO-8859-1");
            Map<String, String> namespaceMap = new HashMap<String, String>();
            namespaceMap.put("xml.affect.de", "aml");
            options.setSaveSuggestedPrefixes(namespaceMap);
            asd.save(chooser.getSelectedFile(), options);
          } catch (Exception ex) {
            ex.printStackTrace();
          }
        }
      }
    } // load affectscript
    else if (e.getActionCommand().equals("load")) {
      JFileChooser chooser = new JFileChooser();
      chooser.setCurrentDirectory(sALMAScriptPath);
      chooser.setSelectedFile(sALMADefaultScriptFile);
      int returnVal = chooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        try {
          fCurrentScriptFileName.setText(chooser.getSelectedFile().getName());
          AffectScriptDocument asd = AffectScriptDocument.Factory.parse(chooser.getSelectedFile());
          fScriptViewer.setScript(asd.getAffectScript());
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    } // record affectscript
    else if (e.getActionCommand().equals("record")) {
      affectManager.addAffectInputListener(this);
      m_groups.setEnabled(false);
      m_circle.setMenuEnabled(false);
      fScriptViewer.setMenuEnabled(false);
      fStateIndicator.setEnabled(true);
      fStateIndicator.setIcon((Icon) sRecordIcon);
      fStateIndicator.setText("Recording ...");
      recordButton.setIcon((Icon) sStopIcon);
      recordButton.setText("Stop");
      recordButton.setActionCommand("stoprecord");
      loadButton.setEnabled(false);
      saveButton.setEnabled(false);
      playButton.setEnabled(false);
      clearButton.setEnabled(false);
    } // stop recording
    else if (e.getActionCommand().equals("stoprecord")) {
      affectManager.removeAffectInputListener(this);
      m_groups.setEnabled(true);
      m_circle.setMenuEnabled(true);
      fScriptViewer.setMenuEnabled(true);
      fStateIndicator.setEnabled(false);
      fStateIndicator.setIcon((Icon) sStopIcon);
      fStateIndicator.setText("-");
      recordButton.setIcon((Icon) sRecordIcon);
      recordButton.setText("Record");
      recordButton.setActionCommand("record");
      loadButton.setEnabled(true);
      saveButton.setEnabled(true);
      playButton.setEnabled(true);
      clearButton.setEnabled(true);
    } // play affectscript
    else if (e.getActionCommand().equals("play")) {
      LinkedList<AffectScript.Item> asiList = fScriptViewer.getScript();
      if (asiList.size() > 0) {
        m_groups.setEnabled(false);
        m_circle.setMenuEnabled(false);
        fScriptViewer.setMenuEnabled(false);
        fStateIndicator.setEnabled(true);
        fStateIndicator.setIcon((Icon) sPlayIcon);
        fStateIndicator.setText("Playing ...");
        playButton.setIcon((Icon) sStopIcon);
        playButton.setText("Stop");
        playButton.setActionCommand("stopplay");
        loadButton.setEnabled(false);
        saveButton.setEnabled(false);
        recordButton.setEnabled(false);
        clearButton.setEnabled(false);

        fScriptPlayer = new Timer();
        int id = 0;
        long startTime = System.currentTimeMillis();
        Date scriptExecutionTime = new Date(startTime);

        fScriptPlayer.schedule(new ScriptExecutionAnimationTask(sPlayIcon),
          new Date(startTime + 500), 500);
        fScriptPlayer.schedule(new ScriptExecutionAnimationTask(sRunningIcon),
          new Date(startTime + 1000), 1000);

        for (Iterator<AffectScript.Item> it = asiList.iterator(); it.hasNext();) {
          // add next script item
          AffectScript.Item scriptItem = it.next();
          scriptExecutionTime = new Date(startTime + scriptItem.getTime());
          fScriptPlayer.schedule(new ScriptExecutionTask(scriptItem, id++), scriptExecutionTime);

          // script termination time
          if (!it.hasNext()) {
            scriptExecutionTime = new Date(startTime + 3000 + scriptItem.getTime());
            fScriptPlayer.schedule(new PlayExecutionEndTask(), scriptExecutionTime);
          }
        }
      }
    } // stop playing
    else if (e.getActionCommand().equals("stopplay")) {
      stopPlayActions();
    } // clear script    
    else if (e.getActionCommand().equals("clear")) {
      fScriptViewer.clearScript();
      fCurrentScriptFileName.setText("-");
    }
  }

  public synchronized void stopPlayActions() {
    if (fScriptPlayer != null) {
      fScriptPlayer.cancel();
      fScriptPlayer = null;
    }
    playButton.setIcon((Icon) sPlayIcon);
    playButton.setText("Play");
    playButton.setActionCommand("play");
    loadButton.setEnabled(true);
    saveButton.setEnabled(true);
    recordButton.setEnabled(true);
    clearButton.setEnabled(true);
    fStateIndicator.setEnabled(false);
    fStateIndicator.setIcon((Icon) sStopIcon);
    fStateIndicator.setText("-");
    fScriptViewer.setSelectedRow(-1);
    fScriptViewer.setMenuEnabled(true);
    m_circle.setMenuEnabled(true);
    m_groups.setEnabled(true);
  }
}
