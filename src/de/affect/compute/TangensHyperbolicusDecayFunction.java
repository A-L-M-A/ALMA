/*
 * TangensHyperbolicusDecayFunction.java
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

package de.affect.compute;

import static java.lang.Math.tanh;

import java.util.Hashtable;
import de.affect.emotion.Emotion;

/**
 * This class realizes emotion decay using the tangens hyperbolicus function.
 *	
 * @author Patrick Gebhard 
 * 
 * @version 2.0
 */
public class TangensHyperbolicusDecayFunction implements DecayFunction {

  private double TANH_CHARACTER = 0.2d;
  private Hashtable<Emotion, Values> fDecayingEmotions = new Hashtable<Emotion, Values>();
  private double scalingFactor = 0.0d;
  private int decaySteps;
  private boolean isInitialised = false;

  public TangensHyperbolicusDecayFunction() {}

  public TangensHyperbolicusDecayFunction(int decaySteps) {
    init(decaySteps);
  }

  private class Values {

    int xValue;
    int xEndValue;    
    double startValue;
    double operatingRange;

    Values(int xValue, int xEndValue, double startValue, double operatingRange) {
      this.xValue = xValue;
      this.xEndValue = xEndValue;
      this.startValue = startValue;
      this.operatingRange = operatingRange;
    }
    
  }

  public void init(int decaySteps) {
    if (decaySteps <= 0) 
      throw new IllegalArgumentException("Number of decay steps not positive.");
    this.decaySteps = decaySteps;
    this.scalingFactor = 1/(TANH_CHARACTER * decaySteps);
    isInitialised = true;
  }

  public Emotion decay(Emotion emotion) {
    if (!isInitialised) 
      throw new UnsupportedOperationException("Decay function not initialized!");
    Values values = null; 
    double intensity = emotion.getIntensity();
    double baseline = emotion.getBaseline();
    double newIntensity = intensity;
    int xValue;
    int xEndValue;
    double startValue;
    double operatingRange;
    if (intensity > baseline) {
      if (fDecayingEmotions.containsKey(emotion)) {
	values = fDecayingEmotions.get(emotion);
	xValue = values.xValue;
	xEndValue = values.xEndValue;
	startValue = values.startValue;
	operatingRange = values.operatingRange;
      } else { // first time setup of variables
	operatingRange = (intensity - baseline);
	xValue = 0;
	xEndValue = (int)(decaySteps * operatingRange); //maximum x
	startValue = xEndValue * 0.5 / (operatingRange) * scalingFactor;
	values = new Values(xValue, xEndValue, startValue, operatingRange);
	fDecayingEmotions.put(emotion, values);
      }
      // debug log.info("Step " + xValue + "/" + xEndValue);
      double input = -startValue + (xValue / operatingRange * scalingFactor); 
      newIntensity = operatingRange + baseline - ((tanh(input) * 0.5d + 0.5d)) * operatingRange;
      // debug log.info("Input=" + prettyPrint(input) + " new intensity=" + prettyPrint(newIntensity));
      xValue++;
      values.xValue = xValue;
      fDecayingEmotions.put(emotion, values);
      if (xValue > xEndValue) {
	newIntensity = baseline;
	fDecayingEmotions.remove(emotion);
      }
    } 
    emotion.setIntensity(newIntensity);
    return emotion;
  }

  public int decaySteps () {
    return decaySteps;
  }

  public boolean hasConfigParameter () {
    return true;
  }

  public double getConfigParameter () {
    return TANH_CHARACTER;
  }

  public void setConfigParameter (double param) {
    TANH_CHARACTER = param;
  }

}
