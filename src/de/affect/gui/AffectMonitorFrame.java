/*
 * AffectMonitorFrame.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import java.util.Vector;
import java.util.Iterator;
import static java.awt.Font.BOLD;
import static java.awt.Font.PLAIN;

import de.affect.mood.Mood;
import de.affect.emotion.EmotionVector;
import de.affect.emotion.EmotionType;
import de.affect.emotion.EmotionPADCentroid;
import de.affect.manage.event.EmotionMaintenanceListener;
import de.affect.manage.event.EmotionMaintenanceEvent;
import static de.affect.gui.DesktopHelper.getGoodLocation;
import static de.affect.util.FileHelper.sALMAFrameIcon;

/**
 * The <code>AffectMonitorFrame</code> displays all characters' affective status.
 * Information are given about the current mood and emotions respectively its 
 * actual intensity. 
 * 
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AffectMonitorFrame extends JFrame implements AffectMonitor, EmotionMaintainerNotifier {

  private boolean fIsReady = false;
  private static final String sPREFFEREDFONT = "Arial";
  public static Font sDefaultTextFont = null;
  public static Font sDefaultTitleFont = null;
  public static Font sDefaultBigTitleFont = null;
  public static final Color sBORDERLINE = Color.LIGHT_GRAY;
  //private AffectMonitorPanel fAffectMonitorPanel = null;
  private AffectMonitorPanelProcessing fAffectMonitorPanel = null;

  // Emotion maintain listeners
  private Vector<EmotionMaintenanceListener> maintenanceListener = 
    new Vector<EmotionMaintenanceListener>();

  /**
   * Constructor 
   * 
   * @param character name of the character
   *        emotions the initial emotion vector
   *        mood the initial character's mood
   */
  public AffectMonitorFrame(String character, EmotionVector emotions, Mood currentMood) {
    super();
    setTitle(character + "'s Affect Monitor");
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
    fAffectMonitorPanel = 
      //new AffectMonitorPanel((EmotionMaintainerNotifier)this, character, emotions, currentMood);
       new AffectMonitorPanelProcessing((EmotionMaintainerNotifier)this, character, emotions, currentMood);
    getContentPane().add(fAffectMonitorPanel, BorderLayout.CENTER);
    setSize(new Dimension(600, 685));
    this.setResizable(false);
  }

  /**
   * Updates the display of all the characer's emotions
   *
   * @param character name of the character
   *	    emotions current emotions
   */
  public void updateEmotionDisplay(String character, EmotionVector emotions) {
    fAffectMonitorPanel.updateEmotionDisplay(character, emotions);
  }

  /**
   * Updates the display of all the characer's mood
   *
   * @param character name of the character
   *        emotions current emotions
   *        emotionCenter the center of all active emotions
   *        defaultMood the character's default mood
   *        currentMood the character's current mood
   */
  public void updateMoodDisplay(String character, EmotionVector emotions, 
				EmotionPADCentroid emotionCenter,
				Mood defaultMood, Mood currentMood, Mood currentMoodTendency) {
    fAffectMonitorPanel.updateMoodDisplay(character, emotions, emotionCenter, 
					  defaultMood, currentMood, currentMoodTendency);
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


  /**
   * Adds the specified listener to the list of emotion change listeners.
   *
   * @param li the listener that should be added
   */
  public void addEmotionMaintenanceListener(EmotionMaintenanceListener li) {
    maintenanceListener.add(li);
  }

  /**
   * Removes the specified listener from the list of emotion change listeners.
   *
   * @param li the listener that should be removed
   */
  public void removeEmotionMaintenanceListener(EmotionMaintenanceListener li) {
    maintenanceListener.remove(li);
  }

  /**
   * Notifies all registered listeners that the specified emotion has changed.
   *
   * @param character name of the character
   *        emotionType the type of the changed emotion
   *        emotionIntensity the intensity of the changed emotion
   */
  public void notifyEmotionMaintenanceListener(String character, EmotionType emotionType, 
					       double emotionIntensity) {
    for(Iterator it = maintenanceListener.iterator(); it.hasNext();) {
      EmotionMaintenanceListener li = (EmotionMaintenanceListener)it.next();
      li.maintainEmotion(new EmotionMaintenanceEvent(this, character, emotionType, emotionIntensity));
    }
  }

}
