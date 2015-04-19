/*
 * DesktopHelper.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

import java.awt.Dimension;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import static de.affect.gui.AlmaGUI.sAlmaGUI;
import static de.affect.manage.DocumentManager.saveAlmaGUIPosition;
import static de.affect.manage.DocumentManager.saveInternalFramePosition;
import static de.affect.manage.DocumentManager.getInternalFramePosition;
import static de.affect.manage.DocumentManager.getInternalFrameSize;

/** 
 * The class <code>DesktopHelper</code> keeps track of which windows are 
 * displayed. It provides methods for positioning new windows on the desktop.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class DesktopHelper {

  private static Toolkit fToolkit = null;
  private static int fNextFreeXPosition = 0;
  private static int fNextFreeYPosition = 0;
  private static Dimension fScreenSize = new Dimension(0, 0);
  private static int fScreenXSize = 0;
  private static int fScreenYSize = 0;

  public DesktopHelper() {
    fToolkit = Toolkit.getDefaultToolkit();
    try {
      fScreenSize = fToolkit.getScreenSize();
      fScreenXSize = new Double(fScreenSize.getWidth()).intValue();
      fScreenYSize = new Double(fScreenSize.getHeight()).intValue();
    } catch(HeadlessException he) {
      he.printStackTrace();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void savePosition(Component comp) {
    saveInternalFramePosition((AlmaInternalFrame)comp, sAlmaGUI.getDesktopSizeID());
  }

  public static Point getLastPosition(String id) {
    return getInternalFramePosition(id, sAlmaGUI.getDesktopSizeID());
  }

  public static Point getLastSize(String id) {
    return getInternalFrameSize(id, sAlmaGUI.getDesktopSizeID());
  }

  public static Dimension getLastSize(String id, Dimension initialDim) {
    return getInternalFrameSize(id, sAlmaGUI.getDesktopSizeID(), initialDim);
  }


  public static void setAvailableSize(Dimension size) {
    fScreenSize = size;
    fScreenXSize = fScreenSize.width;
    fScreenYSize = fScreenSize.height;
  }

  public static int getAvailableHeight(JInternalFrame comp) {
    Insets insets = comp.getInsets();

    Dimension titleDim = comp.getPreferredSize();

//    Dimension titleDim =
//      ((BasicInternalFrameUI)comp.getUI()).getNorthPane().getPreferredSize();
    return fScreenYSize - titleDim.height - 2 - insets.top - insets.bottom - 32;
  }

  public static Point getGoodLocation(Dimension size) {
    int xSize = size.width;
    int ySize = size.height;
    Point resultCoords = new Point();
    int xPos = fNextFreeXPosition;
    int yPos = fNextFreeYPosition;
    if ((fNextFreeXPosition + xSize) < fScreenXSize) {
      fNextFreeXPosition = fNextFreeXPosition + xSize;
    } else if (((fNextFreeXPosition + xSize) > fScreenXSize) &&
	       ((fNextFreeYPosition + ySize) < fScreenYSize)) {
      xPos = 0;
      yPos = fNextFreeYPosition;
      fNextFreeYPosition = fNextFreeYPosition + ySize;
    }
    // does not really work, so ... resultCoords.setLocation(xPos, yPos);
    resultCoords.setLocation(0, 0);
    return resultCoords;
  }

  public static Point getRightSideLocation(JInternalFrame comp) {
    Dimension size = comp.getSize();
    Insets insets = comp.getInsets();
    int xSize = size.width + insets.left + 2;
    Point resultCoords = new Point();
    int xpos = fScreenXSize - xSize;
    resultCoords.setLocation(xpos, 0);
    return resultCoords;
  }
}