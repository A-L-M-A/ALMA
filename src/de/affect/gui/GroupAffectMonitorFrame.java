/*
 * GroupAffectMonitorFrame.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.List;
import javax.swing.JFrame;

import static java.awt.Font.BOLD;
import static java.awt.Font.PLAIN;

import de.affect.mood.Mood;
import de.affect.emotion.EmotionVector;
import de.affect.manage.CharacterManager;
import de.affect.emotion.EmotionPADCentroid;

import static de.affect.gui.DesktopHelper.getGoodLocation;
import static de.affect.util.FileHelper.sALMAFrameIcon;

/**
 * The <code>GroupAffectMonitorFrame</code> displays all groups' affective status.
 * Information are given about the current mood and emotions respectively its 
 * actual intensity. 
 * 
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class GroupAffectMonitorFrame extends JFrame implements GroupAffectMonitor {

  private boolean fIsReady = false;
  private static final String sPREFFEREDFONT = "Arial";
  public static Font sDefaultTextFont = null;
  public static Font sDefaultTitleFont = null;
  public static Font sDefaultBigTitleFont = null;
  public static final Color sBORDERLINE = Color.LIGHT_GRAY;
  private GroupAffectMonitorPanel fGroupAffectMonitorPanel = null;

  /**
   * Constructor 
   * 
   * @param group name of the group
   *        emotions the initial emotion vector
   *        mood the initial group's mood
   */
  public GroupAffectMonitorFrame(String group, EmotionVector emotions, Mood currentMood,
				 double socialIntegrity, String inSimilarMood,
				 List<CharacterManager> inExtremeMood) {
    super();
    setTitle(group + "'s Affect Monitor");
    if (sALMAFrameIcon != null)
      setIconImage(sALMAFrameIcon);
    GraphicsEnvironment graphEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] availableFonts = graphEnv.getAvailableFontFamilyNames();
    sDefaultTextFont = getFont();
    sDefaultTitleFont = getFont();
    sDefaultBigTitleFont = getFont();
    for (String font : availableFonts) {
      if (font.equals(sPREFFEREDFONT)) {
	sDefaultTextFont = new Font(font, PLAIN, 11);
	sDefaultTitleFont = new Font(font, BOLD, 11);
	sDefaultBigTitleFont = new Font(font, BOLD, 12);
	setFont(sDefaultTextFont);
      }
    }
    fGroupAffectMonitorPanel = 
      new GroupAffectMonitorPanel(group, emotions, currentMood, socialIntegrity, 
				  inSimilarMood, inExtremeMood);
    getContentPane().add(fGroupAffectMonitorPanel, BorderLayout.CENTER);
    pack();
  }

  /**
   * Updates the display of all the group's emotions
   *
   * @param group name of the group
   *	    emotions current emotions
   */
  public void updateEmotionDisplay(String group, EmotionVector emotions) {
    fGroupAffectMonitorPanel.updateEmotionDisplay(group, emotions);
  }

  /**
   * Updates the display of all the group's mood
   *
   * @param group name of the group
   *	    emotions current emotions
   *        emotionCenter the center of all active emotions
   *        defaultMood the group's default mood
   *        currentMood the group's current mood
   *	    socialIntegrity the group's social integrity
   *	    inSimilarMood pairs of characters that are similar mood
   *	    inExtremeMood sorted list of character that are off their default mood
   */
  public void updateMoodDisplay(String group, EmotionVector emotions, 
				EmotionPADCentroid emotionCenter,
				Mood defaultMood, Mood currentMood,
				double socialIntegrity, String inSimilarMood,
				List<CharacterManager> inExtremeMood) {
    fGroupAffectMonitorPanel.updateMoodDisplay(group, emotions, emotionCenter, 
					       defaultMood, currentMood, 
					       socialIntegrity, inSimilarMood,
					       inExtremeMood);
  }

  /**
   * Change the visiblity status of the affect monitor instance.
   *
   * @param visible true shows the the affect monitor
   */
  public void showFrame(boolean visible) {
    setLocation(getGoodLocation(this.getSize()));
    setVisible(visible);
  }

}
