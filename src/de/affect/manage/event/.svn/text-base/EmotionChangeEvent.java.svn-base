/*
 * EmotionChangeEvent.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.manage.event;

import java.util.EventObject;
import de.affect.emotion.EmotionVector;

/**
 * This class represents an event triggered by a change in
 * the agent's emotions.
 *
 * @author Patrick Gebhard
 */

public class EmotionChangeEvent extends EventObject {

  protected EmotionVector emotions;

  /**
   * Constructs an event fired by a change in the specified emotions.
   *
   * @param source the object that generated this event
   * @param emotions the emotions that have changed
   */
  public EmotionChangeEvent(Object source, EmotionVector emotions) {
    super(source);
    this.emotions = emotions;
  }
  
  /**
   * Returns the changed emotions as an EmotionVector object.
   */
  public EmotionVector emotions() {
    return emotions;
  }

}
