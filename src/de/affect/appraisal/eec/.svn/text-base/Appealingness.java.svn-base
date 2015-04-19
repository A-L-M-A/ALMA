/*
 * Appealingness.java
 *
 * Copyright (c) 2004 Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.appraisal.eec;

import static java.lang.Math.abs;

import java.text.DecimalFormat;

/**
 * The <code>Appealingness</code> class represents the appealingness
 * of an object. The appealingness of an object is evaluated with
 * respect to an character's attitudes.
 *
 * @author Patrick Gebhard (based on the work of Martin Klesen)
 *
 * @version 1.0
 */
public class Appealingness {

  private final boolean appealing;
  private final double degree;
        
  /**
   * Returns a new <code>Appealingness</code> object using the
   * specified value to describe the degree of appealingness.
   *
   * @param degree the degree of appealingness. A negative degree denotes
   *        unapealingness.
   * @throws IllegalArgumentException if the degree is not a real number
   *         in the interval <code>[-1.0,1.0]</code>.
   */
  public Appealingness (double degree) {
    if (degree < -1.0 || degree > 1.0)
      throw new IllegalArgumentException("Invalid degree " + degree);
    this.appealing = (degree < 0.0) ? false : true;
    this.degree = degree;
  }

  /** 
   * Returns <code>true</code> if the object is appealing and
   * <code>false</code> if it is unappealing.
   *
   * @return <code>true</code> if the object is appealing;
   *         <code>false</code> if it is unappealing.
   */
  public boolean isAppealing() {
    return appealing;
  }

  /**
   * Returns the degree of appealingness.
   *
   * @return the degree of appealingness.
   */
  public double degree() {
    return degree;
  }

  /**
   * Returns the absolut degree of appealingness.
   *
   * @return the absolut degree of appealingness.
   */
  public double absDegree() {
    return abs(degree);
  }

  /**
   * Returns a string describing the appealingness.
   *
   * @return a string describing the appealingness.
   */
  public String toString() {
    DecimalFormat form = new DecimalFormat("#.##");
    return form.format(degree);
  }

}
