/*
 * EmotionVector.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.emotion;

import de.affect.manage.AffectManager;
import de.affect.mood.Mood;
import de.affect.personality.Personality;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import static de.affect.personality.PersonalityMoodRelations.getMoodyPersonalityTraits;

/** 
 * This class holds a collection of emotions for a predefined
 * set of emotion types. It contains exactly <b>one</b>
 * <code>Emotion</code> instance for each emotion type.
 *
 * @author Patrick Gebhard (based on the work of Micheal Kipp and Martin Klesen)
 *
 * @version 1.0
 */
public class EmotionVector implements Comparator<Emotion> {

  /** maps emotion types to emotions */
  protected HashMap<EmotionType, Emotion> emotions = new HashMap<EmotionType, Emotion>();
  public static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
  
  /**
   * Creates a new <code>EmotionVector</code> for the specified
   * emotion types <br>
   * The initial intensity of the emotions in this collection is
   * the same as the baseline. The baseline is computed based on
   * the emotion type and the character's personality. 
   *
   * @param personality a personality object
   * @param emotionTypes the predefined set of emotion types
   * @throws NullPointerException if one of the arguments is null or
   *                              if the list of emotion types is empty
   */
  public EmotionVector(Personality personality, Mood mood, List emotionTypes) {
    if ((emotionTypes == null) || (emotionTypes.isEmpty()))
      throw new NullPointerException("Invalid null (or empty) list of emotion types");
    if (mood == null)
      throw new NullPointerException("Invalid null mood!");
    if (personality == null)
      throw new NullPointerException("Invalid null personality!");
    // TODO INTRODUCE NEW EMOTION TYPES
    for (Iterator it = emotionTypes.iterator(); it.hasNext();) {
      EmotionType type = (EmotionType)it.next();
      if (type.equals(EmotionType.Physical)) {
        // do a separate initialisation of physical emotions
        Mood padValues = new Mood(0.0, 0.0, 0.0);
        PADEmotion pademotion = new PADEmotion(padValues, 0.0d, personality.toString());
        emotions.put(type, pademotion);
      } else {
        double baseline = personality.getEmotionBaseline(type);
        double moodyBaseline = personality.getEmotionBaseline(getMoodyPersonalityTraits(mood), type);
        baseline = (baseline + moodyBaseline) / 2.0d;
        //log.info(type.toString() + " baseline= " + baseline + " mood influence= " + moodyBaseline);
        // intensity = baseline, elicitor = personality
        Emotion emotion = new Emotion(type, baseline, baseline, personality);
        emotions.put(type, emotion);
      }
    }
  }

  /**
   * Compares the intensity of two emotions. Returns a negative integer,
   * zero, or a positive integer as the intensity of the first emotion is
   * less than, equal to, or greater than the intensity of the second emotion.
   *
   * @param o1 the first emotion to be compared
   * @param o2 the second emotion to be compared
   * @return a negative integer, zero, or a positive integer as the intensity
   *         of the first emotion is less than, equal to, or greater than the 
   *         intensity of the second emotion
   */
  public int compare(Emotion o1, Emotion o2) {
    Emotion e1 = (Emotion)o1;
    Emotion e2 = (Emotion)o2;
    // Just comparing the intensities is not enough! The emotional baseline of
    // some other emotion could be higher than an emotions intensity, which
    // baseline is 0.0.
    // Therefor the relative difference (intensity - baseline) will be used
    // for sorting emotions. The motivation is, that differences to the "normal"
    // emotional state are more "disturbing" than predefined emotional bias 
    // values
    // Old sorting:
    // if (e1.getIntensity() < e2.getIntensity()) return -1;
    // if (e1.getIntensity() > e2.getIntensity()) return 1;
    if ((e1.getIntensity() - e1.getBaseline()) < 
	(e2.getIntensity() - e2.getBaseline())) return -1;
    if ((e1.getIntensity() - e1.getBaseline()) > 
	(e2.getIntensity() - e2.getBaseline())) return 1;

    return 0;
  }

  /**
   * Returns the emotions sorted by their intensity in ascending order.
   *
   * @return the emotions sorted by their intensity
   * @see #compare(Object, Object)
   */
  public synchronized List<Emotion> getEmotions() {
    List<Emotion> result = new ArrayList<Emotion>(emotions.values());
    Collections.sort(result, this);
    return result;
  }

  /**
   * Returns the emotion with the highest intensity.
   * This is a convenience method. It returns the last element
   * in the list of emotions sorted by their intensity.
   *
   * @return the emotion with the highest relative intensity.
   * @see #getEmotions()
   */
  public synchronized Emotion getDominantEmotion() {
    List sortedEmotions = getEmotions();
    int size = sortedEmotions.size();
    Emotion result = (Emotion)sortedEmotions.get(size-1);
//     System.out.println("Dominant Emotion " + result.getType() + result.getIntensity() + 
// 		       "/" + result.getBaseline());
    result = (result.getIntensity() != result.getBaseline()) ?
      result : get(EmotionType.Undefined);

    return result;
  }

  /**
   * Returns the predefined set of emotion types as an unmodifiable list.
   *
   * @return the predefined set of emotion types.
   */
  public synchronized List getEmotionTypes() {
    return Collections.unmodifiableList(new LinkedList<EmotionType>(emotions.keySet()));
  }

  /** 
   * Returns an emotion of that type or null if there is no emotion
   * with that type.
   *
   * @param type the emotion type
   * @return an emotion of that type or null
   */
  public synchronized Emotion get(EmotionType type) {
    return (Emotion)emotions.get(type);
  }

  /**
   * Adds the specified emotion to the collection of emotions
   * if its type is one of the predefined emotion types. 
   * The new emotion replaces the emotion with the same type.
   * The method returns true if the emotion is added to the
   * collection and false otherwise. 
   *
   * @param emotion the new emotion
   * @return true if the emotion is added to the collection
   *         and false otherwise.
   * @see #getEmotionTypes()
   */
  public synchronized boolean add(Emotion emotion) {
    EmotionType type = emotion.getType();
    if (emotions.containsKey(type)) {
      emotions.put(type, emotion);
      return true;    
    } else return false;
  }

  /**
   * Removes the specified emotiontype 
   * @param type the emotion type to be removed
   */
  public synchronized void remove(EmotionType type) {
    if (hasType(type))
      emotions.remove(type);
  }

  /**
   * Queries if the emotion vector can store an emotion of the queried
   * emotion type.
   *
   * @param type type of emotion
   *
   * @return true if the emotion vector has the defined emotion type
   */

  public boolean hasType(EmotionType type) {
    return ((Emotion)emotions.get(type) != null) ? true : false;
  }

 /**
   * Merges a EmotionVector object with the current EmotionVector object.
   * In the case both vectors store the equal emotion(s), the old emotion(s)
   * will be replaced by the new emotion(s). Otherwise, the new emotion(s)
   * will be added to the collection.
   *
   * @param newEmotions an emotion vector
   */
  public synchronized void merge(EmotionVector newEmotions) {
    for (Iterator it = newEmotions.getEmotions().iterator(); it.hasNext();) {
      Emotion newEmotion = (Emotion)it.next();
      EmotionType newEmotionType = newEmotion.getType();
      if (emotions.containsKey(newEmotionType)) {
	emotions.put(newEmotionType, newEmotion);
      }
    }
  }

  /**
   * Returns a concise representation of this collection
   * consisting of a formatted list of the sorted emotions.
   *
   * @return a string representation of the collection.
   * @see List getEmotions()
   */
  public synchronized String toString() {
    String newLine = System.getProperty("line.separator");
    String indent = "\t";
    StringBuffer sb = new StringBuffer(newLine);
    for (Iterator it = getEmotions().iterator(); it.hasNext();) {
      Emotion emotion = (Emotion)it.next();
      sb.append(indent);
      sb.append(emotion.toString());
      sb.append(newLine);
    }
    return sb.toString();
  }

}
