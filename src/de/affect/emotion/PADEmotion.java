/*
 * PADEmotion.java
 *
 * Copyright (c) 2008 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.emotion;

import de.affect.mood.Mood;

/**
 * The <code>PADEmotion</code> class represents the emotional state 
 * derived by bio sensors
 * 
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class PADEmotion extends Emotion {
  
  public PADEmotion(Mood padVals, double intensity, String description) {
    super(EmotionType.Physical, intensity, 0.0, description);
    mPADValues = padVals;
  }
  

}
