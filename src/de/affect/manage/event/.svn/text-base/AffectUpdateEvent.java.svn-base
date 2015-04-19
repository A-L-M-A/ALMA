/*
 * AffectUpdateEvent.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.manage.event;

import java.util.EventObject;

import de.affect.xml.AffectOutputDocument;

/**
 * The <code>AffectUpdateEvent</code> class represents an event triggered by an
 * update event of the affect information of all characters.
 *
 * @author Patrick Gebhard
 */

public class AffectUpdateEvent extends EventObject {
  protected AffectOutputDocument affectInfo;

  /**
   * Constructs an event fired by a change in the specified emotions.
   *
   * @param source the object that generated this event
   * @param affectInfo a string that holds the updated affect information of
   *                   all characters
   */
  public AffectUpdateEvent(Object source, AffectOutputDocument affectInfo) {
    super(source);
    this.affectInfo = affectInfo;
  }
  
  /**
   * Returns updated affect information of all characters
   */
  public AffectOutputDocument getUpdate() {
    return affectInfo;
  }
}
