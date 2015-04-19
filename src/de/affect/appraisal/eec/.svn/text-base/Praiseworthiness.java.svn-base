/*
 * Praiseworthiness.java
 *
 * Copyright (c) 2004 Pby Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.appraisal.eec;

import static java.lang.Math.abs;

import java.text.DecimalFormat;

/**
 * The <code>Praiseworthiness</code> class describes the praiseworthiness
 * of an action. The praiseworthiness of an character's action is evaluated
 * with respect to a hierarchy of standards.
 *
 * @author Patrick Gebhard (based at the work of Martin Klesen)
 * 
 * @version 1.0
 */
public class Praiseworthiness {

  private final boolean praiseworthy;
  private final double degree;
    
  /**
   * Returns a new <code>Praiseworthiness</code> object using the
   * specified value to describe the degree of praiseworthiness.
   *
   * @param degree the degree of praiseworthiness. A negative degree denotes
   *        blameworthiness
   *
   * @throws IllegalArgumentException if the degree is not a real number
   *         in the interval <code>[-1.0,1.0]</code>.
   */
  public Praiseworthiness (double degree) {
    if (degree < -1.0 || degree > 1.0)
      throw new IllegalArgumentException("Invalid degree " + degree);
    this.praiseworthy = (degree < 0.0) ? false : true;
    this.degree = degree;
  }
  
  /** 
   * Returns <code>true</code> if the action is praiseworthy
   * and <code>false</code> if it is blameworthy.
   *
   * @return <code>true</code> if the action is praiseworthy;
   *         <code>false</code> if it is blameworthy.
   */
  public boolean isPraiseworthy() {
    return praiseworthy;
  }

  /**
   * Returns the degree of praiseworthiness.
   *
   * @return the degree of praiseworthiness.
   */
  public double degree() {
    return degree;
  }

  /**
   * Returns the absolut degree of praiseworthiness.
   *
   * @return the absolut degree of praiseworthiness.
   */
  public double absDegree() {
    return abs(degree);
  }

  /**
   * Returns a string describing the praiseworthiness.
   *
   * @return a string describing the praiseworthiness.
   */
  public String toString() {
    DecimalFormat form = new DecimalFormat("#.##");
    return form.format(degree);
  }

}

