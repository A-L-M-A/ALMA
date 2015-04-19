/*
 * ConsoleInternalFrame.java
 *
 * Copyright (c) 2004-2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

import static de.affect.gui.AlmaGUI.sDefaultTextFont;

/** 
 * The class <code>DesktoConsoleInternalFramepHelper</code> displays all internal  
 * (debug) messages as well as information about some internal computation steps.
 *
 * @author Patrick Gebhard
 *
 * @version 1.2
 */
public class ConsoleInternalFrame extends AlmaInternalFrame {

  public ConsoleInternalFrame(JTextPane consoleTextPane) {
    super("Console", "Console", new Dimension(400, 150), true, true, true, true);
    JPanel consolePanel = new JPanel();
    consoleTextPane.setEditable(false);
    consoleTextPane.setFont(sDefaultTextFont);
    consoleTextPane.setMargin(new Insets(5, 8, 5, 8));
    JScrollPane consoleScrollPane = new JScrollPane(consoleTextPane);
    consoleScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    consolePanel.setLayout(new BoxLayout(consolePanel, BoxLayout.X_AXIS));
    consolePanel.add(consoleScrollPane);
    getContentPane().add(consolePanel, BorderLayout.CENTER);
  }

}