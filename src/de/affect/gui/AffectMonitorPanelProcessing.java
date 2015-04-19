/*
 * AffectMonitorPanel.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import de.affect.emotion.Emotion;
import de.affect.emotion.EmotionPADCentroid;
import de.affect.emotion.EmotionType;
import de.affect.emotion.EmotionVector;
import de.affect.emotion.EmotionsPADRelation;
import static de.affect.emotion.EmotionsPADRelation.getEmotionPADMapping;
import static de.affect.gui.AlmaGUI.sBORDERLINE;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;
import de.affect.mood.Mood;
import static de.affect.util.Convert.prettyPrint;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.*;
import javax.swing.*;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.BorderFactory.createTitledBorder;

import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 * The
 * <code>AffectMonitorPanel</code> displays all characters' affective status.
 * Information are given about the current mood and emotions respectively its
 * actual intensity.
 *
 * @author Patrick Gebhard
 *
 * @version 2.0
 */
public class AffectMonitorPanelProcessing extends JPanel implements ComponentListener {

  private Hashtable<String, EmotionVectorPanel> characterToEmotionPanel =
    new Hashtable<String, EmotionVectorPanel>();
  private Hashtable<String, MoodCube> characterToMoodDisplay =
    new Hashtable<String, MoodCube>();
  private Hashtable<String, AffectStatusPanel> characterToStatusPanel =
    new Hashtable<String, AffectStatusPanel>();
  private Hashtable<String, Boolean> characterToClearStatus =
    new Hashtable<String, Boolean>();
  private Hashtable<EmotionType, Double> EmotionTypesToIntensities =
    new Hashtable<EmotionType, Double>();
  private JPanel characterPanel = null;
  private boolean fIsReady = false;
  private String characterName = null;
  private JPanel moodCubePanel = null;
  public MoodCube moodDisplay = null;


  public AffectMonitorPanelProcessing(EmotionMaintainerNotifier affectMonitor, String character, EmotionVector vec, Mood currentMood) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    setDoubleBuffered(true);
    this.characterName = character;
    //this.setOpaque(false);
    characterPanel =  new JPanel();
    characterPanel.setLayout(new BoxLayout(characterPanel, BoxLayout.X_AXIS));
    JPanel affectPanel = new JPanel();
    //affectPanel.setOpaque(false);
    affectPanel.setLayout(new BoxLayout(affectPanel, BoxLayout.X_AXIS));
    EmotionVectorPanel emotionPanel = new EmotionVectorPanel(affectMonitor, character, vec);
    JPanel emotionContainPanel = new JPanel();
    emotionContainPanel.setLayout(new BoxLayout(emotionContainPanel, BoxLayout.Y_AXIS));
    emotionPanel.setLayout(new BoxLayout(emotionPanel, BoxLayout.Y_AXIS));
    emotionContainPanel.add(emotionPanel);
    emotionPanel.add(Box.createVerticalGlue());
    affectPanel.add(emotionContainPanel);
    JPanel moodAndStatusPanel = new JPanel();
    moodAndStatusPanel.setOpaque(false);
    moodAndStatusPanel.setLayout(new BoxLayout(moodAndStatusPanel, BoxLayout.Y_AXIS));
    moodCubePanel = new JPanel();
    //moodCubePanel.setOpaque(false);
    
    moodCubePanel.setMinimumSize(new Dimension(400,180));
    //moodCubePanel.setMaximumSize(new Dimension(800,500));
    moodCubePanel.setLayout(new BoxLayout(moodCubePanel, BoxLayout.X_AXIS));
    Border border =
      createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
      " Mood cube ", 0, 0, sDefaultTitleFont),
      createEmptyBorder(1, 1, 1, 1));
    moodCubePanel.setBorder(border);

    
    //JInternalFrame iFrame = new JInternalFrame();
    //BasicInternalFrameUI ui = (BasicInternalFrameUI) iFrame.getUI();
    //iFrame.putClientProperty("titlePane", ui.getNorthPane());
    //iFrame.putClientProperty("border", iFrame.getBorder());
    //ui.setNorthPane(null);
    //iFrame.setBorder(null);
    
    moodDisplay = new MoodCube(character,moodCubePanel);
    
    //moodCubePanel.addComponentListener(this);
    
    //iFrame.setSize(frameSize.width, frameSize.height);
    //iFrame.setPreferredSize(frameSize);
    //iFrame.setMaximumSize(frameSize);
 
    //iFrame.setVisible(true);
    //iFrame.pack();
    //iFrame.setResizable(true);
    //iFrame.add(moodDisplay);
    moodDisplay.init(); 
    moodCubePanel.add(moodDisplay);
    //moodCubePanel.addComponentListener(this);
   
   
   
  
    characterToMoodDisplay.put(character, moodDisplay);
    String currentMoodString =
      currentMood.getMoodWordIntensity() + " " + currentMood.getMoodWord();
    
    AffectStatusPanel statusPanel =
      new AffectStatusPanel(vec.getDominantEmotion().getType().toString(),
      currentMoodString, currentMoodString, currentMoodString);
    statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.Y_AXIS));
    statusPanel.setOpaque(false);
    moodAndStatusPanel.add(moodCubePanel);
    moodAndStatusPanel.add(statusPanel);
    affectPanel.add(moodAndStatusPanel);
    characterPanel.add(affectPanel);
    
    add(characterPanel);
    characterToEmotionPanel.put(character, emotionPanel);
    characterToStatusPanel.put(character, statusPanel);
    for (Iterator<Emotion> it = vec.getEmotions().iterator(); it.hasNext();) {
     
      Emotion emotion = it.next();
      EmotionType eType = emotion.getType();
      EmotionTypesToIntensities.put(eType, new Double(emotion.getIntensity()));
    }
    characterToClearStatus.put(character, new Boolean(true));
    fIsReady = true;
  }

  public void updateEmotionDisplay(String character, EmotionVector vec) {
    if (fIsReady) {
      EmotionVectorPanel panel =
        (EmotionVectorPanel) characterToEmotionPanel.get(character);
      if (panel != null) {
        panel.updateVector(vec);
      }
    }
  }

   public void updateMoodDisplay(String character, EmotionVector emotions,
    EmotionPADCentroid emotionCenter,
    Mood defaultMood, Mood currentMood, Mood currentMoodTendency) {
   if (fIsReady) {
      EmotionType et = emotions.getDominantEmotion().getType();
      String emoPAD = "";
      if (et != EmotionType.Undefined) {
         emoPAD = (et.equals(EmotionType.Physical)) ? emotions.getDominantEmotion().getPADValues().toString() : (EmotionsPADRelation.getEmotionPADMapping(et)).padString();
      }
      String emotionString =
        emotions.getDominantEmotion().getType() + " (" + prettyPrint(emotions.getDominantEmotion().getIntensity()) + ")" + emoPAD;
      String currentMoodString =
        currentMood.toString();
      //currentMood.getMoodWordIntensity() + " " + currentMood.getMoodWord();
      String currentMoodTendencyString =
        currentMoodTendency.getMoodWordIntensity() + " " + currentMoodTendency.getMoodWord();
      String defaultMoodString =
        defaultMood.getMoodWordIntensity() + " " + defaultMood.getMoodWord();
      Boolean clearStatus = characterToClearStatus.get(character);
      boolean cleared3DEmotionDisplay = true;
      if (clearStatus != null) {
        cleared3DEmotionDisplay = clearStatus.booleanValue();
      }
      AffectStatusPanel panel = characterToStatusPanel.get(character);
      if (panel != null) {
        panel.updateStatus(emotionString,
          defaultMoodString, currentMoodString,
          currentMoodTendencyString);
      }
      MoodCube moodDisplay = characterToMoodDisplay.get(character);
   
      if (moodDisplay != null) {
        moodDisplay.updateMood(currentMood.getPleasure(),
          currentMood.getArousal(),
          currentMood.getDominance(), 1.0d);
        int emoCnt = 0;
        if (!(emotions.getDominantEmotion().getType() == EmotionType.Undefined)) {
          for (Iterator<Emotion> it = emotions.getEmotions().iterator(); it.hasNext();) {
            Emotion emotion = it.next();
            EmotionType eType = emotion.getType();
            double currentIntensity = emotion.getIntensity();
            double baseline = emotion.getBaseline();
            double lastIntensity = EmotionTypesToIntensities.get(eType).doubleValue();
            if (currentIntensity > baseline) {
              //Logger.global.info(character + " drawing emotion " + eType.toString());
              Mood ePAD = (eType.equals(EmotionType.Physical)) ? emotion.getPADValues() : getEmotionPADMapping(eType);
              moodDisplay.updateEmotion(eType.toString(),
                ePAD.getPleasure(),
                ePAD.getArousal(),
                ePAD.getDominance(),
                emotion.getIntensity());
              emoCnt++;
            }
            if (((currentIntensity - 0.0004) < baseline)
              && (lastIntensity > currentIntensity)) {
              moodDisplay.hideEmotion(eType.toString());
              //Logger.global.info("removing " + eType);
            }
            EmotionTypesToIntensities.put(eType, new Double(currentIntensity));

            cleared3DEmotionDisplay = false;
            characterToClearStatus.put(character, new Boolean(cleared3DEmotionDisplay));
          }
        } else {
          if (!cleared3DEmotionDisplay) {
            //Logger.global.info(character + " clearing emotions");
            for (Iterator<Emotion> it = emotions.getEmotions().iterator(); it.hasNext();) {
              moodDisplay.hideEmotion(it.next().getType().toString());
            }
            cleared3DEmotionDisplay = true;
            characterToClearStatus.put(character, new Boolean(cleared3DEmotionDisplay));
          }
        }
        if (emoCnt > 1) {

          //Logger.global.info(emotionCenter.toString());

          moodDisplay.updateEmotionCenter(emotionCenter.getPValue(),
            emotionCenter.getAValue(),
            emotionCenter.getDValue(),
            emotionCenter.getWeight());
        } else {
          moodDisplay.hideEmotionCenter();
        }
      }
    }
  }

    @Override
    public void componentResized(ComponentEvent e) {
   
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        MoodCube moodDisplay = new MoodCube(characterName,moodCubePanel);
        moodDisplay.init(); 
        moodCubePanel.removeAll();
        characterToMoodDisplay.remove(characterName);
        moodCubePanel.add(moodDisplay);
        characterToMoodDisplay.put(characterName, moodDisplay); 
       
    }

    @Override
    public void componentShown(ComponentEvent e) {
   

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
