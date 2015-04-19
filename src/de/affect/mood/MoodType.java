/**
 *
 *
 */

package de.affect.mood;

import java.util.ArrayList;

public enum MoodType { 
  Neutral, Exuberant, Dependent, Relaxed, Docile, Hostile, Anxious, Disdainful, Bored;

  public static String[] getNames() {
    String[] result = new String[0];
    ArrayList<String> nameList = new ArrayList<String>();
    for (MoodType type : MoodType.values())
      nameList.add(type.toString());
    result = nameList.toArray(result);
    return result;
  }

}
