/*
 * GroupAffectMonitorPanel.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.BorderLayout;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createTitledBorder;

import de.affect.emotion.Emotion;
import de.affect.mood.Mood;
import de.affect.emotion.EmotionVector;
import de.affect.manage.CharacterManager;
import de.affect.emotion.EmotionType;
import de.affect.emotion.EmotionPADCentroid;

import static de.affect.emotion.EmotionsPADRelation.getEmotionPADMapping;
import static de.affect.util.Convert.prettyPrint;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.AlmaGUI.sBORDERLINE;

/**
 * The <code>GroupAffectMonitorPanel</code> displays all groups' affective status.
 * Information are given about the current mood and emotions respectively its 
 * actual intensity. 
 * 
 * @author Patrick Gebhard
 *
 * @version 2.0
 */
public class GroupAffectMonitorPanel extends JPanel {

  private Hashtable<String, EmotionVectorPanel> groupToEmotionPanel =
    new Hashtable<String, EmotionVectorPanel>();
  private Hashtable<String, Mood3D> groupToMoodDisplay =
    new Hashtable<String, Mood3D>();
  private Hashtable<String, GroupAffectStatusPanel> groupToStatusPanel =
    new Hashtable<String, GroupAffectStatusPanel>();
  private Hashtable<String, Boolean> groupToClearStatus =
    new Hashtable<String, Boolean>();
  private Hashtable<EmotionType, Double> EmotionTypesToIntensities =
    new Hashtable<EmotionType, Double>();
  private EmotionVector lastEmotions = null;
  private JPanel groupPanel = null;
  private boolean fIsReady = false;

  public GroupAffectMonitorPanel(String group, EmotionVector vec, Mood currentMood,
    double socialIntegrity, String inSimilarMood,
    java.util.List<CharacterManager> inExtremeMood) {
    setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    setDoubleBuffered(true);
    groupPanel = new JPanel();
    groupPanel.setLayout(new BoxLayout(groupPanel, BoxLayout.X_AXIS));
    JPanel affectPanel = new JPanel();
    affectPanel.setLayout(new BoxLayout(affectPanel, BoxLayout.X_AXIS));
    EmotionVectorPanel emotionPanel = new EmotionVectorPanel(null, group, vec);
    emotionPanel.setLayout(new BoxLayout(emotionPanel, BoxLayout.Y_AXIS));
    affectPanel.add(emotionPanel);
    JPanel moodAndStatusPanel = new JPanel();
    moodAndStatusPanel.setLayout(new BoxLayout(moodAndStatusPanel, BoxLayout.Y_AXIS));
    JPanel moodCubePanel = new JPanel();
    moodCubePanel.setLayout(new BoxLayout(moodCubePanel, BoxLayout.X_AXIS));
    Border border =
      createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
      " Mood cube ", 0, 0, sDefaultTitleFont),
      createEmptyBorder(1, 1, 1, 1));
    moodCubePanel.setBorder(border);
    Mood3D moodDisplay = new Mood3D(0.0, 0.125, -4.0, -35.0, false, 64000);
    moodCubePanel.add(BorderLayout.CENTER, moodDisplay);
    groupToMoodDisplay.put(group, moodDisplay);
    String currentMoodString =
      currentMood.getMoodWordIntensity() + " " + currentMood.getMoodWord();
    String charactersInExtremeMood = "";
    for (CharacterManager cm : inExtremeMood) {
      charactersInExtremeMood += cm.getName() +
        "(" + prettyPrint(cm.getDistancetoDefaultMood()) + ") ";
    }
    GroupAffectStatusPanel statusPanel =
      new GroupAffectStatusPanel(currentMoodString, socialIntegrity,
      inSimilarMood, charactersInExtremeMood);
    statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.Y_AXIS));
    moodAndStatusPanel.add(moodCubePanel);
    moodAndStatusPanel.add(statusPanel);
    affectPanel.add(moodAndStatusPanel);
    groupPanel.add(affectPanel);
    add(groupPanel);
    groupToEmotionPanel.put(group, emotionPanel);
    groupToStatusPanel.put(group, statusPanel);
    for (Iterator<Emotion> it = vec.getEmotions().iterator(); it.hasNext();) {
      Emotion emotion = it.next();
      EmotionType eType = emotion.getType();
      EmotionTypesToIntensities.put(eType, new Double(emotion.getIntensity()));
    }
    groupToClearStatus.put(group, new Boolean(true));
    fIsReady = true;
  }

  public void updateEmotionDisplay(String group, EmotionVector vec) {
    if (fIsReady) {
      EmotionVectorPanel panel =
        (EmotionVectorPanel) groupToEmotionPanel.get(group);
      if (panel != null) {
        panel.updateVector(vec);
      }
    }
  }

  public void updateMoodDisplay(String group, EmotionVector emotions,
    EmotionPADCentroid emotionCenter,
    Mood defaultMood, Mood currentMood,
    double socialIntegrity, String inSimilarMood,
    java.util.List<CharacterManager> inExtremeMood) {
    if (fIsReady) {
      String currentMoodString =
        currentMood.toString();
      //currentMood.getMoodWordIntensity() + " " + currentMood.getMoodWord();
      String defaultMoodString =
        defaultMood.getMoodWordIntensity() + " " + defaultMood.getMoodWord();
      Boolean clearStatus = groupToClearStatus.get(group);
      boolean cleared3DEmotionDisplay = true;
      if (clearStatus != null) {
        cleared3DEmotionDisplay = clearStatus.booleanValue();
      }
      GroupAffectStatusPanel panel = groupToStatusPanel.get(group);
      if (panel != null) {
        String charactersInExtremeMood = "";
        for (CharacterManager cm : inExtremeMood) {
          charactersInExtremeMood += cm.getName() +
            " (" + prettyPrint(cm.getDistancetoDefaultMood()) + ") ";
        }
        panel.updateStatus(currentMoodString, socialIntegrity,
          inSimilarMood, charactersInExtremeMood);
      }
      Mood3D moodDisplay = groupToMoodDisplay.get(group);
      if (moodDisplay != null) {
        moodDisplay.updateMood(currentMood.getPleasure(),
          currentMood.getArousal(),
          currentMood.getDominance(), 1.0d);
        if (!(emotions.getDominantEmotion().getType() == EmotionType.Undefined)) {
          for (Iterator<Emotion> it = emotions.getEmotions().iterator(); it.hasNext();) {
            Emotion emotion = it.next();
            EmotionType eType = emotion.getType();
            double currentIntensity = emotion.getIntensity();
            double baseline = emotion.getBaseline();
            double lastIntensity = EmotionTypesToIntensities.get(eType).doubleValue();
            if (currentIntensity > baseline) {
              //Logger.global.info(group + " drawing emotion " + eType.toString());
              Mood ePAD = getEmotionPADMapping(eType);
              moodDisplay.updateEmotion(eType.toString(),
                ePAD.getPleasure(),
                ePAD.getArousal(),
                ePAD.getDominance(),
                emotion.getIntensity());
            }
            if (((currentIntensity - 0.0004) < baseline) &&
              (lastIntensity > currentIntensity)) {
              moodDisplay.hideEmotion(eType.toString());
            //Logger.global.info("removing " + eType);
            }
            EmotionTypesToIntensities.put(eType, new Double(currentIntensity));
          }
          cleared3DEmotionDisplay = false;
          groupToClearStatus.put(group, new Boolean(cleared3DEmotionDisplay));
        } else {
          if (!cleared3DEmotionDisplay) {
            //Logger.global.info(group + " clearing emotions");
            for (Iterator<Emotion> it = emotions.getEmotions().iterator(); it.hasNext();) {
              moodDisplay.hideEmotion(it.next().getType().toString());
            }
            cleared3DEmotionDisplay = true;
            groupToClearStatus.put(group, new Boolean(cleared3DEmotionDisplay));
          }
        }
      }
    }
  }
}
