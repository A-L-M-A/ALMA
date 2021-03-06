/*
 * Helpers.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.util.Dictionary;
import java.util.Hashtable;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;

public class Helpers {

  /** common dimensions */
  public final static Dimension bigDescriptionsSize = new Dimension(266, 24);
  public final static Dimension largeDescriptionsSize = new Dimension(140, 24);
  public final static Dimension mediumDescriptionsSize = new Dimension(90, 24);
  public final static Dimension smallerDescriptionsSize = new Dimension(65, 24);
  public final static Dimension smallDescriptionsSize = new Dimension(45, 24);
  public final static Dimension smallButtonSize = new Dimension(60, 24);
  public final static Dimension mediumButtonSize = new Dimension(90, 24);
  public final static Dimension bigButtonSize = new Dimension(120, 24);
  public final static Dimension hugeButtonSize = new Dimension(200, 24);

  /** labels */
  public static Dictionary<Integer, JLabel> signumLabels = new Hashtable<Integer, JLabel>();
  public static Dictionary<Integer, JLabel> minuteLabels = new Hashtable<Integer, JLabel>();	
  public static Dictionary<Integer, JLabel> decadeMinuteLabels = new Hashtable<Integer, JLabel>();	
  public static Dictionary<Integer, JLabel> milliSecondsLabel = new Hashtable<Integer, JLabel>();
  public static Dictionary<Integer, JLabel> smallNumberConfigLabel = new Hashtable<Integer, JLabel>();
  public static Dictionary<Integer, JLabel> decayTimeLabels = new Hashtable<Integer, JLabel>();
  /** The one and only instance */
  private static Helpers instance = null;

  protected Helpers() { // defeat instanciation	
    signumLabels.put(new Integer(-10), new JLabel("-1"));
    signumLabels.put(new Integer(0), new JLabel("0"));
    signumLabels.put(new Integer(10), new JLabel("1"));

    minuteLabels.put(new Integer(0), new JLabel("disabled"));
    minuteLabels.put(new Integer(60), new JLabel("1min"));
    minuteLabels.put(new Integer(120), new JLabel("2min"));
    minuteLabels.put(new Integer(180), new JLabel("3min"));
    minuteLabels.put(new Integer(240), new JLabel("4min"));
    minuteLabels.put(new Integer(300), new JLabel("5min"));
    minuteLabels.put(new Integer(360), new JLabel("6min"));
    minuteLabels.put(new Integer(420), new JLabel("7min"));
    minuteLabels.put(new Integer(480), new JLabel("8min"));
    minuteLabels.put(new Integer(540), new JLabel("9min"));
    minuteLabels.put(new Integer(600), new JLabel("10min"));
    minuteLabels.put(new Integer(660), new JLabel("11min"));
    minuteLabels.put(new Integer(720), new JLabel("12min"));
    minuteLabels.put(new Integer(780), new JLabel("13min"));
    minuteLabels.put(new Integer(840), new JLabel("14min"));
    minuteLabels.put(new Integer(900), new JLabel("15min"));
    minuteLabels.put(new Integer(960), new JLabel("16min"));
    minuteLabels.put(new Integer(1020), new JLabel("17min"));
    minuteLabels.put(new Integer(1080), new JLabel("18min"));
    minuteLabels.put(new Integer(1140), new JLabel("19min"));
    minuteLabels.put(new Integer(1200), new JLabel("20min"));

    decadeMinuteLabels.put(new Integer(0), new JLabel("disabled"));
    decadeMinuteLabels.put(new Integer(600), new JLabel("10min"));
    decadeMinuteLabels.put(new Integer(1200), new JLabel("20min"));
    decadeMinuteLabels.put(new Integer(1800), new JLabel("30min"));
    decadeMinuteLabels.put(new Integer(2400), new JLabel("40min"));
    decadeMinuteLabels.put(new Integer(3000), new JLabel("50min"));
    decadeMinuteLabels.put(new Integer(3600), new JLabel("1h"));

    milliSecondsLabel.put(new Integer(10), new JLabel("10ms"));
    milliSecondsLabel.put(new Integer(250), new JLabel("250ms"));
    milliSecondsLabel.put(new Integer(500), new JLabel("500ms"));
    milliSecondsLabel.put(new Integer(750), new JLabel("750ms"));
    milliSecondsLabel.put(new Integer(1000), new JLabel("1000ms"));

    smallNumberConfigLabel.put(new Integer(0), new JLabel("0.0"));
    smallNumberConfigLabel.put(new Integer(10), new JLabel("0.1"));
    smallNumberConfigLabel.put(new Integer(20), new JLabel("0.2"));
    smallNumberConfigLabel.put(new Integer(30), new JLabel("0.3"));
    smallNumberConfigLabel.put(new Integer(40), new JLabel("0.4"));
    smallNumberConfigLabel.put(new Integer(50), new JLabel("0.5"));
    smallNumberConfigLabel.put(new Integer(60), new JLabel("0.6"));
    smallNumberConfigLabel.put(new Integer(70), new JLabel("0.7"));
    smallNumberConfigLabel.put(new Integer(80), new JLabel("0.8"));
    smallNumberConfigLabel.put(new Integer(90), new JLabel("0.9"));
    smallNumberConfigLabel.put(new Integer(100), new JLabel("1.0"));
    
    
    decayTimeLabels.put(new Integer(1),new JLabel("min"));
    decayTimeLabels.put(new Integer(2),new JLabel("2"));
    decayTimeLabels.put(new Integer(3),new JLabel("3"));
    decayTimeLabels.put(new Integer(4),new JLabel("4"));
    decayTimeLabels.put(new Integer(5),new JLabel("5"));
    decayTimeLabels.put(new Integer(6),new JLabel("6"));
    decayTimeLabels.put(new Integer(7),new JLabel("7"));
    decayTimeLabels.put(new Integer(8),new JLabel("8"));
    decayTimeLabels.put(new Integer(9),new JLabel("9"));
    decayTimeLabels.put(new Integer(10),new JLabel("max"));
    
    
    
  } 

  /** Returns an ImageIcon, or null if the iconFile is invalid. */
  public static ImageIcon createImageIcon(String iconFile) {
    if (iconFile != null) {
      return new ImageIcon(iconFile);
    } else {
      System.err.println("Couldn't find file: " + iconFile);
      return null;
    }
  }

  /**
   * Compute a point such that a widget with the given width and height can be placed
   * in the center of the main widget.
   * @param width Widget width.
   * @param height Widget height.
   * @return Center point.
   */
  public static Point getCenter (int width, int height)
  {
    // get the center point
    Point point;
    try { point = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint (); }
    catch (Exception e) { point = new Point (0, 0); }

    // compute the position
    point.translate (-width/2, -height/2);
    return point;
  }

  /**
   * Returns a JPanel object containing a slider with description.
   *
   * @param text a slider description
   * @param slider a JSlider
   *
   * @return a JPanel object containing a slider with description.
   */
  public static JPanel makeLabelSliderPanelHorizontal(String text, JSlider slider) {
    JPanel panel = new JPanel();
    JLabel label = new JLabel(text, JLabel.RIGHT);
    label.setMinimumSize(largeDescriptionsSize);
    label.setPreferredSize(largeDescriptionsSize);
    label.setMaximumSize(largeDescriptionsSize);
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    panel.add(label);
    panel.add(Box.createRigidArea(new Dimension(10, 0)));
    panel.add(slider);
    return panel;
  }

  public static Box.Filler getFillerBox(int xSize, int ySize, int maxXSize, int maxYSize) {
    return new Box.Filler(new Dimension(xSize, ySize), new Dimension(xSize, ySize),
			  new Dimension(maxXSize, maxYSize));
  }

  /**
   * Returns a JSlider object.
   *
   * @param start
   * @param end
   * @param value
   * @param majorTicks
   * @param minorTicks
   * @param labelTable
   *
   * @return a new JSlider object.
   */  
  public static JSlider makeJSliderHorizontal(int start, int end, int value, int majorTicks, int minorTicks,
					      Dictionary labelTable, ChangeListener sliderListener) {
    if ((value < start) || (value > end))
      throw new IllegalArgumentException("Preset value " + value + " must be between start " + 
					 start + " and end " + end + " value");
    if (majorTicks > end) 
      throw new IllegalArgumentException("Major ticks " + majorTicks + 
					 " should be less (or equal) to end value " + end);
    if (minorTicks > majorTicks) 
      throw new IllegalArgumentException("Minor ticks " + minorTicks + 
					 " should be less to major tics " + majorTicks);
    UIManager.put("Slider.painValue", false);
    JSlider slider = new JSlider(JSlider.HORIZONTAL, start, end, value);

    if (labelTable != null)
      slider.setLabelTable((Dictionary)labelTable);
    slider.addChangeListener(sliderListener);
    slider.setMajorTickSpacing(majorTicks);
    slider.setMinorTickSpacing(minorTicks);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    slider.setSnapToTicks(false);
    return slider;
  }

  public static Helpers createHelpers() {
    instance = (instance == null) ? new Helpers() : instance;
    return instance;
  }

}
