/*
 * AffectDictionary.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.tools;

// i/o stuff
import de.affect.manage.AffectManager;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

// utils
import java.util.HashMap;
import java.util.Properties;

// logger
import static java.util.logging.Logger.global;

/**
 * A dictionary for emotion, mood and other stuff that is to be translated into different languages.
 */
public class AffectDictionary
{
  // the real dictionary
  private HashMap<String, HashMap<String, String>> m_dictionary = new HashMap<String, HashMap<String, String>> ();

  // current active language
  private String m_language;

  /**
   * Initialize dictionary.
   * Loads the dictionary out of jar file.
   * @param filename The name of the file.
   * @throws IOException If the dictionary cannot be loaded.
   */
  public AffectDictionary (String filename) throws IOException { initialize (getClass().getResourceAsStream(filename)); }

  /**
   * Initialize dictionary.
   * @param file The file containing the dictionary.
   * @throws IOException If the dictionary cannot be loaded.
   */
  public AffectDictionary (File file) throws IOException { initialize (new FileInputStream (file)); }

  /**
   * Get current active language.
   * @return Current active language.
   */
  public String language () { return m_language; }

  /**
   * Set current active language.
   * @param language The new active language.
   */
  public void setLanguage (String language)
  {
    m_language = language;
    if (m_dictionary.get(language) == null)
      AffectManager.sLog.warning("Unknown language: '" + language + "'.");
  }

  /**
   * Translate given word into a word of the current active language.
   * @param word The word to translate.
   * @return The translated word or the given one if it could not be translated.
   */
  public String translate (String word)
  {
    // get mapping
    HashMap<String, String> dictionary = m_dictionary.get (m_language);
    if (dictionary == null)
      return word;

    // get translation
    String result = dictionary.get (word);
    return (result == null)?word:result;
  }

  /**
   * Initialize dictionary using given input stream.
   * @param stream Stream to read dicitionary data from.
   * @throws IOException If reading from the stream failed.
   */
  private void initialize (InputStream stream) throws IOException
  {
    // load properties
    Properties properties = new Properties ();
    properties.load (stream);

    // create dictionary
    for (String language: properties.getProperty("languages", "").split(";"))
    {
      // create dicitionary for current language
      HashMap<String, String> dictionary = new HashMap<String, String> ();

      // insert word for current language
      String prefix = language+".";
      for (Object key: properties.keySet())
      {
        String word = (String)key;
        if (word.startsWith(prefix))
          dictionary.put (word.substring(word.indexOf('.')+1), properties.getProperty (word));
      }

      // insert language dictionary
      m_dictionary.put (language, dictionary);
    }
  }
}
