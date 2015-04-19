/*
 * EmotionMaintenanceListener.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.manage.event;

/** 
 * Classes that implement this interface and that are registered with
 * the <code>EmotionMaintenance</code> are notified if an emotion has 
 * changed by user maintenance.
 */
public interface EmotionMaintenanceListener {
  public void maintainEmotion(EmotionMaintenanceEvent e);
}
