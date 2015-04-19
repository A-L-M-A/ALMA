/*
 * ExponentialDecayFunction.java
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007, 2008, Patrick Gebhard, DFKI GmbH
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

import java.util.Hashtable;
import static java.lang.Math.exp;
import static java.lang.Math.log;

import de.affect.emotion.Emotion;


/**
 * This class uses an exponential function for the emotion decay.
 *	
 * @author Patrick Gebhard
 * 
 * @version 2.0
 */
public class ExponentialDecayFunction implements DecayFunction {

  private final static double ZEROCONST = log(0.004d);
  private Hashtable<Emotion, Values> fDecayingEmotions = new Hashtable<Emotion, Values>();
  private int decaySteps;
  private boolean isInitialised = false;

  public ExponentialDecayFunction() {}

  public ExponentialDecayFunction(int decaySteps) {
    init(decaySteps);
  }

  private class Values {

    int xValue;
    int xEndValue;    
    double operatingRange;

    Values(int xValue, int xEndValue, double operatingRange) {
      this.xValue = xValue;
      this.xEndValue = xEndValue;
      this.operatingRange = operatingRange;
    }
    
  }
  
  public void init(int decaySteps) {
    if (decaySteps <= 0)
      throw new IllegalArgumentException("Number of decay steps not positive.");
    this.decaySteps = decaySteps;
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
    if (intensity  > baseline) {
      if (fDecayingEmotions.containsKey(emotion)) {
	values = fDecayingEmotions.get(emotion);
	xValue = values.xValue;
	xEndValue = values.xEndValue;
	operatingRange = values.operatingRange;
      } else { // first time setup of variables
	operatingRange = (intensity - baseline);
	xValue = 0;
	xEndValue = (int)(decaySteps * operatingRange); // maximum x
	values = new Values(xValue, xEndValue, operatingRange);
	fDecayingEmotions.put(emotion, values);
      }
      xValue++;
      newIntensity = exp(xValue * ZEROCONST / xEndValue) * (operatingRange) + baseline;
      values.xValue = xValue;
      fDecayingEmotions.put(emotion, values);
      if ((xValue > xEndValue) || (newIntensity < baseline)) {
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
    return false;
  }

  public double getConfigParameter () {
    return -1.0d;
  }

  public void setConfigParameter (double param) {
  }

}
