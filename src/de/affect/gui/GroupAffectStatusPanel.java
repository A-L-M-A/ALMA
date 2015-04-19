/*
 * GroupAffectStatusPanel.java.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
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
import static de.affect.util.Convert.valueDescription;
import static de.affect.util.Convert.prettyPrint;
import static de.affect.gui.Helpers.getFillerBox;
import static de.affect.gui.AlmaGUI.sDefaultTextFont;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.AlmaGUI.sBORDERLINE;

/**
 * The <code>GroupAffectStatusPanel.java</code> shows all ongoing changes in a
 * group's affect by text comments.
 * 
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class GroupAffectStatusPanel extends JPanel {

  private static Dimension sSTATUSLINESIZE = new Dimension(140, 20); 
  private JLabel fGroupMoodLabel = null;
  private JLabel fSocialIntegrityLabel = null;
  private JLabel fSimilarMoodLabel = null;
  private JLabel fExtremeMoodLabel = null;

  protected GroupAffectStatusPanel(String groupMood, double socialIntegrity, 
				   String similarMood, String extremeMood) {
    setFont(sDefaultTextFont);
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    Border border = 
      createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Status ",0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1));
    setBorder(border);
    setMinimumSize(sSTATUSLINESIZE);
    JLabel fGroupMoodLabelPrefix = new JLabel("Mood: ", LEFT);
    fGroupMoodLabelPrefix.setFont(sDefaultTextFont);
    fGroupMoodLabel = new JLabel(groupMood, LEFT);
    fGroupMoodLabel.setFont(sDefaultTextFont);
    JLabel fSocialIntegrityLabelPrefix = new JLabel("Social integrity: ", LEFT);
    fSocialIntegrityLabelPrefix.setFont(sDefaultTextFont);
    fSocialIntegrityLabel = new JLabel(valueDescription(socialIntegrity) + " (" + 
				       prettyPrint(socialIntegrity) + ")", LEFT);
    fSocialIntegrityLabel.setFont(sDefaultTextFont);
    JLabel fSimilarMoodLabelPrefix = new JLabel("In similar mood: ", LEFT);
    fSimilarMoodLabelPrefix.setFont(sDefaultTextFont);
    fSimilarMoodLabel = new JLabel(similarMood, LEFT);
    fSimilarMoodLabel.setFont(sDefaultTextFont);
    JLabel fExtremeMoodLabelPrefix = new JLabel("In extreme mood: ", LEFT);
    fExtremeMoodLabelPrefix.setFont(sDefaultTextFont);
    fExtremeMoodLabel = new JLabel(extremeMood, LEFT);
    fExtremeMoodLabel.setFont(sDefaultTextFont);

    this.add(Box.createRigidArea(new Dimension(300, 1)));
    JPanel groupMoodPanel = new JPanel();
    groupMoodPanel.setLayout(new BoxLayout(groupMoodPanel, BoxLayout.X_AXIS));
    groupMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    groupMoodPanel.add(fGroupMoodLabelPrefix);
    groupMoodPanel.add(fGroupMoodLabel);
    groupMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    this.add(groupMoodPanel);
    JPanel socialIntegrityPanel = new JPanel();
    socialIntegrityPanel.setLayout(new BoxLayout(socialIntegrityPanel, BoxLayout.X_AXIS));
    socialIntegrityPanel.add(getFillerBox(5, 0, 5000, 0));
    socialIntegrityPanel.add(fSocialIntegrityLabelPrefix);
    socialIntegrityPanel.add(fSocialIntegrityLabel);
    socialIntegrityPanel.add(getFillerBox(5, 0, 5000, 0));
    this.add(socialIntegrityPanel);
    JPanel fSimilarMoodPanel = new JPanel();
    fSimilarMoodPanel.setLayout(new BoxLayout(fSimilarMoodPanel, BoxLayout.X_AXIS));
    fSimilarMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    fSimilarMoodPanel.add(fSimilarMoodLabelPrefix);
    fSimilarMoodPanel.add(fSimilarMoodLabel);
    fSimilarMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    this.add(fSimilarMoodPanel);
    JPanel fExtremeMoodPanel = new JPanel();
    fExtremeMoodPanel.setLayout(new BoxLayout(fExtremeMoodPanel, BoxLayout.X_AXIS));
    fExtremeMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    fExtremeMoodPanel.add(fExtremeMoodLabelPrefix);
    fExtremeMoodPanel.add(fExtremeMoodLabel);
    fExtremeMoodPanel.add(getFillerBox(5, 0, 5000, 0));
    this.add(fExtremeMoodPanel);
    //this.add(Box.createRigidArea(new Dimension(200, 1)));
  }

  protected void updateStatus(String groupMood, double socialIntegrity, 
			      String similarMood, String extremeMood) {
    fGroupMoodLabel.setText(groupMood);
    fSocialIntegrityLabel.setText(valueDescription(socialIntegrity) + " (" + 
				  prettyPrint(socialIntegrity) + ")");
    fSimilarMoodLabel.setText(similarMood);
    fExtremeMoodLabel.setText(extremeMood);
  }

}
