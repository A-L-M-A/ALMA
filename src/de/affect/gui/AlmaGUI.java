/**
 * AlmaGUI.java
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

import static de.affect.gui.Helpers.getCenter;
import static de.affect.gui.Helpers.mediumDescriptionsSize;
import de.affect.gui.simulation.InteractionSimulationPanel;
import de.affect.manage.AffectManager;
import static de.affect.manage.AffectManager.sDesktopHelper;
import de.affect.manage.CharacterManager;
import static de.affect.manage.DocumentManager.getAlmaGUIPosition;
import static de.affect.manage.DocumentManager.getAlmaGUISize;
import static de.affect.manage.DocumentManager.getAlmaGUIState;
import static de.affect.manage.DocumentManager.saveAlmaGUIPosition;
import de.affect.manage.GroupManager;
import static de.affect.util.FileHelper.buildDetails;
import static de.affect.util.FileHelper.buildVersion;
import static de.affect.util.FileHelper.sALMACharacterConfigFile;
import static de.affect.util.FileHelper.sALMAComputationConfigFile;
import static de.affect.util.FileHelper.sALMAConfigPath;
import static de.affect.util.FileHelper.sALMAFrameIcon;
import static de.affect.util.FileHelper.sALMALogo;
import static de.affect.util.FileHelper.sALMAWorkDirectory;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.PLAIN;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.KeyStroke;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;


/** 
 * The class <code>AlmaGUI</code> gives access to all configuration data
 * of the affect processing and gives access to all characters affective
 * profile
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AlmaGUI extends JFrame implements ActionListener, ComponentListener, InternalFrameListener {

  private static AffectManager.InterfaceHolder affectManager = AffectManager.sInterface;
  public Hashtable<String, MoodCube> characterToMoodDisplay =
    new Hashtable<String, MoodCube>();
  public static AlmaGUI sAlmaGUI = null;
  public static JDesktopPane sAlmaDesktop = null;
  public static boolean sIntegratedDesktopMode = false;
  public static Font sDefaultTextFont = null;
  public static Font sDefaultTitleFont = null;
  public static Font sDefaultBigTitleFont = null;
  public static final Color sBORDERLINE = Color.LIGHT_GRAY;
  public static final String sId = "ALMAGUI";
  private static final String sPREFFEREDFONT = "Arial";
  private final String TEXT_STYLE_RED = "red";
  private final String TEXT_STYLE_GREEN = "green";
  private final String TEXT_STYLE_BLUE = "blue";
  private final String TEXT_STYLE_REGULAR = "regular";
  private static WriterThread outWriterIn = null;
  private static WriterThread errWriterIn = null;
  JTabbedPane tabbedPanel = null;//tengfei
  JPanel interaction = null;
  InteractionSimulationPanel interactionPanel = null;
  //private Hashtable<String, InteractionSimulationPanel> interactionPanels=new Hashtable<String, InteractionSimulationPanel>();
  
  private JMenuBar fMenuBar = null;
  private JMenu characterConfig = null;
  private JMenu groupConfig = null;
  private JPanel newCharPanel = null;
  private JTextField charName;
  private JButton okButton;
  private JLabel infoLabel;
  private JPanel statusPanel = null;
  private JLabel fStatus = new JLabel("AlmaGUI: Loading...");
  private Hashtable<String, Component> fActiveComponents = new Hashtable<String, Component>();
  private Hashtable<String, JMenuItem> fMenuNametoMenuItem = new Hashtable<String, JMenuItem>();
  private LinkedHashSet<String> fActiveMenuItems = new LinkedHashSet<String>();
  private JTextPane fConsoleTextPane = new JTextPane();
  private PipedInputStream fOutIn = null;
  private PipedInputStream fErrIn = null;
  private JDialog fSplashDialog = null;
  private JProgressBar progressBar = new JProgressBar();
  private int fProgessCnt = 0;
  private ConsoleInternalFrame fConsoleFrame = null;
  private static final FileFilter filter = new FileFilter() {

    public boolean accept(File file) {
      return file.getName().endsWith(".aml") || !file.isFile();
    }

    public String getDescription() {
      return "AffectML files (*.aml)";
    }
  };

  public AlmaGUI() {
    super("ALMA CharacterBuilder - " + buildVersion() + " - " + buildDetails());
    sAlmaGUI = this;
//    fOutIn = outIn;
//    fErrIn = errIn;
//    if ((fOutIn != null) && (fErrIn != null)) {
//      outWriterIn = new WriterThread(fOutIn);
//      outWriterIn.start();
//      errWriterIn = new WriterThread(fErrIn);
//      errWriterIn.start();
//    }
    try {
      System.setProperty("apple.laf.useScreenMenuBar", "true");
      System.setProperty("com.apple.mrj.application.apple.menu.about.name", "ALMA CharacterBuilder");
      System.out.println(UIManager.getSystemLookAndFeelClassName());
      if(UIManager.getSystemLookAndFeelClassName().equals("com.sun.java.swing.plaf.windows.WindowsLookAndFeel")){
    
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    sIntegratedDesktopMode = true;
    if (sALMAFrameIcon != null) {
      setIconImage(sALMAFrameIcon);
    }
    GraphicsEnvironment graphEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] availableFonts = graphEnv.getAvailableFontFamilyNames();
    sDefaultTextFont = getFont();
    sDefaultTitleFont = getFont();
    sDefaultBigTitleFont = getFont();
    for (String font : availableFonts) {
      if (font.equals(sPREFFEREDFONT)) {
        sDefaultTextFont = new Font(font, PLAIN, 11);
        sDefaultTitleFont = new Font(font, BOLD, 11);
        sDefaultBigTitleFont = new Font(font, BOLD, 12);
        setFont(sDefaultTextFont);
      }
    }
    // Make menus and tooltips heavyweight
    JPopupMenu.setDefaultLightWeightPopupEnabled(false);
    ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
    //Make the big window be indented 50 pixels from each edge
    //of the screen.
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   
    Point lastGUIPosition = getAlmaGUIPosition(sId, screenSize);
    Dimension lastGUISize = getAlmaGUISize(sId, screenSize);
    int lastGUIState = getAlmaGUIState(sId, screenSize);
    setExtendedState(lastGUIState);
   
    setBounds(lastGUIPosition.x, lastGUIPosition.y, lastGUISize.width, lastGUISize.height);
    sDesktopHelper.setAvailableSize(new Dimension(lastGUISize.width, lastGUISize.height));
    // setup the GUI
    Container content = getContentPane();
    
    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
    
    // add desktop pane
    //sAlmaDesktop = new JDesktopPane(); //a specialized layered pane
    //sAlmaDesktop.setBackground(Color.gray);
    //add(sAlmaDesktop);
    // add status bar
    //fStatus.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));


    tabbedPanel = new JTabbedPane();  
    //tabbedPanel.setOpaque(true);
    add(tabbedPanel);
    
   
    interaction = new JPanel();
    interaction.setLayout(new BoxLayout( interaction, BoxLayout.Y_AXIS));
    interaction.setBorder(        
          createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Interaction ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1)) );
    add(interaction);
 
    statusPanel = new JPanel();
    statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
    statusPanel.setMaximumSize(new Dimension(5000, 24));
    statusPanel.setMinimumSize(new Dimension(5000, 24));
    statusPanel.setPreferredSize(new Dimension(5000, 24));
    fStatus.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),
      BorderFactory.createEmptyBorder(1, 1, 1, 1)));
    //fStatus.setEditable(false);
    
    fStatus.setFont(sDefaultTextFont);
    fStatus.setMaximumSize(new Dimension(5000, 24));
    fStatus.setMinimumSize(new Dimension(5000, 24));
    fStatus.setPreferredSize(new Dimension(5000, 24));
    statusPanel.add(fStatus);
    add(statusPanel);
    
    //setContentPane(sAlmaDesktop);
    setJMenuBar(createFMenuBar());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fMenuBar.setEnabled(false);
    initStylesForTextPane(fConsoleTextPane);
    //Launch the console
    //PG: removed 31.8.2010 - createConsoleFrame();
   

    if (sALMALogo != null) {
      int logoXSize = sALMALogo.getIconWidth();
      int logoYSize = sALMALogo.getIconHeight();
      fSplashDialog = new JDialog(this);
      progressBar.setValue(0);
      progressBar.setBackground(Color.black);
      progressBar.setForeground(Color.white);
      progressBar.setBorderPainted(false);
      progressBar.setMinimumSize(new Dimension(logoXSize, 10));
      progressBar.setMaximumSize(new Dimension(logoXSize, 10));
      progressBar.setPreferredSize(new Dimension(logoXSize, 10));
      JPanel progressPanel = new JPanel();
      progressPanel.setLayout(new BoxLayout(progressPanel, BoxLayout.X_AXIS));
      progressPanel.add(progressBar);
      progressPanel.setSize(logoXSize, 10);
      JPanel logoPanel = new JPanel();
      logoPanel.setLayout(new BoxLayout(logoPanel, BoxLayout.X_AXIS));
      logoPanel.add(new JLabel(sALMALogo));
      JPanel allThingsPanel = new JPanel();
      allThingsPanel.setLayout(new BoxLayout(allThingsPanel, BoxLayout.Y_AXIS));
      allThingsPanel.setBackground(Color.black);
      allThingsPanel.add(logoPanel);
      allThingsPanel.add(progressPanel);
      fSplashDialog.setUndecorated(true);
      fSplashDialog.getContentPane().setLayout(new BoxLayout(fSplashDialog.getContentPane(),
        BoxLayout.Y_AXIS));
      fSplashDialog.getContentPane().add(allThingsPanel);
      fSplashDialog.toFront();
      fSplashDialog.setLocation(getCenter(logoXSize, logoYSize));
      fSplashDialog.pack();
      fSplashDialog.setVisible(true);
    }
    

    
    createCharacterConfigMenu();
    createGroupConfigMenu();

    //fMenuBar.setEnabled(true);
    sDesktopHelper.setAvailableSize(new Dimension(lastGUISize.width, lastGUISize.height - fMenuBar.getSize().height));
    // make visible after all is done
    setVisible(true);
    addComponentListener(this);
    // done
    //setStatus("Ready.");
    
  
  }
  
     public void createInteractionPanel(){
             //interaction panel
 
     InteractionSimulationInternalFrame interactionFrame= new InteractionSimulationInternalFrame();
     interactionPanel = interactionFrame.m_panel;
     interaction.add(interactionPanel);
         
     }
     
     public void createInteractionPanelTab(){
         this.remove(interaction);
         tabbedPanel.add("Interaction",interaction);
     }

  
      // create Anne and Bob panel
      public void creatCharacterPanel (final String characterName){
             
         //characterPanel contains all the staff of this character
         //JPanel characterPanel = new JPanel();
         //characterPanel.setOpaque(true);
         
         //contians basic information of this character including personality appraisal rules and affection monitor
         JPanel basicInfoPanel = new JPanel();
         //basicInfoPanel.setPreferredSize(new Dimension(1680,600));
         
         //contains interaction recorder
         //InteractionSimulationPanel interactionPanel = null;
 
 
         
         AffectMonitorPanelProcessing moodCubePanel = null;
         

         CharacterConfigPanel personalityPanel = null;
         CharacterAppraisalPanel appraisalPanel = null;
         CharacterAffectCompPanel computationPanel = null;
        
         JPanel personalityPanelContainer = new JPanel();
         personalityPanelContainer.setLayout(new BoxLayout(personalityPanelContainer, BoxLayout.Y_AXIS));
        
 
         JPanel appraisalPanelContainer = new JPanel();
         appraisalPanelContainer.setLayout(new BoxLayout(appraisalPanelContainer, BoxLayout.Y_AXIS));
         
         JPanel computationPanelContainer = new JPanel();
         computationPanelContainer.setLayout(new BoxLayout(computationPanelContainer, BoxLayout.Y_AXIS));
         
         //instance the three panels above
         AffectDefinition ad = AffectManager.sInterface.getDocumentManager().getAffectDefinition ();
          for (CharacterAffect characterAffectProfile: ad.getCharacterAffectList())

               if (characterName.equals(characterAffectProfile.getName())) {

                personalityPanel = new CharacterConfigPanel (characterName, characterAffectProfile);
                personalityPanelContainer.add(personalityPanel);
                personalityPanelContainer.add(Box.createVerticalStrut(5));
                appraisalPanel = new CharacterAppraisalPanel (characterName, characterAffectProfile);
                appraisalPanelContainer.add(appraisalPanel);
                appraisalPanelContainer.add(Box.createVerticalStrut(5));
                computationPanel = new CharacterAffectCompPanel (characterName, characterAffectProfile);
                computationPanelContainer.add(computationPanel);
                computationPanelContainer.add(Box.createVerticalStrut(5));
     
               }
          //personalityPanel.setOpaque(false);
          //appraisalPanel.setOpaque(false);
          //computationPanel.setOpaque(false);
          
          //moodcube Panel

           CharacterManager character = affectManager.getCharacterByName(characterName);
           AffectMonitorInternalFrame affectMonitor =
           new AffectMonitorInternalFrame(characterName,
               character.getCurrentEmotions(),
               character.getCurrentMood());
               character.setAffectMonitor((AffectMonitor) affectMonitor);
           moodCubePanel = affectMonitor.fAffectMonitorPanel;
           characterToMoodDisplay.put(characterName, moodCubePanel.moodDisplay);
          // moodCubePanel.setMinimumSize(new Dimension(500,600));
           moodCubePanel.setBorder(        
           createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Affection Monitor ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1)) );
 
   
          //JPanel tabsAndDelete = new JPanel();
          //tabsAndDelete.setLayout(new BoxLayout(tabsAndDelete, BoxLayout.Y_AXIS));
          
                  
          //character config panel
          JTabbedPane configTabs = new JTabbedPane(JTabbedPane.TOP);
         
          //tabsAndDelete.add(configTabs);
          //tabsAndDelete.add(Box.createVerticalGlue());
          //configTabs.setOpaque(false);
          //configTabs.setMaximumSize(new Dimension(200,600));
          configTabs.setTabPlacement(JTabbedPane.LEFT);
  
          //put everything together
          configTabs.addTab(null, personalityPanelContainer);
          configTabs.addTab(null, appraisalPanelContainer);
          configTabs.addTab(null, computationPanelContainer);
          
          
          // Create vertical labels to render tab titles
          if(UIManager.getSystemLookAndFeelClassName().equals("com.apple.laf.AquaLookAndFeel")){
              
                personalityPanelContainer.setOpaque(false);
                appraisalPanelContainer.setOpaque(false);
                computationPanelContainer.setOpaque(false);
                     	// Create vertical labels to render tab titles
		JLabel labTab1 = new JLabel("Personality");
		labTab1.setMinimumSize(mediumDescriptionsSize);
		labTab1.setPreferredSize(mediumDescriptionsSize);
		labTab1.setMaximumSize(mediumDescriptionsSize);
		labTab1.setUI(new VerticalLabelUI(false)); // true/false to make it upwards/downwards
		configTabs.setTabComponentAt(0, labTab1); // For component1

		JLabel labTab2 = new JLabel("Appraisal");
		labTab2.setMinimumSize(mediumDescriptionsSize);
		labTab2.setPreferredSize(mediumDescriptionsSize);
		labTab2.setMaximumSize(mediumDescriptionsSize);
		labTab2.setUI(new VerticalLabelUI(false));
		configTabs.setTabComponentAt(1, labTab2);

		JLabel labTab3 = new JLabel("Computation");
		labTab3.setUI(new VerticalLabelUI(false));
		labTab3.setMinimumSize(mediumDescriptionsSize);
		labTab3.setPreferredSize(mediumDescriptionsSize);
		labTab3.setMaximumSize(mediumDescriptionsSize);
		configTabs.setTabComponentAt(2, labTab3);
                   
          }
          else{
            
              
                      JLabel labTab1 = new JLabel("   Personality");
                      labTab1.setUI(new VerticalLabelUI(false)); // true/false to make it upwards/downwards   
                      labTab1.setMinimumSize(new Dimension(14,90));
                      labTab1.setPreferredSize(new Dimension(14,90));
                      labTab1.setMaximumSize(new Dimension(14,90));
                      configTabs.setTabComponentAt(0, labTab1); // For component1

                      JLabel labTab2 = new JLabel("   Appraisal");
                      labTab2.setUI(new VerticalLabelUI(false));   
                      labTab2.setMinimumSize(new Dimension(14,90));
                      labTab2.setPreferredSize(new Dimension(14,90));
                      labTab2.setMaximumSize(new Dimension(14,90));
                      configTabs.setTabComponentAt(1, labTab2); 

                      JLabel labTab3 = new JLabel("  Computation");
                      labTab3.setUI(new VerticalLabelUI(false));
                      labTab3.setMinimumSize(new Dimension(14,90));
                      labTab3.setPreferredSize(new Dimension(14,90));
                      labTab3.setMaximumSize(new Dimension(14,90));
                      configTabs.setTabComponentAt(2, labTab3);
          }
  

          //tabsAndDelete.add(configTabs);
          //tabsAndDelete.add(deleteButton);
         
          basicInfoPanel.setLayout(new BoxLayout(basicInfoPanel, BoxLayout.X_AXIS));
          basicInfoPanel.add(configTabs);
          basicInfoPanel.add(Box.createHorizontalStrut(8));
          basicInfoPanel.add(moodCubePanel);
         
          
          //characterPanel.setLayout(new BoxLayout(characterPanel, BoxLayout.Y_AXIS));
          
          //characterPanel.add(basicInfoPanel);
          //characterPanel.add(Box.createVerticalStrut(2));
          
          //creatInteractionPanel(characterName);
          //characterPanel.add(interaction);
          /*characterPanel.add(interactionPanel);
          interactionPanel.add(Box.createRigidArea(new Dimension(4, 4)));
          interactionPanel.setBorder(        
          createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Interaction ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1)) );*/


         int tabsNum =tabbedPanel.getTabCount();
         if(tabsNum >=1){
             tabbedPanel.insertTab("   "+characterName+"    ",null,basicInfoPanel,null,tabsNum-1);
         }else {
             tabbedPanel.insertTab("   "+characterName+"    ",null,basicInfoPanel,null,tabsNum);
         }
      
         
        
 
    }
      
      
     //"create new character" panel
     public void newCharacter(){
        
         newCharPanel = new JPanel();
         newCharPanel.setOpaque(false);
         JPanel contentPanel = new JPanel();
         contentPanel.setOpaque(false);
         JPanel middlePanel = new JPanel();
         middlePanel.setOpaque(false);
         middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
              
         contentPanel.setPreferredSize(new Dimension(400,20));
         contentPanel.setMaximumSize(new Dimension(400,20));
         contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
         //contentPanel.setBorder(        
         /* createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " new character", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1)) );*/
         newCharPanel.setLayout(new BoxLayout(newCharPanel, BoxLayout.X_AXIS));
         newCharPanel.add(Box.createHorizontalGlue());
         newCharPanel.add(middlePanel);
         newCharPanel.add(Box.createHorizontalGlue());
         infoLabel = new JLabel("Name:");  
         infoLabel.setOpaque(false);
         
         charName = new JTextField();
         charName.setOpaque(false);
         okButton = new JButton();
         okButton.setText("Create");
         okButton.setActionCommand("creat");
         okButton.addActionListener(this);
         contentPanel.add(infoLabel);
         contentPanel.add(charName);
         charName.add(Box.createVerticalStrut(10));
         contentPanel.add(okButton);
         middlePanel.add(Box.createHorizontalGlue());
         middlePanel.add("Center",contentPanel);
         middlePanel.add(Box.createHorizontalGlue());
 
         tabbedPanel.add(" New Character ",newCharPanel);

         setStatus("Ready.");
         
     }

    /*public void creatCharacterPanel(String characterName) {
        // show(new CharacterConfigInternalFrame(characterName), true);
         
         //characterPanel contains all the staff of this character
         JPanel characterPanel = new JPanel();
         
         //contians basic information of this character
         JPanel basicInfoPanel = new JPanel();
         basicInfoPanel.setPreferredSize(new Dimension(1680,600));
         
         //contains interaction recorder
         InteractionSimulationPanel interactionPanel = null;
         //interactionPanel.setLayout(new BoxLayout(interactionPanel, BoxLayout.X_AXIS));
         //contians two panels: personality and conputation panel
         JPanel personCompPanel = new JPanel();
 
         
         AffectMonitorPanelTest moodCubePanel = null;
         

         CharacterConfigPanel personalityPanel = null;
         CharacterAppraisalPanel appraisalPanel = null;
         CharacterAffectCompPanel computationPanel = null;
         
         //CharacterConfigInternalFrame chaCon = new CharacterConfigInternalFrame(characterName);
         //personalityPanel = chaCon.fCharacterConfigPanel;
         //appraisalPanel = chaCon.fCharacterAppraisalPanel;
         //computationPanel =chaCon.fCharacterAffectCompPanel;
         
         AffectDefinition ad = AffectManager.sInterface.getDocumentManager().getAffectDefinition ();
          for (CharacterAffect characterAffectProfile: ad.getCharacterAffectList())

               if (characterName.equals(characterAffectProfile.getName())) {

                personalityPanel = new CharacterConfigPanel (characterName, characterAffectProfile);
                appraisalPanel = new CharacterAppraisalPanel (characterName, characterAffectProfile);
                appraisalPanel.setBorder(        
          createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Appraisal ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1)) );
                computationPanel = new CharacterAffectCompPanel (characterName, characterAffectProfile);

     
               }
         
          //moodcube Panel

           CharacterManager character = affectManager.getCharacterByName(characterName);
           AffectMonitorInternalFrame affectMonitor =
           new AffectMonitorInternalFrame(characterName,
               character.getCurrentEmotions(),
               character.getCurrentMood());
               character.setAffectMonitor((AffectMonitor) affectMonitor);
           moodCubePanel = affectMonitor.fAffectMonitorPanel;
           moodCubePanel.setBorder(        
          createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Affection Monitor ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1)) );
 
   
          //interaction panel
          InteractionSimulationInternalFrame interaction= new InteractionSimulationInternalFrame();
          interactionPanel = interaction.m_panel;
          
          personCompPanel.setLayout(new BoxLayout(personCompPanel, BoxLayout.Y_AXIS));
          personCompPanel.add(personalityPanel);
   
          personCompPanel.setBorder(        
          createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Personality and Computation ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1)) );
          personCompPanel.add(Box.createRigidArea(new Dimension(4, 4)));
         
         // personCompPanel.add(computationPanel);
          
          basicInfoPanel.setLayout(new BoxLayout(basicInfoPanel, BoxLayout.X_AXIS));
          basicInfoPanel.add(personCompPanel);
          basicInfoPanel.add(Box.createHorizontalStrut(8));
          basicInfoPanel.add(appraisalPanel);
          basicInfoPanel.add(Box.createHorizontalStrut(8));
          basicInfoPanel.add(moodCubePanel);
         
          
          characterPanel.setLayout(new BoxLayout(characterPanel, BoxLayout.Y_AXIS));
          characterPanel.add(basicInfoPanel);
          characterPanel.add(Box.createVerticalStrut(10));
          characterPanel.add(interactionPanel);
          interactionPanel.add(Box.createRigidArea(new Dimension(4, 4)));
          interactionPanel.setBorder(        
          createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Interaction ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1)) );


          tabbedPanel.add(" "+characterName+" ",characterPanel);
          
          
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
       
    }*/



  class WriterThread extends Thread {

    private BufferedReader in = null;
    private InputStreamReader fInStreamReader = null;
    private volatile boolean running = true;

    public WriterThread(PipedInputStream stream) {
      fInStreamReader = new InputStreamReader(stream);
      in = new BufferedReader(fInStreamReader);
    }

    public void myStop() {
      running = false;
    }

    public void run() {
      StyledDocument doc = fConsoleTextPane.getStyledDocument();
      while (running) {
        try {
          int length = doc.getLength();
          String line = in.readLine();
          if (line != null) {
            if (length > 50000) {
              doc.remove(0, length - 50000);
            }
            String s2 = line.toLowerCase();
            if (s2.startsWith("severe")) {
              doc.insertString(doc.getLength(), line.substring(7) + "\n",
                fConsoleTextPane.getStyle(TEXT_STYLE_RED));
            } else if (s2.startsWith("warning")) {
              doc.insertString(doc.getLength(), line.substring(9) + "\n",
                fConsoleTextPane.getStyle(TEXT_STYLE_RED));
            } else if (s2.startsWith("warnung")) {
              doc.insertString(doc.getLength(), line.substring(9) + "\n",
                fConsoleTextPane.getStyle(TEXT_STYLE_RED));
            } else if (s2.startsWith("info")) {
              doc.insertString(doc.getLength(), line.substring(6) + "\n",
                fConsoleTextPane.getStyle(TEXT_STYLE_GREEN));
            } else if (s2.startsWith("node:end")) {
              doc.insertString(doc.getLength(), line + "\n",
                fConsoleTextPane.getStyle(TEXT_STYLE_RED));
            } else if (s2.startsWith("scene")) {
              doc.insertString(doc.getLength(), line + "\n",
                fConsoleTextPane.getStyle(TEXT_STYLE_BLUE));
            } else {
              doc.insertString(doc.getLength(), line + "\n",
                fConsoleTextPane.getStyle(TEXT_STYLE_REGULAR));
            }
            fConsoleTextPane.setCaretPosition(doc.getLength());
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
      try {
        fInStreamReader.close();
        in.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  private void initStylesForTextPane(JTextPane textPane) {
    //Initialize some styles.
    Style def = StyleContext.getDefaultStyleContext().
      getStyle(StyleContext.DEFAULT_STYLE);

    Style regular = textPane.addStyle(TEXT_STYLE_REGULAR, def);
    StyleConstants.setFontFamily(def, "SansSerif");

    Style s = textPane.addStyle(TEXT_STYLE_RED, regular);
    StyleConstants.setBold(s, true);
    StyleConstants.setForeground(s, Color.red);

    s = textPane.addStyle(TEXT_STYLE_GREEN, regular);
    StyleConstants.setBold(s, true);
    StyleConstants.setForeground(s, Color.green.darker());

    s = textPane.addStyle(TEXT_STYLE_BLUE, regular);
    StyleConstants.setBold(s, true);
    StyleConstants.setForeground(s, Color.blue.darker());
  }

  public void biasProgressBar(int max) {
    if (fSplashDialog != null) {
      progressBar.setMaximum(max);
      fProgessCnt = 0;
    }
  }

  public void monitorProgress() {
    if (fSplashDialog != null) {
      progressBar.setValue(fProgessCnt++);
    }
  }

  public void hideSplashDialog() {
    if (fSplashDialog != null) {
      Thread DelayedSplashScreenHider = new Thread() {

        public void run() {
          try {
            this.sleep(1250);
          } catch (Exception e) {
            e.printStackTrace();
          }
          fSplashDialog.setVisible(false);
        }
      };
      DelayedSplashScreenHider.start();
    }
  }

  /*public void checkJava3DPresence() {
    try {
      Class java3d = Class.forName("javax.media.j3d.Canvas3D");
      AffectManager.sLog.info("Java3D is available.");
    } catch (ClassNotFoundException cnfe) {
      AffectManager.sLog.warning("Java3D library not found - affect monitor will not work!");
      // display popup!
      JOptionPane.showMessageDialog(this, "Java3D library not found - affect monitor will not work!", "Warning", JOptionPane.WARNING_MESSAGE);
    }
  }*/

  public String getDesktopSizeID() {
    Dimension desktopSize = new Dimension();
    this.getSize(desktopSize);
    return desktopSize.width + "x" + desktopSize.height;
  }

  public void setStatus(String status) {
    fStatus.setText(status);
  }

  public void menuItemControl(String menuItemName) {
    JMenuItem menuItem = fMenuNametoMenuItem.get(menuItemName);
    // DEBUG log.info("MenuItemControl " + menuItemName);
    if (fActiveMenuItems.contains(menuItemName)) {
      fActiveMenuItems.remove(menuItemName);
      menuItem.setEnabled(true);
    } else {
      fActiveMenuItems.add(menuItemName);
      menuItem.setEnabled(false);
    }
  }

  public synchronized void createCharacterConfigMenu() {
    characterConfig.removeAll();
    // list characters if available
    JMenuItem resetCharacterItem = new JMenuItem("Reset All Characters");
    resetCharacterItem.setEnabled(false);
    if (affectManager.getDocumentManager().getAffectDefinition() != null) {
      try {
        // add characters
        CharacterAffect[] characterAffectProfiles =
          affectManager.getDocumentManager().getAffectDefinition().getCharacterAffectList().toArray(new CharacterAffect[0]);
        for (CharacterAffect characterAffectProfile : characterAffectProfiles) {
          createCharacterMenu(characterAffectProfile.getName());
        }
        resetCharacterItem.setEnabled(true);
      } catch (Exception e) {
        e.printStackTrace();
        AffectManager.sLog.severe("Error loading character configuration!");
      }
    }
    characterConfig.addSeparator();
    fMenuNametoMenuItem.put("ResetCharacters", resetCharacterItem);
    resetCharacterItem.setActionCommand("ResetCharacters");
    resetCharacterItem.addActionListener(this);
    characterConfig.add(resetCharacterItem);
    // add basic functionality
    JMenuItem newCharacterItem = new JMenuItem("New Character");
    fMenuNametoMenuItem.put("NewCharacter", newCharacterItem);
    newCharacterItem.setActionCommand("NewCharacter");
    newCharacterItem.addActionListener(this);
    characterConfig.add(newCharacterItem);
  }

  public synchronized void createCharacterMenu(String characterName) {
    JMenu menuItem = new JMenu(characterName);
    JMenuItem personalityItem = new JMenuItem("Configuration");
    fMenuNametoMenuItem.put(characterName + "Configuration", personalityItem);
    personalityItem.setActionCommand(characterName + "_characterconfig");
    personalityItem.addActionListener(this);
    menuItem.add(personalityItem);
    JMenuItem removeCharacterItem = new JMenuItem("Remove");
    fMenuNametoMenuItem.put(characterName + "Remove", removeCharacterItem);
    removeCharacterItem.setActionCommand(characterName + "_characterremove");
    removeCharacterItem.addActionListener(this);
    menuItem.add(removeCharacterItem);
    JMenuItem resetCharacterItem = new JMenuItem("Reset");
    fMenuNametoMenuItem.put(characterName + "Reset", resetCharacterItem);
    resetCharacterItem.setActionCommand(characterName + "_characterreset");
    resetCharacterItem.addActionListener(this);
    menuItem.add(resetCharacterItem);
    JMenuItem monitorItem = new JMenuItem("Show Monitor");
    fMenuNametoMenuItem.put(characterName + "Monitor", monitorItem);
    monitorItem.setActionCommand(characterName + "_charactermonitor");
    monitorItem.addActionListener(this);
    menuItem.add(monitorItem);
    JMenuItem statusItem = new JMenuItem("Show Status");
    fMenuNametoMenuItem.put(characterName + "Status", statusItem);
    statusItem.setActionCommand(characterName + "_characterstatus");
    statusItem.addActionListener(this);
    menuItem.add(statusItem);
    characterConfig.add(menuItem);
  }

  public synchronized void createGroupConfigMenu() {
    groupConfig.removeAll();
    JMenuItem resetGroupItem = new JMenuItem("Reset All Groups");
    resetGroupItem.setEnabled(false);
    JMenuItem interactionSimulation = new JMenuItem("Interaction Recorder");
    interactionSimulation.setEnabled(false);
    JMenuItem newGroupItem = new JMenuItem("New Group");
    newGroupItem.setEnabled(false);
    if ((affectManager.getDocumentManager().getAffectDefinition() != null)
      && (affectManager.getDocumentManager().getAffectDefinition().sizeOfCharacterAffectArray() > 1)) {
      // enable interaction simulation only if at least one group exists
      if (affectManager.getDocumentManager().getAffectDefinition().getGroupAffectList().size() > 0) {
        interactionSimulation.setEnabled(true);
      }
      try {
        resetGroupItem.setEnabled(true);
        newGroupItem.setEnabled(true);
        // add groups
        GroupAffect[] groupAffectProfiles =
          affectManager.getDocumentManager().getAffectDefinition().getGroupAffectList().toArray(new GroupAffect[0]);
        for (GroupAffect groupAffectProfile : groupAffectProfiles) {
          createGroupMenu(groupAffectProfile.getName());
        }
      } catch (Exception e) {
        e.printStackTrace();
        AffectManager.sLog.severe("Error loading group configuration!");
      }
    }
    groupConfig.addSeparator();
    fMenuNametoMenuItem.put("NewGroup", newGroupItem);
    newGroupItem.setActionCommand("NewGroup");
    newGroupItem.addActionListener(this);
    groupConfig.add(newGroupItem);
    fMenuNametoMenuItem.put("ResetGroups", resetGroupItem);
    resetGroupItem.setActionCommand("ResetGroups");
    resetGroupItem.addActionListener(this);
    groupConfig.add(resetGroupItem);
    groupConfig.addSeparator();
    fMenuNametoMenuItem.put("InteractionSimulation", interactionSimulation);
    interactionSimulation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
    interactionSimulation.setActionCommand("InteractionSimulation");
    interactionSimulation.addActionListener(this);
    groupConfig.add(interactionSimulation);
  }

  public synchronized void createGroupMenu(String groupName) {
    JMenu menuItem = new JMenu(groupName);
    JMenuItem personalityItem = new JMenuItem("Configuration");
    fMenuNametoMenuItem.put(groupName + "Configuration", personalityItem);
    personalityItem.setActionCommand(groupName + "_groupconfig");
    personalityItem.addActionListener(this);
    menuItem.add(personalityItem);
    JMenuItem removeGroupItem = new JMenuItem("Remove");
    fMenuNametoMenuItem.put(groupName + "Remove", removeGroupItem);
    removeGroupItem.setActionCommand(groupName + "_groupremove");
    removeGroupItem.addActionListener(this);
    menuItem.add(removeGroupItem);
    JMenuItem resetGroupItem = new JMenuItem("Reset");
    fMenuNametoMenuItem.put(groupName + "Reset", resetGroupItem);
    resetGroupItem.setActionCommand(groupName + "_groupreset");
    resetGroupItem.addActionListener(this);
    menuItem.add(resetGroupItem);
    JMenuItem monitorItem = new JMenuItem("Show Monitor");
    fMenuNametoMenuItem.put(groupName + "Monitor", monitorItem);
    monitorItem.setActionCommand(groupName + "_groupmonitor");
    monitorItem.addActionListener(this);
    menuItem.add(monitorItem);
    groupConfig.add(menuItem);
  }

  protected JMenuBar createFMenuBar() {
    fMenuBar = new JMenuBar();
    JMenu menu = new JMenu("File");
    menu.setMnemonic(KeyEvent.VK_F);
    fMenuBar.add(menu);
    characterConfig = new JMenu("Characters");
    characterConfig.setMnemonic(KeyEvent.VK_C);
    //fMenuBar.add(characterConfig);
    groupConfig = new JMenu("Groups");
    groupConfig.setMnemonic(KeyEvent.VK_G);
    //fMenuBar.add(groupConfig);
    //JMenu system = new JMenu("System");
    //system.setMnemonic(KeyEvent.VK_S);
    //fMenuBar.add(system);
    //fMenuBar.add(new Box.Filler(new Dimension(10, 10), new Dimension(10, 10), new Dimension(5000, 5000)));
    JMenu helpMenu = new JMenu("Help");
    helpMenu.setMnemonic(KeyEvent.VK_H);
    fMenuBar.add(helpMenu);

    //Set up the file menu item.
    JMenu loadMenu = new JMenu("Load");
    JMenuItem menuItem = new JMenuItem("Computation Parameters");
    menuItem.setActionCommand("loadComputation");
    menuItem.addActionListener(this);
    loadMenu.add(menuItem);
    menuItem = new JMenuItem("Character Specification");
    menuItem.setActionCommand("loadDefinition");
    menuItem.addActionListener(this);
    loadMenu.add(menuItem);
    menu.add(loadMenu);
    JMenu saveMenu = new JMenu("Save");
    menuItem = new JMenuItem("Computation Parameters");
    menuItem.setActionCommand("saveComputation");
    menuItem.addActionListener(this);
    saveMenu.add(menuItem);
    menuItem = new JMenuItem("Character Specification");
    menuItem.setActionCommand("saveDefinition");
    menuItem.addActionListener(this);
    saveMenu.add(menuItem);
    menu.add(saveMenu);
    menu.addSeparator();
    menuItem = new JMenuItem("Exit");
    fMenuNametoMenuItem.put("Exit", menuItem);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
    menuItem.setActionCommand("exit");
    menuItem.addActionListener(this);
    menu.add(menuItem);

    //Set up the system menu item.
//    menuItem = new JMenuItem("Options");
//    fMenuNametoMenuItem.put("Options", menuItem);
//    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
//    menuItem.setActionCommand("config");
//    menuItem.addActionListener(this);
//    system.add(menuItem);
    menuItem = new JMenuItem("Computation Parameters");
    fMenuNametoMenuItem.put("CompParams", menuItem);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
    menuItem.setActionCommand("params");
    menuItem.addActionListener(this);
    //system.add(menuItem);
//    menuItem = new JMenuItem("Console");
//    fMenuNametoMenuItem.put("Console", menuItem);
//    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
//    menuItem.setActionCommand("console");
//    menuItem.addActionListener(this);
//    system.add(menuItem);

    //Set up the help menu items.
    menuItem = new JMenuItem("Index");
    fMenuNametoMenuItem.put("HelpIndex", menuItem);
    menuItem.setMnemonic(KeyEvent.VK_I);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
    menuItem.setActionCommand("helpindex");
    menuItem.addActionListener(this);
    helpMenu.add(menuItem);

    
    //set up the about menu(tengfei)
    JMenu aboutMenu = new JMenu("About");
    menuItem = new JMenuItem("About");
    //fMenuNametoMenuItem.put("About", menuItem);
    menuItem.setActionCommand("about");
    menuItem.addActionListener(this);
    aboutMenu.add(menuItem);
    fMenuBar.add(aboutMenu);
    return fMenuBar;
  }

  public synchronized void removeCharacter(String name) {
    for (int i = 0; i < characterConfig.getItemCount(); ++i) {
      try {
        if (characterConfig.getItem(i).getText().equals(name)) {
          // remove menu entry
          characterConfig.remove(i);
          characterToMoodDisplay.remove(name);

          // kill affect monitor
          AffectMonitorInternalFrame monitor = (AffectMonitorInternalFrame) fActiveComponents.remove(name + "Monitor");
          //AffectMonitorFrame monitor = (AffectMonitorFrame) fActiveComponents.remove(name + "Monitor");
          if (monitor != null) {
            monitor.dispose();
          }

          // remove internal represenation
          affectManager.removeCharacter(name);
          break;
        }
      } catch (Exception e) {
      }
    }
  }

  public synchronized void removeGroup(String name) {
    for (int i = 0; i < groupConfig.getItemCount(); ++i) {
      try {
        if (groupConfig.getItem(i).getText().equals(name)) {
          // remove menu entry
          groupConfig.remove(i);

          // kill affect monitor
          AffectMonitorInternalFrame monitor = (AffectMonitorInternalFrame) fActiveComponents.remove(name + "Monitor");
          //AffectMonitorFrame monitor = (AffectMonitorFrame) fActiveComponents.remove(name + "Monitor");
          if (monitor != null) {
            monitor.dispose();
          }

          // remove internal represenation
          affectManager.removeGroup(name);
          break;
        }
      } catch (Exception e) {
      }
    }
  }

  //React to menu selections.
  public void actionPerformed(ActionEvent e) {
    String actionCmd = e.getActionCommand();
    // DEBUG log.info("ALMAGUI action command " + actionCmd);

    // options dialog
    if ("config".equals(actionCmd)) {
      show(new AlmaConfigInternalFrame(), true);
    } // computation parameters dialog
    
    //add character Ok button by tengfei wang
    else if("creat".equals(actionCmd)){
        System.out.println("OK button pressed");
        String newCharacterName = null;
     
       try {
          // empty character names make no sense
            
          if ((newCharacterName=charName.getText()).length() == 0) {
            JOptionPane.showMessageDialog(sAlmaDesktop, "A character name must not be empty.",
              "Invalid name", ERROR_MESSAGE);
           
          }

          // add character
          else{
          affectManager.addCharacter(newCharacterName);  
          creatCharacterPanel(newCharacterName);//tengfei
          //System.out.println(affectManager.getCharacters().length);
          tabbedPanel.setSelectedIndex(affectManager.getCharacters().length-1);
          createCharacterConfigMenu();
          createGroupConfigMenu();
          
         
          interaction.removeAll();
          InteractionSimulationInternalFrame interactionFrame= new InteractionSimulationInternalFrame();
          interactionPanel = interactionFrame.m_panel;
          interaction.add(interactionPanel);
          
        }
       }catch (IllegalArgumentException exception) {
          JOptionPane.showMessageDialog(sAlmaDesktop, "A character called " + newCharacterName + " already exists.",
            "Character exists", ERROR_MESSAGE);
        }
      
        
    }
    else if ("params".equals(actionCmd)) {
      show(new ParamsInternalFrame(), true);
    } //    // show console
    //    else if ("console".equals(actionCmd)) {
    //      createConsoleFrame();
    //    }
    // load
    else if (actionCmd.startsWith("load")) {
      JFileChooser chooser = new JFileChooser();
      if (sALMAConfigPath != null) {
        chooser.setCurrentDirectory(sALMAConfigPath);
      } else {
        chooser.setCurrentDirectory(sALMAWorkDirectory);
      }
      chooser.setFileFilter(filter);

      // show dialog
      if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        File file = chooser.getSelectedFile();
        if (!file.getName().endsWith(".aml")) {
          file = new File(file.getAbsolutePath() + ".aml");
        }

        // load affect computation
        if (actionCmd.endsWith("Computation")) {
          affectManager.initComputation(affectManager.getDocumentManager().loadAffectComputation(file));
        } // load affect definition
        else {
          disposeFrames();
          AffectDefinition definition = affectManager.getDocumentManager().loadAffectDefinition(file);
          affectManager.initCharacters(definition);
          affectManager.initGroups(definition);
          createCharacterConfigMenu();
          createGroupConfigMenu();
        
        }
      }
    } // save
    else if (actionCmd.startsWith("save")) {
      JFileChooser chooser = new JFileChooser();
      if (sALMAConfigPath != null) {
        chooser.setCurrentDirectory(sALMAConfigPath);
      } else {
        chooser.setCurrentDirectory(sALMAWorkDirectory);
      }
      if (actionCmd.endsWith("Computation")) {
        if (sALMAComputationConfigFile != null) {
          chooser.setSelectedFile(sALMAComputationConfigFile);
        }
      } else {
        if (sALMACharacterConfigFile != null) {
          chooser.setSelectedFile(sALMACharacterConfigFile);
        }
      }
      chooser.setFileFilter(filter);

      // show dialog
      if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
        File file = chooser.getSelectedFile();
        if (!file.getName().endsWith(".aml")) {
          file = new File(file.getAbsolutePath() + ".aml");
        }

        // save affect computation
        if (actionCmd.endsWith("Computation")) {
          affectManager.getDocumentManager().saveAffectComputationParams(file);
        } // save affect definition
        else {
          affectManager.getDocumentManager().saveAffectDefinition(file);
        }
      }
    } // quit
    else if ("exit".equals(actionCmd)) {
      quit();
    } // create new character
   /* else if (actionCmd.equals("NewCharacter")) {
      String name = null;
      while ((name = JOptionPane.showInputDialog(sAlmaDesktop, "Name of new character:",
        "Character name", QUESTION_MESSAGE)) != null) {
        try {
          // empty character names make no sense
          if (name.length() == 0) {
            JOptionPane.showMessageDialog(sAlmaDesktop, "A character name must not be empty.",
              "Invalid name", ERROR_MESSAGE);
            continue;
          }

          // add character
          affectManager.addCharacter(name);
          createCharacterConfigMenu();
          createGroupConfigMenu();
          break;
        } catch (IllegalArgumentException exception) {
          JOptionPane.showMessageDialog(sAlmaDesktop, "A character called " + name + " already exists.",
            "Character exists", ERROR_MESSAGE);
        }
      }
    } // handle character stuff*/
    else if (actionCmd.contains("_character")) {
      String name = actionCmd.substring(0, actionCmd.indexOf("_"));
      if (actionCmd.endsWith("config")) {
        show(new CharacterConfigInternalFrame(name), true);
      } else if (actionCmd.endsWith("monitor")) {
        createAffectMonitorFrame(name);
      } else if (actionCmd.endsWith("status")) {
        createAffectStatusFrame(name);
      } else if (actionCmd.endsWith("remove")) {
        if (JOptionPane.showConfirmDialog(sAlmaDesktop, "Delete character " + name + "?",
          "Delete character", ERROR_MESSAGE) == YES_OPTION) {
          removeCharacter(name);
          createCharacterConfigMenu();
          createGroupConfigMenu();
        }
      }
    } // create new group
    else if (actionCmd.equals("NewGroup")) {
      GroupCreationDialog dialog = new GroupCreationDialog(this, affectManager.getCharacters());
      dialog.setVisible(true);
      while (dialog.status()) {
        // do the thing
        try {
          // hide dialog
          dialog.setVisible(false);

          // check if characters used
          if (dialog.usedCharacters() < 2) {
            JOptionPane.showMessageDialog(sAlmaDesktop, "A group must have at least two members.",
              "Not enough members", ERROR_MESSAGE);
          } // empty group names make no sense
          else if (dialog.name().length() == 0) {
            JOptionPane.showMessageDialog(sAlmaDesktop, "A group name must not be empty.",
              "Invalid name", ERROR_MESSAGE);
          } // add group
          else {
            affectManager.addGroup(dialog.name(), dialog.characters());
            createGroupMenu(dialog.name());
            break;
          }
        } catch (IllegalArgumentException exception) {
          JOptionPane.showMessageDialog(sAlmaDesktop, "A group called " + dialog.name() + " already exists.",
            "Group exists", ERROR_MESSAGE);
        }
        // show the dialog again
        dialog.setVisible(true);
      }
      createGroupConfigMenu();
    } // handle group stuff
    else if (actionCmd.contains("_group")) {
      String name = actionCmd.substring(0, actionCmd.indexOf("_"));
      if (actionCmd.endsWith("config")) {
        show(new GroupConfigInternalFrame(name), true);
      } else if (actionCmd.endsWith("monitor")) {
        createGroupAffectMonitorFrame(name);
      } else if (actionCmd.endsWith("remove")) {
        if (JOptionPane.showConfirmDialog(sAlmaDesktop, "Delete group " + name + "?",
          "Delete group", ERROR_MESSAGE) == YES_OPTION) {
          removeGroup(name);
          createGroupConfigMenu();
        }
      }
    } // other stuff
    else if (e.getActionCommand().contains("helpindex")) {
      show(new HelpInternalFrame(), true);
    } else if (e.getActionCommand().contains("about")) {
      new AlmaAboutDialog(this, "About ALMA ...");
    } else if (e.getActionCommand().contains("InteractionSimulation")) {
      show(new InteractionSimulationInternalFrame(), true);
    }
  }

  // Implementation of ComponentListener
  public void componentHidden(ComponentEvent e) {
  }

  public void componentMoved(ComponentEvent e) {
    Component comp = e.getComponent();
    if (comp == this) {
      saveAlmaGUIPosition(this, Toolkit.getDefaultToolkit().getScreenSize());
    }
  }

  public void componentResized(ComponentEvent e) {
    Component comp = e.getComponent();
    if (comp == this) {
      Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
      saveAlmaGUIPosition(this, size);
      sDesktopHelper.setAvailableSize(new Dimension(this.getSize().width, this.getSize().height));
//       for (Enumeration<String> cEnum = fActiveComponents.keys(); cEnum.hasMoreElements();) {
// 	Component actComp = (fActiveComponents.get(cEnum.nextElement()));
// 	actComp.setLocation(getLastPosition(((AlmaInternalFrame)actComp).getId()));
      // }
    }
  }

  public void componentShown(ComponentEvent e) {
  }

  // Implementation of InternalFrameListener
  public void internalFrameOpened(InternalFrameEvent e) {
    //TODO
    menuItemControl(((AlmaInternalFrame) e.getInternalFrame()).getId());
  }

  // Implementation of InternalFrameListener
  public void internalFrameClosing(InternalFrameEvent e) {
    //TODO
    menuItemControl(((AlmaInternalFrame) e.getInternalFrame()).getId());
  }

  // Implementation of InternalFrameListener
  public void internalFrameClosed(InternalFrameEvent e) {
//     String event = e.paramString();
//     log.info("event " + event);
  }
  // Implementation of InternalFrameListener

  public void internalFrameIconified(InternalFrameEvent e) {
//     String event = e.paramString();
//     log.info("event " + event);
  }
  // Implementation of InternalFrameListener

  public void internalFrameDeiconified(InternalFrameEvent e) {
//     String event = e.paramString();
//     log.info("event " + event);
  }
  // Implementation of InternalFrameListener

  public void internalFrameActivated(InternalFrameEvent e) {
//     String event = e.paramString();
//     log.info("event " + event);
  }
  // Implementation of InternalFrameListener

  public void internalFrameDeactivated(InternalFrameEvent e) {
//     String event = e.paramString();
//     log.info("event " + event);
  }

  // show frame
  protected void show(JInternalFrame frame, boolean add) {
    frame.setVisible(true);
    if (add) {
      sAlmaDesktop.add(frame);
    }
    fActiveComponents.put(((AlmaInternalFrame) frame).getId(), frame);
    try {
      frame.setSelected(true);
    } catch (java.beans.PropertyVetoException e) {
    }
  }
  

  //Create a new internal console frame.
  protected void createConsoleFrame() {
    show(fConsoleFrame = (fConsoleFrame == null)
      ? new ConsoleInternalFrame(fConsoleTextPane) : fConsoleFrame, true);
    try {
      fConsoleFrame.setIcon(true);
    } catch (java.beans.PropertyVetoException e) {
    }
  }

  //Create a new affect monitor internal frame.
  protected void createAffectMonitorFrame(String characterName) {
    try {
      CharacterManager character = affectManager.getCharacterByName(characterName);
      AffectMonitorInternalFrame affectMonitor =
        new AffectMonitorInternalFrame(characterName,
       // affectMonitor =
       //new AffectMonitorFrame(characterName,
        character.getCurrentEmotions(),
        character.getCurrentMood());
      character.setAffectMonitor((AffectMonitor) affectMonitor);
      affectMonitor.setVisible(true);//tengfei's modification
      //show(affectMonitor, false);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  //Create a new affect status internal frame.
  protected void createAffectStatusFrame(String characterName) {
    try {
      CharacterManager character = affectManager.getCharacterByName(characterName);
      AffectStatusInternalFrame affectStatus =
        new AffectStatusInternalFrame(characterName,
        character.getCurrentEmotions(),
        character.getCurrentMood());
      character.setAffectStatusDisplay((AffectStatusDisplay) affectStatus);
      show(affectStatus, true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  //Create a new group affect internal frame.
  protected void createGroupAffectMonitorFrame(String groupName) {
    try {
      GroupManager group = affectManager.getGroupByName(groupName);
      GroupAffectMonitorInternalFrame groupAffectMonitor =
        new GroupAffectMonitorInternalFrame(groupName,
        group.getCurrentEmotions(),
        group.getCurrentMood(),
        group.getSocialIntegrity(),
        group.getCharactersInSimilarMood(),
        group.getCharactersInExtremeMood());
      group.setAffectMonitor((GroupAffectMonitor) groupAffectMonitor);
      show(groupAffectMonitor, false);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  //Dispose some frames
  protected void disposeFrames() {
    for (JInternalFrame frame : sAlmaDesktop.getAllFrames()) {
      String id = ((AlmaInternalFrame) frame).getId();
      if (id.endsWith("Monitor") || id.endsWith("Configuration") || id.equals("InteractionSimulation")) {
        frame.dispose();
      }
    }
  }

  /** Returns the id of an internal frame. This is used for the internal frame 
   * handling for an integrated desktop.
   *
   * @return the id of a frame
   *
   */
  public String getId() {
    return sId;
  }

  //Quit the application.
  protected void quit() {
    System.exit(0);
  }
}
