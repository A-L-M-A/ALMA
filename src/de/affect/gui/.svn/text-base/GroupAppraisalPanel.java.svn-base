/*
 * GroupAppraisalPanel.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;
import java.util.ArrayList;

import java.awt.dnd.*;
import java.awt.datatransfer.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ListCellRenderer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import de.affect.manage.AppraisalRules;
import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;
import de.affect.manage.GroupManager;

import de.affect.emotion.EmotionType;
import de.affect.mood.MoodType;

import de.affect.appraisal.AppraisalVariables;
import de.affect.appraisal.eec.Desirability;
import de.affect.appraisal.eec.Praiseworthiness;
import de.affect.appraisal.eec.Appealingness;
import de.affect.appraisal.eec.Likelihood;
import de.affect.appraisal.eec.Liking;
import de.affect.appraisal.eec.Realization;
import de.affect.appraisal.eec.Agency;

import de.affect.xml.MoodWord;
import de.affect.xml.EmotionName;
import de.affect.xml.AppraisalTag;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.*;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.*;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.*;

import static de.affect.gui.AlmaGUI.sDefaultTextFont;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.AlmaGUI.sBORDERLINE;
import static de.affect.manage.AppraisalRuleReader.readAppraisalRules;

import static javax.swing.BoxLayout.X_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import static javax.swing.JTabbedPane.RIGHT;

import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createTitledBorder;

/**
 * ConfigPanel for setting up appraisals.
 * @author Gernot Gebhard (based on conceptual work of Patrick Gebhard)
 */
public class GroupAppraisalPanel extends JPanel
{
  // store basics here
  AppraisalAct m_basic;

  //Group
  GroupManager fGroup = null;

  // store act lists here
  ArrayList<AppraisalActList> m_lists = new ArrayList<AppraisalActList> ();

  // affect manager interface
  private static AffectManager.InterfaceHolder m_manager = AffectManager.sInterface;

  /**
   * Init GroupAppraisalPanel.
   * @param groupName Name of the character.
   * @param groupAffectProfile The profile containing the character's appraisal rules.
   */
  public GroupAppraisalPanel (String groupName, GroupAffect groupAffectProfile)
  {
    // init
    setLayout (new BoxLayout (this, X_AXIS));

    // access appraisal rules
    fGroup = m_manager.getGroupByName(groupName);
    AppraisalRules rules = fGroup.getAppraisalRules ();
    AppraisalRules subrules = rules.getAppraisalRulesByType (groupName, "Basic");

    // add all basic appraisal tags
    m_basic = new AppraisalAct ("Basic", groupName, false);
    m_basic.setPreferredSize (new Dimension(275, 400));
    for (String key: subrules.getKeys(groupName))
      for (AppraisalVariables variables: subrules.getAppraisalVariables(groupName, key))
        m_basic.addAppraisalBasicTag (variables);
    add (m_basic);

    // build performer list
    CharacterManager[] characters = fGroup.getCharacters ();
    String[] performers = new String[characters.length];
    for (int i = 0; i < characters.length; ++i)
        performers[i] = characters[i].getName();

    // build emotion and mood type list
    String[] emotions = EmotionType.getNames ();
    String[] moods = MoodType.getNames ();

    // place the rest into tabbed pane
    JTabbedPane tab = new JTabbedPane (RIGHT);

    // indirectact
    AppraisalActList acts = new AppraisalActList ("IndirectAct", rules, groupName, performers, null, "Type: ");
    m_lists.add (acts);
    tab.add (acts.m_type, acts);

    // indirectemotion
    acts = new AppraisalActList ("IndirectEmotion", rules, groupName, performers, emotions, "Emotion: ");
    m_lists.add (acts);
    tab.add (acts.m_type, acts);

    // indirectmood
    acts = new AppraisalActList ("IndirectMood", rules, groupName, performers, moods, "Mood: ");
    m_lists.add (acts);
    tab.add (acts.m_type, acts);

    // done
    tab.setPreferredSize (new Dimension(400, 400));
    add (tab);
  }

  /**
   * Apply appraisal rules to given group affect profile.
   * @param groupAffectProfile The group profile to modify.
   */
  public void apply (GroupAffect groupAffectProfile)
  {
    Appraisal appraisal = Appraisal.Factory.newInstance ();

    // apply basic rules
    m_basic.apply (null, appraisal.addNewBasic());

    // apply other rules
    for (int i = 0; i < m_lists.size(); ++i)
      m_lists.get(i).apply (appraisal);

    // done
    groupAffectProfile.setAppraisal(appraisal);

    // update appraisal rules
    try
    {
      GroupManager group = AffectManager.sInterface.getGroupByName(groupAffectProfile.getName());
      AppraisalRules rules = readAppraisalRules(group, appraisal);
      group.setAppraisalRules(rules);
    }
    catch (Exception e)
    {
      e.printStackTrace ();
    }
  }
}

