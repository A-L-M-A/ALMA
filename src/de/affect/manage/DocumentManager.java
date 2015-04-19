/*
 * AffectManager.java
 *
 * Copyright (c) 2004-2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.manage;

import java.awt.Dimension;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
import java.awt.Point;

import org.apache.xmlbeans.XmlOptions;

import de.affect.gui.AlmaGUI;
import de.affect.gui.AlmaInternalFrame;
import de.affect.util.FileHelper;
import de.affect.xml.AffectComputationDocument;
import de.affect.xml.AffectComputationDocument.AffectComputation;
import de.affect.xml.AffectDefinitionDocument;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect;

import static de.affect.util.FileHelper.sALMAGUIConfiguration;
import static de.affect.util.FileHelper.createFileHelper;

public class DocumentManager {

  AffectComputation fAffectComputation = null;
  AffectDefinition fAffectDefinition = null;
  FileHelper fFileHelper = null;

  public DocumentManager() {
    fFileHelper = createFileHelper();
  }

  public AffectComputation loadAffectComputation(InputStream is) {
    try {
      fAffectComputation = AffectComputationDocument.Factory.parse(is).getAffectComputation();
    } catch(Exception e) { 
      e.printStackTrace();
    }
    return fAffectComputation;
  }


  public AffectComputation loadAffectComputation(File file) {
    try {
      fAffectComputation = AffectComputationDocument.Factory.parse(file).getAffectComputation();
    } catch(Exception e) { 
      e.printStackTrace();
    }
    return fAffectComputation;
  }


  public AffectDefinition loadAffectDefinition(InputStream is) {
    try {
      fAffectDefinition = AffectDefinitionDocument.Factory.parse(is).getAffectDefinition();
    } catch(Exception e) { 
      e.printStackTrace();
    }
    return fAffectDefinition;
  }


  public AffectDefinition loadAffectDefinition(File file) {
    try {
      fAffectDefinition = AffectDefinitionDocument.Factory.parse(file).getAffectDefinition();
    } catch(Exception e) { 
      e.printStackTrace();
    }
    return fAffectDefinition;
  }

  public AffectComputation getAffectComputationParams() {
    return fAffectComputation;
  }
  
  public CharacterAffect defaultCharacterAffectStructure() {
    return loadAffectDefinition(fFileHelper.defaultCharacterDefinition()).getCharacterAffectList().get(0);
  }
  
  public AffectDefinition getAffectDefinition() {
    return fAffectDefinition;
  }
 
  /*
   * <code>emptyAffectDefinition</code> creates an empty AffectDefinition
   * document
   *
   * @return AffectDefiniton element
   */
  public AffectDefinition emptyAffectDefinition() {
    fAffectDefinition = AffectDefinition.Factory.newInstance();
    return fAffectDefinition;
  }
  
  /*
   * <code>setAffectDefinition</code> set the system wide global
   * AffectDefinition document
   * 
   * @param ad an AffectDefinition object
   */

  public void setAffectDefinition(AffectDefinition ad) {
    fAffectDefinition = ad;
  }

  public void saveAffectComputationParams(File file) {
    AffectComputationDocument aCompDoc = AffectComputationDocument.Factory.newInstance();
    aCompDoc.setAffectComputation(fAffectComputation);
    XmlOptions options = new XmlOptions();
    options.setSaveNamespacesFirst();
    options.setSavePrettyPrint();
    Map<String, String> namespaceMap= new HashMap<String, String>();
    namespaceMap.put("xml.affect.de", "aml");
    options.setSaveSuggestedPrefixes(namespaceMap);
    try {
      aCompDoc.save(file, options);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public void saveAffectDefinition(File file) {
    AffectDefinitionDocument aDefDoc = AffectDefinitionDocument.Factory.newInstance();
    aDefDoc.setAffectDefinition(fAffectDefinition);
    XmlOptions options = new XmlOptions();
    options.setSaveNamespacesFirst();
    options.setSavePrettyPrint();
    Map<String, String> namespaceMap= new HashMap<String, String>();
    namespaceMap.put("xml.affect.de", "aml");
    options.setSaveSuggestedPrefixes(namespaceMap);
    try {
      aDefDoc.save(file, options);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void saveInternalFramePosition(AlmaInternalFrame comp, String screenSize) {
    String id = comp.getId();
    Point compPosition = new Point(comp.getX(), comp.getY());
    Point compSize = new Point(comp.getWidth(), comp.getHeight());
    Properties guiProperties = new Properties();
    if (sALMAGUIConfiguration.exists()) {
      try {
	guiProperties.load(new FileInputStream(sALMAGUIConfiguration));
      } catch (Exception e) {
	e.printStackTrace();
	return;
      }
    }
//    System.out.println("Save internal frame " + id + "@" + screenSize +
//  		       " position " + compPosition.x + "," + compPosition.y + "," + 
//                       compSize.x + "," + compSize.y);
    guiProperties.setProperty(id+"-pos@"+screenSize, 
			      compPosition.x + "," + compPosition.y);
    guiProperties.setProperty(id+"-size@"+screenSize, 
			      compSize.x + "," + compSize.y);
    try {
      guiProperties.store(new FileOutputStream(sALMAGUIConfiguration),
			  "Automatically generated file! Do not edit!");
    } catch (Exception e) {
      e.printStackTrace();
      return;
    }
  }

  public static void saveAlmaGUIPosition(AlmaGUI comp, Dimension screenSize) {
    String id = comp.getId();
    Point compPosition = new Point(comp.getX(), comp.getY());
    Point compSize = new Point(comp.getWidth(), comp.getHeight());
    String screenSizeString = screenSize.width + "x" + screenSize.height;
    int state = comp.getExtendedState();
    Properties guiProperties = new Properties();
    if (sALMAGUIConfiguration.exists()) {
      try {
	guiProperties.load(new FileInputStream(sALMAGUIConfiguration));
      } catch (Exception e) {
	e.printStackTrace();
	return;
      }
    }
//    System.out.println("Save internal frame " + id + "@" + screenSizeString +
//  		       " position " + compPosition.x + "," + compPosition.y + "," + 
//  			      compSize.x + "," + compSize.y);
    guiProperties.setProperty(id+"-pos@"+screenSizeString, 
			      compPosition.x + "," + compPosition.y + ":" + state);
    guiProperties.setProperty(id+"-size@"+screenSizeString, 
			      compSize.x + "," + compSize.y + ":" + state);
    try {
      guiProperties.store(new FileOutputStream(sALMAGUIConfiguration),
			  "Automatically generated file! Do not edit this file!");
    } catch (Exception e) {
      e.printStackTrace();
      return;
    }
  }
  
  public static Point getAlmaGUIPosition(String id, Dimension screenSize) {
    Properties guiProperties = new Properties();
    // normalized Position is at 50, 50
    Point almaGUIPosition = new Point(50, 50);
    if (!sALMAGUIConfiguration.exists()) {
      return almaGUIPosition;
    }
    try {
      guiProperties.load(new FileInputStream(sALMAGUIConfiguration));
    } catch (Exception e) {
      e.printStackTrace();
      return almaGUIPosition;
    }
    String screenSizeString = screenSize.width + "x" + screenSize.height;
    String pointStr = (String)guiProperties.getProperty(id+"-pos@"+screenSizeString);
    // System.out.println("Query alma gui position by " + id+"-pos@"+screenSizeString + " is " + pointStr);
    return (pointStr != null) ? 
      new Point((new Integer(pointStr.substring(0, pointStr.indexOf(",")))).intValue(),
		(new Integer(pointStr.substring((pointStr.indexOf(",") + 1), 
                                                 pointStr.indexOf(":")))).intValue()) : 
      almaGUIPosition;
  }

  public static Dimension getAlmaGUISize(String id, Dimension screenSize) {
    Properties guiProperties = new Properties();
    // normalized gui size is about 50 pixel smaller than screen size
    Dimension almaGUISize = new Dimension(screenSize.width - 100, screenSize.height - 100);
    if (!sALMAGUIConfiguration.exists()) {
      return almaGUISize;
    }
    try {
      guiProperties.load(new FileInputStream(sALMAGUIConfiguration));
    } catch (Exception e) {
      e.printStackTrace();
      return almaGUISize;
    }
    String screenSizeString = screenSize.width + "x" + screenSize.height;
    String pointStr = (String)guiProperties.getProperty(id+"-size@"+screenSizeString);
    // System.out.println("Query alma gui size " + id+"-size@"+screenSizeString + " is " + pointStr);
    return (pointStr != null) ? 
      new Dimension((new Integer(pointStr.substring(0, pointStr.indexOf(",")))).intValue(),
		    (new Integer(pointStr.substring((pointStr.indexOf(",") + 1), 
                                                     pointStr.indexOf(":")))).intValue()) : 
      almaGUISize;
  }  
  
  public static int getAlmaGUIState(String id, Dimension screenSize) {
    Properties guiProperties = new Properties();
    if (!sALMAGUIConfiguration.exists()) {
      return 0;
    }
    try {
      guiProperties.load(new FileInputStream(sALMAGUIConfiguration));
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
    String screenSizeString = screenSize.width + "x" + screenSize.height;
    String stateStr = (String)guiProperties.getProperty(id+"-pos@"+screenSizeString);
    // System.out.println("Query alma gui state " + id+"-pos@"+screenSizeString + " is " + stateStr);
    return (stateStr != null) ? 
      (new Integer(stateStr.substring((stateStr.indexOf(":") + 1)))).intValue() : 0;
  }

  public static Point getInternalFramePosition(String id, String screenSize) {
    Properties guiProperties = new Properties();
    if (!sALMAGUIConfiguration.exists()) {
      return new Point(0,0);
    }
    try {
      guiProperties.load(new FileInputStream(sALMAGUIConfiguration));
    } catch (Exception e) {
      e.printStackTrace();
      return new Point(0,0);
    }
    String pointStr = (String)guiProperties.getProperty(id+"-pos@"+screenSize);
    return (pointStr != null) ? 
      new Point((new Integer(pointStr.substring(0, pointStr.indexOf(",")))).intValue(),
		(new Integer(pointStr.substring(pointStr.indexOf(",") + 1))).intValue()) : new Point(0,0);
  }

  // old
  public static Point getInternalFrameSize(String id, String screenSize) {
    Properties guiProperties = new Properties();
    if (!sALMAGUIConfiguration.exists()) {
      return new Point(300,200);
    }
    try {
      guiProperties.load(new FileInputStream(sALMAGUIConfiguration));
    } catch (Exception e) {
      e.printStackTrace();
      return new Point(300,200);
    }
    String pointStr = (String)guiProperties.getProperty(id+"-size@"+screenSize);
    return (pointStr != null) ? 
      new Point((new Integer(pointStr.substring(0, pointStr.indexOf(",")))).intValue(),
		(new Integer(pointStr.substring(pointStr.indexOf(",") + 1))).intValue()) : new Point(0,0);
  }

  public static Dimension getInternalFrameSize(String id, String screenSize, Dimension initialDim) {
    Properties guiProperties = new Properties();
    if (!sALMAGUIConfiguration.exists()) {
      return initialDim;
    }
    try {
      guiProperties.load(new FileInputStream(sALMAGUIConfiguration));
    } catch (Exception e) {
      e.printStackTrace();
      return initialDim;
    }
    String dimStr = (String)guiProperties.getProperty(id+"-size@"+screenSize);
    return (dimStr != null) ? 
      new Dimension((new Integer(dimStr.substring(0, dimStr.indexOf(",")))).intValue(),
		    (new Integer(dimStr.substring(dimStr.indexOf(",") + 1))).intValue()) : initialDim;
  }

}