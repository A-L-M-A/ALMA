/*
 * GroupAffectMonitor.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

import java.util.List;

import de.affect.mood.Mood;
import de.affect.emotion.EmotionVector;
import de.affect.manage.CharacterManager;
import de.affect.emotion.EmotionPADCentroid;

/**
 * The interface <code>GroupAffectMonitor</code> defines all necessary methods that
 * should be provided by a concrete implementation of an GroupAffectMonitor.
 * 
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public interface GroupAffectMonitor {

  /**
   * Updates the display of all the group's emotions
   *
   * @param character name of the group
   *	    emotions current emotions
   */
  public void updateEmotionDisplay(String character, EmotionVector emotions);

  /**
   * Updates the display of all the group's mood
   *
   * @param character name of the group
   *	    emotions current emotions
   *        emotionCenter the center of all active emotions
   *        defaultMood the group's default mood
   *        currentMood the group's current mood
   *	    socialIntegrity the group's social integrity
   */
  public void updateMoodDisplay(String character, EmotionVector emotions, 
				EmotionPADCentroid emotionCenter,
				Mood defaultMood, Mood currentMood,
				double socialIntegrity, String inSimilarMood,
				List<CharacterManager> inExtremeMood);

  /**
   * Change the visiblity status of the affect monitor instance.
   *
   * @param visible true shows the the affect monitor
   */
  public void showFrame(boolean visible);

}
