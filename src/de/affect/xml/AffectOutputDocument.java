/*
 * An XML document type.
 * Localname: AffectOutput
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectOutputDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml;


/**
 * A document containing one AffectOutput(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public interface AffectOutputDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffectOutputDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("affectoutputa9f2doctype");
    
    /**
     * Gets the "AffectOutput" element
     */
    de.affect.xml.AffectOutputDocument.AffectOutput getAffectOutput();
    
    /**
     * Sets the "AffectOutput" element
     */
    void setAffectOutput(de.affect.xml.AffectOutputDocument.AffectOutput affectOutput);
    
    /**
     * Appends and returns a new empty "AffectOutput" element
     */
    de.affect.xml.AffectOutputDocument.AffectOutput addNewAffectOutput();
    
    /**
     * An XML AffectOutput(@xml.affect.de).
     *
     * This is a complex type.
     */
    public interface AffectOutput extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffectOutput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("affectoutput9e00elemtype");
        
        /**
         * Gets a List of "CharacterAffect" elements
         */
        java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect> getCharacterAffectList();
        
        /**
         * Gets array of all "CharacterAffect" elements
         * @deprecated
         */
        @Deprecated
        de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect[] getCharacterAffectArray();
        
        /**
         * Gets ith "CharacterAffect" element
         */
        de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect getCharacterAffectArray(int i);
        
        /**
         * Returns number of "CharacterAffect" element
         */
        int sizeOfCharacterAffectArray();
        
        /**
         * Sets array of all "CharacterAffect" element
         */
        void setCharacterAffectArray(de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect[] characterAffectArray);
        
        /**
         * Sets ith "CharacterAffect" element
         */
        void setCharacterAffectArray(int i, de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect characterAffect);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CharacterAffect" element
         */
        de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect insertNewCharacterAffect(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CharacterAffect" element
         */
        de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect addNewCharacterAffect();
        
        /**
         * Removes the ith "CharacterAffect" element
         */
        void removeCharacterAffect(int i);
        
        /**
         * Gets a List of "GroupAffect" elements
         */
        java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect> getGroupAffectList();
        
        /**
         * Gets array of all "GroupAffect" elements
         * @deprecated
         */
        @Deprecated
        de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect[] getGroupAffectArray();
        
        /**
         * Gets ith "GroupAffect" element
         */
        de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect getGroupAffectArray(int i);
        
        /**
         * Returns number of "GroupAffect" element
         */
        int sizeOfGroupAffectArray();
        
        /**
         * Sets array of all "GroupAffect" element
         */
        void setGroupAffectArray(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect[] groupAffectArray);
        
        /**
         * Sets ith "GroupAffect" element
         */
        void setGroupAffectArray(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect groupAffect);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GroupAffect" element
         */
        de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect insertNewGroupAffect(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GroupAffect" element
         */
        de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect addNewGroupAffect();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CharacterAffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("characteraffect8eeaelemtype");
            
            /**
             * Gets the "DominantEmotion" element
             */
            de.affect.xml.EmotionType getDominantEmotion();
            
            /**
             * Sets the "DominantEmotion" element
             */
            void setDominantEmotion(de.affect.xml.EmotionType dominantEmotion);
            
            /**
             * Appends and returns a new empty "DominantEmotion" element
             */
            de.affect.xml.EmotionType addNewDominantEmotion();
            
            /**
             * Gets the "Emotions" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions getEmotions();
            
            /**
             * Sets the "Emotions" element
             */
            void setEmotions(de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions emotions);
            
            /**
             * Appends and returns a new empty "Emotions" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions addNewEmotions();
            
            /**
             * Gets the "Mood" element
             */
            de.affect.xml.MoodType getMood();
            
            /**
             * Sets the "Mood" element
             */
            void setMood(de.affect.xml.MoodType mood);
            
            /**
             * Appends and returns a new empty "Mood" element
             */
            de.affect.xml.MoodType addNewMood();
            
            /**
             * Gets the "MoodTendency" element
             */
            de.affect.xml.MoodType getMoodTendency();
            
            /**
             * Sets the "MoodTendency" element
             */
            void setMoodTendency(de.affect.xml.MoodType moodTendency);
            
            /**
             * Appends and returns a new empty "MoodTendency" element
             */
            de.affect.xml.MoodType addNewMoodTendency();
            
            /**
             * Gets the "DefaultMood" element
             */
            de.affect.xml.MoodType getDefaultMood();
            
            /**
             * Sets the "DefaultMood" element
             */
            void setDefaultMood(de.affect.xml.MoodType defaultMood);
            
            /**
             * Appends and returns a new empty "DefaultMood" element
             */
            de.affect.xml.MoodType addNewDefaultMood();
            
            /**
             * Gets the "Personality" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality getPersonality();
            
            /**
             * Sets the "Personality" element
             */
            void setPersonality(de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality personality);
            
            /**
             * Appends and returns a new empty "Personality" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality addNewPersonality();
            
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
             * An XML Emotions(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface Emotions extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Emotions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("emotionsac1eelemtype");
                
                /**
                 * Gets a List of "Emotion" elements
                 */
                java.util.List<de.affect.xml.EmotionType> getEmotionList();
                
                /**
                 * Gets array of all "Emotion" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.EmotionType[] getEmotionArray();
                
                /**
                 * Gets ith "Emotion" element
                 */
                de.affect.xml.EmotionType getEmotionArray(int i);
                
                /**
                 * Returns number of "Emotion" element
                 */
                int sizeOfEmotionArray();
                
                /**
                 * Sets array of all "Emotion" element
                 */
                void setEmotionArray(de.affect.xml.EmotionType[] emotionArray);
                
                /**
                 * Sets ith "Emotion" element
                 */
                void setEmotionArray(int i, de.affect.xml.EmotionType emotion);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Emotion" element
                 */
                de.affect.xml.EmotionType insertNewEmotion(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Emotion" element
                 */
                de.affect.xml.EmotionType addNewEmotion();
                
                /**
                 * Removes the ith "Emotion" element
                 */
                void removeEmotion(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions newInstance() {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Personality(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface Personality extends de.affect.xml.PersonalityType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Personality.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("personalityc024elemtype");
                
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
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality newInstance() {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect newInstance() {
                  return (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupAffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("groupaffect6cc0elemtype");
            
            /**
             * Gets the "OverallMood" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood getOverallMood();
            
            /**
             * True if has "OverallMood" element
             */
            boolean isSetOverallMood();
            
            /**
             * Sets the "OverallMood" element
             */
            void setOverallMood(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood overallMood);
            
            /**
             * Appends and returns a new empty "OverallMood" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood addNewOverallMood();
            
            /**
             * Unsets the "OverallMood" element
             */
            void unsetOverallMood();
            
            /**
             * Gets the "SocialIntegrity" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity getSocialIntegrity();
            
            /**
             * True if has "SocialIntegrity" element
             */
            boolean isSetSocialIntegrity();
            
            /**
             * Sets the "SocialIntegrity" element
             */
            void setSocialIntegrity(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity socialIntegrity);
            
            /**
             * Appends and returns a new empty "SocialIntegrity" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity addNewSocialIntegrity();
            
            /**
             * Unsets the "SocialIntegrity" element
             */
            void unsetSocialIntegrity();
            
            /**
             * Gets the "MoodSimilarities" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities getMoodSimilarities();
            
            /**
             * True if has "MoodSimilarities" element
             */
            boolean isSetMoodSimilarities();
            
            /**
             * Sets the "MoodSimilarities" element
             */
            void setMoodSimilarities(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities moodSimilarities);
            
            /**
             * Appends and returns a new empty "MoodSimilarities" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities addNewMoodSimilarities();
            
            /**
             * Unsets the "MoodSimilarities" element
             */
            void unsetMoodSimilarities();
            
            /**
             * Gets the "MoodExtremes" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes getMoodExtremes();
            
            /**
             * True if has "MoodExtremes" element
             */
            boolean isSetMoodExtremes();
            
            /**
             * Sets the "MoodExtremes" element
             */
            void setMoodExtremes(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes moodExtremes);
            
            /**
             * Appends and returns a new empty "MoodExtremes" element
             */
            de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes addNewMoodExtremes();
            
            /**
             * Unsets the "MoodExtremes" element
             */
            void unsetMoodExtremes();
            
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
             * An XML OverallMood(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface OverallMood extends de.affect.xml.MoodType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OverallMood.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("overallmood3df0elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood newInstance() {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML SocialIntegrity(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface SocialIntegrity extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SocialIntegrity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("socialintegrityfc6celemtype");
                
                /**
                 * Gets the "value" attribute
                 */
                java.lang.String getValue();
                
                /**
                 * Gets (as xml) the "value" attribute
                 */
                de.affect.xml.Intensity xgetValue();
                
                /**
                 * Sets the "value" attribute
                 */
                void setValue(java.lang.String value);
                
                /**
                 * Sets (as xml) the "value" attribute
                 */
                void xsetValue(de.affect.xml.Intensity value);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity newInstance() {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML MoodSimilarities(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface MoodSimilarities extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoodSimilarities.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("moodsimilarities77d4elemtype");
                
                /**
                 * Gets a List of "CharacterPair" elements
                 */
                java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair> getCharacterPairList();
                
                /**
                 * Gets array of all "CharacterPair" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair[] getCharacterPairArray();
                
                /**
                 * Gets ith "CharacterPair" element
                 */
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair getCharacterPairArray(int i);
                
                /**
                 * Returns number of "CharacterPair" element
                 */
                int sizeOfCharacterPairArray();
                
                /**
                 * Sets array of all "CharacterPair" element
                 */
                void setCharacterPairArray(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair[] characterPairArray);
                
                /**
                 * Sets ith "CharacterPair" element
                 */
                void setCharacterPairArray(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair characterPair);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "CharacterPair" element
                 */
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair insertNewCharacterPair(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "CharacterPair" element
                 */
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair addNewCharacterPair();
                
                /**
                 * Removes the ith "CharacterPair" element
                 */
                void removeCharacterPair(int i);
                
                /**
                 * An XML CharacterPair(@xml.affect.de).
                 *
                 * This is a complex type.
                 */
                public interface CharacterPair extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CharacterPair.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("characterpaird845elemtype");
                    
                    /**
                     * Gets the "first" attribute
                     */
                    java.lang.String getFirst();
                    
                    /**
                     * Gets (as xml) the "first" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetFirst();
                    
                    /**
                     * Sets the "first" attribute
                     */
                    void setFirst(java.lang.String first);
                    
                    /**
                     * Sets (as xml) the "first" attribute
                     */
                    void xsetFirst(org.apache.xmlbeans.XmlString first);
                    
                    /**
                     * Gets the "second" attribute
                     */
                    java.lang.String getSecond();
                    
                    /**
                     * Gets (as xml) the "second" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetSecond();
                    
                    /**
                     * Sets the "second" attribute
                     */
                    void setSecond(java.lang.String second);
                    
                    /**
                     * Sets (as xml) the "second" attribute
                     */
                    void xsetSecond(org.apache.xmlbeans.XmlString second);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair newInstance() {
                        return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities newInstance() {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML MoodExtremes(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface MoodExtremes extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoodExtremes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("moodextremes525aelemtype");
                
                /**
                 * Gets a List of "Character" elements
                 */
                java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character> getCharacterList();
                
                /**
                 * Gets array of all "Character" elements
                 * @deprecated
                 */
                @Deprecated
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character[] getCharacterArray();
                
                /**
                 * Gets ith "Character" element
                 */
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character getCharacterArray(int i);
                
                /**
                 * Returns number of "Character" element
                 */
                int sizeOfCharacterArray();
                
                /**
                 * Sets array of all "Character" element
                 */
                void setCharacterArray(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character[] characterArray);
                
                /**
                 * Sets ith "Character" element
                 */
                void setCharacterArray(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character character);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Character" element
                 */
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character insertNewCharacter(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Character" element
                 */
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character addNewCharacter();
                
                /**
                 * Removes the ith "Character" element
                 */
                void removeCharacter(int i);
                
                /**
                 * An XML Character(@xml.affect.de).
                 *
                 * This is a complex type.
                 */
                public interface Character extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Character.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("characterd085elemtype");
                    
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
                     * Gets the "difference" attribute
                     */
                    double getDifference();
                    
                    /**
                     * Gets (as xml) the "difference" attribute
                     */
                    org.apache.xmlbeans.XmlDouble xgetDifference();
                    
                    /**
                     * Sets the "difference" attribute
                     */
                    void setDifference(double difference);
                    
                    /**
                     * Sets (as xml) the "difference" attribute
                     */
                    void xsetDifference(org.apache.xmlbeans.XmlDouble difference);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character newInstance() {
                        return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes newInstance() {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect newInstance() {
                  return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.affect.xml.AffectOutputDocument.AffectOutput newInstance() {
              return (de.affect.xml.AffectOutputDocument.AffectOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.affect.xml.AffectOutputDocument.AffectOutput newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.affect.xml.AffectOutputDocument.AffectOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.affect.xml.AffectOutputDocument newInstance() {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.affect.xml.AffectOutputDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.affect.xml.AffectOutputDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.affect.xml.AffectOutputDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.affect.xml.AffectOutputDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.affect.xml.AffectOutputDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.affect.xml.AffectOutputDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.affect.xml.AffectOutputDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.affect.xml.AffectOutputDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.affect.xml.AffectOutputDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.affect.xml.AffectOutputDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.affect.xml.AffectOutputDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.affect.xml.AffectOutputDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.affect.xml.AffectOutputDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.affect.xml.AffectOutputDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.affect.xml.AffectOutputDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.AffectOutputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.AffectOutputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.AffectOutputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
