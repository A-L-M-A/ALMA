/*
 * Desirability.java
 *
 * Copyright (c) 2004 Patrick Gebhard 
 * All rights reserved.
 *
 */

package de.affect.appraisal.eec;

import static java.lang.Math.abs;

import java.text.DecimalFormat;

/**
 * The <code>Desirability</code> class describes the desirability
 * of an event. The desirability of an event is appraised in terms
 * of how it facilitates or interferes with the character's goals.
 *
 * @author Patrick Gebhard (based on the work of Martin Klesen)
 * @version 1.0
 */
public class Desirability {

  private final boolean desirable;
  private final double degree;

  /**
   * Returns a new <code>Desirability</code> object using the
   * specified value to describe the degree of desirability.
   *
   * @param degree the degree of desirability.  A negative degress denotes
   *        undesirablility.
   * @throws IllegalArgumentException if the degree is not a real number
   *         in the interval <code>[-1.0,1.0]</code>.
   */
  public Desirability (double degree) {
    if (degree < -1.0 || degree > 1.0)
      throw new IllegalArgumentException("Invalid degree " + degree);
    this.desirable = (degree < 0.0 ) ? false : true;
    this.degree = degree;
  }

  /** 
   * Returns <code>true</code> if the event is desirable and
   * <code>false</code> if it is undesirable.
   *
   * @return <code>true</code> if the event is desirable;
   *         <code>false</code> if it is undesirable.
   */
  public boolean isDesirable() {
    return desirable;
  }

  /**
   * Returns the degree of desirability.
   *
   * @return the degree of desirability.
   */
  public double degree() { 
    return degree;
  }

  /**
   * Returns the absolut degree of desirability.
   *
   * @return the absolut degree of desirability.
   */
  public double absDegree() {
    return abs(degree);
  }

  /**
   * Returns a string describing the desirability.
   *
   * @return a string describing the desirability.
   */
  public String toString() {
    DecimalFormat form = new DecimalFormat("##.##");
    return form.format(degree);
  }

}
