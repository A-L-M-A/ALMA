/*
 * An XML document type.
 * Localname: AffectDefinition
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml;


/**
 * A document containing one AffectDefinition(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public interface AffectDefinitionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffectDefinitionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("affectdefinition17c4doctype");
    
    /**
     * Gets the "AffectDefinition" element
     */
    de.affect.xml.AffectDefinitionDocument.AffectDefinition getAffectDefinition();
    
    /**
     * Sets the "AffectDefinition" element
     */
    void setAffectDefinition(de.affect.xml.AffectDefinitionDocument.AffectDefinition affectDefinition);
    
    /**
     * Appends and returns a new empty "AffectDefinition" element
     */
    de.affect.xml.AffectDefinitionDocument.AffectDefinition addNewAffectDefinition();
    
    /**
     * An XML AffectDefinition(@xml.affect.de).
     *
     * This is a complex type.
     */
    public interface AffectDefinition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffectDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("affectdefinition9940elemtype");
        
        /**
         * Gets a List of "CharacterAffect" elements
         */
        java.util.List<de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect> getCharacterAffectList();
        
        /**
         * Gets array of all "CharacterAffect" elements
         * @deprecated
         */
        @Deprecated
        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect[] getCharacterAffectArray();
        
        /**
         * Gets ith "CharacterAffect" element
         */
        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect getCharacterAffectArray(int i);
        
        /**
         * Returns number of "CharacterAffect" element
         */
        int sizeOfCharacterAffectArray();
        
        /**
         * Sets array of all "CharacterAffect" element
         */
        void setCharacterAffectArray(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect[] characterAffectArray);
        
        /**
         * Sets ith "CharacterAffect" element
         */
        void setCharacterAffectArray(int i, de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect characterAffect);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CharacterAffect" element
         */
        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect insertNewCharacterAffect(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CharacterAffect" element
         */
        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect addNewCharacterAffect();
        
        /**
         * Removes the ith "CharacterAffect" element
         */
        void removeCharacterAffect(int i);
        
        /**
         * Gets a List of "GroupAffect" elements
         */
        java.util.List<de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect> getGroupAffectList();
        
        /**
         * Gets array of all "GroupAffect" elements
         * @deprecated
         */
        @Deprecated
        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect[] getGroupAffectArray();
        
        /**
         * Gets ith "GroupAffect" element
         */
        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect getGroupAffectArray(int i);
        
        /**
         * Returns number of "GroupAffect" element
         */
        int sizeOfGroupAffectArray();
        
        /**
         * Sets array of all "GroupAffect" element
         */
        void setGroupAffectArray(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect[] groupAffectArray);
        
        /**
         * Sets ith "GroupAffect" element
         */
        void setGroupAffectArray(int i, de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect groupAffect);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GroupAffect" element
         */
        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect insertNewGroupAffect(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GroupAffect" element
         */
        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect addNewGroupAffect();
        
        /**
         * Removes the ith "GroupAffect" element
         */
        void removeGroupAffect(int i);
        
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
         * An XML CharacterAffect(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface CharacterAffect extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CharacterAffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("characteraffect002aelemtype");
            
            /**
             * Gets the "PersonalitySpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification getPersonalitySpecification();
            
            /**
             * Sets the "PersonalitySpecification" element
             */
            void setPersonalitySpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification personalitySpecification);
            
            /**
             * Appends and returns a new empty "PersonalitySpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification addNewPersonalitySpecification();
            
            /**
             * Gets the "MoodSpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification getMoodSpecification();
            
            /**
             * Sets the "MoodSpecification" element
             */
            void setMoodSpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification moodSpecification);
            
            /**
             * Appends and returns a new empty "MoodSpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification addNewMoodSpecification();
            
            /**
             * Gets the "EmotionSpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification getEmotionSpecification();
            
            /**
             * Sets the "EmotionSpecification" element
             */
            void setEmotionSpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification emotionSpecification);
            
            /**
             * Appends and returns a new empty "EmotionSpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification addNewEmotionSpecification();
            
            /**
             * Gets the "Appraisal" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal getAppraisal();
            
            /**
             * Sets the "Appraisal" element
             */
            void setAppraisal(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal appraisal);
            
            /**
             * Appends and returns a new empty "Appraisal" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal addNewAppraisal();
            
            /**
             * Gets the "name" attribute
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name xgetName();
            
            /**
             * Sets the "name" attribute
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" attribute
             */
            void xsetName(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name name);
            
            /**
             * Gets the "monitored" attribute
             */
            boolean getMonitored();
            
            /**
             * Gets (as xml) the "monitored" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetMonitored();
            
            /**
             * True if has "monitored" attribute
             */
            boolean isSetMonitored();
            
            /**
             * Sets the "monitored" attribute
             */
            void setMonitored(boolean monitored);
            
            /**
             * Sets (as xml) the "monitored" attribute
             */
            void xsetMonitored(org.apache.xmlbeans.XmlBoolean monitored);
            
            /**
             * Unsets the "monitored" attribute
             */
            void unsetMonitored();
            
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
             * An XML PersonalitySpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface PersonalitySpecification extends de.affect.xml.PersonalityType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonalitySpecification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("personalityspecification6d5belemtype");
                
                /**
                 * Gets the "derived" attribute
                 */
                boolean getDerived();
                
                /**
                 * Gets (as xml) the "derived" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetDerived();
                
                /**
                 * True if has "derived" attribute
                 */
                boolean isSetDerived();
                
                /**
                 * Sets the "derived" attribute
                 */
                void setDerived(boolean derived);
                
                /**
                 * Sets (as xml) the "derived" attribute
                 */
                void xsetDerived(org.apache.xmlbeans.XmlBoolean derived);
                
                /**
                 * Unsets the "derived" attribute
                 */
                void unsetDerived();
                
                /**
                 * Gets the "emotioninfluence" attribute
                 */
                java.lang.String getEmotioninfluence();
                
                /**
                 * Gets (as xml) the "emotioninfluence" attribute
                 */
                de.affect.xml.Intensity xgetEmotioninfluence();
                
                /**
                 * Sets the "emotioninfluence" attribute
                 */
                void setEmotioninfluence(java.lang.String emotioninfluence);
                
                /**
                 * Sets (as xml) the "emotioninfluence" attribute
                 */
                void xsetEmotioninfluence(de.affect.xml.Intensity emotioninfluence);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification newInstance() {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML MoodSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface MoodSpecification extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoodSpecification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("moodspecification27c2elemtype");
                
                /**
                 * Gets the "decaytime" attribute
                 */
                long getDecaytime();
                
                /**
                 * Gets (as xml) the "decaytime" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime xgetDecaytime();
                
                /**
                 * Sets the "decaytime" attribute
                 */
                void setDecaytime(long decaytime);
                
                /**
                 * Sets (as xml) the "decaytime" attribute
                 */
                void xsetDecaytime(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime decaytime);
                
                /**
                 * Gets the "decayperiod" attribute
                 */
                int getDecayperiod();
                
                /**
                 * Gets (as xml) the "decayperiod" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod xgetDecayperiod();
                
                /**
                 * Sets the "decayperiod" attribute
                 */
                void setDecayperiod(int decayperiod);
                
                /**
                 * Sets (as xml) the "decayperiod" attribute
                 */
                void xsetDecayperiod(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod decayperiod);
                
                /**
                 * Gets the "neurotismstability" attribute
                 */
                boolean getNeurotismstability();
                
                /**
                 * Gets (as xml) the "neurotismstability" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetNeurotismstability();
                
                /**
                 * Sets the "neurotismstability" attribute
                 */
                void setNeurotismstability(boolean neurotismstability);
                
                /**
                 * Sets (as xml) the "neurotismstability" attribute
                 */
                void xsetNeurotismstability(org.apache.xmlbeans.XmlBoolean neurotismstability);
                
                /**
                 * An XML decaytime(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$MoodSpecification$Decaytime.
                 */
                public interface Decaytime extends org.apache.xmlbeans.XmlLong
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decaytime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decaytimea7f1attrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML decayperiod(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$MoodSpecification$Decayperiod.
                 */
                public interface Decayperiod extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decayperiod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decayperiodf265attrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification newInstance() {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML EmotionSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface EmotionSpecification extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmotionSpecification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("emotionspecification724eelemtype");
                
                /**
                 * Gets the "decaytime" attribute
                 */
                long getDecaytime();
                
                /**
                 * Gets (as xml) the "decaytime" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime xgetDecaytime();
                
                /**
                 * Sets the "decaytime" attribute
                 */
                void setDecaytime(long decaytime);
                
                /**
                 * Sets (as xml) the "decaytime" attribute
                 */
                void xsetDecaytime(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime decaytime);
                
                /**
                 * Gets the "decayperiod" attribute
                 */
                int getDecayperiod();
                
                /**
                 * Gets (as xml) the "decayperiod" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod xgetDecayperiod();
                
                /**
                 * Sets the "decayperiod" attribute
                 */
                void setDecayperiod(int decayperiod);
                
                /**
                 * Sets (as xml) the "decayperiod" attribute
                 */
                void xsetDecayperiod(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod decayperiod);
                
                /**
                 * Gets the "decayfunction" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction.Enum getDecayfunction();
                
                /**
                 * Gets (as xml) the "decayfunction" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction xgetDecayfunction();
                
                /**
                 * Sets the "decayfunction" attribute
                 */
                void setDecayfunction(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction.Enum decayfunction);
                
                /**
                 * Sets (as xml) the "decayfunction" attribute
                 */
                void xsetDecayfunction(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction decayfunction);
                
                /**
                 * Gets the "baseline" attribute
                 */
                java.lang.String getBaseline();
                
                /**
                 * Gets (as xml) the "baseline" attribute
                 */
                de.affect.xml.Intensity xgetBaseline();
                
                /**
                 * Sets the "baseline" attribute
                 */
                void setBaseline(java.lang.String baseline);
                
                /**
                 * Sets (as xml) the "baseline" attribute
                 */
                void xsetBaseline(de.affect.xml.Intensity baseline);
                
                /**
                 * An XML decaytime(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$EmotionSpecification$Decaytime.
                 */
                public interface Decaytime extends org.apache.xmlbeans.XmlLong
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decaytime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decaytime4fbfattrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML decayperiod(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$EmotionSpecification$Decayperiod.
                 */
                public interface Decayperiod extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decayperiod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decayperiod80cbattrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML decayfunction(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$EmotionSpecification$Decayfunction.
                 */
                public interface Decayfunction extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decayfunction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decayfunctione594attrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum LINEAR = Enum.forString("linear");
                    static final Enum EXPONENTIAL = Enum.forString("exponential");
                    static final Enum HYPERBOLIC = Enum.forString("hyperbolic");
                    
                    static final int INT_LINEAR = Enum.INT_LINEAR;
                    static final int INT_EXPONENTIAL = Enum.INT_EXPONENTIAL;
                    static final int INT_HYPERBOLIC = Enum.INT_HYPERBOLIC;
                    
                    /**
                     * Enumeration value class for de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$EmotionSpecification$Decayfunction.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_LINEAR
                     * Enum.forString(s); // returns the enum value for a string
                     * Enum.forInt(i); // returns the enum value for an int
                     * </pre>
                     * Enumeration objects are immutable singleton objects that
                     * can be compared using == object equality. They have no
                     * public constructor. See the constants defined within this
                     * class for all the valid values.
                     */
                    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                    {
                      /**
                       * Returns the enum value for a string, or null if none.
                       */
                      public static Enum forString(java.lang.String s)
                          { return (Enum)table.forString(s); }
                      /**
                       * Returns the enum value corresponding to an int, or null if none.
                       */
                      public static Enum forInt(int i)
                          { return (Enum)table.forInt(i); }
                      
                      private Enum(java.lang.String s, int i)
                          { super(s, i); }
                      
                      static final int INT_LINEAR = 1;
                      static final int INT_EXPONENTIAL = 2;
                      static final int INT_HYPERBOLIC = 3;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("linear", INT_LINEAR),
                          new Enum("exponential", INT_EXPONENTIAL),
                          new Enum("hyperbolic", INT_HYPERBOLIC),
                        }
                      );
                      private static final long serialVersionUID = 1L;
                      private java.lang.Object readResolve() { return forInt(intValue()); } 
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification newInstance() {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Appraisal(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface Appraisal extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Appraisal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("appraisal449belemtype");
                
                /**
                 * Gets the "Basic" element
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic getBasic();
                
                /**
                 * Sets the "Basic" element
                 */
                void setBasic(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic basic);
                
                /**
                 * Appends and returns a new empty "Basic" element
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic addNewBasic();
                
                /**
                 * Gets a List of "SelfAct" elements
                 */
                java.util.List<de.affect.xml.SelfActType> getSelfActList();
                
                /**
                 * Gets array of all "SelfAct" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.SelfActType[] getSelfActArray();
                
                /**
                 * Gets ith "SelfAct" element
                 */
                de.affect.xml.SelfActType getSelfActArray(int i);
                
                /**
                 * Returns number of "SelfAct" element
                 */
                int sizeOfSelfActArray();
                
                /**
                 * Sets array of all "SelfAct" element
                 */
                void setSelfActArray(de.affect.xml.SelfActType[] selfActArray);
                
                /**
                 * Sets ith "SelfAct" element
                 */
                void setSelfActArray(int i, de.affect.xml.SelfActType selfAct);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SelfAct" element
                 */
                de.affect.xml.SelfActType insertNewSelfAct(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SelfAct" element
                 */
                de.affect.xml.SelfActType addNewSelfAct();
                
                /**
                 * Removes the ith "SelfAct" element
                 */
                void removeSelfAct(int i);
                
                /**
                 * Gets a List of "DirectAct" elements
                 */
                java.util.List<de.affect.xml.DirectActType> getDirectActList();
                
                /**
                 * Gets array of all "DirectAct" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.DirectActType[] getDirectActArray();
                
                /**
                 * Gets ith "DirectAct" element
                 */
                de.affect.xml.DirectActType getDirectActArray(int i);
                
                /**
                 * Returns number of "DirectAct" element
                 */
                int sizeOfDirectActArray();
                
                /**
                 * Sets array of all "DirectAct" element
                 */
                void setDirectActArray(de.affect.xml.DirectActType[] directActArray);
                
                /**
                 * Sets ith "DirectAct" element
                 */
                void setDirectActArray(int i, de.affect.xml.DirectActType directAct);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "DirectAct" element
                 */
                de.affect.xml.DirectActType insertNewDirectAct(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "DirectAct" element
                 */
                de.affect.xml.DirectActType addNewDirectAct();
                
                /**
                 * Removes the ith "DirectAct" element
                 */
                void removeDirectAct(int i);
                
                /**
                 * Gets a List of "IndirectAct" elements
                 */
                java.util.List<de.affect.xml.IndirectActType> getIndirectActList();
                
                /**
                 * Gets array of all "IndirectAct" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.IndirectActType[] getIndirectActArray();
                
                /**
                 * Gets ith "IndirectAct" element
                 */
                de.affect.xml.IndirectActType getIndirectActArray(int i);
                
                /**
                 * Returns number of "IndirectAct" element
                 */
                int sizeOfIndirectActArray();
                
                /**
                 * Sets array of all "IndirectAct" element
                 */
                void setIndirectActArray(de.affect.xml.IndirectActType[] indirectActArray);
                
                /**
                 * Sets ith "IndirectAct" element
                 */
                void setIndirectActArray(int i, de.affect.xml.IndirectActType indirectAct);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectAct" element
                 */
                de.affect.xml.IndirectActType insertNewIndirectAct(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectAct" element
                 */
                de.affect.xml.IndirectActType addNewIndirectAct();
                
                /**
                 * Removes the ith "IndirectAct" element
                 */
                void removeIndirectAct(int i);
                
                /**
                 * Gets a List of "SelfEmotion" elements
                 */
                java.util.List<de.affect.xml.SelfEmotionType> getSelfEmotionList();
                
                /**
                 * Gets array of all "SelfEmotion" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.SelfEmotionType[] getSelfEmotionArray();
                
                /**
                 * Gets ith "SelfEmotion" element
                 */
                de.affect.xml.SelfEmotionType getSelfEmotionArray(int i);
                
                /**
                 * Returns number of "SelfEmotion" element
                 */
                int sizeOfSelfEmotionArray();
                
                /**
                 * Sets array of all "SelfEmotion" element
                 */
                void setSelfEmotionArray(de.affect.xml.SelfEmotionType[] selfEmotionArray);
                
                /**
                 * Sets ith "SelfEmotion" element
                 */
                void setSelfEmotionArray(int i, de.affect.xml.SelfEmotionType selfEmotion);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SelfEmotion" element
                 */
                de.affect.xml.SelfEmotionType insertNewSelfEmotion(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SelfEmotion" element
                 */
                de.affect.xml.SelfEmotionType addNewSelfEmotion();
                
                /**
                 * Removes the ith "SelfEmotion" element
                 */
                void removeSelfEmotion(int i);
                
                /**
                 * Gets a List of "IndirectEmotion" elements
                 */
                java.util.List<de.affect.xml.IndirectEmotionType> getIndirectEmotionList();
                
                /**
                 * Gets array of all "IndirectEmotion" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.IndirectEmotionType[] getIndirectEmotionArray();
                
                /**
                 * Gets ith "IndirectEmotion" element
                 */
                de.affect.xml.IndirectEmotionType getIndirectEmotionArray(int i);
                
                /**
                 * Returns number of "IndirectEmotion" element
                 */
                int sizeOfIndirectEmotionArray();
                
                /**
                 * Sets array of all "IndirectEmotion" element
                 */
                void setIndirectEmotionArray(de.affect.xml.IndirectEmotionType[] indirectEmotionArray);
                
                /**
                 * Sets ith "IndirectEmotion" element
                 */
                void setIndirectEmotionArray(int i, de.affect.xml.IndirectEmotionType indirectEmotion);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectEmotion" element
                 */
                de.affect.xml.IndirectEmotionType insertNewIndirectEmotion(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectEmotion" element
                 */
                de.affect.xml.IndirectEmotionType addNewIndirectEmotion();
                
                /**
                 * Removes the ith "IndirectEmotion" element
                 */
                void removeIndirectEmotion(int i);
                
                /**
                 * Gets a List of "SelfMood" elements
                 */
                java.util.List<de.affect.xml.SelfMoodType> getSelfMoodList();
                
                /**
                 * Gets array of all "SelfMood" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.SelfMoodType[] getSelfMoodArray();
                
                /**
                 * Gets ith "SelfMood" element
                 */
                de.affect.xml.SelfMoodType getSelfMoodArray(int i);
                
                /**
                 * Returns number of "SelfMood" element
                 */
                int sizeOfSelfMoodArray();
                
                /**
                 * Sets array of all "SelfMood" element
                 */
                void setSelfMoodArray(de.affect.xml.SelfMoodType[] selfMoodArray);
                
                /**
                 * Sets ith "SelfMood" element
                 */
                void setSelfMoodArray(int i, de.affect.xml.SelfMoodType selfMood);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SelfMood" element
                 */
                de.affect.xml.SelfMoodType insertNewSelfMood(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SelfMood" element
                 */
                de.affect.xml.SelfMoodType addNewSelfMood();
                
                /**
                 * Removes the ith "SelfMood" element
                 */
                void removeSelfMood(int i);
                
                /**
                 * Gets a List of "IndirectMood" elements
                 */
                java.util.List<de.affect.xml.IndirectMoodType> getIndirectMoodList();
                
                /**
                 * Gets array of all "IndirectMood" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.IndirectMoodType[] getIndirectMoodArray();
                
                /**
                 * Gets ith "IndirectMood" element
                 */
                de.affect.xml.IndirectMoodType getIndirectMoodArray(int i);
                
                /**
                 * Returns number of "IndirectMood" element
                 */
                int sizeOfIndirectMoodArray();
                
                /**
                 * Sets array of all "IndirectMood" element
                 */
                void setIndirectMoodArray(de.affect.xml.IndirectMoodType[] indirectMoodArray);
                
                /**
                 * Sets ith "IndirectMood" element
                 */
                void setIndirectMoodArray(int i, de.affect.xml.IndirectMoodType indirectMood);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectMood" element
                 */
                de.affect.xml.IndirectMoodType insertNewIndirectMood(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectMood" element
                 */
                de.affect.xml.IndirectMoodType addNewIndirectMood();
                
                /**
                 * Removes the ith "IndirectMood" element
                 */
                void removeIndirectMood(int i);
                
                /**
                 * Gets the "internalAffectAppraisal" attribute
                 */
                boolean getInternalAffectAppraisal();
                
                /**
                 * Gets (as xml) the "internalAffectAppraisal" attribute
                 */
                org.apache.xmlbeans.XmlBoolean xgetInternalAffectAppraisal();
                
                /**
                 * True if has "internalAffectAppraisal" attribute
                 */
                boolean isSetInternalAffectAppraisal();
                
                /**
                 * Sets the "internalAffectAppraisal" attribute
                 */
                void setInternalAffectAppraisal(boolean internalAffectAppraisal);
                
                /**
                 * Sets (as xml) the "internalAffectAppraisal" attribute
                 */
                void xsetInternalAffectAppraisal(org.apache.xmlbeans.XmlBoolean internalAffectAppraisal);
                
                /**
                 * Unsets the "internalAffectAppraisal" attribute
                 */
                void unsetInternalAffectAppraisal();
                
                /**
                 * An XML Basic(@xml.affect.de).
                 *
                 * This is a complex type.
                 */
                public interface Basic extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Basic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("basic0495elemtype");
                    
                    /**
                     * Gets the "GoodEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent getGoodEvent();
                    
                    /**
                     * Sets the "GoodEvent" element
                     */
                    void setGoodEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent goodEvent);
                    
                    /**
                     * Appends and returns a new empty "GoodEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent addNewGoodEvent();
                    
                    /**
                     * Gets the "GoodEventForGoodOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther getGoodEventForGoodOther();
                    
                    /**
                     * Sets the "GoodEventForGoodOther" element
                     */
                    void setGoodEventForGoodOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther goodEventForGoodOther);
                    
                    /**
                     * Appends and returns a new empty "GoodEventForGoodOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther addNewGoodEventForGoodOther();
                    
                    /**
                     * Gets the "GoodEventForBadOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther getGoodEventForBadOther();
                    
                    /**
                     * Sets the "GoodEventForBadOther" element
                     */
                    void setGoodEventForBadOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther goodEventForBadOther);
                    
                    /**
                     * Appends and returns a new empty "GoodEventForBadOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther addNewGoodEventForBadOther();
                    
                    /**
                     * Gets the "BadEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent getBadEvent();
                    
                    /**
                     * Sets the "BadEvent" element
                     */
                    void setBadEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent badEvent);
                    
                    /**
                     * Appends and returns a new empty "BadEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent addNewBadEvent();
                    
                    /**
                     * Gets the "BadEventForGoodOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther getBadEventForGoodOther();
                    
                    /**
                     * Sets the "BadEventForGoodOther" element
                     */
                    void setBadEventForGoodOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther badEventForGoodOther);
                    
                    /**
                     * Appends and returns a new empty "BadEventForGoodOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther addNewBadEventForGoodOther();
                    
                    /**
                     * Gets the "BadEventForBadOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther getBadEventForBadOther();
                    
                    /**
                     * Sets the "BadEventForBadOther" element
                     */
                    void setBadEventForBadOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther badEventForBadOther);
                    
                    /**
                     * Appends and returns a new empty "BadEventForBadOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther addNewBadEventForBadOther();
                    
                    /**
                     * Gets the "GoodLikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent getGoodLikelyFutureEvent();
                    
                    /**
                     * Sets the "GoodLikelyFutureEvent" element
                     */
                    void setGoodLikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent goodLikelyFutureEvent);
                    
                    /**
                     * Appends and returns a new empty "GoodLikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent addNewGoodLikelyFutureEvent();
                    
                    /**
                     * Gets the "GoodUnlikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent getGoodUnlikelyFutureEvent();
                    
                    /**
                     * Sets the "GoodUnlikelyFutureEvent" element
                     */
                    void setGoodUnlikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent goodUnlikelyFutureEvent);
                    
                    /**
                     * Appends and returns a new empty "GoodUnlikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent addNewGoodUnlikelyFutureEvent();
                    
                    /**
                     * Gets the "BadLikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent getBadLikelyFutureEvent();
                    
                    /**
                     * Sets the "BadLikelyFutureEvent" element
                     */
                    void setBadLikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent badLikelyFutureEvent);
                    
                    /**
                     * Appends and returns a new empty "BadLikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent addNewBadLikelyFutureEvent();
                    
                    /**
                     * Gets the "BadUnlikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent getBadUnlikelyFutureEvent();
                    
                    /**
                     * Sets the "BadUnlikelyFutureEvent" element
                     */
                    void setBadUnlikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent badUnlikelyFutureEvent);
                    
                    /**
                     * Appends and returns a new empty "BadUnlikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent addNewBadUnlikelyFutureEvent();
                    
                    /**
                     * Gets the "EventConfirmed" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed getEventConfirmed();
                    
                    /**
                     * Sets the "EventConfirmed" element
                     */
                    void setEventConfirmed(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed eventConfirmed);
                    
                    /**
                     * Appends and returns a new empty "EventConfirmed" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed addNewEventConfirmed();
                    
                    /**
                     * Gets the "EventDisconfirmed" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed getEventDisconfirmed();
                    
                    /**
                     * Sets the "EventDisconfirmed" element
                     */
                    void setEventDisconfirmed(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed eventDisconfirmed);
                    
                    /**
                     * Appends and returns a new empty "EventDisconfirmed" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed addNewEventDisconfirmed();
                    
                    /**
                     * Gets the "GoodActSelf" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf getGoodActSelf();
                    
                    /**
                     * Sets the "GoodActSelf" element
                     */
                    void setGoodActSelf(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf goodActSelf);
                    
                    /**
                     * Appends and returns a new empty "GoodActSelf" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf addNewGoodActSelf();
                    
                    /**
                     * Gets the "GoodActOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther getGoodActOther();
                    
                    /**
                     * Sets the "GoodActOther" element
                     */
                    void setGoodActOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther goodActOther);
                    
                    /**
                     * Appends and returns a new empty "GoodActOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther addNewGoodActOther();
                    
                    /**
                     * Gets the "BadActSelf" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf getBadActSelf();
                    
                    /**
                     * Sets the "BadActSelf" element
                     */
                    void setBadActSelf(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf badActSelf);
                    
                    /**
                     * Appends and returns a new empty "BadActSelf" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf addNewBadActSelf();
                    
                    /**
                     * Gets the "BadActOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther getBadActOther();
                    
                    /**
                     * Sets the "BadActOther" element
                     */
                    void setBadActOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther badActOther);
                    
                    /**
                     * Appends and returns a new empty "BadActOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther addNewBadActOther();
                    
                    /**
                     * Gets the "NiceThing" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing getNiceThing();
                    
                    /**
                     * Sets the "NiceThing" element
                     */
                    void setNiceThing(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing niceThing);
                    
                    /**
                     * Appends and returns a new empty "NiceThing" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing addNewNiceThing();
                    
                    /**
                     * Gets the "NastyThing" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing getNastyThing();
                    
                    /**
                     * Sets the "NastyThing" element
                     */
                    void setNastyThing(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing nastyThing);
                    
                    /**
                     * Appends and returns a new empty "NastyThing" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing addNewNastyThing();
                    
                    /**
                     * An XML GoodEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodevent9d7eelemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodEventForGoodOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodEventForGoodOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodEventForGoodOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodeventforgoodotherb328elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      java.lang.String getLiking();
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      de.affect.xml.Liking xgetLiking();
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      void setLiking(java.lang.String liking);
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      void xsetLiking(de.affect.xml.Liking liking);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodEventForBadOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodEventForBadOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodEventForBadOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodeventforbadother0d68elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      java.lang.String getLiking();
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      de.affect.xml.Disliking xgetLiking();
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      void setLiking(java.lang.String liking);
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      void xsetLiking(de.affect.xml.Disliking liking);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badeventdfa6elemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadEventForGoodOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadEventForGoodOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadEventForGoodOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badeventforgoodotherf950elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      java.lang.String getLiking();
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      de.affect.xml.Liking xgetLiking();
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      void setLiking(java.lang.String liking);
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      void xsetLiking(de.affect.xml.Liking liking);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadEventForBadOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadEventForBadOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadEventForBadOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badeventforbadother6240elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      java.lang.String getLiking();
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      de.affect.xml.Disliking xgetLiking();
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      void setLiking(java.lang.String liking);
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      void xsetLiking(de.affect.xml.Disliking liking);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodLikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodLikelyFutureEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodLikelyFutureEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodlikelyfutureeventd9b7elemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      java.lang.String getLikelihood();
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      de.affect.xml.Likelihood xgetLikelihood();
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      void setLikelihood(java.lang.String likelihood);
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      void xsetLikelihood(de.affect.xml.Likelihood likelihood);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodUnlikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodUnlikelyFutureEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodUnlikelyFutureEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodunlikelyfutureeventa6beelemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      java.lang.String getLikelihood();
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      de.affect.xml.Unlikelihood xgetLikelihood();
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      void setLikelihood(java.lang.String likelihood);
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      void xsetLikelihood(de.affect.xml.Unlikelihood likelihood);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadLikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadLikelyFutureEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadLikelyFutureEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badlikelyfutureevent1fdfelemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      java.lang.String getLikelihood();
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      de.affect.xml.Likelihood xgetLikelihood();
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      void setLikelihood(java.lang.String likelihood);
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      void xsetLikelihood(de.affect.xml.Likelihood likelihood);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadUnlikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadUnlikelyFutureEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadUnlikelyFutureEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badunlikelyfutureevent02e6elemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      java.lang.String getLikelihood();
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      de.affect.xml.Unlikelihood xgetLikelihood();
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      void setLikelihood(java.lang.String likelihood);
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      void xsetLikelihood(de.affect.xml.Unlikelihood likelihood);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML EventConfirmed(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface EventConfirmed extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventConfirmed.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("eventconfirmed2df6elemtype");
                      
                      /**
                       * Gets the "realization" attribute
                       */
                      java.lang.String getRealization();
                      
                      /**
                       * Gets (as xml) the "realization" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetRealization();
                      
                      /**
                       * Sets the "realization" attribute
                       */
                      void setRealization(java.lang.String realization);
                      
                      /**
                       * Sets (as xml) the "realization" attribute
                       */
                      void xsetRealization(org.apache.xmlbeans.XmlString realization);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML EventDisconfirmed(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface EventDisconfirmed extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventDisconfirmed.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("eventdisconfirmedd66celemtype");
                      
                      /**
                       * Gets the "realization" attribute
                       */
                      java.lang.String getRealization();
                      
                      /**
                       * Gets (as xml) the "realization" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetRealization();
                      
                      /**
                       * Sets the "realization" attribute
                       */
                      void setRealization(java.lang.String realization);
                      
                      /**
                       * Sets (as xml) the "realization" attribute
                       */
                      void xsetRealization(org.apache.xmlbeans.XmlString realization);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodActSelf(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodActSelf extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodActSelf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodactselff222elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      java.lang.String getPraiseworthiness();
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      de.affect.xml.Praiseworthiness xgetPraiseworthiness();
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      void setPraiseworthiness(java.lang.String praiseworthiness);
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      void xsetPraiseworthiness(de.affect.xml.Praiseworthiness praiseworthiness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodActOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodActOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodActOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodactother980celemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      java.lang.String getPraiseworthiness();
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      de.affect.xml.Praiseworthiness xgetPraiseworthiness();
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      void setPraiseworthiness(java.lang.String praiseworthiness);
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      void xsetPraiseworthiness(de.affect.xml.Praiseworthiness praiseworthiness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadActSelf(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadActSelf extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadActSelf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badactself4a4aelemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      java.lang.String getPraiseworthiness();
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      de.affect.xml.Blameworthiness xgetPraiseworthiness();
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      void setPraiseworthiness(java.lang.String praiseworthiness);
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      void xsetPraiseworthiness(de.affect.xml.Blameworthiness praiseworthiness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadActOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadActOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadActOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badactother44e4elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      java.lang.String getPraiseworthiness();
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      de.affect.xml.Blameworthiness xgetPraiseworthiness();
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      void setPraiseworthiness(java.lang.String praiseworthiness);
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      void xsetPraiseworthiness(de.affect.xml.Blameworthiness praiseworthiness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML NiceThing(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface NiceThing extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NiceThing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("nicething2432elemtype");
                      
                      /**
                       * Gets the "appealingness" attribute
                       */
                      java.lang.String getAppealingness();
                      
                      /**
                       * Gets (as xml) the "appealingness" attribute
                       */
                      de.affect.xml.Appealingness xgetAppealingness();
                      
                      /**
                       * Sets the "appealingness" attribute
                       */
                      void setAppealingness(java.lang.String appealingness);
                      
                      /**
                       * Sets (as xml) the "appealingness" attribute
                       */
                      void xsetAppealingness(de.affect.xml.Appealingness appealingness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML NastyThing(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface NastyThing extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NastyThing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("nastything9b5aelemtype");
                      
                      /**
                       * Gets the "appealingness" attribute
                       */
                      java.lang.String getAppealingness();
                      
                      /**
                       * Gets (as xml) the "appealingness" attribute
                       */
                      de.affect.xml.Disappealingness xgetAppealingness();
                      
                      /**
                       * Sets the "appealingness" attribute
                       */
                      void setAppealingness(java.lang.String appealingness);
                      
                      /**
                       * Sets (as xml) the "appealingness" attribute
                       */
                      void xsetAppealingness(de.affect.xml.Disappealingness appealingness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal newInstance() {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML name(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$Name.
             */
            public interface Name extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("named095attrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name newValue(java.lang.Object obj) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name) type.newValue( obj ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name newInstance() {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect newInstance() {
                  return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML GroupAffect(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface GroupAffect extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupAffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("groupaffecta800elemtype");
            
            /**
             * Gets the "MoodSpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification getMoodSpecification();
            
            /**
             * Sets the "MoodSpecification" element
             */
            void setMoodSpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification moodSpecification);
            
            /**
             * Appends and returns a new empty "MoodSpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification addNewMoodSpecification();
            
            /**
             * Gets the "EmotionSpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification getEmotionSpecification();
            
            /**
             * Sets the "EmotionSpecification" element
             */
            void setEmotionSpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification emotionSpecification);
            
            /**
             * Appends and returns a new empty "EmotionSpecification" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification addNewEmotionSpecification();
            
            /**
             * Gets the "Appraisal" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal getAppraisal();
            
            /**
             * True if has "Appraisal" element
             */
            boolean isSetAppraisal();
            
            /**
             * Sets the "Appraisal" element
             */
            void setAppraisal(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal appraisal);
            
            /**
             * Appends and returns a new empty "Appraisal" element
             */
            de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal addNewAppraisal();
            
            /**
             * Unsets the "Appraisal" element
             */
            void unsetAppraisal();
            
            /**
             * Gets the "name" attribute
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * Sets the "name" attribute
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" attribute
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Gets the "characters" attribute
             */
            java.lang.String getCharacters();
            
            /**
             * Gets (as xml) the "characters" attribute
             */
            org.apache.xmlbeans.XmlString xgetCharacters();
            
            /**
             * Sets the "characters" attribute
             */
            void setCharacters(java.lang.String characters);
            
            /**
             * Sets (as xml) the "characters" attribute
             */
            void xsetCharacters(org.apache.xmlbeans.XmlString characters);
            
            /**
             * Gets the "monitored" attribute
             */
            boolean getMonitored();
            
            /**
             * Gets (as xml) the "monitored" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetMonitored();
            
            /**
             * True if has "monitored" attribute
             */
            boolean isSetMonitored();
            
            /**
             * Sets the "monitored" attribute
             */
            void setMonitored(boolean monitored);
            
            /**
             * Sets (as xml) the "monitored" attribute
             */
            void xsetMonitored(org.apache.xmlbeans.XmlBoolean monitored);
            
            /**
             * Unsets the "monitored" attribute
             */
            void unsetMonitored();
            
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
             * An XML MoodSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface MoodSpecification extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoodSpecification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("moodspecification5b98elemtype");
                
                /**
                 * Gets the "decaytime" attribute
                 */
                long getDecaytime();
                
                /**
                 * Gets (as xml) the "decaytime" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime xgetDecaytime();
                
                /**
                 * Sets the "decaytime" attribute
                 */
                void setDecaytime(long decaytime);
                
                /**
                 * Sets (as xml) the "decaytime" attribute
                 */
                void xsetDecaytime(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime decaytime);
                
                /**
                 * Gets the "decayperiod" attribute
                 */
                int getDecayperiod();
                
                /**
                 * Gets (as xml) the "decayperiod" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod xgetDecayperiod();
                
                /**
                 * Sets the "decayperiod" attribute
                 */
                void setDecayperiod(int decayperiod);
                
                /**
                 * Sets (as xml) the "decayperiod" attribute
                 */
                void xsetDecayperiod(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod decayperiod);
                
                /**
                 * An XML decaytime(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$MoodSpecification$Decaytime.
                 */
                public interface Decaytime extends org.apache.xmlbeans.XmlLong
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decaytime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decaytime4b47attrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML decayperiod(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$MoodSpecification$Decayperiod.
                 */
                public interface Decayperiod extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decayperiod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decayperiodefbbattrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification newInstance() {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML EmotionSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface EmotionSpecification extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmotionSpecification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("emotionspecificationcc24elemtype");
                
                /**
                 * Gets the "decaytime" attribute
                 */
                long getDecaytime();
                
                /**
                 * Gets (as xml) the "decaytime" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime xgetDecaytime();
                
                /**
                 * Sets the "decaytime" attribute
                 */
                void setDecaytime(long decaytime);
                
                /**
                 * Sets (as xml) the "decaytime" attribute
                 */
                void xsetDecaytime(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime decaytime);
                
                /**
                 * Gets the "decayperiod" attribute
                 */
                int getDecayperiod();
                
                /**
                 * Gets (as xml) the "decayperiod" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod xgetDecayperiod();
                
                /**
                 * Sets the "decayperiod" attribute
                 */
                void setDecayperiod(int decayperiod);
                
                /**
                 * Sets (as xml) the "decayperiod" attribute
                 */
                void xsetDecayperiod(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod decayperiod);
                
                /**
                 * Gets the "decayfunction" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction.Enum getDecayfunction();
                
                /**
                 * Gets (as xml) the "decayfunction" attribute
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction xgetDecayfunction();
                
                /**
                 * Sets the "decayfunction" attribute
                 */
                void setDecayfunction(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction.Enum decayfunction);
                
                /**
                 * Sets (as xml) the "decayfunction" attribute
                 */
                void xsetDecayfunction(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction decayfunction);
                
                /**
                 * An XML decaytime(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$EmotionSpecification$Decaytime.
                 */
                public interface Decaytime extends org.apache.xmlbeans.XmlLong
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decaytime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decaytime0a15attrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML decayperiod(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$EmotionSpecification$Decayperiod.
                 */
                public interface Decayperiod extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decayperiod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decayperioda121attrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML decayfunction(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$EmotionSpecification$Decayfunction.
                 */
                public interface Decayfunction extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Decayfunction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("decayfunctiond26aattrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum LINEAR = Enum.forString("linear");
                    static final Enum EXPONENTIAL = Enum.forString("exponential");
                    static final Enum HYPERBOLIC = Enum.forString("hyperbolic");
                    
                    static final int INT_LINEAR = Enum.INT_LINEAR;
                    static final int INT_EXPONENTIAL = Enum.INT_EXPONENTIAL;
                    static final int INT_HYPERBOLIC = Enum.INT_HYPERBOLIC;
                    
                    /**
                     * Enumeration value class for de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$EmotionSpecification$Decayfunction.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_LINEAR
                     * Enum.forString(s); // returns the enum value for a string
                     * Enum.forInt(i); // returns the enum value for an int
                     * </pre>
                     * Enumeration objects are immutable singleton objects that
                     * can be compared using == object equality. They have no
                     * public constructor. See the constants defined within this
                     * class for all the valid values.
                     */
                    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                    {
                      /**
                       * Returns the enum value for a string, or null if none.
                       */
                      public static Enum forString(java.lang.String s)
                          { return (Enum)table.forString(s); }
                      /**
                       * Returns the enum value corresponding to an int, or null if none.
                       */
                      public static Enum forInt(int i)
                          { return (Enum)table.forInt(i); }
                      
                      private Enum(java.lang.String s, int i)
                          { super(s, i); }
                      
                      static final int INT_LINEAR = 1;
                      static final int INT_EXPONENTIAL = 2;
                      static final int INT_HYPERBOLIC = 3;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("linear", INT_LINEAR),
                          new Enum("exponential", INT_EXPONENTIAL),
                          new Enum("hyperbolic", INT_HYPERBOLIC),
                        }
                      );
                      private static final long serialVersionUID = 1L;
                      private java.lang.Object readResolve() { return forInt(intValue()); } 
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification newInstance() {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Appraisal(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface Appraisal extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Appraisal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("appraisalccf1elemtype");
                
                /**
                 * Gets the "Basic" element
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic getBasic();
                
                /**
                 * Sets the "Basic" element
                 */
                void setBasic(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic basic);
                
                /**
                 * Appends and returns a new empty "Basic" element
                 */
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic addNewBasic();
                
                /**
                 * Gets a List of "IndirectAct" elements
                 */
                java.util.List<de.affect.xml.IndirectActType> getIndirectActList();
                
                /**
                 * Gets array of all "IndirectAct" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.IndirectActType[] getIndirectActArray();
                
                /**
                 * Gets ith "IndirectAct" element
                 */
                de.affect.xml.IndirectActType getIndirectActArray(int i);
                
                /**
                 * Returns number of "IndirectAct" element
                 */
                int sizeOfIndirectActArray();
                
                /**
                 * Sets array of all "IndirectAct" element
                 */
                void setIndirectActArray(de.affect.xml.IndirectActType[] indirectActArray);
                
                /**
                 * Sets ith "IndirectAct" element
                 */
                void setIndirectActArray(int i, de.affect.xml.IndirectActType indirectAct);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectAct" element
                 */
                de.affect.xml.IndirectActType insertNewIndirectAct(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectAct" element
                 */
                de.affect.xml.IndirectActType addNewIndirectAct();
                
                /**
                 * Removes the ith "IndirectAct" element
                 */
                void removeIndirectAct(int i);
                
                /**
                 * Gets a List of "IndirectEmotion" elements
                 */
                java.util.List<de.affect.xml.IndirectEmotionType> getIndirectEmotionList();
                
                /**
                 * Gets array of all "IndirectEmotion" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.IndirectEmotionType[] getIndirectEmotionArray();
                
                /**
                 * Gets ith "IndirectEmotion" element
                 */
                de.affect.xml.IndirectEmotionType getIndirectEmotionArray(int i);
                
                /**
                 * Returns number of "IndirectEmotion" element
                 */
                int sizeOfIndirectEmotionArray();
                
                /**
                 * Sets array of all "IndirectEmotion" element
                 */
                void setIndirectEmotionArray(de.affect.xml.IndirectEmotionType[] indirectEmotionArray);
                
                /**
                 * Sets ith "IndirectEmotion" element
                 */
                void setIndirectEmotionArray(int i, de.affect.xml.IndirectEmotionType indirectEmotion);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectEmotion" element
                 */
                de.affect.xml.IndirectEmotionType insertNewIndirectEmotion(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectEmotion" element
                 */
                de.affect.xml.IndirectEmotionType addNewIndirectEmotion();
                
                /**
                 * Removes the ith "IndirectEmotion" element
                 */
                void removeIndirectEmotion(int i);
                
                /**
                 * Gets a List of "IndirectMood" elements
                 */
                java.util.List<de.affect.xml.IndirectMoodType> getIndirectMoodList();
                
                /**
                 * Gets array of all "IndirectMood" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.IndirectMoodType[] getIndirectMoodArray();
                
                /**
                 * Gets ith "IndirectMood" element
                 */
                de.affect.xml.IndirectMoodType getIndirectMoodArray(int i);
                
                /**
                 * Returns number of "IndirectMood" element
                 */
                int sizeOfIndirectMoodArray();
                
                /**
                 * Sets array of all "IndirectMood" element
                 */
                void setIndirectMoodArray(de.affect.xml.IndirectMoodType[] indirectMoodArray);
                
                /**
                 * Sets ith "IndirectMood" element
                 */
                void setIndirectMoodArray(int i, de.affect.xml.IndirectMoodType indirectMood);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectMood" element
                 */
                de.affect.xml.IndirectMoodType insertNewIndirectMood(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectMood" element
                 */
                de.affect.xml.IndirectMoodType addNewIndirectMood();
                
                /**
                 * Removes the ith "IndirectMood" element
                 */
                void removeIndirectMood(int i);
                
                /**
                 * An XML Basic(@xml.affect.de).
                 *
                 * This is a complex type.
                 */
                public interface Basic extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Basic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("basic99ebelemtype");
                    
                    /**
                     * Gets the "GoodEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent getGoodEvent();
                    
                    /**
                     * Sets the "GoodEvent" element
                     */
                    void setGoodEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent goodEvent);
                    
                    /**
                     * Appends and returns a new empty "GoodEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent addNewGoodEvent();
                    
                    /**
                     * Gets the "GoodEventForGoodOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther getGoodEventForGoodOther();
                    
                    /**
                     * Sets the "GoodEventForGoodOther" element
                     */
                    void setGoodEventForGoodOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther goodEventForGoodOther);
                    
                    /**
                     * Appends and returns a new empty "GoodEventForGoodOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther addNewGoodEventForGoodOther();
                    
                    /**
                     * Gets the "GoodEventForBadOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther getGoodEventForBadOther();
                    
                    /**
                     * Sets the "GoodEventForBadOther" element
                     */
                    void setGoodEventForBadOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther goodEventForBadOther);
                    
                    /**
                     * Appends and returns a new empty "GoodEventForBadOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther addNewGoodEventForBadOther();
                    
                    /**
                     * Gets the "BadEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent getBadEvent();
                    
                    /**
                     * Sets the "BadEvent" element
                     */
                    void setBadEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent badEvent);
                    
                    /**
                     * Appends and returns a new empty "BadEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent addNewBadEvent();
                    
                    /**
                     * Gets the "BadEventForGoodOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther getBadEventForGoodOther();
                    
                    /**
                     * Sets the "BadEventForGoodOther" element
                     */
                    void setBadEventForGoodOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther badEventForGoodOther);
                    
                    /**
                     * Appends and returns a new empty "BadEventForGoodOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther addNewBadEventForGoodOther();
                    
                    /**
                     * Gets the "BadEventForBadOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther getBadEventForBadOther();
                    
                    /**
                     * Sets the "BadEventForBadOther" element
                     */
                    void setBadEventForBadOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther badEventForBadOther);
                    
                    /**
                     * Appends and returns a new empty "BadEventForBadOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther addNewBadEventForBadOther();
                    
                    /**
                     * Gets the "GoodLikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent getGoodLikelyFutureEvent();
                    
                    /**
                     * Sets the "GoodLikelyFutureEvent" element
                     */
                    void setGoodLikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent goodLikelyFutureEvent);
                    
                    /**
                     * Appends and returns a new empty "GoodLikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent addNewGoodLikelyFutureEvent();
                    
                    /**
                     * Gets the "GoodUnlikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent getGoodUnlikelyFutureEvent();
                    
                    /**
                     * Sets the "GoodUnlikelyFutureEvent" element
                     */
                    void setGoodUnlikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent goodUnlikelyFutureEvent);
                    
                    /**
                     * Appends and returns a new empty "GoodUnlikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent addNewGoodUnlikelyFutureEvent();
                    
                    /**
                     * Gets the "BadLikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent getBadLikelyFutureEvent();
                    
                    /**
                     * Sets the "BadLikelyFutureEvent" element
                     */
                    void setBadLikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent badLikelyFutureEvent);
                    
                    /**
                     * Appends and returns a new empty "BadLikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent addNewBadLikelyFutureEvent();
                    
                    /**
                     * Gets the "BadUnlikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent getBadUnlikelyFutureEvent();
                    
                    /**
                     * Sets the "BadUnlikelyFutureEvent" element
                     */
                    void setBadUnlikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent badUnlikelyFutureEvent);
                    
                    /**
                     * Appends and returns a new empty "BadUnlikelyFutureEvent" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent addNewBadUnlikelyFutureEvent();
                    
                    /**
                     * Gets the "EventConfirmed" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed getEventConfirmed();
                    
                    /**
                     * Sets the "EventConfirmed" element
                     */
                    void setEventConfirmed(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed eventConfirmed);
                    
                    /**
                     * Appends and returns a new empty "EventConfirmed" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed addNewEventConfirmed();
                    
                    /**
                     * Gets the "EventDisconfirmed" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed getEventDisconfirmed();
                    
                    /**
                     * Sets the "EventDisconfirmed" element
                     */
                    void setEventDisconfirmed(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed eventDisconfirmed);
                    
                    /**
                     * Appends and returns a new empty "EventDisconfirmed" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed addNewEventDisconfirmed();
                    
                    /**
                     * Gets the "GoodActSelf" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf getGoodActSelf();
                    
                    /**
                     * Sets the "GoodActSelf" element
                     */
                    void setGoodActSelf(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf goodActSelf);
                    
                    /**
                     * Appends and returns a new empty "GoodActSelf" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf addNewGoodActSelf();
                    
                    /**
                     * Gets the "GoodActOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther getGoodActOther();
                    
                    /**
                     * Sets the "GoodActOther" element
                     */
                    void setGoodActOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther goodActOther);
                    
                    /**
                     * Appends and returns a new empty "GoodActOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther addNewGoodActOther();
                    
                    /**
                     * Gets the "BadActSelf" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf getBadActSelf();
                    
                    /**
                     * Sets the "BadActSelf" element
                     */
                    void setBadActSelf(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf badActSelf);
                    
                    /**
                     * Appends and returns a new empty "BadActSelf" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf addNewBadActSelf();
                    
                    /**
                     * Gets the "BadActOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther getBadActOther();
                    
                    /**
                     * Sets the "BadActOther" element
                     */
                    void setBadActOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther badActOther);
                    
                    /**
                     * Appends and returns a new empty "BadActOther" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther addNewBadActOther();
                    
                    /**
                     * Gets the "NiceThing" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing getNiceThing();
                    
                    /**
                     * Sets the "NiceThing" element
                     */
                    void setNiceThing(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing niceThing);
                    
                    /**
                     * Appends and returns a new empty "NiceThing" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing addNewNiceThing();
                    
                    /**
                     * Gets the "NastyThing" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing getNastyThing();
                    
                    /**
                     * Sets the "NastyThing" element
                     */
                    void setNastyThing(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing nastyThing);
                    
                    /**
                     * Appends and returns a new empty "NastyThing" element
                     */
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing addNewNastyThing();
                    
                    /**
                     * An XML GoodEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodevent0f54elemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodEventForGoodOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodEventForGoodOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodEventForGoodOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodeventforgoodother89feelemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      java.lang.String getLiking();
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      de.affect.xml.Liking xgetLiking();
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      void setLiking(java.lang.String liking);
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      void xsetLiking(de.affect.xml.Liking liking);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodEventForBadOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodEventForBadOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodEventForBadOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodeventforbadother043eelemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      java.lang.String getLiking();
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      de.affect.xml.Disliking xgetLiking();
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      void setLiking(java.lang.String liking);
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      void xsetLiking(de.affect.xml.Disliking liking);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badeventa57celemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadEventForGoodOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadEventForGoodOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadEventForGoodOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badeventforgoodother2426elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      java.lang.String getLiking();
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      de.affect.xml.Liking xgetLiking();
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      void setLiking(java.lang.String liking);
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      void xsetLiking(de.affect.xml.Liking liking);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadEventForBadOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadEventForBadOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadEventForBadOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badeventforbadother8516elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      java.lang.String getLiking();
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      de.affect.xml.Disliking xgetLiking();
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      void setLiking(java.lang.String liking);
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      void xsetLiking(de.affect.xml.Disliking liking);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodLikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodLikelyFutureEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodLikelyFutureEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodlikelyfutureevent500delemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      java.lang.String getLikelihood();
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      de.affect.xml.Likelihood xgetLikelihood();
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      void setLikelihood(java.lang.String likelihood);
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      void xsetLikelihood(de.affect.xml.Likelihood likelihood);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodUnlikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodUnlikelyFutureEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodUnlikelyFutureEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodunlikelyfutureeventb894elemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Desirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Desirability desirability);
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      java.lang.String getLikelihood();
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      de.affect.xml.Unlikelihood xgetLikelihood();
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      void setLikelihood(java.lang.String likelihood);
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      void xsetLikelihood(de.affect.xml.Unlikelihood likelihood);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadLikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadLikelyFutureEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadLikelyFutureEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badlikelyfutureeventea35elemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      java.lang.String getLikelihood();
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      de.affect.xml.Likelihood xgetLikelihood();
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      void setLikelihood(java.lang.String likelihood);
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      void xsetLikelihood(de.affect.xml.Likelihood likelihood);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadUnlikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadUnlikelyFutureEvent extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadUnlikelyFutureEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badunlikelyfutureevent68bcelemtype");
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      java.lang.String getDesirability();
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      de.affect.xml.Undesirability xgetDesirability();
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      void setDesirability(java.lang.String desirability);
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      void xsetDesirability(de.affect.xml.Undesirability desirability);
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      java.lang.String getLikelihood();
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      de.affect.xml.Unlikelihood xgetLikelihood();
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      void setLikelihood(java.lang.String likelihood);
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      void xsetLikelihood(de.affect.xml.Unlikelihood likelihood);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML EventConfirmed(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface EventConfirmed extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventConfirmed.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("eventconfirmed9bccelemtype");
                      
                      /**
                       * Gets the "realization" attribute
                       */
                      java.lang.String getRealization();
                      
                      /**
                       * Gets (as xml) the "realization" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetRealization();
                      
                      /**
                       * Sets the "realization" attribute
                       */
                      void setRealization(java.lang.String realization);
                      
                      /**
                       * Sets (as xml) the "realization" attribute
                       */
                      void xsetRealization(org.apache.xmlbeans.XmlString realization);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML EventDisconfirmed(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface EventDisconfirmed extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventDisconfirmed.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("eventdisconfirmedef42elemtype");
                      
                      /**
                       * Gets the "realization" attribute
                       */
                      java.lang.String getRealization();
                      
                      /**
                       * Gets (as xml) the "realization" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetRealization();
                      
                      /**
                       * Sets the "realization" attribute
                       */
                      void setRealization(java.lang.String realization);
                      
                      /**
                       * Sets (as xml) the "realization" attribute
                       */
                      void xsetRealization(org.apache.xmlbeans.XmlString realization);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodActSelf(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodActSelf extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodActSelf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodactself55f8elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      java.lang.String getPraiseworthiness();
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      de.affect.xml.Praiseworthiness xgetPraiseworthiness();
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      void setPraiseworthiness(java.lang.String praiseworthiness);
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      void xsetPraiseworthiness(de.affect.xml.Praiseworthiness praiseworthiness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML GoodActOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface GoodActOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodActOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("goodactother80e2elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      java.lang.String getPraiseworthiness();
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      de.affect.xml.Praiseworthiness xgetPraiseworthiness();
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      void setPraiseworthiness(java.lang.String praiseworthiness);
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      void xsetPraiseworthiness(de.affect.xml.Praiseworthiness praiseworthiness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadActSelf(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadActSelf extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadActSelf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badactself0220elemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      java.lang.String getPraiseworthiness();
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      de.affect.xml.Blameworthiness xgetPraiseworthiness();
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      void setPraiseworthiness(java.lang.String praiseworthiness);
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      void xsetPraiseworthiness(de.affect.xml.Blameworthiness praiseworthiness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML BadActOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface BadActOther extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BadActOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("badactother59baelemtype");
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      java.lang.String getAgency();
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetAgency();
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      void setAgency(java.lang.String agency);
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      void xsetAgency(org.apache.xmlbeans.XmlString agency);
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      java.lang.String getPraiseworthiness();
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      de.affect.xml.Blameworthiness xgetPraiseworthiness();
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      void setPraiseworthiness(java.lang.String praiseworthiness);
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      void xsetPraiseworthiness(de.affect.xml.Blameworthiness praiseworthiness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML NiceThing(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface NiceThing extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NiceThing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("nicething1008elemtype");
                      
                      /**
                       * Gets the "appealingness" attribute
                       */
                      java.lang.String getAppealingness();
                      
                      /**
                       * Gets (as xml) the "appealingness" attribute
                       */
                      de.affect.xml.Appealingness xgetAppealingness();
                      
                      /**
                       * Sets the "appealingness" attribute
                       */
                      void setAppealingness(java.lang.String appealingness);
                      
                      /**
                       * Sets (as xml) the "appealingness" attribute
                       */
                      void xsetAppealingness(de.affect.xml.Appealingness appealingness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML NastyThing(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public interface NastyThing extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NastyThing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("nastything5b30elemtype");
                      
                      /**
                       * Gets the "appealingness" attribute
                       */
                      java.lang.String getAppealingness();
                      
                      /**
                       * Gets (as xml) the "appealingness" attribute
                       */
                      de.affect.xml.Disappealingness xgetAppealingness();
                      
                      /**
                       * Sets the "appealingness" attribute
                       */
                      void setAppealingness(java.lang.String appealingness);
                      
                      /**
                       * Sets (as xml) the "appealingness" attribute
                       */
                      void xsetAppealingness(de.affect.xml.Disappealingness appealingness);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing newInstance() {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic newInstance() {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal newInstance() {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect newInstance() {
                  return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.affect.xml.AffectDefinitionDocument.AffectDefinition newInstance() {
              return (de.affect.xml.AffectDefinitionDocument.AffectDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.affect.xml.AffectDefinitionDocument.AffectDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.affect.xml.AffectDefinitionDocument.AffectDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.affect.xml.AffectDefinitionDocument newInstance() {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.affect.xml.AffectDefinitionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.affect.xml.AffectDefinitionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.affect.xml.AffectDefinitionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.affect.xml.AffectDefinitionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.AffectDefinitionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.AffectDefinitionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.AffectDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
