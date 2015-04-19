/*
 * CharacterConfigInternalFrame.java
 *
 * Copyright (c) 2004-2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import de.affect.manage.AffectManager;

import static de.affect.gui.Helpers.bigButtonSize;
import static de.affect.gui.Helpers.createHelpers;
import static de.affect.gui.Helpers.getFillerBox;

import de.affect.xml.AffectDefinitionDocument.AffectDefinition;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.*;

public class CharacterConfigInternalFrame extends AlmaInternalFrame implements ActionListener {

  private JButton fApplyButton = new JButton ("Apply");
  public CharacterConfigPanel fCharacterConfigPanel = null;//tengfei private  to public
  public CharacterAppraisalPanel fCharacterAppraisalPanel = null;
  public CharacterAffectCompPanel fCharacterAffectCompPanel = null;

  private String fCharacterName;

  public CharacterConfigInternalFrame(String characterName) {
    super(characterName + " Configuration", characterName + "Configuration",
	  new Dimension(600, 400), true, true, false, true);//tengfei(600,400) false true false true
    fCharacterName = characterName;
    createHelpers();
    // create internal panels
    AffectDefinition ad = AffectManager.sInterface.getDocumentManager().getAffectDefinition ();
    for (CharacterAffect characterAffectProfile: ad.getCharacterAffectList())
      if (fCharacterName.equals(characterAffectProfile.getName())) {
         System.out.println("fCharacterName:  "+fCharacterName);
         System.out.println("characterName:  "+characterName);
        fCharacterConfigPanel = new CharacterConfigPanel (characterName, characterAffectProfile);
        fCharacterAppraisalPanel = new CharacterAppraisalPanel (characterName, characterAffectProfile);
	fCharacterAffectCompPanel = new CharacterAffectCompPanel (characterName, characterAffectProfile);
      }

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
    fApplyButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    fApplyButton.setAlignmentY(Component.CENTER_ALIGNMENT);
    fApplyButton.setMinimumSize(bigButtonSize);
    fApplyButton.setPreferredSize(bigButtonSize);
    fApplyButton.setMaximumSize(bigButtonSize);
    fApplyButton.setActionCommand("apply");
    //fApplyButton.setEnabled(false);
    fApplyButton.addActionListener(this);
    buttonPanel.add(getFillerBox(0, 0, 5000, 0));
    buttonPanel.add(fApplyButton);
    JTabbedPane configTabs = new JTabbedPane(JTabbedPane.TOP);
    configTabs.setPreferredSize(new Dimension(600, 300));//tengfei
    configTabs.add("Personality", fCharacterConfigPanel);
    configTabs.add("Appraisal", fCharacterAppraisalPanel);
    configTabs.add("Computation", fCharacterAffectCompPanel);
    getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    getContentPane().add(configTabs);
    getContentPane().add(Box.createRigidArea(new Dimension(4, 4)));
    getContentPane().add(buttonPanel);
    pack();
  }

  /** Action Listner */
  public void actionPerformed(ActionEvent event) {
    if (event.getActionCommand().equals("apply")) {
      AffectDefinition ad = AffectManager.sInterface.getDocumentManager().getAffectDefinition ();
      for (CharacterAffect characterAffectProfile: ad.getCharacterAffectList())
        if (fCharacterName.equals(characterAffectProfile.getName())) {
          fCharacterConfigPanel.apply (characterAffectProfile);
          fCharacterAppraisalPanel.apply (characterAffectProfile);
          fCharacterAffectCompPanel.apply (characterAffectProfile);
        }
    }
  }

}