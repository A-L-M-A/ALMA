/*
 * Likelihood.java
 *
 * Copyright (c) 2004 Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.appraisal.eec;

import static java.lang.Math.abs;

import java.text.DecimalFormat;

/**
 * The <code>Likelihood</code> class reflects the degree of belief
 * that an anticipated event will occur.
 *
 * @author Patrick Gebahrd (based on the work of Martin Klesen)
 * @version 1.0
 */
public class Likelihood {

  private final boolean likely;
  private final double degree;

  /**
   * Returns a new <code>Likelihood</code> object using the specified
   * value to describe the degree of belief that an anticipated event
   * will occur.
   *
   * @param degree the degree of belief that the event will occur. A negative
   *        value denotes unlikliness.
   *
   * @throws IllegalArgumentException if the degree is not a real number
   *         in the interval <code>[-1.0,1.0]</code>.
   */
  public Likelihood (double degree) {
    if (degree < -1.0 || degree > 1.0)
      throw new IllegalArgumentException("Invalid degree " + degree);
    this.likely = (degree < 0.0) ? false : true;
    this.degree = degree;
  }

  /** 
   * Returns <code>true</code> if the event is likely and
   * <code>false</code> if it is unlikely.
   *
   * @return <code>true</code> if the event is likely;
   *         <code>false</code> if it is unlikely.
   */
  public boolean isLikely() {
    return likely;
  }

  /**
   * Returns the degree of belief that the event will occur.
   *
   * @return the degree of belief that the event will occur.
   */
  public double degree() { 
    return degree;
  }

  /**
   * Returns the absolut degree of belief that the event will occur.
   *
   * @return the absolut degree of belief that the event will occur.
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
    DecimalFormat form = new DecimalFormat("#.##");
    return form.format(degree);
  }

}
