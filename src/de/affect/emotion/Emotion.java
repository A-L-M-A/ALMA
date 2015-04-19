/*
 * Emotion.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.emotion;

import de.affect.appraisal.AppraisalVariables;
import de.affect.appraisal.EEC;
import de.affect.mood.Mood;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

/**
 * The
 * <code>Emotion</code> class represents the emotional state of an agent. Each
 * emotion has a type, an appraisal aspect, an activation aspect, an intensity
 * and a baseline. The intensity is is associated with an emotion-inducing
 * situation.
 *
 * @author Patrick Gebhard (based on the work of Martin Klesen)
 *
 * @version 3.0
 */
public class Emotion {

  private final EmotionType type;
  private double intensity;
  protected Mood mPADValues;
  private EmotionAppraisalVars mApraisalVars;
  private final double baseline;
  private final Object elicitor;
  private Long mTimeOfElicitation;
  private Long mCalculatedEndTime;
  private Long mCalculatedDuration;
  private volatile int hashCode = 0;

  /**
   * Constructs a new
   * <code>Emotion</code> object with the specified type and the specified
   * intensity which is associated with an emotion-inducing situation.
   *
   * @param type the type of the emotion.
   * @param intensity the intensity of the emotion.
   * @param baseline the baseline of the emotion.
   * @param elicitor the emotion-inducing situation.
   * @throws IllegalArgumentException if the intensity or the baseline is not a
   * real number in the interval <code>[0.0,1.0]</code> or if the intensity is
   * less than the baseline.
   */

  public Emotion(EmotionType type, double intensity, double baseline, Object elicitor) {
    if (intensity < 0.0 || intensity > 1.0) {
      throw new IllegalArgumentException("Invalid intensity " + intensity);
    }
    if (baseline < 0.0 || baseline > 1.0) {
      throw new IllegalArgumentException("Invalid baseline " + baseline);
    }
    if (intensity < baseline) {
      throw new IllegalArgumentException("Error: intensity " + intensity
        + " < baseline " + baseline);
    }
    mTimeOfElicitation = System.currentTimeMillis();
    
    this.type = type;
    this.intensity = intensity;
    this.baseline = baseline;
    this.elicitor = elicitor;
  }
  
    public Emotion(EmotionType type, double intensity, double baseline, EmotionAppraisalVars eav, Object elicitor) {
    if (intensity < 0.0 || intensity > 1.0) {
      throw new IllegalArgumentException("Invalid intensity " + intensity);
    }
    if (baseline < 0.0 || baseline > 1.0) {
      throw new IllegalArgumentException("Invalid baseline " + baseline);
    }
    if (intensity < baseline) {
      throw new IllegalArgumentException("Error: intensity " + intensity
        + " < baseline " + baseline);
    }
    mTimeOfElicitation = System.currentTimeMillis();
    this.type = type;
    this.intensity = intensity;
    this.baseline = baseline;
    mApraisalVars = eav;
    this.elicitor = elicitor;
  }
  
    
    /**
   * Returns the creation time of this emotion.
   *
   * @return the emotion type.
   */
  public long getStart() {
    return mTimeOfElicitation;
  }  

  /**
   * Returns the type of this emotion.
   *
   * @return the emotion type.
   */
  public EmotionType getType() {
    return type;
  }

  /**
   * Returns the intensity of this emotion.
   *
   * @return the emotion intensity.
   */
  public double getIntensity() {
    return intensity;
  }

  /**
   * Sets the intensity of this emotion.
   *
   * @param intensity the new intensity
   */
  public void setIntensity(double intensity) {
    this.intensity = intensity;
  }

  /**
   * Returns the baseline of this emotion.
   *
   * @return the emotion baseline.
   */
  public double getBaseline() {
    return baseline;
  }

  /**
   * Returns the list of appraisal variables
   *
   * @return eecs
   */
  public EmotionAppraisalVars getAppraisalVariables() {
    return mApraisalVars;
  }

  /**
   * Returns the elicitor of this emotion.
   *
   * @return the emotion elicitor.
   */
  public Object getElicitor() {
    return elicitor;
  }

  /**
   * Returns the pleasure, dominance, and arousal values of this emotion
   *
   * @return defined pleasure, dominance, and arousal values.
   */
  public Mood getPADValues() {
    return mPADValues;
  }

  /**
   * Returns a concise representation of this emotion consisting of the type and
   * the intensity.
   *
   * @return a string representation of the emotion.
   */
  public String toString() {
    DecimalFormat form = new DecimalFormat("0.00");
    DecimalFormatSymbols formSymbols = new DecimalFormatSymbols();
    formSymbols.setDecimalSeparator('.');
    form.setDecimalFormatSymbols(formSymbols);

    return type + " (" + form.format(intensity) + "/" + form.format(baseline) + ") << " + elicitor;
  }

  /**
   * Compares this emotional state to the specified object. The result is
   * <code>true</code> if and only if the argument is an
   * <code>Emotion</code> object with the same emotion type emotion intensity,
   * and emotion elicitor.
   *
   * @param o the object to compare this emotion against.
   * @return <code>true</code> if the two emotions are equal; <code>false</code>
   * otherwise.
   */
  public boolean equals(Object o) {
    if (!(o instanceof Emotion)) {
      return false;
    }
    Emotion e = (Emotion) o;
    return e.getType() == type
      && e.getIntensity() == intensity && e.getBaseline() == baseline
      && ((e.getElicitor() == null && elicitor == null)
      || (e.getElicitor() != null && e.getElicitor().equals(elicitor)));
  }

  /**
   * Returns a hash code value for this object.
   *
   * @return a hash code value for this object.
   */
  public int hashCode() {
    if (hashCode == 0) {
      // this hash function has been taken from the
      // book 'Effective Java' by Joshua Bloch
      int result = 17;
      result = 37 * result + type.hashCode();
      long i = Double.doubleToLongBits(intensity);
      result = 37 * result + (int) (i ^ (i >>> 32));
      long b = Double.doubleToLongBits(baseline);
      result = 37 * result + (int) (b ^ (b >>> 32));
      result = 37 * result + elicitor.hashCode();
      hashCode = result;
    }
    return hashCode;
  }
}
