/*
 * InteractionEditDialog.java
 *
 * Copyright (c) 2004, 2005, 2006, 2007, 2008, Patrick Gebhard, DFKI GmbH
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in 
 *     the documentation and/or other materials provided with the 
 *     distribution.
 *
 *   - Neither the name of the DFKI GmbH nor the names of its contributors
 *     may be used to endorse or promote products derived from this software
 *     without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE. 
 */

package de.affect.gui.simulation;

import java.util.HashSet;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ListCellRenderer;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import static javax.swing.BoxLayout.X_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;
import de.affect.xml.ActionTypes;
import de.affect.xml.EventTypes;
import de.affect.xml.ObjectTypes;
import de.affect.xml.EmotionName;
import de.affect.xml.MoodWord;

import de.affect.xml.AffectScriptDocument.AffectScript;
import de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter;
import de.affect.xml.AffectInputDocument.AffectInput;

import de.affect.xml.AffectInputDocument.AffectInput.Character;
import de.affect.xml.AffectInputDocument.AffectInput.Act;
import de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay;
import de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay;


import static de.affect.util.Convert.prettyPrint;
import static de.affect.util.Convert.makeStringList;
import static de.affect.gui.Helpers.getFillerBox;

/**
 * Interaction edit dialog used for editing character interactions.
 * @author Gernot Gebhard, 2004-2005
 * @author Patrick Gebhard, 2005 (added some methods, such for enabling the
 *                                recognition of the users actions here in the
 *                                affect computation modules)
 */
public class InteractionEditDialog extends JDialog implements ActionListener, ChangeListener {
  // border width
  private static final int BORDER = 2;
  private static final int WIDTH  = 600;
  private static final int HEIGHT = 405;
  
  // types
  private static final int BASIC   = 1;
  private static final int ACT     = 2;
  private static final int EMOTION = 4;
  private static final int MOOD    = 8;
  private static final int RESET   = 16;
  private static final int CONTEXT = 32;
  private static final int EEC = 64;
  
  // script offset
  private static final int TIME_OFFSET = 1000;
  
  // main panel
  InteractionSimulationPanel m_panel;
  
  // character name
  InteractionCharacter m_character;
  
  // action type
  int m_type;
  
  // global stuff
  JPanel m_contentPanel;
  JComboBox m_types;
  JLabel m_sliderLabel;
  JSlider m_slider;
  JTextField m_elicitor;
  JTextArea m_context;
  JTextField m_time;
  JLabel m_inputItemLabel;
  
  // buttons
  JButton m_ok;
  JButton m_cancel;
  
  // target lists
  JPanel m_directPanel;
  JPanel m_indirectPanel;
  JPanel m_contextPanel;
  JPanel m_generalPanel;
  CheckBoxList m_direct;
  CheckBoxList m_indirect;
  
  // affect script item to replace
  AffectScript.Item m_replace = null;
  
  // knowledge - added by PG 22.01.05
  private CharacterManager character = null;
  private String[] validItems = null;
  
  // get the master of all processes
  private static AffectManager.InterfaceHolder affectManager = AffectManager.sInterface;
  
  /**
   * Initialize interaction edit dialog.
   * @param parent Parent interaction simulation panel.
   */
  InteractionEditDialog(InteractionSimulationPanel parent) {
    // init
    m_panel = parent;
    getContentPane().setLayout(new BoxLayout(getContentPane(), Y_AXIS));
    setDefaultCloseOperation(HIDE_ON_CLOSE);
    setAlwaysOnTop(true);
    setResizable(false);
    setModal(true);
    
    // content
    m_contentPanel = new JPanel();
    m_contentPanel.setLayout(new GridLayout(1, 3));
    add(m_contentPanel);
    
    m_inputItemLabel = new JLabel("Type:");
    
    // global stuff
    m_generalPanel = new JPanel();
    m_generalPanel.setLayout(new BoxLayout(m_generalPanel, Y_AXIS));
    m_generalPanel.setBorder(BorderFactory.createEmptyBorder(BORDER, BORDER, BORDER, BORDER));
    m_generalPanel.add(m_inputItemLabel);
    m_generalPanel.add(m_types = new FixedComboBox(-1, 20));
    m_generalPanel.add(Box.createVerticalStrut(2*BORDER));
    m_generalPanel.add(m_sliderLabel = new JLabel("Intensity: 0.1"));
    m_generalPanel.add(m_slider = new JSlider(1, 10, 1));
    m_generalPanel.add(Box.createVerticalStrut(2*BORDER));
    m_generalPanel.add(new JLabel("Elicitor:"));
    m_generalPanel.add(m_elicitor = new FixedTextField(-1, 20));
    m_generalPanel.add(Box.createVerticalStrut(2*BORDER));
    m_generalPanel.add(new JLabel("Time:"));
    m_generalPanel.add(m_time = new FixedLongField(-1, 20));
    m_types.setAlignmentX(LEFT_ALIGNMENT);
    m_types.setRenderer(new SmartListCellRenderer());
    m_slider.setAlignmentX(LEFT_ALIGNMENT);
    m_slider.addChangeListener(this);
    m_elicitor.setAlignmentX(LEFT_ALIGNMENT);
    m_time.setAlignmentX(LEFT_ALIGNMENT);
    m_contentPanel.add(m_generalPanel);
    
    // direct targets
    JScrollPane pane;
    m_directPanel = new JPanel();
    m_directPanel.setLayout(new BoxLayout(m_directPanel, Y_AXIS));
    m_directPanel.add(new JLabel("Direct Targets:"));
    m_directPanel.setBorder(BorderFactory.createEmptyBorder(BORDER, BORDER, BORDER, BORDER));
    m_directPanel.add(pane = new JScrollPane(m_direct = new CheckBoxList(null)));
    pane.setAlignmentX(LEFT_ALIGNMENT);
    
    // indirect targets
    m_indirectPanel = new JPanel();
    m_indirectPanel.setLayout(new BoxLayout(m_indirectPanel, Y_AXIS));
    m_indirectPanel.add(new JLabel("Indirect Targets:"));
    m_indirectPanel.setBorder(BorderFactory.createEmptyBorder(BORDER, BORDER, BORDER, BORDER));
    m_indirectPanel.add(pane = new JScrollPane(m_indirect = new CheckBoxList(m_direct)));
    pane.setAlignmentX(LEFT_ALIGNMENT);
    
    // context
    m_contextPanel = new JPanel();
    m_contextPanel.setLayout(new BoxLayout(m_contextPanel, Y_AXIS));
    m_contextPanel.add(new JLabel("Context:"));
    m_contextPanel.setBorder(BorderFactory.createEmptyBorder(BORDER, BORDER, BORDER, BORDER));
    m_contextPanel.add(pane = new JScrollPane(m_context = new JTextArea(4, 5)));
    m_context.setLineWrap(true);
    m_context.setWrapStyleWord(true);
    pane.setAlignmentX(LEFT_ALIGNMENT);
    
    // buttons
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, X_AXIS));
    panel.add(Box.createGlue());
    panel.add(m_ok = new JButton("Ok"));
    panel.add(m_cancel = new JButton("Cancel"));
    m_ok.addActionListener(this);
    m_cancel.addActionListener(this);
    add(panel);
  }
  
  /**
   * Show dialog.
   * @param source Character this thing is all about.
   * @param type Interaction type.
   * @param item AffectScript item to edit.
   */
  void show(InteractionCharacter source, String type, AffectScript.Item item) {
    // hide
    setVisible(false);
    
    // default values
    String signal = null;
    String elicitor = "";
    String context = "";
    String affectContext = "";
    String[] direct = null, indirect = null;
    int intensity = 1;
    long time = 0;
    
    // load values
    if (item != null) {
      AffectScriptItem data = new AffectScriptItem(item);
      type = data.type;
      signal = data.signal;
      elicitor = data.elicitor;
      affectContext = data.affectContext;
      context = data.context;
      time = data.time;
      direct = data.addressee.split(",");
      indirect = data.listener.split(",");
      try { intensity = (int)(Double.parseDouble(data.intensity)*10.0); } catch (Exception exception) {}
    }
    
    // set time
    else {
      time = m_panel.fScriptViewer.getLastTime();
      time = (time < 0)?0:time+TIME_OFFSET;
    }
    
    // init
    m_character = source;
    m_replace = item;
    character = (source != null)?affectManager.getCharacterByName(m_character.getText()):null;
    
    // reset
    m_slider.setValue(intensity);
    m_elicitor.setText(elicitor);
    m_context.setText(context + affectContext);
    m_time.setText(Long.toString(time));
    
    // just add it ...
    m_contentPanel.add(m_contextPanel);
    
    // clear
    m_types.removeAllItems();
    
    // init
    if (type.equals("EEC")) {
      m_type = EEC;
      // do do sliders
    } else if (type.equals("Basic")) {
      m_type = BASIC;
      validItems = character.getAppraisalRuleKeys("Basic");
      for (String name: m_character.type(type)) {
        JLabel menuItem = new JLabel(name);
        menuItem.setEnabled(isInArray(validItems, name));
        m_types.addItem(menuItem);
      }
    } else if (type.equals("Act")) {
      m_type = ACT;
      validItems = character.getAppraisalRuleKeys("SelfAct");
      for (String name: m_character.type(type)) {
        JLabel menuItem = new JLabel(name);
        menuItem.setEnabled(isInArray(validItems, name));
        m_types.addItem(menuItem);
      }
    } else if (type.equals("Emotion")) {
      m_type = EMOTION;
      validItems = character.getAppraisalRuleKeys("SelfEmotion");
      for (String name: m_character.type(type)) {
        JLabel menuItem = new JLabel(name);
        menuItem.setEnabled(isInArray(validItems, name));
        m_types.addItem(menuItem);
      }
    } else if (type.equals("Mood")) {
      m_type = MOOD;
      validItems = character.getAppraisalRuleKeys("SelfMood");
      for (String name: m_character.type(type)) {
        JLabel menuItem = new JLabel(name);
        menuItem.setEnabled(isInArray(validItems, name));
        m_types.addItem(menuItem);
      }
    } else if (type.equals("Context")) { m_type = CONTEXT; m_types.addItem(new JLabel(type)); } else if (type.equals("Reset Character")) { m_type = RESET; m_types.addItem(new JLabel(type)); }
    
    // select signal
    if (signal != null)
      for (int i = 0; i < m_types.getItemCount(); ++i)
        if (signal.equals(((JLabel)m_types.getItemAt(i)).getText())) {
      m_types.setSelectedIndex(i);
      break;
        }
    
    // set size and hide target lists if this is a basic interaction
    m_slider.setEnabled(true);
    m_elicitor.setEnabled(true);
    
    
//        if (m_type == EEC) {
//      //setSize(WIDTH/2, HEIGHT);
//      m_generalPanel.remove(m_inputItemLabel);
//      m_inputItemLabel = new JLabel("Adjust Values");
//      m_generalPanel.remove(m_types);
//      m_generalPanel.remove(m_slider);
//      m_generalPanel.remove(m_sliderLabel);
//      m_contentPanel.remove(m_directPanel);
//      m_contentPanel.remove(m_indirectPanel);
//      pack();
//    }
//    
//    // basic action
//    else 
    
if (m_type == BASIC) {
      setSize(WIDTH/2, HEIGHT);
      m_contentPanel.remove(m_directPanel);
      m_contentPanel.remove(m_indirectPanel);
    }
    
    // reset character and context action
    else if ((m_type & (RESET | CONTEXT)) > 0) {
      //setSize(WIDTH/2, HEIGHT);
      m_slider.setEnabled(false);
      m_elicitor.setEnabled(false);
      m_contentPanel.remove(m_directPanel);
      m_contentPanel.remove(m_indirectPanel);
      pack();
    }
    
    // everything else
    else {
      setSize(WIDTH, HEIGHT);
      m_contentPanel.add(m_directPanel);
      m_contentPanel.add(m_indirectPanel);
      
      // set targets
      m_direct.setListData(m_panel.characters(null));
      m_indirect.setListData(m_panel.characters(m_character.getText()));
      
      // select targets
      m_direct.setSelected(direct);
      m_indirect.setSelected(indirect);
    }
    
    // title and position
    setTitle(((source != null) && (m_type != CONTEXT))?(type+" - "+m_character.getText()):type);
    setLocationRelativeTo(m_panel);
    
    // done
    setVisible(true);
  }
  
  /**
   * Button was clicked.
   * @param event Event source.
   */
  public void actionPerformed(ActionEvent event) {
    // hide dialog in any case
    setVisible(false);
    
    // add new event
    if (event.getSource() == m_ok) {
      // create affect script item
      AffectScript.Item asi = AffectScript.Item.Factory.newInstance();
      asi.setTime(Long.parseLong(m_time.getText()));
      String context = m_context.getText().trim();
      if (!context.equals(""))
        asi.setContext(context);
      
      // there is a performer
      if ((m_character != null) && (m_type != CONTEXT)) {
        // show stuff in interaction panel
        m_panel.update(m_character.getText(), (m_type == BASIC)?null:m_direct.values(),
            (m_type == BASIC)?null:m_indirect.values(), 3000);
        
        // date
        String speaker = m_character.getText().trim();
        String addressees = makeStringList(m_direct.values());
        String listener = makeStringList(m_indirect.values());
        
        // get item text -- added by PG 22.01.05
        String selectedItem = ((JLabel)m_types.getSelectedItem()).getText();
        
        // build affect input
        AffectInput aiInput = AffectInput.Factory.newInstance();
        Character performer = Character.Factory.newInstance();
        performer.setName(speaker);
        if (m_type == BASIC) {
          if (selectedItem.contains("Act")) {
            AffectInput.Action basicAction = AffectInput.Action.Factory.newInstance();
            basicAction.setType(ActionTypes.Enum.forString(selectedItem));
            basicAction.setIntensity(prettyPrint(sliderValue()));
            basicAction.setElicitor(m_elicitor.getText());
            aiInput.setCharacter(performer);
            aiInput.setAction(basicAction);
            asi.setAffectInput(aiInput);
          } else if (selectedItem.contains("Event")) {
            AffectInput.Event basicEvent = AffectInput.Event.Factory.newInstance();
            basicEvent.setType(EventTypes.Enum.forString(selectedItem));
            basicEvent.setIntensity(prettyPrint(sliderValue()));
            basicEvent.setElicitor(m_elicitor.getText());
            aiInput.setCharacter(performer);
            aiInput.setEvent(basicEvent);
            asi.setAffectInput(aiInput);
          } else if (selectedItem.contains("Thing")) {
            AffectInput.Object basicObject = AffectInput.Object.Factory.newInstance();
            basicObject.setType(ObjectTypes.Enum.forString(selectedItem));
            basicObject.setIntensity(prettyPrint(sliderValue()));
            basicObject.setElicitor(m_elicitor.getText());
            aiInput.setCharacter(performer);
            aiInput.setObject(basicObject);
            asi.setAffectInput(aiInput);
          }
        } else if (m_type == ACT) {
          Act act = Act.Factory.newInstance();
          act.setAddressee(addressees);
          act.setListener(listener);
          act.setType(selectedItem);
          act.setIntensity(prettyPrint(sliderValue()));
          act.setElicitor(m_elicitor.getText());
          aiInput.setCharacter(performer);
          aiInput.setAct(act);
          asi.setAffectInput(aiInput);
        } else if (m_type == EMOTION) {
          EmotionDisplay emotionDisplay = EmotionDisplay.Factory.newInstance();
          emotionDisplay.setAddressee(addressees);
          emotionDisplay.setListener(listener);
          emotionDisplay.setType(EmotionName.Enum.forString(selectedItem));
          emotionDisplay.setIntensity(prettyPrint(sliderValue()));
          emotionDisplay.setElicitor(m_elicitor.getText());
          aiInput.setCharacter(performer);
          aiInput.setEmotionDisplay(emotionDisplay);
          asi.setAffectInput(aiInput);
        } else if (m_type == MOOD) {
          MoodDisplay moodDisplay = MoodDisplay.Factory.newInstance();
          moodDisplay.setAddressee(addressees);
          moodDisplay.setListener(listener);
          moodDisplay.setType(MoodWord.Enum.forString(selectedItem));
          moodDisplay.setIntensity(prettyPrint(sliderValue()));
          moodDisplay.setElicitor(m_elicitor.getText());
          aiInput.setCharacter(performer);
          aiInput.setMoodDisplay(moodDisplay);
          asi.setAffectInput(aiInput);
        } else if (m_type == RESET) {
          ResetCharacter resetCharacter = ResetCharacter.Factory.newInstance();
          resetCharacter.setName(speaker);
          asi.setResetCharacter(resetCharacter);
        }
      }
      
      // save the script item
      m_panel.addScriptItem(m_replace, asi, false);
    }
  }
  
  /**
   * Slide state has changed.
   * @param event Event information.
   */
  public void stateChanged(ChangeEvent event) {
    m_sliderLabel.setText("Intensity: "+sliderValue());
  }
  
  /**
   * Slider value percentage.
   * @return Slider value in percent.
   */
  private float sliderValue() {
    return (float)m_slider.getValue()/(float)m_slider.getMaximum();
  }
  
  /**
   * Compares a key string with strings stored in an array. If the key string
   * is equal to a string in the array, true is returned.
   *
   * @param array the array of strings
   * @param key the string used for comparing
   *
   * @return boolean if key string is equal to some string in the given string
   *                 array, the return value is true, false otherwise
   */
  private boolean isInArray(String[] array, String key) { //added by PG 22.01.05
    boolean result = false;
    for (String item : array)
      if (item.equals(key))
        result = true;
    return result;
  }
}

/**
 * ComboxBox with fixed dimensions.
 */
class FixedComboBox extends JComboBox {
  // dimensions
  private int m_width, m_height;
  
  /**
   * Create ComboBox with fixed width and/or height.
   * @param width Fixed width. Set to -1 if width should not be fixed.
   * @param height Fixed height. Set to -1 if height should not be fixed.
   */
  FixedComboBox(int width, int height) {
    m_width = width;
    m_height = height;
  }
  
  /**
   * Set Combobox bounds.
   * @param x x-coordinate.
   * @param y y-coordinate.
   * @param width New width.
   * @param heigth New height.
   */
  @Override
  public void setBounds(int x, int y, int width, int height) {
    super.setBounds(x, y, (m_width == -1)?width:m_width, (m_height == -1)?height:m_height);
  }
}

/**
 * TextField with fixed dimensions.
 */
class FixedTextField extends JTextField {
  // dimensions
  private int m_width, m_height;
  
  /**
   * Create TextField with fixed width and/or height.
   * @param width Fixed width. Set to -1 if width should not be fixed.
   * @param height Fixed height. Set to -1 if height should not be fixed.
   */
  FixedTextField(int width, int height) {
    m_width = width;
    m_height = height;
  }
  
  /**
   * Set Combobox bounds.
   * @param x x-coordinate.
   * @param y y-coordinate.
   * @param width New width.
   * @param heigth New height.
   */
  @Override
  public void setBounds(int x, int y, int width, int height) {
    super.setBounds(x, y, (m_width == -1)?width:m_width, (m_height == -1)?height:m_height);
  }
}

/**
 * TextField with fixed dimensions storing only positive longs.
 */
class FixedLongField extends FixedTextField {
  /**
   * Create TextField with fixed width and/or height.
   * @param width Fixed width. Set to -1 if width should not be fixed.
   * @param height Fixed height. Set to -1 if height should not be fixed.
   */
  FixedLongField(int width, int height) {
    super(width, height);
  }
  
  /**
   * Access default docuemnt model.
   * @return Default document model.
   */
  @Override
  protected Document createDefaultModel() {
    return new LongDocument();
  }
  
  /**
   * Plain document realizing that only numbers are inserted.
   */
  static class LongDocument extends PlainDocument {
    /**
     * Insert string at given offset.
     * @param offs Offset.
     * @param str String to insert.
     * @param a AttributSet which I don't know what it's used for.
     * @throws BadLocationException If something really really bad happens.
     */
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
      if (str == null)
        return;
      
      try { Long.parseLong(str); } catch (Exception e) { return; }
      
      super.insertString(offs, str, a);
    }
  }
}

/**
 * CheckBox list.
 */
class CheckBoxList extends JList implements MouseListener, ListCellRenderer {
  // set of selected checkboxes
  HashSet<String> m_data = new HashSet<String> ();
  
  // checkbox used for rendering
  JCheckBox m_cell = new JCheckBox();
  
  // contrary checkboxlist
  CheckBoxList m_list = null;
  
  /**
   * Init CheckBoxList.
   * @param list CheckBoxList contrary to this one.
   */
  CheckBoxList(CheckBoxList list) {
    setBackground(UIManager.getColor("List.textBackground"));
    setForeground(UIManager.getColor("List.textForeground"));
    
    setCellRenderer(this);
    addMouseListener(this);
    
    if (list != null) {
      m_list = list;
      list.m_list = this;
    }
  }
  
  /**
   * Return selected values.
   * @return Selected values.
   */
  String[] values() {
    return m_data.toArray(new String[0]);
  }
  
  /**
   * Is value selected.
   * @param item Item to check,
   * @return True if value is selected.
   */
  boolean selected(String item) {
    return m_data.contains(item);
  }
  
  /**
   * Set value select-state.
   * @param item Item to change.
   * @param value New state.
   */
  void setSelected(String item, boolean value) {
    // set value
    if (value) {
      m_data.add(item);
      
      if (m_list != null)
        m_list.setSelected(item, false);
    } else
      m_data.remove(item);
  }
  
  /**
   * Set selected values.
   * @param items Items to select.
   */
  void setSelected(String[] items) {
    m_data.clear();
    
    if (items != null)
      for (String item: items)
        m_data.add(item);
  }
  
  /**
   * Update cell at given index.
   * @param index Index to redraw.
   */
  void update(int index) {
    repaint(getCellBounds(index, index));
  }
  
  /**
   * Set list data.
   * @param data List data.
   */
  public void setListData(String[] data) {
    m_data.clear();
    super.setListData(data);
  }
  
  /**
   * Process mouse clicked event.
   * @param event Mouse event.
   */
  public void mouseClicked(MouseEvent event) {
    // select item
    int index = locationToIndex(event.getPoint());
    String item = getModel().getElementAt(index).toString();
    
    //System.out.println("item  " + item);
    
    // toggle item state
    setSelected(item, !selected(item));
    update(index);
    
    // update contrary list too
    if (m_list != null)
      m_list.update(index);
  }
  
  /**
   * Get cell component.
   * @param list Rendering list.
   * @param value Item value.
   * @param index Item index.
   * @param selected Is selected?
   * @param focus Has focus?
   */
  public Component getListCellRendererComponent(JList list, Object value, int index, boolean selected, boolean focus) {
    String item = value.toString();
    
    m_cell.setEnabled(list.isEnabled());
    m_cell.setSelected(selected(item));
    m_cell.setFont(list.getFont());
    m_cell.setText(item);
    
    return m_cell;
  }
  
  // not needed here
  public void mousePressed(MouseEvent event) {}
  public void mouseReleased(MouseEvent event) {}
  public void mouseExited(MouseEvent event) {}
  public void mouseEntered(MouseEvent event) {}
}

/**
 * List cell renderer that colors cells according to their enabledness.
 */
class SmartListCellRenderer extends JLabel implements ListCellRenderer {
  
  public SmartListCellRenderer() {
    setOpaque(true);
  }
  
  public Component getListCellRendererComponent(JList list, Object value,
      int index, boolean isSelected,
      boolean cellHasFocus) {
    JLabel item =(JLabel)value;
    if (item != null) {
      setText(item.getText());
      boolean valid = item.isEnabled();
      setBackground(isSelected?valid?Color.green.darker():Color.red.darker():Color.white);
      setForeground(isSelected?Color.white:Color.black);
    }
    return this;
  }
}
