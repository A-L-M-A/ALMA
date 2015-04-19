/*
 * PersonalityMoodRelations.java
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

import de.affect.manage.AffectManager;
import de.affect.mood.Mood;
import java.util.logging.Logger;

public class PersonalityMoodRelations {
  private static PersonalityMoodRelations instance = null;
  private static Mood opennessRelation = null;
  private static Mood conscientiousnessRelation = null;
  private static Mood extraversionRelation = null;
  private static Mood agreeablenessRelation = null;
  private static Mood neurotismRelation = null;
  private static Personality pleasureRelation = null;
  private static Personality arousalRelation = null;
  private static Personality dominanceRelation = null;
  private static Logger log = AffectManager.sLog;

  protected PersonalityMoodRelations() {
    // ... to defeat instanciation
  }
  
  protected PersonalityMoodRelations(Mood opennessRelation, Mood conscientiousnessRelation,
				     Mood extraversionRelation, Mood agreeablenessRelation,
				     Mood neurotismRelation,
				     Personality pleasureRelation, Personality arousalRelation,
				     Personality dominanceRelation) {
    this.opennessRelation = opennessRelation;
    this.conscientiousnessRelation = conscientiousnessRelation;
    this.extraversionRelation = extraversionRelation;
    this.agreeablenessRelation = agreeablenessRelation;
    this.neurotismRelation = neurotismRelation;
    this.pleasureRelation = pleasureRelation;
    this.arousalRelation = arousalRelation;
    this.dominanceRelation = dominanceRelation;
  }

  public static PersonalityMoodRelations 
    createPersonalityMoodRelations(Mood opennessRelation, Mood conscientiousnessRelation,
				   Mood extraversionRelation, Mood agreeablenessRelation,
				   Mood neurotismRelation,
				   Personality pleasureRelation, Personality arousalRelation,
				   Personality dominanceRelation) {
    if (instance == null) {
      instance = new PersonalityMoodRelations(opennessRelation,
					      conscientiousnessRelation,
					      extraversionRelation,
					      agreeablenessRelation,
					      neurotismRelation,
					      pleasureRelation,
					      arousalRelation,
					      dominanceRelation);
    }
    return instance;
  }

  /**
   * Computes a character's default mood according to it's personality trait
   *
   * @param personality the character's personality
   * @throws NullPointerException if the personality or the
   *                              PersonalityMoodRelations is null.
   * @return Mood object
   */
  public static Mood getDefaultMood(Personality personality) {
    if ((instance == null) && (personality == null)) {
      throw new NullPointerException("PersonalityMoodRelations or personality argument null!");
    } else {
      double pleasure = 
	pleasureRelation.getOpenness()*personality.getOpenness() +
	pleasureRelation.getConscientiousness()*personality.getConscientiousness() +
	pleasureRelation.getExtraversion()*personality.getExtraversion() +
	pleasureRelation.getAgreeableness()*personality.getAgreeableness() +
	pleasureRelation.getNeurotism()*personality.getNeurotism();
      pleasure = (pleasure > 1.0d) ? 1.0d : pleasure;
      pleasure = (pleasure < -1.0d) ? -1.0d : pleasure;
      double arousal =
	arousalRelation.getOpenness()*personality.getOpenness() +
	arousalRelation.getConscientiousness()*personality.getConscientiousness() +
	arousalRelation.getExtraversion()*personality.getExtraversion() +
	arousalRelation.getAgreeableness()*personality.getAgreeableness() +
	arousalRelation.getNeurotism()*personality.getNeurotism();
      arousal = (arousal > 1.0d) ? 1.0d : arousal;
      arousal = (arousal < -1.0d) ? -1.0d : arousal;
      double dominance =
	dominanceRelation.getOpenness()*personality.getOpenness() +
	dominanceRelation.getConscientiousness()*personality.getConscientiousness() +
	dominanceRelation.getExtraversion()*personality.getExtraversion() +
	dominanceRelation.getAgreeableness()*personality.getAgreeableness() +
	dominanceRelation.getNeurotism()*personality.getNeurotism();
      dominance = (dominance > 1.0d) ? 1.0d : dominance;
      dominance = (dominance < -1.0d) ? -1.0d : dominance;
      // Get the average value of each mood dimension.
      return new Mood(pleasure, arousal, dominance);
    }
  }

  /**
   * Computes a character's personality traits according to a given mood
   *
   * @param mood the character's mood
   * @throws NullPointerException if the personality or the
   *                              PersonalityMoodRelations is null.
   * @return Personality object
   */
  public static Personality getMoodyPersonalityTraits(Mood mood) {
    if ((instance == null) && (mood == null)) {
      throw new NullPointerException("PersonalityMoodRelations or mood argument null!");
    } else {
      double pleasure = mood.getPleasure();
      double arousal = mood.getArousal();
      double dominance = mood.getDominance();
      double openness = 0.0d;
      double conscientiousness = 0.0d;
      double extraversion = 0.0d;
      double agreeableness = 0.0d;
      double neurotism = 0.0d;
      if (mood.isPleasureDominant()) {
	// computed (temporal) personality traits related to pleasure
	openness = (opennessRelation.isPleasureDominant()) ?
	  opennessRelation.getPleasure()*pleasure + 
	  opennessRelation.getArousal()*arousal + 
	  opennessRelation.getDominance()*dominance : 0.0d;
	conscientiousness = (conscientiousnessRelation.isPleasureDominant()) ?
	  conscientiousnessRelation.getPleasure()*pleasure + 
	  conscientiousnessRelation.getArousal()*arousal + 
	  conscientiousnessRelation.getDominance()*dominance : 0.0d;
	extraversion = (extraversionRelation.isPleasureDominant()) ?
	  extraversionRelation.getPleasure()*pleasure + 
	  extraversionRelation.getArousal()*arousal + 
	  extraversionRelation.getDominance()*dominance : 0.0d;
	agreeableness = (agreeablenessRelation.isPleasureDominant()) ?
	  agreeablenessRelation.getPleasure()*pleasure + 
	  agreeablenessRelation.getArousal()*arousal + 
	  agreeablenessRelation.getDominance()*dominance : 0.0d;
	neurotism = (neurotismRelation.isPleasureDominant()) ?
	  neurotismRelation.getPleasure()*pleasure + 
	  neurotismRelation.getArousal()*arousal +
	  neurotismRelation.getDominance()*dominance :0.0d;
      }
      if (mood.isArousalDominant()) {
	// compute (temporal) personality traits related to arousal
	openness = (opennessRelation.isArousalDominant()) ?
	  opennessRelation.getPleasure()*pleasure + 
	  opennessRelation.getArousal()*arousal + 
	  opennessRelation.getDominance()*dominance : 0.0d;
	conscientiousness = (conscientiousnessRelation.isArousalDominant()) ?
	  conscientiousnessRelation.getPleasure()*pleasure + 
	  conscientiousnessRelation.getArousal()*arousal + 
	  conscientiousnessRelation.getDominance()*dominance : 0.0d;
	extraversion = (extraversionRelation.isArousalDominant()) ?
	  extraversionRelation.getPleasure()*pleasure + 
	  extraversionRelation.getArousal()*arousal + 
	  extraversionRelation.getDominance()*dominance : 0.0d;
	agreeableness = (agreeablenessRelation.isArousalDominant()) ?
	  agreeablenessRelation.getPleasure()*pleasure + 
	  agreeablenessRelation.getArousal()*arousal + 
	  agreeablenessRelation.getDominance()*dominance : 0.0d;
	neurotism = (neurotismRelation.isArousalDominant()) ?
	  neurotismRelation.getPleasure()*pleasure + 
	  neurotismRelation.getArousal()*arousal +
	  neurotismRelation.getDominance()*dominance :0.0d;
      }
      if (mood.isDominanceDominant()) {
	// compute (temporal) personality traits related to dominance
	openness = (opennessRelation.isDominanceDominant()) ?
	  opennessRelation.getPleasure()*pleasure + 
	  opennessRelation.getArousal()*arousal + 
	  opennessRelation.getDominance()*dominance : 0.0d;
	conscientiousness = (conscientiousnessRelation.isDominanceDominant()) ?
	  conscientiousnessRelation.getPleasure()*pleasure + 
	  conscientiousnessRelation.getArousal()*arousal + 
	  conscientiousnessRelation.getDominance()*dominance : 0.0d;
	extraversion = (extraversionRelation.isDominanceDominant()) ?
	  extraversionRelation.getPleasure()*pleasure + 
	  extraversionRelation.getArousal()*arousal + 
	  extraversionRelation.getDominance()*dominance : 0.0d;
	agreeableness = (agreeablenessRelation.isDominanceDominant()) ?
	  agreeablenessRelation.getPleasure()*pleasure + 
	  agreeablenessRelation.getArousal()*arousal + 
	  agreeablenessRelation.getDominance()*dominance : 0.0d;
	neurotism = (neurotismRelation.isDominanceDominant()) ?
	  neurotismRelation.getPleasure()*pleasure + 
	  neurotismRelation.getArousal()*arousal +
	  neurotismRelation.getDominance()*dominance :0.0d;
      }
      // just for being on the safe side ...
      openness = (openness > 1.0d) ? 1.0d : openness;
      conscientiousness = (conscientiousness > 1.0d) ? 1.0d : conscientiousness;
      extraversion = (extraversion > 1.0d) ? 1.0d : extraversion;
      agreeableness = (agreeableness > 1.0d) ? 1.0d : agreeableness;
      neurotism = (neurotism > 1.0d) ? 1.0d : neurotism;
            // just for being on the safe side ...
      openness = (openness < -1.0d) ? -1.0d : openness;
      conscientiousness = (conscientiousness < -1.0d) ? -1.0d : conscientiousness;
      extraversion = (extraversion < -1.0d) ? -1.0d : extraversion;
      agreeableness = (agreeableness < -1.0d) ? -1.0d : agreeableness;
      neurotism = (neurotism < -1.0d) ? -1.0d : neurotism;
      Personality p = 
	new Personality(openness, conscientiousness, extraversion, agreeableness, neurotism);
      return p;
    }
  }
}
