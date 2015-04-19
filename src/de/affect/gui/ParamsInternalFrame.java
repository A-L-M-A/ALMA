/*
 * ParamInternalFrame.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

// utils
import de.affect.manage.AffectManager;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.logging.Logger;

// awt stuff
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// swing
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// xml stuff
import de.affect.xml.EmotionName;
import de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification;
import de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification;

// some statics
import static java.awt.Font.PLAIN;
import static javax.swing.BoxLayout.X_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;
import static javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.event.TableModelEvent.DELETE;
import static javax.swing.event.TableModelEvent.UPDATE;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createTitledBorder;

// own statics
import static de.affect.manage.AffectManager.sInterface;
import de.affect.manage.CharacterManager;
import de.affect.manage.GroupManager;
import javax.swing.border.Border;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.AlmaGUI.sBORDERLINE;


/**
 * With the computation parameters internal frame the user can edit all
 * available acts and emotions (which is still todo).
 */
public class ParamsInternalFrame extends AlmaInternalFrame {

  private JPanel mControlPanel = new JPanel();
  private JButton mPauseButton;
  private JButton mResumeButton;
  private JButton mStepButton;

  /**
   * Create new computation parameters internal frame.
   */
  public ParamsInternalFrame() {
    // init default stuff
    super("Computation Parameters", "CompParams", new Dimension(300, 500), true, true, true, true);

    // set tabs
    JTabbedPane tabs = new JTabbedPane();
    tabs.add("Available Acts", new AvailableActs());
    //System.out.println("configuring emotions");
    tabs.add("Available OCC Emotions", new AvailableEmotions());

    // setup control panel
    initControlPanel();
  
    // set content
    Container content = getContentPane();
    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
    content.add(mControlPanel);
    content.add(tabs);
  }

  private void initControlPanel() {
    mControlPanel.setLayout(new BoxLayout(mControlPanel, BoxLayout.X_AXIS));
        Border border =
      createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
      " Affect computation of all characters and groups ", 0, 0, sDefaultTitleFont),
      createEmptyBorder(1, 10, 1, 1));
    mControlPanel.setBorder(border);
    // Continue button
    mResumeButton = new JButton("Resume");
    mResumeButton.setEnabled(false);
    mResumeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AffectManager.sInterface.resumeAffectComputation();
        mPauseButton.setEnabled(true);
        mResumeButton.setEnabled(false);
        mStepButton.setEnabled(false);
      }
    });
    // Pause button
    mPauseButton = new JButton("Pause");
    mPauseButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AffectManager.sInterface.pauseAffectComputation();
        mPauseButton.setEnabled(false);
        mResumeButton.setEnabled(true);
        mStepButton.setEnabled(true);
      }
    });
    // Step button
    mStepButton = new JButton("Step");
    mStepButton.setEnabled(false);
    mStepButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AffectManager.sInterface.stepwiseAffectComputation();
      }
    });

    mControlPanel.add(Box.createHorizontalGlue());
    mControlPanel.add(mPauseButton);
    mControlPanel.add(mResumeButton);
    mControlPanel.add(mStepButton);
    mControlPanel.add(Box.createRigidArea(new Dimension(5, 0)));
    mResumeButton.setFocusCycleRoot(true);
  }
}

/**
 * Available acts panel.
 */
class AvailableActs extends JPanel implements ActionListener, CaretListener, TableModelListener, ListSelectionListener {
  // available acts

  private JTable m_acts = new JTable();
  // avaiable acts table model
  private ActTableModel m_model = new ActTableModel(m_acts);
  // input text field
  private JTextField m_act = new JTextField();
  // add button
  private JButton m_add = new JButton("Add");
  // remove button
  private JButton m_remove = new JButton("Remove");
  // inner lock
  private boolean m_lock = false;

  /**
   * Create new available acts panel.
   */
  public AvailableActs() {
    // init layout
    setLayout(new BoxLayout(this, Y_AXIS));

    // init available acts model
    for (ActSpecification act : sInterface.getDocumentManager().getAffectComputationParams().getAvailableActs().getActSpecificationList()) {
      m_model.addRow(new Object[]{new Boolean(act.getUse()), act.getName(), act.getDocu()});
    }

    // setup table
    m_acts.getSelectionModel().addListSelectionListener(this);
    m_acts.setSelectionMode(MULTIPLE_INTERVAL_SELECTION);
    m_acts.setModel(m_model);
    add(new JScrollPane(m_acts));

    // setup model
    m_model.sort();
    m_model.setup();
    m_model.addTableModelListener(this);

    // create button panel
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, X_AXIS));
    panel.add(new JLabel("Act "));
    panel.add(m_act);
    panel.add(m_add);
    panel.add(m_remove);
    panel.setMaximumSize(new Dimension(2000, m_remove.getHeight()));
    m_act.addActionListener(this);
    m_act.addCaretListener(this);
    m_add.addActionListener(this);
    m_add.setEnabled(false);
    m_remove.addActionListener(this);
    m_remove.setEnabled(false);
    add(panel);
  }

  /**
   * Button was clicked.
   *
   * @param event Current event.
   */
  public void actionPerformed(ActionEvent event) {
    // prepare
    Object source = event.getSource();

    // add act
    if ((source == m_add) || ((source == m_act) && m_add.isEnabled())) {
      m_model.addRow(new Object[]{new Boolean("true"), m_act.getText(), "New Act"});
      m_acts.repaint();
      m_act.setText("");
    } // remove acts
    else if (source == m_remove) {
      int[] rows = m_acts.getSelectedRows();
      for (int i = rows.length - 1; i >= 0; --i) {
        m_model.removeRow(rows[i]);
      }
      m_model.setup();
    }
  }

  /**
   * Something has happended to the text field.
   *
   * @param event Caret event.
   */
  public void caretUpdate(CaretEvent event) {
    m_add.setEnabled(m_act.getText().length() > 0);
  }

  /**
   * The table has been changed.
   *
   * @param event Table model event.
   */
  public void tableChanged(TableModelEvent event) {
    // do nothing
    if (m_lock) {
      return;
    }

    // add new act
    int column = event.getColumn();
    if ((column != 0) && (event.getType() != DELETE)) {
      int row = event.getFirstRow();
      String act = (column == 1) ? m_model.getValueAt(row, 1).toString() : m_act.getText();
      if (used(act)) {
        boolean invalid = false;
        do {
          act = JOptionPane.showInputDialog(this, (invalid ? "The name you have provided is invalid." : "An act with the name '" + act + "' already exists.") + " Please insert a new name.", "Invalid name", ERROR_MESSAGE);
          invalid = (act == null) || (act.length() == 0);
        } while (invalid);
        m_model.setValueAt(act, row, 1);
      }
      m_lock = true;
      m_model.sort();
      m_model.setup();
      m_lock = false;
    }

    // always save the changes
    sInterface.setAvailableActs(m_model.availableActs());
  }

  /**
   * The table has been selected.
   *
   * @param event Selection event.
   */
  public void valueChanged(ListSelectionEvent event) {
    m_remove.setEnabled(m_acts.getSelectedRow() != -1);
  }

  /**
   * Checks whether the given act name is already used.
   *
   * @param act The act name to check.
   */
  private boolean used(String act) {
    // find table entry with the given name
    int amount = 0;
    for (int i = 0; i < m_model.getRowCount(); ++i) {
      if (act.equals(m_model.getValueAt(i, 1).toString()) && (++amount == 2)) {
        return true;
      }
    }

    // not found
    return false;
  }
}

/**
 * Available act table model
 */
class ActTableModel extends SortableTableModel {

  /**
   * Init act table model.
   *
   * @param table The table this table model takes care if.
   */
  public ActTableModel(JTable table) {
    super(table, new Object[]{"Use", "Act", "Documentation"});
  }

  /**
   * Get class of given column.
   *
   * @param column Column index.
   * @return Class of given column.
   */
  public Class getColumnClass(int column) {
    return (column == 0) ? new Boolean(true).getClass() : new String().getClass();
  }

  /**
   * Check whether cell is editable or not.
   *
   * @param row cell row.
   * @param column cell column.
   */
  public boolean isCellEditable(int row, int column) {
    return (column == 0) || (column == 1) || ((column == 2) && ((Boolean) getValueAt(row, 0)).booleanValue());
  }

  /**
   * Build list of available acts.
   *
   * @return List of available acts.
   */
  public ActSpecification[] availableActs() {
    // build act specification list
    ActSpecification acts[] = new ActSpecification[getRowCount()];
    for (int i = 0; i < acts.length; ++i) {
      ActSpecification act = ActSpecification.Factory.newInstance();
      act.setUse(((Boolean) getValueAt(i, 0)).booleanValue());
      act.setName(getValueAt(i, 1).toString());
      Object docu = getValueAt(i, 2);
      if (docu != null) {
        act.setDocu(docu.toString());
      }
      acts[i] = act;
    }
    return acts;
  }
}

/**
 * Available emotions panel.
 */
class AvailableEmotions extends JPanel implements TableModelListener {
  // available emotions

  private JTable m_emotions = new JTable();
  // avaiable emotions table model
  private EmotionTableModel m_model = new EmotionTableModel(m_emotions);

  /**
   * Create new available emotions panel.
   */
  public AvailableEmotions() {
    // init layout
    setLayout(new BoxLayout(this, Y_AXIS));

    // init available acts model
    EmotionSpecification[] emotions =
      sInterface.getDocumentManager().getAffectComputationParams().getAvailableEmotions().getEmotionSpecificationList().toArray(new EmotionSpecification[25]);
    for (int i = 1; i <= EmotionName.Enum.table.lastInt(); ++i) {
      EmotionName.Enum name = EmotionName.Enum.forInt(i);
      if ((name != EmotionName.UNDEFINED) || (name != EmotionName.PHYSICAL)) {
        String docu = null;
        boolean available = false;
        for (EmotionSpecification emotion : emotions) {
          if (emotion != null) {
            if (name == emotion.getName()) {
              docu = emotion.getDocu();
              available = emotion.getUse();
              m_model.addRow(new Object[]{new Boolean(available), name, docu});
              break;
            }
          } else {
            //DEBUG System.out.println("Unknown emotion specification for emotion " + name);
          }
        }
      }
    }

    // setup table
    m_model.addTableModelListener(this);
    m_emotions.setSelectionMode(SINGLE_SELECTION);
    m_emotions.setModel(m_model);
    add(new JScrollPane(m_emotions));

    // setup model
    m_model.sort();
    m_model.setup();
    m_model.addTableModelListener(this);
  }

  /**
   * The table has been changed.
   *
   * @param event Table model event.
   */
  public void tableChanged(TableModelEvent event) {
    sInterface.setAvailableEmotions(m_model.availableEmotions());
  }
}

/**
 * Available emotions table model
 */
class EmotionTableModel extends SortableTableModel {

  /**
   * Init emotion table model.
   *
   * @param table The table to take care of.
   */
  public EmotionTableModel(JTable table) {
    super(table, new Object[]{"Use", "Emotion", "Documentation"});
  }

  /**
   * Get class of given column.
   *
   * @param column Column index.
   * @return Class of given column.
   */
  public Class getColumnClass(int column) {
    return (column == 0) ? new Boolean(true).getClass() : new String().getClass();
  }

  /**
   * Check whether cell is editable or not.
   *
   * @param row Cell row.
   * @param column Cell column.
   */
  public boolean isCellEditable(int row, int column) {
    return (column == 0) || ((column == 2) && ((Boolean) getValueAt(row, 0)).booleanValue());
  }

  /**
   * Build list of available emotions.
   *
   * @return List of available emotions.
   */
  public EmotionSpecification[] availableEmotions() {
    // gather all available emotions
    EmotionSpecification[] emotions = new EmotionSpecification[getRowCount()];
    for (int i = 0; i < getRowCount(); ++i) {
      EmotionSpecification emotion = EmotionSpecification.Factory.newInstance();
      emotion.setName((EmotionName.Enum) getValueAt(i, 1));
      emotion.setUse(((Boolean) getValueAt(i, 0)).booleanValue());
      Object docu = getValueAt(i, 2);
      if (docu != null) {
        emotion.setDocu(docu.toString());
      }
      emotions[i] = emotion;
    }

    // done
    return emotions;
  }
}

/**
 * Sortable table model.
 */
class SortableTableModel extends DefaultTableModel {
  /// the table to manage

  JTable m_table;

  /**
   * Create new sortable table model.
   *
   * @param table The table that is to be managed.
   * @param columns The column headers.
   */
  public SortableTableModel(JTable table, Object[] columns) {
    super(null, columns);
    m_table = table;
  }

  /**
   * Sort table based on act column.
   *
   * @param ascending True if ascending order is required.
   */
  public void sort() {
    Vector<Vector<Object>> table = (Vector<Vector<Object>>) getDataVector();
    Collections.sort(table, new TableSorter(1, true));
    fireTableStructureChanged();
  }

  /**
   * This function sets the size of the table components.
   */
  public void setup() {
    // determine the maximal width of the act name
    int maxNameWidth = 0;
    Vector table = getDataVector();
    for (int i = 0; i < table.size(); ++i) {
      JLabel jLabel = new JLabel("");
      FontMetrics fm = jLabel.getFontMetrics(jLabel.getFont());
      int nameWidth = fm.stringWidth(((Vector) table.elementAt(i)).elementAt(1).toString());
      maxNameWidth = (maxNameWidth < nameWidth) ? nameWidth : maxNameWidth;
    }
    maxNameWidth = maxNameWidth + 10;

    // set column sizes
    m_table.getColumnModel().getColumn(0).setPreferredWidth(35);
    m_table.getColumnModel().getColumn(0).setMaxWidth(35);
    m_table.getColumnModel().getColumn(0).setMinWidth(35);
    m_table.getColumnModel().getColumn(1).setPreferredWidth(maxNameWidth);
    m_table.getColumnModel().getColumn(1).setMaxWidth(maxNameWidth);
  }
}

/**
 * Table sorter.
 */
class TableSorter implements Comparator<Vector<Object>> {
  /// column index

  private int m_index;
  /// sorting order
  private boolean m_ascending;

  /**
   * Init sorter.
   *
   * @param index The comlumn to sort.
   * @param ascending The sorting order.
   */
  public TableSorter(int index, boolean ascending) {
    m_index = index;
    m_ascending = ascending;
  }

  /**
   * Compare two rows.
   *
   * @param a First row.
   * @param b Second row.
   * @return -1 if a < b, 0 if a == b or 1 if a > b.
   */
  public int compare(Vector<Object> a, Vector<Object> b) {
    // get table entries
    Object cell_a = a.get(m_index);
    Object cell_b = b.get(m_index);

    // sort analogous to The Java Developers Almanac 1.4, e961.
    if ((cell_a == null) && (cell_b == null)) {
      return 0;
    } else if (cell_a == null) {
      return 1;
    } else if (cell_b == null) {
      return -1;
    } else {
      if (m_ascending) {
        return cell_a.toString().compareTo(cell_b.toString());
      } else {
        return cell_b.toString().compareTo(cell_a.toString());
      }
    }
  }
}
