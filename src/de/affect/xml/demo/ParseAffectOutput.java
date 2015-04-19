/*
 * ParseAffectOutput.java
 *
 * Copyright (c) 2005, 2006, 2007, 2008, Patrick Gebhard, DFKI GmbH
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

import java.io.*;
import org.apache.xmlbeans.*;
import de.affect.xml.Intensity;
import de.affect.xml.SignedIntensity;
import de.affect.xml.PersonalityType;
import de.affect.xml.EmotionType;
import de.affect.xml.MoodType;
import de.affect.xml.CharacterType;
import de.affect.xml.AffectOutputDocument;
import de.affect.xml.AffectOutputDocument.AffectOutput;
import de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect;
import de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect;
import de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.*;
import java.util.List;

/** 
 * The class <code>ParseAffectOutput</code> illustrates how to parse xml
 * output structures of alma.
 * 
 * This code relys on the xml bean classes created with xmlbeans v1.3 from
 * the Affect.xsd schema, which is part of the this distribution.
 * 
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class ParseAffectOutput {
  AffectOutput aoOutput = null;
  List<CharacterAffect> charactersAffect = null;
  List<GroupAffect> groupsAffect = null;
  CharacterType[] characters = null;

  public ParseAffectOutput(String xmlFile) throws IOException, XmlException {
    aoOutput = AffectOutputDocument.Factory.parse(new File(xmlFile)).getAffectOutput();
    //charactersAffect = aoOutput.getCharacterAffectArray();
    charactersAffect = aoOutput.getCharacterAffectList();

    for(CharacterAffect ca : charactersAffect) {
       displayCharacterAffect(ca);
    }

    System.out.println("---");
    groupsAffect = aoOutput.getGroupAffectList();
    for (GroupAffect ga : groupsAffect) {
      System.out.println("Group " + ga.getName() + "'s mood is " +
			 ga.getOverallMood().getMoodword());
      System.out.println("Group " + ga.getName() + "'s social integrity is " +
			 ga.getSocialIntegrity().getValue());
    }
//     MoodSimilarities[] similarMoods = aoOutput.getMoodSimilaritiesArray();
//     if (similarMoods.length > 0) {
//       for (int ecnt = 0; ecnt < similarMoods.length; ecnt++) {
// 	characters = similarMoods[ecnt].getCharacterArray();
// 	for (int scnt = 0; scnt < characters.length; scnt++) {
// 	  System.out.println("Character " + 
// 			     characters[scnt].getName() + 
// 			     " in extreme mood " + 
// 			     similarMoods[ecnt].getMoodword());
// 	}
//       }
//     } else {
//       System.out.println("No characters in similar mood.");
//     }
//     MoodExtremes[] extremeMoods = aoOutput.getMoodExtremesArray();
//     if (extremeMoods.length > 0) {
//       for (int ecnt = 0; ecnt < extremeMoods.length; ecnt++) {
// 	System.out.println("Character " + 
// 			   extremeMoods[ecnt].getCharacter().getName() + 
// 			   " in extreme mood " + 
// 			   extremeMoods[ecnt].getMoodword());
//       }
//     } else {
//       System.out.println("No character has extreme mood.");
//     }
  }
  
  public void displayCharacterAffect(CharacterAffect characterAffect) {
    System.out.println(characterAffect.getName() + "'s affective profile:");
    System.out.println("    Dominant Emotion: " + 
		       characterAffect.getDominantEmotion().getName() + 
		       " (" + characterAffect.getDominantEmotion().getValue() + ")");
    System.out.println("  Current Mood State: " + 
		       characterAffect.getMood().getMoodword());
    if (characterAffect.getPersonality().getDerived()) {
      System.out.println("   False Personality: openness=" + 
			 characterAffect.getPersonality().getOpenness());
    } else {
      System.out.println("         Personality: openness=" + 
			 characterAffect.getPersonality().getOpenness());
    }
    System.out.println("                      conscientiouness=" + 
		       characterAffect.getPersonality().getConscientiousness());
    System.out.println("                      extraversion=" + 
		       characterAffect.getPersonality().getExtraversion());
    System.out.println("                      agreeableness=" + 
		       characterAffect.getPersonality().getAgreeableness());
    System.out.println("                      neurotism=" + 
		       characterAffect.getPersonality().getNeurotism());
  }
  
  public static void main( String[] args ) {
    try {
      ParseAffectOutput aim = new ParseAffectOutput(args[0]);
    } catch(IOException ioe) {
      ioe.printStackTrace();
    } catch(XmlException xmle) {
      xmle.printStackTrace();
    }
  }
}
