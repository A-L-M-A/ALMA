/*
 * AffectEvaluation.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.tools;

import java.io.File;
import java.io.FileWriter;
import java.util.TreeMap;


public class AffectEvaluation
{
  private long startTime = 0;
  private long endTime = 0;
  private TreeMap<String, Page> evalDoc = new TreeMap<String, Page>();
  private String evalDir;

  public AffectEvaluation(String evalDir) {
    this.evalDir = evalDir;
  }

  public void add(String producer, String type, String value, String pageNum) {
    if (!evalDoc.containsKey(pageNum)) {
      evalDoc.put(pageNum, new Page(producer, type, value));
    } else {
      Page page = evalDoc.get(pageNum);
      page.put(producer, type, value);
      evalDoc.put(pageNum, page);
    }
  }

  public String toString() {
    StringBuilder out = new StringBuilder();
    if (evalDoc.size() > 0)
      for (String pageNum : evalDoc.keySet())
	out.append((pageNum.equals("0")?"General:\n":pageNum+":\n")).append((evalDoc.get(pageNum)).toString()).append("\n");
    return out.toString();
  }

  public void save() {
    try {
      File f = new File(evalDir+"Evaluation-" + System.currentTimeMillis() + ".txt");
      FileWriter fw = new FileWriter(f);
      fw.write(this.toString());
      fw.flush();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public void clear() {
    evalDoc.clear();
  }

  class Page
  {
    TreeMap<String, Entry> entry = new TreeMap<String, Entry>();
    
    Page(String producer, String type, String value) {
      put (producer, type, value);

    }

    void put (String producer, String type, String value) {
      if (producer.equals("Evaluation")) {
	entry.put(type, new GeneralData(value));
      } else if (producer.equals("User")) {
	entry.put(type, new GeneralData(value));
      } else {
	entry.put(producer, new UserAnswer(type, value));
      }    
    }

    public String toString() {
      StringBuilder out = new StringBuilder();
      if (entry.size() > 0)
	for (String id : entry.keySet())
	  out.append(id).append("=").append((entry.get(id)).get()).append("\n");
    return out.toString();
  }

  }

  abstract class Entry
  {
    abstract String get();
  }

  class GeneralData extends Entry
  {
    String fValue = "";

    GeneralData (String value) {
      fValue = value;
    }

    String get() {
      return fValue;
    }
  }

  class UserAnswer extends Entry
  {
    String fTopic = "";
    String fValue = "";

    UserAnswer (String topic, String value) {
      fTopic = topic;
      fValue = value;
    }

    String get() {
      return fTopic + "=" + fValue;
    }
  }

}
