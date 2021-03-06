/*
 * EmotionPADCentroid.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.emotion;

import static de.affect.util.Convert.prettyPrint;

/**
 * The <code>EmotionPADCentroid</code> class represents the center of active
 * emotions in the PAD space. 
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class EmotionPADCentroid {
  private double fPValue = 0.0d;
  private double fAValue = 0.0d;
  private double fDValue = 0.0d;
  private double fWeight = 0.0d;
  private int fEmotionCnt = 0;


  public EmotionPADCentroid() {
  }

  public void add(double pValue, double aValue, double dValue, double intensity) {
    double oldWeight= fWeight;
    fEmotionCnt++;
    //log.info(prettyPrint(intensity));
    fWeight += intensity;
    fPValue = ((fPValue*oldWeight)+(pValue*intensity))/fWeight;
    fAValue = ((fAValue*oldWeight)+(aValue*intensity))/fWeight;
    fDValue = ((fDValue*oldWeight)+(dValue*intensity))/fWeight;
  }

  public boolean isActive() {
    return ((fPValue != 0.0d) || (fAValue != 0.0d) || (fDValue != 0.0d));
  }

  public double getPValue() {
    return fPValue;
  }

  public double getAValue() {
    return fAValue;
  }

  public double getDValue() {
    return fDValue;
  }

  public double getWeight() {
    return fWeight;
  }

  public double getIntensity() {
    return Math.sqrt((fPValue*fPValue) + (fAValue*fAValue) + (fDValue*fDValue));
  }

  public void clear() {
    fPValue = 0.0d;
    fAValue = 0.0d;
    fDValue = 0.0d;
    fWeight = 0.0d;
    fEmotionCnt = 0;
  }    

  public String toString() {
    return "EmotionsCenter ("+fEmotionCnt+" emotions): p:"+prettyPrint(fPValue)+" a:"+prettyPrint(fAValue)+ " d:"+prettyPrint(fDValue)+" intensity: " + fWeight;
  }
}
