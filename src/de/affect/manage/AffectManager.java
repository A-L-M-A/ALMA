/*
 * AffectManager.java
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
package de.affect.manage;

import de.affect.appraisal.AppraisalVariables;
import de.affect.appraisal.eec.Agency;
import de.affect.appraisal.eec.Appealingness;
import de.affect.appraisal.eec.Desirability;
import de.affect.appraisal.eec.Likelihood;
import de.affect.appraisal.eec.Liking;
import de.affect.appraisal.eec.Praiseworthiness;
import de.affect.appraisal.eec.Realization;
import de.affect.compute.DecayFunction;
import de.affect.compute.ExponentialDecayFunction;
import de.affect.compute.LinearDecayFunction;
import de.affect.compute.TangensHyperbolicusDecayFunction;
import de.affect.data.ActType;
import de.affect.data.AffectConsts;
import de.affect.emotion.EmotionType;
import static de.affect.emotion.EmotionType.*;
import static de.affect.emotion.EmotionsPADRelation.*;
import de.affect.gui.AlmaGUI;
import de.affect.gui.CharacterConfigInternalFrame;
import de.affect.gui.DesktopHelper;
import static de.affect.manage.AffectOutputCreater.*;

import static de.affect.manage.AppraisalRuleReader.readAppraisalRules;
import de.affect.manage.event.AffectInputEvent;
import de.affect.manage.event.AffectInputListener;
import de.affect.manage.event.AffectUpdateEvent;
import de.affect.manage.event.AffectUpdateListener;
import de.affect.mood.Mood;
import de.affect.personality.Personality;
import de.affect.personality.PersonalityEmotionsRelations;
import static de.affect.personality.PersonalityMoodRelations.*;
import de.affect.tools.AffectScriptPlayer;
import static de.affect.util.Convert.doubleValue;
import static de.affect.util.FileHelper.*;
import de.affect.xml.AffectComputationDocument.AffectComputation;
import de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.*;
import de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification;
import de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.*;
import de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification;
import de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.*;
import de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation;
import de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation;
import de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation;
import de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation;
import de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation;
import de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect;
import de.affect.xml.AffectInputDocument.AffectInput;
import de.affect.xml.AffectOutputDocument;
import de.affect.xml.AffectScriptDocument;
import de.affect.xml.PersonalityType;
import emotionml.Emotion;
import emotionml.EmotionDocument;
import emotionml.Emotionml;
import emotionml.EmotionmlDocument;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import static java.util.logging.Logger.getAnonymousLogger;
import org.apache.xmlbeans.XmlException;

/**
 * The class
 * <code>AffectManager</code> stores all necessary data for the affect
 * computation of virtual characters.
 *
 * This code relys on the xml bean classes created with xmlbeans v1.3 from the
 * Affect.xsd schema, which is part of this distribution.
 *
 * @author Patrick Gebhard
 *
 * @version 1.2
 */
public class AffectManager extends AppraisalManager {

  // project wide logger
  public static Logger sLog = Logger.getLogger("Alma");
  public static DesktopHelper sDesktopHelper = null;
  public static InterfaceHolder sInterface = null;
  // Listener administration
  private Vector<AffectUpdateListener> fUpdateListener = null;
  private Vector<AffectInputListener> fInputListener = null;
  // DocumentHander
  private DocumentManager fDocumentManager = null;
  private Logger logFile = Logger.getLogger("Alma File");
  private FileHandler fLogFileHandler = null;
  private Hashtable<String, CharacterManager> fNameToCharacter = null;
  private Hashtable<String, GroupManager> fNameToGroup = null;
  private Hashtable<String, AffectAppraisalSimulation> fNameToAppraisalSimulation = null;
  private List<EmotionType> fAvailableEmotionTypes = new ArrayList<EmotionType>();
  private Timer fOutputTimer = null;
  private AlmaGUI mALMAGUI = null;
  private boolean fDoFileLogging = false;
  private boolean fDoConsoleLogging = false;
  private static int fOutputPeriod = 500;

  /**
   * Basic constructor for starting the system in gui mode asking the user to
   * load a definition and computation file
   */
  public AffectManager() throws IOException, XmlException {
    this((String) null, (String) null, true);
  }

  /**
   * Constructor, which takes the names of the computation and definition files
   * as input
   */
  public AffectManager(String compSpecsFileName,
    String defSpecsFileName, boolean hasGUI) throws IOException, FileNotFoundException, XmlException {
    this(new FileInputStream(new File(compSpecsFileName)), new FileInputStream(new File(defSpecsFileName)), hasGUI);
    setConfigPath((new File(compSpecsFileName)).getParent());
    setComputationConfigFile(new File(compSpecsFileName));
    setCharacterConfigFile(new File(defSpecsFileName));
  }

  /**
   * Constructor, which takes an inputstream of the computation and definition
   * files as input
   */
  public AffectManager(InputStream compSpecs, InputStream defSpecs, boolean hasGUI) throws IOException, XmlException {
    // setup basic configuration
    createFileHelper();
    fDocumentManager = new DocumentManager();
    // try to load assigned compSpecs. If they do not exsits defaults are used
    AffectComputation ac = (compSpecs != null)
      ? fDocumentManager.loadAffectComputation(compSpecs)
      : fDocumentManager.loadAffectComputation(sALMADefaultComputationConfig);
    AffectDefinition ad = (defSpecs != null)
      ? fDocumentManager.loadAffectDefinition(defSpecs) : null;
    // enable the static interface
    sInterface = new InterfaceHolder();

    sDesktopHelper = new DesktopHelper(); //TODO static method which creats an instance

    if (hasGUI) {
      mALMAGUI = new AlmaGUI();
      
      System.setProperty("apple.laf.useScreenMenuBar", "true");
      System.setProperty("com.apple.mrj.application.apple.menu.about.name", "ALMA CharacterBuilder");

    }
    ConsoleHandler ch = new ConsoleHandler();
    ch.setFormatter(new AffectManagerConsoleFormatter());
    ch.setLevel(Level.INFO);
    // configure ALma Logger
    sLog.setLevel(Level.ALL);
    sLog.addHandler(ch);
    sLog.setUseParentHandlers(false);
    sLog.info("This is ALMA " + buildVersion() + " - " + buildDetails());
    fUpdateListener = new Vector<AffectUpdateListener>();
    fInputListener = new Vector<AffectInputListener>();
    // initialize the affect computation parameteres
    if (ac != null) {
      initComputation(ac);
    }
    // exit ALMA if some essential configuration is missing
    if ((mALMAGUI == null) && ((ac == null) || (ad == null))) {
      System.exit(-1);
    }
    // bias initial splash screen scrollbar
    int itemsToBeLoaded = 0;
    if (ad != null) {
      itemsToBeLoaded += ad.getCharacterAffectList().size();
      itemsToBeLoaded += ad.getGroupAffectList().size();
    }
    if (mALMAGUI != null) {
      mALMAGUI.biasProgressBar(itemsToBeLoaded);
    }
    // initalize the character affect profile definition
    fNameToCharacter = new Hashtable<String, CharacterManager>();
    if (ad != null && ad.getCharacterAffectList().size() > 0) {
      initCharacters(ad);
    }
    // initalize the group affect profile definition
    fNameToGroup = new Hashtable<String, GroupManager>();
    if (ad != null && ad.getGroupAffectList().size() > 0) {
      initGroups(ad);
    }
    // if no gui mode, check if interaction monitor mode activated
    if (!hasGUI) {
      if ((ac.getRuntimeInteractionMonitor().getEnabled())) {
        de.affect.gui.InteractionSimulationFrame isf =
          new de.affect.gui.InteractionSimulationFrame();
        isf.setVisible(true);
        isf.startRecording();
      }
    }
    // start realtime output
    if (ac != null) {
      startRealtimeOutput(ac);
    }
    // do final gui polish - if gui is present
    if (mALMAGUI != null) {
      mALMAGUI.monitorProgress();
    
      mALMAGUI.hideSplashDialog();
              //tengfei's modification
      
      for (CharacterAffect characterAffectProfile: ad.getCharacterAffectList())
                  mALMAGUI.creatCharacterPanel(characterAffectProfile.getName());
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      if(screenSize.height<800){
          mALMAGUI.createInteractionPanelTab();
      }
      mALMAGUI.createInteractionPanel();
      mALMAGUI.newCharacter(); 
     
      //mALMAGUI.checkJava3DPresence();
 
    }
         

  }

  /**
   * <code>InterfaceHolder</code> class provides methods for accessing some data
   * stored/handled by an AffectManager.
   */
  public class InterfaceHolder {

    InterfaceHolder() {
    }

    public void addCharacter(String name) {
      AffectManager.this.addCharacter(name);
    }

    public CharacterManager[] getCharacters() {
      return AffectManager.this.getCharacters();
    }

    public CharacterManager getCharacterByName(String name) {
      return AffectManager.this.getCharacterByName(name);
    }

    public void removeCharacter(String name) {
      AffectManager.this.removeCharacter(name);
    }

    public void addGroup(String name, String characters) {
      AffectManager.this.addGroup(name, characters);
    }

    public GroupManager[] getGroups() {
      return AffectManager.this.getGroups();
    }

    public GroupManager getGroupByName(String name) {
      return AffectManager.this.getGroupByName(name);
    }

    public void removeGroup(String name) {
      AffectManager.this.removeGroup(name);
    }

    /**
     * Pauses affect computation (emotion decay and mood computation) Returns
     * false if at least one character's affect computation cannot be paused
     *
     * @return false if at least one character's affect computation cannot be
     * paused, true otherwise
     */
    public boolean pauseAffectComputation() {
      return AffectManager.this.pauseAffectComputation();
    }

    /**
     * Pauses a resumed affect computation (emotion decay and mood computation)
     * Returns false if at least one character's affect computation cannot be
     * paused
     *
     * @return false if at least one character's affect computation cannot be
     * paused, true otherwise
     */
    public boolean resumeAffectComputation() {
      return AffectManager.this.resumeAffectComputation();
    }

    /**
     * Perfoms a single step in affect computation (emotion decay and mood
     * computation) Returns false if at least one character's affect computation
     * cannot be continued
     *
     * @return false if at least one character's affect computation cannot be
     * continued, true otherwise
     */
    public boolean stepwiseAffectComputation() {
      return AffectManager.this.stepwiseAffectComputation();
    }

    /**
     * Pauses affect computation (emotion decay and mood computation) Returns
     * false if the character's affect computation cannot be paused
     *
     * @param name the the name of the character
     * @return false if the character's affect computation cannot be paused,
     * true otherwise
     */
    public boolean pauseAffectComputation(String name) {
      return AffectManager.this.getCharacterByName(name).pauseAffectComputation();
    }

    /**
     * Resumes a pasued affect computation (emotion decay and mood computation)
     * Returns false if the character's affect computation cannot be resumed
     *
     * @param name the the name of the character
     * @return false if the character's paused affect computation cannot be
     * resumed, true otherwise
     */
    public boolean resumeAffectComputation(String name) {
      return AffectManager.this.getCharacterByName(name).resumeAffectComputation();
    }

    /**
     * Perfoms a single step in affect computation (emotion decay and mood
     * computation) Returns false if at least one character's affect computation
     * cannot be continued
     *
     * @param name the the name of the character
     * @return false if the character's affect computation step cannot be
     * performed, true otherwise
     */
    public boolean stepwiseAffectComputation(String name) {
      return AffectManager.this.getCharacterByName(name).stepwiseAffectComputation();
    }

    public AffectOutputDocument processSignal(AffectInput ai) {
      return AffectManager.this.processSignal(ai);
    }

    public DocumentManager getDocumentManager() {
      return fDocumentManager;
    }

    public AffectOutputDocument getCurrentAffect() {
      return AffectManager.this.getCurrentAffect();
    }
    
    public EmotionmlDocument getEmotionmlDocument(String name) {
      return AffectManager.this.getCurrentAffectEmotionml(name);
    }

    public void addAffectInputListener(AffectInputListener ail) {
      AffectManager.this.addAffectInputListener(ail);
    }

    public void removeAffectInputListener(AffectInputListener ail) {
      AffectManager.this.removeAffectInputListener(ail);
    }

    public void initComputation(AffectComputation ac) {
      AffectManager.this.initComputation(ac);
    }

    public void initCharacters(AffectDefinition ad) {
      AffectManager.this.initCharacters(ad);
    }

    public void initGroups(AffectDefinition ad) {
      AffectManager.this.initGroups(ad);
    }

    public void setAvailableActs(ActSpecification acts[]) {
      AffectManager.this.setAvailableActs(acts);
    }

    public void setAvailableEmotions(EmotionSpecification emotions[]) {
      AffectManager.this.setAvailableEmotions(emotions);
    }
  }

  /**
   * The
   * <code>AffectManagerConsoleFormatter</code> class defines the output format
   * of the affect manager's log messages.
   */
  private static class AffectManagerConsoleFormatter extends Formatter {

    AffectManagerConsoleFormatter() {
    }

    public String format(LogRecord record) {
      return ((new StringBuffer()).append(record.getLevel()).append(": ").append(record.getMessage()).append("\n")).toString();
    }
  }

  /**
   * The
   * <code>LogFileFormatter</code> class defines the output format of the affect
   * manager's log file entries.
   */
  private static class LogFileFormatter extends Formatter {

    private long timestamp = 0;

    LogFileFormatter() {
    }

    public String format(LogRecord record) {
      StringBuffer outLine = new StringBuffer();
      outLine.append(timestamp).append("\t").append(record.getMessage());
      timestamp = timestamp + fOutputPeriod;
      return outLine.toString();
    }
  }

  /**
   * The
   * <code>OutputTask</code> class manages the output of affect.
   */
  private class OutputTask extends TimerTask {

    private String lastTextOutput = "";

    private OutputTask() {
    }

    public void run() {
      String currentTextOutput = getAffectOutputInfo(fNameToCharacter, fNameToGroup);
      if (fDoFileLogging) {
        logFile.info(getAffectLogEntry(fNameToCharacter, fNameToGroup));
      }

      if (fDoConsoleLogging) {
        if (!currentTextOutput.equals(lastTextOutput)) {
          sLog.info(currentTextOutput);
        }
      }

      // update affective state for every listener
      if (!currentTextOutput.equals(lastTextOutput)) {
        notifyAffectUpdateListener(getAffectOutputDocument(fNameToCharacter, fNameToGroup));
      }

      // Debug emotionml output
//      for (CharacterManager c : fNameToCharacter.values()) {
//        getEmotionmlDocument(c);
//      }

      lastTextOutput = currentTextOutput;
    }
  }

  /**
   * Adds the specified listener to the list of affect update listeners.
   *
   * @param aul the listener that should be added
   */
  public void addAffectUpdateListener(AffectUpdateListener aul) {
    fUpdateListener.add(aul);
  }

  /**
   * Removes the specified listener from the list of affect update listeners.
   *
   * @param aul the listener that should be removed
   */
  public void removeAffectUpdateListener(AffectUpdateListener aul) {
    fUpdateListener.remove(aul);
  }

  /**
   * Notifies all registered listeners aboput the affect updates
   *
   * @param affectInfo the affect information that have changed
   */
  private void notifyAffectUpdateListener(AffectOutputDocument affectInfo) {
    for (Iterator<AffectUpdateListener> it = fUpdateListener.iterator(); it.hasNext();) {
      AffectUpdateListener aul = it.next();
      aul.update(new AffectUpdateEvent(this, affectInfo));
    }
  }

  /**
   * Adds the specified listener to the list of affect input listeners.
   *
   * @param ail the listener that should be added
   */
  public void addAffectInputListener(AffectInputListener ail) {
    fInputListener.add(ail);
  }

  /**
   * Removes the specified listener from the list of affect input listeners.
   *
   * @param ail the listener that should be removed
   */
  public void removeAffectInputListener(AffectInputListener ail) {
    fInputListener.remove(ail);
  }

  /**
   * Notifies all registered listeners about new affect input
   *
   * @param affectInput the new affect input
   */
  private void notifyAffectInputListener(AffectInput affectInput) {
    for (Iterator<AffectInputListener> it = fInputListener.iterator(); it.hasNext();) {
      AffectInputListener ail = it.next();
      ail.updateInput(new AffectInputEvent(this, affectInput));
    }
  }

  /**
   * Start realtion affect output generation, which must be specified for affect
   * computation
   *
   * @param ac a affect compuation object
   */
  public void startRealtimeOutput(AffectComputation ac) {
    try {
      boolean doRealtimeOutput = ac.getRealtimeOutput().getEnable();
      if (doRealtimeOutput) {
        fDoConsoleLogging = ac.getRealtimeOutput().getConsoleLog().getEnable();
        fDoFileLogging = ac.getRealtimeOutput().getFileLog().getEnable();
        if (fDoFileLogging) {
          String file = ac.getRealtimeOutput().getFileLog().getFile();
          fLogFileHandler = new FileHandler(sALMAWorkDirectory.getPath() + sPathSeparator + file);
          fLogFileHandler.setFormatter(new LogFileFormatter());
          fLogFileHandler.setLevel(Level.INFO);
          logFile = getAnonymousLogger();
          logFile.addHandler(fLogFileHandler);
          logFile.setLevel(Level.INFO);
          logFile.setUseParentHandlers(false);
        }
        fOutputPeriod = ac.getRealtimeOutput().getPeriod();
        sLog.info("Starting output generation ...");
        fOutputTimer = new Timer(true);
        fOutputTimer.schedule(new OutputTask(), fOutputPeriod, fOutputPeriod);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Initalizes all parameters, which must be specified for affect computation
   *
   * @param ac a affect compuation object
   */
  public void initComputation(AffectComputation ac) {
    // available emotions - crosscheck with the internally defined emotions
    fAvailableEmotionTypes.clear();
    for (EmotionSpecification emoSpec : ac.getAvailableEmotions().getEmotionSpecificationList()) {
      if (emoSpec.getUse()) {
        fAvailableEmotionTypes.add(EmotionType.getTypeByName(emoSpec.getName().toString()));
      }
    }
    fAvailableEmotionTypes.add(EmotionType.Undefined);
    // PG: added a new common type of emotions that are derived by bio sensors
    fAvailableEmotionTypes.add(EmotionType.Physical);

    // available acts
    List<String> actTypes = new ArrayList<String>();
    for (ActSpecification actSpec : ac.getAvailableActs().getActSpecificationList()) {
      actTypes.add(actSpec.getName());
    }
    ActType.setNames(actTypes.toArray(new String[0]));

    // process relations
    OpennessRelation oMoodRel = ac.getMoodRelations().getOpennessRelation();
    ConscientiousnessRelation cMoodRel = ac.getMoodRelations().getConscientiousnessRelation();
    ExtraversionRelation eMoodRel = ac.getMoodRelations().getExtraversionRelation();
    AgreeablenessRelation aMoodRel = ac.getMoodRelations().getAgreeablenessRelation();
    NeurotismRelation nMoodRel = ac.getMoodRelations().getNeurotismRelation();
    PersonalityType pPersRel = ac.getPersonalityRelations().getPleasureRelation();
    PersonalityType aPersRel = ac.getPersonalityRelations().getArousalRelation();
    PersonalityType dPersRel = ac.getPersonalityRelations().getDominanceRelation();
    createPersonalityMoodRelations(new Mood(oMoodRel.getPleasure(),
      oMoodRel.getArousal(),
      oMoodRel.getDominance()),
      new Mood(cMoodRel.getPleasure(), cMoodRel.getArousal(),
      cMoodRel.getDominance()),
      new Mood(eMoodRel.getPleasure(), eMoodRel.getArousal(),
      eMoodRel.getDominance()),
      new Mood(aMoodRel.getPleasure(), aMoodRel.getArousal(),
      aMoodRel.getDominance()),
      new Mood(nMoodRel.getPleasure(), nMoodRel.getArousal(),
      nMoodRel.getDominance()),
      new Personality(pPersRel.getOpenness(),
      pPersRel.getConscientiousness(),
      pPersRel.getExtraversion(),
      pPersRel.getAgreeableness(),
      pPersRel.getNeurotism()),
      new Personality(aPersRel.getOpenness(),
      aPersRel.getConscientiousness(),
      aPersRel.getExtraversion(),
      aPersRel.getAgreeableness(),
      aPersRel.getNeurotism()),
      new Personality(dPersRel.getOpenness(),
      dPersRel.getConscientiousness(),
      dPersRel.getExtraversion(),
      dPersRel.getAgreeableness(),
      dPersRel.getNeurotism()));
    createEmotionsPADRelation();
    EmotionRelation[] emotionMoodRels = (ac.getMoodRelations().getEmotionRelationList()).toArray(new EmotionRelation[25]);
    for (EmotionRelation emRel : emotionMoodRels) {
      setEmotionPADMapping(getTypeByName(emRel.getName().toString().trim()),
        new Mood(emRel.getPleasure(),
        emRel.getArousal(), emRel.getDominance()));
    }
  }

  /**
   * Loads all character defined in the affect definition file and create a
   * character manager object.
   *
   * @param ad a affect profiles definitions file
   */
  public void initCharacters(AffectDefinition ad) {
    // drop all defined characters
    fNameToCharacter = new Hashtable<String, CharacterManager>();
    fNameToAppraisalSimulation = new Hashtable<String, AffectAppraisalSimulation>();
    try {
      // Read definitions for each character
      AffectDefinition.CharacterAffect[] characterAffectProfiles =
        ad.getCharacterAffectList().toArray(new AffectDefinition.CharacterAffect[0]);
      // Create a character manager for each defined character
      for (CharacterAffect characterAffectProfile : characterAffectProfiles) {
        initCharacter(characterAffectProfile);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Init a character based on given affect profile.
   *
   * @param characterAffectProfile A character's profile.
   */
  public void initCharacter(CharacterAffect characterAffectProfile) {
    AffectConsts ac = new AffectConsts();
    PersonalityEmotionsRelations perEmoRels = new PersonalityEmotionsRelations();
    String name = characterAffectProfile.getName();
    sLog.info("Setup affective profile for character " + name + " ...");
    AffectDefinition.CharacterAffect.PersonalitySpecification persSpec =
      characterAffectProfile.getPersonalitySpecification();
    boolean derived = persSpec.getDerived();
    CharacterAffect.MoodSpecification moodSpec = characterAffectProfile.getMoodSpecification();
    ac.moodStabilityControlledByNeurotism = moodSpec.getNeurotismstability();
    ac.moodReturnOverallTime = moodSpec.getDecaytime();
    ac.moodReturnPeriod = moodSpec.getDecayperiod();
    ac.moodReturnSteps = (new Long(ac.moodReturnOverallTime / ac.moodReturnPeriod)).intValue();
    CharacterAffect.EmotionSpecification emotionSpec = characterAffectProfile.getEmotionSpecification();
    // set the global maximum emotion baseline intensity
    ac.emotionMaxBaseline = doubleValue(emotionSpec.getBaseline());
    // set the global emotion decay variables
    ac.emotionDecayOverallTime = emotionSpec.getDecaytime();
    ac.emotionDecayPeriod = emotionSpec.getDecayperiod();
    ac.emotionDecaySteps = (new Long(ac.emotionDecayOverallTime / ac.emotionDecayPeriod)).intValue();
    double perEmotionInfluence = doubleValue(characterAffectProfile.getPersonalitySpecification().getEmotioninfluence());
    ac.personalityEmotionInfluence = perEmotionInfluence;
    perEmoRels.setPersonalityEmotionInfluence(perEmotionInfluence);
    perEmoRels.setEmotionMaxBaseline(ac.emotionMaxBaseline);
    Personality personality =
      new Personality(persSpec.getOpenness(), persSpec.getConscientiousness(),
      persSpec.getExtraversion(), persSpec.getAgreeableness(),
      persSpec.getNeurotism(), perEmoRels);
    String f = emotionSpec.getDecayfunction().toString().trim();
    DecayFunction decayFunction = null;
    decayFunction = (f.equals("linear")) ? new LinearDecayFunction() : decayFunction;
    decayFunction = (f.equals("exponential")) ? new ExponentialDecayFunction() : decayFunction;
    decayFunction = (f.equals("hyperbolic")) ? new TangensHyperbolicusDecayFunction() : decayFunction;
    // Global character information
    sLog.info("\tPersonality " + personality.toString());
    sLog.info("\tDefault mood " + getDefaultMood(personality).toString());
    // Creating character manager object
    sLog.info("\tCreating character affect unit ...");
    CharacterManager character = new CharacterManager(name, personality,
      ac, derived, decayFunction,
      fAvailableEmotionTypes);
    // Read appraisal rules
    sLog.info("\tLoading character appraisal rules");
    character.setAppraisalRules(readAppraisalRules(character, characterAffectProfile.getAppraisal()));
    // Activated internal affect appraisal simulation
    if (characterAffectProfile.getAppraisal().isSetInternalAffectAppraisal()) {
      if (characterAffectProfile.getAppraisal().getInternalAffectAppraisal()) {
        fNameToAppraisalSimulation.put(name, new AffectAppraisalSimulation(character));
      }
    }
    // In non-gui mode show AffectMonitor, if selected
    boolean showAffectMonitor = (characterAffectProfile.isSetMonitored())
      ? characterAffectProfile.getMonitored() : false;
    character.showMonitor(showAffectMonitor);
    if (mALMAGUI != null) {
      mALMAGUI.monitorProgress();
    }
    // Register character
    fNameToCharacter.put(name, character);
  
  }

  /**
   * Loads all groups defined in the affect definition file and create a group
   * manager object.
   *
   * @param ad a affect profiles definitions file
   */
  public void initGroups(AffectDefinition ad) {
    // drop all defined groups
    fNameToGroup = new Hashtable<String, GroupManager>();
    try {
      // Read definitions for each group
      for (GroupAffect groupAffectProfile : ad.getGroupAffectList()) {
        initGroup(groupAffectProfile);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Init a group based on given affect profile.
   *
   * @param groupAffectProfile A group's profile.
   */
  public void initGroup(GroupAffect groupAffectProfile) {
    AffectConsts ac = new AffectConsts();
    PersonalityEmotionsRelations perEmoRels = new PersonalityEmotionsRelations();
    String name = groupAffectProfile.getName();
    String characterNames = groupAffectProfile.getCharacters();
    sLog.info("Setup affective profile for group " + name + " (" + characterNames + ") ...");
    CharacterManager[] characters = getCharacter(characterNames);
    GroupAffect.MoodSpecification moodSpec = groupAffectProfile.getMoodSpecification();
    ac.moodStabilityControlledByNeurotism = false;
    ac.moodReturnOverallTime = moodSpec.getDecaytime();
    ac.moodReturnPeriod = moodSpec.getDecayperiod();
    ac.moodReturnSteps = (new Long(ac.moodReturnOverallTime / ac.moodReturnPeriod)).intValue();
    GroupAffect.EmotionSpecification emotionSpec = groupAffectProfile.getEmotionSpecification();
    // set the global maximum emotion baseline intensity
    ac.emotionMaxBaseline = 0.0d;
    // set the global emotion decay variables
    ac.emotionDecayOverallTime = emotionSpec.getDecaytime();
    ac.emotionDecayPeriod = emotionSpec.getDecayperiod();
    ac.emotionDecaySteps = (new Long(ac.emotionDecayOverallTime / ac.emotionDecayPeriod)).intValue();
    ac.personalityEmotionInfluence = 0.0d;
    perEmoRels.setPersonalityEmotionInfluence(0.0d);
    perEmoRels.setEmotionMaxBaseline(ac.emotionMaxBaseline);
    Personality personality =
      new Personality(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, perEmoRels);
    String f = emotionSpec.getDecayfunction().toString().trim();
    DecayFunction decayFunction = null;
    decayFunction = (f.equals("linear")) ? new LinearDecayFunction() : decayFunction;
    decayFunction = (f.equals("exponential")) ? new ExponentialDecayFunction() : decayFunction;
    decayFunction = (f.equals("hyperbolic")) ? new TangensHyperbolicusDecayFunction() : decayFunction;
    // Build character manager object
    sLog.info("\tCreating group affect processing unit");
    GroupManager group = new GroupManager(name, characters, personality,
      ac, decayFunction, fAvailableEmotionTypes);
    // Read appraisal rules
    sLog.info("\tReading appraisal rules:");
    if (groupAffectProfile.isSetAppraisal()) {
      group.setAppraisalRules(readAppraisalRules(group, groupAffectProfile.getAppraisal()));
    }
    // In non-gui mode show AffectMonitor, if selected
    boolean showAffectMonitor = (groupAffectProfile.isSetMonitored())
      ? groupAffectProfile.getMonitored() : false;
    group.showMonitor(showAffectMonitor);
    if (mALMAGUI != null) {
      mALMAGUI.monitorProgress();
    }
    fNameToGroup.put(name, group);
  }

  /**
   * Adds a new character to the whole system.
   *
   * @param name Character name.
   * @throws IllegalArgumentException if the character already exists.
   */
  private void addCharacter(String name) throws IllegalArgumentException {
    // character already exists
    if (fNameToCharacter.get(name) != null) {
      throw new IllegalArgumentException("Character " + name + " already exists");
    }
    // do the thing
    try {
      sLog.info("Adding character " + name + " ...");
      AffectDefinition ad = fDocumentManager.getAffectDefinition();
      // just in case no character definition is present
      ad = (ad == null) ? fDocumentManager.emptyAffectDefinition() : ad;
      // copy old and prepare to add new
      int cNums = ad.sizeOfCharacterAffectArray();
      CharacterAffect[] newCharacters = new CharacterAffect[cNums + 1];
      int cnt = 0;
      for (CharacterAffect c : ad.getCharacterAffectList()) {
        newCharacters[cnt++] = c;
      }
      // get the default character affcet definition
      CharacterAffect character = fDocumentManager.defaultCharacterAffectStructure();
      // give the new character its name
      character.setName(name);
      // add the new character to the exisiting
      newCharacters[cnt] = character;
      // put all in the global character affect document
      ad.setCharacterAffectArray(newCharacters);
      // (re)set the global affect character definition document
      fDocumentManager.setAffectDefinition(ad);
      // initialize characters
      initCharacters(ad);
    } catch (Exception error) {
      error.printStackTrace();
    }
  }

  /**
   * Add a new group to the whole system.
   *
   * @param name Group name.
   * @param characters Character list.
   * @throws IllegalArgumentException if the character already exists.
   */
  private void addGroup(String name, String characters) throws IllegalArgumentException {
    // no group at all!
    if (fNameToGroup == null) {
      fNameToGroup = new Hashtable<String, GroupManager>();
    }

    // group already exists
    if (fNameToGroup.get(name) != null) {
      throw new IllegalArgumentException("Group " + name + " already exists");
    }

    // do the thing
    try {
      sLog.info("Adding group " + name + " ...");
      AffectDefinition ad = fDocumentManager.getAffectDefinition();

      // init character
      GroupAffect group = ad.addNewGroupAffect();
      group.setName(name);
      group.setCharacters(characters);
      group.setMonitored(false);
      group.setDocu("");

      // setup mood specification
      GroupAffect.MoodSpecification moodSpec = group.addNewMoodSpecification();
      moodSpec.setDecaytime(60000);
      moodSpec.setDecayperiod(500);

      // setup emotion specification
      GroupAffect.EmotionSpecification emotionSpec = group.addNewEmotionSpecification();
      emotionSpec.setDecaytime(20000);
      emotionSpec.setDecayperiod(500);
      emotionSpec.setDecayfunction(GroupAffect.EmotionSpecification.Decayfunction.LINEAR);

      // init basic appraisal rules
      GroupAffect.Appraisal appraisal = group.addNewAppraisal();
      GroupAffect.Appraisal.Basic basic = appraisal.addNewBasic();
      GroupAffect.Appraisal.Basic.GoodEvent good = basic.addNewGoodEvent();
      good.setDesirability("0.5");
      GroupAffect.Appraisal.Basic.GoodEventForGoodOther goodgoodother = basic.addNewGoodEventForGoodOther();
      goodgoodother.setDesirability("0.5");
      goodgoodother.setLiking("0.5");
      goodgoodother.setAgency("other");
      GroupAffect.Appraisal.Basic.GoodEventForBadOther goodbadother = basic.addNewGoodEventForBadOther();
      goodbadother.setDesirability("0.5");
      goodbadother.setLiking("-0.5");
      goodbadother.setAgency("other");
      GroupAffect.Appraisal.Basic.BadEvent bad = basic.addNewBadEvent();
      bad.setDesirability("-0.5");
      GroupAffect.Appraisal.Basic.BadEventForGoodOther badgoodother = basic.addNewBadEventForGoodOther();
      badgoodother.setDesirability("-0.5");
      badgoodother.setLiking("0.5");
      badgoodother.setAgency("other");
      GroupAffect.Appraisal.Basic.BadEventForBadOther badbadother = basic.addNewBadEventForBadOther();
      badbadother.setDesirability("-0.5");
      badbadother.setLiking("-0.5");
      badbadother.setAgency("other");
      GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent goodlikely = basic.addNewGoodLikelyFutureEvent();
      goodlikely.setDesirability("0.5");
      goodlikely.setLikelihood("0.5");
      GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent goodunlikely = basic.addNewGoodUnlikelyFutureEvent();
      goodlikely.setDesirability("0.5");
      goodlikely.setLikelihood("-0.5");
      GroupAffect.Appraisal.Basic.BadLikelyFutureEvent badlikely = basic.addNewBadLikelyFutureEvent();
      badlikely.setDesirability("-0.5");
      badlikely.setLikelihood("0.5");
      GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent badunlikely = basic.addNewBadUnlikelyFutureEvent();
      badlikely.setDesirability("-0.5");
      badlikely.setLikelihood("-0.5");
      GroupAffect.Appraisal.Basic.EventConfirmed confirmed = basic.addNewEventConfirmed();
      confirmed.setRealization("true");
      GroupAffect.Appraisal.Basic.EventDisconfirmed disconfirmed = basic.addNewEventDisconfirmed();
      disconfirmed.setRealization("false");
      GroupAffect.Appraisal.Basic.GoodActSelf goodactself = basic.addNewGoodActSelf();
      goodactself.setPraiseworthiness("0.5");
      goodactself.setAgency("self");
      GroupAffect.Appraisal.Basic.GoodActOther goodactother = basic.addNewGoodActOther();
      goodactother.setPraiseworthiness("0.5");
      goodactother.setAgency("other");
      GroupAffect.Appraisal.Basic.BadActSelf badactself = basic.addNewBadActSelf();
      badactself.setPraiseworthiness("-0.5");
      badactself.setAgency("self");
      GroupAffect.Appraisal.Basic.BadActOther badactother = basic.addNewBadActOther();
      badactother.setPraiseworthiness("-0.5");
      badactother.setAgency("other");
      GroupAffect.Appraisal.Basic.NiceThing nice = basic.addNewNiceThing();
      nice.setAppealingness("0.5");
      GroupAffect.Appraisal.Basic.NastyThing nasty = basic.addNewNastyThing();
      nasty.setAppealingness("-0.5");

      // initialize group
      initGroup(group);
    } catch (Exception error) {
      error.printStackTrace();
    }
  }

  /**
   * <code>getCharacter</code> returns an array of CharacterManger objects
   * according to a given string list of character namess. If there is a name to
   * which no CharacterManager object relates, an empty CharacterManager array
   * will be returned.
   *
   * @param cList a string contains a list of characters, which are separated by
   * commas, i.e Sven, Valerie
   *
   * @return CharacterManager[] array which contains of the CharacterManager
   * object relate to the given character names
   */
  private CharacterManager[] getCharacter(String cList) {
    ArrayList<CharacterManager> cmList = new ArrayList<CharacterManager>();
    try {
      if (cList.indexOf(",") != -1) {
        StringTokenizer st = new StringTokenizer(cList, ",");
        while (st.hasMoreTokens()) {
          String characterName = st.nextToken().trim();
          CharacterManager character = fNameToCharacter.get(characterName);
          if (character != null) {
            cmList.add(character);
          } else {
            sLog.warning(characterName + " is not a valid character. Check it!"
              + " This will result in loss of emotions!");
          }
        }
      } else {
        cmList.add(fNameToCharacter.get(cList));
      }
      return cmList.toArray(new CharacterManager[0]);
    } catch (Exception e) {
      return new CharacterManager[0];
    }
  }

  /**
   * <code>getCharacterByName</code> returns a CharacterManger object related to
   * a given name of a character. If no character with this name exists, null
   * will be returned.
   *
   * @param name a string contains a name of a character
   */
  public CharacterManager getCharacterByName(String name) throws IllegalArgumentException {

    CharacterManager character = fNameToCharacter.get(name);
    if (character != null) {
      return character;
    } else {
      throw (new IllegalArgumentException("Unknown character name " + name));
    }
  }

  /**
   * <code>getGroupByName</code> returns a GroupManager object related to a
   * given name of a group. If no group with this name exists, null will be
   * returned.
   *
   * @param name a string contains a name of a group
   */
  public GroupManager getGroupByName(String name) throws IllegalArgumentException {
    GroupManager group = fNameToGroup.get(name);
    if (group != null) {
      return group;
    } else {
      throw (new IllegalArgumentException("Unknown group name " + name));
    }
  }

  /**
   * <code>getCharacters</code> returns CharacterManger array contains of all
   * characters.
   *
   * @return CharacterManager[] contains of all characters
   */
  public CharacterManager[] getCharacters() {
    ArrayList<CharacterManager> cmList = new ArrayList<CharacterManager>();
    for (Enumeration<String> cEnum = fNameToCharacter.keys(); cEnum.hasMoreElements();) {
      cmList.add(fNameToCharacter.get(cEnum.nextElement()));
    }
    return cmList.toArray(new CharacterManager[0]);
  }

  /**
   * <code>getGroups</code> returns GroupManager array contains of all groups.
   *
   * @return GroupManager[] contains of all characters
   */
  public GroupManager[] getGroups() {
    // no group at all ...
    if (fNameToGroup == null) {
      return null;
    }
    ArrayList<GroupManager> cmList = new ArrayList<GroupManager>();
    for (Enumeration<String> cEnum = fNameToGroup.keys(); cEnum.hasMoreElements();) {
      cmList.add(fNameToGroup.get(cEnum.nextElement()));
    }
    return cmList.toArray(new GroupManager[0]);
  }

  /**
   * Remove a character. If the character does not exist, the function will not
   * produce an error message.
   *
   * @param name Character to remove.
   */
  public void removeCharacter(String name) {
    // remove character from internal representation and affectdefinition
    sLog.info("Removing character " + name + " ...");
    fNameToCharacter.remove(name);
    AffectDefinition ad = fDocumentManager.getAffectDefinition();
    for (int i = 0; i < ad.sizeOfCharacterAffectArray(); ++i) {
      if (ad.getCharacterAffectArray(i).getName().equals(name)) {
        ad.removeCharacterAffect(i);
        break;
      }
    }
  }

  /**
   * Remove a group. If the group does not exist, the function will not produce
   * an error message.
   *
   * @param name Group to remove.
   */
  public void removeGroup(String name) {
    // remove character from internal representation and affectdefinition
    sLog.info("Removing group " + name + " ...");
    fNameToGroup.remove(name);
    AffectDefinition ad = fDocumentManager.getAffectDefinition();
    for (int i = 0; i < ad.sizeOfGroupAffectArray(); ++i) {
      if (ad.getGroupAffectArray(i).getName().equals(name)) {
        ad.removeGroupAffect(i);
        break;
      }
    }
  }

  /**
   * Resets all characters to their default mood and personality
   */
  public void resetCharacters() {
    for (Enumeration<String> cEnum = fNameToCharacter.keys(); cEnum.hasMoreElements();) {
      CharacterManager character = fNameToCharacter.get(cEnum.nextElement());
      // setting the personality resets a character affective state
      character.setPersonality(character.getPersonality());
    }
  }

  /**
   * Sets the list of available acts.
   *
   * @param acts New list of available acts.
   */
  public void setAvailableActs(ActSpecification acts[]) {
    // build new available acts list
    List<String> actTypes = new ArrayList<String>();
    for (ActSpecification act : acts) {
      actTypes.add(act.getName());
    }
    ActType.setNames(actTypes.toArray(new String[0]));

    // replace old available act list
    fDocumentManager.getAffectComputationParams().getAvailableActs().setActSpecificationArray(acts);
  }

  /**
   * Sets the list of available emotions.
   *
   * @param emotions New list of available emotions.
   */
  public void setAvailableEmotions(EmotionSpecification emotions[]) {
    // build new available emotions list
    // TODO Update character and group managers?
    fAvailableEmotionTypes.clear();
    for (EmotionSpecification emotion : emotions) {
      if (emotion.getUse()) {
        fAvailableEmotionTypes.add(EmotionType.getTypeByName(emotion.getName().toString()));
      }
    }
    fAvailableEmotionTypes.add(EmotionType.Undefined);
    // replace old available emotion list
    fDocumentManager.getAffectComputationParams().getAvailableEmotions().setEmotionSpecificationArray(emotions);
  }

  /**
   * Returns the document manager that stores the actual affect compuation and
   * character affect profile definition.
   *
   * @return DocumentManager manages the actual affect computation and character
   * affect profile definitions
   */
  public DocumentManager getDocumentManager() {
    return fDocumentManager;
  }

  /**
   * Pauses the real-time affect computation (emotion decay and mood
   * computation) Returns false if at least one character's affect computation
   * cannot be paused
   *
   * @return false if at least one character's affect computation cannot be
   * paused, true otherwise
   */
  public boolean pauseAffectComputation() {
    boolean result = true;
    // stop all emotion and mood computation of all characters
    for (CharacterManager c : getCharacters()) {
      boolean cResult = c.pauseAffectComputation();
      // remember if at least one character cannot be paused
      result = (result == true) ? cResult : result;
    }

    // stop all emotion and mood computation of all groups
    for (GroupManager g : getGroups()) {
      boolean gResult = g.pauseAffectComputation();
      // remember if at least one character cannot be paused
      result = (result == true) ? gResult : result;
    }

    return result;
  }

  /**
   * Resume a paused real-time affect computation (emotion decay and mood
   * computation) Returns false if at least one character's affect computation
   * cannot be continued
   *
   * @return false if at least one character's affect computation cannot be
   * continued, true otherwise
   */
  public boolean resumeAffectComputation() {
    boolean result = true;
    // resume all emotion and mood computation of all characters
    for (CharacterManager c : getCharacters()) {
      boolean cResult = c.resumeAffectComputation();
      // remember if at least one character cannot be continued
      result = (result == true) ? cResult : result;
    }

    // resume all emotion and mood computation of all groups
    for (GroupManager g : getGroups()) {
      boolean gResult = g.resumeAffectComputation();
      // remember if at least one character cannot be continued
      result = (result == true) ? gResult : result;
    }

    return result;
  }

  /**
   * Perfoms a single step in affect computation (emotion decay and mood
   * computation) Returns false if at least one character's affect computation
   * cannot be continued
   *
   * @return false if at least one character's affect computation cannot be
   * continued, true otherwise
   */
  public boolean stepwiseAffectComputation() {
    boolean result = true;
    // resume all emotion and mood computation of all characters
    for (CharacterManager c : getCharacters()) {

      boolean cResult = c.stepwiseAffectComputation();
      // remember if at least one character cannot be continued
      result = (result == true) ? cResult : result;
    }

    // resume all emotion and mood computation of all groups
    for (GroupManager g : getGroups()) {
      boolean gResult = g.stepwiseAffectComputation();
      // remember if at least one character cannot be continued
      result = (result == true) ? gResult : result;
    }

    return result;

  }

  /**
   * Returns the current affect snapshot of all characters and Groups
   *
   * @return affect snapshot of all characters
   */
  public AffectOutputDocument getCurrentAffect() {
    return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
  }
  
  
    /**
   * Returns the current affect snapshot of all characters and Groups
   *
   * @return affect snapshot of the specified character in EmotionML format
   * 
   * @param name the name of a character
   */
  public EmotionmlDocument getCurrentAffectEmotionml(String name) {
    CharacterManager character = fNameToCharacter.get(name);
    return (character != null) ? getEmotionmlDocument(character) : null;
  }
  

  /**
   * The method
   * <code>processSignal</code> processes the signal values, that are
   * potentially stored in the AffectInput Java object. According to the type of
   * signal, it will be than further processed by an suitable function.
   *
   * @param ai a Java object related to an AffectInput-Element defined by the
   * Affect.xsd
   */
  public synchronized AffectOutputDocument processSignal(AffectInput ai) {
    CharacterManager performer = fNameToCharacter.get(ai.getCharacter().getName());

    sLog.info(ai.toString());

    if (ai.isSetPAD()) {
      // No notification to affectInputListeners ...
      String description = (ai.getPAD().isSetDescription()) ? ai.getPAD().getDescription() : "" + System.currentTimeMillis();
      double p = ai.getPAD().getPleasure();
      double a = ai.getPAD().getArousal();
      double d = ai.getPAD().getDominance();
      double intensity = (ai.getPAD().isSetIntensity()) ? ai.getPAD().getIntensity() : 0.0d;
      Mood m = new Mood(p, a, d);
      processPADInput(performer, m, intensity, description);

      return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
    } else {
      // notify all listeners for affect input - such like the
      // interaction simulation, when in record mode
      notifyAffectInputListener(ai);

      // proceed if input is a dialog act
      if (ai.isSetAct()) {
        String daType = ai.getAct().getType();
        String intensity = (ai.getAct().isSetIntensity())
          ? ai.getAct().getIntensity().toString() : "1.0";
        String elicitor = (ai.getAct().isSetElicitor())
          ? ai.getAct().getElicitor() : "none";
        elicitor = (elicitor == null) ? "none" : elicitor;
        processAct(daType, doubleValue(intensity),
          performer,
          getCharacter(ai.getAct().getAddressee()),
          getCharacter(ai.getAct().getListener()),
          elicitor);
        // Group affect things ...
        if (fNameToGroup != null) {
          ArrayList<GroupManager> groupList = new ArrayList<GroupManager>();
          for (Enumeration<String> cEnum = fNameToGroup.keys(); cEnum.hasMoreElements();) {
            GroupManager group = fNameToGroup.get(cEnum.nextElement());
            if (group.hasCharacter(performer)) {
              groupList.add(group);
            }
          }
          if (groupList.size() > 0) {
            processAct(daType, doubleValue(intensity), performer, groupList.toArray(new GroupManager[1]), elicitor);
          }
        }
        return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
      }

      // proceed if input is an emotional display
      if (ai.isSetEmotionDisplay()) {
        String emType = ai.getEmotionDisplay().getType().toString();
        String intensity = (ai.getEmotionDisplay().isSetIntensity())
          ? ai.getEmotionDisplay().getIntensity().toString() : "1.0";
        String elicitor = (ai.getEmotionDisplay().isSetElicitor())
          ? ai.getEmotionDisplay().getElicitor() : "none";
        elicitor = (elicitor == null) ? "none" : elicitor;
        processEmotion(emType, doubleValue(intensity),
          performer,
          getCharacter(ai.getEmotionDisplay().getAddressee()),
          getCharacter(ai.getEmotionDisplay().getListener()), elicitor);
        // Group affect things ...
        ArrayList<GroupManager> groupList = new ArrayList<GroupManager>();
        for (Enumeration<String> cEnum = fNameToGroup.keys(); cEnum.hasMoreElements();) {
          GroupManager group = fNameToGroup.get(cEnum.nextElement());
          if (group.hasCharacter(performer)) {
            groupList.add(group);
          }
        }
        if (groupList.size() > 0) {
          processEmotion(emType, doubleValue(intensity), performer, groupList.toArray(new GroupManager[1]), elicitor);
        }
        return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
      }

      // proceed if input is a mood display
      if (ai.isSetMoodDisplay()) {
        String moType = ai.getMoodDisplay().getType().toString();
        String intensity = (ai.getMoodDisplay().isSetIntensity())
          ? ai.getMoodDisplay().getIntensity().toString() : "1.0";
        String elicitor = (ai.getMoodDisplay().isSetElicitor())
          ? ai.getMoodDisplay().getElicitor() : "none";
        elicitor = (elicitor == null) ? "none" : elicitor;
        processMood(moType, doubleValue(intensity),
          performer,
          getCharacter(ai.getMoodDisplay().getAddressee()),
          getCharacter(ai.getMoodDisplay().getListener()), elicitor);
        // Group affect things ...
        ArrayList<GroupManager> groupList = new ArrayList<GroupManager>();
        for (Enumeration<String> cEnum = fNameToGroup.keys(); cEnum.hasMoreElements();) {
          GroupManager group = fNameToGroup.get(cEnum.nextElement());
          if (group.hasCharacter(performer)) {
            groupList.add(group);
          }
        }
        if (groupList.size() > 0) {
          processMood(moType, doubleValue(intensity), performer, groupList.toArray(new GroupManager[1]), elicitor);
        }
        return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
      }

      // proceed is input is an action appraisal
      if (ai.isSetAction()) {
        String actionType = ai.getAction().getType().toString();
        String intensity = (ai.getAction().isSetIntensity())
          ? ai.getAction().getIntensity().toString() : "1.0";
        String elicitor = (ai.getAction().isSetElicitor())
          ? ai.getAction().getElicitor() : "none";
        elicitor = (elicitor == null) ? "none" : elicitor;
        processAction(actionType, doubleValue(intensity), performer, elicitor);
        return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
      }

      // proceed is input is an event appraisal
      if (ai.isSetEvent()) {
        String eventType = ai.getEvent().getType().toString();
        String intensity = (ai.getEvent().isSetIntensity())
          ? ai.getEvent().getIntensity().toString() : "1.0";
        String elicitor = (ai.getEvent().isSetElicitor())
          ? ai.getEvent().getElicitor() : "none";
        elicitor = (elicitor == null) ? "none" : elicitor;
        processEvent(eventType, doubleValue(intensity), performer, elicitor);
        return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
      }

      // proceed is input is an object appraisal
      if (ai.isSetObject()) {
        String objectType = ai.getObject().getType().toString();
        String intensity = (ai.getObject().isSetIntensity())
          ? ai.getObject().getIntensity().toString() : "1.0";
        String elicitor = (ai.getObject().isSetElicitor())
          ? ai.getObject().getElicitor() : "none";
        elicitor = (elicitor == null) ? "none" : elicitor;
        processObject(objectType, doubleValue(intensity), performer, elicitor);
        return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
      }

      // proceed is inputare eec variables
      if (ai.isSetBasicEEC()) {
        String type = "EEC";
        String signal = "EEC";

        // get the eec values, if numerically zero (0.0) put variable to null for further processing ...
        Desirability desirability = new Desirability(ai.getBasicEEC().getDesirability());
        desirability = (desirability.degree() != 0.0d) ? desirability : null;
        Praiseworthiness praiseworthiness = new Praiseworthiness(ai.getBasicEEC().getPraiseworthiness());
        praiseworthiness = (praiseworthiness.degree() != 0.0d) ? praiseworthiness : null;
        Appealingness appealingness = new Appealingness(ai.getBasicEEC().getAppealingness());
        appealingness = (appealingness.degree() != 0.0d) ? appealingness : null;
        Likelihood likelihood = new Likelihood(ai.getBasicEEC().getLikelihood());
        likelihood = (likelihood.degree() != 0.0d) ? likelihood : null;
        Realization realization = new Realization(ai.getBasicEEC().getRealization());
        realization = (realization.degree() != 0.0d) ? realization : null;
        Liking liking = new Liking(ai.getBasicEEC().getLiking());
        liking = (liking.degree() != 0.0d) ? liking : null;
        Agency agency = (ai.getBasicEEC().getAgency().toString().equalsIgnoreCase("self")) ? Agency.SELF : Agency.OTHER;

        String elicitor = (ai.getBasicEEC().isSetElicitor()) ? ai.getBasicEEC().getElicitor() : "none";
        elicitor = (elicitor == null) ? "none" : elicitor;

        AppraisalVariables appVars = new AppraisalVariables(type, signal, desirability, praiseworthiness, appealingness,
          likelihood, realization, agency, liking, elicitor);

        processBasicECC(appVars, performer, elicitor);
        return getAffectOutputDocument(fNameToCharacter, fNameToGroup);
      }
    }

    return null;
  }

  /**
   * Stops all affect processing task in each CharacterManager object and
   * AffectManager object.
   *
   */
  public void stopAll() {
    if (fOutputTimer != null) {
      fOutputTimer.cancel();
    }
    for (Enumeration<String> cEnum = fNameToCharacter.keys(); cEnum.hasMoreElements();) {
      fNameToCharacter.get(cEnum.nextElement()).stopAll();
    }
    System.exit(1);
    //TODO stop Groups
  }

  /**
   * Causes the currently executing thread to sleep (temporarily cease
   * execution) for the specified number of milliseconds.
   *
   * @param millis the length of time to sleep in milliseconds
   */
  private void pause(long millis) {
    try {
      Thread.currentThread().sleep(millis);
    } catch (InterruptedException ie) {
    }
  }

  /**
   * Main method for the AffectManager
   */
  public static void main(String[] args) {
    // start the gui if no arguments are passed
    if (args.length == 0) {
      try {
        AffectManager am = new AffectManager((InputStream) null, (InputStream) null, true);
        while (true) {
          am.pause(10000);
        }
      } catch (IOException io) {
        io.printStackTrace();
      } catch (XmlException xmle) {
        xmle.printStackTrace();
      }
    }
    // if any arguments are passed, check ...
    if (args.length < 3) {
      sLog.severe("Missing arguments.");
      sLog.severe("Usage: de.affect.manage.AffectManager <compSpec> <defSpec> true");
      sLog.severe("or:    de.affect.manage.AffectManager <compSpec> <defSpec> false <aml input/script>");
      return;
    }
    if ((new Boolean(args[2]).booleanValue()) == true) { // gui mode
      try {
        AffectManager am = new AffectManager(args[0], args[1], true);
        while (true) {
          am.pause(10000);
          //System.gc();
        }
      } catch (IOException io) {
        io.printStackTrace();
      } catch (XmlException xmle) {
        xmle.printStackTrace();
      }
    } else { // console mode
      try {
        if (args.length < 5) {
          // script or not?
          boolean isScript = true;
          try {
            AffectScriptDocument.Factory.parse(new File(args[3]));
          } catch (IOException io) {
            System.err.println("de.affect.manage.AffectManager: Error reading file " + args[3]);
            io.printStackTrace();
            return;
          } catch (XmlException xmle) {
            // not a script, so assume its an singular affect input script
            isScript = false;
          }
          // play script ...
          if (isScript) {
            AffectScriptPlayer asp = new AffectScriptPlayer(args[0], args[1], args[3]);
            asp.play();
          } else {
            AffectManager am = new AffectManager(args[0], args[1], false);
            am.processSignal(am.parseInputFile(args[3]));
            am.pause(10000);
          }
        } else {
          sLog.severe("Wrong number arguments.");
          sLog.severe("Usage: de.affect.manage.AffectManager <compSpec> <defSpec> false <aml input/script>");
          return;
        }
      } catch (IOException io) {
        io.printStackTrace();
      } catch (XmlException xmle) {
        xmle.printStackTrace();
      }
    }
  }
}
