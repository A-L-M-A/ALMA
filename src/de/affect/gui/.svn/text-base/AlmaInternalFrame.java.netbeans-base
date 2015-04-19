/*
 * AlmaInternalFrame.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.gui;

import java.awt.Component;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;

import static de.affect.gui.AlmaGUI.sAlmaGUI;
import static de.affect.gui.DesktopHelper.getLastPosition;
import static de.affect.gui.DesktopHelper.getLastSize;
import static de.affect.gui.DesktopHelper.savePosition;
import static de.affect.util.FileHelper.sALMAInternalFrameIcon;


/** 
 * Common Alma Internal Frame
 * 
 * @author Patrick Gebhard
 * @version 1.0
 */
public class AlmaInternalFrame extends JInternalFrame implements ComponentListener, MouseListener {

  private String fId = null;
  private String fTitle = null;
  private Dimension fSize = null;

  public AlmaInternalFrame(String title, String id, Dimension initialSize,
			   boolean f1, boolean f2, boolean f3, boolean f4) {

    super (title, f1, f2, f3, f4);
    fId = id;
    fTitle = title;
    if (sALMAInternalFrameIcon != null)
      setFrameIcon(sALMAInternalFrameIcon);
    setLocation(getLastPosition(fId));
    setSize(getLastSize(fId, initialSize));
    if (sAlmaGUI != null) {
      //addComponentListener(sAlmaGUI);
      addInternalFrameListener(sAlmaGUI);
    }
    addComponentListener(this);
    addMouseListener(this);
  }

  /** Returns the id of an internal frame. This is used for the internal frame 
   * handling for an integrated desktop.
   *
   * @return the id of a frame
   *
   */
  public String getId() {
    return fId;
  }

  //Implementation of MouseListener
  public void mouseClicked(MouseEvent e) {
    //System.out.println(fId + " mouse clicked");
  }

  public void mouseEntered(MouseEvent e) {
    //System.out.println(fId + " mouse entered");
  }

  public void mouseExited(MouseEvent e) {
    //System.out.println(fId + " mouse exited");
  }

  public void mousePressed(MouseEvent e) {
    //System.out.println(fId + " mouse pressed");
  }

  public void mouseReleased(MouseEvent e) {
    savePosition((Component)this);
  }

  // Implementation of ComponentListener
  public void componentHidden(ComponentEvent e) {
  }

  public void componentMoved(ComponentEvent e) {
    savePosition((Component)this);
  }

  public void componentResized(ComponentEvent e) {
  }

  public void componentShown(ComponentEvent e) {
  }

}
