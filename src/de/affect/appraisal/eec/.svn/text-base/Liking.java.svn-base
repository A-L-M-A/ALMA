/*
 * Liking.java
 *
 * Copyright (c) 2004-2006 Patrick Gebahrd
 * All rights reserved.
 *
 */

package de.affect.appraisal.eec;

import static java.lang.Math.abs;

import java.text.DecimalFormat;

/**
 * The <code>Liking</code> class reflects how attracted to
 * another person one is.
 *
 * @author Patrick Gebhard (based on the work of Martin Klesen)
 *
 * @version 1.0
 */
public class Liking {

  private final boolean liking;
  private final double degree;

  /**
   * Returns a new <code>Liking</code> object using the
   * specified value to describe the degree of liking.
   *
   * @param degree the degree of liking. A negative value denotes disliking.
   *
   * @throws IllegalArgumentException if the degree is not a real number
   *         in the interval <code>[0.0,1.0]</code>.
   */
  public Liking (double degree) {
    if (degree < -1.0 || degree > 1.0)
      throw new IllegalArgumentException("Invalid degree " + degree);
    this.liking = (degree < 0.0) ? false : true;
    this.degree = degree;
  }

  /** 
   * Returns <code>true</code> if the other person is liked and
   * <code>false</code> if the other person is disliked.
   *
   * @return <code>true</code> if the other person is liked;
   *         <code>false</code> if it is disliked.
   */
  public boolean isLiked() {
    return liking;
  }

  /**
   * Returns the degree to which the other person is liked or disliked.
   *
   * @return the degree of liking.
   */
  public double degree() {
    return degree;
  }

  /**
   * Returns the absolut degree to which the other person is liked or disliked.
   *
   * @return the absolut degree to which the other person is liked or disliked.
   */
  public double absDegree() {
    return abs(degree);
  }

  /**
   * Returns a string representing the liking for another person.
   *
   * @return a string representing the liking for another person.
   */
  public String toString() {
    DecimalFormat form = new DecimalFormat("#.##");
    return form.format(degree);
  }

}
