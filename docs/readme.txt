--------------------------------------------------------------------------------
ALMA Runtime Readme

Author: Patrick Gebhard

Date: September 2012
--------------------------------------------------------------------------------


1. The ALMA software package

	bin
		Contains batch files for executing the CharacterBuilder and a 
    version of ALMA executing the AffectScriptExample stored in the
    data directory. For compiling the AffectEngine an ant build file
    (build.xml) and a related make file (make-example.bat) can be
    found here.

	conf
    Contains the AffectComputation.aml configuration file that holds
    global affect computation parameters.

    Also contains CharacterDefinition.aml that stores specific
    character and group affect parameters like personality but also
    personal affect computational parameters (emotion decay time)
    and dialog act appraisal rules.

	data
		Several affect input files in AML format

	doc
		ALMA-API

		Documentation		

		Licence

	lib
		Needed java library files

	src
		Sample java code, e.g. AffectEngine


2. Requirements

	ALMA works in Windows XP and MAC OS X (10.4.0 and higher) environments.
	Initially ALMA was designed for Windows XP.

	Java 1.7.06 - newer versions might work. (http://www.oracle.com/technetwork/java/index.html)
	
	Java 3D library  provided by the java 3d community (http://www.j3d.org/)

		Version 1.3.1 or higher: https://java3d.dev.java.net/binary-builds.html

		Notes: If ALMA cannot find J3D, the affect monitor does not work.
           Sometimes, J3d cannot be found, because it was not (re)installed
           after installing (a new version of) the java jdk/jre.
           Fix: reinstall J3D.

	Optional: Apache Ant for compiling example code (http://ant.apache.org)
	
		Version 1.7.0 or higher: http://ant.apache.org/bindownload.cgi

		Note: Add the ant directory to the path environment variable so that
          ant{.bat} can be executed everywhere in the console (cmd.exe)

	Optional: Apache XMLBeans (http://ant.apache.org)
		
		All input and output data of ALMA is in the AML-Format, a XML
		sublanguage. ALMA using XMLBeans for accessing, verifying, and 
		manipulating AML data.

    
3. First steps

	Run characterbuilder.bat in bin directory, wait for the
	characterbuilder gui to appear.

	3.1 Test the functionality and visualization of affect computation

		Open Bruno's Affect Monitor:

		Select in Menu: Characters->Bruno->Show Monitor

			Troubleshooting: If no window appears, check console for 
			errors. This is probably a j3d issue (see requirements).
		
		Open InteractionDialog

		Select in Menu: Groups->Interaction Simulation

		Load AffectScriptExample in Interaction Simulation Window

		Select Load, browse to the data dir of the ALMA installation and
                load AffectScriptExample.aml

                To check the affect computation, execute the AffectScript by
		the play button.

                ALMA works fine, if emotions (red spheres) are displayed in 
		Bruno's AffectMonitor.

	3.2 Check how personality influence the basic mood of a character

		Open Bruno's Affect Monitor, see 3.1

		Open Bruno's Configuration Dialog

		Select in Menu: Characters->Bruno->Configuration

			Select Personality tab

			Move personality trait sliders and watch the Affect Monitor.
      It displays the changes of Bruno's basic mood.

	3.3 See Help-window of the CharacterBuilder for more information about
      ALMA and the CharacterBuilder tool.

	3.4 Look at the example code.


4. Example Code

  An example use of the ALMA JAVA API is shown in the AffectEngine.java code. 
  This file is located in the src directory.

  Please look at the JAVA API in the doc/api directory. For the general
  methods, check the AffectManager.InterfaceHolder class.
	
		



