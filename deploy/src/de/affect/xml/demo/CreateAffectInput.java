/*
 * CreateAffectInput.java
 *
 * Copyright (c) 2004, 2006, 2007, 2008, Patrick Gebhard, DFKI GmbH
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

package de.affect.xml.demo;

import org.apache.xmlbeans.*;
import de.affect.xml.CharacterType;
import de.affect.xml.ActionTypes;
import de.affect.xml.EventTypes;
import de.affect.xml.ObjectTypes;
import de.affect.xml.Intensity;
import de.affect.xml.AffectInputDocument;
import de.affect.xml.AffectInputDocument.AffectInput;
import de.affect.xml.AffectInputDocument.AffectInput.Character;
import de.affect.xml.AffectInputDocument.AffectInput.Act;
import de.affect.xml.AffectInputDocument.AffectInput.Action;
import de.affect.xml.AffectInputDocument.AffectInput.Event;
import de.affect.xml.AffectInputDocument.AffectInput.Object;
import de.affect.xml.AffectInputDocument.AffectInput.BasicEEC;

/**
 * The class <code>CreateAffectInput</code> illustrates how to create xml
 * input structures for the affect engine.
 *
 * This code relys on the xml bean classes created with xmlbeans v1.3 from
 * the Affect.xsd schema, which is part of the ml affect engine distribution.
 * It also relys on the Java 1.5 RC version.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class CreateAffectInput {
  AffectInputDocument aiDoc = null;
  AffectInput aiInput = null;
  Character perfCharacter = null;
  
  public CreateAffectInput() {
    System.out.println(createAffectInputAct("Valerie", "Sven", "Boast"));
    System.out.println(createAffectInputAction("Valerie", "Encouraging Sven", "GoodActSelf"));
    System.out.println(createAffectInputEvent("Valerie", "All answers are wrong", "BadEvent"));
    System.out.println(createAffectInputObject("Valerie", "The new HRD", "NiceThing"));
    System.out.println(createAffectInputBasicEECString("Valerie", 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, "self", "test"));
  }
  
  /**
   * Creates an AffectInput document containing an BasicEEC Element and returns a String object
   */
  private String createAffectInputBasicEECString(String actor,
      double desirability, double praiseworthiness, double appealingness, double likelihood,
      double liking, double realization, String agency, String elicitor) {
    
    aiDoc = AffectInputDocument.Factory.newInstance();
    aiInput = AffectInput.Factory.newInstance();
    // Building the Character element
    perfCharacter = Character.Factory.newInstance();
    perfCharacter.setName(actor);
    
    BasicEEC eec = BasicEEC.Factory.newInstance();
    
    eec.setDesirability(desirability);
    eec.setPraiseworthiness(praiseworthiness);
    eec.setAppealingness(appealingness);
    eec.setLikelihood(likelihood);
    eec.setLiking(liking);
    eec.setRealization(realization);
    eec.setAgency((agency.toLowerCase() == "self") ? BasicEEC.Agency.SELF : BasicEEC.Agency.OTHER);
    eec.setElicitor(elicitor);
    
    aiInput.setCharacter(perfCharacter);
    aiInput.setBasicEEC(eec);
    aiDoc.setAffectInput(aiInput);
    return aiDoc.toString();
  }
  
  /**
   * Creates an AffectInput document containing an BasicEEC Element and returns a AffectInput object
   */
  private AffectInput createAffectInputBasicEEC(String actor,
      double desirability, double praiseworthiness, double appealingness, double likelihood,
      double liking, double realization, String agency, String elicitor) {
    
    aiInput = AffectInput.Factory.newInstance();
    // Building the Character element
    perfCharacter = Character.Factory.newInstance();
    perfCharacter.setName(actor);
    
    BasicEEC eec = BasicEEC.Factory.newInstance();
    
    eec.setDesirability(desirability);
    eec.setPraiseworthiness(praiseworthiness);
    eec.setAppealingness(appealingness);
    eec.setLikelihood(likelihood);
    eec.setLiking(liking);
    eec.setRealization(realization);
    eec.setAgency((agency.toLowerCase() == "self") ? BasicEEC.Agency.SELF : BasicEEC.Agency.OTHER);
    eec.setElicitor(elicitor);
    
    aiInput.setCharacter(perfCharacter);
    aiInput.setBasicEEC(eec);
    
    return aiInput;
  }
  
  /**
   * Creates an AffectInput document containing an Act Element
   */
  private String createAffectInputAct(String performer, String addressee, String actType) {
    aiDoc = AffectInputDocument.Factory.newInstance();
    aiInput = AffectInput.Factory.newInstance();
    // Building the Character element
    perfCharacter = Character.Factory.newInstance();
    perfCharacter.setName(performer);
    // Building the Act element
    Act act = Act.Factory.newInstance();
    act.setAddressee(addressee);
    act.setType(actType);
    // Merging all together
    aiInput.setCharacter(perfCharacter);
    aiInput.setAct(act);
    aiDoc.setAffectInput(aiInput);
    return aiDoc.toString();
  }
  
  
  /**
   * Creates an AffectInput document containing an Action Element
   */
  private String createAffectInputAction(String performer, String name, String actionType) {
    aiDoc = AffectInputDocument.Factory.newInstance();
    aiInput = AffectInput.Factory.newInstance();
    // Building the Character element
    perfCharacter = Character.Factory.newInstance();
    perfCharacter.setName(performer);
    // Building the Action element
    Action action = Action.Factory.newInstance();
    action.setType(ActionTypes.Enum.forString(actionType));
    action.setIntensity("medium");
    action.setElicitor(name);
    // Merging all together
    aiInput.setCharacter(perfCharacter);
    aiInput.setAction(action);
    aiDoc.setAffectInput(aiInput);
    return aiDoc.toString();
  }
  
  /**
   * Creates an AffectInput document containing an Event Element
   */
  private String createAffectInputEvent(String performer, String name, String eventType) {
    aiDoc = AffectInputDocument.Factory.newInstance();
    aiInput = AffectInput.Factory.newInstance();
    // Building the Character element
    perfCharacter = Character.Factory.newInstance();
    perfCharacter.setName(performer);
    // Building the Event element
    Event event = Event.Factory.newInstance();
    event.setType(EventTypes.Enum.forString(eventType));
    event.setIntensity("mild");
    event.setElicitor(name);
    // Merging all together
    aiInput.setCharacter(perfCharacter);
    aiInput.setEvent(event);
    aiDoc.setAffectInput(aiInput);
    return aiDoc.toString();
  }
  
  /**
   * Creates an AffectInput document containing an Object Element
   */
  private String createAffectInputObject(String performer, String name, String objectType) {
    aiDoc = AffectInputDocument.Factory.newInstance();
    aiInput = AffectInput.Factory.newInstance();
    // Building the Character element
    perfCharacter = Character.Factory.newInstance();
    perfCharacter.setName(performer);
    // Building the Object element
    Object object = Object.Factory.newInstance();
    object.setType(ObjectTypes.Enum.forString(objectType));
    object.setIntensity("0.25");
    object.setElicitor(name);
    // Merging all together
    aiInput.setCharacter(perfCharacter);
    aiInput.setObject(object);
    aiDoc.setAffectInput(aiInput);
    return aiDoc.toString();
  }
  
  public static void main( String[] args ) {
    CreateAffectInput aim = new CreateAffectInput();
  }
}
