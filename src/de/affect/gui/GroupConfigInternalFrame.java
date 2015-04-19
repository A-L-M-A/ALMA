/*
 * GroupConfigInternalFrame.java
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

public class GroupConfigInternalFrame extends AlmaInternalFrame implements ActionListener {

  private JButton fApplyButton = new JButton ("Apply");
  //private GroupConfigPanel fGroupConfigPanel = null;
  private GroupAppraisalPanel fGroupAppraisalPanel = null;
  //private GroupAffectCompPanel fGroupAffectCompPanel = null;
  private GroupCharactersPanel fGroupCharactersPanel = null;

  private String fGroupName;

  public GroupConfigInternalFrame(String groupName) {
    super(groupName + " Configuration", groupName + "Configuration", 
	  new Dimension(600, 400), true, true, true, true);
    fGroupName = groupName;
    createHelpers();
    // create internal panels
    AffectDefinition ad = AffectManager.sInterface.getDocumentManager().getAffectDefinition ();
    for (GroupAffect groupAffectProfile : ad.getGroupAffectList())
      if (fGroupName.equals(groupAffectProfile.getName())) {
        fGroupAppraisalPanel = new GroupAppraisalPanel (fGroupName, groupAffectProfile);
	//fGroupAffectCompPanel = new GroupAffectCompPanel(fGroupName, groupAffectProfile);
      }
    fGroupCharactersPanel = new GroupCharactersPanel (AffectManager.sInterface.getGroupByName(groupName), AffectManager.sInterface.getCharacters());

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
    configTabs.add("Appraisal", fGroupAppraisalPanel);
    //configTabs.add("Computation", fGroupAffectCompPanel);
    configTabs.add("Characters", fGroupCharactersPanel);
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
      for (GroupAffect groupAffectProfile: ad.getGroupAffectList())
        if (fGroupName.equals(groupAffectProfile.getName())) {
          fGroupAppraisalPanel.apply (groupAffectProfile);
          //fGroupAffectCompPanel.apply (groupAffectProfile);
          fGroupCharactersPanel.apply (groupAffectProfile);
        }
    }
  }

}