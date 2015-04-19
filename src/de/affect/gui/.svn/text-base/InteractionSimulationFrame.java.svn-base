/*
 * InteractionSimulationFrame.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Insets;
import java.util.logging.Logger;

import static java.awt.Font.BOLD;
import static java.awt.Font.PLAIN;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

import de.affect.gui.simulation.InteractionSimulationPanel;

import static de.affect.util.FileHelper.sALMAFrameIcon;

public class InteractionSimulationFrame extends JFrame {

  private InteractionSimulationPanel m_panel = null;
  private static final String sPREFFEREDFONT = "Arial";
  private static final Color sBORDERLINE = Color.LIGHT_GRAY;
  private static Font sDefaultTextFont = null;
  private static Font sDefaultTitleFont = null;
  private static Font sDefaultBigTitleFont = null;

  public InteractionSimulationFrame () {
    super();
    setTitle("Interaction Simulation");
    if (sALMAFrameIcon != null)
      setIconImage(sALMAFrameIcon);
    GraphicsEnvironment graphEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] availableFonts = graphEnv.getAvailableFontFamilyNames();
    sDefaultTextFont = getFont();
    sDefaultTitleFont = getFont();
    sDefaultBigTitleFont = getFont();
    for (String font : availableFonts) {
      if (font.equals(sPREFFEREDFONT)) {
	sDefaultTextFont = new Font(font, PLAIN, 11);
	sDefaultTitleFont = new Font(font, BOLD, 11);
	sDefaultBigTitleFont = new Font(font, BOLD, 12);
	setFont(sDefaultTextFont);
      }
    }
    m_panel = new InteractionSimulationPanel (new Color (203, 20, 20),
                                              new Color (203, 20, 20),
                                              new Color (228, 201, 22),
                                              new Color (153, 237, 20),
                                              2, 3, 4);
    getContentPane().add(m_panel, BorderLayout.CENTER);
    pack();
  }
  
  public void startRecording() {
    m_panel.startRecording();
  }

}