/*
 * AffectAppraisalSimulation.java
 *
 * Copyright (c) 2004-2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.manage;

import java.util.Timer;
import java.util.TimerTask;

import de.affect.emotion.EmotionType;
import de.affect.mood.MoodIntensity;
import de.affect.mood.MoodType;

import de.affect.xml.EmotionName;
import de.affect.xml.MoodWord;
import de.affect.xml.AffectInputDocument.AffectInput;
import de.affect.xml.AffectInputDocument.AffectInput.Character;
import de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay;
import de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay;

import static de.affect.util.Convert.doubleValue;
import static de.affect.util.Convert.prettyPrint;

class AffectAppraisalSimulation {

  private static AffectManager.InterfaceHolder affectManager = AffectManager.sInterface;
  private EntityManager fCharacter = null;
  private Timer fInternalAppraisalTimer = null;

  AffectAppraisalSimulation(EntityManager character) {
    AffectManager.sLog.info("\tInternal affect appraisal simulation active!");
    fCharacter = character;
    fInternalAppraisalTimer = new Timer(true);
    fInternalAppraisalTimer.schedule(new InternalAppraisalTask(), 500, 500);
  }

  /**
   * The <code>InternalAppraisalTask</code> class manages the internal appraisal
   * of the dominant emotion and current mood.
   */
  private class InternalAppraisalTask extends TimerTask {

    private final String sUndefinedEmotion = EmotionType.Undefined.toString();
    private String lastDominantEmotion = sUndefinedEmotion;
    private final String sNeutralMood = MoodIntensity.neutral.toString() + MoodType.Neutral.toString();
    private String lastMood = sNeutralMood;

    private InternalAppraisalTask() {
    }

    public synchronized void run() {
      // build affect input structures
      Character character = Character.Factory.newInstance();
      character.setName(fCharacter.fName);
      String currentEmotion = fCharacter.fEmotionVector.getDominantEmotion().getType().toString();
      double emotionIntensity = fCharacter.fEmotionVector.getDominantEmotion().getIntensity();
      double emotionBaseline = fCharacter.getAffectConsts().emotionMaxBaseline;
      if ((!currentEmotion.equals(sUndefinedEmotion)) && (emotionIntensity > emotionBaseline)) {
        AffectManager.sLog.info(fCharacter.fName + " appraises own emotion " + currentEmotion + " (alma simulation)");
        AffectInput aiInput = AffectInput.Factory.newInstance();
        lastDominantEmotion = currentEmotion;
        EmotionDisplay emotionDisplay = EmotionDisplay.Factory.newInstance();
        //emotionDisplay.setAddressee(addressees);
        //emotionDisplay.setListener(listener);
        emotionDisplay.setType(EmotionName.Enum.forString(currentEmotion));
        emotionDisplay.setIntensity(prettyPrint(emotionIntensity));
        emotionDisplay.setElicitor("alma internal emotion appraisal");
        aiInput.setCharacter(character);
        aiInput.setEmotionDisplay(emotionDisplay);
        affectManager.processSignal(aiInput);
      }
      String currentMood = fCharacter.fCurrentMood.getMoodWordIntensity() + fCharacter.fCurrentMood.getMoodWord();
      if (!currentMood.equals(sNeutralMood)) {
        AffectManager.sLog.info(fCharacter.fName + " appraises own mood " + currentMood + " (alma simulation)");
        AffectInput aiInput = AffectInput.Factory.newInstance();
        lastMood = currentMood;
        MoodDisplay moodDisplay = MoodDisplay.Factory.newInstance();
        //moodDisplay.setAddressee(addressees);
        //moodDisplay.setListener(listener);
        moodDisplay.setType(MoodWord.Enum.forString(fCharacter.fCurrentMood.getMoodWord()));
        moodDisplay.setIntensity(prettyPrint(doubleValue(fCharacter.fCurrentMood.getMoodWordIntensity())));
        moodDisplay.setElicitor("alma internal mood appraisal");
        aiInput.setCharacter(character);
        aiInput.setMoodDisplay(moodDisplay);
        affectManager.processSignal(aiInput);
      }
    }
  }
}