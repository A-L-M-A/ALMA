/*
 * InteractionCirclePanel.java
 *
 * Copyright (c) 2004-2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui.simulation;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;

import static java.awt.RenderingHints.*;

/**
 * Panel for displaying the characters along a circle.
 * @author Gernot Gebhard, 2004-2005 (based on the conceptual work of Patrick Gebhard) 
 */
class InteractionCirclePanel extends JPanel
{
  // main panel
  private InteractionSimulationPanel m_panel;

  // menu stuff
  private InteractionPopupMenu m_menu;

  // used to make this baby thread safe
  private Semaphore m_lock = new Semaphore (1, true);

  // character stuff
  private InteractionCharacter m_source = null;
  private HashMap<String, InteractionCharacter> m_characters = new HashMap<String, InteractionCharacter> ();

  // gui stuff
  private CircleLayout m_layout;
  private Color c_source, c_direct, c_indirect, c_idle;
  private BasicStroke s_thin, s_thick;
  private Timer m_timer = new Timer (true);
  private TimerTask m_timeout = null;

  /**
   * Constructor.
   * @param parent Parent panel containing the circle panel.
   * @param source Color for sources of interactions.
   * @param direct Color for directly affected characters.
   * @param indirect Color for indirectly affected characters.
   * @param idle Color for idle characters.
   * @param thin Size of thin lines.
   * @param thick Size of thick lines.
   * @param offset Offset for circle label radius.
   */
  public InteractionCirclePanel (InteractionSimulationPanel parent, Color source, Color direct, Color indirect,
                                 Color idle, int thin, int thick, int offset)
  {
    // layout
    setLayout (m_layout = new CircleLayout(offset));

    // set stuff
    c_source   = source;
    c_direct   = direct;
    c_indirect = indirect;
    c_idle     = idle;
    s_thin     = new BasicStroke (thin);
    s_thick    = new BasicStroke (thick);

    // menu
    m_panel = parent;
    m_menu = new InteractionPopupMenu ();
  }

  /**
   * Add new character.
   * @param name Character name.
   * @param basic Basic types.
   * @param act Act types.
   * @param emotion Emotion types.
   * @param mood Mood types.
   */
  public void addCharacter (String name, String[] basic, String[] act, String[] emotion, String[] mood)
  {
    // lock
    m_lock.acquireUninterruptibly ();

    // new character
    InteractionCharacter character = new InteractionCharacter (name, basic, act, emotion, mood, c_idle);
    character.addMouseListener (m_menu);
    m_characters.put (name, character);

    // add, layout and paint
    add (character);
    doLayout ();
    repaint ();

    // done
    m_lock.release ();
  }

  /**
   * Remove character.
   * @param name Character to remove.
   */
  public void removeCharacter (String name)
  {
    // lock
    m_lock.acquireUninterruptibly ();

    // remove, layout and paint
    InteractionCharacter character = m_characters.remove (name);
    if (character != null)
    {
      if (character == m_source)
        m_source = null;
      remove (character);
      doLayout ();
      repaint ();
    }

    // done
    m_lock.release ();
  }

  /**
   * Clear circle panel
   */
  public void clear ()
  {
    // lock
    m_lock.acquireUninterruptibly ();

    // dispose timeout
    if (m_timeout != null)
      m_timeout.cancel ();

    // clear and repaint
    for (InteractionCharacter character: m_characters.values())
      remove (character);
    m_characters.clear ();
    m_source = null;
    doLayout ();
    repaint ();

    // unlock
    m_lock.release ();
  }

  /**
   * Construct character name list.
   * @param exclude Exclude character with this name.
   * @return Characterlist.
   */
  public String[] characters (String exclude)
  {
    // safely access characters
    m_lock.acquireUninterruptibly ();

    // copy character name list
    int i = 0;
    String[] characters = new String[m_characters.size()-(m_characters.containsKey(exclude)?1:0)];
    for (String character: m_characters.keySet())
      if (!character.equals(exclude))
	characters[i++] = character;

    m_lock.release ();
    return characters;
  }

  /**
   * Highlight relationships and activities.
   * @param source Source character.
   * @param direct Directly affected characters.
   * @param indirect Indirectly affected characters.
   * @param timeout Timeout before resetting display.
   */
  public void update (String source, String[] direct, String[] indirect, long timeout)
  {
    // kill previous task
    if (m_timeout != null)
      m_timeout.cancel ();

    // lock
    m_lock.acquireUninterruptibly ();

    // reset characters first
    for (InteractionCharacter character: m_characters.values())
      character.setColor (c_idle);

    // source character
    InteractionCharacter character = m_characters.get (source);
    if (character != null)
    {
      m_source = character;
      m_source.setColor (c_source);
    }

    // directly affected characters
    if (direct != null)
      for (String name: direct)
      {
        character = m_characters.get (name);
        if (character != null)
          character.setColor (c_direct);
      }

    // indirectly affected characters
    if (indirect != null)
      for (String name: indirect)
      {
        character = m_characters.get (name);
        if (character != null)
          character.setColor (c_indirect);
      }

    // activate timeout
    m_timeout = new CircleTask ();
    m_timer.schedule (m_timeout, timeout);

    // draw
    repaint ();

    // done
    m_lock.release ();
  }

  /**
   * Draw the interaction simulation panel.
   * @param graphics Graphics context.
   */
  public void paint (Graphics graphics)
  {
    // lock
    m_lock.acquireUninterruptibly ();

    // do some cool stuff
    Graphics2D g = (Graphics2D)graphics;
    g.setRenderingHint (KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);

    // clear
    g.setColor (Color.LIGHT_GRAY);
    g.fillRect (0, 0, getWidth(), getHeight());

    // draw circle
    DrawTools.drawCircle (g, getWidth()/2, getHeight()/2, (int)m_layout.radius(), (int)s_thin.getLineWidth(), Color.WHITE, c_idle.darker());

    // draw idle lines
    InteractionCharacter[] characters = m_characters.values().toArray (new InteractionCharacter[0]);

    g.setStroke (s_thin);
    for (int i = 0; i < characters.length; ++i)
      if (characters[i] != m_source)
	for (int j = i+1; j < characters.length; ++j)
	  if (characters[j] != m_source)
	    characters[i].paintLine (g, characters[j], c_idle.darker());

    // then (possible) active ones
    if (m_source != null)
      for (InteractionCharacter target: characters)
        if (target != m_source)
          if (target.color() == c_idle)
          {
            g.setStroke (s_thin);
            m_source.paintLine (g, target);
          }
          else
          {
            g.setStroke (s_thick);
            m_source.paintArrow (g, target);
          }

    // draw characters
    for (InteractionCharacter character: characters)
    {
      character.setThickness ((int)(character == m_source?s_thick.getLineWidth():s_thin.getLineWidth()));
      character.setDiameter (m_layout.diameter());
      character.paint (g);
    }

    // done
    m_lock.release ();
  }

  /**
   * En-/Disable menu.
   * @param status New menu enabledness status.
   */
  public void setMenuEnabled (boolean status)
  {
    m_menu.setEnabled (status);
  }

  /**
   * Access character.
   * @param name Character name.
   * @return Character.
   */
  InteractionCharacter character (String name)
  {
    return m_characters.get (name);
  }

  /**
   * Task to reset all colors.
   */
  class CircleTask extends TimerTask
  {
    /**
     * Reset color to origin and repaint.
     */
    public void run ()
    {
      // lock
      m_lock.acquireUninterruptibly ();

      // reset colors
      for (InteractionCharacter character: m_characters.values())
        character.setColor (c_idle);

      // reset
      m_timeout = null;
      m_source = null;
      repaint ();

      // done
      m_lock.release ();
    }
  }

  /**
   * Combined MouseListener and PopupMenu for InteractionCharacters.
   */
  class InteractionPopupMenu extends JPopupMenu implements ActionListener, MouseListener
  {
    // source character
    private InteractionCharacter m_source;

    /**
     * Init interaction popup menu.
     */
    InteractionPopupMenu ()
    {
      add("Basic").addActionListener (this);
      add("Act").addActionListener (this);
      add("Emotion").addActionListener (this);
      add("Mood").addActionListener (this);
      add(new JSeparator());
      add("Context").addActionListener (this);
      add("Reset Character").addActionListener (this);
    }

    /**
     * Process mouse pressed event.
     * Displays menu if it is a popup trigger.
     * @param event Mouse event.
     */
    public void mousePressed (MouseEvent event)
    {
      if (isEnabled() && isPopupTrigger(event))
      {
        m_source = ((InteractionCharacter)event.getSource());
        show (event.getComponent(), event.getX(), event.getY());
      }
    }

    /**
     * Process mouse pressed event.
     * Displays menu if it is a popup trigger.
     * @param event Mouse event.
     */
    public void mouseReleased (MouseEvent event)
    {
      if (isEnabled() && isPopupTrigger(event))
      {
        m_source = ((InteractionCharacter)event.getSource());
        show (event.getComponent(), event.getX(), event.getY());
      }
    }

    /**
     * Menu item has been clicked.
     * @param event Event source.
     */
    public void actionPerformed (ActionEvent event)
    {
      m_panel.showEditDialog (m_source, event.getActionCommand(), null);
    }

    // not needed here
    public void mouseExited (MouseEvent event) {}
    public void mouseClicked (MouseEvent event) {}
    public void mouseEntered (MouseEvent event) {}
  }
}

/**
 * Some helpers for drawing on a graphics context.
 */
class DrawTools
{
  /**
   * Draw a circle.
   * @param g Graphics context.
   * @param x x-coordinate of circle center.
   * @param y y-coordinate of circle center.
   * @param radius Circle radius.
   * @param thickness Circle thickness.
   * @param inner Inner circle color
   * @param outer Outer circle color
   */
  static public void drawCircle (Graphics g, int x, int y, int radius, int thickness, Color inner, Color outer)
  {
    // outer circle
    int diameter = 2*radius;
    g.setColor (outer);
    g.fillArc (x-radius, y-radius, diameter, diameter, 0, 360);

    // inner circle
    diameter -= 2*thickness;
    g.setColor (inner);
    g.fillArc (x-radius+thickness, y-radius+thickness, diameter, diameter, 0, 360);
  }

  /**
   * Draw arrow.
   * @param g Graphics context.
   * @param xStart x-coordinate of start point.
   * @param yStart y-coordinate of start point.
   * @param x x-coordinate of end point.
   * @param y y-coordinate of end point.
   * @param offset Offset to substract from arrow line.
   */
  public static void drawArrow (Graphics2D g, int xStart, int yStart, int x, int y, int offset)
  {
    // compute angle, adjust target coods and draw line
    double alpha = Math.atan2 (xStart-x, yStart-y);
    x += xCor (offset+(int)(((BasicStroke)g.getStroke()).getLineWidth()), alpha);
    y += yCor (offset+(int)(((BasicStroke)g.getStroke()).getLineWidth()), alpha);
    g.drawLine (xStart, yStart, x, y);

    // draw arrow head
    Polygon head = new Polygon ();
    head.addPoint (x, y);
    head.addPoint (x+xCor(11, alpha+0.5), y+yCor(11, alpha+0.5));
    head.addPoint (x+xCor(5, alpha), y+yCor(5, alpha));
    head.addPoint (x+xCor(11, alpha-0.5), y+yCor(11, alpha-0.5));
    head.addPoint (x, y);
    g.drawPolygon (head);
    g.fillPolygon (head);
  }

  /**
   * Compute adjacent of triangle with hyptenose c and angle alpha.
   * @param c Hypotenuse.
   * @param alpha Angle.
   * @return Adjacent.
   */
  private static int yCor (int c, double alpha)
  {
    return (int)(c*Math.cos(alpha));
  }

  /**
   * Compute opposite of triangle with hyptenose c and angle alpha.
   * @param c Hypotenuse.
   * @param alpha Angle.
   * @return Opposite.
   */
  private static int xCor (int c, double alpha)
  {
    return (int)(c*Math.sin(alpha));
  }
}
