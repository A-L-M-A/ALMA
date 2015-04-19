/*
 * EmotionChangeEvent.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.manage.event;

import java.util.EventObject;
import de.affect.emotion.EmotionType;

/**
 * This class represents an event triggered by a change in
 * the agent's emotions by the user.
 *
 * @author Patrick Gebhard
 */

public class EmotionMaintenanceEvent extends EventObject {
  protected EmotionType fEmotionType;
  protected String fCharacterName;
  protected double fEmotionIntensity;

  /**
   * Constructs an event fired by a change in the specified emotions.
   *
   * @param source the object that generated this event
   * @param name the name of the character to which the emotion change event is related
   * @param type the type of emotion
   * @param intensity the emotion's intensity
   */
  public EmotionMaintenanceEvent(Object source, String name, 
                                 EmotionType type, double intensity) {
    super(source);
    this.fEmotionType = type;
    this.fEmotionIntensity = intensity;
    this.fCharacterName = name;
  }
  
  /**
   * Returns the changed emotion type.
   */
  public EmotionType emotionType() {
    return fEmotionType;
  }

  /**
   * Returns the intensity of the changed emotion type.
   */
  public double intensity() {
    return fEmotionIntensity;
  }

  /**
   * Returns the name of the agent, which emotion has been changed.
   */
  public String getCharacterName() {
    return fCharacterName;
  }
}
