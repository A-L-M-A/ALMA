/*
 * Realization.java
 *
 * Copyright (c) 2002-2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.appraisal.eec;

import static java.lang.Math.abs;

import java.text.DecimalFormat;

/**
 * The <code>Realization</code> class reflects the status of an anticipated
 * event. The status of an event depends not upon the actual occurrence or
 * nonoccurrence of the prospective event, but on the experiencing agent's
 * beliefs about such occurrences.<BR>
 * The agent may believe that the event has occurred (labeled "confirmed"),
 * or the agent may believe that the event failed to occur ("disconfirmed").
 * The Realization class also reflects the degree to which the confirmed
 * or disconfirmed event is realized.
 *
 * @author Patrick Gebhard (based on the work of Martin Klesen)
 * @version 1.0
 */
public class Realization {

  private final boolean confirmed;
  private final double degree;

  /**
   * Returns a new <code>Realization</code> object using the specified
   * value to describe the degree to which the confirmed or disconfirmed
   * event is realized.
   *
   * @param degree the degree to which the event is realized. A negative degree
   *        denotes disconfirmend of an event.
   *
   * @throws IllegalArgumentException if the degree is not a real number
   *         in the interval <code>[-1.0,1.0]</code>.
   */
  public Realization (double degree) {
    if (degree < -1.0 || degree > 1.0)
      throw new IllegalArgumentException("Invalid degree " + degree);
    this.confirmed = (degree < 0.0) ? false : true;
    this.degree = degree;
  }

  /** 
   * Returns <code>true</code> if the event has occurred and
   * <code>false</code> the event failed to occur.
   *
   * @return <code>true</code> if the event is confirmed;
   *         <code>false</code> if it is disconfirmed.
   */
  public boolean isConfirmed() { 
    return confirmed;
  }

  /**
   * Returns the degree to which the event is realized.
   *
   * @return the degree to which the event is realized.
   */
  public double degree() {
    return degree; 
  }


  /**
   * Returns the absolut degree to which the event is realized.
   *
   * @return the absolut degree to which the event is realized.
   */
  public double absDegree() {
    return abs(degree);
  }

  /**
   * Returns a string describing the status of an anticipated event.
   *
   * @return a string describing the status of an anticipated event.
   */
  public String toString() {
    DecimalFormat form = new DecimalFormat("#.##");
    return form.format(degree);
  }

}
