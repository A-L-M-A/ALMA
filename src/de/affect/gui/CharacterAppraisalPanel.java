/*
 * CharacterAppraisailPanel.java
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
package de.affect.gui;

import java.io.IOException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;

import java.awt.dnd.*;
import java.awt.datatransfer.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ListCellRenderer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import de.affect.manage.AppraisalRules;
import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;

import de.affect.emotion.EmotionType;
import de.affect.mood.MoodType;
import de.affect.data.ActType;

import de.affect.appraisal.AppraisalVariables;
import de.affect.appraisal.eec.Desirability;
import de.affect.appraisal.eec.Praiseworthiness;
import de.affect.appraisal.eec.Appealingness;
import de.affect.appraisal.eec.Likelihood;
import de.affect.appraisal.eec.Liking;
import de.affect.appraisal.eec.Realization;
import de.affect.appraisal.eec.Agency;

import de.affect.xml.MoodWord;
import de.affect.xml.EmotionName;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.*;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.*;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.*;

import static javax.swing.JTabbedPane.RIGHT;
import static javax.swing.BoxLayout.X_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createTitledBorder;

import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.AlmaGUI.sBORDERLINE;
import static de.affect.manage.AppraisalRuleReader.readAppraisalRules;

/**
 * ConfigPanel for setting up appraisals.
 * @author Gernot Gebhard (based on conceptual work of Patrick Gebhard)
 */
public class CharacterAppraisalPanel extends JPanel {
  // store basics here

  AppraisalAct m_basic;

  // store act lists here
  ArrayList<AppraisalActList> m_lists = new ArrayList<AppraisalActList>();

  // affect manager interface
  private static AffectManager.InterfaceHolder m_manager = AffectManager.sInterface;
  
  private JPanel appraisalPanel = null;

  /**
   * Init CharacterAppraisalPanel.
   * @param characterName Name of the character.
   * @param characterAffectProfile The profile containing the character's appraisal rules.
   */
  public CharacterAppraisalPanel(String characterName, CharacterAffect characterAffectProfile) {
    // init
    setLayout(new BoxLayout(this, X_AXIS));

    // access appraisal rules
    AppraisalRules rules = m_manager.getCharacterByName(characterName).getAppraisalRules();
    AppraisalRules subrules = rules.getAppraisalRulesByType(characterName, "Basic");

    // add all basic appraisal tags
    m_basic = new AppraisalAct("Basic", characterName, false);
    m_basic.setOpaque(false);
    m_basic.setPreferredSize(new Dimension(300, 400));
    m_basic.setMaximumSize(new Dimension(200, 600));
    //m_basic.setMinimumSize(new Dimension(200, 400));//tengfei
    for (String key : subrules.getKeys(characterName)) {
      for (AppraisalVariables variables : subrules.getAppraisalVariables(characterName, key)) {
        m_basic.addAppraisalBasicTag(variables);
      }
    }
    appraisalPanel = new JPanel();
    appraisalPanel.setOpaque(false);
    appraisalPanel.setLayout(new BoxLayout(appraisalPanel, X_AXIS));
    appraisalPanel.add(m_basic);

    // build performer list
    CharacterManager[] characters = AffectManager.sInterface.getCharacters();
    String[] direct = new String[characters.length], indirect = new String[characters.length - 1];
    for (int i = 0, j = 0; i < characters.length; ++i) {
      String name = characters[i].getName();
      direct[i] = name;
      if (!characters[i].getName().equals(characterName)) {
        indirect[j++] = name;
      }
    }

    // build emotion, mood and act type list
    String[] emotions = EmotionType.getNames();
    String[] moods = MoodType.getNames();
    String[] acts = ActType.getNames();

    // place the rest into tabbed pane
    JTabbedPane tab = new JTabbedPane(RIGHT);

    tab.setOpaque(false);
    
    // selfact
    AppraisalActList list = new AppraisalActList("SelfAct", rules, characterName, null, acts, "Type: ");
    list.setOpaque(false);
    m_lists.add(list);
    tab.add(list.m_type, list);

    // directact
    list = new AppraisalActList("DirectAct", rules, characterName, direct, acts, "Type: ");
    list.setOpaque(false);
    m_lists.add(list);
    tab.add(list.m_type, list);

    // indirectact
    list = new AppraisalActList("IndirectAct", rules, characterName, indirect, acts, "Type: ");
    list.setOpaque(false);
    m_lists.add(list);
    tab.add(list.m_type, list);

    // selfemotion
    list = new AppraisalActList("SelfEmotion", rules, characterName, null, emotions, "Emotion: ");
    list.setOpaque(false);
    m_lists.add(list);
    tab.add(list.m_type, list);

    // indirectemotion
    list = new AppraisalActList("IndirectEmotion", rules, characterName, indirect, emotions, "Emotion: ");
    list.setOpaque(false);
    m_lists.add(list);
    tab.add(list.m_type, list);

    // selfmood
    list = new AppraisalActList("SelfMood", rules, characterName, null, moods, "Mood: ");
    list.setOpaque(false);
    m_lists.add(list);
    tab.add(list.m_type, list);

    // indirectmood
    list = new AppraisalActList("IndirectMood", rules, characterName, indirect, moods, "Mood: ");
    list.setOpaque(false);
    m_lists.add(list);
    tab.add(list.m_type, list);
    

    // done
    tab.setPreferredSize(new Dimension(400, 400));
    appraisalPanel.add(tab);
    add(appraisalPanel);
    this.setOpaque(false);
  }

  /**
   * Apply appraisal rules to given character affect profile.
   * @param characterAffectProfile The character profile to modify.
   */
  public void apply(CharacterAffect characterAffectProfile) {
    Appraisal appraisal = Appraisal.Factory.newInstance();

    // apply basic rules
    m_basic.apply(null, appraisal.addNewBasic());

    // apply other rules
    for (int i = 0; i < m_lists.size(); ++i) {
      m_lists.get(i).apply(appraisal);
    }

    // done
    characterAffectProfile.setAppraisal(appraisal);

    // update appraisal rules
    try {
      CharacterManager character = AffectManager.sInterface.getCharacterByName(characterAffectProfile.getName());
      AppraisalRules rules = readAppraisalRules(character, appraisal);
      character.setAppraisalRules(rules);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/**
 * Container for several appraisal acts of the same type.
 */
class AppraisalActList extends JPanel implements ActionListener, ItemListener {
  // sizes

  final static Dimension size = new Dimension(5000, 20);

  // type
  String m_type;

  // character
  String m_character;

  // mapping type -> performer -> appraisal act
  HashMap<String, HashMap<String, AppraisalAct>> m_acts = new HashMap<String, HashMap<String, AppraisalAct>>();

  // active act
  AppraisalAct m_active = null;

  // display acts here
  JPanel m_content;
 
  

  // stored types
  JComboBox m_types;

  // stores performer
  JComboBox m_performers;

  // buttons
  JButton m_add, m_remove;

  // do not change type list?
  boolean m_fixedTypes;

  /**
   * Create new AppraisalActList.
   * @param type Type of used AppraisalRules.
   * @param rules AppraisalRules to use.
   * @param character The character this thing is all about.
   * @param performers List of possible performers.
   * @param types If non-null this list describes the allowed types.
   * @param prefix Prefix for type combobox.
   */
  AppraisalActList(String type, AppraisalRules rules, String character, String[] performers, String[] types, String prefix) {
    // layout
    setLayout(new BoxLayout(this, Y_AXIS));

    // init
    m_type = type;
    m_character = character;
    m_types = (m_fixedTypes = types != null) ? new JComboBox(types) : new JComboBox();
    m_types.setOpaque(false);
    
    // action panel
    JPanel panel = new JPanel();
    panel.setOpaque(false);
    panel.setLayout(new BoxLayout(panel, X_AXIS));
    panel.add(new JLabel(prefix));
    panel.add(m_types);
    if (performers == null) {
      panel.add(m_add = new JButton("Add"));
      m_add.setOpaque(false);
      panel.add(m_remove = new JButton("Remove"));
      m_remove.setOpaque(false);
    }
    panel.setAlignmentX(LEFT_ALIGNMENT);
    panel.setMaximumSize(size);
    add(panel);

    // performer panel
    if (performers != null) {
      panel = new JPanel();
      panel.setOpaque(false);
      panel.setLayout(new BoxLayout(panel, X_AXIS));
      panel.add(new JLabel("Performer: "));
      panel.add(m_performers = new JComboBox(performers));
      m_performers.setOpaque(false);
      panel.add(m_add = new JButton("Add"));
      m_add.setOpaque(false);
      panel.add(m_remove = new JButton("Remove"));
      m_remove.setOpaque(false);
      panel.setAlignmentX(LEFT_ALIGNMENT);
      panel.setMaximumSize(size);
      add(panel);
    }

    // content panel 
    m_content = new JPanel();//tengfei
    m_content.setOpaque(false);
    m_content.setPreferredSize(new Dimension(300,800));
    m_content.setMinimumSize(new Dimension(200,400));
    add(m_content);

    // config
    m_content.setLayout(new GridLayout(1, 1));
    m_content.setAlignmentX(LEFT_ALIGNMENT);
    m_types.setEditable(!m_fixedTypes);
    m_types.setOpaque(false);
    m_types.setRenderer(new ActListRenderer(false));
    m_types.addItemListener(this);
    if (m_performers != null) {
      m_performers.setRenderer(new ActListRenderer(true));
      m_performers.addItemListener(this);
      m_add.setEnabled(performers.length != 0);
    }
    m_add.addActionListener(this);
    m_remove.addActionListener(this);
    m_remove.setEnabled(false);

    // add performer acts
    if (performers != null) {
      for (String performer : performers) {
        try {
          AppraisalRules subrules = rules.getAppraisalRulesByType(performer, type);
          for (String key : subrules.getKeys(performer)) {
            addAct(new AppraisalAct(key, performer, subrules.getAppraisalVariables(performer, key), true));
          }
        } catch (Exception e) {
          AffectManager.sLog.info("Performer: " + performer);
          e.printStackTrace();
        }
      }
    } // add self-acts
    else {
      AppraisalRules subrules = rules.getAppraisalRulesByType(character, type);
      for (String key : subrules.getKeys(character)) {
        addAct(new AppraisalAct(key, character, subrules.getAppraisalVariables(character, key), true));
      }
    }
  }

  /**
   * Add tags to given appraisal tag act.
   * @param appraisal Appraisal tag of character definition.
   */
  void apply(Object appraisal) {
    // add tags to appraisal
    for (HashMap<String, AppraisalAct> mapping : m_acts.values()) {
      for (AppraisalAct act : mapping.values()) {
        try {
          act.apply(m_type, appraisal.getClass().getMethod("addNew" + m_type).invoke(appraisal));
        } catch (Exception e) {
        }
      }
    }
  }

  /**
   * Access AppraisalAct.
   * @param type Appraisal type.
   * @param performer Performer.
   * @return Wanted AppraisalAct.
   */
  AppraisalAct act(String type, String performer) {
    // performer to appraisal act mapping
    HashMap<String, AppraisalAct> mapping = m_acts.get(type);

    // nope
    if (mapping == null) {
      return null;
    }

    // access
    return mapping.get(performer);
  }

  /**
   * Show current act.
   * @param act Act to show.
   */
  void showAct(AppraisalAct act) {
    // remove active
    if (m_active != null) {
      m_content.remove(m_active);
    }

    // show
    if (act != null) {
      m_content.add(m_active = act);
      m_remove.setEnabled(true);
    } else {
      m_active = null;
      m_remove.setEnabled(false);
    }

    // add button
    m_add.setEnabled(m_active == null);

    // done
    m_content.updateUI();
  }

  /**
   * Add new act.
   * @param act Act to add.
   */
  public void addAct(AppraisalAct act) {
    // performer to act mapping
    HashMap<String, AppraisalAct> mapping = m_acts.get(act.m_name);

    // new entry
    if (mapping == null) {
      mapping = new HashMap<String, AppraisalAct>();
      mapping.put(act.m_performer, act);
      m_acts.put(act.m_name, mapping);

      if (!m_fixedTypes) {
        m_types.addItem(act.m_name);
      }
    } // append new entry
    else if (mapping.get(act.m_performer) == null) {
      mapping.put(act.m_performer, act);
    }
  }

  /**
   * Remove act.
   * @param act Act to remove.
   */
  public void removeAct(AppraisalAct act) {
    //performer to act mapping
    HashMap<String, AppraisalAct> mapping = m_acts.get(act.m_name);

    // not contained here
    if (mapping == null) {
      return;
    }

    // remove entry
    mapping.remove(act.m_performer);

    // remove type entry
    if (mapping.isEmpty()) {
      m_acts.remove(act.m_name);
      if (!m_fixedTypes) {
        m_types.removeItem(act.m_name);
      }
    }
  }

  /**
   * Button was clicked.
   * @param event Associated event.
   */
  public void actionPerformed(ActionEvent event) {
    // source
    Object source = event.getSource();

    // add new type
    if (source == m_add) {
      // current
      String type = currentType();
      String performer = currentPerformer();

      // do nothing if such an entry already exists
      if (act(type, performer) != null) {
        return;
      }

      // create, add and show new act
      AppraisalAct act = new AppraisalAct(type, performer, true);
      addAct(act);
      showAct(act);
    } // remove active type
    else {
      if (m_active == null) {
        return;
      }

      removeAct(m_active);
      showAct(act(currentType(), currentPerformer()));
    }
  }

  /**
   * Item state changed.
   * @param event Associated event.
   */
  public void itemStateChanged(ItemEvent event) {
    showAct(act(currentType(), currentPerformer()));
  }

  /**
   * Access current type.
   * @return Current type.
   */
  private String currentType() {
    return (String) m_types.getSelectedItem();
  }

  /**
   * Access current performer.
   * @return Current performer (null if none available).
   */
  private String currentPerformer() {
    if (m_performers == null) {
      return m_character;
    }

    return (String) m_performers.getSelectedItem();
  }

  /**
   * ListCellRenderer for displaying wether an item is available or not.
   */
  private class ActListRenderer extends JLabel implements ListCellRenderer {
    // indicates if this is a renderer for the performers list

    private boolean m_performer;

    /**
     * Init renderer.
     * @param performer True if renderer is used for performers list.
     */
    ActListRenderer(boolean performer) {
      setOpaque(true);
      m_performer = performer;
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
      setText((String) value);
      boolean valid = (m_performer ? act(currentType(), (String) value) : act((String) value, currentPerformer())) != null;
      setBackground(selected ? (valid ? Color.green.darker() : Color.red.darker()) : Color.white);
      setForeground(selected ? Color.white : (valid ? Color.black : Color.gray));
      return this;
    }
  }
}

/**
 * Container for basic appraisal tags.
 */
class AppraisalAct extends JScrollPane implements DragSourceListener, DropTargetListener {
  // container name

  String m_name;

  // performer
  String m_performer;

  // enabled drag-and-drop?
  boolean m_dragAndDrop;

  // panel for adding AppraisalBasicTags
  JPanel m_panel;

  // stored panels
  HashMap<String, AppraisalBasicTag> m_tags = new HashMap<String, AppraisalBasicTag>();

  /**
   * Create new AppraisalAct.
   * @param name Appraisal act name.
   * @param performer Appraisal act performer.
   * @param dragAndDrop True if container should be receiving drag-and-drop events.
   */
  AppraisalAct(String name, String performer, boolean dragAndDrop) {
    // init
    super(new JPanel());
    // layout
    m_panel = (JPanel) getViewport().getView();
    m_panel.setOpaque(false);
    
    m_panel.setLayout(new BoxLayout(m_panel, Y_AXIS));

    // init
    m_name = name;
    m_performer = performer;
    if (m_dragAndDrop = dragAndDrop) {
      new DropTarget(m_panel, this);
    }

    // scroll
    getVerticalScrollBar().setUnitIncrement(64);
  }

  /**
   * Init container with given tags.
   * @param name Appraisal act name.
   * @param performer Appraisal act performer.
   * @param variables Used appraisal variables.
   * @param dragAndDrop True if container should be receiving drag-and-drop events.
   */
  AppraisalAct(String name, String performer, AppraisalVariables[] variables, boolean dragAndDrop) {
    // init
    this(name, performer, dragAndDrop);

    // add all possible basic appraisal tags
    for (AppraisalVariables variable : variables) {
      addAppraisalBasicTag(variable);
    }
  }

  /**
   * Apply changes to given appraisal act.
   * @param type Indicates the type of the given appraisal act.
   * @param act Act to modify.
   */
  void apply(String type, Object act) {
    // setup type
    if (type != null) {
      // mood
      if (type.contains("Mood")) {
        try {
          MoodWord.Enum mood = MoodWord.Enum.forString(m_name);
          act.getClass().getMethod("setMood", mood.getClass()).invoke(act, mood);
        } catch (Exception e) {
          AffectManager.sLog.warning("Failed to create MoodWord.Enum for " + m_name + "!");
        }
      } // emotion
      else if (type.contains("Emotion")) {
        try {
          EmotionName.Enum emotion = EmotionName.Enum.forString(m_name);
          act.getClass().getMethod("setEmotion", emotion.getClass()).invoke(act, emotion);
        } catch (Exception e) {
          AffectManager.sLog.warning("Failed to create EmotionName.Enum for " + m_name + "!");
        }
      } // just type
      else {
        try {
          act.getClass().getMethod("setType", m_name.getClass()).invoke(act, m_name);
        } catch (Exception e) {
        }
      }
    }

    // setup performer
    if (m_performer != null) {
      try {
        act.getClass().getMethod("setPerformer", m_performer.getClass()).invoke(act, m_performer);
      } catch (Exception e) {
      }
    }

    // modify act
    for (String name : m_tags.keySet()) {
      m_tags.get(name).apply(act);
    }
  }

  /**
   * Add appraisal basic tag.
   * @param tag AppraisalBasicTag to add.
   */
  void addAppraisalBasicTag(AppraisalBasicTag tag) {
    // add and sort appraisal tag list
    m_tags.put(tag.m_tag, tag);
    AppraisalBasicTag[] tags = m_tags.values().toArray(new AppraisalBasicTag[0]);
    Arrays.sort(tags, AppraisalBasicTag.COMPARATOR);

    // clear panel and re-insert tags
    m_panel.removeAll();
    for (AppraisalBasicTag t : tags) {
      m_panel.add(t);
    }
    m_panel.updateUI();
  }

  /**
   * Add appraisal basic tag.
   * @param AppraisalVariables Variables describing the basic act.
   */
  void addAppraisalBasicTag(AppraisalVariables variables) {
    addAppraisalBasicTag(new AppraisalBasicTag(this, variables));
  }

  /**
   * Invoked when one of the panels has been dragged around.
   * @param event Corresponding event.
   */
  public void dragDropEnd(DragSourceDropEvent event) {
    // remove dragged panel
    try {
      Object source = event.getDragSourceContext().getTransferable().getTransferData(DataFlavor.stringFlavor);
      if (source instanceof AppraisalBasicTag) {
        AppraisalBasicTag tag = (AppraisalBasicTag) source;
        tag.setOpaque(false);
        m_tags.remove(tag.m_tag);
        m_panel.remove(tag);
        m_panel.updateUI();
      }
    } // ignore errors
    catch (Exception e) {
    }
  }

  /**
   * Something is actually dropped on an component.
   * @param event The associated event.
   */
  public void drop(DropTargetDropEvent event) {
    // copy dragged panel
    try {
      Object source = event.getTransferable().getTransferData(DataFlavor.stringFlavor);
      if (source instanceof AppraisalBasicTag) {
        AppraisalBasicTag tag = (AppraisalBasicTag) source;
        tag.setOpaque(false);
        if (m_tags.get(tag.m_tag) != null) {
          event.rejectDrop();
        } else {
          event.acceptDrop(event.getDropAction());
          addAppraisalBasicTag(new AppraisalBasicTag(this, tag));
          event.dropComplete(true);
        }
      } else {
        event.rejectDrop();
      }
    } // ignore errors
    catch (Exception e) {
    }
  }

  // unused
  public void dragEnter(DragSourceDragEvent event) {
  }

  public void dragExit(DragSourceEvent event) {
  }

  public void dragOver(DragSourceDragEvent event) {
  }

  public void dropActionChanged(DragSourceDragEvent event) {
  }

  public void dragEnter(DropTargetDragEvent event) {
  }

  public void dragExit(DropTargetEvent event) {
  }

  public void dragOver(DropTargetDragEvent event) {
  }

  public void dropActionChanged(DropTargetDragEvent event) {
  }
}

/**
 * This class represents a basic appraisal tag and its corresponding variables.
 */
class AppraisalBasicTag extends JPanel implements DragGestureListener, Transferable {
  // comparator

  public static AppraisalBasicTagComparator COMPARATOR = new AppraisalBasicTagComparator();

  // basic appraisal tag name
  String m_tag;

  // known sliders
  ArrayList<AppraisalSlider> m_sliders = new ArrayList<AppraisalSlider>();
 

  // known values
  ArrayList<AppraisalValue> m_values = new ArrayList<AppraisalValue>();

  /**
   * Creates new AppraisalBasicTag for given appraisal tag.
   * @param act Parent act.
   * @param tag Basic appraisal tag name.
   */
  AppraisalBasicTag(AppraisalAct act, String tag) {
    // init layout
    setLayout(new BoxLayout(this, X_AXIS));
    setBorder(createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
      m_tag = tag, 0, 0, sDefaultTitleFont),
      createEmptyBorder(1, 1, 1, 1)));

    // setup drag-and-drop
    DragSource source = new DragSource();
    source.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_MOVE, this);
    if (act.m_dragAndDrop) {
      source.addDragSourceListener(act);
    }
  }

  /**
   * Copy constructor.
   * @param act Parent act.
   * @param tag AppraisalBasicTag to copy from.
   */
  AppraisalBasicTag(AppraisalAct act, AppraisalBasicTag tag) {
    // init
    this(act, tag.m_tag);

    // copy sliders
    for (int i = 0; i < tag.m_sliders.size(); ++i) {
      AppraisalSlider slider = tag.m_sliders.get(i);
      slider.setOpaque(false);
      addAppraisalVariable(slider.m_name, slider.value(), slider.m_positive);
    }

    // copy values
    for (int i = 0; i < tag.m_values.size(); ++i) {
      AppraisalValue value = tag.m_values.get(i);
      addAppraisalVariable(value.m_name, value.m_value.getText());
    }
  }

  /**
   * Create new AppraisalBasicTag representing all values of given tag.
   * @param act Parent act.
   * @param variables AppraisalVariables describing the basic tag.
   */
  AppraisalBasicTag(AppraisalAct act, AppraisalVariables variables) {
    // init
    this(act, variables.getSignal());

    // add sliders
    Appealingness appealingness = variables.getAppealingness();
    if (appealingness != null) {
      addAppraisalVariable("Appealingness", appealingness.degree(), appealingness.isAppealing());
    }

    Desirability desirability = variables.getDesirability();
    if (desirability != null) {
      addAppraisalVariable("Desirability", desirability.degree(), desirability.isDesirable());
    }

    Likelihood likelihood = variables.getLikelihood();
    if (likelihood != null) {
      addAppraisalVariable("Likelihood", likelihood.degree(), likelihood.isLikely());
    }

    Liking liking = variables.getLiking();
    if (liking != null) {
      addAppraisalVariable("Liking", liking.degree(), liking.isLiked());
    }

    Praiseworthiness praiseworthiness = variables.getPraiseworthiness();
    if (praiseworthiness != null) {
      addAppraisalVariable("Praiseworthiness", praiseworthiness.degree(), praiseworthiness.isPraiseworthy());
    }

    // add values
    Agency agency = variables.getAgency();
    if (agency != null) {
      addAppraisalVariable("Agency", agency.toString());
    }

    Realization realization = variables.getRealization();
    if (realization != null) {
      addAppraisalVariable("Realization", realization.isConfirmed() ? "true" : "false");
    }
  }

  /**
   * Apply values to given tag.
   * @param act Add basic appraisal tag to given act.
   */
  void apply(Object act) {
    Object basicTag = null;

    // get current or add new one, if it does not exist
    try {
      basicTag = act.getClass().getMethod("addNew" + m_tag).invoke(act);
    } catch (Exception exception) {
    }

    // apply slider values
    for (int i = 0; i < m_sliders.size(); ++i) {
      m_sliders.get(i).apply(basicTag);
    }

    // apply other values
    for (int i = 0; i < m_values.size(); ++i) {
      m_values.get(i).apply(basicTag);
    }
  }

  /**
   * Add appraisal value as slider.
   * @param name Slider name.
   * @param value Inital value.
   * @param positive Positive or negative values.
   */
  void addAppraisalVariable(String name, double value, boolean positive) {
    m_sliders.add((AppraisalSlider) add(new AppraisalSlider(name, value, positive)));
  }

  /**
   * Add appraisal value as simple text field.
   * @param name Value name.
   * @param value Inital value.
   */
  void addAppraisalVariable(String name, String value) {
    m_values.add((AppraisalValue) add(new AppraisalValue(name, value)));
  }

  /**
   * Start drag-and-drop.
   * @param event Corresponding event.
   */
  public void dragGestureRecognized(DragGestureEvent event) {
    event.startDrag(null, this);
  }

  /**
   * Access data.
   * @param flavor Wanted type of data (ignored).
   * @return This class.
   */
  public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
    return this;
  }

  /**
   * Access available flavors.
   * @return null, since this is not used in this context.
   */
  public DataFlavor[] getTransferDataFlavors() {
    return null;
  }

  /**
   * Checks if data flavor is supported.
   * @param flavor Smell of the data.
   * @return Always true, since flavors are ignored in this context.
   */
  public boolean isDataFlavorSupported(DataFlavor flavor) {
    return true;
  }
}

/**
 * Appraisal basic tag comparator.
 */
class AppraisalBasicTagComparator implements Comparator<AppraisalBasicTag> {

  /**
   * Compare two appraisal basic tags.
   * @param a First tag.
   * @param b Second tag.
   * @return Comparison value.
   */
  public int compare(AppraisalBasicTag a, AppraisalBasicTag b) {
    return a.m_tag.compareTo(b.m_tag);
  }

  /**
   * Checks whether given object is equal to this one.
   * @param object The object to compare with.
   * @return True iff it is this object.
   */
  @Override
  public boolean equals(Object object) {
    return object == this;
  }
}

/**
 * This class represents one value of an appraisal tag as slider.
 */
class AppraisalSlider extends JPanel implements ChangeListener {
  // sizes

  final static Dimension size = new Dimension(100, 50);

  // name of the value
  String m_name;

  // label
  JLabel m_label;

  // value
  JSlider m_value;

  // positive values
  boolean m_positive;

  /**
   * Create new slider.
   * @param name Value name.
   * @param value Initial value.
   * @param positive Positive values?
   */
  AppraisalSlider(String name, double value, boolean positive) {
    // init panel
    setLayout(new BoxLayout(this, Y_AXIS));

    // init stuff
    m_name = name;
    m_label = new JLabel(name + ": " + value);
    m_label.setOpaque(false);
    m_label.setAlignmentX(LEFT_ALIGNMENT);
    m_value = new JSlider(positive ? 0 : -10, positive ? 10 : 0, (int) (value * 10.0));
    m_value.setOpaque(false);
    m_value.addChangeListener(this);
    m_value.setAlignmentX(LEFT_ALIGNMENT);
    m_value.setPreferredSize(size);
    m_value.setSnapToTicks(true);
    m_positive = positive;

    // compose
    add(m_label);
    add(m_value);
  }

  /**
   * Apply value to given type.
   * @param basicTag Add value to given basic appraisal tag.
   */
  void apply(Object basicTag) {
    try {
      basicTag.getClass().getMethod("set" + m_name, m_name.getClass()).invoke(basicTag, Double.toString(value()));
    } catch (Exception e) {
    }
  }

  /**
   * Return slider value.
   * @return A value between -1.0 and 1.0.
   */
  double value() {
    return ((double) m_value.getValue()) / 10.0;
  }

  /**
   * A slider value has changed.
   * @param event Corresponding event.
   */
  public void stateChanged(ChangeEvent event) {
    m_label.setText(m_name + ": " + value());
  }
}

/**
 * This class represents one value of an appraisal tag.
 */
class AppraisalValue extends JPanel {
  // sizes

  final static Dimension size = new Dimension(5000, 20);
  final static Dimension rigid = new Dimension(0, 4);

  // value name
  String m_name;

  // label
  JLabel m_label;

  // value
  JTextField m_value;

  /**
   * Create new value.
   * @param name Value name.
   * @param value Initial value.
   */
  AppraisalValue(String name, String value) {
    // init panel
    setLayout(new BoxLayout(this, Y_AXIS));

    // init stuff
    m_name = name;
    m_label = new JLabel(name + ": ");
    m_label.setAlignmentX(LEFT_ALIGNMENT);
    m_value = new JTextField(value);
    m_value.setEditable(false);
    m_value.setAlignmentX(LEFT_ALIGNMENT);
    m_value.setMaximumSize(size);

    // compose
    add(m_label);
    add(Box.createRigidArea(rigid));
    add(m_value);
  }

  /**
   * Apply value to given type.
   * @param basicTag Add value to given basic appraisal tag.
   */
  void apply(Object basicTag) {
    try {
      basicTag.getClass().getMethod("set" + m_name, m_name.getClass()).invoke(basicTag, m_value.getText());
    } catch (Exception e) {
    }
  }
}
