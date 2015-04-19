/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.affect.emotion;

/**
 *
 * @author gebhard
 */
public class EmotionAppraisalVars {

  public Double desirability = null;
  public Double praiseworthiness = null;
  public Double appealingness = null;
  public Double likelihood = null;
  public Boolean realization = null;
  public Double liking = null;
  public Boolean agency = null;

  public EmotionAppraisalVars() {
  }

  public void setDesirability(double d) {
    desirability = d;
  }

  public void setPraiseworthiness(double p) {
    praiseworthiness = p;
  }

  public void setAppealingness(double a) {
    appealingness = a;
  }

  public void setLikelihood(double l) {
    likelihood = l;
  }

  public void setLiking(double l) {
    liking = l;
  }

  public void setRealization(boolean r) {
    realization = r;
  }

  public void setAgency(boolean a) {
    agency = a;
  }

  public boolean isSetDesirability() {
    return (desirability == null) ? false : true;
  }

  public boolean isSetPraiseworthiness() {
    return (praiseworthiness == null) ? false : true;
  }

  public boolean isSetAppealingness() {
    return (appealingness == null) ? false : true;
  }

  public boolean isSetLikelihood() {
    return (likelihood == null) ? false : true;
  }

  public boolean isSetLiking() {
    return (liking == null) ? false : true;
  }

  public boolean isSetRealization() {
    return (realization == null) ? false : true;
  }

  public boolean isSetAgency() {
    return (agency == null) ? false : true;
  }

  public double desirability() {
    return desirability;
  }

  public double praiseworthiness() {
    return praiseworthiness;
  }

  public double appealingness() {
    return appealingness;
  }

  public double likelihood() {
    return likelihood;
  }

  public double liking() {
    return liking;
  }

  public boolean realization() {
    return realization;
  }

  public boolean agency() {
    return agency;
  }
}
