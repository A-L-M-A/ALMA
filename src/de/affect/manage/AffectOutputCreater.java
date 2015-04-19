/*
 * AffectOutputCreater.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.manage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import static de.affect.util.Convert.doubleValue;
import static de.affect.util.Convert.prettyPrint;
import static de.affect.util.Convert.valueDescription;
import static de.affect.data.AffectConsts.*;
import static de.affect.emotion.EmotionType.*;
import static de.affect.personality.PersonalityEmotionsRelations.*;
import static de.affect.personality.PersonalityMoodRelations.*;
import static de.affect.emotion.EmotionsPADRelation.*;

import de.affect.emotion.Emotion;
import de.affect.emotion.EmotionsPADRelation;
import de.affect.mood.Mood;
import de.affect.manage.CharacterManager;
import de.affect.util.Convert;
import de.affect.xml.CharacterType;
import de.affect.xml.PersonalityType;
import de.affect.xml.MoodType;
import de.affect.xml.MoodWord;
import de.affect.xml.EmotionType;
import de.affect.xml.EmotionName;
import de.affect.xml.EventTypes;
import de.affect.xml.ActionTypes;
import de.affect.xml.ObjectTypes;
import de.affect.xml.Intensity;
import de.affect.xml.AffectOutputDocument;
import de.affect.xml.AffectOutputDocument.AffectOutput;
import de.affect.xml.AffectOutputDocument.AffectOutput.*;
import de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions;
import de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect;
import de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.*;
import emotionml.EmotionDescription;
import emotionml.Emotionml;
import emotionml.EmotionmlDocument;
import emotionml.Info;
import emotionml.Item;
import emotionml.Reference;
import emotionml.Trace;
import emotionml.Vocabulary;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Logger;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlDocumentProperties;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.w3c.dom.Node;

public class AffectOutputCreater {

  public static Logger sLog = Logger.getLogger("Alma");

  protected AffectOutputCreater() {
  }

  public static String getAffectLogEntry(Hashtable<String, CharacterManager> characters,
    Hashtable<String, GroupManager> groups) {
    StringBuffer sb = new StringBuffer();
    DecimalFormat form = new DecimalFormat("0.0000");
    DecimalFormatSymbols formSymbols = new DecimalFormatSymbols();
    formSymbols.setDecimalSeparator('.');
    form.setDecimalFormatSymbols(formSymbols);
    if (characters != null) {
      for (Enumeration<String> cEnum = characters.keys(); cEnum.hasMoreElements();) {
        CharacterManager character = characters.get(cEnum.nextElement());
        sb.append(character.getName()).append("\t");
        Emotion domEmotion = character.getCurrentEmotions().getDominantEmotion();
        double intensity = domEmotion.getIntensity();
        double baseline = domEmotion.getBaseline();
        sb.append(domEmotion.getType().toString()).append("\t");
        sb.append(form.format(intensity)).append("\t");
        sb.append(form.format(baseline)).append("\t");
        sb.append(character.getCurrentMood().getMoodWordIntensity()).append(" ");
        sb.append(character.getCurrentMood().getMoodWord()).append("\t");
        sb.append(character.getCurrentMoodTendency().getMoodWordIntensity()).append(" ");
        sb.append(character.getCurrentMoodTendency().getMoodWord()).append("\t");
      }
    }
    //TODO group mood key values
    if (groups != null) {
      for (Enumeration<String> gEnum = groups.keys(); gEnum.hasMoreElements();) {
        GroupManager group = groups.get(gEnum.nextElement());
        sb.append(group.getName()).append("\t");
        sb.append(group.getCurrentMood().getMoodWordIntensity()).append(" ");
        sb.append(group.getCurrentMood().getMoodWord()).append("\t");
        sb.append(valueDescription(group.getSocialIntegrity())).append("\t");
        sb.append(group.getCharactersInSimilarMood()).append("\t");
        String charactersInExtremeMood = "";
        List<CharacterManager> inExtremeMood = group.getCharactersInExtremeMood();
        synchronized (inExtremeMood) {
          for (CharacterManager cm : inExtremeMood) {
            charactersInExtremeMood += cm.getName()
              + " (" + prettyPrint(cm.getDistancetoDefaultMood()) + ") ";
          }
        }
        sb.append(charactersInExtremeMood).append("\t");
        ;
      }
    }
    sb.append("\n");
    return sb.toString();
  }

  public static synchronized String getAffectOutputInfo(Hashtable<String, CharacterManager> characters,
    Hashtable<String, GroupManager> groups) {
    StringBuffer sb = new StringBuffer();
    DecimalFormat form = new DecimalFormat("0.0000");
    DecimalFormatSymbols formSymbols = new DecimalFormatSymbols();
    formSymbols.setDecimalSeparator('.');
    form.setDecimalFormatSymbols(formSymbols);
    if (characters != null) {
      for (Enumeration<String> cEnum = characters.keys(); cEnum.hasMoreElements();) {
        CharacterManager character = characters.get(cEnum.nextElement());
        sb.append(character.getName()).append(", ");
        Emotion domEmotion = character.getCurrentEmotions().getDominantEmotion();
        double intensity = domEmotion.getIntensity();
        double baseline = domEmotion.getBaseline();
        sb.append(domEmotion.getType().toString()).append(" (");
        sb.append(form.format(intensity)).append("/");
        sb.append(form.format(baseline)).append("), ");
        sb.append(character.getCurrentMood().getMoodWordIntensity()).append(" ");
        sb.append(character.getCurrentMood().getMoodWord()).append("\nINFO: ");
        sb.append(character.getCurrentMoodTendency().getMoodWordIntensity()).append(" ");
        sb.append(character.getCurrentMoodTendency().getMoodWord()).append("\nINFO: ");
      }
    }
    if ((groups != null) && (groups.size() > 0)) {
      for (Enumeration<String> gEnum = groups.keys(); gEnum.hasMoreElements();) {
        GroupManager group = groups.get(gEnum.nextElement());
        sb.append(group.getName()).append(", ");
        sb.append(group.getCurrentMood().getMoodWordIntensity()).append(" ");
        sb.append(group.getCurrentMood().getMoodWord());
        sb.append(", Social integrity ");
        sb.append(valueDescription(group.getSocialIntegrity())).append("\nINFO: ");
        sb.append("\tsimilar mood:\t").append(group.getCharactersInSimilarMood());
        sb.append("\nINFO: ");
        String charactersInExtremeMood = "";
        List<CharacterManager> inExtremeMood = group.getCharactersInExtremeMood();
        synchronized (inExtremeMood) {
          for (CharacterManager cm : inExtremeMood) {
            charactersInExtremeMood += cm.getName()
              + " (" + prettyPrint(cm.getDistancetoDefaultMood()) + ") ";
          }
        }
        sb.append("\textreme mood:\t").append(charactersInExtremeMood);
        sb.append("\nINFO: ");
      }
    }
    return sb.toString();
  }

  public static synchronized EmotionmlDocument getEmotionmlDocument(CharacterManager character) {
    EmotionmlDocument emlDoc = EmotionmlDocument.Factory.newInstance();

    Emotionml eml = Emotionml.Factory.newInstance();
    eml.addNewVersion().setStringValue("1.0");

    // Note the Alma OCC Emotion Categories
    Vocabulary voc = eml.addNewVocabulary();
    voc.setType(Vocabulary.Type.CATEGORY);
    voc.setId("alma-occ-categories");
    for (de.affect.emotion.EmotionType et : de.affect.emotion.EmotionType.values()) {
      Item ei = voc.addNewItem();
      ei.setName(et.name());
    }


    // Characters    

    // Info 
    AffectOutput aOutput = AffectOutput.Factory.newInstance();
    CharacterAffect characterAffect = aOutput.addNewCharacterAffect();
    SchemaType st = characterAffect.schemaType();

    characterAffect.setName(character.getName());
    // add the character's personality parameters
    CharacterAffect.Personality personality =
      CharacterAffect.Personality.Factory.newInstance();

    personality.setDerived(character.isDerivedPersonality());
    personality.setOpenness(character.getPersonality().getOpenness());
    personality.setConscientiousness(character.getPersonality().getConscientiousness());
    personality.setExtraversion(-character.getPersonality().getExtraversion());
    personality.setAgreeableness(character.getPersonality().getAgreeableness());
    personality.setNeurotism(character.getPersonality().getNeurotism());

    characterAffect.setPersonality(personality);

    Info i = Info.Factory.newInstance();

    Node n = i.getDomNode();
    Node importedNode = n.getOwnerDocument().importNode(aOutput.getDomNode(), true);
    n.appendChild(importedNode);
    eml.setInfo(i);

    // character's mood
    emotionml.Emotion mood = eml.addNewEmotion();
    // info that this denotes the mood of the character

    Info mInfo = mood.addNewInfo();
    Node comment = mInfo.getDomNode();
    Node text = comment.getOwnerDocument().createTextNode(character.getName() + " current mood is " + character.getCurrentMood().getMoodWordIntensity() + " " + character.getCurrentMood().getMoodWord());
    comment.appendChild(text);
    // note the used languages
    mood.setCategorySet("alma-pad-categories");
    mood.setDimensionSet("http://www.w3.org/TR/emotion-voc/xml#pad-dimensions");
    // note the pad values
    EmotionDescription moodP = mood.addNewDimension();
    moodP.setName("pleasure");
    moodP.setValue(new Float(character.getCurrentMood().getPleasure()));
    EmotionDescription moodA = mood.addNewDimension();
    moodA.setName("arousal");
    moodA.setValue(new Float(character.getCurrentMood().getArousal()));
    EmotionDescription moodD = mood.addNewDimension();
    moodD.setName("domiance");
    moodD.setValue(new Float(character.getCurrentMood().getDominance()));

    // character's emotions
    for (Emotion emotion : character.getCurrentEmotions().getEmotions()) {

      emotionml.Emotion e = eml.addNewEmotion();
      // note the used languages
      e.setCategorySet("alma-occ-categories");
      e.setDimensionSet("http://www.w3.org/TR/emotion-voc/xml#pad-dimensions");

      // note the emotion name, according the alma occ category-set
      EmotionDescription ed = e.addNewCategory();
      ed.setName(emotion.getType().name());

      // Do a trace only if character affect computation is pause
      // TODO - THIS DOES NOT WORK PROPERLY!!


      if (!character.fAffectComputationPaused) {
        ed.setValue(new Float(emotion.getIntensity()));

        if (emotion.getAppraisalVariables() != null) {
          e.setStart(new BigInteger(emotion.getStart() + ""));
          e.setEnd(new BigInteger((emotion.getStart() + character.getEmotionEngine().simulateDecay(emotion).size() * character.getAffectConsts().emotionDecayPeriod) + ""));
          e.setDuration(new BigInteger((character.getEmotionEngine().simulateDecay(emotion).size() * character.getAffectConsts().emotionDecayPeriod) + ""));
        }

      } else {
        Trace t = ed.addNewTrace();
        t.setSamples(character.getEmotionEngine().simulateDecay(emotion));
        t.setFreq(Convert.prettyPrint(1000 / character.getAffectConsts().emotionDecayPeriod) + "Hz");
      }

      // note the pad values
      Mood ePAD = (emotion.getType().equals(de.affect.emotion.EmotionType.Physical)) ? emotion.getPADValues() : getEmotionPADMapping(emotion.getType());

      EmotionDescription eDimP = e.addNewDimension();
      eDimP.setName("pleasure");
      eDimP.setValue(new Float(ePAD.getPleasure()));
      EmotionDescription eDimA = e.addNewDimension();
      eDimA.setName("arousal");
      eDimA.setValue(new Float(ePAD.getArousal()));
      EmotionDescription eDimD = e.addNewDimension();
      eDimD.setName("domiance");
      eDimD.setValue(new Float(ePAD.getDominance()));

      // appraisal set
      if (emotion.getAppraisalVariables() != null) {

        e.setAppraisalSet("http://www.w3.org/TR/emotion-voc/xml#occ-appraisals");
        if (emotion.getAppraisalVariables().isSetDesirability() && emotion.getAppraisalVariables().isSetAgency()) {
          EmotionDescription eApp = e.addNewAppraisal();
          eApp.setName("desirability");
          eApp.setValue(new Float(emotion.getAppraisalVariables().desirability()));
        }

        if (emotion.getAppraisalVariables().isSetPraiseworthiness()) {
          EmotionDescription eApp = e.addNewAppraisal();
          eApp.setName("praiseworthiness");
          eApp.setValue(new Float(emotion.getAppraisalVariables().praiseworthiness()));
        }
        if (emotion.getAppraisalVariables().isSetAppealingness()) {
          EmotionDescription eApp = e.addNewAppraisal();
          eApp.setName("appealingness");
          eApp.setValue(new Float(emotion.getAppraisalVariables().appealingness()));
        }

        if (emotion.getAppraisalVariables().isSetDesirability() && !emotion.getAppraisalVariables().isSetAgency()) {
          EmotionDescription eApp = e.addNewAppraisal();
          eApp.setName("desirability-for-other");
          eApp.setValue(new Float(emotion.getAppraisalVariables().desirability()));
        }

        if (emotion.getAppraisalVariables().isSetLikelihood()) {
          EmotionDescription eApp = e.addNewAppraisal();
          eApp.setName("likelihood");
          eApp.setValue(new Float(emotion.getAppraisalVariables().likelihood()));
        }

        if (emotion.getAppraisalVariables().isSetLiking()) {
          EmotionDescription eApp = e.addNewAppraisal();
          eApp.setName("liking");
          eApp.setValue(new Float(emotion.getAppraisalVariables().liking()));
        }

        // note the elicitor 
        Reference ref = e.addNewReference();
        ref.setUri(emotion.getElicitor().toString());
        ref.setRole(Reference.Role.TRIGGERED_BY);
      }


    }
    // build the document
    emlDoc.setEmotionml(eml);

    //System.out.println(emlDoc.validate());
    // DEBUG System.out.println(emlDoc.toString());
    return emlDoc;
  }

  public static synchronized AffectOutputDocument getAffectOutputDocument(Hashtable<String, CharacterManager> characters, Hashtable<String, GroupManager> groups) {
    AffectOutputDocument aoDoc = AffectOutputDocument.Factory.newInstance();
    // Groups
    AffectOutput aOutput = AffectOutput.Factory.newInstance();
    if ((groups != null) && (groups.size() > 0)) {
      ArrayList<GroupAffect> groupAffectList = new ArrayList<GroupAffect>();
      for (Enumeration<String> cEnum = groups.keys(); cEnum.hasMoreElements();) {
        int groupNum = 1;
        GroupManager group = groups.get(cEnum.nextElement());
        GroupAffect groupAffect = GroupAffect.Factory.newInstance();
        groupAffect.setName(group.getName());
        String groupCharacters = "";
        for (CharacterManager character : group.getCharacters()) {
          groupCharacters += character.getName() + ",";
        }
        groupCharacters.substring(0, groupCharacters.length() - 1);
        groupAffect.setCharacters(groupCharacters);
        OverallMood overallMood = OverallMood.Factory.newInstance();
        Mood groupMood = group.getCurrentMood();
        overallMood.setMoodword(MoodWord.Enum.forString(groupMood.getMoodWord()));
        overallMood.setIntensity(MoodType.Intensity.Enum.forString(groupMood.getMoodWordIntensity()));
        overallMood.setPleasure(groupMood.getPleasure());
        overallMood.setArousal(groupMood.getArousal());
        overallMood.setDominance(groupMood.getDominance());
        SocialIntegrity socialIntegrity = SocialIntegrity.Factory.newInstance();
        socialIntegrity.setValue(prettyPrint(group.getSocialIntegrity()));

        MoodSimilarities moodSimilarities = MoodSimilarities.Factory.newInstance();
        boolean first = true;
        MoodSimilarities.CharacterPair characterPair = null;
        for (String character : group.getCharacterArrayInSimilarMood()) {
          if (first) {
            characterPair = moodSimilarities.addNewCharacterPair();
            if (character.equals("none")) {
              characterPair.setFirst("none");
              characterPair.setSecond("none");
            } else {
              characterPair.setFirst(character);
            }
            first = false;
          } else {
            characterPair.setSecond(character);
            groupAffect.setMoodSimilarities(moodSimilarities);
            first = true;
          }
        }
        MoodExtremes moodExtremes = MoodExtremes.Factory.newInstance();
        List<CharacterManager> inExtremeMood = group.getCharactersInExtremeMood();
        synchronized (inExtremeMood) {
          for (CharacterManager cm : inExtremeMood) {
            MoodExtremes.Character character = moodExtremes.addNewCharacter();
            character.setName(cm.getName());
            character.setDifference(cm.getDistancetoDefaultMood());
          }
        }
        groupAffect.setMoodExtremes(moodExtremes);
        groupAffectList.add(groupAffect);
      }
      aOutput.setGroupAffectArray(groupAffectList.toArray(new GroupAffect[1]));
    }
    // Characters
    if (characters != null) {
      ArrayList<CharacterAffect> characterAffectList = new ArrayList<CharacterAffect>();
      for (Enumeration<String> cEnum = characters.keys(); cEnum.hasMoreElements();) {
        int charNum = 1;
        CharacterManager character = characters.get(cEnum.nextElement());
        CharacterAffect characterAffect = CharacterAffect.Factory.newInstance();
        characterAffect.setName(character.getName());
        // add the character's personality parameters
        AffectOutput.CharacterAffect.Personality personality =
          AffectOutput.CharacterAffect.Personality.Factory.newInstance();
        personality.setDerived(character.isDerivedPersonality());
        personality.setOpenness(character.getPersonality().getOpenness());
        personality.setConscientiousness(character.getPersonality().getConscientiousness());
        personality.setExtraversion(character.getPersonality().getExtraversion());
        personality.setAgreeableness(character.getPersonality().getAgreeableness());
        personality.setNeurotism(character.getPersonality().getNeurotism());
        characterAffect.setPersonality(personality);
        // add the character's current mood state
        MoodType mood = MoodType.Factory.newInstance();
        Mood charactersMood = character.getCurrentMood();
        mood.setMoodword(MoodWord.Enum.forString(charactersMood.getMoodWord()));
        mood.setIntensity(MoodType.Intensity.Enum.forString(charactersMood.getMoodWordIntensity()));
        mood.setPleasure(charactersMood.getPleasure());
        mood.setArousal(charactersMood.getArousal());
        mood.setDominance(charactersMood.getDominance());
        characterAffect.setMood(mood);
        MoodType moodTendency = MoodType.Factory.newInstance();
        Mood charactersMoodTendency = character.getCurrentMoodTendency();
        moodTendency.setMoodword(MoodWord.Enum.forString(charactersMoodTendency.getMoodWord()));
        moodTendency.setIntensity(MoodType.Intensity.Enum.forString(charactersMoodTendency.getMoodWordIntensity()));
        moodTendency.setPleasure(charactersMoodTendency.getPleasure());
        moodTendency.setArousal(charactersMoodTendency.getArousal());
        moodTendency.setDominance(charactersMoodTendency.getDominance());
        characterAffect.setMoodTendency(moodTendency);
        MoodType defaultMood = MoodType.Factory.newInstance();
        Mood charactersDefaultMood = character.defaultMood();
        defaultMood.setMoodword(MoodWord.Enum.forString(charactersDefaultMood.getMoodWord()));
        defaultMood.setIntensity(MoodType.Intensity.Enum.forString(charactersDefaultMood.getMoodWordIntensity()));
        defaultMood.setPleasure(charactersDefaultMood.getPleasure());
        defaultMood.setArousal(charactersDefaultMood.getArousal());
        defaultMood.setDominance(charactersDefaultMood.getDominance());
        characterAffect.setDefaultMood(defaultMood);

        EmotionType emotion = EmotionType.Factory.newInstance();
        Emotion domEmotion = character.getCurrentEmotions().getDominantEmotion();
        double intensity = domEmotion.getIntensity();
        double baseline = domEmotion.getBaseline();
        if (intensity != baseline) {
          DecimalFormat form = new DecimalFormat("0.00");
          DecimalFormatSymbols formSymbols = new DecimalFormatSymbols();
          formSymbols.setDecimalSeparator('.');
          form.setDecimalFormatSymbols(formSymbols);
          emotion.setName(EmotionName.Enum.forString(domEmotion.getType().toString()));
          emotion.setValue(form.format(intensity));
        } else {
          emotion.setName(EmotionName.Enum.forString("Undefined"));
          emotion.setValue("0.00");
        }
        characterAffect.setDominantEmotion(emotion);

        Emotions emosDoc = Emotions.Factory.newInstance();
        ArrayList<EmotionType> emotionsList = new ArrayList<EmotionType>();
        int cnt = 1;
        for (Emotion e : character.getCurrentEmotions().getEmotions()) {
          EmotionType eDoc = EmotionType.Factory.newInstance();
          double eInt = e.getIntensity();
          double eBaseline = e.getBaseline();
          DecimalFormat form = new DecimalFormat("0.00");
          DecimalFormatSymbols formSymbols = new DecimalFormatSymbols();
          formSymbols.setDecimalSeparator('.');
          form.setDecimalFormatSymbols(formSymbols);
          eDoc.setName(EmotionName.Enum.forString(e.getType().toString()));
          eDoc.setValue(form.format(eInt));
          emotionsList.add(eDoc);
        }
        emosDoc.setEmotionArray(emotionsList.toArray(new EmotionType[1]));
        characterAffect.setEmotions(emosDoc);
        characterAffectList.add(characterAffect);
      }
      aOutput.setCharacterAffectArray(characterAffectList.toArray(new CharacterAffect[1]));
    }
    aoDoc.setAffectOutput(aOutput);
    return aoDoc;
  }
}
