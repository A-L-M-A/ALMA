
/*
 * EmotionVectorPane.java
 *
 * Copyright (c) 2004-2006 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.Border;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createTitledBorder;

import java.util.logging.Logger;
import static de.affect.emotion.EmotionType.*;

import de.affect.mood.Mood;
import de.affect.emotion.EmotionVector;
import de.affect.emotion.Emotion;
import de.affect.emotion.EmotionType;
import static de.affect.gui.AlmaGUI.sDefaultTextFont;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.AlmaGUI.sBORDERLINE;
import static de.affect.manage.AffectManager.sLog;

/**
 * The
 * <code>EmotionVectorPane</code> shows the intensity of an character's emotions
 * with sliders. A slider operates on integer values from 0 to 100.
 *
 * @author Patrick Gebhard
 *
 * @version 2.0
 */
public class EmotionVectorPanel extends JPanel implements ChangeListener, MouseListener {

  private String characterName = "";
  private JSlider[] emotionSlider;
  private Hashtable<EmotionType, JLabel> labelTable = new Hashtable<EmotionType, JLabel>();
  private Hashtable<EmotionType, JLabel> impactLabelTable = new Hashtable<EmotionType, JLabel>();
  private Hashtable<EmotionType, Integer> labelActiveIndicator = new Hashtable<EmotionType, Integer>();
  private Hashtable<EmotionType, JSlider> sliderTable = new Hashtable<EmotionType, JSlider>();
  private Hashtable<JSlider, EmotionType> emotionTable = new Hashtable<JSlider, EmotionType>();
  private Hashtable<String, JPanel> panelTable = new Hashtable<String, JPanel>();
  private EmotionVector emotions = null;
  private EmotionType changedEmotion = null;
  private double changedEmotionIntensity = 0.0d;
  private EmotionMaintainerNotifier affectMonitor = null;

  protected EmotionVectorPanel(EmotionMaintainerNotifier affectMonitor, String name, EmotionVector vec) {
    super();
    this.affectMonitor = affectMonitor;
    this.characterName = name;
    this.emotions = vec;
    java.util.List emotionTypes = vec.getEmotionTypes();
    JLabel[] emotionLabel = new JLabel[emotionTypes.size()];
    
    int cnt = 0;
    for (Iterator it = emotionTypes.iterator(); it.hasNext();) {
      EmotionType emoType = (EmotionType) it.next();
      String cat = getCategoryByName(emoType.toString());
      char[] catChars = cat.toCharArray();
      catChars[0] = Character.toUpperCase(catChars[0]);
      if ((!panelTable.containsKey(cat)) && (emoType != EmotionType.Undefined) && (emoType != EmotionType.Physical)) {
        JPanel sliderPanel = new JPanel();
        sliderPanel.setOpaque(false);
        sliderPanel.setLayout(new BoxLayout(sliderPanel, BoxLayout.Y_AXIS));
        Border border =
          createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
          " " + String.copyValueOf(catChars) + " ",
          0, 0, sDefaultTitleFont),
          createEmptyBorder(-1, 1, 1, 1));
        sliderPanel.setBorder(border);
        panelTable.put(cat, sliderPanel);
      }
      cnt++;
    }
    emotionSlider = new JSlider[emotionTypes.size()];
    
    String typeName;
    String catName;
    JPanel catPanel;
    int i = 0;
    for (Iterator it = emotionTypes.iterator(); it.hasNext();) {
      EmotionType emoType = (EmotionType) it.next();
      if ((emoType != EmotionType.Undefined) && (emoType != EmotionType.Physical)) {
        typeName = emoType.toString();
        catName = getCategoryByName(typeName);
        emotionLabel[i] = new JLabel(typeName);
        emotionLabel[i].setFont(sDefaultTextFont);
        emotionLabel[i].setMinimumSize(new Dimension(70, 18));
        emotionLabel[i].setPreferredSize(new Dimension(70, 18));
        emotionLabel[i].setMaximumSize(new Dimension(70, 18));
        emotionSlider[i] = new JSlider();
        
        if (affectMonitor == null) { //|| emoType.equals(EmotionType.Physical)) {
          emotionSlider[i].setEnabled(false);
          // special knob
          //emotionSlider[i].setUI(new ShapeSliderUI());
        }
        emotionSlider[i].setMinimumSize(new Dimension(70, 18));
        emotionSlider[i].setPreferredSize(new Dimension(70, 18));
        emotionSlider[i].setMaximumSize(new Dimension(70, 18));
        emotionSlider[i].setOrientation(JSlider.HORIZONTAL);
        emotionSlider[i].setMinimum(0);
        emotionSlider[i].setMaximum(100);
        emotionSlider[i].setPaintLabels(false);
        emotionSlider[i].addChangeListener(this);
        emotionSlider[i].addMouseListener(this);
        labelTable.put(emoType, emotionLabel[i]);
        labelActiveIndicator.put(emoType, new Integer(0));
        sliderTable.put(emoType, emotionSlider[i]);
        emotionTable.put(emotionSlider[i], emoType);
        catPanel = (JPanel) (panelTable.get(catName));
        JPanel labelSliderTab = new JPanel();
        labelSliderTab.setLayout(new BoxLayout(labelSliderTab, BoxLayout.X_AXIS));
        labelSliderTab.add(emotionLabel[i]);
        labelSliderTab.add(emotionSlider[i]);
        catPanel.add(labelSliderTab);
        i++;
      }
    }
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    for (Enumeration e = panelTable.keys(); e.hasMoreElements();) {
      String key = (String) e.nextElement();
      this.add((JPanel) (panelTable.get(key)));
    }
    updateVector(vec);
  }

  protected void updateVector(EmotionVector vec) {
    emotions = vec;
    
    if (vec != null) {
      java.util.List types = vec.getEmotionTypes();
      for (Iterator it = types.iterator(); it.hasNext();) {
        EmotionType et = (EmotionType) it.next();
        //if ((!et.equals(changedEmotion)) && (et != EmotionType.Undefined) && (et != EmotionType.Physical)) {
        if ((et != EmotionType.Undefined) && (et != EmotionType.Physical)) {
          Emotion em = vec.get(et);          
          if (em != null) {
            JSlider slider = (JSlider) sliderTable.get(et);
            JLabel label = (JLabel) labelTable.get(et);
            label.setToolTipText("" + em.getElicitor());
            //JPanel impactlabel = (JPanel)impactLabelTable.get(et);
            int labelActive = ((Integer) labelActiveIndicator.get(et)).intValue();
            int currValue = slider.getValue();
           // change label color to black after three steps of decay
            if ((labelActive >= 4) || (currValue == (int) (100 * em.getBaseline()))) {
              label.setForeground(Color.black);
              labelActiveIndicator.put(et, new Integer(0));
            }
            // change label color to red, if emotion intensity has changed
            int newValue = (int) (100 * em.getIntensity());
            if (newValue > currValue) {
              labelActiveIndicator.put(et, new Integer(0));
              label.setForeground(Color.red);
            }
            // if intensity of emotion is higher than threshold, activate impact status light
            if (newValue > em.getBaseline()) //impactlabel.setBackground(Color.red);
            // count decay steps of active emotion
            {
              if ((newValue > (int) (100 * em.getBaseline())) && (labelActive < 4)) {
                labelActive = labelActive + 1;
                labelActiveIndicator.put(et, new Integer(labelActive));
              }
            }
            if (slider != null) {
              slider.setValue(newValue);
            }
          }
        }
      }
    }
  }

  /**
   * Listen to the slider
   */
  public void stateChanged(ChangeEvent e) {
    // debug log.info("slider state changed");
    JSlider slider = (JSlider) e.getSource();
    if (slider.getValueIsAdjusting()) {
      changedEmotion = (EmotionType) emotionTable.get(slider);
      changedEmotionIntensity = (double) (slider.getValue() / 100.0d);
    }
  }

  /**
   * Listen to the mouse
   */
  public void mouseClicked(MouseEvent e) {
    //System.out.println("mouseClicked");
  }

  public void mouseEntered(MouseEvent e) {
    //System.out.println("mouseEntered");
  }

  public void mouseExited(MouseEvent e) {
    //System.out.println("mouseExited");
  }

  public void mousePressed(MouseEvent e) {
    //System.out.println("mousePressed");
  }

  public synchronized void mouseReleased(MouseEvent e) {
    if (affectMonitor != null) {
      //System.out.println("mouseReleased");
      JSlider slider = (JSlider) e.getSource();
      if (changedEmotion != null) {
        sLog.info(characterName + " has new user elicited emotion " + changedEmotion);
        affectMonitor.notifyEmotionMaintenanceListener(characterName, changedEmotion, changedEmotionIntensity);
        //slider.setValue((int) (100 * emotions.get(changedEmotion).getBaseline()));
        changedEmotion = null;
      }
    }
  }
}
