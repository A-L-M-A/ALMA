/**
 *
 *
 */

package de.affect.emotion;

import java.util.ArrayList;

public enum EmotionType { 
  Undefined, Joy, Distress, HappyFor, Gloating, Resentment, Pity, Hope, Fear, 
  Satisfaction, Relief, FearsConfirmed, Disappointment, Pride, Admiration, 
  Shame, Reproach, Liking, Disliking, Gratitude, Anger, Gratification,
  Remorse, Love, Hate, Physical;

  public static EmotionType getTypeByName(String n) {
    EmotionType eType = EmotionType.Undefined;
    eType = (n.toLowerCase().equals("undefined")) ? EmotionType.Undefined : eType;
    eType = (n.toLowerCase().equals("joy")) ? EmotionType.Joy : eType;
    eType = (n.toLowerCase().equals("distress")) ? EmotionType.Distress : eType;
    eType = (n.toLowerCase().equals("happyfor")) ? EmotionType.HappyFor : eType;
    eType = (n.toLowerCase().equals("gloating")) ? EmotionType.Gloating : eType;
    eType = (n.toLowerCase().equals("resentment")) ? EmotionType.Resentment : eType;
    eType = (n.toLowerCase().equals("pity")) ? EmotionType.Pity : eType;
    eType = (n.toLowerCase().equals("hope")) ? EmotionType.Hope : eType;
    eType = (n.toLowerCase().equals("fear")) ? EmotionType.Fear : eType;
    eType = (n.toLowerCase().equals("satisfaction")) ? EmotionType.Satisfaction : eType;
    eType = (n.toLowerCase().equals("relief")) ? EmotionType.Relief : eType;
    eType = (n.toLowerCase().equals("fearsconfirmed")) ? EmotionType.FearsConfirmed : eType;
    eType = (n.toLowerCase().equals("disappointment")) ? EmotionType.Disappointment : eType;
    eType = (n.toLowerCase().equals("pride")) ? EmotionType.Pride : eType;
    eType = (n.toLowerCase().equals("admiration")) ? EmotionType.Admiration : eType;
    eType = (n.toLowerCase().equals("shame")) ? EmotionType.Shame : eType;
    eType = (n.toLowerCase().equals("reproach")) ? EmotionType.Reproach : eType;
    eType = (n.toLowerCase().equals("liking")) ? EmotionType.Liking : eType;
    eType = (n.toLowerCase().equals("disliking")) ? EmotionType.Disliking : eType;
    eType = (n.toLowerCase().equals("gratitude")) ? EmotionType.Gratitude : eType;
    eType = (n.toLowerCase().equals("anger")) ? EmotionType.Anger : eType;
    eType = (n.toLowerCase().equals("gratification")) ? EmotionType.Gratification : eType;
    eType = (n.toLowerCase().equals("remorse")) ? EmotionType.Remorse : eType;
    eType = (n.toLowerCase().equals("love")) ? EmotionType.Love : eType;
    eType = (n.toLowerCase().equals("hate")) ? EmotionType.Hate : eType;
    // physical is a special type of emotion - its p a d values are derived/mesured by bio sensors
    eType = (n.toLowerCase().equals("physical")) ? EmotionType.Physical : eType;
    return eType;
  }
  
  public static String[] getNames() {
    String[] result = new String[0];
    ArrayList<String> nameList = new ArrayList<String>();
    for (EmotionType type : EmotionType.values())
      nameList.add(type.toString());
    result = nameList.toArray(result);
    return result;
  }

  public static String getCategoryByName(String n) {
    String cat = "undefined";
    cat = (n.toLowerCase().equals("undefined")) ? "Undefined" : cat;
    cat = (n.toLowerCase().equals("joy")) ? "well-being" : cat;
    cat = (n.toLowerCase().equals("distress")) ? "well-being" : cat;
    cat = (n.toLowerCase().equals("happyfor")) ? "fortunes-of-others" : cat;
    cat = (n.toLowerCase().equals("gloating")) ? "fortunes-of-others" : cat;
    cat = (n.toLowerCase().equals("resentment")) ? "fortunes-of-others" : cat;
    cat = (n.toLowerCase().equals("pity")) ? "fortunes-of-others" : cat;
    cat = (n.toLowerCase().equals("hope")) ? "prospect-based" : cat;
    cat = (n.toLowerCase().equals("fear")) ? "prospect-based" : cat;
    cat = (n.toLowerCase().equals("satisfaction")) ? "prospect-based" : cat;
    cat = (n.toLowerCase().equals("relief")) ? "prospect-based" : cat;
    cat = (n.toLowerCase().equals("fearsconfirmed")) ? "prospect-based" : cat;
    cat = (n.toLowerCase().equals("disappointment")) ? "prospect-based" : cat;
    cat = (n.toLowerCase().equals("pride")) ? "attribution" : cat;
    cat = (n.toLowerCase().equals("admiration")) ? "attribution" : cat;
    cat = (n.toLowerCase().equals("shame")) ? "attribution" : cat;
    cat = (n.toLowerCase().equals("reproach")) ? "attribution" : cat;
    cat = (n.toLowerCase().equals("liking")) ? "attraction" : cat;
    cat = (n.toLowerCase().equals("disliking")) ? "attraction" : cat;
    cat = (n.toLowerCase().equals("gratitude")) ? "well-being/attribution" : cat;
    cat = (n.toLowerCase().equals("anger")) ? "well-being/attribution" : cat;
    cat = (n.toLowerCase().equals("gratification")) ? "well-being/attribution" : cat;
    cat = (n.toLowerCase().equals("remorse")) ? "well-being/attribution" : cat;
    cat = (n.toLowerCase().equals("love")) ? "attraction/attribution" : cat;
    cat = (n.toLowerCase().equals("hate")) ? "attraction/attribution" : cat;
    cat = (n.toLowerCase().equals("physical")) ? "physical" : cat;
    return cat;
  }

}
