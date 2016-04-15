/*
 * An XML document type.
 * Localname: AffectScript
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectScriptDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml;


/**
 * A document containing one AffectScript(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public interface AffectScriptDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffectScriptDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD0073D900832184E9BED1EA3B81E0474").resolveHandle("affectscriptf83cdoctype");
    
    /**
     * Gets the "AffectScript" element
     */
    de.affect.xml.AffectScriptDocument.AffectScript getAffectScript();
    
    /**
     * Sets the "AffectScript" element
     */
    void setAffectScript(de.affect.xml.AffectScriptDocument.AffectScript affectScript);
    
    /**
     * Appends and returns a new empty "AffectScript" element
     */
    de.affect.xml.AffectScriptDocument.AffectScript addNewAffectScript();
    
    /**
     * An XML AffectScript(@xml.affect.de).
     *
     * This is a complex type.
     */
    public interface AffectScript extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffectScript.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD0073D900832184E9BED1EA3B81E0474").resolveHandle("affectscript00c0elemtype");
        
        /**
         * Gets the "Context" element
         */
        java.lang.String getContext();
        
        /**
         * Gets (as xml) the "Context" element
         */
        org.apache.xmlbeans.XmlString xgetContext();
        
        /**
         * True if has "Context" element
         */
        boolean isSetContext();
        
        /**
         * Sets the "Context" element
         */
        void setContext(java.lang.String context);
        
        /**
         * Sets (as xml) the "Context" element
         */
        void xsetContext(org.apache.xmlbeans.XmlString context);
        
        /**
         * Unsets the "Context" element
         */
        void unsetContext();
        
        /**
         * Gets a List of "Item" elements
         */
        java.util.List<de.affect.xml.AffectScriptDocument.AffectScript.Item> getItemList();
        
        /**
         * Gets array of all "Item" elements
         * @deprecated
         */
        @Deprecated
        de.affect.xml.AffectScriptDocument.AffectScript.Item[] getItemArray();
        
        /**
         * Gets ith "Item" element
         */
        de.affect.xml.AffectScriptDocument.AffectScript.Item getItemArray(int i);
        
        /**
         * Returns number of "Item" element
         */
        int sizeOfItemArray();
        
        /**
         * Sets array of all "Item" element
         */
        void setItemArray(de.affect.xml.AffectScriptDocument.AffectScript.Item[] itemArray);
        
        /**
         * Sets ith "Item" element
         */
        void setItemArray(int i, de.affect.xml.AffectScriptDocument.AffectScript.Item item);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Item" element
         */
        de.affect.xml.AffectScriptDocument.AffectScript.Item insertNewItem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Item" element
         */
        de.affect.xml.AffectScriptDocument.AffectScript.Item addNewItem();
        
        /**
         * Removes the ith "Item" element
         */
        void removeItem(int i);
        
        /**
         * An XML Item(@xml.affect.de).
         *
         * This is a complex type.
         */
        public interface Item extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD0073D900832184E9BED1EA3B81E0474").resolveHandle("itemb20felemtype");
            
            /**
             * Gets the "AffectInput" element
             */
            de.affect.xml.AffectInputDocument.AffectInput getAffectInput();
            
            /**
             * True if has "AffectInput" element
             */
            boolean isSetAffectInput();
            
            /**
             * Sets the "AffectInput" element
             */
            void setAffectInput(de.affect.xml.AffectInputDocument.AffectInput affectInput);
            
            /**
             * Appends and returns a new empty "AffectInput" element
             */
            de.affect.xml.AffectInputDocument.AffectInput addNewAffectInput();
            
            /**
             * Unsets the "AffectInput" element
             */
            void unsetAffectInput();
            
            /**
             * Gets the "Appraisal" element
             */
            de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal getAppraisal();
            
            /**
             * True if has "Appraisal" element
             */
            boolean isSetAppraisal();
            
            /**
             * Sets the "Appraisal" element
             */
            void setAppraisal(de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal appraisal);
            
            /**
             * Appends and returns a new empty "Appraisal" element
             */
            de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal addNewAppraisal();
            
            /**
             * Unsets the "Appraisal" element
             */
            void unsetAppraisal();
            
            /**
             * Gets the "ResetCharacter" element
             */
            de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter getResetCharacter();
            
            /**
             * True if has "ResetCharacter" element
             */
            boolean isSetResetCharacter();
            
            /**
             * Sets the "ResetCharacter" element
             */
            void setResetCharacter(de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter resetCharacter);
            
            /**
             * Appends and returns a new empty "ResetCharacter" element
             */
            de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter addNewResetCharacter();
            
            /**
             * Unsets the "ResetCharacter" element
             */
            void unsetResetCharacter();
            
            /**
             * Gets the "Context" element
             */
            java.lang.String getContext();
            
            /**
             * Gets (as xml) the "Context" element
             */
            org.apache.xmlbeans.XmlString xgetContext();
            
            /**
             * True if has "Context" element
             */
            boolean isSetContext();
            
            /**
             * Sets the "Context" element
             */
            void setContext(java.lang.String context);
            
            /**
             * Sets (as xml) the "Context" element
             */
            void xsetContext(org.apache.xmlbeans.XmlString context);
            
            /**
             * Unsets the "Context" element
             */
            void unsetContext();
            
            /**
             * Gets the "time" attribute
             */
            long getTime();
            
            /**
             * Gets (as xml) the "time" attribute
             */
            org.apache.xmlbeans.XmlLong xgetTime();
            
            /**
             * Sets the "time" attribute
             */
            void setTime(long time);
            
            /**
             * Sets (as xml) the "time" attribute
             */
            void xsetTime(org.apache.xmlbeans.XmlLong time);
            
            /**
             * An XML Appraisal(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface Appraisal extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Appraisal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD0073D900832184E9BED1EA3B81E0474").resolveHandle("appraisal693eelemtype");
                
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
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal newInstance() {
                      return (de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ResetCharacter(@xml.affect.de).
             *
             * This is a complex type.
             */
            public interface ResetCharacter extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResetCharacter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD0073D900832184E9BED1EA3B81E0474").resolveHandle("resetcharacterbcf9elemtype");
                
                /**
                 * Gets the "name" attribute
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name xgetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name name);
                
                /**
                 * An XML name(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectScriptDocument$AffectScript$Item$ResetCharacter$Name.
                 */
                public interface Name extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD0073D900832184E9BED1EA3B81E0474").resolveHandle("nameac24attrtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name newValue(java.lang.Object obj) {
                        return (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name) type.newValue( obj ); }
                      
                      public static de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name newInstance() {
                        return (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter newInstance() {
                      return (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.affect.xml.AffectScriptDocument.AffectScript.Item newInstance() {
                  return (de.affect.xml.AffectScriptDocument.AffectScript.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.affect.xml.AffectScriptDocument.AffectScript.Item newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.affect.xml.AffectScriptDocument.AffectScript.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.affect.xml.AffectScriptDocument.AffectScript newInstance() {
              return (de.affect.xml.AffectScriptDocument.AffectScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.affect.xml.AffectScriptDocument.AffectScript newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.affect.xml.AffectScriptDocument.AffectScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.affect.xml.AffectScriptDocument newInstance() {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.affect.xml.AffectScriptDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.affect.xml.AffectScriptDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.affect.xml.AffectScriptDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.affect.xml.AffectScriptDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.affect.xml.AffectScriptDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.affect.xml.AffectScriptDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.affect.xml.AffectScriptDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.affect.xml.AffectScriptDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.affect.xml.AffectScriptDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.affect.xml.AffectScriptDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.affect.xml.AffectScriptDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.affect.xml.AffectScriptDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.affect.xml.AffectScriptDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.affect.xml.AffectScriptDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.affect.xml.AffectScriptDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.AffectScriptDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.AffectScriptDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.AffectScriptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
