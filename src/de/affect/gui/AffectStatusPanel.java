/*
 * AffectStatusPanel.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.border.Border;
import static javax.swing.SwingConstants.LEFT;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createTitledBorder;

import de.affect.mood.Mood;
import de.affect.emotion.EmotionVector;
import de.affect.emotion.Emotion;
import de.affect.emotion.EmotionType;
import static de.affect.emotion.EmotionType.*;
import static de.affect.gui.AlmaGUI.sDefaultTextFont;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.AlmaGUI.sBORDERLINE;
import static de.affect.gui.Helpers.getFillerBox;

/**
 * The <code>AffectStatusPanel</code> shows all ongoing changes in the
 * character's affect by text comments.
 * 
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AffectStatusPanel extends JPanel {

  private static Dimension sSTATUSLINESIZE = new Dimension(140, 20); 
  private JLabel fDominantEmotionLabel = null;
  private JLabel fCurrentMoodLabel = null;
  private JLabel fCurrentMoodTendencyLabel = null;
  private JLabel fDefaultMoodLabel = null;

  protected AffectStatusPanel(String dominantEmotion, 
			      String defaultMood, String currentMood, String currentMoodTendency) {
    setFont(sDefaultTextFont);
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    Border border = 
      createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Status ",0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1));
    setBorder(border);
    setMinimumSize(sSTATUSLINESIZE);
    JLabel fDominantEmotionLabelPrefix = new JLabel("Dominant emotion: ", LEFT);
    fDominantEmotionLabelPrefix.setFont(sDefaultTextFont);
    fDominantEmotionLabel = new JLabel(dominantEmotion, LEFT);
    fDominantEmotionLabel.setFont(sDefaultTextFont);
    JLabel fDefaultMoodLabelPrefix = new JLabel("Default mood: ", LEFT);
    fDefaultMoodLabelPrefix.setFont(sDefaultTextFont);
    fDefaultMoodLabel = new JLabel(defaultMood, LEFT);
    fDefaultMoodLabel.setFont(sDefaultTextFont);
    JLabel fCurrentMoodLabelPrefix = new JLabel("Current mood: ", LEFT);
    fCurrentMoodLabelPrefix.setFont(sDefaultTextFont);
    fCurrentMoodLabel = new JLabel(currentMood, LEFT);
    fCurrentMoodLabel.setFont(sDefaultTextFont);
    JLabel fCurrentMoodTendencyLabelPrefix = new JLabel("Mood tendency: ", LEFT);
    fCurrentMoodTendencyLabelPrefix.setFont(sDefaultTextFont);
    fCurrentMoodTendencyLabel = new JLabel(currentMoodTendency, LEFT);
    fCurrentMoodTendencyLabel.setFont(sDefaultTextFont);

    this.add(Box.createRigidArea(new Dimension(300, 1)));
    JPanel dominantEmotionPanel = new JPanel();
    dominantEmotionPanel.setLayout(new BoxLayout(dominantEmotionPanel, BoxLayout.X_AXIS));
    //dominantEmotionPanel.add(getFillerBox(5, 0, 5000, 0));
    dominantEmotionPanel.add(fDominantEmotionLabelPrefix);
    dominantEmotionPanel.add(fDominantEmotionLabel);
    dominantEmotionPanel.add(getFillerBox(5, 0, 5000, 0));
    this.add(dominantEmotionPanel);
    JPanel fCurrentMoodPanel = new JPanel();
    fCurrentMoodPanel.setLayout(new BoxLayout(fCurrentMoodPanel, BoxLayout.X_AXIS));
    //fCurrentMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    fCurrentMoodPanel.add(fCurrentMoodLabelPrefix);
    fCurrentMoodPanel.add(fCurrentMoodLabel);
    fCurrentMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    this.add(fCurrentMoodPanel);
    JPanel fCurrentMoodTendencyPanel = new JPanel();
    fCurrentMoodTendencyPanel.setLayout(new BoxLayout(fCurrentMoodTendencyPanel, BoxLayout.X_AXIS));
    //fCurrentMoodTendencyPanel.add(getFillerBox(5, 0, 5000, 0));
    fCurrentMoodTendencyPanel.add(fCurrentMoodTendencyLabelPrefix);
    fCurrentMoodTendencyPanel.add(fCurrentMoodTendencyLabel);
    fCurrentMoodTendencyPanel.add(getFillerBox(5, 0, 5000, 0));
    this.add(fCurrentMoodTendencyPanel);
    JPanel fDefaultMoodPanel = new JPanel();
    fDefaultMoodPanel.setLayout(new BoxLayout(fDefaultMoodPanel, BoxLayout.X_AXIS));
    //fDefaultMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    fDefaultMoodPanel.add(fDefaultMoodLabelPrefix);
    fDefaultMoodPanel.add(fDefaultMoodLabel);
    fDefaultMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    this.add(fDefaultMoodPanel);
  }

  protected void updateStatus(String dominantEmotion,
			      String defaultMood, String currentMood, String currentMoodTendency) {
    fDominantEmotionLabel.setText(dominantEmotion);
    if (!(dominantEmotion.contains(EmotionType.Undefined.toString()))) {
      fDominantEmotionLabel.setForeground(Color.red);
    } else {
      fDominantEmotionLabel.setForeground(Color.black);
    }
    fDefaultMoodLabel.setText(defaultMood);
    fCurrentMoodLabel.setText(currentMood);
    fCurrentMoodLabel.setForeground(Color.yellow.darker());
    fCurrentMoodTendencyLabel.setText(currentMoodTendency);
    fCurrentMoodTendencyLabel.setForeground(Color.red.darker());
  }

}
