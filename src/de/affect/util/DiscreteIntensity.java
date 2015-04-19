/*
 * DiscreteIntensity.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.util;

public enum DiscreteIntensity {
  Null (0.0d), Little (0.16d), Mild (0.33d), Medium (0.50d), Strong (0.66d), 
  Immense (0.83d), Full (1.0d);

  private final double intensity;

  DiscreteIntensity(double intensity) {
    this.intensity = intensity;
  }

  public double intensity() {
    return intensity();
  }

}