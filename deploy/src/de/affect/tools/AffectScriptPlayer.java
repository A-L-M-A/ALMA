/*
 * AffectScriptPlayer.java
 *
 * Copyright (c) 2005, 2006, 2007, 2008, Patrick Gebhard, DFKI GmbH
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
package de.affect.tools;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;
import org.apache.xmlbeans.XmlException;

import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;

import de.affect.xml.AffectScriptDocument;
import de.affect.xml.AffectScriptDocument.AffectScript;

public class AffectScriptPlayer {

  private AffectManager fAffectManager = null;
  private File fScriptFile = null;
  private AffectScriptDocument fAffectScriptDoc = null;
  private LinkedList<AffectScript.Item> fAffectScript = null;
  private Timer fScriptPlayer = null;
  private Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  public AffectScriptPlayer(String compSpecs, String charSpecs, String scriptFile) {
    try {
      fAffectManager = new AffectManager(compSpecs, charSpecs, false);
      fAffectScriptDoc = AffectScriptDocument.Factory.parse(new File(scriptFile));
      fAffectScript = new LinkedList<AffectScript.Item>();
      for (AffectScript.Item scriptItem : fAffectScriptDoc.getAffectScript().getItemList()) {
        fAffectScript.add(scriptItem);
      }
    } catch (IOException io) {
      io.printStackTrace();
    } catch (XmlException xmle) {
      xmle.printStackTrace();
    }
  }

  /**
   * The <code>ScriptExecutionTask</code> class realizes the execution of affect scripts.
   */
  private class ScriptExecutionTask extends TimerTask {

    private int fId;
    private AffectScript.Item fAsi = null;

    private ScriptExecutionTask(AffectScript.Item asi, int id) {
      fId = id;
      fAsi = asi;
    }

    public void run() {
      long startTime = System.currentTimeMillis();

      if (fAsi.isSetAffectInput()) {
        fAffectManager.processSignal(fAsi.getAffectInput());
      }
      if (fAsi.isSetAppraisal()) {
        // TODO
      }
      if (fAsi.isSetResetCharacter()) {
        String characterName = fAsi.getResetCharacter().getName().trim();
        CharacterManager character = fAffectManager.getCharacterByName(characterName);
        // setting the personality resets a character affective state	
        character.setPersonality(character.getPersonality());
      }

      log.info("SCRIPTITEM proccessing time was " + (System.currentTimeMillis() - startTime));
    }
  }

  public void play() {
    if (fAffectScript != null) {
      fScriptPlayer = new Timer();
      int id = 0;
      long startTime = System.currentTimeMillis();
      Date scriptExecutionTime = new Date(startTime);
      for (Iterator<AffectScript.Item> it = fAffectScript.iterator(); it.hasNext();) {
        AffectScript.Item scriptItem = it.next();
        scriptExecutionTime = new Date(startTime + scriptItem.getTime());
        fScriptPlayer.schedule(new ScriptExecutionTask(scriptItem, id++), scriptExecutionTime);
      }
    }
  }

  public static void main(String[] args) {
    AffectScriptPlayer asp = new AffectScriptPlayer(args[0], args[1], args[2]);
    asp.play();
  }
}