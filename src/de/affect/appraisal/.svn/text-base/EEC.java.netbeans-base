/*
 * EEC.java
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

package de.affect.appraisal;

import de.affect.appraisal.eec.Agency;
import de.affect.appraisal.eec.Appealingness;
import de.affect.appraisal.eec.Desirability;
import de.affect.appraisal.eec.Likelihood;
import de.affect.appraisal.eec.Liking;
import de.affect.appraisal.eec.Praiseworthiness;
import de.affect.appraisal.eec.Realization;

/**
 * The <code>EEC</code> class represents an Emotion Eliciting Condition.
 * Each Emotion Eliciting Condition (EEC) is the result of an character's
 * subjective appraisal of an emotion-inducing situation:
 * <ol>
 * <li> the desirability of events with respect to the character's goals
 * <li> the praiseworthiness of actions with respect to a set of standards
 * <li> the appealingness of objects with respect to a set of attitudes 
 * </ol>
 * A character's appraisal is based on three central variables:
 * <em>desirability</em>, <em>praiseworthiness</em>, and
 * <em>appealingness</em> which apply to event-based emotions, character-based
 * emotions, and object-based emotions respectively. Besides, there are other
 * local variables, which only affect particular groups of emotions.
 * <P> 
 * The methods of this class all throw a <code>NullPointerException</code>
 * if the arguments provided to them are null. 
 * 
 * @author Patrick Gebhard (based on the work of Wenji Mao and Martin Klesen)
 * @version 2.0
 */
public class EEC {

  public Object elicitor;
  // variables affecting the intensity of particular groups of emotions
  public Desirability desirabilityForSelf;
  public Desirability desirabilityForOther;
  public Praiseworthiness praiseworthiness;
  public Appealingness appealingness;
  public Likelihood likelihood;
  public Realization realization;
  public Liking liking;
  public Agency character;

  private EEC() {} // defeat instanciation

  /**
   * Returns a new Emotion Eliciting Condition representing the
   * subjective appraisal of an event as being desirable or
   * undesirable for the character itself.
   *
   * @param elicitor the emotion-inducing situation
   * @param desirability the desirability of the event
   * @return the new Emotion Eliciting Condition.
   */
  public static EEC appraiseEvent(Object elicitor, Desirability desirability) {
    if (desirability == null) 
      throw new NullPointerException("Desirability not specified.");
    EEC eec = new EEC(); 
    eec.elicitor = elicitor;
    eec.desirabilityForSelf = desirability;
    return eec;
  }

  /**
   * Returns a new Emotion Eliciting Condition representing the
   * subjective appraisal of an anticipated event as being
   * desirable or undesirable for the character itself.
   *
   * @param elicitor the emotion-inducing situation
   * @param desirability the desirability of the anticipated event
   * @param likelihood the likelihood of the anticipated event
   * @return the new Emotion Eliciting Condition.
   */
  public static EEC appraiseEvent(Object elicitor, Desirability desirability,
				  Likelihood likelihood) {
    if (desirability == null) 
      throw new NullPointerException("Desirability not specified.");
    if (likelihood == null) 
      throw new NullPointerException("Likelihood not specified.");
    EEC eec = new EEC(); 
    eec.elicitor = elicitor;
    eec.desirabilityForSelf = desirability;
    eec.likelihood = likelihood;
    return eec;
  }

  /**
   * Returns a new Emotion Eliciting Condition representing the
   * status of an anticipated event.
   *
   * @param elicitor the emotion-inducing situation
   * @param realization the status of an anticipated event
   * @return the new Emotion Eliciting Condition.
   */
  public static EEC appraiseEvent(Object elicitor, Realization realization) {
    if (realization == null) 
      throw new NullPointerException("Realization not specified.");
    EEC eec = new EEC(); 
    eec.elicitor = elicitor;
    eec.realization = realization;
    return eec;
  }

  /**
   * Returns a new Emotion Eliciting Condition representing the
   * subjective appraisal of an event as being desirable or
   * undesirable for another character.
   *
   * @param elicitor the emotion-inducing situation
   * @param desirability the desirability of the event for the other person
   * @param liking the liking for the other person
   * @return the new Emotion Eliciting Condition.
   */
  public static EEC appraiseEvent(Object elicitor, Desirability desirability, Liking liking) {
    if (desirability == null) 
      throw new NullPointerException("Desirability not specified.");
    if (liking == null) 
      throw new NullPointerException("Liking not specified.");
    EEC eec = new EEC();
    eec.elicitor = elicitor;
    eec.desirabilityForOther = desirability;
    eec.liking = liking;
    return eec;
  }

  /**
   * Returns a new Emotion Eliciting Condition representing the
   * subjective appraisal of an action as being praiseworthy or
   * blameworthy.
   *
   * @param elicitor the emotion-inducing situation
   * @param praiseworthiness the praiseworthiness of the action.
   * @param character the character considered responsible for the action.
   * @return the new Emotion Eliciting Condition.
   */
  public static EEC appraiseAction(Object elicitor, Praiseworthiness praiseworthiness,
				   Agency character) {
    if (praiseworthiness == null) 
      throw new NullPointerException("Praiseworthiness not specified.");
    if (character == null) 
      throw new NullPointerException("Agency not specified.");
    EEC eec = new EEC();
    eec.elicitor = elicitor;
    eec.praiseworthiness = praiseworthiness;
    eec.character = character;
    return eec;
  }

  /**
   * Returns a new Emotion Eliciting Condition representing the
   * subjective appraisal of an object as being appealing or
   * unappealing.
   *
   * @param elicitor the emotion-inducing situation
   * @param appealingness the appealingness of the object
   * @return the new Emotion Eliciting Condition.
   */
  public static EEC appraiseObject(Object elicitor, Appealingness appealingness) {
    if (appealingness == null) 
      throw new NullPointerException("Appealingness not specified.");
    EEC eec = new EEC();
    eec.elicitor = elicitor;
    eec.appealingness = appealingness;
    return eec;
  }

  /**
   * Returns the emotion-inducing situation whose subjective appraisal
   * is represented by this Emotion Eliciting Condition.
   *
   * @return the emotion-inducing situation.
   */
  public Object getElicitor() { 
    return elicitor;
  }

  /**
   * Returns a string describing the Emotion Eliciting Condition.
   *
   * @return a string describing the Emotion Eliciting Condition.
   */
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("[EEC: ");
    result.append("elicitor=" + elicitor);
    if (desirabilityForSelf != null)
      result.append(", desirability=" + desirabilityForSelf);
    if (likelihood != null)
      result.append(", likelihood=" + likelihood);
    if (realization != null)
      result.append(", realization=" + realization);
    if (desirabilityForOther != null)
      result.append(", desirability=" + desirabilityForOther);
    if (liking != null)
      result.append(", liking=" + liking);
    if (praiseworthiness != null)
      result.append(", praiseworthiness=" + praiseworthiness);
    if (character != null)
      result.append(", character=" + character);
    if (appealingness != null)
      result.append(", appealingness=" + appealingness);
    result.append("]");
    return result.toString(); 
  }

}
