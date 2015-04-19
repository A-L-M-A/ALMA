/*
 * AffectConsts.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.data;

public class AffectConsts {
  /** Maximum baseline intensity for emotions */
  public double emotionMaxBaseline;
  /** Emotions intensity influenced by personality factor */
  public double personalityEmotionInfluence;
  /** Emotion Decay */
  public long emotionDecayOverallTime;
  public int emotionDecayPeriod;
  public int emotionDecaySteps;
  
  public long moodReturnOverallTime;
  public int moodReturnPeriod;
  public int moodReturnSteps;

  public boolean moodStabilityControlledByNeurotism;

  public AffectConsts() {} 
}
