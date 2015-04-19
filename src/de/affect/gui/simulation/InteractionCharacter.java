package de.affect.gui.simulation;

import java.lang.Math;
import java.util.Arrays;
import java.util.HashMap;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

/**
 * Interaction character.
 * This widget is a container for a character that is capable to
 * interact with other characters.
 * @author Gernot Gebhard, 2004 (based on conceptual work of Patrick Gebhard).
 */
class InteractionCharacter extends JLabel
{
  // interaction types
  private HashMap<String, String[]> m_types = new HashMap<String, String[]> ();

  // color
  private Color m_color;

  // circle center coordinates
  private int m_x = 0;
  private int m_y = 0;

  // circle diameter
  private int m_diameter = 0;

  // circle thickness
  private int m_thickness = 0;

  /**
   * Constructor.
   * @param name Character name.
   * @param basic Basic types.
   * @param act Act types.
   * @param emotion Emotion types.
   * @param mood Mood types.
   * @param c Initial color.
   */
  InteractionCharacter (String name, String[] basic, String[] act, String[] emotion, String[] mood, Color c)
  {
    super (name);

    // pre-sort arrays
    Arrays.sort (basic);
    Arrays.sort (act);
    Arrays.sort (emotion);
    Arrays.sort (mood);

    // types
    m_types.put ("Basic", basic);
    m_types.put ("Act", act);
    m_types.put ("Emotion", emotion);
    m_types.put ("Mood", mood);

    // color
    m_color = c;
  }

  /**
   * Draw circle label.
   * @param g Graphics context.
   */
  public void paint (Graphics g)
  {
    // draw circle
    DrawTools.drawCircle (g, m_x, m_y, m_diameter/2, m_thickness, m_color, m_color.darker());

    // draw label
    g.translate (getX(), getY());
    super.paint (g);
    g.translate (-getX(), -getY());
  }

  /**
   * Draw arrow from this character to another.
   * @param g Graphics context.
   * @param target Target character.
   */
  public void paintArrow (Graphics2D g, InteractionCharacter target)
  {
    g.setColor (target.m_color.darker());
    DrawTools.drawArrow (g, m_x, m_y, target.m_x, target.m_y, target.m_diameter/2);
  }

  /**
   * Draw interaction line to other label.
   * @param g The graphics context.
   * @param target Target label.
   */
  public void paintLine (Graphics g, InteractionCharacter target)
  {
    paintLine (g, target, target.m_color.darker());
  }

  /**
   * Draw line to other label.
   * @param g The graphics context.
   * @param target Target label.
   */
  public void paintLine (Graphics g, InteractionCharacter target, Color c)
  {
    g.setColor (c);
    g.drawLine (m_x, m_y, target.m_x, target.m_y);
  }

  /**
   * Get type list.
   * @param type Wanted type.
   * @return List with possibel types.
   */
  public String[] type (String type)
  {
    return m_types.get (type);
  }

  /**
   * Get circle color.
   * @return Circle color.
   */
  public Color color ()
  {
    return m_color;
  }

  /**
   * Set circle color.
   * @param c New color.
   */
  public void setColor (Color c)
  {
    m_color = c;
  }

  /**
   * Set circle diameter.
   * @param diameter New diameter.
   */
  public void setDiameter (int diameter)
  {
    m_diameter = diameter;
  }

  /**
   * Set circle thickness.
   * @param thickness New thickness.
   */
  public void setThickness (int thickness)
  {
    m_thickness = thickness;
  }

  /**
   * Set label bounds.
   * @param x x-coordinate.
   * @param y y-coordinate.
   * @param width Label width.
   * @param height Label height.
   */
  public void setBounds (int x, int y, int width, int height)
  {
    super.setBounds (x, y, width, height);

    m_x = x+width/2;
    m_y = y+height/2;
  }

  /**
   * Check if point is included in Label.
   * @param x x-coordinate.
   * @param y y-coordinate.
   * @return True if point is contained, false else.
   */
  public boolean contains (int x, int y)
  {
    return (int)Math.sqrt(Math.pow(x-getWidth()/2, 2)+Math.pow(y-getHeight()/2, 2)) <= m_diameter/2;
  }
}
