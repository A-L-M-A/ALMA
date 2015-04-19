/*
 * DecayFunction.java
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

import de.affect.emotion.Emotion;

/** 
 * Interface for emotion decay functions
 * 
 * @author Patrick Gebhard
 * @version 1.0
 */
public interface DecayFunction {
  /** Initializes the decay function. The decay function computes for each
   * emotion in the emotion vector a decay factor based on the number of
   * steps required to decay to the emotion baseline. 
   *
   * @param decaySteps the number of steps to decay
   *
   * @throws NullPointerException if the set of emotions is not specified
   * @throws IllegalArgumentException if the number of decay steps is not positive
   * @throws IllegalArgumentException if the decay threshold is negative
   */
  public void init(int decaySteps);

  /** Decays an emotion and returns the result. The intensity of an emotion
   * is always greater or equal to the emotion baseline.
   *
   * @param emotion the emotion to decay
   * @return the decayed emotion
   */
  public Emotion decay(Emotion emotion);

  /** Access the amount of decay steps.
   *
   * @return the number of steps to decay.
   */
  public int decaySteps();

  /** Indicates if function has additional configuration parameter
   *
   * @return existance of additional configuration parameter (true or false)
   */
  public boolean hasConfigParameter();

  /** Returns (if any) the additional configuration parameter
   *
   * @return if exisits, additional configuration parameter, else -1.0d
   */
  public double getConfigParameter();

  /** Sets the additional configuration parameter
   */
  public void setConfigParameter(double param);
}
