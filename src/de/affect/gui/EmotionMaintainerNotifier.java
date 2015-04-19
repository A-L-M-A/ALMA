package de.affect.gui;

import de.affect.emotion.EmotionType;
import de.affect.manage.event.EmotionMaintenanceListener;
import de.affect.manage.event.EmotionMaintenanceEvent;

public interface EmotionMaintainerNotifier {

  /**
   * Adds the specified listener to the list of emotion change listeners.
   *
   * @param li the listener that should be added
   */
  public void addEmotionMaintenanceListener(EmotionMaintenanceListener li);

  /**
   * Removes the specified listener from the list of emotion change listeners.
   *
   * @param li the listener that should be removed
   */
  public void removeEmotionMaintenanceListener(EmotionMaintenanceListener li);

  /**
   * Notifies all registered listeners that the specified emotion has changed.
   *
   * @param character name of the character emotionType the type of the changed
   * emotion emotionIntensity the intensity of the changed emotion
   */
  public void notifyEmotionMaintenanceListener(String character, EmotionType emotionType, double emotionIntensity);
}