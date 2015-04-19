/*
 * InteractionSimulationInternalFrame.java
 *
 * Copyright (c) 2004-2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.logging.Logger;

import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

import de.affect.gui.simulation.InteractionSimulationPanel;

public class InteractionSimulationInternalFrame extends AlmaInternalFrame implements InternalFrameListener {
  public InteractionSimulationPanel m_panel;// thengfei private to public

  public InteractionSimulationInternalFrame () {
    super("Interaction Recorder", "InteractionSimulation", new Dimension(815, 300), true, true, true, true);
    m_panel = new InteractionSimulationPanel (new Color (203, 20, 20),
                                              new Color (203, 20, 20),
                                              new Color (228, 201, 22),
                                              new Color (153, 237, 20),
                                              2, 3, 4);
    getContentPane().add(m_panel, BorderLayout.CENTER);
    addInternalFrameListener(this);
    setMinimumSize(new Dimension(815, 300));
  }

  /**
   * Frame is closing. A running AffectScript has to be stopped.
   * @param event Unused here.
   */
  public void internalFrameClosing(InternalFrameEvent event) {
    m_panel.stopPlayActions ();
  }

  // unused
  public void internalFrameOpened(InternalFrameEvent e) {}
  public void internalFrameClosed(InternalFrameEvent e) {}
  public void internalFrameIconified(InternalFrameEvent e) {}
  public void internalFrameDeiconified(InternalFrameEvent e) {}
  public void internalFrameActivated(InternalFrameEvent e) {}
  public void internalFrameDeactivated(InternalFrameEvent e) {}

}