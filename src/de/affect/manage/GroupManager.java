/*
 * GroupManager.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.manage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import de.affect.compute.EmotionEngine;
import de.affect.compute.DecayFunction;
import de.affect.compute.MoodEngine;
import de.affect.appraisal.AppraisalVariables;
import de.affect.appraisal.EEC;
import de.affect.emotion.EmotionHistory;
import de.affect.emotion.EmotionVector;
import de.affect.emotion.Emotion;
import de.affect.mood.Mood;
import de.affect.personality.Personality;
import de.affect.personality.PersonalityEmotionsRelations;
import de.affect.gui.GroupAffectMonitor;
import de.affect.gui.GroupAffectMonitorFrame;
import de.affect.gui.GroupAffectMonitorInternalFrame;
import de.affect.data.AffectConsts;
import de.affect.emotion.EmotionType;
import de.affect.manage.event.EmotionMaintenanceEvent;
import de.affect.manage.event.EmotionMaintenanceListener;

import static de.affect.personality.PersonalityMoodRelations.getDefaultMood;
import static de.affect.gui.AlmaGUI.sIntegratedDesktopMode;
import static de.affect.util.Convert.doubleValue;

/**
 * The class
 * <code>GroupManager</code> stores all necessary data and provides emotion and
 * mood computation functions for a group of characters.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class GroupManager extends EntityManager implements EmotionMaintenanceListener {

  public static Logger sLog = Logger.getLogger("Alma");
  private GroupManager fGroupManagerInstance = null;
  private CharacterManager[] fCharacters = null;
  private PersonalityEmotionsRelations fPersEmoRels = null;
  private MoodEngine fMoodEngine = null;
  private EmotionEngine fEmotionEngine = null;
  private EmotionHistory fEmotionHistory = null;
  private GroupAffectMonitor fGroupAffectMonitor = null;
  private DecayFunction fDecayFunction = null;
  private Timer fDecayTimer = null;
  private Timer fMoodComputationTimer = null;
  private double fSocialIntegrity = 0.0d;
  private String fInSimilarMood = "none";
  private List<CharacterManager> fInExtremeMood = null;
  private boolean fEnableDecay = true;
  private boolean fShowAffectMonitor = false;
  boolean fAffectComputationPaused = false;

  public GroupManager(String name, CharacterManager[] characters,
    Personality personality, AffectConsts ac,
    DecayFunction decayFunction,
    List<EmotionType> emotions) {
    super(name);
    fGroupManagerInstance = this;
    fCharacters = characters;
    fPersonality = personality;
    fAc = ac;
    fDecayFunction = decayFunction;
    fAvailEmotions = emotions;
    fPersEmoRels = personality.getPersonalityEmotionsRelations();
    fDefaultMood = getDefaultMood(personality);
    fCurrentMood = getDefaultMood(personality);
    fSocialIntegrity = 0.0d;
    fInSimilarMood = "none";
    fInExtremeMood = new LinkedList<CharacterManager>();
    // Setup emotion processing
    fEmotionVector = createEmotionVector();
    fEmotionHistory = new EmotionHistory();
    fDecayFunction.init(fAc.emotionDecaySteps);
    fEmotionEngine = new EmotionEngine(fPersonality, fDecayFunction);
    if (fEnableDecay) {
      fDecayTimer = new Timer(true);
      fDecayTimer.schedule(new EmotionDecayTask(), fAc.emotionDecayPeriod, fAc.emotionDecayPeriod);
    }
    // Setup mood processing	
    fMoodEngine = new MoodEngine(fPersonality, fAc.moodStabilityControlledByNeurotism,
      fDefaultMood, fAc.moodReturnOverallTime);
    fMoodComputationTimer = new Timer(true);
    fMoodComputationTimer.schedule(new MoodComputationTask(), fAc.moodReturnPeriod, fAc.moodReturnPeriod);
    // Setup affect monitoring
    if (!sIntegratedDesktopMode) {
      Thread startAffectMonitor = new Thread() {
        public void run() {
          fGroupAffectMonitor =
            (GroupAffectMonitor) new GroupAffectMonitorFrame(fName, fEmotionVector,
            fCurrentMood,
            fSocialIntegrity,
            fInSimilarMood,
            fInExtremeMood);

        }
      };
      startAffectMonitor.start();
    }
  }

  /**
   * The
   * <code>EmotionDecayTask</code> class manages the emotion decay process.
   */
  private class EmotionDecayTask extends TimerTask {

    private EmotionDecayTask() {
    }

    public synchronized void run() {
      fEmotionVector =
        fEmotionEngine.decay(fEmotionHistory, fEmotionVector, createEmotionVector());
      if ((fGroupAffectMonitor != null) && fShowAffectMonitor) {
        fGroupAffectMonitor.updateEmotionDisplay(fName, fEmotionVector);
      }
    }
  }

  /**
   * The
   * <code>EmotionMonitorTask</code> class displays the elicited emotions. This
   * is usually done by the EmotionDecayTask, but in case it is diabled some other
   * method has to monitor the emotions.
   */
  private class EmotionMonitorTask extends TimerTask {

    private EmotionMonitorTask() {
    }

    public synchronized void run() {
      if ((fGroupAffectMonitor != null) && fShowAffectMonitor) {
        fGroupAffectMonitor.updateEmotionDisplay(fName, fEmotionVector);
      }
    }
  }

  /**
   * Returns a flag if emotion decay is enabled.
   */
  public boolean isEnabledEmotionDecay() {
    return fEnableDecay;
  }

  /**
   * Starts emotion decay, if not running.
   */
  public void enableEmotionDecay() {
    if (!fEnableDecay) {
      fDecayTimer.cancel();
      fDecayTimer = new Timer(true);
      fDecayTimer.schedule(new EmotionDecayTask(), fAc.emotionDecayPeriod, fAc.emotionDecayPeriod);
      fEnableDecay = true;
    }
  }

  /**
   * Starts emotion monitoring, if not running.
   */
  public void enableEmotionMonitoring() {
    if (!fEnableDecay) {
      fDecayTimer = new Timer(true);
      fDecayTimer.schedule(new EmotionMonitorTask(), fAc.emotionDecayPeriod, fAc.emotionDecayPeriod);
    }
  }

  /**
   * Stops emotion decay, if running.
   */
  public void disableEmotionDecay() {
    if (fEnableDecay) {
      fDecayTimer.cancel();
      fEnableDecay = false;
    }
  }

  /**
   * Returns a flag if affect computation is paused.
   */
  public boolean isAffectComputationPaused() {
    return fAffectComputationPaused;
  }

  /**
   * Pauses all dynamic affect computation
   *
   * @return true if the affect computation is pause, false otherwise
   */
  public boolean pauseAffectComputation() {
    sLog.info(fName + " affect computation paused ...");
    stopAll();
    fAffectComputationPaused = true;
    return true;
  }

  /**
   * Resumes a paused dynamic affect computation
   *
   * @return true if the affect computation is continued, false otherwise
   */
  public boolean resumeAffectComputation() {
    if (fAffectComputationPaused) {
      sLog.info(fName + " emotion computation resumed ...");

      fDecayTimer = new Timer(true);
      fDecayTimer.schedule(new EmotionDecayTask(), fAc.emotionDecayPeriod, fAc.emotionDecayPeriod);

      sLog.info(fName + " mood computation resumed ...");
      fMoodEngine = new MoodEngine(fPersonality, fAc.moodStabilityControlledByNeurotism, fDefaultMood, fAc.moodReturnOverallTime);
      fMoodComputationTimer.cancel();
      fMoodComputationTimer = new Timer(true);
      fMoodComputationTimer.schedule(new MoodComputationTask(), fAc.moodReturnPeriod, fAc.moodReturnPeriod);
      return true;
    } else {
      return false;
    }
  }

  /**
   * Performs a single step for affect computation (emotion decay and mood computation)
   *
   * @return true if the affect computation is continued, false otherwise
   */
  public boolean stepwiseAffectComputation() {
    if (fAffectComputationPaused) {
      
      EmotionDecayTask ed = new EmotionDecayTask();
      ed.run();
      MoodComputationTask mc = new MoodComputationTask();
      mc.run();

      return true;
    } else {
      return false;
    }
  }
  /**
   * Sets the visible state of the character's affect monitor
   *
   * @param visible true shows the character's affect monitor, false otherwise
   */
  public void showMonitor(final boolean visible) {
    // Put the operation into a thread if the affectMonitor object
    // has not been yet instanciated
    if ((fGroupAffectMonitor == null) && visible) {
      Thread waitNShowMonitor = new Thread() {
        public void run() {
          boolean exit = false;
          while (!exit) {
            //debug log.info("Waiting for affect monitor ...");
            if (fGroupAffectMonitor != null) {
              exit = true;
              fShowAffectMonitor = visible;
              fGroupAffectMonitor.showFrame(visible);
            }
            try {
              this.sleep(500);
            } catch (InterruptedException ie) {
              ie.printStackTrace();
            }
          }
        }
      };
      waitNShowMonitor.start();
      return;
    }
    if (fGroupAffectMonitor != null) {
      fShowAffectMonitor = visible;
      fGroupAffectMonitor.showFrame(visible);
    }
  }

  /**
   * Returns the visible state of the character's affect monitor
   *
   * @return true if the character's affect monitor is visible, false otherwise
   */
  public boolean hasActiveAffectMonitor() {
    return fShowAffectMonitor;
  }

  /**
   * Returns the character's affect monitor
   *
   * @return true if the character's affect monitor is visible, false otherwise
   */
  public GroupAffectMonitor getAffectMonitor() {
    return fGroupAffectMonitor;
  }

  /**
   * Sets a new affect monitor for this character.
   *
   * @param affectMonitor the new affect monitor
   */
  public synchronized void setAffectMonitor(GroupAffectMonitor affectMonitor) {
    disableEmotionDecay();
    disableMoodComputation();
    if (affectMonitor != null) {
      fGroupAffectMonitor = affectMonitor;
      fShowAffectMonitor = true;
      fGroupAffectMonitor.updateEmotionDisplay(fName, fEmotionVector);
      fGroupAffectMonitor.updateMoodDisplay(fName, fEmotionVector,
        fMoodEngine.getEmotionsCenter(),
        fDefaultMood, fCurrentMood,
        fSocialIntegrity, fInSimilarMood,
        fInExtremeMood);
    }
    enableMoodComputation();
    enableEmotionDecay();
  }

  /**
   * The
   * <code>MoodComputationTask</code> class manages the compuatation of the
   * actual mood.
   */
  private class MoodComputationTask extends TimerTask {

    Hashtable<CharacterManager, CharacterManager> characterInSimilarMood =
      new Hashtable<CharacterManager, CharacterManager>();

    private MoodComputationTask() {
    }

    public synchronized void run() {
      fCurrentMood = fMoodEngine.compute(fCurrentMood, fEmotionVector);
      // compute social integrity
      double pleasure = 0.0d;
      double arousal = 0.0d;
      double dominance = 0.0d;
      double compPleasure = 0.0d;
      double compArousal = 0.0d;
      double compDominance = 0.0d;
      double rate = 0.0d;
      double distanceToDefaultMood = 0.0d;
      int cnt = 0;
      characterInSimilarMood.clear();

      synchronized (fInExtremeMood) {
        fInExtremeMood.clear();
        for (cnt = 0; cnt < fCharacters.length; cnt++) {
          //log.info("CharacterNumber "+cnt);
          pleasure = fCharacters[cnt].getCurrentMood().getPleasure();
          arousal = fCharacters[cnt].getCurrentMood().getArousal();
          dominance = fCharacters[cnt].getCurrentMood().getDominance();
          // extreme mood
          distanceToDefaultMood = fCharacters[cnt].getDistancetoDefaultMood();
          if (fInExtremeMood.isEmpty()) {
            //log.info("Character added");
            fInExtremeMood.add(fCharacters[cnt]);
          } else {
            int ccnt = 0;
            double lastDistance = 0.0d;
            for (CharacterManager cm : fInExtremeMood) {
              lastDistance = cm.getDistancetoDefaultMood();
              ccnt = (lastDistance > distanceToDefaultMood) ? ccnt + 1 : ccnt;
            }
            fInExtremeMood.add(ccnt, fCharacters[cnt]);
            //log.info("Character was sorted in at pos " + ccnt);
          }

          // social integrity and similar mood
          if ((cnt + 1) < fCharacters.length) {
            for (int ccnt = cnt + 1; ccnt < fCharacters.length; ccnt++) {
              compPleasure = fCharacters[ccnt].getCurrentMood().getPleasure();
              compArousal = fCharacters[ccnt].getCurrentMood().getArousal();
              compDominance = fCharacters[ccnt].getCurrentMood().getDominance();
              // determitation of the oktant difference
              // 0 means same oktant, 1 means adjacent oktant, 
              // 2 means obliquely opposite, 3 completely opposite (through pad origin)
              // The number also indicates how many oktants awy the other mood is
              // located from 
              int diff = 0;
              diff = (((pleasure < 0.0d) && (compPleasure > 0.0d))
                || ((pleasure > 0.0d) && (compPleasure < 0.0d))) ? diff + 1 : diff;
              //log.info("difference in pleasure " + diff);
              diff = (((arousal < 0.0d) && (compArousal > 0.0d))
                || ((arousal > 0.0d) && (compArousal < 0.0d))) ? diff + 1 : diff;
              //log.info("difference in arousal " + diff);
              diff = (((dominance < 0.0d) && (compDominance > 0.0d))
                || ((dominance > 0.0d) && (compDominance < 0.0d))) ? diff + 1 : diff;
              //log.info("difference in dominance " + diff);
              //log.info(fCharacters[cnt].getName() + "'s mood is  " + diff + 
              //         " oktants away from " + fCharacters[ccnt].getName() + "'s mood");
              // save all pairs of characters which's mood is in the same oktant
              if (diff == 0) {
                if (characterInSimilarMood.containsKey(fCharacters[cnt])) {
                  characterInSimilarMood.put(fCharacters[ccnt], fCharacters[cnt]);
                } else {
                  characterInSimilarMood.put(fCharacters[cnt], fCharacters[ccnt]);
                }
              }
              // rate the difference of oktants
              rate += diff * 3.0d; //add +1 for each oktaant
              // computation of distance
              rate += sqrt(pow(abs(pleasure - compPleasure), 2.0d)
                + pow(abs(arousal - compArousal), 2.0d)
                + pow(abs(dominance - compDominance), 2.0d));
            }
          }
        }
      }
      //log.info("---");
      fSocialIntegrity = (1.0d / fCharacters.length) * rate;
      //log.info("Social integrity value: " + fSocialIntegrity);
      fInSimilarMood = "none";
      if (!characterInSimilarMood.isEmpty()) {
        fInSimilarMood = "";
        for (Enumeration<CharacterManager> cEnum = characterInSimilarMood.keys();
          cEnum.hasMoreElements();) {
          CharacterManager firstChar = cEnum.nextElement();
          CharacterManager secondChar = characterInSimilarMood.get(firstChar);
          fInSimilarMood += (cEnum.hasMoreElements())
            ? firstChar.getName() + " - " + secondChar.getName() + ", "
            : firstChar.getName() + " - " + secondChar.getName();
        }
      }
      //log.info("Characters in similar mood: " + fInSimilarMood);
      if ((fGroupAffectMonitor != null) && fShowAffectMonitor) {
        fGroupAffectMonitor.updateMoodDisplay(fName, fEmotionVector,
          fMoodEngine.getEmotionsCenter(),
          fDefaultMood, fCurrentMood,
          fSocialIntegrity, fInSimilarMood,
          fInExtremeMood);
      }
    }
  }

  /**
   * Starts emotion decay, if not running.
   */
  public void enableMoodComputation() {
    fMoodEngine = new MoodEngine(fPersonality, fAc.moodStabilityControlledByNeurotism, fDefaultMood, fAc.moodReturnOverallTime);
    fMoodComputationTimer.cancel();
    fMoodComputationTimer = new Timer(true);
    fMoodComputationTimer.schedule(new MoodComputationTask(), fAc.moodReturnPeriod, fAc.moodReturnPeriod);
  }

  /**
   * Stops emotion decay, if running.
   */
  public void disableMoodComputation() {
    fMoodComputationTimer.cancel();
  }

  public void addEEC(EEC eec) {
    fEmotionEngine.addEEC(eec);
  }

  /**
   * Sets a new emotion decay function and decaySteps and reinitialize the
   * character's emotion computation engine.
   *
   * @param decayFunction the new emotion decay function
   */
  public synchronized void setDecayFunction(DecayFunction decayFunction) {
    disableEmotionDecay();
    fDecayFunction = decayFunction;
    fDecayFunction.init(fAc.emotionDecaySteps);
    fEmotionEngine = new EmotionEngine(fPersonality, fDecayFunction);
    enableEmotionDecay();
  }

  /**
   * Sets a new personality for this character and reinitialize the character's
   * emotion computation engine.
   *
   * @param personality the new personality
   */
  public synchronized void setPersonality(Personality personality) {
    disableEmotionDecay();
    disableMoodComputation();
    fPersonality = personality;
    //fEmotionVector = createEmotionVector();
    //fEmotionHistory = new EmotionHistory();

    fEmotionEngine = new EmotionEngine(fPersonality, fDecayFunction);

    // Not for groups! fDefaultMood = getDefaultMood(personality);
    // Not for groups! fCurrentMood = getDefaultMood(personality);
    if ((fGroupAffectMonitor != null) && fShowAffectMonitor) {
      fGroupAffectMonitor.updateEmotionDisplay(fName, fEmotionVector);
      fGroupAffectMonitor.updateMoodDisplay(fName, fEmotionVector,
        fMoodEngine.getEmotionsCenter(),
        fDefaultMood, fCurrentMood,
        fSocialIntegrity, fInSimilarMood,
        fInExtremeMood);
    }
    enableMoodComputation();
    enableEmotionDecay();
  }

  public synchronized void setAffectConsts(AffectConsts ac) {
    disableEmotionDecay();
    disableMoodComputation();
    fAc = ac;
    PersonalityEmotionsRelations perEmoRels =
      fPersonality.getPersonalityEmotionsRelations();
    perEmoRels.setPersonalityEmotionInfluence(ac.personalityEmotionInfluence);
    perEmoRels.setEmotionMaxBaseline(ac.emotionMaxBaseline);
    fPersonality.setPersonalityEmotionsRelations(perEmoRels);
    fEmotionEngine = new EmotionEngine(fPersonality, fDecayFunction);
    enableMoodComputation();
    enableEmotionDecay();
  }

  /**
   * Infers emotions based on the specified list of Emotion Eliciting Conditions
   * and updates the character's emotional state displayed by the affect
   * monitor.
   *
   * @return generated emotions
   */
  public synchronized EmotionVector inferEmotions() {
    EmotionVector result = createEmotionVector();
    result = fEmotionEngine.inferEmotions(result, fEmotionHistory, fCurrentMood);
    fEmotionEngine.clearEEC();
    fEmotionHistory.add(result);
    fEmotionVector = fEmotionHistory.getEmotionalState(fEmotionVector);
    if ((fGroupAffectMonitor != null) && fShowAffectMonitor) {
      fGroupAffectMonitor.updateEmotionDisplay(fName, fEmotionVector);
    }
    return result;
  }

  /**
   * Prints all emotions in the specified collection whose intensity is greater
   * than the baseline.
   */
  private void printEmotions() {
    String newLine = System.getProperty("line.separator");
    String indent = " ";
    StringBuffer sb = new StringBuffer("[EmotionVector: ");
    for (Iterator it = fEmotionVector.getEmotions().iterator(); it.hasNext();) {
      Emotion emotion = (Emotion) it.next();
      if (emotion.getIntensity() > emotion.getBaseline()) {
        sb.append(indent);
        sb.append(emotion.toString());
        sb.append(newLine);
      }
    }
    sb.append("]");
    sLog.info(sb.toString());
  }

  public CharacterManager[] getCharacters() {
    return fCharacters;
  }

  public boolean hasCharacter(CharacterManager queryCharacter) {
    boolean isAGroupCharacter = false;
    for (CharacterManager character : fCharacters) {
      isAGroupCharacter = (character == queryCharacter) ? true : isAGroupCharacter;
    }
    return isAGroupCharacter;
  }

  public boolean hasCharacter(String characterName) {
    boolean isAGroupCharacter = false;
    for (CharacterManager character : fCharacters) {
      isAGroupCharacter =
        (character.getName().equals(characterName)) ? true : isAGroupCharacter;
    }
    return isAGroupCharacter;
  }

  public synchronized double getSocialIntegrity() {
    return fSocialIntegrity;
  }

  public synchronized String getCharactersInSimilarMood() {
    return fInSimilarMood;
  }

  public synchronized String[] getCharacterArrayInSimilarMood() {
    return fInSimilarMood.split(",");
  }

  public synchronized List<CharacterManager> getCharactersInExtremeMood() {
    return fInExtremeMood;
  }

  /**
   * Stops all affect processing, decaying tasks
   */
  public void stopAll() {
    fDecayTimer.cancel();
    fMoodComputationTimer.cancel();
  }

  /**
   * Implements EmotionMaintenanceListener
   */
  public synchronized void maintainEmotion(EmotionMaintenanceEvent e) {
    EmotionType changedEmotionType = e.emotionType();
    // only add the emotion to the right character :-)
    if (e.getCharacterName().equals(fName)) {
      EmotionVector emotions = createEmotionVector();
      List freshDummyEmotions = emotions.getEmotions();
      for (Iterator it = freshDummyEmotions.iterator(); it.hasNext();) {
        Emotion emotion = (Emotion) it.next();
        EmotionType emotionType = emotion.getType();
        if (changedEmotionType.equals(emotionType)) {
          double intensity = (e.intensity() < emotion.getBaseline()) ? emotion.getBaseline() : e.intensity();
          Emotion newEmotion = new Emotion(emotionType, intensity, emotion.getBaseline(), "User maintenance");
          emotions.add(newEmotion);
        }
      }
      fEmotionHistory.add(emotions);
      fEmotionVector = fEmotionHistory.getEmotionalState(fEmotionVector);
    }
  }
}
