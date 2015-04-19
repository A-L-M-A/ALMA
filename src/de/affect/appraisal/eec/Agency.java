/*
 * Agency.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.appraisal.eec;

/**
 * The <code>Agency</code> class represents the character
 * considered to be responsible for an action.
 *
 * @author Patrick Gebhard (based on the work of Martin Klesen)
 * @version 1.0
 */
public class Agency {

  /** The character itself is responsible for the action. */
  public static final Agency SELF = new Agency("self");
  /** Another person is responsible for the action. */
  public static final Agency OTHER = new Agency("other");
  private final String name;

  /**
   * Hide default constructor.
   */    
  public Agency(String name) {
    this.name = name;
  }
    
  /**
   * Returns the name of the character considered
   * to be responsible for an action.
   *
   * @return the name of the character.
   */
  public String toString() {
    return name;
  }

}
