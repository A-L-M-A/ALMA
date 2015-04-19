/*
 * AppraisalTag.java
*
 * Copyright (c) 2007, 2008, Patrick Gebhard, DFKI GmbH
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

package de.affect.util;

import org.apache.xmlbeans.*;
import de.affect.xml.CharacterType;
import de.affect.xml.ActionTypes;
import de.affect.xml.EventTypes;
import de.affect.xml.ObjectTypes;
import de.affect.xml.Intensity;
import de.affect.xml.AffectInputDocument.AffectInput;
import de.affect.xml.AffectInputDocument.AffectInput.Character;
import de.affect.xml.AffectInputDocument.AffectInput.Act;
import de.affect.xml.AffectInputDocument.AffectInput.Action;
import de.affect.xml.AffectInputDocument.AffectInput.Event;
import de.affect.xml.AffectInputDocument.AffectInput.Object;
import de.affect.xml.AffectInputDocument.AffectInput.PAD;

/**
 * This class provides simplification methode when working with appraisal tags
 *
 * @author Patrick Gebhard
 */
public final class AppraisalTag {

  static public enum Tags {GoodEvent, BadEvent, GoodEventForGoodOther, 
  GoodEventForBadOther, BadEventForBadOther, BadEventForGoodOther, 
  GoodLikelyFutureEvent, BadLikelyFutureEvent,
  GoodUnlikelyFutureEvent, BadUnlikelyFutureEvent,
  EventConfirmed, EventDisconfirmed, GoodActSelf, BadActSelf, GoodActOther, 
  BadActOther, NiceThing, NastyThing };
  
  static public enum EventTags { GoodEvent, BadEvent, GoodEventForGoodOther, 
  GoodEventForBadOther, BadEventForBadOther, BadEventForGoodOther, 
  GoodLikelyFutureEvent, BadLikelyFutureEvent,
  GoodUnlikelyFutureEvent, BadUnlikelyFutureEvent,
  EventConfirmed, EventDisconfirmed };
  
  static public enum ActionTags { GoodActSelf, BadActSelf, GoodActOther, 
  BadActOther };
  
  static public enum ObjectTags { NiceThing, NastyThing };
  
  private static final AppraisalTag fInstance = new AppraisalTag();
  
  /** 
   * This class  is a signleton!
   */
  private AppraisalTag() {
  }
  
  public static AppraisalTag instance() {
    return fInstance;
  }
  
  public boolean isAppraisalTag(String tag) {
    for (Tags t : Tags.values()) {
      if (tag.equalsIgnoreCase(t.name()))
        return true;
    }
    return false;
  }
  
  public boolean isEventAppraisalTag(String tag) {
    for (EventTags t : EventTags.values()) {
      if (tag.equalsIgnoreCase(t.name()))
        return true;
    }
    return false;
  }
  
  public boolean isActionAppraisalTag(String tag) {
    for (ActionTags t : ActionTags.values()) {
      if (tag.equalsIgnoreCase(t.name()))
        return true;
    }
    return false;
  }
  
  public boolean isObjectAppraisalTag(String tag) {
    for (ObjectTags t : ObjectTags.values()) {
      if (tag.equalsIgnoreCase(t.name()))
        return true;
    }
    return false;
  }
  
  public AffectInput makePADInput(String character, String p, String a, String d, String intensity, String description) {
    AffectInput aiInput = AffectInput.Factory.newInstance();

    // Building the Character element
    Character perfCharacter = Character.Factory.newInstance();
    perfCharacter.setName(character);
    aiInput.setCharacter(perfCharacter);

    PAD pad =PAD.Factory.newInstance();
    pad.setPleasure((new Double(p)).doubleValue());
    pad.setArousal((new Double(a)).doubleValue());
    pad.setDominance((new Double(d)).doubleValue());
    pad.setIntensity((new Double(intensity)).doubleValue());
    pad.setDescription(description);
    aiInput.setPAD(pad);
    
    return aiInput;
  }
  
  public AffectInput makeAffectInput(String character, String tag, String intensity, String elicitor) {
    AffectInput aiInput = AffectInput.Factory.newInstance();
    
    // Building the Character element
    Character perfCharacter = Character.Factory.newInstance();
    perfCharacter.setName(character);
    aiInput.setCharacter(perfCharacter);
    
    if (isEventAppraisalTag(tag)) {
      // Building the Event element
      Event event = Event.Factory.newInstance();
      event.setType(EventTypes.Enum.forString(tag));
      event.setIntensity(intensity);
      event.setElicitor(elicitor);
      
      aiInput.setEvent(event);
    } else if (isActionAppraisalTag(tag)) {
      // Building the Action element
      Action action = Action.Factory.newInstance();
      action.setType(ActionTypes.Enum.forString(tag));
      action.setIntensity(intensity);
      action.setElicitor(elicitor);
      
      aiInput.setAction(action);
    } else if (isObjectAppraisalTag(tag)) {
      // Building the Object element
      Object object = Object.Factory.newInstance();
      object.setType(ObjectTypes.Enum.forString(tag));
      object.setIntensity(intensity);
      object.setElicitor(elicitor);
      
      aiInput.setObject(object);
    } else {
      System.err.println("Error creating affect input - no such appraisal tag: " + tag);
    }
  
    return aiInput;
  }
  
}
