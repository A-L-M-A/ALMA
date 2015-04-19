/*
 * GroupCharactersPanel.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

// utils
import java.util.Vector;

// awt stuff
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// swing stuff
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

// manage
import de.affect.manage.GroupManager;
import de.affect.manage.CharacterManager;

// group affect
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect;

// some statics
import static javax.swing.BoxLayout.X_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import static javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION;

/**
 * The group characters panel displays available
 * and used characters of a group.
 */
public class GroupCharactersPanel extends JPanel implements ActionListener
{
  // border width
  private static final int WIDTH = 2;

  // the associated group (if any)
  private GroupManager m_group;

  // available characters list
  private JList m_available_list = new JList ();

  // used characters list
  private JList m_used_list = new JList ();

  // available characters
  private Vector<String> m_available = new Vector<String> ();

  // used characters
  private Vector<String> m_used = new Vector<String> ();

  // add button
  private JButton m_add = new JButton (">>");

  // remove button
  private JButton m_remove = new JButton ("<<");

  /**
   * Init group characters panel.
   * @param group Edited group (or NULL if not yet created).
   * @param characters Available characters.
   */
  GroupCharactersPanel (GroupManager group, CharacterManager[] characters)
  {
    // insert available characters
    for (CharacterManager character: characters)
    {
      if ((group != null) && group.hasCharacter (character))
        m_used.add (character.getName());
      else
        m_available.add (character.getName());
    }
    m_used_list.setSelectionMode (SINGLE_INTERVAL_SELECTION);
    m_used_list.setListData (m_used);
    m_available_list.setSelectionMode (SINGLE_INTERVAL_SELECTION);
    m_available_list.setListData (m_available);

    // layout
    setLayout (new BoxLayout(this, X_AXIS));

    // build available characters panel
    JPanel panel = new JPanel ();
    JLabel label;
    JScrollPane pane;
    panel.setLayout (new BoxLayout(panel, Y_AXIS));
    panel.setBorder (BorderFactory.createEmptyBorder(WIDTH, WIDTH, WIDTH, WIDTH));
    panel.add (label = new JLabel ("Available Characters:"));
    panel.add (pane = new JScrollPane (m_available_list));
    label.setAlignmentX (LEFT_ALIGNMENT);
    pane.setAlignmentX (LEFT_ALIGNMENT);
    add (panel);

    // build button panel
    panel = new JPanel ();
    panel.setLayout (new BoxLayout(panel, Y_AXIS));
    panel.setBorder (BorderFactory.createEmptyBorder(WIDTH, WIDTH, WIDTH, WIDTH));
    panel.add (m_add);
    panel.add (m_remove);
    m_add.addActionListener (this);
    m_add.setEnabled (m_available.size() > 0);
    m_remove.addActionListener (this);
    m_remove.setEnabled (m_used.size() > 2);
    add (panel);

    // build used characters panel
    panel = new JPanel ();
    panel.setLayout (new BoxLayout(panel, Y_AXIS));
    panel.setBorder (BorderFactory.createEmptyBorder(WIDTH, WIDTH, WIDTH, WIDTH));
    panel.add (label = new JLabel ("Used Characters:"));
    panel.add (pane = new JScrollPane (m_used_list));
    label.setAlignmentX (LEFT_ALIGNMENT);
    pane.setAlignmentX (LEFT_ALIGNMENT);
    add (panel);
  }

  /**
   * Apply changes to given group.
   * @param groupAffectProfile Group that is to be modified.
   */
  void apply (GroupAffect groupAffectProfile)
  {
    // modify affect profile
    // TODO Change group manager and thus influence the runtime behaviour
    groupAffectProfile.setCharacters (characters());
  }

  /**
   * Build used characters list.
   * @return List of used characters.
   */
  String characters ()
  {
    String characters = "";
    for (int i = 0; i < m_used.size(); ++i)
    {
      characters += m_used.get (i);
      if (i < m_used.size()-1)
        characters += ",";
    }
    return characters;
  }

  /**
   * Access the amount of used characters.
   * @return The amount of used characters.
   */
  final int usedCharacters () { return m_used.size(); }

  /**
   * Button was clicked.
   * @param event Current event.
   */
  public void actionPerformed (ActionEvent event)
  {
    // prepare
    Object source = event.getSource ();

    // add character
    if (source == m_add)
    {
      // get selection range
      int min = m_available_list.getMinSelectionIndex();
      int max = m_available_list.getMaxSelectionIndex();
      int index = m_used.size();

      // apply selection
      for (int i = max; i >= min; --i)
      {
        m_used.add (index, m_available.get(i));
        m_available.remove (i);
      }
      m_used_list.setListData (m_used);
      m_available_list.setListData (m_available);
    }

    // remove character
    else
    {
      // get selection range
      int min = m_used_list.getMinSelectionIndex();
      int max = m_used_list.getMaxSelectionIndex();
      int index = m_available.size();

      // apply selection
      for (int i = max; i >= min; --i)
      {
        m_available.add (index, m_used.get(i));
        m_used.remove (i);
      }
      m_used_list.setListData (m_used);
      m_available_list.setListData (m_available);
    }

    // update buttons
    m_add.setEnabled (m_available.size() > 0);
    m_remove.setEnabled (m_used.size() > 0);
  }
}
