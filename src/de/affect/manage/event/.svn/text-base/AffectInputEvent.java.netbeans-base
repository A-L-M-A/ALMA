/*
 * AffectInputEvent.java
 *
 * Copyright (c) 2004-2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.manage.event;

import java.util.EventObject;

import de.affect.xml.AffectInputDocument.AffectInput;

/**
 * The <code>AffectUpdateEvent</code> class represents an event triggered by an
 * update event of the affect information of all characters.
 *
 * @author Patrick Gebhard
 */

public class AffectInputEvent extends EventObject {

  protected AffectInput fAffectInput;

  /**
   * Constructs an event fired by a change in the specified emotions.
   *
   * @param source the object that generated this event
   * @param affectInput a string that holds the updated affect information of
   *                    all characters
   */
  public AffectInputEvent(Object source, AffectInput affectInput) {
    super(source);
    fAffectInput = affectInput;
  }
  
  /**
   * Returns the affect input
   */
  public AffectInput getAffectInput() {
    return fAffectInput;
  }
}
