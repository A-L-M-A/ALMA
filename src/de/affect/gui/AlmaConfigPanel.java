/*
 * AlmaConfigPanel.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;


import de.affect.manage.AffectManager;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.xmlbeans.XmlException;

import static de.affect.gui.Helpers.bigButtonSize;
import static de.affect.gui.Helpers.createHelpers;
import static de.affect.gui.Helpers.getFillerBox;

/** 
 * The class <code>AlmaConfigPanel</code> provides an graphicsal interfaces for
 * all computing relevant variables 
 * 
 * This code relys on the xml bean classes created with xmlbeans v1.3
 * from the Affect.xsd schema, which is part of this distribution.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AlmaConfigPanel extends JPanel implements ActionListener {

  private static AffectManager.InterfaceHolder affectManager = AffectManager.sInterface;
  private JButton applyButton = new JButton("Apply");
  private SliderListener sliderListener = null;

  public AlmaConfigPanel(File compSpecs) throws IOException, XmlException {

    createHelpers();
    sliderListener = new SliderListener();
    // Build Dialog
    JPanel configPanel = new JPanel();
    // Emotion Decay
    // Tie config panels together
    configPanel.setLayout(new BoxLayout(configPanel, BoxLayout.Y_AXIS));
    // Buttons
    JPanel buttonPanel = new JPanel();
    applyButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    applyButton.setAlignmentY(Component.CENTER_ALIGNMENT);
    applyButton.setMinimumSize(bigButtonSize);
    applyButton.setPreferredSize(bigButtonSize);
    applyButton.setMaximumSize(bigButtonSize);
    applyButton.setActionCommand("apply_values");
    applyButton.setEnabled(false);
    applyButton.addActionListener(this);
    buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
    buttonPanel.add(getFillerBox(0, 0, 5000, 5000));
    buttonPanel.add(applyButton);
    // Tie all together
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.add(configPanel);
    this.add(Box.createRigidArea(new Dimension(4, 4)));
    this.add(buttonPanel);
  }

  /** Listens to the slider. */
  class SliderListener implements ChangeListener {
    public void stateChanged(ChangeEvent e) {
      // ((JSlider)e.getSource()).setSnapToTicks(true);
//       JSlider slider = (JSlider)e.getSource();
//       applyButton.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("apply_values")) {
      applyButton.setEnabled(false);
    }
  }
}
