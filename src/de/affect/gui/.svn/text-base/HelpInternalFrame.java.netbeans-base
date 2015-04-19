/*
 * HelpInternalFrame.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.text.Element;
import javax.swing.text.StyleConstants;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTML;
import java.util.logging.Logger;


import static de.affect.gui.AlmaGUI.sAlmaGUI;
import static de.affect.gui.AlmaGUI.sDefaultTextFont;
import static de.affect.gui.DesktopHelper.getAvailableHeight;
import static de.affect.gui.DesktopHelper.getGoodLocation;
import static de.affect.gui.DesktopHelper.getRightSideLocation;
import static de.affect.util.FileHelper.sALMAHelpFile;
import static de.affect.util.FileHelper.sALMADocPath;


public class HelpInternalFrame extends AlmaInternalFrame implements HyperlinkListener {

  MyEditorPane helpPane = null;

  public HelpInternalFrame() {
    super("ALMA Help","HelpIndex", new Dimension(400, 150), true, true, true, true);
    helpPane = new MyEditorPane();
    helpPane.setEditorKit(editorKit);
    helpPane.setContentType("text/html");
    helpPane.setEditable(false);
    helpPane.addHyperlinkListener(this);
    helpPane.setMargin(new Insets(5, 8, 5, 8));
    try {
      URL pageURL = sALMAHelpFile; //new URL("file", "localhost", sALMAHelpFile.getAbsolutePath());
      helpPane.setPage(pageURL);
    } catch (Exception e) {
      helpPane.setText("<html><body><font color=\"red\">No help available!<br>Unable to locate " + 
		       sALMAHelpFile + 
		       "</font></body></html>");
      e.printStackTrace();
    }
    JScrollPane helpScrollPane = new JScrollPane(helpPane);
    helpScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel helpPanel = new JPanel();
    helpPanel.setLayout(new BoxLayout(helpPanel, BoxLayout.X_AXIS));
    helpPanel.add(helpScrollPane);
    getContentPane().add(helpPanel, BorderLayout.CENTER);
    setSize(new Dimension(400, getAvailableHeight(this)));
    setLocation(getRightSideLocation(this));
  }

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


  public void hyperlinkUpdate(HyperlinkEvent event) {
    if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
      try {
	if (event.getURL().getProtocol().equals("file")) {
	  if ((new File(event.getURL().getFile())).exists()) {
	    helpPane.setPage(new URL("file", "localhost", event.getURL().getFile()));
	  } else {
	    helpPane.setPage(new URL("file", "localhost", 
				     sALMADocPath.getAbsolutePath() + event.getURL().getFile()));
	  }
	} else {
	  helpPane.setPage(event.getURL());
	} 
      } catch(IOException e) {
	e.printStackTrace();
      }
    }
  }

}