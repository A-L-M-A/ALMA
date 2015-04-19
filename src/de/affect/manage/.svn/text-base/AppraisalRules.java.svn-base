/*
 * AppraisalRules.java
 *
 * Copyright (c) 2004 by Patrick Gebhard
 * All rights reserved.
 *
 */

package de.affect.manage;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.ArrayList;
import de.affect.appraisal.AppraisalVariables;

/**
 * The class<code> AppraisalRules</code> holds all appraisal rules of one
 * entity. 
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AppraisalRules {
  
  private Hashtable<String, RuleSet> entityRelatedRules = null; 

  public AppraisalRules() {
    entityRelatedRules = new Hashtable<String, RuleSet>();
  }

  private class RuleSet {
    Hashtable<String, String> types = null;
    Hashtable<String, AppraisalVariables[]> rules = null;

    RuleSet() {
      types = new Hashtable<String, String>();
      rules = new Hashtable<String, AppraisalVariables[]>();
    }
  }

  public void add(String entity, String key, String type, AppraisalVariables[] appraisalVariables) {
    RuleSet ruleSet = entityRelatedRules.get(entity);
    if (ruleSet == null) { // add a new rule set for a new entity
      entityRelatedRules.put(entity, new RuleSet());
      ruleSet = entityRelatedRules.get(entity);
    } 
    ruleSet.types.put(key, type);
    ruleSet.rules.put(key, appraisalVariables);
  }

  public void removeEntityRelatedRules(String entity) {
    entityRelatedRules.remove(entity);
  }

  public void removeKey(String entity, String key) {
    RuleSet ruleSet = entityRelatedRules.get(entity);
    if (ruleSet != null) {
      ruleSet.types.remove(key);
      ruleSet.rules.remove(key);
    }
  }

  public AppraisalVariables[] getAppraisalVariables(String entity, String key) {
    RuleSet ruleSet = entityRelatedRules.get(entity);
    return (ruleSet == null) ? null : ruleSet.rules.get(key);
  }

  public AppraisalRules getAppraisalRulesByType(String entity, String type) {
    AppraisalRules ruleSubSet = new AppraisalRules();
    RuleSet ruleSet = entityRelatedRules.get(entity);
    if (ruleSet != null)
      for (Enumeration<String> e = ruleSet.rules.keys(); e.hasMoreElements() ;) {
        String key = e.nextElement();
        if (type.equals(ruleSet.types.get(key)))
          ruleSubSet.add(entity, key, type, ruleSet.rules.get(key));
      }
    return ruleSubSet;
  }

  public String[] getKeys(String entity) {
    String[] result = new String[0];
    ArrayList<String> keyList = new ArrayList<String>();
    RuleSet ruleSet = entityRelatedRules.get(entity);
    if (ruleSet != null) {
      for (Enumeration<String> e = ruleSet.rules.keys(); e.hasMoreElements() ;)
	keyList.add(e.nextElement());
      result = keyList.toArray(result);
    }
    return result;
  }

  public String toString(String entity) {
    StringBuffer sb = new StringBuffer();
    RuleSet ruleSet = entityRelatedRules.get(entity);
    if (ruleSet != null) {
      for (Enumeration<String> keyEnum = ruleSet.rules.keys(); keyEnum.hasMoreElements() ;) {
	String key = keyEnum.nextElement();
	sb.append(key).append("\n");
	for (AppraisalVariables av : ruleSet.rules.get(key)) {
	  sb.append(av).append("\n");
	}
      }
    }
    return sb.toString();
  }

}