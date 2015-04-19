/*
 * AlmaConfigInternalFrame.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class AlmaConfigInternalFrame extends AlmaInternalFrame {
  private AlmaConfigPanel fConfigPanel = null;

  public AlmaConfigInternalFrame() {
    super("Configuration", "Options", new Dimension(200, 200), true, true, true, true);
    try {
      // TODO fConfigPanel = new AlmaConfigPanel(sALMAConfiguration);
    } catch(Exception e){
      e.printStackTrace();
    }
    getContentPane().add(fConfigPanel, BorderLayout.CENTER);
    pack();
  }

}