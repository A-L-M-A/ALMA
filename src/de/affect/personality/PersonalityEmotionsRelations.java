/*
 * PersonalityEmotionsRelations.java
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

import de.affect.data.SignumType;
import de.affect.emotion.EmotionType;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import static de.affect.data.AffectConsts.*;
import static de.affect.data.SignumType.*;
import static de.affect.emotion.EmotionType.*;

public class PersonalityEmotionsRelations {

  // correlation between personality and emotions
  private Correlation correlation = new Correlation();
  private PersonalityEmotionsRelations instance = null;
  private double fPersonalityEmotionInfluence = 0.0;
  private double fEmotionMaxBaseline = 1.0d;

  public PersonalityEmotionsRelations() {
  }

  /**
   * The <code>Influence</code> class represents the influence of
   * personality traits for the intensity of specific emotions.
   */
  private static class Influence {
    int opennessInfluence;
    int conscientiousnessInfluence;
    int extraversionInfluence;
    int agreeablenessInfluence;
    int neurotismInfluence;

    /**
     * Constructs a new <code>Influence</code> object representing
     * the influence of personality traits for the intensity of a
     * specific emotion.
     * <p>
     * The influence parameters take the following values:
     * <pre>
     *     -1   - negative correlation (decrease intensity)
     *      0   - no correlation
     *      1   - positive correlation (increase intensity)
     * </pre>
     *
     * @param  extraversionInfluence The influence of the extraversion trait
     *                               on the emotion intensity.
     * @param  agreeablenessInfluence The influence of the agreeableness trait
     *                                on the emotion intensity.
     * @param  neuroticismInfluence The influence of the neuroticism trait

     *                              on the emotion intensity.
     */
    Influence(SignumType o, SignumType c, SignumType e, SignumType a, SignumType n) {
      this.opennessInfluence = o.ordinal() - 1;
      this.conscientiousnessInfluence = c.ordinal() - 1;
      this.extraversionInfluence = e.ordinal() - 1;
      this.agreeablenessInfluence = a.ordinal() - 1;
      this.neurotismInfluence = n.ordinal() - 1;
    }

  }

  /**
   * The <code>Correlation</code> class represents the correlation
   * between personality traits and the intensity of emotion types.
   */
  private static class Correlation {

    Map<EmotionType, Influence> relations = new HashMap<EmotionType, Influence>(25);

    /**
     * Contructs a new <code>Correlation</code> object with defines
     * the influence of the personality traits for each emotion type.
     */
    Correlation() {
      relations.put(EmotionType.Undefined,       new Influence(Null, Null, Null, Null, Null));
      relations.put(EmotionType.Joy,             new Influence(Pos, Null, Pos, Null, Null));
      relations.put(EmotionType.Distress,        new Influence(Pos, Null, Null, Null, Pos));
      relations.put(EmotionType.HappyFor,        new Influence(Pos, Null, Pos, Pos, Null));
      relations.put(EmotionType.Gloating,        new Influence(Pos, Pos, Null, Neg, Pos));
      relations.put(EmotionType.Resentment,      new Influence(Pos, Pos, Null, Neg, Pos));
      relations.put(EmotionType.Pity,            new Influence(Pos, Null, Null, Pos, Pos));
      relations.put(EmotionType.Hope,            new Influence(Null, Null, Pos, Null, Null));
      relations.put(EmotionType.Fear,            new Influence(Neg, Null, Null, Null, Pos));
      relations.put(EmotionType.Satisfaction,    new Influence(Pos, Null, Pos, Null, Null));
      relations.put(EmotionType.Relief,          new Influence(Null, Null, Pos, Null, Null));
      relations.put(EmotionType.FearsConfirmed,  new Influence(Neg, Null, Null, Null, Pos));
      relations.put(EmotionType.Disappointment,  new Influence(Neg, Null, Null, Null, Pos));
      relations.put(EmotionType.Pride,           new Influence(Pos, Null, Pos, Null, Null));
      relations.put(EmotionType.Admiration,      new Influence(Pos, Null, Pos, Pos, Null));
      relations.put(EmotionType.Shame,           new Influence(Neg, Null, Null, Null, Pos));
      relations.put(EmotionType.Reproach,        new Influence(Null, Null, Null, Neg, Pos));
      relations.put(EmotionType.Liking,          new Influence(Pos, Null, Pos, Pos, Null));
      relations.put(EmotionType.Disliking,       new Influence(Null, Null, Null, Neg, Pos));
      relations.put(EmotionType.Gratitude,       new Influence(Pos, Null, Pos, Null, Null));
      relations.put(EmotionType.Anger,           new Influence(Null, Null, Null, Neg, Pos));
      relations.put(EmotionType.Gratification,   new Influence(Pos, Null, Pos, Null, Null));
      relations.put(EmotionType.Remorse,         new Influence(Pos, Null, Null, Null, Pos));
      relations.put(EmotionType.Love,            new Influence(Pos, Null, Pos, Pos, Null));
      relations.put(EmotionType.Hate,            new Influence(Pos, Null, Null, Neg, Pos));
    }

   /**
     * Returns the influence of the personality traits
     * for the specified emotion type.
     *
     * @param type the emotion type
     * @return the influence of the personality traits.
     */
    Influence getInfluence(EmotionType type) {
      return (Influence)relations.get(type);
    }

  }

  public void setPersonalityEmotionInfluence(double personalityEmotionInfluence) {
    fPersonalityEmotionInfluence = personalityEmotionInfluence;
  }


  public void setEmotionMaxBaseline(double emotionMaxBaseline) {
    fEmotionMaxBaseline = emotionMaxBaseline;
  }

  /**
   * Returns the combined influence of the character's personality traits
   * for the specified emotion type.
   *
   * @param personality the character's personality
   * @param type the emotion type
   * @return the combined influence.
   */
  public double getPersonalityInfluence(Personality personality, EmotionType type) {
    Influence influence = correlation.getInfluence(type);
    return fPersonalityEmotionInfluence *
      (personality.getOpenness() * influence.opennessInfluence +
       personality.getConscientiousness() * influence.conscientiousnessInfluence +
       personality.getExtraversion() * influence.extraversionInfluence +
       personality.getAgreeableness() * influence.agreeablenessInfluence +
       personality.getNeurotism() * influence.neurotismInfluence);
  }

  /**
   * Returns the baseline for the specified emotion type. The baseline
   * depends on the character's personality.
   *
   * @param personality the character's personality
   * @param type the emotion type
   * @return the emotion baseline.
   */
  public double getEmotionBaseline(Personality personality, EmotionType type) {
    double value = getPersonalityInfluence(personality, type);
    //DEBUG Logger.global.info("EMOTION " + type + " is influenced by personality by " + value);
    value = (value > fEmotionMaxBaseline) ? fEmotionMaxBaseline : value;
    value = (value < 0.0d) ? 0.0d : value;
    //DEBUG Logger.global.info("EMOTION " + type + " has baseline " + value);
    return value;
  }

}