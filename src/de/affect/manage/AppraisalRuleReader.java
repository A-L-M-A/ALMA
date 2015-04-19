/*
 * AppraisalRuleReader.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.manage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Logger;

import de.affect.appraisal.eec.Appealingness;
import de.affect.appraisal.eec.Agency;
import de.affect.appraisal.AppraisalVariables;
import de.affect.appraisal.eec.Desirability;
import de.affect.appraisal.eec.Likelihood;
import de.affect.appraisal.eec.Liking;
import de.affect.appraisal.eec.Praiseworthiness;
import de.affect.appraisal.eec.Realization;

import static de.affect.util.Convert.doubleValue;
import static de.affect.data.AffectConsts.*;
import static de.affect.emotion.EmotionType.*;

import de.affect.xml.EventTypes;
import de.affect.xml.ActionTypes;
import de.affect.xml.ObjectTypes;
import de.affect.xml.SelfActType;
import de.affect.xml.DirectActType;
import de.affect.xml.IndirectActType;
import de.affect.xml.SelfEmotionType;
import de.affect.xml.IndirectEmotionType;
import de.affect.xml.SelfMoodType;
import de.affect.xml.IndirectMoodType;
import de.affect.xml.AffectDefinitionDocument;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.*;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.*;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.*;

import static de.affect.manage.AffectManager.sLog;

/**
 * The class
 * <code>AppraisalRuleReader</code> provides a method that reads all appraisal
 * rules defined by a Appraisal element node
 *
 * This code relys on the xml bean classes created with xmlbeans v1.3 from the
 * Affect.xsd schema, which is part of this distribution.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AppraisalRuleReader {

  public static final String sEMOTIONAPPRAISALRULEPREFIX = "Emotion";
  public static final String sMOODAPPRAISALRULEPREFIX = "Mood";
  public static final String sINDIRECTACTAPPRAISALRULEPREFIX = "Indirect";

  protected AppraisalRuleReader() {
  }

  private static AppraisalVariables getAppraisalVariables(String type, String signal, String elicitor,
    java.lang.Object basicObject) {
    Class[] cArgs = new Class[0];
    java.lang.Object[] oArgs = new java.lang.Object[0];
    Desirability desirability = null;
    Praiseworthiness praiseworthiness = null;
    Appealingness appealingness = null;
    Likelihood likelihood = null;
    Realization realization = null;
    Liking liking = null;
    Agency agency = null;
    boolean hasContent = false;
    try {
      String mStr = "get" + signal;
      Method method = basicObject.getClass().getMethod(mStr, cArgs);
      java.lang.Object obj = method.invoke(basicObject, oArgs);
      try {
        Method desirablityMethod = obj.getClass().getMethod("getDesirability", cArgs);
        java.lang.Object value = desirablityMethod.invoke(obj, oArgs);
        desirability = new Desirability(doubleValue(value.toString()));
        hasContent = true;
      } catch (Exception e) {
      }
      try {
        Method praiseworthinessMethod = obj.getClass().getMethod("getPraiseworthiness", cArgs);
        java.lang.Object value = praiseworthinessMethod.invoke(obj, oArgs);
        praiseworthiness = new Praiseworthiness(doubleValue(value.toString()));
        hasContent = true;
      } catch (Exception e) {
      }
      try {
        Method appealingnessMethod = obj.getClass().getMethod("getAppealingness", cArgs);
        java.lang.Object value = appealingnessMethod.invoke(obj, oArgs);
        appealingness = new Appealingness(doubleValue(value.toString()));
        hasContent = true;
      } catch (Exception e) {
      }
      try {
        Method likelihoodMethod = obj.getClass().getMethod("getLikelihood", cArgs);
        java.lang.Object value = likelihoodMethod.invoke(obj, oArgs);
        likelihood = new Likelihood(doubleValue(value.toString()));
        hasContent = true;
      } catch (Exception e) {
      }
      try {
        Method realizationMethod = obj.getClass().getMethod("getRealization", cArgs);
        java.lang.Object value = realizationMethod.invoke(obj, oArgs);
        realization = new Realization(doubleValue(value.toString()));
        hasContent = true;
      } catch (Exception e) {
      }
      try {
        Method likingMethod = obj.getClass().getMethod("getLiking", cArgs);
        java.lang.Object value = likingMethod.invoke(obj, oArgs);
        liking = new Liking(doubleValue(value.toString()));
        hasContent = true;
      } catch (Exception e) {
      }
      try {
        Method agencyMethod = obj.getClass().getMethod("getAgency", cArgs);
        java.lang.Object value = agencyMethod.invoke(obj, oArgs);
        agency = (value.toString().trim().equals("self")) ? Agency.SELF : Agency.OTHER;
        hasContent = true;
      } catch (Exception e) {
      }
    } catch (Exception e) {
      //log.warning("Undefined signal " + signal);
    }
    if (hasContent) {
      return new AppraisalVariables(type, signal, desirability, praiseworthiness, appealingness,
        likelihood, realization, agency, liking, elicitor);
    } else {
      return null;
    }
  }

  /**
   * The method
   * <code>classifyRules</code> classifies user defined appraisal rules.
   * Basically there are two types of rules : Basic appraisal rules and complex
   * appraisal rules. A rule always contains a key and a value. The value is
   * alway a set of appraisal variables. Values for basic rules are limited to
   * one element. The key of a rule is later used for reference. Basic appraisal
   * rules keys are their name itself. The complex rules' key can be either a
   * dialog act name or an emotion name.
   *
   * @param complexRuleKey key of an complex appraisal rule
   * @param complex boolean, which indicates if appraisal rule is complex or not
   * @param appraisalRules the appraisal rule container
   * @param appraisalElement the input object, which holds the appraisal rule
   * definition
   *
   * @return a set of appraisal rules
   */
  private static AppraisalRules classifyRules(String entity, String complexRuleKey,
    String type, String elicitor,
    boolean complex, AppraisalRules appraisalRules,
    java.lang.Object appraisalElement) {
    int cnt = 1; // xmlbeans do count from 1!
    int eventNum = EventTypes.Enum.table.lastInt();
    ArrayList<AppraisalVariables> appraisalVarList = new ArrayList<AppraisalVariables>();
    for (cnt = 1; cnt <= eventNum; cnt++) {
      String event = EventTypes.Enum.forInt(cnt).toString();
      AppraisalVariables av = getAppraisalVariables("Event", event,
        elicitor, appraisalElement);
      if (av != null) {
        appraisalVarList.add(av);
        if (!complex) {
          sLog.info("\t\t" + event);
          appraisalRules.add(entity, event, type,
            appraisalVarList.toArray(new AppraisalVariables[1]));
          appraisalVarList = new ArrayList<AppraisalVariables>();
        }
      }
    }
    int actionNum = ActionTypes.Enum.table.lastInt();
    for (cnt = 1; cnt <= actionNum; cnt++) {
      String action = ActionTypes.Enum.forInt(cnt).toString();
      AppraisalVariables av = getAppraisalVariables("Action", action,
        elicitor, appraisalElement);
      if (av != null) {
        appraisalVarList.add(av);
        if (!complex) {
          sLog.info("\t\t" + action);
          appraisalRules.add(entity, action, type,
            appraisalVarList.toArray(new AppraisalVariables[1]));
          appraisalVarList = new ArrayList<AppraisalVariables>();
        }
      }
    }
    int objectNum = ObjectTypes.Enum.table.lastInt();
    for (cnt = 1; cnt <= objectNum; cnt++) {
      String object = ObjectTypes.Enum.forInt(cnt).toString();
      AppraisalVariables av = getAppraisalVariables("Object", object,
        elicitor, appraisalElement);
      if (av != null) {
        appraisalVarList.add(av);
        if (!complex) {
          sLog.info("\t\t" + object);
          appraisalRules.add(entity, object, type,
            appraisalVarList.toArray(new AppraisalVariables[1]));
          appraisalVarList = new ArrayList<AppraisalVariables>();
        }
      }
    }
    if (complex && (!appraisalVarList.isEmpty())) {
      appraisalRules.add(entity, complexRuleKey, type,
        appraisalVarList.toArray(new AppraisalVariables[1]));
    }
    //DEBUG log.info(appraisalRules.toString());
    return appraisalRules;
  }

  /**
   * The method
   * <code>readAppraisalRules</code> reads all appraisal rules defined by an
   * Appraisal element node
   *
   * @param appraisal a CharacterAffect.Appraisal element node
   *
   * @return a set of appraisal rules
   */
  public static AppraisalRules readAppraisalRules(EntityManager entity, CharacterAffect.Appraisal appraisal) {
    // First create rules
    AppraisalRules appraisalRules = new AppraisalRules();
    // BASIC APPRAISAL RULES
    CharacterAffect.Appraisal.Basic basicAppraisal = appraisal.getBasic();
    appraisalRules = classifyRules(entity.getName(), "", "Basic", "Basic Elicitor", false,
      appraisalRules, basicAppraisal);
    // DIALOG ACT (SELF, EXTERNAL) APPRAISAL RULES
    SelfActType[] selfActsAppraisal = appraisal.getSelfActList().toArray(new SelfActType[0]);
    for (SelfActType selfActAppraisal : selfActsAppraisal) {
      String ruleKey = selfActAppraisal.getType();
      sLog.info("\t\tSelf Act " + ruleKey);
      appraisalRules = classifyRules(entity.getName(), ruleKey, "SelfAct", "Self Act Elicitor",
        true, appraisalRules, selfActAppraisal);
    }
    DirectActType[] aimedAtSelfActsAppraisal = appraisal.getDirectActList().toArray(new DirectActType[0]);
    for (DirectActType aimedAtSelfActAppraisal : aimedAtSelfActsAppraisal) {
      String ruleKey = aimedAtSelfActAppraisal.getType();
      EntityManager otherEntity = new EntityManager(aimedAtSelfActAppraisal.getPerformer());
      sLog.info("\t\tDirected Act " + ruleKey + " from " + otherEntity.getName());
      appraisalRules = classifyRules(otherEntity.getName(), ruleKey, "DirectAct", "Direct Act Elicitor",
        true, appraisalRules, aimedAtSelfActAppraisal);
    }
    IndirectActType[] externalActsAppraisal = appraisal.getIndirectActList().toArray(new IndirectActType[0]);
    for (IndirectActType externalActAppraisal : externalActsAppraisal) {
      //String ruleKey = sINDIRECTACTAPPRAISALRULEPREFIX + externalActAppraisal.getType();
      String ruleKey = externalActAppraisal.getType();
      EntityManager otherEntity = new EntityManager(externalActAppraisal.getPerformer());
      sLog.info("\t\tIndirect Act " + ruleKey + " from " + otherEntity.getName());
      appraisalRules = classifyRules(otherEntity.getName(), ruleKey, "IndirectAct", "Indirect Act Elicitor",
        true, appraisalRules, externalActAppraisal);
    }
    // EMOTION (SELF, EXTERNAL) APPRAISAL RULES
    SelfEmotionType[] selfEmotionsAppraisal = appraisal.getSelfEmotionList().toArray(new SelfEmotionType[0]);
    for (SelfEmotionType selfEmotionAppraisal : selfEmotionsAppraisal) {
      //String ruleKey = sEMOTIONAPPRAISALRULEPREFIX + selfEmotionAppraisal.getEmotion().toString();
      String ruleKey = selfEmotionAppraisal.getEmotion().toString();
      sLog.info("\t\tSelf Emotion " + ruleKey);
      appraisalRules = classifyRules(entity.getName(), ruleKey, "SelfEmotion", "Emotion Elicitor",
        true, appraisalRules, selfEmotionAppraisal);
    }
    IndirectEmotionType[] externEmotionsAppraisal = appraisal.getIndirectEmotionList().toArray(new IndirectEmotionType[0]);
    for (IndirectEmotionType externEmotionAppraisal : externEmotionsAppraisal) {
      //String ruleKey = sEMOTIONAPPRAISALRULEPREFIX + externEmotionAppraisal.getEmotion().toString();
      String ruleKey = externEmotionAppraisal.getEmotion().toString();
      EntityManager otherEntity = new EntityManager(externEmotionAppraisal.getPerformer());
      sLog.info("\t\tIndirect Emotion " + ruleKey + " from " + otherEntity.getName());
      appraisalRules = classifyRules(otherEntity.getName(), ruleKey, "ExternalEmotion", "External Emotion Elicitor",
        true, appraisalRules, externEmotionAppraisal);
    }
    // MOOD (SELF, EXTERNAL) APPRAISAL RULES
    SelfMoodType[] selfMoodsAppraisal = appraisal.getSelfMoodList().toArray(new SelfMoodType[0]);
    for (SelfMoodType selfMoodAppraisal : selfMoodsAppraisal) {
      //String ruleKey = sMOODAPPRAISALRULEPREFIX + selfMoodAppraisal.getMood().toString();
      String ruleKey = selfMoodAppraisal.getMood().toString();
      sLog.info("\t\tSelf Mood " + ruleKey + " appraised by " + entity.getName());
      appraisalRules = classifyRules(entity.getName(), ruleKey, "SelfMood", "Mood Elicitor",
        true, appraisalRules, selfMoodAppraisal);
    }
    IndirectMoodType[] externMoodsAppraisal = appraisal.getIndirectMoodList().toArray(new IndirectMoodType[0]);
    for (IndirectMoodType externMoodAppraisal : externMoodsAppraisal) {
      //String ruleKey = sMOODAPPRAISALRULEPREFIX + externMoodAppraisal.getMood().toString();
      String ruleKey = externMoodAppraisal.getMood().toString();
      EntityManager otherEntity = new EntityManager(externMoodAppraisal.getPerformer());
      sLog.info("\t\tIndirect Mood " + ruleKey + " from " + otherEntity.getName());
      appraisalRules = classifyRules(otherEntity.getName(), ruleKey, "ExternalMood", "External Mood Elicitor",
        true, appraisalRules, externMoodAppraisal);
    }
    return appraisalRules;
  }

  /**
   * The method
   * <code>readAppraisalRules</code> reads all appraisal rules defined by an
   * Appraisal element node
   *
   * @param appraisal a GroupAffect.Appraisal element node
   *
   * @return a set of appraisal rules
   */
  public static AppraisalRules readAppraisalRules(EntityManager entity, GroupAffect.Appraisal appraisal) {
    // First create an empty rules
    AppraisalRules appraisalRules = new AppraisalRules();
    // BASIC APPRAISAL RULES
    GroupAffect.Appraisal.Basic basicAppraisal = appraisal.getBasic();
    appraisalRules = classifyRules(entity.getName(), "", "Basic", "Basic Elicitor", false,
      appraisalRules, basicAppraisal);
    // INDIRECT ACT APPRAISAL RULES
    IndirectActType[] externalActsAppraisal = appraisal.getIndirectActList().toArray(new IndirectActType[0]);
    for (IndirectActType externalActAppraisal : externalActsAppraisal) {
      //String ruleKey = sINDIRECTACTAPPRAISALRULEPREFIX + externalActAppraisal.getType();
      String ruleKey = externalActAppraisal.getType();
      EntityManager otherEntity = new EntityManager(externalActAppraisal.getPerformer());
      sLog.info("\t\tIndirect Act " + ruleKey + " from " + otherEntity.getName());
      appraisalRules = classifyRules(otherEntity.getName(), ruleKey, "IndirectAct", "Indirect Act Elicitor",
        true, appraisalRules, externalActAppraisal);
    }
    // INDIRECT EMOTION APPRAISAL RULES
    IndirectEmotionType[] externEmotionsAppraisal = appraisal.getIndirectEmotionList().toArray(new IndirectEmotionType[0]);
    for (IndirectEmotionType externEmotionAppraisal : externEmotionsAppraisal) {
      //String ruleKey = sEMOTIONAPPRAISALRULEPREFIX + externEmotionAppraisal.getEmotion().toString();
      String ruleKey = externEmotionAppraisal.getEmotion().toString();
      EntityManager otherEntity = new EntityManager(externEmotionAppraisal.getPerformer());
      sLog.info("\t\tIndirect Emotion " + ruleKey + " from " + otherEntity.getName());
      appraisalRules = classifyRules(otherEntity.getName(), ruleKey, "ExternalEmotion", "External Emotion Elicitor",
        true, appraisalRules, externEmotionAppraisal);
    }
    // INDIRECT MOOD APPRAISAL RULES
    IndirectMoodType[] externMoodsAppraisal = appraisal.getIndirectMoodList().toArray(new IndirectMoodType[0]);
    for (IndirectMoodType externMoodAppraisal : externMoodsAppraisal) {
      //String ruleKey = sMOODAPPRAISALRULEPREFIX + externMoodAppraisal.getMood().toString();
      String ruleKey = externMoodAppraisal.getMood().toString();
      EntityManager otherEntity = new EntityManager(externMoodAppraisal.getPerformer());
      sLog.info("\t\tIndirect Mood " + ruleKey + " from " + otherEntity.getName());
      appraisalRules = classifyRules(otherEntity.getName(), ruleKey, "ExternalMood", "External Mood Elicitor",
        true, appraisalRules, externMoodAppraisal);
    }
    return appraisalRules;
  }
}
