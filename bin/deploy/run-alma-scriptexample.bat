#!/bin/sh

java -classpath ../lib/affect.jar:../lib/j3dcore.jar:../lib/j3dutils.jar:../lib/vecmath.jar de.affect.manage.AffectManager ../conf/AffectComputation.aml ../conf/CharacterDefinition.aml false ../data//AffectScriptExample.aml
