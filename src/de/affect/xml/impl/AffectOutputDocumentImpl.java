/*
 * An XML document type.
 * Localname: AffectOutput
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectOutputDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * A document containing one AffectOutput(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public class AffectOutputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument
{
    private static final long serialVersionUID = 1L;
    
    public AffectOutputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFECTOUTPUT$0 = 
        new javax.xml.namespace.QName("xml.affect.de", "AffectOutput");
    
    
    /**
     * Gets the "AffectOutput" element
     */
    public de.affect.xml.AffectOutputDocument.AffectOutput getAffectOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectOutputDocument.AffectOutput target = null;
            target = (de.affect.xml.AffectOutputDocument.AffectOutput)get_store().find_element_user(AFFECTOUTPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffectOutput" element
     */
    public void setAffectOutput(de.affect.xml.AffectOutputDocument.AffectOutput affectOutput)
    {
        generatedSetterHelperImpl(affectOutput, AFFECTOUTPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AffectOutput" element
     */
    public de.affect.xml.AffectOutputDocument.AffectOutput addNewAffectOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectOutputDocument.AffectOutput target = null;
            target = (de.affect.xml.AffectOutputDocument.AffectOutput)get_store().add_element_user(AFFECTOUTPUT$0);
            return target;
        }
    }
    /**
     * An XML AffectOutput(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class AffectOutputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput
    {
        private static final long serialVersionUID = 1L;
        
        public AffectOutputImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHARACTERAFFECT$0 = 
            new javax.xml.namespace.QName("xml.affect.de", "CharacterAffect");
        private static final javax.xml.namespace.QName GROUPAFFECT$2 = 
            new javax.xml.namespace.QName("xml.affect.de", "GroupAffect");
        private static final javax.xml.namespace.QName DOCU$4 = 
            new javax.xml.namespace.QName("", "docu");
        
        
        /**
         * Gets a List of "CharacterAffect" elements
         */
        public java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect> getCharacterAffectList()
        {
            final class CharacterAffectList extends java.util.AbstractList<de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect>
            {
                @Override
                public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect get(int i)
                    { return AffectOutputImpl.this.getCharacterAffectArray(i); }
                
                @Override
                public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect set(int i, de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect o)
                {
                    de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect old = AffectOutputImpl.this.getCharacterAffectArray(i);
                    AffectOutputImpl.this.setCharacterAffectArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect o)
                    { AffectOutputImpl.this.insertNewCharacterAffect(i).set(o); }
                
                @Override
                public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect remove(int i)
                {
                    de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect old = AffectOutputImpl.this.getCharacterAffectArray(i);
                    AffectOutputImpl.this.removeCharacterAffect(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AffectOutputImpl.this.sizeOfCharacterAffectArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CharacterAffectList();
            }
        }
        
        /**
         * Gets array of all "CharacterAffect" elements
         * @deprecated
         */
        @Deprecated
        public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect[] getCharacterAffectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect> targetList = new java.util.ArrayList<de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect>();
                get_store().find_all_element_users(CHARACTERAFFECT$0, targetList);
                de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect[] result = new de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CharacterAffect" element
         */
        public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect getCharacterAffectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect target = null;
                target = (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect)get_store().find_element_user(CHARACTERAFFECT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CharacterAffect" element
         */
        public int sizeOfCharacterAffectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHARACTERAFFECT$0);
            }
        }
        
        /**
         * Sets array of all "CharacterAffect" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCharacterAffectArray(de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect[] characterAffectArray)
        {
            check_orphaned();
            arraySetterHelper(characterAffectArray, CHARACTERAFFECT$0);
        }
        
        /**
         * Sets ith "CharacterAffect" element
         */
        public void setCharacterAffectArray(int i, de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect characterAffect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect target = null;
                target = (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect)get_store().find_element_user(CHARACTERAFFECT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(characterAffect);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CharacterAffect" element
         */
        public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect insertNewCharacterAffect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect target = null;
                target = (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect)get_store().insert_element_user(CHARACTERAFFECT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CharacterAffect" element
         */
        public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect addNewCharacterAffect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect target = null;
                target = (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect)get_store().add_element_user(CHARACTERAFFECT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "CharacterAffect" element
         */
        public void removeCharacterAffect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHARACTERAFFECT$0, i);
            }
        }
        
        /**
         * Gets a List of "GroupAffect" elements
         */
        public java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect> getGroupAffectList()
        {
            final class GroupAffectList extends java.util.AbstractList<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect>
            {
                @Override
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect get(int i)
                    { return AffectOutputImpl.this.getGroupAffectArray(i); }
                
                @Override
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect set(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect o)
                {
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect old = AffectOutputImpl.this.getGroupAffectArray(i);
                    AffectOutputImpl.this.setGroupAffectArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect o)
                    { AffectOutputImpl.this.insertNewGroupAffect(i).set(o); }
                
                @Override
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect remove(int i)
                {
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect old = AffectOutputImpl.this.getGroupAffectArray(i);
                    AffectOutputImpl.this.removeGroupAffect(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AffectOutputImpl.this.sizeOfGroupAffectArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new GroupAffectList();
            }
        }
        
        /**
         * Gets array of all "GroupAffect" elements
         * @deprecated
         */
        @Deprecated
        public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect[] getGroupAffectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect> targetList = new java.util.ArrayList<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect>();
                get_store().find_all_element_users(GROUPAFFECT$2, targetList);
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect[] result = new de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GroupAffect" element
         */
        public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect getGroupAffectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect target = null;
                target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect)get_store().find_element_user(GROUPAFFECT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GroupAffect" element
         */
        public int sizeOfGroupAffectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUPAFFECT$2);
            }
        }
        
        /**
         * Sets array of all "GroupAffect" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGroupAffectArray(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect[] groupAffectArray)
        {
            check_orphaned();
            arraySetterHelper(groupAffectArray, GROUPAFFECT$2);
        }
        
        /**
         * Sets ith "GroupAffect" element
         */
        public void setGroupAffectArray(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect groupAffect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect target = null;
                target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect)get_store().find_element_user(GROUPAFFECT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(groupAffect);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GroupAffect" element
         */
        public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect insertNewGroupAffect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect target = null;
                target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect)get_store().insert_element_user(GROUPAFFECT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GroupAffect" element
         */
        public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect addNewGroupAffect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect target = null;
                target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect)get_store().add_element_user(GROUPAFFECT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "GroupAffect" element
         */
        public void removeGroupAffect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUPAFFECT$2, i);
            }
        }
        
        /**
         * Gets the "docu" attribute
         */
        public java.lang.String getDocu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCU$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "docu" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDocu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCU$4);
                return target;
            }
        }
        
        /**
         * True if has "docu" attribute
         */
        public boolean isSetDocu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DOCU$4) != null;
            }
        }
        
        /**
         * Sets the "docu" attribute
         */
        public void setDocu(java.lang.String docu)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCU$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCU$4);
                }
                target.setStringValue(docu);
            }
        }
        
        /**
         * Sets (as xml) the "docu" attribute
         */
        public void xsetDocu(org.apache.xmlbeans.XmlString docu)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCU$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOCU$4);
                }
                target.set(docu);
            }
        }
        
        /**
         * Unsets the "docu" attribute
         */
        public void unsetDocu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DOCU$4);
            }
        }
        /**
         * An XML CharacterAffect(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class CharacterAffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect
        {
            private static final long serialVersionUID = 1L;
            
            public CharacterAffectImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DOMINANTEMOTION$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "DominantEmotion");
            private static final javax.xml.namespace.QName EMOTIONS$2 = 
                new javax.xml.namespace.QName("xml.affect.de", "Emotions");
            private static final javax.xml.namespace.QName MOOD$4 = 
                new javax.xml.namespace.QName("xml.affect.de", "Mood");
            private static final javax.xml.namespace.QName MOODTENDENCY$6 = 
                new javax.xml.namespace.QName("xml.affect.de", "MoodTendency");
            private static final javax.xml.namespace.QName DEFAULTMOOD$8 = 
                new javax.xml.namespace.QName("xml.affect.de", "DefaultMood");
            private static final javax.xml.namespace.QName PERSONALITY$10 = 
                new javax.xml.namespace.QName("xml.affect.de", "Personality");
            private static final javax.xml.namespace.QName NAME$12 = 
                new javax.xml.namespace.QName("", "name");
            
            
            /**
             * Gets the "DominantEmotion" element
             */
            public de.affect.xml.EmotionType getDominantEmotion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.EmotionType target = null;
                    target = (de.affect.xml.EmotionType)get_store().find_element_user(DOMINANTEMOTION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "DominantEmotion" element
             */
            public void setDominantEmotion(de.affect.xml.EmotionType dominantEmotion)
            {
                generatedSetterHelperImpl(dominantEmotion, DOMINANTEMOTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "DominantEmotion" element
             */
            public de.affect.xml.EmotionType addNewDominantEmotion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.EmotionType target = null;
                    target = (de.affect.xml.EmotionType)get_store().add_element_user(DOMINANTEMOTION$0);
                    return target;
                }
            }
            
            /**
             * Gets the "Emotions" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions getEmotions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions)get_store().find_element_user(EMOTIONS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Emotions" element
             */
            public void setEmotions(de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions emotions)
            {
                generatedSetterHelperImpl(emotions, EMOTIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Emotions" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions addNewEmotions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions)get_store().add_element_user(EMOTIONS$2);
                    return target;
                }
            }
            
            /**
             * Gets the "Mood" element
             */
            public de.affect.xml.MoodType getMood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.MoodType target = null;
                    target = (de.affect.xml.MoodType)get_store().find_element_user(MOOD$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Mood" element
             */
            public void setMood(de.affect.xml.MoodType mood)
            {
                generatedSetterHelperImpl(mood, MOOD$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Mood" element
             */
            public de.affect.xml.MoodType addNewMood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.MoodType target = null;
                    target = (de.affect.xml.MoodType)get_store().add_element_user(MOOD$4);
                    return target;
                }
            }
            
            /**
             * Gets the "MoodTendency" element
             */
            public de.affect.xml.MoodType getMoodTendency()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.MoodType target = null;
                    target = (de.affect.xml.MoodType)get_store().find_element_user(MOODTENDENCY$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "MoodTendency" element
             */
            public void setMoodTendency(de.affect.xml.MoodType moodTendency)
            {
                generatedSetterHelperImpl(moodTendency, MOODTENDENCY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "MoodTendency" element
             */
            public de.affect.xml.MoodType addNewMoodTendency()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.MoodType target = null;
                    target = (de.affect.xml.MoodType)get_store().add_element_user(MOODTENDENCY$6);
                    return target;
                }
            }
            
            /**
             * Gets the "DefaultMood" element
             */
            public de.affect.xml.MoodType getDefaultMood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.MoodType target = null;
                    target = (de.affect.xml.MoodType)get_store().find_element_user(DEFAULTMOOD$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "DefaultMood" element
             */
            public void setDefaultMood(de.affect.xml.MoodType defaultMood)
            {
                generatedSetterHelperImpl(defaultMood, DEFAULTMOOD$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "DefaultMood" element
             */
            public de.affect.xml.MoodType addNewDefaultMood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.MoodType target = null;
                    target = (de.affect.xml.MoodType)get_store().add_element_user(DEFAULTMOOD$8);
                    return target;
                }
            }
            
            /**
             * Gets the "Personality" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality getPersonality()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality)get_store().find_element_user(PERSONALITY$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Personality" element
             */
            public void setPersonality(de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality personality)
            {
                generatedSetterHelperImpl(personality, PERSONALITY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Personality" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality addNewPersonality()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality)get_store().add_element_user(PERSONALITY$10);
                    return target;
                }
            }
            
            /**
             * Gets the "name" attribute
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" attribute
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
                    return target;
                }
            }
            
            /**
             * Sets the "name" attribute
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$12);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" attribute
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$12);
                    }
                    target.set(name);
                }
            }
            /**
             * An XML Emotions(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class EmotionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Emotions
            {
                private static final long serialVersionUID = 1L;
                
                public EmotionsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName EMOTION$0 = 
                    new javax.xml.namespace.QName("xml.affect.de", "Emotion");
                
                
                /**
                 * Gets a List of "Emotion" elements
                 */
                public java.util.List<de.affect.xml.EmotionType> getEmotionList()
                {
                    final class EmotionList extends java.util.AbstractList<de.affect.xml.EmotionType>
                    {
                      @Override
                      public de.affect.xml.EmotionType get(int i)
                          { return EmotionsImpl.this.getEmotionArray(i); }
                      
                      @Override
                      public de.affect.xml.EmotionType set(int i, de.affect.xml.EmotionType o)
                      {
                        de.affect.xml.EmotionType old = EmotionsImpl.this.getEmotionArray(i);
                        EmotionsImpl.this.setEmotionArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.EmotionType o)
                          { EmotionsImpl.this.insertNewEmotion(i).set(o); }
                      
                      @Override
                      public de.affect.xml.EmotionType remove(int i)
                      {
                        de.affect.xml.EmotionType old = EmotionsImpl.this.getEmotionArray(i);
                        EmotionsImpl.this.removeEmotion(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return EmotionsImpl.this.sizeOfEmotionArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new EmotionList();
                    }
                }
                
                /**
                 * Gets array of all "Emotion" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.EmotionType[] getEmotionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.EmotionType> targetList = new java.util.ArrayList<de.affect.xml.EmotionType>();
                      get_store().find_all_element_users(EMOTION$0, targetList);
                      de.affect.xml.EmotionType[] result = new de.affect.xml.EmotionType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Emotion" element
                 */
                public de.affect.xml.EmotionType getEmotionArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.EmotionType target = null;
                      target = (de.affect.xml.EmotionType)get_store().find_element_user(EMOTION$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Emotion" element
                 */
                public int sizeOfEmotionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EMOTION$0);
                    }
                }
                
                /**
                 * Sets array of all "Emotion" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setEmotionArray(de.affect.xml.EmotionType[] emotionArray)
                {
                    check_orphaned();
                    arraySetterHelper(emotionArray, EMOTION$0);
                }
                
                /**
                 * Sets ith "Emotion" element
                 */
                public void setEmotionArray(int i, de.affect.xml.EmotionType emotion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.EmotionType target = null;
                      target = (de.affect.xml.EmotionType)get_store().find_element_user(EMOTION$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(emotion);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Emotion" element
                 */
                public de.affect.xml.EmotionType insertNewEmotion(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.EmotionType target = null;
                      target = (de.affect.xml.EmotionType)get_store().insert_element_user(EMOTION$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Emotion" element
                 */
                public de.affect.xml.EmotionType addNewEmotion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.EmotionType target = null;
                      target = (de.affect.xml.EmotionType)get_store().add_element_user(EMOTION$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Emotion" element
                 */
                public void removeEmotion(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EMOTION$0, i);
                    }
                }
            }
            /**
             * An XML Personality(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class PersonalityImpl extends de.affect.xml.impl.PersonalityTypeImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.CharacterAffect.Personality
            {
                private static final long serialVersionUID = 1L;
                
                public PersonalityImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DERIVED$0 = 
                    new javax.xml.namespace.QName("", "derived");
                private static final javax.xml.namespace.QName EMOTIONINFLUENCE$2 = 
                    new javax.xml.namespace.QName("", "emotioninfluence");
                
                
                /**
                 * Gets the "derived" attribute
                 */
                public boolean getDerived()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVED$0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "derived" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetDerived()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DERIVED$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "derived" attribute
                 */
                public boolean isSetDerived()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DERIVED$0) != null;
                    }
                }
                
                /**
                 * Sets the "derived" attribute
                 */
                public void setDerived(boolean derived)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVED$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DERIVED$0);
                      }
                      target.setBooleanValue(derived);
                    }
                }
                
                /**
                 * Sets (as xml) the "derived" attribute
                 */
                public void xsetDerived(org.apache.xmlbeans.XmlBoolean derived)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DERIVED$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DERIVED$0);
                      }
                      target.set(derived);
                    }
                }
                
                /**
                 * Unsets the "derived" attribute
                 */
                public void unsetDerived()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DERIVED$0);
                    }
                }
                
                /**
                 * Gets the "emotioninfluence" attribute
                 */
                public java.lang.String getEmotioninfluence()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMOTIONINFLUENCE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "emotioninfluence" attribute
                 */
                public de.affect.xml.Intensity xgetEmotioninfluence()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.Intensity target = null;
                      target = (de.affect.xml.Intensity)get_store().find_attribute_user(EMOTIONINFLUENCE$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "emotioninfluence" attribute
                 */
                public void setEmotioninfluence(java.lang.String emotioninfluence)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMOTIONINFLUENCE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EMOTIONINFLUENCE$2);
                      }
                      target.setStringValue(emotioninfluence);
                    }
                }
                
                /**
                 * Sets (as xml) the "emotioninfluence" attribute
                 */
                public void xsetEmotioninfluence(de.affect.xml.Intensity emotioninfluence)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.Intensity target = null;
                      target = (de.affect.xml.Intensity)get_store().find_attribute_user(EMOTIONINFLUENCE$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.Intensity)get_store().add_attribute_user(EMOTIONINFLUENCE$2);
                      }
                      target.set(emotioninfluence);
                    }
                }
            }
        }
        /**
         * An XML GroupAffect(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class GroupAffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect
        {
            private static final long serialVersionUID = 1L;
            
            public GroupAffectImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OVERALLMOOD$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "OverallMood");
            private static final javax.xml.namespace.QName SOCIALINTEGRITY$2 = 
                new javax.xml.namespace.QName("xml.affect.de", "SocialIntegrity");
            private static final javax.xml.namespace.QName MOODSIMILARITIES$4 = 
                new javax.xml.namespace.QName("xml.affect.de", "MoodSimilarities");
            private static final javax.xml.namespace.QName MOODEXTREMES$6 = 
                new javax.xml.namespace.QName("xml.affect.de", "MoodExtremes");
            private static final javax.xml.namespace.QName NAME$8 = 
                new javax.xml.namespace.QName("", "name");
            private static final javax.xml.namespace.QName CHARACTERS$10 = 
                new javax.xml.namespace.QName("", "characters");
            
            
            /**
             * Gets the "OverallMood" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood getOverallMood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood)get_store().find_element_user(OVERALLMOOD$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "OverallMood" element
             */
            public boolean isSetOverallMood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OVERALLMOOD$0) != 0;
                }
            }
            
            /**
             * Sets the "OverallMood" element
             */
            public void setOverallMood(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood overallMood)
            {
                generatedSetterHelperImpl(overallMood, OVERALLMOOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "OverallMood" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood addNewOverallMood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood)get_store().add_element_user(OVERALLMOOD$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "OverallMood" element
             */
            public void unsetOverallMood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OVERALLMOOD$0, 0);
                }
            }
            
            /**
             * Gets the "SocialIntegrity" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity getSocialIntegrity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity)get_store().find_element_user(SOCIALINTEGRITY$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "SocialIntegrity" element
             */
            public boolean isSetSocialIntegrity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SOCIALINTEGRITY$2) != 0;
                }
            }
            
            /**
             * Sets the "SocialIntegrity" element
             */
            public void setSocialIntegrity(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity socialIntegrity)
            {
                generatedSetterHelperImpl(socialIntegrity, SOCIALINTEGRITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "SocialIntegrity" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity addNewSocialIntegrity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity)get_store().add_element_user(SOCIALINTEGRITY$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "SocialIntegrity" element
             */
            public void unsetSocialIntegrity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SOCIALINTEGRITY$2, 0);
                }
            }
            
            /**
             * Gets the "MoodSimilarities" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities getMoodSimilarities()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities)get_store().find_element_user(MOODSIMILARITIES$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "MoodSimilarities" element
             */
            public boolean isSetMoodSimilarities()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MOODSIMILARITIES$4) != 0;
                }
            }
            
            /**
             * Sets the "MoodSimilarities" element
             */
            public void setMoodSimilarities(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities moodSimilarities)
            {
                generatedSetterHelperImpl(moodSimilarities, MOODSIMILARITIES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "MoodSimilarities" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities addNewMoodSimilarities()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities)get_store().add_element_user(MOODSIMILARITIES$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "MoodSimilarities" element
             */
            public void unsetMoodSimilarities()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MOODSIMILARITIES$4, 0);
                }
            }
            
            /**
             * Gets the "MoodExtremes" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes getMoodExtremes()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes)get_store().find_element_user(MOODEXTREMES$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "MoodExtremes" element
             */
            public boolean isSetMoodExtremes()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MOODEXTREMES$6) != 0;
                }
            }
            
            /**
             * Sets the "MoodExtremes" element
             */
            public void setMoodExtremes(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes moodExtremes)
            {
                generatedSetterHelperImpl(moodExtremes, MOODEXTREMES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "MoodExtremes" element
             */
            public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes addNewMoodExtremes()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes target = null;
                    target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes)get_store().add_element_user(MOODEXTREMES$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "MoodExtremes" element
             */
            public void unsetMoodExtremes()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MOODEXTREMES$6, 0);
                }
            }
            
            /**
             * Gets the "name" attribute
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" attribute
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                    return target;
                }
            }
            
            /**
             * Sets the "name" attribute
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" attribute
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Gets the "characters" attribute
             */
            public java.lang.String getCharacters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARACTERS$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "characters" attribute
             */
            public org.apache.xmlbeans.XmlString xgetCharacters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHARACTERS$10);
                    return target;
                }
            }
            
            /**
             * Sets the "characters" attribute
             */
            public void setCharacters(java.lang.String characters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARACTERS$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARACTERS$10);
                    }
                    target.setStringValue(characters);
                }
            }
            
            /**
             * Sets (as xml) the "characters" attribute
             */
            public void xsetCharacters(org.apache.xmlbeans.XmlString characters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHARACTERS$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHARACTERS$10);
                    }
                    target.set(characters);
                }
            }
            /**
             * An XML OverallMood(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class OverallMoodImpl extends de.affect.xml.impl.MoodTypeImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.OverallMood
            {
                private static final long serialVersionUID = 1L;
                
                public OverallMoodImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
            /**
             * An XML SocialIntegrity(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class SocialIntegrityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.SocialIntegrity
            {
                private static final long serialVersionUID = 1L;
                
                public SocialIntegrityImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName VALUE$0 = 
                    new javax.xml.namespace.QName("", "value");
                
                
                /**
                 * Gets the "value" attribute
                 */
                public java.lang.String getValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "value" attribute
                 */
                public de.affect.xml.Intensity xgetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.Intensity target = null;
                      target = (de.affect.xml.Intensity)get_store().find_attribute_user(VALUE$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "value" attribute
                 */
                public void setValue(java.lang.String value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                      }
                      target.setStringValue(value);
                    }
                }
                
                /**
                 * Sets (as xml) the "value" attribute
                 */
                public void xsetValue(de.affect.xml.Intensity value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.Intensity target = null;
                      target = (de.affect.xml.Intensity)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.Intensity)get_store().add_attribute_user(VALUE$0);
                      }
                      target.set(value);
                    }
                }
            }
            /**
             * An XML MoodSimilarities(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class MoodSimilaritiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities
            {
                private static final long serialVersionUID = 1L;
                
                public MoodSimilaritiesImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CHARACTERPAIR$0 = 
                    new javax.xml.namespace.QName("xml.affect.de", "CharacterPair");
                
                
                /**
                 * Gets a List of "CharacterPair" elements
                 */
                public java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair> getCharacterPairList()
                {
                    final class CharacterPairList extends java.util.AbstractList<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair>
                    {
                      @Override
                      public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair get(int i)
                          { return MoodSimilaritiesImpl.this.getCharacterPairArray(i); }
                      
                      @Override
                      public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair set(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair o)
                      {
                        de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair old = MoodSimilaritiesImpl.this.getCharacterPairArray(i);
                        MoodSimilaritiesImpl.this.setCharacterPairArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair o)
                          { MoodSimilaritiesImpl.this.insertNewCharacterPair(i).set(o); }
                      
                      @Override
                      public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair remove(int i)
                      {
                        de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair old = MoodSimilaritiesImpl.this.getCharacterPairArray(i);
                        MoodSimilaritiesImpl.this.removeCharacterPair(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return MoodSimilaritiesImpl.this.sizeOfCharacterPairArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new CharacterPairList();
                    }
                }
                
                /**
                 * Gets array of all "CharacterPair" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair[] getCharacterPairArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair> targetList = new java.util.ArrayList<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair>();
                      get_store().find_all_element_users(CHARACTERPAIR$0, targetList);
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair[] result = new de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "CharacterPair" element
                 */
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair getCharacterPairArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair target = null;
                      target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair)get_store().find_element_user(CHARACTERPAIR$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "CharacterPair" element
                 */
                public int sizeOfCharacterPairArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CHARACTERPAIR$0);
                    }
                }
                
                /**
                 * Sets array of all "CharacterPair" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setCharacterPairArray(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair[] characterPairArray)
                {
                    check_orphaned();
                    arraySetterHelper(characterPairArray, CHARACTERPAIR$0);
                }
                
                /**
                 * Sets ith "CharacterPair" element
                 */
                public void setCharacterPairArray(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair characterPair)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair target = null;
                      target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair)get_store().find_element_user(CHARACTERPAIR$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(characterPair);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "CharacterPair" element
                 */
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair insertNewCharacterPair(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair target = null;
                      target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair)get_store().insert_element_user(CHARACTERPAIR$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "CharacterPair" element
                 */
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair addNewCharacterPair()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair target = null;
                      target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair)get_store().add_element_user(CHARACTERPAIR$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "CharacterPair" element
                 */
                public void removeCharacterPair(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CHARACTERPAIR$0, i);
                    }
                }
                /**
                 * An XML CharacterPair(@xml.affect.de).
                 *
                 * This is a complex type.
                 */
                public static class CharacterPairImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodSimilarities.CharacterPair
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CharacterPairImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName FIRST$0 = 
                      new javax.xml.namespace.QName("", "first");
                    private static final javax.xml.namespace.QName SECOND$2 = 
                      new javax.xml.namespace.QName("", "second");
                    
                    
                    /**
                     * Gets the "first" attribute
                     */
                    public java.lang.String getFirst()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRST$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "first" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetFirst()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIRST$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "first" attribute
                     */
                    public void setFirst(java.lang.String first)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRST$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRST$0);
                        }
                        target.setStringValue(first);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "first" attribute
                     */
                    public void xsetFirst(org.apache.xmlbeans.XmlString first)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIRST$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIRST$0);
                        }
                        target.set(first);
                      }
                    }
                    
                    /**
                     * Gets the "second" attribute
                     */
                    public java.lang.String getSecond()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECOND$2);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "second" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetSecond()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECOND$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "second" attribute
                     */
                    public void setSecond(java.lang.String second)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECOND$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECOND$2);
                        }
                        target.setStringValue(second);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "second" attribute
                     */
                    public void xsetSecond(org.apache.xmlbeans.XmlString second)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECOND$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SECOND$2);
                        }
                        target.set(second);
                      }
                    }
                }
            }
            /**
             * An XML MoodExtremes(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class MoodExtremesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes
            {
                private static final long serialVersionUID = 1L;
                
                public MoodExtremesImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CHARACTER$0 = 
                    new javax.xml.namespace.QName("xml.affect.de", "Character");
                
                
                /**
                 * Gets a List of "Character" elements
                 */
                public java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character> getCharacterList()
                {
                    final class CharacterList extends java.util.AbstractList<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character>
                    {
                      @Override
                      public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character get(int i)
                          { return MoodExtremesImpl.this.getCharacterArray(i); }
                      
                      @Override
                      public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character set(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character o)
                      {
                        de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character old = MoodExtremesImpl.this.getCharacterArray(i);
                        MoodExtremesImpl.this.setCharacterArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character o)
                          { MoodExtremesImpl.this.insertNewCharacter(i).set(o); }
                      
                      @Override
                      public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character remove(int i)
                      {
                        de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character old = MoodExtremesImpl.this.getCharacterArray(i);
                        MoodExtremesImpl.this.removeCharacter(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return MoodExtremesImpl.this.sizeOfCharacterArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new CharacterList();
                    }
                }
                
                /**
                 * Gets array of all "Character" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character[] getCharacterArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character> targetList = new java.util.ArrayList<de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character>();
                      get_store().find_all_element_users(CHARACTER$0, targetList);
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character[] result = new de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Character" element
                 */
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character getCharacterArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character target = null;
                      target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character)get_store().find_element_user(CHARACTER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Character" element
                 */
                public int sizeOfCharacterArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CHARACTER$0);
                    }
                }
                
                /**
                 * Sets array of all "Character" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setCharacterArray(de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character[] characterArray)
                {
                    check_orphaned();
                    arraySetterHelper(characterArray, CHARACTER$0);
                }
                
                /**
                 * Sets ith "Character" element
                 */
                public void setCharacterArray(int i, de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character character)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character target = null;
                      target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character)get_store().find_element_user(CHARACTER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(character);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Character" element
                 */
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character insertNewCharacter(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character target = null;
                      target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character)get_store().insert_element_user(CHARACTER$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Character" element
                 */
                public de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character addNewCharacter()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character target = null;
                      target = (de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character)get_store().add_element_user(CHARACTER$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Character" element
                 */
                public void removeCharacter(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CHARACTER$0, i);
                    }
                }
                /**
                 * An XML Character(@xml.affect.de).
                 *
                 * This is a complex type.
                 */
                public static class CharacterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectOutputDocument.AffectOutput.GroupAffect.MoodExtremes.Character
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CharacterImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName NAME$0 = 
                      new javax.xml.namespace.QName("", "name");
                    private static final javax.xml.namespace.QName DIFFERENCE$2 = 
                      new javax.xml.namespace.QName("", "difference");
                    
                    
                    /**
                     * Gets the "name" attribute
                     */
                    public java.lang.String getName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "name" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "name" attribute
                     */
                    public void setName(java.lang.String name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                        }
                        target.setStringValue(name);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "name" attribute
                     */
                    public void xsetName(org.apache.xmlbeans.XmlString name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                        }
                        target.set(name);
                      }
                    }
                    
                    /**
                     * Gets the "difference" attribute
                     */
                    public double getDifference()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIFFERENCE$2);
                        if (target == null)
                        {
                          return 0.0;
                        }
                        return target.getDoubleValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "difference" attribute
                     */
                    public org.apache.xmlbeans.XmlDouble xgetDifference()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DIFFERENCE$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "difference" attribute
                     */
                    public void setDifference(double difference)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIFFERENCE$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIFFERENCE$2);
                        }
                        target.setDoubleValue(difference);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "difference" attribute
                     */
                    public void xsetDifference(org.apache.xmlbeans.XmlDouble difference)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DIFFERENCE$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DIFFERENCE$2);
                        }
                        target.set(difference);
                      }
                    }
                }
            }
        }
    }
}
