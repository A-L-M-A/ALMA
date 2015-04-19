/*
 * FileHelper.java
 *
 * Copyright (c) 2004-2006 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.util;

import java.awt.Toolkit;
import java.awt.Image;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.Properties;
import javax.swing.ImageIcon;

public class FileHelper {

  private static InputStream sALMABuildDetails= null;
  private static String sBuildVersion = "";
  private static String sBuildNumber = "";
  private static String sBuildDate = "";
  public static String sPathSeparator = null;
  public static File sALMAWorkDirectory = null;
  public static File sUserDirectory = null;
  public static File sALMAConfigPath = null;
  public static InputStream sALMADefaultComputationConfig = null;
  public static InputStream sALMADefaultCharacterDefinition = null;
  public static File sALMAComputationConfigFile = null;
  public static File sALMACharacterConfigFile = null;
  public static URL sALMAHelpFile = null;
  public static URL sALMAAboutFile = null;
  public static File sALMADocPath = null;
  public static File sALMAScriptPath = null;
  public static File sALMADefaultScriptFile = null;
  public static File sALMAGUIConfiguration = null;
  public static Image sALMAFrameIcon = null;
  public static ImageIcon sALMAInternalFrameIcon = null;
  public static ImageIcon sRecordIcon = null;
  public static ImageIcon sPlayIcon = null;
  public static ImageIcon sRunningIcon = null;
  public static ImageIcon sStopIcon = null;
  public static ImageIcon sALMALogo = null;
  private static FileHelper instance = null;
  

  protected FileHelper() {

    sPathSeparator = System.getProperty("file.separator");
    sALMAWorkDirectory = new File(System.getProperty("user.dir") + sPathSeparator);
    sUserDirectory = new File(System.getProperty("user.home") + sPathSeparator);
    sALMADocPath = new File(sALMAWorkDirectory.getPath() + sPathSeparator + "docs" + sPathSeparator);
    sALMAScriptPath = new File(sALMAWorkDirectory.getPath() + sPathSeparator + "scripts" + sPathSeparator);
    sALMADefaultScriptFile = new File("affectscript.aml");
    sALMAGUIConfiguration = new File(sUserDirectory.getPath() + sPathSeparator + ".alma-characterbuilder.ini");
    
    // aquire ALMAs default computation parameters. They will be used if ALMA is
    // started without any arguments
    try {
      sALMADefaultComputationConfig = getClass().getResourceAsStream("/conf/DefaultComputationParameters.aml");
    } catch(Exception e) {
      e.printStackTrace();
    }    
        
    // acquire the build details
    try {
      sALMABuildDetails = getClass().getResourceAsStream("/conf/version.ini");
      Properties vProp = new Properties();
      vProp.load(sALMABuildDetails);
      sALMABuildDetails.close();
      sBuildVersion = (String)vProp.getProperty("build.version");
      sBuildNumber = (String)vProp.getProperty("build.number");
      sBuildDate = (String)vProp.getProperty("build.date");
    } catch(Exception e) {
      e.printStackTrace();
    }

    // acquire the (internal) frame icon
    try {
      sALMAFrameIcon =
        Toolkit.getDefaultToolkit().createImage(getClass().getResource("/pics/icon.gif"));
      sALMAInternalFrameIcon = (sALMAFrameIcon != null) ? new ImageIcon(sALMAFrameIcon) : null;
    } catch(Exception e) {
      e.printStackTrace();
    }
    
    // acquire the logo
    try {
      sALMALogo =
        new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/pics/logo.jpg")));
    } catch(Exception e) {
      e.printStackTrace();
    }
    
    // acquire needed icons
    try {
      sRecordIcon =
        new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/pics/record.gif")));
      sPlayIcon =
        new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/pics/play.gif")));
      sRunningIcon =
        new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/pics/running.gif")));
      sStopIcon =
        new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/pics/stop.gif")));
    } catch(Exception e) {
      e.printStackTrace();
    }
 
    // acquire about and help file
    try {
      sALMAAboutFile = getClass().getResource("/docs/about.html");
      sALMAHelpFile = getClass().getResource("/docs/index.html");
    } catch(Exception e) {
      e.printStackTrace();
    }

    
  }

  public static FileHelper createFileHelper() {
    instance = (instance == null) ? new FileHelper() : instance;
    return instance;
  }

  public static void setConfigPath(String configPath) {
    sALMAConfigPath = new File(sALMAWorkDirectory.getPath() + sPathSeparator + configPath + sPathSeparator);
  }

  public static void setComputationConfigFile(File computationConfigFile) {
    sALMAComputationConfigFile = computationConfigFile;
  }

  public static void setCharacterConfigFile(File characterConfigFile) {
    sALMACharacterConfigFile = characterConfigFile;
  }

  /**
   * returns the default character defintion. it will be used as a template when
   * creating a new character
   */
  public InputStream  defaultCharacterDefinition() {
    try {
      return getClass().getResourceAsStream("/conf/DefaultCharacterDefinition.aml");
    } catch(Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  
  /**
   * Returns a version number that contains the build number stored in the
   * version.ini file
   * 
   * @return string holding the actual version number
   */
  public static String buildVersion() {
    if (sBuildVersion == "") {
      return "[unknown]";
    } else {
      return sBuildVersion;
    }
  }
  
  /**
   * Returns a version build details that contains the build number stored in the
   * version.ini file
   * 
   * @return string holding the actual version number
   */
  public static String buildDetails() {
    if (sBuildVersion == "") {
      return "[unknown]";
    } else {
      return "[" + sBuildNumber + " " + sBuildDate + "]";
    }
  }

  /**
   * Checks if java3d is available
   */
  public static void checkJava3D() {
    try {
      Class shouldbeAvailableClass = Class.forName("javax.media.j3d.Canvas3D");
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

}

