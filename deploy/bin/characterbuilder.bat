@ECHO OFF

java -classpath ..\lib\affect.jar;..\lib\xbean.jar;..\lib\emotionml.jar;..\lib\jama.jar;..\lib/j3dcore.jar;..\lib\j3dutils.jar;..\lib\vecmath.jar de.affect.manage.AffectManager ..\conf\AffectComputation.aml ..\conf\CharacterDefinition.aml true
