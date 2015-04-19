/*
 * An XML document type.
 * Localname: AffectComputation
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectComputationDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml;


/**
 * A document containing one AffectComputation(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public interface AffectComputationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffectComputationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("affectcomputation64dcdoctype");
    
    /**
     * Gets the "AffectComputation" element
     */
    de.affect.xml.AffectComputationDocument.AffectComputation getAffectComputation();
    
    /**
     * Sets the "AffectComputation" element
     */
    void setAffectComputation(de.affect.xml.AffectComputationDocument.AffectComputation affectComputation);
    
    /**
     * Appends and returns a new empty "AffectComputation" element
     */
    de.affect.xml.AffectComputationDocument.AffectComputation addNewAffectComputation();
    
    /**
     * An XML AffectComputation(@xml.affect.de).
     *
     * This is a complex type.
     */
    public interface AffectComputation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffectComputation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("affectcomputationfb1aelemtype");
        
        /**
         * Gets the "AvailableActs" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs getAvailableActs();
        
        /**
         * Sets the "AvailableActs" element
         */
        void setAvailableActs(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs availableActs);
        
        /**
         * Appends and returns a new empty "AvailableActs" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs addNewAvailableActs();
        
        /**
         * Gets the "AvailableEmotions" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions getAvailableEmotions();
        
        /**
         * Sets the "AvailableEmotions" element
         */
        void setAvailableEmotions(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions availableEmotions);
        
        /**
         * Appends and returns a new empty "AvailableEmotions" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions addNewAvailableEmotions();
        
        /**
         * Gets the "MoodRelations" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations getMoodRelations();
        
        /**
         * Sets the "MoodRelations" element
         */
        void setMoodRelations(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations moodRelations);
        
        /**
         * Appends and returns a new empty "MoodRelations" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations addNewMoodRelations();
        
        /**
         * Gets the "PersonalityRelations" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations getPersonalityRelations();
        
        /**
         * Sets the "PersonalityRelations" element
         */
        void setPersonalityRelations(de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations personalityRelations);
        
        /**
         * Appends and returns a new empty "PersonalityRelations" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations addNewPersonalityRelations();
        
        /**
         * Gets the "RealtimeOutput" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput getRealtimeOutput();
        
        /**
         * Sets the "RealtimeOutput" element
         */
        void setRealtimeOutput(de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput realtimeOutput);
        
        /**
         * Appends and returns a new empty "RealtimeOutput" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput addNewRealtimeOutput();
        
        /**
         * Gets the "RuntimeInteractionMonitor" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor getRuntimeInteractionMonitor();
        
        /**
         * Sets the "RuntimeInteractionMonitor" element
         */
        void setRuntimeInteractionMonitor(de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor runtimeInteractionMonitor);
        
        /**
         * Appends and returns a new empty "RuntimeInteractionMonitor" element
         */
        de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor addNewRuntimeInteractionMonitor();
        
        /**
         * An XML AvailableActs(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface AvailableActs extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AvailableActs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("availableactsa970elemtype");
            
            /**
             * Gets a List of "ActSpecification" elements
             */
            java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification> getActSpecificationList();
            
            /**
             * Gets array of all "ActSpecification" elements
             * @deprecated
             */
            @Deprecated
            de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification[] getActSpecificationArray();
            
            /**
             * Gets ith "ActSpecification" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification getActSpecificationArray(int i);
            
            /**
             * Returns number of "ActSpecification" element
             */
            int sizeOfActSpecificationArray();
            
            /**
             * Sets array of all "ActSpecification" element
             */
            void setActSpecificationArray(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification[] actSpecificationArray);
            
            /**
             * Sets ith "ActSpecification" element
             */
            void setActSpecificationArray(int i, de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification actSpecification);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ActSpecification" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification insertNewActSpecification(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ActSpecification" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification addNewActSpecification();
            
            /**
             * Removes the ith "ActSpecification" element
             */
            void removeActSpecification(int i);
            
            /**
             * An XML ActSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface ActSpecification extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActSpecification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("actspecification25fdelemtype");
                
                /**
                 * Gets the "name" attribute
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name xgetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name name);
                
                /**
                 * Gets the "use" attribute
                 */
                boolean getUse();
                
                /**
                 * Gets (as xml) the "use" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetUse();
                
                /**
                 * Sets the "use" attribute
                 */
                void setUse(boolean use);
                
                /**
                 * Sets (as xml) the "use" attribute
                 */
                void xsetUse(org.apache.xmlbeans.XmlBoolean use);
                
                /**
                 * Gets the "docu" attribute
                 */
                java.lang.String getDocu();
                
                /**
                 * Gets (as xml) the "docu" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDocu();
                
                /**
                 * True if has "docu" attribute
                 */
                boolean isSetDocu();
                
                /**
                 * Sets the "docu" attribute
                 */
                void setDocu(java.lang.String docu);
                
                /**
                 * Sets (as xml) the "docu" attribute
                 */
                void xsetDocu(org.apache.xmlbeans.XmlString docu);
                
                /**
                 * Unsets the "docu" attribute
                 */
                void unsetDocu();
                
                /**
                 * An XML name(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectComputationDocument$AffectComputation$AvailableActs$ActSpecification$Name.
                 */
                public interface Name extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("nameefb2attrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name newInstance() {
                        return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs newInstance() {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML AvailableEmotions(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface AvailableEmotions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AvailableEmotions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("availableemotionsd307elemtype");
            
            /**
             * Gets a List of "EmotionSpecification" elements
             */
            java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification> getEmotionSpecificationList();
            
            /**
             * Gets array of all "EmotionSpecification" elements
             * @deprecated
             */
            @Deprecated
            de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification[] getEmotionSpecificationArray();
            
            /**
             * Gets ith "EmotionSpecification" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification getEmotionSpecificationArray(int i);
            
            /**
             * Returns number of "EmotionSpecification" element
             */
            int sizeOfEmotionSpecificationArray();
            
            /**
             * Sets array of all "EmotionSpecification" element
             */
            void setEmotionSpecificationArray(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification[] emotionSpecificationArray);
            
            /**
             * Sets ith "EmotionSpecification" element
             */
            void setEmotionSpecificationArray(int i, de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification emotionSpecification);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "EmotionSpecification" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification insertNewEmotionSpecification(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "EmotionSpecification" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification addNewEmotionSpecification();
            
            /**
             * Removes the ith "EmotionSpecification" element
             */
            void removeEmotionSpecification(int i);
            
            /**
             * An XML EmotionSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface EmotionSpecification extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmotionSpecification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("emotionspecification932belemtype");
                
                /**
                 * Gets the "name" attribute
                 */
                de.affect.xml.EmotionName.Enum getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                de.affect.xml.EmotionName xgetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(de.affect.xml.EmotionName.Enum name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(de.affect.xml.EmotionName name);
                
                /**
                 * Gets the "use" attribute
                 */
                boolean getUse();
                
                /**
                 * Gets (as xml) the "use" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetUse();
                
                /**
                 * Sets the "use" attribute
                 */
                void setUse(boolean use);
                
                /**
                 * Sets (as xml) the "use" attribute
                 */
                void xsetUse(org.apache.xmlbeans.XmlBoolean use);
                
                /**
                 * Gets the "docu" attribute
                 */
                java.lang.String getDocu();
                
                /**
                 * Gets (as xml) the "docu" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDocu();
                
                /**
                 * True if has "docu" attribute
                 */
                boolean isSetDocu();
                
                /**
                 * Sets the "docu" attribute
                 */
                void setDocu(java.lang.String docu);
                
                /**
                 * Sets (as xml) the "docu" attribute
                 */
                void xsetDocu(org.apache.xmlbeans.XmlString docu);
                
                /**
                 * Unsets the "docu" attribute
                 */
                void unsetDocu();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions newInstance() {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML MoodRelations(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface MoodRelations extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoodRelations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("moodrelations2926elemtype");
            
            /**
             * Gets the "OpennessRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation getOpennessRelation();
            
            /**
             * Sets the "OpennessRelation" element
             */
            void setOpennessRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation opennessRelation);
            
            /**
             * Appends and returns a new empty "OpennessRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation addNewOpennessRelation();
            
            /**
             * Gets the "ConscientiousnessRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation getConscientiousnessRelation();
            
            /**
             * Sets the "ConscientiousnessRelation" element
             */
            void setConscientiousnessRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation conscientiousnessRelation);
            
            /**
             * Appends and returns a new empty "ConscientiousnessRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation addNewConscientiousnessRelation();
            
            /**
             * Gets the "ExtraversionRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation getExtraversionRelation();
            
            /**
             * Sets the "ExtraversionRelation" element
             */
            void setExtraversionRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation extraversionRelation);
            
            /**
             * Appends and returns a new empty "ExtraversionRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation addNewExtraversionRelation();
            
            /**
             * Gets the "AgreeablenessRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation getAgreeablenessRelation();
            
            /**
             * Sets the "AgreeablenessRelation" element
             */
            void setAgreeablenessRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation agreeablenessRelation);
            
            /**
             * Appends and returns a new empty "AgreeablenessRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation addNewAgreeablenessRelation();
            
            /**
             * Gets the "NeurotismRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation getNeurotismRelation();
            
            /**
             * Sets the "NeurotismRelation" element
             */
            void setNeurotismRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation neurotismRelation);
            
            /**
             * Appends and returns a new empty "NeurotismRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation addNewNeurotismRelation();
            
            /**
             * Gets a List of "EmotionRelation" elements
             */
            java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation> getEmotionRelationList();
            
            /**
             * Gets array of all "EmotionRelation" elements
             * @deprecated
             */
            @Deprecated
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation[] getEmotionRelationArray();
            
            /**
             * Gets ith "EmotionRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation getEmotionRelationArray(int i);
            
            /**
             * Returns number of "EmotionRelation" element
             */
            int sizeOfEmotionRelationArray();
            
            /**
             * Sets array of all "EmotionRelation" element
             */
            void setEmotionRelationArray(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation[] emotionRelationArray);
            
            /**
             * Sets ith "EmotionRelation" element
             */
            void setEmotionRelationArray(int i, de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation emotionRelation);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "EmotionRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation insertNewEmotionRelation(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "EmotionRelation" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation addNewEmotionRelation();
            
            /**
             * Removes the ith "EmotionRelation" element
             */
            void removeEmotionRelation(int i);
            
            /**
             * Gets the "docu" attribute
             */
            java.lang.String getDocu();
            
            /**
             * Gets (as xml) the "docu" attribute
             */
            org.apache.xmlbeans.XmlString xgetDocu();
            
            /**
             * True if has "docu" attribute
             */
            boolean isSetDocu();
            
            /**
             * Sets the "docu" attribute
             */
            void setDocu(java.lang.String docu);
            
            /**
             * Sets (as xml) the "docu" attribute
             */
            void xsetDocu(org.apache.xmlbeans.XmlString docu);
            
            /**
             * Unsets the "docu" attribute
             */
            void unsetDocu();
            
            /**
             * An XML OpennessRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface OpennessRelation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OpennessRelation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("opennessrelatione7dfelemtype");
                
                /**
                 * Gets the "pleasure" attribute
                 */
                double getPleasure();
                
                /**
                 * Gets (as xml) the "pleasure" attribute
                 */
                de.affect.xml.SignedIntensity xgetPleasure();
                
                /**
                 * Sets the "pleasure" attribute
                 */
                void setPleasure(double pleasure);
                
                /**
                 * Sets (as xml) the "pleasure" attribute
                 */
                void xsetPleasure(de.affect.xml.SignedIntensity pleasure);
                
                /**
                 * Gets the "arousal" attribute
                 */
                double getArousal();
                
                /**
                 * Gets (as xml) the "arousal" attribute
                 */
                de.affect.xml.SignedIntensity xgetArousal();
                
                /**
                 * Sets the "arousal" attribute
                 */
                void setArousal(double arousal);
                
                /**
                 * Sets (as xml) the "arousal" attribute
                 */
                void xsetArousal(de.affect.xml.SignedIntensity arousal);
                
                /**
                 * Gets the "dominance" attribute
                 */
                double getDominance();
                
                /**
                 * Gets (as xml) the "dominance" attribute
                 */
                de.affect.xml.SignedIntensity xgetDominance();
                
                /**
                 * Sets the "dominance" attribute
                 */
                void setDominance(double dominance);
                
                /**
                 * Sets (as xml) the "dominance" attribute
                 */
                void xsetDominance(de.affect.xml.SignedIntensity dominance);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ConscientiousnessRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface ConscientiousnessRelation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConscientiousnessRelation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("conscientiousnessrelation3e1delemtype");
                
                /**
                 * Gets the "pleasure" attribute
                 */
                double getPleasure();
                
                /**
                 * Gets (as xml) the "pleasure" attribute
                 */
                de.affect.xml.SignedIntensity xgetPleasure();
                
                /**
                 * Sets the "pleasure" attribute
                 */
                void setPleasure(double pleasure);
                
                /**
                 * Sets (as xml) the "pleasure" attribute
                 */
                void xsetPleasure(de.affect.xml.SignedIntensity pleasure);
                
                /**
                 * Gets the "arousal" attribute
                 */
                double getArousal();
                
                /**
                 * Gets (as xml) the "arousal" attribute
                 */
                de.affect.xml.SignedIntensity xgetArousal();
                
                /**
                 * Sets the "arousal" attribute
                 */
                void setArousal(double arousal);
                
                /**
                 * Sets (as xml) the "arousal" attribute
                 */
                void xsetArousal(de.affect.xml.SignedIntensity arousal);
                
                /**
                 * Gets the "dominance" attribute
                 */
                double getDominance();
                
                /**
                 * Gets (as xml) the "dominance" attribute
                 */
                de.affect.xml.SignedIntensity xgetDominance();
                
                /**
                 * Sets the "dominance" attribute
                 */
                void setDominance(double dominance);
                
                /**
                 * Sets (as xml) the "dominance" attribute
                 */
                void xsetDominance(de.affect.xml.SignedIntensity dominance);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ExtraversionRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface ExtraversionRelation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtraversionRelation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("extraversionrelation5ec6elemtype");
                
                /**
                 * Gets the "pleasure" attribute
                 */
                double getPleasure();
                
                /**
                 * Gets (as xml) the "pleasure" attribute
                 */
                de.affect.xml.SignedIntensity xgetPleasure();
                
                /**
                 * Sets the "pleasure" attribute
                 */
                void setPleasure(double pleasure);
                
                /**
                 * Sets (as xml) the "pleasure" attribute
                 */
                void xsetPleasure(de.affect.xml.SignedIntensity pleasure);
                
                /**
                 * Gets the "arousal" attribute
                 */
                double getArousal();
                
                /**
                 * Gets (as xml) the "arousal" attribute
                 */
                de.affect.xml.SignedIntensity xgetArousal();
                
                /**
                 * Sets the "arousal" attribute
                 */
                void setArousal(double arousal);
                
                /**
                 * Sets (as xml) the "arousal" attribute
                 */
                void xsetArousal(de.affect.xml.SignedIntensity arousal);
                
                /**
                 * Gets the "dominance" attribute
                 */
                double getDominance();
                
                /**
                 * Gets (as xml) the "dominance" attribute
                 */
                de.affect.xml.SignedIntensity xgetDominance();
                
                /**
                 * Sets the "dominance" attribute
                 */
                void setDominance(double dominance);
                
                /**
                 * Sets (as xml) the "dominance" attribute
                 */
                void xsetDominance(de.affect.xml.SignedIntensity dominance);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML AgreeablenessRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface AgreeablenessRelation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AgreeablenessRelation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("agreeablenessrelationca2belemtype");
                
                /**
                 * Gets the "pleasure" attribute
                 */
                double getPleasure();
                
                /**
                 * Gets (as xml) the "pleasure" attribute
                 */
                de.affect.xml.SignedIntensity xgetPleasure();
                
                /**
                 * Sets the "pleasure" attribute
                 */
                void setPleasure(double pleasure);
                
                /**
                 * Sets (as xml) the "pleasure" attribute
                 */
                void xsetPleasure(de.affect.xml.SignedIntensity pleasure);
                
                /**
                 * Gets the "arousal" attribute
                 */
                double getArousal();
                
                /**
                 * Gets (as xml) the "arousal" attribute
                 */
                de.affect.xml.SignedIntensity xgetArousal();
                
                /**
                 * Sets the "arousal" attribute
                 */
                void setArousal(double arousal);
                
                /**
                 * Sets (as xml) the "arousal" attribute
                 */
                void xsetArousal(de.affect.xml.SignedIntensity arousal);
                
                /**
                 * Gets the "dominance" attribute
                 */
                double getDominance();
                
                /**
                 * Gets (as xml) the "dominance" attribute
                 */
                de.affect.xml.SignedIntensity xgetDominance();
                
                /**
                 * Sets the "dominance" attribute
                 */
                void setDominance(double dominance);
                
                /**
                 * Sets (as xml) the "dominance" attribute
                 */
                void xsetDominance(de.affect.xml.SignedIntensity dominance);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML NeurotismRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface NeurotismRelation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NeurotismRelation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("neurotismrelation7878elemtype");
                
                /**
                 * Gets the "pleasure" attribute
                 */
                double getPleasure();
                
                /**
                 * Gets (as xml) the "pleasure" attribute
                 */
                de.affect.xml.SignedIntensity xgetPleasure();
                
                /**
                 * Sets the "pleasure" attribute
                 */
                void setPleasure(double pleasure);
                
                /**
                 * Sets (as xml) the "pleasure" attribute
                 */
                void xsetPleasure(de.affect.xml.SignedIntensity pleasure);
                
                /**
                 * Gets the "arousal" attribute
                 */
                double getArousal();
                
                /**
                 * Gets (as xml) the "arousal" attribute
                 */
                de.affect.xml.SignedIntensity xgetArousal();
                
                /**
                 * Sets the "arousal" attribute
                 */
                void setArousal(double arousal);
                
                /**
                 * Sets (as xml) the "arousal" attribute
                 */
                void xsetArousal(de.affect.xml.SignedIntensity arousal);
                
                /**
                 * Gets the "dominance" attribute
                 */
                double getDominance();
                
                /**
                 * Gets (as xml) the "dominance" attribute
                 */
                de.affect.xml.SignedIntensity xgetDominance();
                
                /**
                 * Sets the "dominance" attribute
                 */
                void setDominance(double dominance);
                
                /**
                 * Sets (as xml) the "dominance" attribute
                 */
                void xsetDominance(de.affect.xml.SignedIntensity dominance);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML EmotionRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface EmotionRelation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmotionRelation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("emotionrelationd2a9elemtype");
                
                /**
                 * Gets the "name" attribute
                 */
                de.affect.xml.EmotionName.Enum getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                de.affect.xml.EmotionName xgetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(de.affect.xml.EmotionName.Enum name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(de.affect.xml.EmotionName name);
                
                /**
                 * Gets the "pleasure" attribute
                 */
                double getPleasure();
                
                /**
                 * Gets (as xml) the "pleasure" attribute
                 */
                de.affect.xml.SignedIntensity xgetPleasure();
                
                /**
                 * Sets the "pleasure" attribute
                 */
                void setPleasure(double pleasure);
                
                /**
                 * Sets (as xml) the "pleasure" attribute
                 */
                void xsetPleasure(de.affect.xml.SignedIntensity pleasure);
                
                /**
                 * Gets the "arousal" attribute
                 */
                double getArousal();
                
                /**
                 * Gets (as xml) the "arousal" attribute
                 */
                de.affect.xml.SignedIntensity xgetArousal();
                
                /**
                 * Sets the "arousal" attribute
                 */
                void setArousal(double arousal);
                
                /**
                 * Sets (as xml) the "arousal" attribute
                 */
                void xsetArousal(de.affect.xml.SignedIntensity arousal);
                
                /**
                 * Gets the "dominance" attribute
                 */
                double getDominance();
                
                /**
                 * Gets (as xml) the "dominance" attribute
                 */
                de.affect.xml.SignedIntensity xgetDominance();
                
                /**
                 * Sets the "dominance" attribute
                 */
                void setDominance(double dominance);
                
                /**
                 * Sets (as xml) the "dominance" attribute
                 */
                void xsetDominance(de.affect.xml.SignedIntensity dominance);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations newInstance() {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML PersonalityRelations(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface PersonalityRelations extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonalityRelations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("personalityrelations753felemtype");
            
            /**
             * Gets the "PleasureRelation" element
             */
            de.affect.xml.PersonalityType getPleasureRelation();
            
            /**
             * Sets the "PleasureRelation" element
             */
            void setPleasureRelation(de.affect.xml.PersonalityType pleasureRelation);
            
            /**
             * Appends and returns a new empty "PleasureRelation" element
             */
            de.affect.xml.PersonalityType addNewPleasureRelation();
            
            /**
             * Gets the "ArousalRelation" element
             */
            de.affect.xml.PersonalityType getArousalRelation();
            
            /**
             * Sets the "ArousalRelation" element
             */
            void setArousalRelation(de.affect.xml.PersonalityType arousalRelation);
            
            /**
             * Appends and returns a new empty "ArousalRelation" element
             */
            de.affect.xml.PersonalityType addNewArousalRelation();
            
            /**
             * Gets the "DominanceRelation" element
             */
            de.affect.xml.PersonalityType getDominanceRelation();
            
            /**
             * Sets the "DominanceRelation" element
             */
            void setDominanceRelation(de.affect.xml.PersonalityType dominanceRelation);
            
            /**
             * Appends and returns a new empty "DominanceRelation" element
             */
            de.affect.xml.PersonalityType addNewDominanceRelation();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations newInstance() {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML RealtimeOutput(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface RealtimeOutput extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RealtimeOutput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("realtimeoutput8622elemtype");
            
            /**
             * Gets the "FileLog" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog getFileLog();
            
            /**
             * Sets the "FileLog" element
             */
            void setFileLog(de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog fileLog);
            
            /**
             * Appends and returns a new empty "FileLog" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog addNewFileLog();
            
            /**
             * Gets the "ConsoleLog" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog getConsoleLog();
            
            /**
             * Sets the "ConsoleLog" element
             */
            void setConsoleLog(de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog consoleLog);
            
            /**
             * Appends and returns a new empty "ConsoleLog" element
             */
            de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog addNewConsoleLog();
            
            /**
             * Gets the "enable" attribute
             */
            boolean getEnable();
            
            /**
             * Gets (as xml) the "enable" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetEnable();
            
            /**
             * Sets the "enable" attribute
             */
            void setEnable(boolean enable);
            
            /**
             * Sets (as xml) the "enable" attribute
             */
            void xsetEnable(org.apache.xmlbeans.XmlBoolean enable);
            
            /**
             * Gets the "period" attribute
             */
            int getPeriod();
            
            /**
             * Gets (as xml) the "period" attribute
             */
            org.apache.xmlbeans.XmlInt xgetPeriod();
            
            /**
             * Sets the "period" attribute
             */
            void setPeriod(int period);
            
            /**
             * Sets (as xml) the "period" attribute
             */
            void xsetPeriod(org.apache.xmlbeans.XmlInt period);
            
            /**
             * An XML FileLog(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface FileLog extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FileLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("filelogd32eelemtype");
                
                /**
                 * Gets the "enable" attribute
                 */
                boolean getEnable();
                
                /**
                 * Gets (as xml) the "enable" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetEnable();
                
                /**
                 * Sets the "enable" attribute
                 */
                void setEnable(boolean enable);
                
                /**
                 * Sets (as xml) the "enable" attribute
                 */
                void xsetEnable(org.apache.xmlbeans.XmlBoolean enable);
                
                /**
                 * Gets the "file" attribute
                 */
                java.lang.String getFile();
                
                /**
                 * Gets (as xml) the "file" attribute
                 */
                org.apache.xmlbeans.XmlString xgetFile();
                
                /**
                 * Sets the "file" attribute
                 */
                void setFile(java.lang.String file);
                
                /**
                 * Sets (as xml) the "file" attribute
                 */
                void xsetFile(org.apache.xmlbeans.XmlString file);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ConsoleLog(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface ConsoleLog extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConsoleLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("consoleloga4d9elemtype");
                
                /**
                 * Gets the "enable" attribute
                 */
                boolean getEnable();
                
                /**
                 * Gets (as xml) the "enable" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetEnable();
                
                /**
                 * Sets the "enable" attribute
                 */
                void setEnable(boolean enable);
                
                /**
                 * Sets (as xml) the "enable" attribute
                 */
                void xsetEnable(org.apache.xmlbeans.XmlBoolean enable);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog newInstance() {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput newInstance() {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML RuntimeInteractionMonitor(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface RuntimeInteractionMonitor extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RuntimeInteractionMonitor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("runtimeinteractionmonitor4946elemtype");
            
            /**
             * Gets the "enabled" attribute
             */
            boolean getEnabled();
            
            /**
             * Gets (as xml) the "enabled" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetEnabled();
            
            /**
             * Sets the "enabled" attribute
             */
            void setEnabled(boolean enabled);
            
            /**
             * Sets (as xml) the "enabled" attribute
             */
            void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor newInstance() {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.affect.xml.AffectComputationDocument.AffectComputation newInstance() {
              return (de.affect.xml.AffectComputationDocument.AffectComputation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.affect.xml.AffectComputationDocument.AffectComputation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.affect.xml.AffectComputationDocument.AffectComputation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.affect.xml.AffectComputationDocument newInstance() {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.affect.xml.AffectComputationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.affect.xml.AffectComputationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.affect.xml.AffectComputationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.affect.xml.AffectComputationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.affect.xml.AffectComputationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.affect.xml.AffectComputationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.affect.xml.AffectComputationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.affect.xml.AffectComputationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.affect.xml.AffectComputationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.affect.xml.AffectComputationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.affect.xml.AffectComputationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.affect.xml.AffectComputationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.affect.xml.AffectComputationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.affect.xml.AffectComputationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.affect.xml.AffectComputationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.AffectComputationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.AffectComputationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.AffectComputationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
