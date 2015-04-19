/*
 * GroupConfigurationDialog.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

// utils
import java.util.Vector;

// awt stuff
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// swing
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

// manage
import de.affect.manage.CharacterManager;

// helpers
import static de.affect.gui.Helpers.getCenter;

// some statics
import static javax.swing.BoxLayout.X_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 * The group creation dialog which uses the group characters panel for displaying
 * the used characters.
 * @author Gernot Gebhard, 2005 (based on the conceptual work of Patrick Gebhard) 
 */
public class GroupCreationDialog extends JDialog implements ActionListener
{
  // border width
  private static final int WIDTH = 2;

  // group name
  private JTextField m_name = new JTextField ();

  // group characters
  private GroupCharactersPanel m_characters;

  // ok button
  private JButton m_ok = new JButton ("OK");

  // cancel button
  private JButton m_cancel = new JButton ("Cancel");

  // dialog status
  private boolean m_status = false;

  /**
   * Create a new group configuration dialog.
   * @param parent Parent frame.
   * @param characters Available characters.
   */
  GroupCreationDialog (JFrame parent, CharacterManager[] characters)
  {
    // init
    super (parent, "New Group");
    getContentPane().setLayout (new BoxLayout(getContentPane(), Y_AXIS));
    setDefaultCloseOperation (HIDE_ON_CLOSE);
    setAlwaysOnTop (true);
    setResizable (false);
    setModal (true);

    // add name panel
    JPanel panel = new JPanel ();
    JLabel label;
    panel.setLayout (new BoxLayout(panel, Y_AXIS));
    panel.setBorder (BorderFactory.createEmptyBorder(WIDTH, WIDTH, WIDTH, WIDTH));
    panel.add (label = new JLabel("Name:"));
    panel.add (m_name);
    label.setAlignmentX (LEFT_ALIGNMENT);
    m_name.setAlignmentX (LEFT_ALIGNMENT);
    panel.setAlignmentX (LEFT_ALIGNMENT);
    add (panel);

    // add group characters panel
    add (m_characters = new GroupCharactersPanel (null, characters));
    m_characters.setAlignmentX (LEFT_ALIGNMENT);

    // add buttons
    panel = new JPanel ();
    panel.setLayout (new BoxLayout(panel, X_AXIS));
    panel.add (Box.createGlue());
    panel.add (m_ok);
    panel.add (m_cancel);
    m_ok.addActionListener (this);
    m_cancel.addActionListener (this);
    panel.setAlignmentX (LEFT_ALIGNMENT);
    add (panel);

    // size and position
    Dimension size = getPreferredSize ();
    if (size == null)
      size = new Dimension (400, 200);
    setSize (size);
    setLocation (getCenter ((int)size.getWidth(), (int)size.getHeight()));
  }

  /**
   * Get status.
   */
  final boolean status () { return m_status; }

  /**
   * Access group name.
   * @return Group name.
   */
  final String name () { return m_name.getText (); }

  /**
   * Access the list of used characters.
   * @return Used characters.
   */
  final String characters () { return m_characters.characters (); }

  /**
   * Access the amount of used characters.
   * @return The amount of used characters.
   */
  final int usedCharacters () { return m_characters.usedCharacters (); }

  /**
   * Button was clicked.
   * @param event Current event.
   */
  public void actionPerformed (ActionEvent event)
  {
    m_status = (event.getSource() == m_ok);
    setVisible (false);
  }
}
