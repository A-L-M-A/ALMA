/*
 * Personality.java
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

package de.affect.personality;

import de.affect.emotion.EmotionType;

import java.text.DecimalFormat;
import static de.affect.util.Convert.prettyPrint;

/**
 * The <code>Personality</code> class represents the personality
 * traits of a character. 
 * Personality is a quintuple of the different personality traits:
 * openness, conscientiousness, extraversion, agreeableness, and neuroticism
 * 
 * @author Patrick Gebhard (based on work of Wenji Mao and Martin Klesen)
 * @version 1.0
 *   
 */
public final class Personality {

  private final double openness;
  private final double conscientiousness;
  private final double extraversion;
  private final double agreeableness;
  private final double neurotism;
  private PersonalityEmotionsRelations fPerEmoRels = null;
  private volatile int hashCode = 0;

  /**
   * Constructs a new <code>Personality</code> object with the
   * specified values for each personality trait.
   *
   * @param openness the degree of openness.
   * @param conscientiousness the degree of conscientiousness.
   * @param extraversion the degree of extraversion.
   * @param agreeableness the degree of agreeableness.
   * @param neurotism the degree of neurotism.
   * @param perEmoRels the influcene of personality on emotions
   *
   * @throws IllegalArgumentException if the degree is not a
   *         real number in the interval <code>[-1.0,1.0]</code>.
   */
  public Personality(double openness, double conscientiousness,
		     double extraversion, double agreeableness, 
		     double neurotism, PersonalityEmotionsRelations perEmoRels)  {
    if (openness < -1.0 || openness > 1.0)
      throw new IllegalArgumentException("Invalid degree of openness: " +
					 openness);
    if (conscientiousness < -1.0 || conscientiousness > 1.0)
      throw new IllegalArgumentException("Invalid degree of conscientiousness: " +
					 conscientiousness);
    if (extraversion < -1.0 || extraversion > 1.0)
      throw new IllegalArgumentException("Invalid degree of extraversion: " +
					 extraversion);
    if (agreeableness < -1.0 || agreeableness > 1.0)
      throw new IllegalArgumentException("Invalid degree of agreeableness: " +
					 agreeableness);
    if (neurotism < -1.0 || neurotism > 1.0)
      throw new IllegalArgumentException("Invalid degree of neurotism: " +
					 neurotism);
    this.openness = openness;
    this.conscientiousness = conscientiousness;
    this.extraversion = extraversion;
    this.agreeableness = agreeableness;
    this.neurotism = neurotism;
    fPerEmoRels = perEmoRels;
  }

  /**
   * Constructs a new <code>Personality</code> object with the
   * specified values for each personality trait.
   *
   * @param openness the degree of openness.
   * @param conscientiousness the degree of conscientiousness.
   * @param extraversion the degree of extraversion.
   * @param agreeableness the degree of agreeableness.
   * @param neurotism the degree of neurotism.
   *
   * @throws IllegalArgumentException if the degree is not a
   *         real number in the interval <code>[-1.0,1.0]</code>.
   */
  public Personality(double openness, double conscientiousness,
		     double extraversion, double agreeableness, 
		     double neurotism)  {
    this(openness, conscientiousness, extraversion, agreeableness, neurotism, null);
  }
 

  public void setPersonalityEmotionsRelations(PersonalityEmotionsRelations perEmoRels) {
    fPerEmoRels = perEmoRels;
  }


  public PersonalityEmotionsRelations getPersonalityEmotionsRelations() {
    return fPerEmoRels;
  }

  public double getEmotionBaseline(EmotionType type) {
    return (fPerEmoRels != null) ? 
      fPerEmoRels.getEmotionBaseline(this, type) : 0.0d;
  }

  public double getEmotionBaseline(Personality personality, EmotionType type) {
    return (fPerEmoRels != null) ? 
      fPerEmoRels.getEmotionBaseline(personality, type) : 0.0d;
  }

  /**
   * Returns the degree of openness for this personality.
   *
   * @return the degree of openness.
   */
  public double getOpenness() { return openness; }

  /**
   * Returns the degree of conscientiousness for this personality.
   *
   * @return the degree of conscientiousness.
   */
  public double getConscientiousness() { return conscientiousness; }

  /**
   * Returns the degree of extraversion for this personality.
   *
   * @return the degree of extraversion.
   */
  public double getExtraversion() { return extraversion; }
    
  /**
   * Returns the degree of agreeableness for this personality.
   *
   * @return the degree of agreeableness.
   */
  public double getAgreeableness() { return agreeableness; }
    
  /**
   * Returns the degree of neurotism for this personality.
   *
   * @return the degree of neurotism.
   */
  public double getNeurotism() { return neurotism; }

  /**
   * Returns a concise representation of this personality
   * consisting of the values for each personality trait.
   *
   * @return a string representation of the personality.
   */
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("O: ").append(prettyPrint(openness)).append(", ");
    sb.append("C: ").append(prettyPrint(conscientiousness)).append(", ");
    sb.append("E: ").append(prettyPrint(extraversion)).append(", ");
    sb.append("A: ").append(prettyPrint(agreeableness)).append(", ");
    sb.append("N: ").append(prettyPrint(neurotism));
    return sb.toString();
  }

  /**
   * Compares this personality to the specified object.
   * The result is <code>true</code> if and only if the argument 
   * is a <code>Personality</code> object with the same value
   * for each personality trait.
   *
   * @param o the object to compare this personality against.
   * @return <code>true</code> if the two personalities are equal;
   *         <code>false</code> otherwise.
   */
  public boolean equals(Object o) {
    if (!(o instanceof Personality)) return false;
    Personality p = (Personality)o;
    return 
      p.getOpenness() == openness &&
      p.getConscientiousness() == conscientiousness &&
      p.getExtraversion() == extraversion &&
      p.getAgreeableness() == agreeableness &&
      p.getNeurotism() == neurotism;
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
      result = 37*result + new Double(openness).hashCode();
      result = 37*result + new Double(conscientiousness).hashCode();
      result = 37*result + new Double(extraversion).hashCode();
      result = 37*result + new Double(agreeableness).hashCode();
      result = 37*result + new Double(neurotism).hashCode();
      hashCode = result;
    }
    return hashCode;
  }

}
