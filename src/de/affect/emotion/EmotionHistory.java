/*
 * EmotionHistory.java
 *
 * Copyright (c) 2004-2008 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.emotion;

import java.util.Vector;
import java.util.Iterator;
import java.util.logging.Logger;
import de.affect.manage.AffectManager;


/**
 * The <code>EmotionHistory</code> class stores a sequence
 * of <code>EmotionVector</code>s, each representing
 * the emotions of an agent at some point in time.
 *
 * @author Patrick Gebhard (based on the work of Martin Klesen)
 *
 * @version 1.0
 */
public class EmotionHistory {

  private Vector<EmotionVector> history;
  private Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  /** 
   * Constructs an empty history. 
   */
  public EmotionHistory() {
    history = new Vector<EmotionVector>();
  }

  /** 
   * Removes all elements from the emotion history.
   */
  public synchronized void clear() { history.clear(); }

  /** 
   * Appends the specified element to the end of the history.
   * If the history is full (size() == length()) then the first element
   * (index = 0) is removed thereby shifting any subsequent elements to
   * the left (subtracting one from their indices) before adding the new
   * element to the end of the history.
   *
   * @param emotions the emotions to be appended to this history
   */
  public synchronized void add(EmotionVector emotions) {
    history.add(emotions);
  }

  /**
   * Returns the number of elements in this history.
   * The size specifies the current number of elements in
   * the emotion history.
   *
   */
  public synchronized int size() { return history.size(); }

  /**
   * Returns the element at the specified position in this history.
   *
   * @param index index of element to return
   * @return the element at the specified position in this history
   * @throws IndexOutOfBoundsException if index is out of range
   *                                   (index < 0 || index >= size())
   */
  public synchronized EmotionVector get(int index) {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("Index out of range: " + index);
    return (EmotionVector)history.get(index);
  }

  /** 
   * Removes the element at the specified position in this history.
   * Shifts any subsequent elements to the left (subtracts one from
   * their indices). 
   *
   * @param index index of element to remove
   * @throws IndexOutOfBoundsException if index is out of range
   *                                   (index < 0 || index >= size())
   */
  public synchronized void remove (int index) {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("Index out of range: " + index);
    history.remove(index);
  }

  /** 
   * Removes the first EmotionVector element of the history, if the element 
   * contains no active emotion.
   */
  public synchronized boolean removeFirstIfInactive () {
    if (size() > 0) {
      EmotionVector firstEmotionVector = (EmotionVector)history.get(0);
      boolean remove = true;
      for (Iterator it = firstEmotionVector.getEmotions().iterator(); it.hasNext();) {
	Emotion emotion = (Emotion)it.next();
	if (emotion.getIntensity() > emotion.getBaseline()) {
	  remove = false;
	}
      }
      if (remove) {
	history.remove(0);
	return true;
      } else {
	return false;
      }
    } else {
      return false;
    }
  }

  /** 
   * Returns the emotion that has the queried elicitor or null. The first
   * occurence of an emotion whoses elicitor matches the queried elicitor
   * will be returend.
   *
   * @param queryEmotionType type of emotion
   *        queryElicitor the elicitor of an emotion
   *
   * @return emotion or null
   */
  public synchronized Emotion getEmotionByElicitor(EmotionType queryEmotionType, 
						   Object queryElicitor) {
    Emotion emotion = null;
    if (size() == 0) return emotion;
    for (int i = size() - 1; i >= 0; i--) {
      EmotionVector emotions = get(i);
      for (Iterator<Emotion> it = emotions.getEmotions().iterator(); it.hasNext();) {
	Emotion histEmotion = it.next();
	//debug log.info("History emotion " + histEmotion.getType() + " has " + histEmotion.getElicitor().toString() + " elicitor context queried has " + queryElicitor.toString());
	if ((histEmotion.getType().equals(queryEmotionType)) && 
	    (queryElicitor.toString().equals(histEmotion.getElicitor().toString())))
	  emotion = (emotion == null) ? histEmotion : emotion;
      }
    }
    return emotion;
  }


  /** 
   * Removes the emotion that has the queried elicitor or null.
   *
   * @param queryEmotion emotion
   *        queryElicitor the elicitor of an emotion
   */
  public synchronized void removeEmotionByElicitor(Emotion queryEmotion, 
						   Object queryElicitor) {
    if (size() == 0) return;
    for (int i = size() - 1; i >= 0; i--) {
      EmotionVector emotions = get(i);
      for (Iterator<Emotion> it = emotions.getEmotions().iterator(); it.hasNext();) {
	Emotion histEmotion = it.next();
	if ((histEmotion.equals(queryEmotion)) && 
	    (queryElicitor.toString().equals(histEmotion.getElicitor().toString()))) {
	  log.fine("History emotion " + histEmotion + " has " + histEmotion.getElicitor().toString() + " will be removed");
	  emotions.remove(queryEmotion.getType());
	}
      }
    }
  }


  /** 
   * Returns the last element of the history or null if the history is empty.
   *
   * @return the last element or null
   */
  public synchronized EmotionVector lastElement() {
    int lastIndex = size() - 1;
    return (lastIndex < 0) ? null : (EmotionVector)history.get(lastIndex);
  }

  /** 
   * Returns the emotional state of an agent by collecting the emotions
   * with the highest intensity for each type in the history and by adding
   * them to the specified collection.
   *
   * @param emotions the collection used to store the emotional state
   * @return the new emotional state or the unmodified collection
   *         if the history is empty (size() == 0).
   */
  public synchronized EmotionVector getEmotionalState(EmotionVector emotions) {
    if (size() == 0) return emotions;
    for (Iterator it = emotions.getEmotionTypes().iterator(); it.hasNext();) {
      EmotionType type = (EmotionType)it.next();
      double max = 0.0d;
      // traverse history in reverse order, latest element first
      for (int i = size() - 1; i >= 0; i--) {
	Emotion e = get(i).get(type);
	if (e != null && e.getIntensity() > max) {
	  max = e.getIntensity();
	  emotions.add(e);
	}
      }
    }
    return emotions;
  }

  /**
   * Returns a concise representation of the emotion history.
   *
   * @return a string representation of the emotion history.
   */
  public synchronized String toString() {
    String newLine = System.getProperty("line.separator");
    StringBuffer sb = new StringBuffer();
    sb.append("[EmotionHistory: size=" + size() + ",");
    sb.append(newLine);
    for (int i=0; i<size(); i++) {
      EmotionVector emotions = get(i);
      sb.append("\t");
      sb.append(i + ". ");
      sb.append(emotions.getClass().getName() + '@' +
		Integer.toHexString(emotions.hashCode()));
      //sb.append(emotions);
      sb.append(newLine);
    }
    sb.append("]");
    return sb.toString();
  }

}
