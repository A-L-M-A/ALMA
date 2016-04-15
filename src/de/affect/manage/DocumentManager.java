/*
 * AffectManager.java
 *
 * Copyright (c) 2004-2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.manage;

import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.HashMap;

import org.apache.xmlbeans.XmlOptions;

import de.affect.util.FileHelper;
import de.affect.xml.AffectComputationDocument;
import de.affect.xml.AffectComputationDocument.AffectComputation;
import de.affect.xml.AffectDefinitionDocument;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect;

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
}