package de.affect.gui.simulation;

import java.lang.Math;

import java.awt.Container;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;

/**
 * A LayoutManager that treats components as circles and aligns them
 * along the largest possible circle that fits in the container.
 * @author Gernot Gebhard, 2004.
 */
class CircleLayout implements LayoutManager {
  // minimum size

  Dimension m_minimum = new Dimension(0, 0);

  // prefererred size
  Dimension m_preferred = new Dimension(0, 0);

  // radius
  double m_radius = 0;

  // diameter
  int m_diameter = 0;

  // offset
  int m_offset;

  /**
   * Constructor.
   * @param offset Additional radius.
   */
  CircleLayout(int offset) {
    m_offset = 2 * offset;
  }

  /**
   * Layout objects of container in a circle.
   * @param parent Parent container.
   */
  public void layoutContainer(Container parent) {
    // stuff we need
    Component[] components = parent.getComponents();
    Dimension dim = parent.getSize();
    int x = dim.width / 2, y = dim.height / 2;

    // adjust label diameter
    setDiameter(components);

    // align single object to circle center
    if (components.length == 1) {
      alignComponent(components[0], x, y);
    } // align more objects along circle border
    else if (components.length > 1) {
      setRadius(dim);
      int i = 0;
      for (Component comp : components) {
        double angle = ((((double) i++)) / ((double) components.length)) * 2 * Math.PI;
        alignComponent(comp, x + (int) (m_radius * Math.cos(angle)), y + (int) (m_radius * Math.sin(angle)));
      }
    }
  }

  /**
   * Compute minimum layout size.
   * @param parent Parent container.
   * @return Minimum layout size.
   */
  public Dimension minimumLayoutSize(Container parent) {
    return m_minimum;
  }

  /**
   * Compute preferred layout size.
   * @param parent Parent container.
   * @return Preferred layout size.
   */
  public Dimension preferredLayoutSize(Container parent) {
    return m_preferred;
  }

  /**
   * Add layout component.
   * This is not supported (yet).
   * @param name Component name.
   * @param comp The component.
   */
  public void addLayoutComponent(String name, Component comp) {
  }

  /**
   * Remove layout component.
   * This is not supported (yet).
   * @param comp The component.
   */
  public void removeLayoutComponent(Component comp) {
  }

  /**
   * Return maximum component diameter.
   * @param Component diameter.
   */
  public int diameter() {
    return m_diameter;
  }

  /**
   * Return maximum circle radius.
   * @param Circle radius.
   */
  public double radius() {
    return m_radius;
  }

  /**
   * Align single component.
   * @param comp The component that is to be aligned.
   * @param x x-coordinate of component center.
   * @param y y-coordinate of component center.
   */
  private void alignComponent(Component comp, int x, int y) {
    Dimension dim = comp.getPreferredSize();
    comp.setBounds(x - dim.width / 2, y - dim.height / 2, dim.width, dim.height);
  }

  /**	
   * Compute the maximum occuring diameter.
   * @param components Available components.
   */
  private void setDiameter(Component[] components) {
    m_diameter = 0;
    for (Component comp : components) {
      Dimension dim = comp.getPreferredSize();
      if (dim != null) {
        m_diameter = Math.max(Math.max(dim.width, dim.height), m_diameter);
      }
    }
    m_diameter += m_offset;
  }

  /**	
   * Compute the maximum possible radius, such that all objects are included nicely.
   * @param dim Available space.
   */
  private void setRadius(Dimension dim) {
    m_radius = ((double) (Math.min(dim.width, dim.height) - m_diameter)) / 2;
    m_radius = m_radius < 0 ? 0 : m_radius;
    m_preferred.setSize(2 * m_radius, 2 * m_radius);
  }
}
