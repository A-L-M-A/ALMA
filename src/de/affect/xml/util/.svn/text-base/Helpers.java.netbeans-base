/*
 * Helpers.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.xml.util;

import java.util.StringTokenizer;

import de.affect.xml.AffectInputDocument;
import de.affect.xml.AffectInputDocument.AffectInput;

public class Helpers {

  protected Helpers() {
  }
  
  public static String getPerformer(AffectInput ai) {
    return ai.getCharacter().getName();
  }

  public static String[] getAddressee(AffectInput ai) {
    String[] addressee = null;
    addressee = 
      (ai.isSetAct()) ? getAddressee(ai.getAct()) : 
      (ai.isSetEmotionDisplay()) ? getAddressee(ai.getEmotionDisplay()) : 
      (ai.isSetMoodDisplay()) ? getAddressee(ai.getMoodDisplay()) : null;
    return addressee;
  }

  public static String[] getListener(AffectInput ai) {
    String[] listener = null;
    listener = 
      (ai.isSetAct()) ? getListener(ai.getAct()) : 
      (ai.isSetEmotionDisplay()) ? getListener(ai.getEmotionDisplay()) :
      (ai.isSetMoodDisplay()) ? getListener(ai.getMoodDisplay()) : null;
    return listener;
  }

  public static String[] getAddressee(AffectInput.Act aia) {
    if (!aia.isSetAddressee())
      return null;
    else {
      return toStringArray(aia.getAddressee());
    }
  }

  public static String[] getAddressee(AffectInput.EmotionDisplay aied) {
    if (!aied.isSetAddressee())
      return null;
    else
      return toStringArray(aied.getAddressee());    
  }

  public static String[] getAddressee(AffectInput.MoodDisplay aimd) {
    if (!aimd.isSetAddressee())
      return null;
    else
      return toStringArray(aimd.getAddressee());
  }

  public static String[] getListener(AffectInput.Act aia) {
    if (!aia.isSetListener())
      return null;
    else
      return toStringArray(aia.getListener());
  }

  public static String[] getListener(AffectInput.EmotionDisplay aied) {
    if (!aied.isSetListener())
      return null;
    else
      return toStringArray(aied.getListener());    
  }
  public static String[] getListener(AffectInput.MoodDisplay aimd) {
    if (!aimd.isSetListener())
      return null;
    else
      return toStringArray(aimd.getListener());
  }
 
  public static String[] toStringArray(String input) {
    if (input == null)
      return null;
    if (input.length() == 0)
      return null;
    if (!input.contains(","))
      return new String[] { input };
    StringTokenizer characters = new StringTokenizer(input, ",");
    String[] result = new String[characters.countTokens() + 1];
    int cnt = 0;
    while (characters.hasMoreTokens()) {
      result[cnt++] = characters.nextToken();
     }
    return result;
  }


}