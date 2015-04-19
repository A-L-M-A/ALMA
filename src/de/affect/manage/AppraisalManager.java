/*
 * AppraisalManager.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.manage;

import java.io.File;
import java.io.IOException;

import de.affect.appraisal.EEC;
import de.affect.appraisal.AppraisalVariables;
import de.affect.appraisal.eec.Desirability;
import de.affect.appraisal.eec.Praiseworthiness;
import de.affect.appraisal.eec.Appealingness;
import de.affect.appraisal.eec.Likelihood;
import de.affect.appraisal.eec.Realization;
import de.affect.appraisal.eec.Liking;
import de.affect.appraisal.eec.Agency;
import de.affect.emotion.PADEmotion;
import de.affect.mood.Mood;
import de.affect.xml.AffectInputDocument;
import de.affect.xml.AffectInputDocument.AffectInput;

import org.apache.xmlbeans.XmlException;

import static de.affect.manage.AffectManager.sLog;

/**
 * The class <code>AppraisalManager</code> contains methods for appraising
 * relevant input for affect generation.
 *
 * This code relys on the xml bean classes created with xmlbeans v1.3 from
 * the Affect.xsd schema, which is part of this distribution.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AppraisalManager {
  
  public AppraisalManager() {}
  
  /**
   * The method <code>parseInput</code> gets the related java object to the
   * AffectInput XML element defined by the Affect.xsd.
   *
   * @param xmlDoc a string which contains the AffectInput XML element
   */
  public AffectInput parseInputString(String xmlDoc) throws XmlException {
    AffectInputDocument aiDoc = AffectInputDocument.Factory.parse(xmlDoc);
    AffectInput ai = aiDoc.getAffectInput();
    if (aiDoc.validate()) {
      return ai;
    } else {
      throw(new XmlException("Wrong affect input - discarded!"));
    }
  }
  
  /**
   * The method <code>parseInput</code> gets the related java object to the
   * AffectInput-DOM-Node.
   *
   * @param xmlDoc a file which contains of the AffectInput-Element
   */
  public AffectInput parseInputFile(String xmlDoc) throws IOException, XmlException {
    return AffectInputDocument.Factory.parse(new File(xmlDoc)).getAffectInput();
  }
  
  
  /**
   * appraise for Characters
   */
  private synchronized void appraise(CharacterManager character, AppraisalVariables appVars,
      double intensityCorrection, String currentElicitor) {
    if (appVars != null) {
      String elicitor = (currentElicitor != null) ? currentElicitor : "none";
      String type = appVars.getType();
      Desirability desirability = appVars.getDesirability();
      Praiseworthiness praiseworthiness = appVars.getPraiseworthiness();
      Appealingness appealingness = appVars.getAppealingness();
      Likelihood likelihood = appVars.getLikelihood();
      Realization realization = appVars.getRealization();
      Liking liking = appVars.getLiking();
      Agency agency = appVars.getAgency();
      
      if (type.equals("EEC")) {
        // if EEC contains a realization value, than no other variable is considered ...
        if ((realization != null) ) {
          Realization corrRealization =
              new Realization(realization.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrRealization));
          return;
        }
        
        // eecs for compound emotions (desirability and praiseworthiness)
        if ((desirability != null) && (praiseworthiness != null) && (agency != null) && (likelihood == null) && (liking == null)) {
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrDesirability));
          Praiseworthiness corrPraiseworthiness =
              new Praiseworthiness(praiseworthiness.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseAction(elicitor, corrPraiseworthiness, agency));
          return;
        }
        
        if ((desirability != null) && (likelihood == null) && (liking == null)) {
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrDesirability));
          return;
        }
        if ((desirability != null) && (likelihood != null) && (liking == null)) {
          Likelihood corrLikelihood =
              new Likelihood(likelihood.degree()*intensityCorrection);
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrDesirability, corrLikelihood));
          return;
        }
        if ((desirability != null) && (likelihood == null) && (liking != null)) {
          Liking corrLiking =
              new Liking(liking.degree()*intensityCorrection);
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrDesirability, corrLiking));
          return;
        }
        
        // eecs for compound emotions (praiseworthiness & appealingness)
        if ((praiseworthiness != null) && (agency != null) && (appealingness != null)) {
          Praiseworthiness corrPraiseworthiness =
              new Praiseworthiness(praiseworthiness.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseAction(elicitor, corrPraiseworthiness, agency));
          Appealingness corrAppealingness =
              new Appealingness(appealingness.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseObject(elicitor, corrAppealingness));
          return;
        }
        
        // eecs for action
        if ((praiseworthiness != null) && (agency != null)) {
          Praiseworthiness corrPraiseworthiness =
              new Praiseworthiness(praiseworthiness.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseAction(elicitor, corrPraiseworthiness, agency));
          return;
        }
        
        // eecs for object
        if ((appealingness != null)) {
          Appealingness corrAppealingness =
              new Appealingness(appealingness.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseObject(elicitor, corrAppealingness));
          return;
        }
      }
      
      if (type.equals("Action")) {
        //sLog.info("\tas action");
        if ((praiseworthiness != null) && (agency != null)) {
          Praiseworthiness corrPraiseworthiness =
              new Praiseworthiness(praiseworthiness.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseAction(elicitor, corrPraiseworthiness, agency));
        }
        return;
      }
      if (type.equals("Event")) {
        //sLog.info("\tas event");
        if ((realization != null) ) {
          Realization corrRealization =
              new Realization(realization.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrRealization));
          return;
        }
        if ((desirability != null) && (likelihood == null) && (liking == null)) {
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrDesirability));
          return;
        }
        if ((desirability != null) && (likelihood != null) && (liking == null)) {
          Likelihood corrLikelihood =
              new Likelihood(likelihood.degree()*intensityCorrection);
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrDesirability, corrLikelihood));
          return;
        }
        if ((desirability != null) && (likelihood == null) && (liking != null)) {
          Liking corrLiking =
              new Liking(liking.degree()*intensityCorrection);
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseEvent(elicitor, corrDesirability, corrLiking));
          return;
        }
      }
      if (type.equals("Object")) {
        //sLog.info("\tas object");
        if ((appealingness != null)) {
          Appealingness corrAppealingness =
              new Appealingness(appealingness.degree()*intensityCorrection);
          character.addEEC(EEC.appraiseObject(elicitor, corrAppealingness));
        }
        return;
      }
    } else {
      //sLog.info("Nothing to appraise!");
    }
  }
  
  /**
   * appraise for Groups
   */
  private synchronized void appraise(GroupManager group, AppraisalVariables appVars,
      double intensityCorrection, String currentElicitor) {
    if (appVars != null) {
      String elicitor = (currentElicitor != null) ?
        currentElicitor : "none";
      String type = appVars.getType();
      Desirability desirability = appVars.getDesirability();
      Praiseworthiness praiseworthiness = appVars.getPraiseworthiness();
      Appealingness appealingness = appVars.getAppealingness();
      Likelihood likelihood = appVars.getLikelihood();
      Realization realization = appVars.getRealization();
      Liking liking = appVars.getLiking();
      Agency agency = appVars.getAgency();
      if (type.equals("Action")) {
        //sLog.info("\tas action");
        if ((praiseworthiness != null) && (agency != null)) {
          Praiseworthiness corrPraiseworthiness =
              new Praiseworthiness(praiseworthiness.degree()*intensityCorrection);
          group.addEEC(EEC.appraiseAction(elicitor, corrPraiseworthiness, agency));
        }
        return;
      }
      if (type.equals("Event")) {
        //sLog.info("\tas event");
        if ((realization != null) ) {
          Realization corrRealization =
              new Realization(realization.degree()*intensityCorrection);
          group.addEEC(EEC.appraiseEvent(elicitor, corrRealization));
          return;
        }
        if ((desirability != null) && (likelihood == null) && (liking == null)) {
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          group.addEEC(EEC.appraiseEvent(elicitor, corrDesirability));
          return;
        }
        if ((desirability != null) && (likelihood != null) && (liking == null)) {
          Likelihood corrLikelihood =
              new Likelihood(likelihood.degree()*intensityCorrection);
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          group.addEEC(EEC.appraiseEvent(elicitor, corrDesirability, corrLikelihood));
          return;
        }
        if ((desirability != null) && (likelihood == null) && (liking != null)) {
          Liking corrLiking =
              new Liking(liking.degree()*intensityCorrection);
          Desirability corrDesirability =
              new Desirability(desirability.degree()*intensityCorrection);
          group.addEEC(EEC.appraiseEvent(elicitor, corrDesirability, corrLiking));
          return;
        }
      }
      if (type.equals("Object")) {
        //sLog.info("\tas object");
        if ((appealingness != null)) {
          Appealingness corrAppealingness =
              new Appealingness(appealingness.degree()*intensityCorrection);
          group.addEEC(EEC.appraiseObject(elicitor, corrAppealingness));
        }
        return;
      }
    } else {
      //sLog.info("Nothing to appraise!");
    }
  }
  
  
  /**
   * processBasicEEC for Characters
   */
  public synchronized void processBasicECC(AppraisalVariables appVar, CharacterManager performer, String elicitor) {
    // EECs for performer
    if (performer == null) {
      //sLog.warning("Performing character not identified! Dropping basic eec");
      return;
    }
    //sLog.info("Appraising eec for " + performer.getName());
    // intensity has to be 1.0d because eec value will be multiplied by this.
    appraise(performer, appVar, 1.0d, elicitor);
    performer.inferEmotions();
  }
  
  
  /*
   * processPAD for Characters
   */
  public synchronized void processPADInput(CharacterManager performer, Mood m, double intensity, String description) {
    performer.infuseBioSignalEmotions(new PADEmotion(m, intensity, description));
  }
  
  /**
   * processAct for Characters
   */
  public synchronized void processAct(String act, double intensity,
      CharacterManager performer, CharacterManager[] addressees,
      CharacterManager[] listeners, String elicitor) {
    AppraisalVariables[] appVars = null;
    // EECs for performer
    if (performer == null) {
      //sLog.warning("Performing character not identified! Dropping act " + act);
      return;
    }
    //log.info("Appraising act " + act + " from " + performer.getName());
    appVars = performer.getAppraisalVariables(act);
    if (appVars.length == 0) {
      //log.warning(performer.getName() + " does not know how to appraise act " + act + ". Dropping act for performer!");
    } else {
      for (AppraisalVariables appVar : appVars) {
        //log.info("Subjective self act appraisal");
        appraise(performer, appVar, intensity, elicitor);
      }
      performer.inferEmotions();
    }
    // EECs for addressee
    if ((addressees.length == 0 || addressees == null)) {
      //sLog.warning("No Addressee(s)! Dropping act " + act + " for addressee(s)!");
    } else {
      for (CharacterManager addressee : addressees) {
        if (addressee == null) {
          //sLog.warning("Invalid or no addressee. Act is lost for addressee!");
        } else {
          //log.info("Subjective appraisal from addressee " + addressee.getName());
          appVars = addressee.getAppraisalVariables(performer, act, "DirectAct");
          if (appVars.length == 0 ) {
            //log.warning(addressee.getName() + " cannot appraise act " + act + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other act appraisal");
            for (AppraisalVariables appVar : appVars) {
              appraise(addressee, appVar, intensity, elicitor);
            }
            addressee.inferEmotions();
          }
        }
      }
    }
    // EECs for other listeners
    if ((listeners.length == 0 || listeners == null)) {
      //sLog.warning("No Listener(s)! Dropping act " + act + " for listener(s)!");
    } else {
      for (CharacterManager listener : listeners) {
        if (listener == null) {
          //sLog.warning("Invalid or no listener. Act is lost for listener!");
        } else {
          //sLog.info("Subjective appraisal from listener " + listener.getName());
          appVars = listener.getAppraisalVariables(performer, act, "IndirectAct");
          if (appVars.length == 0 ) {
            //sLog.warning(listener.getName() + " cannot appraise act " + act + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other act appraisal");
            for (AppraisalVariables appVar : appVars) {
              appraise(listener, appVar, intensity, elicitor);
            }
            listener.inferEmotions();
          }
        }
      }
    }
  }
  
  /**
   * processAct for Groups
   */
  public synchronized void processAct(String act, double intensity,
      CharacterManager performer, GroupManager[] listeners, String elicitor) {
    AppraisalVariables[] appVars = null;
    // EECs for other listeners
    if ((listeners.length == 0 || listeners == null)) {
      //sLog.warning("No Listener(s)! Dropping act " + act + " for listener(s)!");
    } else {
      for (GroupManager listener : listeners) {
        if (listener == null) {
          //sLog.warning("Invalid or no listener. Act is lost for listener!");
        } else {
          //sLog.info("Subjective appraisal from listener " + listener.getName());
          appVars = listener.getAppraisalVariables(performer, act, "IndirectAct");
          if (appVars.length == 0 ) {
            //sLog.warning(listener.getName() + " cannot appraise act " + act + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other act appraisal");
            // give the group the personality of the performer
            listener.setPersonality(performer.getPersonality());
            // give the eecs
            for (AppraisalVariables appVar : appVars) {
              appraise(listener, appVar, intensity, elicitor);
            }
            listener.inferEmotions();
            //Questionable: listener.setPersonality(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
          }
        }
      }
    }
  }
  
  public synchronized void processEmotion(String emotion, double intensity,
      CharacterManager performer, CharacterManager[] addressees,
      CharacterManager[] listeners, String elicitor) {
    AppraisalVariables[] appVars = null;
    // EECs for performer
    if (performer == null) {
      //sLog.warning("Performing character not identified! Dropping emotion " + emotion);
      return;
    }
    //sLog.info("Appraising emotion " + emotion + " from " + performer.getName());
    appVars = performer.getAppraisalVariables(emotion, "SelfEmotion");
    //sLog.info("Got the dammed appraisal variables");
    if (appVars.length == 0) {
      //log.warning(performer.getName() + " does not know how to appraise emotion " + emotion + ". Dropping emotion!");
      return;
    }
    for (AppraisalVariables appVar : appVars) {
      //sLog.info("Subjective self emotion appraisal");
      appraise(performer, appVar, intensity, elicitor);
    }
    performer.inferEmotions();
    // EECs for addressee
    if (addressees.length == 0) {
      //sLog.warning("No Addressee(s)! Dropping emotion " + emotion + " for s/he/them!");
    } else {
      for (CharacterManager addressee : addressees) {
        if (addressee == null) {
          //sLog.warning("Invalid or no addressee. Emotion is lost for addressee!");
        } else {
          //sLog.info("Subjective appraisal from addressee " + addressee.getName());
          appVars = addressee.getAppraisalVariables(performer, emotion, "ExternalEmotion");
          if (appVars.length == 0 ) {
            //sLog.warning(addressee.getName() + " cannot appraise emotion " + emotion + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other emotion appraisal");
            for (AppraisalVariables appVar : appVars) {
              appraise(addressee, appVar, intensity, elicitor);
            }
            addressee.inferEmotions();
          }
        }
      }
    }
    // EECs for other listeners
    if (listeners.length == 0) {
      //sLog.warning("No Listener(s)! Dropping emotion " + emotion + " for s/he/them!");
    } else {
      for (CharacterManager listener : listeners) {
        if (listener == null) {
          //sLog.warning("Invalid or no listener. Emotion is lost for listener!");
        } else {
          //log.info("Subjective appraisal from listener " + listener.getName());
          appVars = listener.getAppraisalVariables(performer, emotion, "ExternalEmotion");
          if (appVars.length == 0 ) {
            //sLog.warning(listener.getName() + " cannot appraise emotion " + emotion + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other emotion appraisal");
            for (AppraisalVariables appVar : appVars) {
              appraise(listener, appVar, intensity, elicitor);
            }
            listener.inferEmotions();
          }
        }
      }
    }
  }
  
  /**
   * processEmotion for Groups
   */
  public synchronized void processEmotion(String emotion, double intensity,
      CharacterManager performer, GroupManager[] listeners, String elicitor) {
    AppraisalVariables[] appVars = null;
    // EECs for other listeners
    if ((listeners.length == 0 || listeners == null)) {
      //sLog.warning("No Listener(s)! Dropping emotion " + emotion + " for listener(s)!");
    } else {
      for (GroupManager listener : listeners) {
        if (listener == null) {
          //sLog.warning("Invalid or no listener. Emotion is lost for listener!");
        } else {
          //sLog.info("Subjective appraisal from listener " + listener.getName());
          appVars = listener.getAppraisalVariables(performer, emotion, "ExternalEmotion");
          if (appVars.length == 0 ) {
            //sLog.warning(listener.getName() + " cannot appraise emotion " + emotion + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other emotion appraisal");
            listener.setPersonality(performer.getPersonality());
            for (AppraisalVariables appVar : appVars) {
              appraise(listener, appVar, intensity, elicitor);
            }
            listener.inferEmotions();
            //Questionable: listener.setPersonality(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
          }
        }
      }
    }
  }
  
  public synchronized void processMood(String mood, double intensity,
      CharacterManager performer, CharacterManager[] addressees,
      CharacterManager[] listeners, String elicitor) {
    AppraisalVariables[] appVars = null;
    // EECs for performer
    if (performer == null) {
      //sLog.warning("Performing character not identified! Dropping mood " + mood);
      return;
    }
    //sLog.info(performer.getName() + " is appraising own mood " + mood);
    appVars = performer.getAppraisalVariables(mood, "SelfMood");
    if (appVars.length == 0) {
      //sLog.warning(performer.getName() + " does not know how to appraise own mood " + mood);
      return;
    }
    for (AppraisalVariables appVar : appVars) {
      //sLog.info("Subjective self act appraisal");
      appraise(performer, appVar, intensity, elicitor);
    }
    performer.inferEmotions();
    // EECs for addressee
    if (addressees.length == 0) {
      //sLog.warning("No Addressee(s)! Dropping mood " + mood + " for s/he/them!");
    } else {
      for (CharacterManager addressee : addressees) {
        if (addressee == null) {
          //sLog.warning("Invalid or no addressee. Mood is lost for addressee!");
        } else {
          //sLog.info("Subjective appraisal from addressee " + addressee.getName());
          appVars = addressee.getAppraisalVariables(performer, mood, "ExternalMood");
          if (appVars.length == 0 ) {
            //sLog.warning(addressee.getName() + " cannot appraise mood " + mood + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other mood appraisal");
            for (AppraisalVariables appVar : appVars) {
              appraise(addressee, appVar, intensity, elicitor);
            }
            addressee.inferEmotions();
          }
        }
      }
    }
    // EECs for other listeners
    if (listeners.length == 0) {
      //sLog.warning("No Listener(s)! Dropping mood " + mood + " for s/he/them!");
    } else {
      for (CharacterManager listener : listeners) {
        if (listener == null) {
          //sLog.warning("Invalid or no listener. Mood is lost for listener!");
        } else {
          //losLogg.info("Subjective appraisal from listener " + listener.getName());
          appVars = listener.getAppraisalVariables(performer, mood, "ExternalMood");
          if (appVars.length == 0 ) {
            //sLog.warning(listener.getName() + " cannot appraise mood " + mood + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other mood appraisal");
            for (AppraisalVariables appVar : appVars) {
              appraise(listener, appVar, intensity, elicitor);
            }
            listener.inferEmotions();
          }
        }
      }
    }
  }
  
  /**
   * processMood for Groups
   */
  public synchronized void processMood(String mood, double intensity,
      CharacterManager performer, GroupManager[] listeners, String elicitor) {
    AppraisalVariables[] appVars = null;
    // EECs for other listeners
    if ((listeners.length == 0 || listeners == null)) {
      //sLog.warning("No Listener(s)! Dropping mood " + mood + " for listener(s)!");
    } else {
      for (GroupManager listener : listeners) {
        if (listener == null) {
          //log.warning("Invalid or no listener. Mood is lost for listener!");
        } else {
          //sLog.info("Subjective appraisal from listener " + listener.getName());
          appVars = listener.getAppraisalVariables(performer, mood, "ExternalMood");
          if (appVars.length == 0 ) {
            //sLog.warning(listener.getName() + " cannot appraise mood " + mood + " from " + performer.getName() + "! No rule available!");
          } else {
            //sLog.info("Subjective other act appraisal");
            listener.setPersonality(performer.getPersonality());
            for (AppraisalVariables appVar : appVars) {
              appraise(listener, appVar, intensity, elicitor);
            }
            listener.inferEmotions();
            //Questionable: listener.setPersonality(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
          }
        }
      }
    }
  }
  
  public synchronized void processAction(String action, double intensity,
      CharacterManager character, String elicitor) {
    //log.info(character.getName() + " appraises action " + action);
    AppraisalVariables[] appVars = character.getAppraisalVariables(action);
    if (appVars.length == 0) {
      //sLog.warning(character.getName() + " does not know how to appraise action " + action);
      return;
    }
    appraise(character, appVars[0], intensity, elicitor);
    character.inferEmotions();
  }
  
  public synchronized void processEvent(String event, double intensity,
      CharacterManager character, String elicitor) {
    //log.info(character.getName() + " appraises event " + event);
    AppraisalVariables[] appVars = character.getAppraisalVariables(event);
    if (appVars.length == 0) {
      //sLog.warning(character.getName() + " does not know how to appraise event " + event);
      return;
    }
    appraise(character, appVars[0], intensity, elicitor);
    character.inferEmotions();
  }
  
  public synchronized void processObject(String object, double intensity,
      CharacterManager character, String elicitor) {
    //sLog.info(character.getName() + " appraises object " + object);
    AppraisalVariables[] appVars = character.getAppraisalVariables(object);
    if (appVars.length == 0) {
      //sLog.warning(character.getName() + " does not know how to appraise object ");
      return;
    }
    appraise(character, appVars[0], intensity, elicitor);
    character.inferEmotions();
  }
  
}
