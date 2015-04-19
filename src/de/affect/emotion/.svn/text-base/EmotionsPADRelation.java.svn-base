/*
 * EmotionsPADRelation.java
 *
 * Copyright (c) 2004, Patrick Gebhard
 *
 */

package de.affect.emotion;

import de.affect.emotion.EmotionType;
import de.affect.mood.Mood;

import java.util.*;

public class EmotionsPADRelation {
  /** correlation between mood and emotions */
  private static HashMap<EmotionType, Mood> relations = new HashMap<EmotionType, Mood>(25);
  private static EmotionsPADRelation instance = null;

  protected EmotionsPADRelation() {
    // ... defeat instanciation
  }

  /**
   * Returns the relating pleasure arousal and dominance values of an given 
   * emotion type.
   *
   * @param type the emotion type
   *
   * @return a mood vector containing the pleasure arousal and dominance values 
   */
  public static Mood getEmotionPADMapping(EmotionType type) {
    return relations.get(type);
  }

  /**
   * Returns the baseline for the specified emotion type. The baseline
   * depends on the agent's personality.
   *
   * @param type the emotion type
   * @param mood the mood
   */
  public static void setEmotionPADMapping(EmotionType type, Mood mood) {
    relations.put(type, mood);
  }

  public static EmotionsPADRelation createEmotionsPADRelation() {
    if (instance == null) {
      instance = new EmotionsPADRelation();
    }
    // Do initialization ...
    relations.put(EmotionType.Undefined,       new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Joy,             new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Distress,        new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.HappyFor,        new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Gloating,        new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Resentment,      new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Pity,            new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Hope,            new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Fear,            new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Satisfaction,    new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Relief,          new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.FearsConfirmed,  new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Disappointment,  new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Pride,           new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Admiration,      new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Shame,           new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Reproach,        new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Liking,          new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Disliking,       new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Gratitude,       new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Anger,           new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Gratification,   new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Remorse,         new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Love,            new Mood(0.0d, 0.0d, 0.0d));
    relations.put(EmotionType.Hate,            new Mood(0.0d, 0.0d, 0.0d));
    return instance;
  }

}
