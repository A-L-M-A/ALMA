/*
 * AlmaAboutDialog.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.*; 
import java.awt.Rectangle; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.text.Element;
import javax.swing.text.StyleConstants;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTML;

import static de.affect.gui.AlmaGUI.sAlmaGUI;
import static de.affect.gui.AlmaGUI.sDefaultTextFont;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.AlmaGUI.sBORDERLINE;
import static de.affect.gui.Helpers.getFillerBox;
import static de.affect.util.FileHelper.sALMALogo;
import static de.affect.util.FileHelper.sALMAAboutFile;

/** 
 * The class <code>AlmaAboutDialog</code> gives information about the ALMA 
 * application. Especially, used external libraries, involved programmers, 
 * used theories, etc.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AlmaAboutDialog extends JDialog
{

  JPanel fContentPanel = null;
  JScrollPane fAboutTextScrollPane = null;
  JButton okButton;
  MyEditorPane fAboutPane = null;
  JViewport fViewPort  = null;
  Timer fScrollTimer = null;

  public AlmaAboutDialog(JFrame comp, String title) {
    super(comp, title, true);
    // handle closing operation
    setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent we) {
	  fScrollTimer.cancel();
	  dispose();
	}
      });

    // the look and feel ...
    JPanel logoPanel = new JPanel();
    logoPanel.setLayout(new BoxLayout(logoPanel, BoxLayout.X_AXIS));
    logoPanel.add(new JLabel(sALMALogo));
    int logoXSize = sALMALogo.getIconWidth();

    fAboutPane = new MyEditorPane();
    fAboutPane.setEditorKit(editorKit);
    fAboutPane.setContentType("text/html");
    fAboutPane.setEditable(false);
    fAboutPane.setHighlighter(null);
    fAboutPane.setDragEnabled(false);
    fAboutPane.setBackground(new Color(224, 223, 227));
    try {
      URL pageURL = sALMAAboutFile; //new URL("file", "localhost", sALMAAboutFile);
      fAboutPane.setPage(pageURL);
    } catch (Exception e) {
      fAboutPane.setText("<html><body><font color=\"red\">No about available!<br>Unable to locate " + 
		       sALMAAboutFile + 
		       "</font></body></html>");
      e.printStackTrace();
    }

    fAboutTextScrollPane = new JScrollPane(fAboutPane);
    fAboutTextScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    fAboutTextScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    fAboutTextScrollPane.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
    fAboutTextScrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));

    okButton = new JButton("Okay");
    setFont(sDefaultTextFont);
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
    buttonPanel.add(getFillerBox(100,10,2000,10));
    buttonPanel.add(okButton);

    JSeparator separator = new JSeparator();
    separator.setMinimumSize(new Dimension(logoXSize, 2));
    separator.setPreferredSize(new Dimension(logoXSize, 2));
    separator.setMaximumSize(new Dimension(logoXSize, 2));

    fContentPanel = new JPanel();
    fContentPanel.setLayout(new BoxLayout(fContentPanel, BoxLayout.Y_AXIS));
    fContentPanel.add(logoPanel);
    fContentPanel.add(getFillerBox(logoXSize + 6,2,logoXSize + 6,2));
    fContentPanel.add(fAboutTextScrollPane);
    fContentPanel.add(getFillerBox(logoXSize + 6,2,logoXSize + 6,2));
    fContentPanel.add(buttonPanel);
    getContentPane().add(fContentPanel, BorderLayout.CENTER);
    setSize(new Dimension(logoXSize + 6, 300));

    // Start auto scroller
    fScrollTimer = new Timer(true);
    fScrollTimer.schedule(new ScrollTask(), 2000, 80);

    Action lAction = new Action();
    okButton.addActionListener(lAction);
    Dimension bounds  =  Toolkit.getDefaultToolkit( ).getScreenSize( );
    Dimension abounds = getSize(); 
    setLocation((bounds.width - abounds.width) / 2, 
		(bounds.height - abounds.height) / 3);
    setResizable(false);
    setVisible(true);
  }

  void okButton_Clicked(ActionEvent event) {
    setVisible(false);
    fScrollTimer.cancel();
    dispose();
  }

   protected HTMLEditorKit editorKit = new HTMLEditorKit() {
       public ViewFactory getViewFactory() {
	 return new HTMLEditorKit.HTMLFactory() {
	     public View create(Element elem) {
	       Object o = elem.getAttributes().getAttribute(StyleConstants.NameAttribute);
	       if (o instanceof HTML.Tag) {
		 HTML.Tag kind = (HTML.Tag) o;
		 if (kind == HTML.Tag.IMG) {
		   // bypass problems with relative image filenames and documents assigned via setText()
		   return new SImageView(elem);
		 }
	       }
	       return super.create(elem);
	     }
	   };
       }
     };


  class MyEditorPane extends JEditorPane {
    public MyEditorPane() {
      super();
    }
 
    public MyEditorPane(String strURL) throws IOException {
      super(strURL);
    }
 
    public MyEditorPane(URL oInitialPage) throws IOException {
      super(oInitialPage);
    }
 
    public MyEditorPane(String strType, String strText) {
      super(strType, strText);
    }
 
    protected void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			  RenderingHints.VALUE_ANTIALIAS_ON);
 
      super.paintComponent(g2);
    }
  }

  class ScrollTask extends TimerTask {
    int xPos = 0;
    int yPos = 0;
    int initialYPos = 0;
    int height = 0;
    JViewport fViewPort = null;
    boolean configured = false;

    public ScrollTask() {}

    public void run() {
      if (!configured) {
	fViewPort = fAboutTextScrollPane.getViewport();
	//fViewPort.setScrollMode(JViewport.BLIT_SCROLL_MODE);
	Rectangle viewRect = fViewPort.getViewRect();
	xPos = new Double(viewRect.getX()).intValue();
	yPos = new Double(viewRect.getY()).intValue();
	initialYPos = yPos;
	height = fAboutPane.getSize().height;
	configured = true;
      } else {
	yPos = (yPos <= height) ? yPos + 1 : initialYPos;
	fViewPort.setViewPosition(new Point(xPos, yPos));
      }
    }
  }


  class Action implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      okButton_Clicked(event);
    }
  }

}