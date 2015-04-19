/*
 * AppraisalVariables.java
 *
 * Copyright (c) 2004, 2005, 2006, 2007, 2008, Patrick Gebhard, DFKI GmbH
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in 
 *     the documentation and/or other materials provided with the 
 *     distribution.
 *
 *   - Neither the name of the DFKI GmbH nor the names of its contributors
 *     may be used to endorse or promote products derived from this software
 *     without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE. 
 */
package de.affect.appraisal;

import de.affect.appraisal.eec.Desirability;
import de.affect.appraisal.eec.Praiseworthiness;
import de.affect.appraisal.eec.Appealingness;
import de.affect.appraisal.eec.Likelihood;
import de.affect.appraisal.eec.Liking;
import de.affect.appraisal.eec.Realization;
import de.affect.appraisal.eec.Agency;

/**
 * The class<code> AppraisalVariables</code> holds all posssible variables 
 * and their values, which are the result of an subjective appraisal. Based
 * on these values emotions will be generated.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class AppraisalVariables {

  private String type;
  private String signal;
  private Desirability desirability;
  private Praiseworthiness praiseworthiness;
  private Appealingness appealingness;
  private Likelihood likelihood;
  private Realization realization;
  private Agency agency;
  private Liking liking;
  private String elicitor;

  public AppraisalVariables(String type,
                            String signal,
			    Desirability desirability,
			    Praiseworthiness praiseworthiness,
			    Appealingness appealingness,
			    Likelihood likelihood,
			    Realization realization,
			    Agency agency,
			    Liking liking,
			    String elicitor) {
    this.type = type;
    this.signal = signal;
    this.desirability = desirability;
    this.praiseworthiness = praiseworthiness;
    this.appealingness = appealingness;
    this.likelihood = likelihood;
    this.realization = realization;
    this.agency = agency;
    this.liking = liking;
    this.elicitor = elicitor;
  }

  public String getType() {
    return type;
  }

  public String getSignal() {
    return signal;
  }

  public Desirability getDesirability() {
    return desirability;
  }

  public Praiseworthiness getPraiseworthiness() {
    return praiseworthiness;
  }
  
  public Appealingness getAppealingness() {
    return appealingness;
  }

  public Likelihood getLikelihood() {
    return likelihood;
  }

  public Realization getRealization() {
    return realization;
  }

  public Agency getAgency() {
    return agency;
  }
  
  public Liking getLiking() {
    return liking;
  }

  public String getElicitor() {
    return elicitor;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("AppraisalVariable: Type=").append(type).append("\n\tDesirability: ");
    sb = (desirability != null) ?
      sb.append(desirability).append(" Praiseworthiness: ") :
      sb.append("- Praiseworthiness: ");
    sb = (praiseworthiness != null) ?
      sb.append(praiseworthiness).append(" Appealingness: ") :
      sb.append("- Appealingness: ");
    sb = (appealingness != null) ?
      sb.append(appealingness).append("\n\tLikelihood: ") :
      sb.append("-\n\tLikelihood: ");
    sb = (likelihood != null) ?
      sb.append(likelihood).append(" Realization: ") :
      sb.append("- Realization: ");
    sb = (realization != null) ?
      sb.append(realization).append(" Liking: ") :
      sb.append("- Liking: ");
    sb = (liking != null) ?
      sb.append(liking).append(" Agency: ") :
      sb.append("- Agency: ");
    sb = (agency != null) ?
      sb.append(agency) :
      sb.append("-");
    return sb.toString();
  }

}