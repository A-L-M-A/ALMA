/*
 * EmotionDecayPanel.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

// utils
import java.util.concurrent.Semaphore;

// good old awt stuff
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

// swing
import javax.swing.JPanel;

// emotion decay stuff
import de.affect.emotion.Emotion;
import de.affect.emotion.EmotionType;
import de.affect.compute.DecayFunction;

// some statics
import static java.awt.RenderingHints.*;

/**
 * Displays a emotion decay function.
 * @author Gernot Gebhard, 2005 (based on the conceptual work of Patrick Gebhard) 
 */
public class EmotionDecayPanel extends JPanel
{
  // decay function
  private DecayFunction m_decay;

  // line color
  private Color m_color;

  /**
   * Init emotion decay panel.
   * @param decay Decay function.
   * @param color Curve color.
   */
  EmotionDecayPanel (DecayFunction decay, Color color)
  {
    m_decay = decay;
    m_color = color;
  }

  /**
   * Set decay function.
   * @param decay New decay function.
   */
  void setDecayFunction (DecayFunction decay)
  {
    m_decay = decay;
    repaint ();

  }

  /**
   * Set decay steps.
   * @param steps New decay steps.
   */
  void setDecaySteps (int steps)
  {
    m_decay.init (steps);
    repaint ();
  }

  /**
   * Draw decay function.
   * @param g Graphics context.
   */
  public synchronized void paint (Graphics g)
  {
    // sizes
    int width = getWidth(), height = getHeight(), x, y;

    // clear
    g.setColor (Color.WHITE);
    g.fillRect (0, 0, width, height);

    // draw axis
    g.setColor (Color.BLACK);
    g.drawRect (0, 0, width-1, height-1);
    g.drawLine (x = (int)(0.1*width), y = (int)(0.05*height), x, height-y);
    g.drawLine (x = width-x, (int)(0.90*height), x, height-y);
    g.drawLine (x = (int)(0.05*width), y = (int)(0.90*height), width-x, y);
    g.drawLine (x, y = height-y, 2*x, y);

    // draw curve
    int steps = m_decay.decaySteps ();
    double base_x = 0.1*width, delta_x = (0.8*width)/steps, previous;
    Emotion current = new Emotion (EmotionType.Undefined, 1.0, 0.0, this);
    g.setColor (m_color);
    for (int i = 0; i < steps; ++i)
    {
      previous = current.getIntensity ();
      m_decay.decay (current);
      double pos = (0.1+0.8*(1.0-previous))*height;
      g.drawLine ((int)base_x, (int)pos, (int)base_x, (int)pos);
      base_x += delta_x;

      /*g.drawLine ((int)base_x, (int)((0.1+0.8*(1.0-previous))*height),
        (int)(base_x = base_x+delta_x), (int)((0.1+0.8*(1.0-current.getIntensity()))*height));*/
    }
  }
}
