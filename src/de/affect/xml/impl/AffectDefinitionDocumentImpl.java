/*
 * An XML document type.
 * Localname: AffectDefinition
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * A document containing one AffectDefinition(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public class AffectDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AffectDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFECTDEFINITION$0 = 
        new javax.xml.namespace.QName("xml.affect.de", "AffectDefinition");
    
    
    /**
     * Gets the "AffectDefinition" element
     */
    public de.affect.xml.AffectDefinitionDocument.AffectDefinition getAffectDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectDefinitionDocument.AffectDefinition target = null;
            target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition)get_store().find_element_user(AFFECTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffectDefinition" element
     */
    public void setAffectDefinition(de.affect.xml.AffectDefinitionDocument.AffectDefinition affectDefinition)
    {
        generatedSetterHelperImpl(affectDefinition, AFFECTDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AffectDefinition" element
     */
    public de.affect.xml.AffectDefinitionDocument.AffectDefinition addNewAffectDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectDefinitionDocument.AffectDefinition target = null;
            target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition)get_store().add_element_user(AFFECTDEFINITION$0);
            return target;
        }
    }
    /**
     * An XML AffectDefinition(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class AffectDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition
    {
        private static final long serialVersionUID = 1L;
        
        public AffectDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
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
        public java.util.List<de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect> getCharacterAffectList()
        {
            final class CharacterAffectList extends java.util.AbstractList<de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect>
            {
                @Override
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect get(int i)
                    { return AffectDefinitionImpl.this.getCharacterAffectArray(i); }
                
                @Override
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect set(int i, de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect o)
                {
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect old = AffectDefinitionImpl.this.getCharacterAffectArray(i);
                    AffectDefinitionImpl.this.setCharacterAffectArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect o)
                    { AffectDefinitionImpl.this.insertNewCharacterAffect(i).set(o); }
                
                @Override
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect remove(int i)
                {
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect old = AffectDefinitionImpl.this.getCharacterAffectArray(i);
                    AffectDefinitionImpl.this.removeCharacterAffect(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AffectDefinitionImpl.this.sizeOfCharacterAffectArray(); }
                
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
        public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect[] getCharacterAffectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect> targetList = new java.util.ArrayList<de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect>();
                get_store().find_all_element_users(CHARACTERAFFECT$0, targetList);
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect[] result = new de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CharacterAffect" element
         */
        public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect getCharacterAffectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect target = null;
                target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect)get_store().find_element_user(CHARACTERAFFECT$0, i);
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
        public void setCharacterAffectArray(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect[] characterAffectArray)
        {
            check_orphaned();
            arraySetterHelper(characterAffectArray, CHARACTERAFFECT$0);
        }
        
        /**
         * Sets ith "CharacterAffect" element
         */
        public void setCharacterAffectArray(int i, de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect characterAffect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect target = null;
                target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect)get_store().find_element_user(CHARACTERAFFECT$0, i);
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
        public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect insertNewCharacterAffect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect target = null;
                target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect)get_store().insert_element_user(CHARACTERAFFECT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CharacterAffect" element
         */
        public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect addNewCharacterAffect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect target = null;
                target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect)get_store().add_element_user(CHARACTERAFFECT$0);
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
        public java.util.List<de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect> getGroupAffectList()
        {
            final class GroupAffectList extends java.util.AbstractList<de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect>
            {
                @Override
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect get(int i)
                    { return AffectDefinitionImpl.this.getGroupAffectArray(i); }
                
                @Override
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect set(int i, de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect o)
                {
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect old = AffectDefinitionImpl.this.getGroupAffectArray(i);
                    AffectDefinitionImpl.this.setGroupAffectArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect o)
                    { AffectDefinitionImpl.this.insertNewGroupAffect(i).set(o); }
                
                @Override
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect remove(int i)
                {
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect old = AffectDefinitionImpl.this.getGroupAffectArray(i);
                    AffectDefinitionImpl.this.removeGroupAffect(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AffectDefinitionImpl.this.sizeOfGroupAffectArray(); }
                
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
        public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect[] getGroupAffectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect> targetList = new java.util.ArrayList<de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect>();
                get_store().find_all_element_users(GROUPAFFECT$2, targetList);
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect[] result = new de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GroupAffect" element
         */
        public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect getGroupAffectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect target = null;
                target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect)get_store().find_element_user(GROUPAFFECT$2, i);
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
        public void setGroupAffectArray(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect[] groupAffectArray)
        {
            check_orphaned();
            arraySetterHelper(groupAffectArray, GROUPAFFECT$2);
        }
        
        /**
         * Sets ith "GroupAffect" element
         */
        public void setGroupAffectArray(int i, de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect groupAffect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect target = null;
                target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect)get_store().find_element_user(GROUPAFFECT$2, i);
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
        public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect insertNewGroupAffect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect target = null;
                target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect)get_store().insert_element_user(GROUPAFFECT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GroupAffect" element
         */
        public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect addNewGroupAffect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect target = null;
                target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect)get_store().add_element_user(GROUPAFFECT$2);
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
        public static class CharacterAffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect
        {
            private static final long serialVersionUID = 1L;
            
            public CharacterAffectImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PERSONALITYSPECIFICATION$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "PersonalitySpecification");
            private static final javax.xml.namespace.QName MOODSPECIFICATION$2 = 
                new javax.xml.namespace.QName("xml.affect.de", "MoodSpecification");
            private static final javax.xml.namespace.QName EMOTIONSPECIFICATION$4 = 
                new javax.xml.namespace.QName("xml.affect.de", "EmotionSpecification");
            private static final javax.xml.namespace.QName APPRAISAL$6 = 
                new javax.xml.namespace.QName("xml.affect.de", "Appraisal");
            private static final javax.xml.namespace.QName NAME$8 = 
                new javax.xml.namespace.QName("", "name");
            private static final javax.xml.namespace.QName MONITORED$10 = 
                new javax.xml.namespace.QName("", "monitored");
            private static final javax.xml.namespace.QName DOCU$12 = 
                new javax.xml.namespace.QName("", "docu");
            
            
            /**
             * Gets the "PersonalitySpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification getPersonalitySpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification)get_store().find_element_user(PERSONALITYSPECIFICATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PersonalitySpecification" element
             */
            public void setPersonalitySpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification personalitySpecification)
            {
                generatedSetterHelperImpl(personalitySpecification, PERSONALITYSPECIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "PersonalitySpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification addNewPersonalitySpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification)get_store().add_element_user(PERSONALITYSPECIFICATION$0);
                    return target;
                }
            }
            
            /**
             * Gets the "MoodSpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification getMoodSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification)get_store().find_element_user(MOODSPECIFICATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "MoodSpecification" element
             */
            public void setMoodSpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification moodSpecification)
            {
                generatedSetterHelperImpl(moodSpecification, MOODSPECIFICATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "MoodSpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification addNewMoodSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification)get_store().add_element_user(MOODSPECIFICATION$2);
                    return target;
                }
            }
            
            /**
             * Gets the "EmotionSpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification getEmotionSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification)get_store().find_element_user(EMOTIONSPECIFICATION$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "EmotionSpecification" element
             */
            public void setEmotionSpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification emotionSpecification)
            {
                generatedSetterHelperImpl(emotionSpecification, EMOTIONSPECIFICATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "EmotionSpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification addNewEmotionSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification)get_store().add_element_user(EMOTIONSPECIFICATION$4);
                    return target;
                }
            }
            
            /**
             * Gets the "Appraisal" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal getAppraisal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal)get_store().find_element_user(APPRAISAL$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Appraisal" element
             */
            public void setAppraisal(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal appraisal)
            {
                generatedSetterHelperImpl(appraisal, APPRAISAL$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Appraisal" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal addNewAppraisal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal)get_store().add_element_user(APPRAISAL$6);
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
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name)get_store().find_attribute_user(NAME$8);
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
            public void xsetName(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name)get_store().find_attribute_user(NAME$8);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name)get_store().add_attribute_user(NAME$8);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Gets the "monitored" attribute
             */
            public boolean getMonitored()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MONITORED$10);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "monitored" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetMonitored()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MONITORED$10);
                    return target;
                }
            }
            
            /**
             * True if has "monitored" attribute
             */
            public boolean isSetMonitored()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MONITORED$10) != null;
                }
            }
            
            /**
             * Sets the "monitored" attribute
             */
            public void setMonitored(boolean monitored)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MONITORED$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MONITORED$10);
                    }
                    target.setBooleanValue(monitored);
                }
            }
            
            /**
             * Sets (as xml) the "monitored" attribute
             */
            public void xsetMonitored(org.apache.xmlbeans.XmlBoolean monitored)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MONITORED$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MONITORED$10);
                    }
                    target.set(monitored);
                }
            }
            
            /**
             * Unsets the "monitored" attribute
             */
            public void unsetMonitored()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MONITORED$10);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCU$12);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCU$12);
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
                    return get_store().find_attribute_user(DOCU$12) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCU$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCU$12);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCU$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOCU$12);
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
                    get_store().remove_attribute(DOCU$12);
                }
            }
            /**
             * An XML PersonalitySpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class PersonalitySpecificationImpl extends de.affect.xml.impl.PersonalityTypeImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.PersonalitySpecification
            {
                private static final long serialVersionUID = 1L;
                
                public PersonalitySpecificationImpl(org.apache.xmlbeans.SchemaType sType)
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
            /**
             * An XML MoodSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class MoodSpecificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification
            {
                private static final long serialVersionUID = 1L;
                
                public MoodSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DECAYTIME$0 = 
                    new javax.xml.namespace.QName("", "decaytime");
                private static final javax.xml.namespace.QName DECAYPERIOD$2 = 
                    new javax.xml.namespace.QName("", "decayperiod");
                private static final javax.xml.namespace.QName NEUROTISMSTABILITY$4 = 
                    new javax.xml.namespace.QName("", "neurotismstability");
                
                
                /**
                 * Gets the "decaytime" attribute
                 */
                public long getDecaytime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decaytime" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime xgetDecaytime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime)get_store().find_attribute_user(DECAYTIME$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decaytime" attribute
                 */
                public void setDecaytime(long decaytime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYTIME$0);
                      }
                      target.setLongValue(decaytime);
                    }
                }
                
                /**
                 * Sets (as xml) the "decaytime" attribute
                 */
                public void xsetDecaytime(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime decaytime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime)get_store().add_attribute_user(DECAYTIME$0);
                      }
                      target.set(decaytime);
                    }
                }
                
                /**
                 * Gets the "decayperiod" attribute
                 */
                public int getDecayperiod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decayperiod" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod xgetDecayperiod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod)get_store().find_attribute_user(DECAYPERIOD$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decayperiod" attribute
                 */
                public void setDecayperiod(int decayperiod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYPERIOD$2);
                      }
                      target.setIntValue(decayperiod);
                    }
                }
                
                /**
                 * Sets (as xml) the "decayperiod" attribute
                 */
                public void xsetDecayperiod(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod decayperiod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod)get_store().add_attribute_user(DECAYPERIOD$2);
                      }
                      target.set(decayperiod);
                    }
                }
                
                /**
                 * Gets the "neurotismstability" attribute
                 */
                public boolean getNeurotismstability()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEUROTISMSTABILITY$4);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "neurotismstability" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetNeurotismstability()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NEUROTISMSTABILITY$4);
                      return target;
                    }
                }
                
                /**
                 * Sets the "neurotismstability" attribute
                 */
                public void setNeurotismstability(boolean neurotismstability)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEUROTISMSTABILITY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEUROTISMSTABILITY$4);
                      }
                      target.setBooleanValue(neurotismstability);
                    }
                }
                
                /**
                 * Sets (as xml) the "neurotismstability" attribute
                 */
                public void xsetNeurotismstability(org.apache.xmlbeans.XmlBoolean neurotismstability)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NEUROTISMSTABILITY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NEUROTISMSTABILITY$4);
                      }
                      target.set(neurotismstability);
                    }
                }
                /**
                 * An XML decaytime(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$MoodSpecification$Decaytime.
                 */
                public static class DecaytimeImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decaytime
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecaytimeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecaytimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML decayperiod(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$MoodSpecification$Decayperiod.
                 */
                public static class DecayperiodImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.MoodSpecification.Decayperiod
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecayperiodImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecayperiodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML EmotionSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class EmotionSpecificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification
            {
                private static final long serialVersionUID = 1L;
                
                public EmotionSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DECAYTIME$0 = 
                    new javax.xml.namespace.QName("", "decaytime");
                private static final javax.xml.namespace.QName DECAYPERIOD$2 = 
                    new javax.xml.namespace.QName("", "decayperiod");
                private static final javax.xml.namespace.QName DECAYFUNCTION$4 = 
                    new javax.xml.namespace.QName("", "decayfunction");
                private static final javax.xml.namespace.QName BASELINE$6 = 
                    new javax.xml.namespace.QName("", "baseline");
                
                
                /**
                 * Gets the "decaytime" attribute
                 */
                public long getDecaytime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decaytime" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime xgetDecaytime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime)get_store().find_attribute_user(DECAYTIME$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decaytime" attribute
                 */
                public void setDecaytime(long decaytime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYTIME$0);
                      }
                      target.setLongValue(decaytime);
                    }
                }
                
                /**
                 * Sets (as xml) the "decaytime" attribute
                 */
                public void xsetDecaytime(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime decaytime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime)get_store().add_attribute_user(DECAYTIME$0);
                      }
                      target.set(decaytime);
                    }
                }
                
                /**
                 * Gets the "decayperiod" attribute
                 */
                public int getDecayperiod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decayperiod" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod xgetDecayperiod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod)get_store().find_attribute_user(DECAYPERIOD$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decayperiod" attribute
                 */
                public void setDecayperiod(int decayperiod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYPERIOD$2);
                      }
                      target.setIntValue(decayperiod);
                    }
                }
                
                /**
                 * Sets (as xml) the "decayperiod" attribute
                 */
                public void xsetDecayperiod(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod decayperiod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod)get_store().add_attribute_user(DECAYPERIOD$2);
                      }
                      target.set(decayperiod);
                    }
                }
                
                /**
                 * Gets the "decayfunction" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction.Enum getDecayfunction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYFUNCTION$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decayfunction" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction xgetDecayfunction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction)get_store().find_attribute_user(DECAYFUNCTION$4);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decayfunction" attribute
                 */
                public void setDecayfunction(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction.Enum decayfunction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYFUNCTION$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYFUNCTION$4);
                      }
                      target.setEnumValue(decayfunction);
                    }
                }
                
                /**
                 * Sets (as xml) the "decayfunction" attribute
                 */
                public void xsetDecayfunction(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction decayfunction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction)get_store().find_attribute_user(DECAYFUNCTION$4);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction)get_store().add_attribute_user(DECAYFUNCTION$4);
                      }
                      target.set(decayfunction);
                    }
                }
                
                /**
                 * Gets the "baseline" attribute
                 */
                public java.lang.String getBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASELINE$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "baseline" attribute
                 */
                public de.affect.xml.Intensity xgetBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.Intensity target = null;
                      target = (de.affect.xml.Intensity)get_store().find_attribute_user(BASELINE$6);
                      return target;
                    }
                }
                
                /**
                 * Sets the "baseline" attribute
                 */
                public void setBaseline(java.lang.String baseline)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASELINE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASELINE$6);
                      }
                      target.setStringValue(baseline);
                    }
                }
                
                /**
                 * Sets (as xml) the "baseline" attribute
                 */
                public void xsetBaseline(de.affect.xml.Intensity baseline)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.Intensity target = null;
                      target = (de.affect.xml.Intensity)get_store().find_attribute_user(BASELINE$6);
                      if (target == null)
                      {
                        target = (de.affect.xml.Intensity)get_store().add_attribute_user(BASELINE$6);
                      }
                      target.set(baseline);
                    }
                }
                /**
                 * An XML decaytime(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$EmotionSpecification$Decaytime.
                 */
                public static class DecaytimeImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decaytime
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecaytimeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecaytimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML decayperiod(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$EmotionSpecification$Decayperiod.
                 */
                public static class DecayperiodImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayperiod
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecayperiodImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecayperiodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML decayfunction(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$EmotionSpecification$Decayfunction.
                 */
                public static class DecayfunctionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.EmotionSpecification.Decayfunction
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecayfunctionImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecayfunctionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML Appraisal(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class AppraisalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal
            {
                private static final long serialVersionUID = 1L;
                
                public AppraisalImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName BASIC$0 = 
                    new javax.xml.namespace.QName("xml.affect.de", "Basic");
                private static final javax.xml.namespace.QName SELFACT$2 = 
                    new javax.xml.namespace.QName("xml.affect.de", "SelfAct");
                private static final javax.xml.namespace.QName DIRECTACT$4 = 
                    new javax.xml.namespace.QName("xml.affect.de", "DirectAct");
                private static final javax.xml.namespace.QName INDIRECTACT$6 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectAct");
                private static final javax.xml.namespace.QName SELFEMOTION$8 = 
                    new javax.xml.namespace.QName("xml.affect.de", "SelfEmotion");
                private static final javax.xml.namespace.QName INDIRECTEMOTION$10 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectEmotion");
                private static final javax.xml.namespace.QName SELFMOOD$12 = 
                    new javax.xml.namespace.QName("xml.affect.de", "SelfMood");
                private static final javax.xml.namespace.QName INDIRECTMOOD$14 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectMood");
                private static final javax.xml.namespace.QName INTERNALAFFECTAPPRAISAL$16 = 
                    new javax.xml.namespace.QName("", "internalAffectAppraisal");
                
                
                /**
                 * Gets the "Basic" element
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic getBasic()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic)get_store().find_element_user(BASIC$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Basic" element
                 */
                public void setBasic(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic basic)
                {
                    generatedSetterHelperImpl(basic, BASIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "Basic" element
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic addNewBasic()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic)get_store().add_element_user(BASIC$0);
                      return target;
                    }
                }
                
                /**
                 * Gets a List of "SelfAct" elements
                 */
                public java.util.List<de.affect.xml.SelfActType> getSelfActList()
                {
                    final class SelfActList extends java.util.AbstractList<de.affect.xml.SelfActType>
                    {
                      @Override
                      public de.affect.xml.SelfActType get(int i)
                          { return AppraisalImpl.this.getSelfActArray(i); }
                      
                      @Override
                      public de.affect.xml.SelfActType set(int i, de.affect.xml.SelfActType o)
                      {
                        de.affect.xml.SelfActType old = AppraisalImpl.this.getSelfActArray(i);
                        AppraisalImpl.this.setSelfActArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.SelfActType o)
                          { AppraisalImpl.this.insertNewSelfAct(i).set(o); }
                      
                      @Override
                      public de.affect.xml.SelfActType remove(int i)
                      {
                        de.affect.xml.SelfActType old = AppraisalImpl.this.getSelfActArray(i);
                        AppraisalImpl.this.removeSelfAct(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfSelfActArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new SelfActList();
                    }
                }
                
                /**
                 * Gets array of all "SelfAct" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.SelfActType[] getSelfActArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.SelfActType> targetList = new java.util.ArrayList<de.affect.xml.SelfActType>();
                      get_store().find_all_element_users(SELFACT$2, targetList);
                      de.affect.xml.SelfActType[] result = new de.affect.xml.SelfActType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "SelfAct" element
                 */
                public de.affect.xml.SelfActType getSelfActArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfActType target = null;
                      target = (de.affect.xml.SelfActType)get_store().find_element_user(SELFACT$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "SelfAct" element
                 */
                public int sizeOfSelfActArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SELFACT$2);
                    }
                }
                
                /**
                 * Sets array of all "SelfAct" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setSelfActArray(de.affect.xml.SelfActType[] selfActArray)
                {
                    check_orphaned();
                    arraySetterHelper(selfActArray, SELFACT$2);
                }
                
                /**
                 * Sets ith "SelfAct" element
                 */
                public void setSelfActArray(int i, de.affect.xml.SelfActType selfAct)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfActType target = null;
                      target = (de.affect.xml.SelfActType)get_store().find_element_user(SELFACT$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(selfAct);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SelfAct" element
                 */
                public de.affect.xml.SelfActType insertNewSelfAct(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfActType target = null;
                      target = (de.affect.xml.SelfActType)get_store().insert_element_user(SELFACT$2, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SelfAct" element
                 */
                public de.affect.xml.SelfActType addNewSelfAct()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfActType target = null;
                      target = (de.affect.xml.SelfActType)get_store().add_element_user(SELFACT$2);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "SelfAct" element
                 */
                public void removeSelfAct(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SELFACT$2, i);
                    }
                }
                
                /**
                 * Gets a List of "DirectAct" elements
                 */
                public java.util.List<de.affect.xml.DirectActType> getDirectActList()
                {
                    final class DirectActList extends java.util.AbstractList<de.affect.xml.DirectActType>
                    {
                      @Override
                      public de.affect.xml.DirectActType get(int i)
                          { return AppraisalImpl.this.getDirectActArray(i); }
                      
                      @Override
                      public de.affect.xml.DirectActType set(int i, de.affect.xml.DirectActType o)
                      {
                        de.affect.xml.DirectActType old = AppraisalImpl.this.getDirectActArray(i);
                        AppraisalImpl.this.setDirectActArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.DirectActType o)
                          { AppraisalImpl.this.insertNewDirectAct(i).set(o); }
                      
                      @Override
                      public de.affect.xml.DirectActType remove(int i)
                      {
                        de.affect.xml.DirectActType old = AppraisalImpl.this.getDirectActArray(i);
                        AppraisalImpl.this.removeDirectAct(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfDirectActArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new DirectActList();
                    }
                }
                
                /**
                 * Gets array of all "DirectAct" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.DirectActType[] getDirectActArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.DirectActType> targetList = new java.util.ArrayList<de.affect.xml.DirectActType>();
                      get_store().find_all_element_users(DIRECTACT$4, targetList);
                      de.affect.xml.DirectActType[] result = new de.affect.xml.DirectActType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "DirectAct" element
                 */
                public de.affect.xml.DirectActType getDirectActArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.DirectActType target = null;
                      target = (de.affect.xml.DirectActType)get_store().find_element_user(DIRECTACT$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "DirectAct" element
                 */
                public int sizeOfDirectActArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DIRECTACT$4);
                    }
                }
                
                /**
                 * Sets array of all "DirectAct" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setDirectActArray(de.affect.xml.DirectActType[] directActArray)
                {
                    check_orphaned();
                    arraySetterHelper(directActArray, DIRECTACT$4);
                }
                
                /**
                 * Sets ith "DirectAct" element
                 */
                public void setDirectActArray(int i, de.affect.xml.DirectActType directAct)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.DirectActType target = null;
                      target = (de.affect.xml.DirectActType)get_store().find_element_user(DIRECTACT$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(directAct);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "DirectAct" element
                 */
                public de.affect.xml.DirectActType insertNewDirectAct(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.DirectActType target = null;
                      target = (de.affect.xml.DirectActType)get_store().insert_element_user(DIRECTACT$4, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "DirectAct" element
                 */
                public de.affect.xml.DirectActType addNewDirectAct()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.DirectActType target = null;
                      target = (de.affect.xml.DirectActType)get_store().add_element_user(DIRECTACT$4);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "DirectAct" element
                 */
                public void removeDirectAct(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DIRECTACT$4, i);
                    }
                }
                
                /**
                 * Gets a List of "IndirectAct" elements
                 */
                public java.util.List<de.affect.xml.IndirectActType> getIndirectActList()
                {
                    final class IndirectActList extends java.util.AbstractList<de.affect.xml.IndirectActType>
                    {
                      @Override
                      public de.affect.xml.IndirectActType get(int i)
                          { return AppraisalImpl.this.getIndirectActArray(i); }
                      
                      @Override
                      public de.affect.xml.IndirectActType set(int i, de.affect.xml.IndirectActType o)
                      {
                        de.affect.xml.IndirectActType old = AppraisalImpl.this.getIndirectActArray(i);
                        AppraisalImpl.this.setIndirectActArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.IndirectActType o)
                          { AppraisalImpl.this.insertNewIndirectAct(i).set(o); }
                      
                      @Override
                      public de.affect.xml.IndirectActType remove(int i)
                      {
                        de.affect.xml.IndirectActType old = AppraisalImpl.this.getIndirectActArray(i);
                        AppraisalImpl.this.removeIndirectAct(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfIndirectActArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new IndirectActList();
                    }
                }
                
                /**
                 * Gets array of all "IndirectAct" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.IndirectActType[] getIndirectActArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.IndirectActType> targetList = new java.util.ArrayList<de.affect.xml.IndirectActType>();
                      get_store().find_all_element_users(INDIRECTACT$6, targetList);
                      de.affect.xml.IndirectActType[] result = new de.affect.xml.IndirectActType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "IndirectAct" element
                 */
                public de.affect.xml.IndirectActType getIndirectActArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectActType target = null;
                      target = (de.affect.xml.IndirectActType)get_store().find_element_user(INDIRECTACT$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "IndirectAct" element
                 */
                public int sizeOfIndirectActArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDIRECTACT$6);
                    }
                }
                
                /**
                 * Sets array of all "IndirectAct" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectActArray(de.affect.xml.IndirectActType[] indirectActArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectActArray, INDIRECTACT$6);
                }
                
                /**
                 * Sets ith "IndirectAct" element
                 */
                public void setIndirectActArray(int i, de.affect.xml.IndirectActType indirectAct)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectActType target = null;
                      target = (de.affect.xml.IndirectActType)get_store().find_element_user(INDIRECTACT$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(indirectAct);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectAct" element
                 */
                public de.affect.xml.IndirectActType insertNewIndirectAct(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectActType target = null;
                      target = (de.affect.xml.IndirectActType)get_store().insert_element_user(INDIRECTACT$6, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectAct" element
                 */
                public de.affect.xml.IndirectActType addNewIndirectAct()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectActType target = null;
                      target = (de.affect.xml.IndirectActType)get_store().add_element_user(INDIRECTACT$6);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "IndirectAct" element
                 */
                public void removeIndirectAct(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDIRECTACT$6, i);
                    }
                }
                
                /**
                 * Gets a List of "SelfEmotion" elements
                 */
                public java.util.List<de.affect.xml.SelfEmotionType> getSelfEmotionList()
                {
                    final class SelfEmotionList extends java.util.AbstractList<de.affect.xml.SelfEmotionType>
                    {
                      @Override
                      public de.affect.xml.SelfEmotionType get(int i)
                          { return AppraisalImpl.this.getSelfEmotionArray(i); }
                      
                      @Override
                      public de.affect.xml.SelfEmotionType set(int i, de.affect.xml.SelfEmotionType o)
                      {
                        de.affect.xml.SelfEmotionType old = AppraisalImpl.this.getSelfEmotionArray(i);
                        AppraisalImpl.this.setSelfEmotionArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.SelfEmotionType o)
                          { AppraisalImpl.this.insertNewSelfEmotion(i).set(o); }
                      
                      @Override
                      public de.affect.xml.SelfEmotionType remove(int i)
                      {
                        de.affect.xml.SelfEmotionType old = AppraisalImpl.this.getSelfEmotionArray(i);
                        AppraisalImpl.this.removeSelfEmotion(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfSelfEmotionArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new SelfEmotionList();
                    }
                }
                
                /**
                 * Gets array of all "SelfEmotion" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.SelfEmotionType[] getSelfEmotionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.SelfEmotionType> targetList = new java.util.ArrayList<de.affect.xml.SelfEmotionType>();
                      get_store().find_all_element_users(SELFEMOTION$8, targetList);
                      de.affect.xml.SelfEmotionType[] result = new de.affect.xml.SelfEmotionType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "SelfEmotion" element
                 */
                public de.affect.xml.SelfEmotionType getSelfEmotionArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfEmotionType target = null;
                      target = (de.affect.xml.SelfEmotionType)get_store().find_element_user(SELFEMOTION$8, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "SelfEmotion" element
                 */
                public int sizeOfSelfEmotionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SELFEMOTION$8);
                    }
                }
                
                /**
                 * Sets array of all "SelfEmotion" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setSelfEmotionArray(de.affect.xml.SelfEmotionType[] selfEmotionArray)
                {
                    check_orphaned();
                    arraySetterHelper(selfEmotionArray, SELFEMOTION$8);
                }
                
                /**
                 * Sets ith "SelfEmotion" element
                 */
                public void setSelfEmotionArray(int i, de.affect.xml.SelfEmotionType selfEmotion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfEmotionType target = null;
                      target = (de.affect.xml.SelfEmotionType)get_store().find_element_user(SELFEMOTION$8, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(selfEmotion);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SelfEmotion" element
                 */
                public de.affect.xml.SelfEmotionType insertNewSelfEmotion(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfEmotionType target = null;
                      target = (de.affect.xml.SelfEmotionType)get_store().insert_element_user(SELFEMOTION$8, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SelfEmotion" element
                 */
                public de.affect.xml.SelfEmotionType addNewSelfEmotion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfEmotionType target = null;
                      target = (de.affect.xml.SelfEmotionType)get_store().add_element_user(SELFEMOTION$8);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "SelfEmotion" element
                 */
                public void removeSelfEmotion(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SELFEMOTION$8, i);
                    }
                }
                
                /**
                 * Gets a List of "IndirectEmotion" elements
                 */
                public java.util.List<de.affect.xml.IndirectEmotionType> getIndirectEmotionList()
                {
                    final class IndirectEmotionList extends java.util.AbstractList<de.affect.xml.IndirectEmotionType>
                    {
                      @Override
                      public de.affect.xml.IndirectEmotionType get(int i)
                          { return AppraisalImpl.this.getIndirectEmotionArray(i); }
                      
                      @Override
                      public de.affect.xml.IndirectEmotionType set(int i, de.affect.xml.IndirectEmotionType o)
                      {
                        de.affect.xml.IndirectEmotionType old = AppraisalImpl.this.getIndirectEmotionArray(i);
                        AppraisalImpl.this.setIndirectEmotionArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.IndirectEmotionType o)
                          { AppraisalImpl.this.insertNewIndirectEmotion(i).set(o); }
                      
                      @Override
                      public de.affect.xml.IndirectEmotionType remove(int i)
                      {
                        de.affect.xml.IndirectEmotionType old = AppraisalImpl.this.getIndirectEmotionArray(i);
                        AppraisalImpl.this.removeIndirectEmotion(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfIndirectEmotionArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new IndirectEmotionList();
                    }
                }
                
                /**
                 * Gets array of all "IndirectEmotion" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.IndirectEmotionType[] getIndirectEmotionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.IndirectEmotionType> targetList = new java.util.ArrayList<de.affect.xml.IndirectEmotionType>();
                      get_store().find_all_element_users(INDIRECTEMOTION$10, targetList);
                      de.affect.xml.IndirectEmotionType[] result = new de.affect.xml.IndirectEmotionType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "IndirectEmotion" element
                 */
                public de.affect.xml.IndirectEmotionType getIndirectEmotionArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectEmotionType target = null;
                      target = (de.affect.xml.IndirectEmotionType)get_store().find_element_user(INDIRECTEMOTION$10, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "IndirectEmotion" element
                 */
                public int sizeOfIndirectEmotionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDIRECTEMOTION$10);
                    }
                }
                
                /**
                 * Sets array of all "IndirectEmotion" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectEmotionArray(de.affect.xml.IndirectEmotionType[] indirectEmotionArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectEmotionArray, INDIRECTEMOTION$10);
                }
                
                /**
                 * Sets ith "IndirectEmotion" element
                 */
                public void setIndirectEmotionArray(int i, de.affect.xml.IndirectEmotionType indirectEmotion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectEmotionType target = null;
                      target = (de.affect.xml.IndirectEmotionType)get_store().find_element_user(INDIRECTEMOTION$10, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(indirectEmotion);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectEmotion" element
                 */
                public de.affect.xml.IndirectEmotionType insertNewIndirectEmotion(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectEmotionType target = null;
                      target = (de.affect.xml.IndirectEmotionType)get_store().insert_element_user(INDIRECTEMOTION$10, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectEmotion" element
                 */
                public de.affect.xml.IndirectEmotionType addNewIndirectEmotion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectEmotionType target = null;
                      target = (de.affect.xml.IndirectEmotionType)get_store().add_element_user(INDIRECTEMOTION$10);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "IndirectEmotion" element
                 */
                public void removeIndirectEmotion(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDIRECTEMOTION$10, i);
                    }
                }
                
                /**
                 * Gets a List of "SelfMood" elements
                 */
                public java.util.List<de.affect.xml.SelfMoodType> getSelfMoodList()
                {
                    final class SelfMoodList extends java.util.AbstractList<de.affect.xml.SelfMoodType>
                    {
                      @Override
                      public de.affect.xml.SelfMoodType get(int i)
                          { return AppraisalImpl.this.getSelfMoodArray(i); }
                      
                      @Override
                      public de.affect.xml.SelfMoodType set(int i, de.affect.xml.SelfMoodType o)
                      {
                        de.affect.xml.SelfMoodType old = AppraisalImpl.this.getSelfMoodArray(i);
                        AppraisalImpl.this.setSelfMoodArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.SelfMoodType o)
                          { AppraisalImpl.this.insertNewSelfMood(i).set(o); }
                      
                      @Override
                      public de.affect.xml.SelfMoodType remove(int i)
                      {
                        de.affect.xml.SelfMoodType old = AppraisalImpl.this.getSelfMoodArray(i);
                        AppraisalImpl.this.removeSelfMood(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfSelfMoodArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new SelfMoodList();
                    }
                }
                
                /**
                 * Gets array of all "SelfMood" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.SelfMoodType[] getSelfMoodArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.SelfMoodType> targetList = new java.util.ArrayList<de.affect.xml.SelfMoodType>();
                      get_store().find_all_element_users(SELFMOOD$12, targetList);
                      de.affect.xml.SelfMoodType[] result = new de.affect.xml.SelfMoodType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "SelfMood" element
                 */
                public de.affect.xml.SelfMoodType getSelfMoodArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfMoodType target = null;
                      target = (de.affect.xml.SelfMoodType)get_store().find_element_user(SELFMOOD$12, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "SelfMood" element
                 */
                public int sizeOfSelfMoodArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SELFMOOD$12);
                    }
                }
                
                /**
                 * Sets array of all "SelfMood" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setSelfMoodArray(de.affect.xml.SelfMoodType[] selfMoodArray)
                {
                    check_orphaned();
                    arraySetterHelper(selfMoodArray, SELFMOOD$12);
                }
                
                /**
                 * Sets ith "SelfMood" element
                 */
                public void setSelfMoodArray(int i, de.affect.xml.SelfMoodType selfMood)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfMoodType target = null;
                      target = (de.affect.xml.SelfMoodType)get_store().find_element_user(SELFMOOD$12, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(selfMood);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SelfMood" element
                 */
                public de.affect.xml.SelfMoodType insertNewSelfMood(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfMoodType target = null;
                      target = (de.affect.xml.SelfMoodType)get_store().insert_element_user(SELFMOOD$12, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SelfMood" element
                 */
                public de.affect.xml.SelfMoodType addNewSelfMood()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SelfMoodType target = null;
                      target = (de.affect.xml.SelfMoodType)get_store().add_element_user(SELFMOOD$12);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "SelfMood" element
                 */
                public void removeSelfMood(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SELFMOOD$12, i);
                    }
                }
                
                /**
                 * Gets a List of "IndirectMood" elements
                 */
                public java.util.List<de.affect.xml.IndirectMoodType> getIndirectMoodList()
                {
                    final class IndirectMoodList extends java.util.AbstractList<de.affect.xml.IndirectMoodType>
                    {
                      @Override
                      public de.affect.xml.IndirectMoodType get(int i)
                          { return AppraisalImpl.this.getIndirectMoodArray(i); }
                      
                      @Override
                      public de.affect.xml.IndirectMoodType set(int i, de.affect.xml.IndirectMoodType o)
                      {
                        de.affect.xml.IndirectMoodType old = AppraisalImpl.this.getIndirectMoodArray(i);
                        AppraisalImpl.this.setIndirectMoodArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.IndirectMoodType o)
                          { AppraisalImpl.this.insertNewIndirectMood(i).set(o); }
                      
                      @Override
                      public de.affect.xml.IndirectMoodType remove(int i)
                      {
                        de.affect.xml.IndirectMoodType old = AppraisalImpl.this.getIndirectMoodArray(i);
                        AppraisalImpl.this.removeIndirectMood(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfIndirectMoodArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new IndirectMoodList();
                    }
                }
                
                /**
                 * Gets array of all "IndirectMood" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.IndirectMoodType[] getIndirectMoodArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.IndirectMoodType> targetList = new java.util.ArrayList<de.affect.xml.IndirectMoodType>();
                      get_store().find_all_element_users(INDIRECTMOOD$14, targetList);
                      de.affect.xml.IndirectMoodType[] result = new de.affect.xml.IndirectMoodType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "IndirectMood" element
                 */
                public de.affect.xml.IndirectMoodType getIndirectMoodArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectMoodType target = null;
                      target = (de.affect.xml.IndirectMoodType)get_store().find_element_user(INDIRECTMOOD$14, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "IndirectMood" element
                 */
                public int sizeOfIndirectMoodArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDIRECTMOOD$14);
                    }
                }
                
                /**
                 * Sets array of all "IndirectMood" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectMoodArray(de.affect.xml.IndirectMoodType[] indirectMoodArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectMoodArray, INDIRECTMOOD$14);
                }
                
                /**
                 * Sets ith "IndirectMood" element
                 */
                public void setIndirectMoodArray(int i, de.affect.xml.IndirectMoodType indirectMood)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectMoodType target = null;
                      target = (de.affect.xml.IndirectMoodType)get_store().find_element_user(INDIRECTMOOD$14, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(indirectMood);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectMood" element
                 */
                public de.affect.xml.IndirectMoodType insertNewIndirectMood(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectMoodType target = null;
                      target = (de.affect.xml.IndirectMoodType)get_store().insert_element_user(INDIRECTMOOD$14, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectMood" element
                 */
                public de.affect.xml.IndirectMoodType addNewIndirectMood()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectMoodType target = null;
                      target = (de.affect.xml.IndirectMoodType)get_store().add_element_user(INDIRECTMOOD$14);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "IndirectMood" element
                 */
                public void removeIndirectMood(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDIRECTMOOD$14, i);
                    }
                }
                
                /**
                 * Gets the "internalAffectAppraisal" attribute
                 */
                public boolean getInternalAffectAppraisal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNALAFFECTAPPRAISAL$16);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "internalAffectAppraisal" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetInternalAffectAppraisal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTERNALAFFECTAPPRAISAL$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "internalAffectAppraisal" attribute
                 */
                public boolean isSetInternalAffectAppraisal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INTERNALAFFECTAPPRAISAL$16) != null;
                    }
                }
                
                /**
                 * Sets the "internalAffectAppraisal" attribute
                 */
                public void setInternalAffectAppraisal(boolean internalAffectAppraisal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNALAFFECTAPPRAISAL$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERNALAFFECTAPPRAISAL$16);
                      }
                      target.setBooleanValue(internalAffectAppraisal);
                    }
                }
                
                /**
                 * Sets (as xml) the "internalAffectAppraisal" attribute
                 */
                public void xsetInternalAffectAppraisal(org.apache.xmlbeans.XmlBoolean internalAffectAppraisal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTERNALAFFECTAPPRAISAL$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INTERNALAFFECTAPPRAISAL$16);
                      }
                      target.set(internalAffectAppraisal);
                    }
                }
                
                /**
                 * Unsets the "internalAffectAppraisal" attribute
                 */
                public void unsetInternalAffectAppraisal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INTERNALAFFECTAPPRAISAL$16);
                    }
                }
                /**
                 * An XML Basic(@xml.affect.de).
                 *
                 * This is a complex type.
                 */
                public static class BasicImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic
                {
                    private static final long serialVersionUID = 1L;
                    
                    public BasicImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName GOODEVENT$0 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodEvent");
                    private static final javax.xml.namespace.QName GOODEVENTFORGOODOTHER$2 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodEventForGoodOther");
                    private static final javax.xml.namespace.QName GOODEVENTFORBADOTHER$4 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodEventForBadOther");
                    private static final javax.xml.namespace.QName BADEVENT$6 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadEvent");
                    private static final javax.xml.namespace.QName BADEVENTFORGOODOTHER$8 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadEventForGoodOther");
                    private static final javax.xml.namespace.QName BADEVENTFORBADOTHER$10 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadEventForBadOther");
                    private static final javax.xml.namespace.QName GOODLIKELYFUTUREEVENT$12 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodLikelyFutureEvent");
                    private static final javax.xml.namespace.QName GOODUNLIKELYFUTUREEVENT$14 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodUnlikelyFutureEvent");
                    private static final javax.xml.namespace.QName BADLIKELYFUTUREEVENT$16 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadLikelyFutureEvent");
                    private static final javax.xml.namespace.QName BADUNLIKELYFUTUREEVENT$18 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadUnlikelyFutureEvent");
                    private static final javax.xml.namespace.QName EVENTCONFIRMED$20 = 
                      new javax.xml.namespace.QName("xml.affect.de", "EventConfirmed");
                    private static final javax.xml.namespace.QName EVENTDISCONFIRMED$22 = 
                      new javax.xml.namespace.QName("xml.affect.de", "EventDisconfirmed");
                    private static final javax.xml.namespace.QName GOODACTSELF$24 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodActSelf");
                    private static final javax.xml.namespace.QName GOODACTOTHER$26 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodActOther");
                    private static final javax.xml.namespace.QName BADACTSELF$28 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadActSelf");
                    private static final javax.xml.namespace.QName BADACTOTHER$30 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadActOther");
                    private static final javax.xml.namespace.QName NICETHING$32 = 
                      new javax.xml.namespace.QName("xml.affect.de", "NiceThing");
                    private static final javax.xml.namespace.QName NASTYTHING$34 = 
                      new javax.xml.namespace.QName("xml.affect.de", "NastyThing");
                    
                    
                    /**
                     * Gets the "GoodEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent getGoodEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent)get_store().find_element_user(GOODEVENT$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodEvent" element
                     */
                    public void setGoodEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent goodEvent)
                    {
                      generatedSetterHelperImpl(goodEvent, GOODEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent addNewGoodEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent)get_store().add_element_user(GOODEVENT$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodEventForGoodOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther getGoodEventForGoodOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther)get_store().find_element_user(GOODEVENTFORGOODOTHER$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodEventForGoodOther" element
                     */
                    public void setGoodEventForGoodOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther goodEventForGoodOther)
                    {
                      generatedSetterHelperImpl(goodEventForGoodOther, GOODEVENTFORGOODOTHER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodEventForGoodOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther addNewGoodEventForGoodOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther)get_store().add_element_user(GOODEVENTFORGOODOTHER$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodEventForBadOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther getGoodEventForBadOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther)get_store().find_element_user(GOODEVENTFORBADOTHER$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodEventForBadOther" element
                     */
                    public void setGoodEventForBadOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther goodEventForBadOther)
                    {
                      generatedSetterHelperImpl(goodEventForBadOther, GOODEVENTFORBADOTHER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodEventForBadOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther addNewGoodEventForBadOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther)get_store().add_element_user(GOODEVENTFORBADOTHER$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent getBadEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent)get_store().find_element_user(BADEVENT$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadEvent" element
                     */
                    public void setBadEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent badEvent)
                    {
                      generatedSetterHelperImpl(badEvent, BADEVENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent addNewBadEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent)get_store().add_element_user(BADEVENT$6);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadEventForGoodOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther getBadEventForGoodOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther)get_store().find_element_user(BADEVENTFORGOODOTHER$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadEventForGoodOther" element
                     */
                    public void setBadEventForGoodOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther badEventForGoodOther)
                    {
                      generatedSetterHelperImpl(badEventForGoodOther, BADEVENTFORGOODOTHER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadEventForGoodOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther addNewBadEventForGoodOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther)get_store().add_element_user(BADEVENTFORGOODOTHER$8);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadEventForBadOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther getBadEventForBadOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther)get_store().find_element_user(BADEVENTFORBADOTHER$10, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadEventForBadOther" element
                     */
                    public void setBadEventForBadOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther badEventForBadOther)
                    {
                      generatedSetterHelperImpl(badEventForBadOther, BADEVENTFORBADOTHER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadEventForBadOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther addNewBadEventForBadOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther)get_store().add_element_user(BADEVENTFORBADOTHER$10);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodLikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent getGoodLikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent)get_store().find_element_user(GOODLIKELYFUTUREEVENT$12, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodLikelyFutureEvent" element
                     */
                    public void setGoodLikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent goodLikelyFutureEvent)
                    {
                      generatedSetterHelperImpl(goodLikelyFutureEvent, GOODLIKELYFUTUREEVENT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodLikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent addNewGoodLikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent)get_store().add_element_user(GOODLIKELYFUTUREEVENT$12);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodUnlikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent getGoodUnlikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent)get_store().find_element_user(GOODUNLIKELYFUTUREEVENT$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodUnlikelyFutureEvent" element
                     */
                    public void setGoodUnlikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent goodUnlikelyFutureEvent)
                    {
                      generatedSetterHelperImpl(goodUnlikelyFutureEvent, GOODUNLIKELYFUTUREEVENT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodUnlikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent addNewGoodUnlikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent)get_store().add_element_user(GOODUNLIKELYFUTUREEVENT$14);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadLikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent getBadLikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent)get_store().find_element_user(BADLIKELYFUTUREEVENT$16, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadLikelyFutureEvent" element
                     */
                    public void setBadLikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent badLikelyFutureEvent)
                    {
                      generatedSetterHelperImpl(badLikelyFutureEvent, BADLIKELYFUTUREEVENT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadLikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent addNewBadLikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent)get_store().add_element_user(BADLIKELYFUTUREEVENT$16);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadUnlikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent getBadUnlikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent)get_store().find_element_user(BADUNLIKELYFUTUREEVENT$18, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadUnlikelyFutureEvent" element
                     */
                    public void setBadUnlikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent badUnlikelyFutureEvent)
                    {
                      generatedSetterHelperImpl(badUnlikelyFutureEvent, BADUNLIKELYFUTUREEVENT$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadUnlikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent addNewBadUnlikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent)get_store().add_element_user(BADUNLIKELYFUTUREEVENT$18);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "EventConfirmed" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed getEventConfirmed()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed)get_store().find_element_user(EVENTCONFIRMED$20, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "EventConfirmed" element
                     */
                    public void setEventConfirmed(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed eventConfirmed)
                    {
                      generatedSetterHelperImpl(eventConfirmed, EVENTCONFIRMED$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "EventConfirmed" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed addNewEventConfirmed()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed)get_store().add_element_user(EVENTCONFIRMED$20);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "EventDisconfirmed" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed getEventDisconfirmed()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed)get_store().find_element_user(EVENTDISCONFIRMED$22, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "EventDisconfirmed" element
                     */
                    public void setEventDisconfirmed(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed eventDisconfirmed)
                    {
                      generatedSetterHelperImpl(eventDisconfirmed, EVENTDISCONFIRMED$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "EventDisconfirmed" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed addNewEventDisconfirmed()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed)get_store().add_element_user(EVENTDISCONFIRMED$22);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodActSelf" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf getGoodActSelf()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf)get_store().find_element_user(GOODACTSELF$24, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodActSelf" element
                     */
                    public void setGoodActSelf(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf goodActSelf)
                    {
                      generatedSetterHelperImpl(goodActSelf, GOODACTSELF$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodActSelf" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf addNewGoodActSelf()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf)get_store().add_element_user(GOODACTSELF$24);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodActOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther getGoodActOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther)get_store().find_element_user(GOODACTOTHER$26, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodActOther" element
                     */
                    public void setGoodActOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther goodActOther)
                    {
                      generatedSetterHelperImpl(goodActOther, GOODACTOTHER$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodActOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther addNewGoodActOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther)get_store().add_element_user(GOODACTOTHER$26);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadActSelf" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf getBadActSelf()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf)get_store().find_element_user(BADACTSELF$28, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadActSelf" element
                     */
                    public void setBadActSelf(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf badActSelf)
                    {
                      generatedSetterHelperImpl(badActSelf, BADACTSELF$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadActSelf" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf addNewBadActSelf()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf)get_store().add_element_user(BADACTSELF$28);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadActOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther getBadActOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther)get_store().find_element_user(BADACTOTHER$30, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadActOther" element
                     */
                    public void setBadActOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther badActOther)
                    {
                      generatedSetterHelperImpl(badActOther, BADACTOTHER$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadActOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther addNewBadActOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther)get_store().add_element_user(BADACTOTHER$30);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "NiceThing" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing getNiceThing()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing)get_store().find_element_user(NICETHING$32, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "NiceThing" element
                     */
                    public void setNiceThing(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing niceThing)
                    {
                      generatedSetterHelperImpl(niceThing, NICETHING$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "NiceThing" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing addNewNiceThing()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing)get_store().add_element_user(NICETHING$32);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "NastyThing" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing getNastyThing()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing)get_store().find_element_user(NASTYTHING$34, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "NastyThing" element
                     */
                    public void setNastyThing(de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing nastyThing)
                    {
                      generatedSetterHelperImpl(nastyThing, NASTYTHING$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "NastyThing" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing addNewNastyThing()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing)get_store().add_element_user(NASTYTHING$34);
                        return target;
                      }
                    }
                    /**
                     * An XML GoodEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                    }
                    /**
                     * An XML GoodEventForGoodOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodEventForGoodOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForGoodOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodEventForGoodOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName DESIRABILITY$2 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKING$4 = 
                        new javax.xml.namespace.QName("", "liking");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      public java.lang.String getLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      public de.affect.xml.Liking xgetLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Liking target = null;
                          target = (de.affect.xml.Liking)get_store().find_attribute_user(LIKING$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      public void setLiking(java.lang.String liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$4);
                          }
                          target.setStringValue(liking);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      public void xsetLiking(de.affect.xml.Liking liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Liking target = null;
                          target = (de.affect.xml.Liking)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (de.affect.xml.Liking)get_store().add_attribute_user(LIKING$4);
                          }
                          target.set(liking);
                        }
                      }
                    }
                    /**
                     * An XML GoodEventForBadOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodEventForBadOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodEventForBadOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodEventForBadOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName DESIRABILITY$2 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKING$4 = 
                        new javax.xml.namespace.QName("", "liking");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      public java.lang.String getLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      public de.affect.xml.Disliking xgetLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disliking target = null;
                          target = (de.affect.xml.Disliking)get_store().find_attribute_user(LIKING$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      public void setLiking(java.lang.String liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$4);
                          }
                          target.setStringValue(liking);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      public void xsetLiking(de.affect.xml.Disliking liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disliking target = null;
                          target = (de.affect.xml.Disliking)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (de.affect.xml.Disliking)get_store().add_attribute_user(LIKING$4);
                          }
                          target.set(liking);
                        }
                      }
                    }
                    /**
                     * An XML BadEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                    }
                    /**
                     * An XML BadEventForGoodOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadEventForGoodOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForGoodOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadEventForGoodOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName DESIRABILITY$2 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKING$4 = 
                        new javax.xml.namespace.QName("", "liking");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      public java.lang.String getLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      public de.affect.xml.Liking xgetLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Liking target = null;
                          target = (de.affect.xml.Liking)get_store().find_attribute_user(LIKING$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      public void setLiking(java.lang.String liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$4);
                          }
                          target.setStringValue(liking);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      public void xsetLiking(de.affect.xml.Liking liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Liking target = null;
                          target = (de.affect.xml.Liking)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (de.affect.xml.Liking)get_store().add_attribute_user(LIKING$4);
                          }
                          target.set(liking);
                        }
                      }
                    }
                    /**
                     * An XML BadEventForBadOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadEventForBadOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadEventForBadOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadEventForBadOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName DESIRABILITY$2 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKING$4 = 
                        new javax.xml.namespace.QName("", "liking");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      public java.lang.String getLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      public de.affect.xml.Disliking xgetLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disliking target = null;
                          target = (de.affect.xml.Disliking)get_store().find_attribute_user(LIKING$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      public void setLiking(java.lang.String liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$4);
                          }
                          target.setStringValue(liking);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      public void xsetLiking(de.affect.xml.Disliking liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disliking target = null;
                          target = (de.affect.xml.Disliking)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (de.affect.xml.Disliking)get_store().add_attribute_user(LIKING$4);
                          }
                          target.set(liking);
                        }
                      }
                    }
                    /**
                     * An XML GoodLikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodLikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodLikelyFutureEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodLikelyFutureEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKELIHOOD$2 = 
                        new javax.xml.namespace.QName("", "likelihood");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      public java.lang.String getLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      public de.affect.xml.Likelihood xgetLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Likelihood target = null;
                          target = (de.affect.xml.Likelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      public void setLikelihood(java.lang.String likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.setStringValue(likelihood);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      public void xsetLikelihood(de.affect.xml.Likelihood likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Likelihood target = null;
                          target = (de.affect.xml.Likelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Likelihood)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.set(likelihood);
                        }
                      }
                    }
                    /**
                     * An XML GoodUnlikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodUnlikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodUnlikelyFutureEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodUnlikelyFutureEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKELIHOOD$2 = 
                        new javax.xml.namespace.QName("", "likelihood");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      public java.lang.String getLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      public de.affect.xml.Unlikelihood xgetLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Unlikelihood target = null;
                          target = (de.affect.xml.Unlikelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      public void setLikelihood(java.lang.String likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.setStringValue(likelihood);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      public void xsetLikelihood(de.affect.xml.Unlikelihood likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Unlikelihood target = null;
                          target = (de.affect.xml.Unlikelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Unlikelihood)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.set(likelihood);
                        }
                      }
                    }
                    /**
                     * An XML BadLikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadLikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadLikelyFutureEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadLikelyFutureEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKELIHOOD$2 = 
                        new javax.xml.namespace.QName("", "likelihood");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      public java.lang.String getLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      public de.affect.xml.Likelihood xgetLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Likelihood target = null;
                          target = (de.affect.xml.Likelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      public void setLikelihood(java.lang.String likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.setStringValue(likelihood);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      public void xsetLikelihood(de.affect.xml.Likelihood likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Likelihood target = null;
                          target = (de.affect.xml.Likelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Likelihood)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.set(likelihood);
                        }
                      }
                    }
                    /**
                     * An XML BadUnlikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadUnlikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadUnlikelyFutureEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadUnlikelyFutureEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKELIHOOD$2 = 
                        new javax.xml.namespace.QName("", "likelihood");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      public java.lang.String getLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      public de.affect.xml.Unlikelihood xgetLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Unlikelihood target = null;
                          target = (de.affect.xml.Unlikelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      public void setLikelihood(java.lang.String likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.setStringValue(likelihood);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      public void xsetLikelihood(de.affect.xml.Unlikelihood likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Unlikelihood target = null;
                          target = (de.affect.xml.Unlikelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Unlikelihood)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.set(likelihood);
                        }
                      }
                    }
                    /**
                     * An XML EventConfirmed(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class EventConfirmedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventConfirmed
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public EventConfirmedImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName REALIZATION$0 = 
                        new javax.xml.namespace.QName("", "realization");
                      
                      
                      /**
                       * Gets the "realization" attribute
                       */
                      public java.lang.String getRealization()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REALIZATION$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "realization" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetRealization()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(REALIZATION$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "realization" attribute
                       */
                      public void setRealization(java.lang.String realization)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REALIZATION$0);
                          }
                          target.setStringValue(realization);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "realization" attribute
                       */
                      public void xsetRealization(org.apache.xmlbeans.XmlString realization)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REALIZATION$0);
                          }
                          target.set(realization);
                        }
                      }
                    }
                    /**
                     * An XML EventDisconfirmed(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class EventDisconfirmedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.EventDisconfirmed
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public EventDisconfirmedImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName REALIZATION$0 = 
                        new javax.xml.namespace.QName("", "realization");
                      
                      
                      /**
                       * Gets the "realization" attribute
                       */
                      public java.lang.String getRealization()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REALIZATION$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "realization" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetRealization()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(REALIZATION$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "realization" attribute
                       */
                      public void setRealization(java.lang.String realization)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REALIZATION$0);
                          }
                          target.setStringValue(realization);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "realization" attribute
                       */
                      public void xsetRealization(org.apache.xmlbeans.XmlString realization)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REALIZATION$0);
                          }
                          target.set(realization);
                        }
                      }
                    }
                    /**
                     * An XML GoodActSelf(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodActSelfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActSelf
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodActSelfImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                        new javax.xml.namespace.QName("", "praiseworthiness");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      public java.lang.String getPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      public de.affect.xml.Praiseworthiness xgetPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Praiseworthiness target = null;
                          target = (de.affect.xml.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      public void setPraiseworthiness(java.lang.String praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.setStringValue(praiseworthiness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      public void xsetPraiseworthiness(de.affect.xml.Praiseworthiness praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Praiseworthiness target = null;
                          target = (de.affect.xml.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Praiseworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.set(praiseworthiness);
                        }
                      }
                    }
                    /**
                     * An XML GoodActOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodActOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.GoodActOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodActOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                        new javax.xml.namespace.QName("", "praiseworthiness");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      public java.lang.String getPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      public de.affect.xml.Praiseworthiness xgetPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Praiseworthiness target = null;
                          target = (de.affect.xml.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      public void setPraiseworthiness(java.lang.String praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.setStringValue(praiseworthiness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      public void xsetPraiseworthiness(de.affect.xml.Praiseworthiness praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Praiseworthiness target = null;
                          target = (de.affect.xml.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Praiseworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.set(praiseworthiness);
                        }
                      }
                    }
                    /**
                     * An XML BadActSelf(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadActSelfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActSelf
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadActSelfImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                        new javax.xml.namespace.QName("", "praiseworthiness");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      public java.lang.String getPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      public de.affect.xml.Blameworthiness xgetPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Blameworthiness target = null;
                          target = (de.affect.xml.Blameworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      public void setPraiseworthiness(java.lang.String praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.setStringValue(praiseworthiness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      public void xsetPraiseworthiness(de.affect.xml.Blameworthiness praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Blameworthiness target = null;
                          target = (de.affect.xml.Blameworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Blameworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.set(praiseworthiness);
                        }
                      }
                    }
                    /**
                     * An XML BadActOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadActOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.BadActOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadActOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                        new javax.xml.namespace.QName("", "praiseworthiness");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      public java.lang.String getPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      public de.affect.xml.Blameworthiness xgetPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Blameworthiness target = null;
                          target = (de.affect.xml.Blameworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      public void setPraiseworthiness(java.lang.String praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.setStringValue(praiseworthiness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      public void xsetPraiseworthiness(de.affect.xml.Blameworthiness praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Blameworthiness target = null;
                          target = (de.affect.xml.Blameworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Blameworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.set(praiseworthiness);
                        }
                      }
                    }
                    /**
                     * An XML NiceThing(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class NiceThingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NiceThing
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NiceThingImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName APPEALINGNESS$0 = 
                        new javax.xml.namespace.QName("", "appealingness");
                      
                      
                      /**
                       * Gets the "appealingness" attribute
                       */
                      public java.lang.String getAppealingness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "appealingness" attribute
                       */
                      public de.affect.xml.Appealingness xgetAppealingness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Appealingness target = null;
                          target = (de.affect.xml.Appealingness)get_store().find_attribute_user(APPEALINGNESS$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "appealingness" attribute
                       */
                      public void setAppealingness(java.lang.String appealingness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPEALINGNESS$0);
                          }
                          target.setStringValue(appealingness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "appealingness" attribute
                       */
                      public void xsetAppealingness(de.affect.xml.Appealingness appealingness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Appealingness target = null;
                          target = (de.affect.xml.Appealingness)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Appealingness)get_store().add_attribute_user(APPEALINGNESS$0);
                          }
                          target.set(appealingness);
                        }
                      }
                    }
                    /**
                     * An XML NastyThing(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class NastyThingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Appraisal.Basic.NastyThing
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NastyThingImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName APPEALINGNESS$0 = 
                        new javax.xml.namespace.QName("", "appealingness");
                      
                      
                      /**
                       * Gets the "appealingness" attribute
                       */
                      public java.lang.String getAppealingness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "appealingness" attribute
                       */
                      public de.affect.xml.Disappealingness xgetAppealingness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disappealingness target = null;
                          target = (de.affect.xml.Disappealingness)get_store().find_attribute_user(APPEALINGNESS$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "appealingness" attribute
                       */
                      public void setAppealingness(java.lang.String appealingness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPEALINGNESS$0);
                          }
                          target.setStringValue(appealingness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "appealingness" attribute
                       */
                      public void xsetAppealingness(de.affect.xml.Disappealingness appealingness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disappealingness target = null;
                          target = (de.affect.xml.Disappealingness)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Disappealingness)get_store().add_attribute_user(APPEALINGNESS$0);
                          }
                          target.set(appealingness);
                        }
                      }
                    }
                }
            }
            /**
             * An XML name(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$CharacterAffect$Name.
             */
            public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect.Name
            {
                private static final long serialVersionUID = 1L;
                
                public NameImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML GroupAffect(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class GroupAffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect
        {
            private static final long serialVersionUID = 1L;
            
            public GroupAffectImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MOODSPECIFICATION$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "MoodSpecification");
            private static final javax.xml.namespace.QName EMOTIONSPECIFICATION$2 = 
                new javax.xml.namespace.QName("xml.affect.de", "EmotionSpecification");
            private static final javax.xml.namespace.QName APPRAISAL$4 = 
                new javax.xml.namespace.QName("xml.affect.de", "Appraisal");
            private static final javax.xml.namespace.QName NAME$6 = 
                new javax.xml.namespace.QName("", "name");
            private static final javax.xml.namespace.QName CHARACTERS$8 = 
                new javax.xml.namespace.QName("", "characters");
            private static final javax.xml.namespace.QName MONITORED$10 = 
                new javax.xml.namespace.QName("", "monitored");
            private static final javax.xml.namespace.QName DOCU$12 = 
                new javax.xml.namespace.QName("", "docu");
            
            
            /**
             * Gets the "MoodSpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification getMoodSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification)get_store().find_element_user(MOODSPECIFICATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "MoodSpecification" element
             */
            public void setMoodSpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification moodSpecification)
            {
                generatedSetterHelperImpl(moodSpecification, MOODSPECIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "MoodSpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification addNewMoodSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification)get_store().add_element_user(MOODSPECIFICATION$0);
                    return target;
                }
            }
            
            /**
             * Gets the "EmotionSpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification getEmotionSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification)get_store().find_element_user(EMOTIONSPECIFICATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "EmotionSpecification" element
             */
            public void setEmotionSpecification(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification emotionSpecification)
            {
                generatedSetterHelperImpl(emotionSpecification, EMOTIONSPECIFICATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "EmotionSpecification" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification addNewEmotionSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification)get_store().add_element_user(EMOTIONSPECIFICATION$2);
                    return target;
                }
            }
            
            /**
             * Gets the "Appraisal" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal getAppraisal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal)get_store().find_element_user(APPRAISAL$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Appraisal" element
             */
            public boolean isSetAppraisal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(APPRAISAL$4) != 0;
                }
            }
            
            /**
             * Sets the "Appraisal" element
             */
            public void setAppraisal(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal appraisal)
            {
                generatedSetterHelperImpl(appraisal, APPRAISAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Appraisal" element
             */
            public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal addNewAppraisal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal target = null;
                    target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal)get_store().add_element_user(APPRAISAL$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "Appraisal" element
             */
            public void unsetAppraisal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(APPRAISAL$4, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARACTERS$8);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHARACTERS$8);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARACTERS$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARACTERS$8);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHARACTERS$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHARACTERS$8);
                    }
                    target.set(characters);
                }
            }
            
            /**
             * Gets the "monitored" attribute
             */
            public boolean getMonitored()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MONITORED$10);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "monitored" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetMonitored()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MONITORED$10);
                    return target;
                }
            }
            
            /**
             * True if has "monitored" attribute
             */
            public boolean isSetMonitored()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MONITORED$10) != null;
                }
            }
            
            /**
             * Sets the "monitored" attribute
             */
            public void setMonitored(boolean monitored)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MONITORED$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MONITORED$10);
                    }
                    target.setBooleanValue(monitored);
                }
            }
            
            /**
             * Sets (as xml) the "monitored" attribute
             */
            public void xsetMonitored(org.apache.xmlbeans.XmlBoolean monitored)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MONITORED$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MONITORED$10);
                    }
                    target.set(monitored);
                }
            }
            
            /**
             * Unsets the "monitored" attribute
             */
            public void unsetMonitored()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MONITORED$10);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCU$12);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCU$12);
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
                    return get_store().find_attribute_user(DOCU$12) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCU$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCU$12);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCU$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOCU$12);
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
                    get_store().remove_attribute(DOCU$12);
                }
            }
            /**
             * An XML MoodSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class MoodSpecificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification
            {
                private static final long serialVersionUID = 1L;
                
                public MoodSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DECAYTIME$0 = 
                    new javax.xml.namespace.QName("", "decaytime");
                private static final javax.xml.namespace.QName DECAYPERIOD$2 = 
                    new javax.xml.namespace.QName("", "decayperiod");
                
                
                /**
                 * Gets the "decaytime" attribute
                 */
                public long getDecaytime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decaytime" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime xgetDecaytime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime)get_store().find_attribute_user(DECAYTIME$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decaytime" attribute
                 */
                public void setDecaytime(long decaytime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYTIME$0);
                      }
                      target.setLongValue(decaytime);
                    }
                }
                
                /**
                 * Sets (as xml) the "decaytime" attribute
                 */
                public void xsetDecaytime(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime decaytime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime)get_store().add_attribute_user(DECAYTIME$0);
                      }
                      target.set(decaytime);
                    }
                }
                
                /**
                 * Gets the "decayperiod" attribute
                 */
                public int getDecayperiod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decayperiod" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod xgetDecayperiod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod)get_store().find_attribute_user(DECAYPERIOD$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decayperiod" attribute
                 */
                public void setDecayperiod(int decayperiod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYPERIOD$2);
                      }
                      target.setIntValue(decayperiod);
                    }
                }
                
                /**
                 * Sets (as xml) the "decayperiod" attribute
                 */
                public void xsetDecayperiod(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod decayperiod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod)get_store().add_attribute_user(DECAYPERIOD$2);
                      }
                      target.set(decayperiod);
                    }
                }
                /**
                 * An XML decaytime(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$MoodSpecification$Decaytime.
                 */
                public static class DecaytimeImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decaytime
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecaytimeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecaytimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML decayperiod(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$MoodSpecification$Decayperiod.
                 */
                public static class DecayperiodImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.MoodSpecification.Decayperiod
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecayperiodImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecayperiodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML EmotionSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class EmotionSpecificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification
            {
                private static final long serialVersionUID = 1L;
                
                public EmotionSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DECAYTIME$0 = 
                    new javax.xml.namespace.QName("", "decaytime");
                private static final javax.xml.namespace.QName DECAYPERIOD$2 = 
                    new javax.xml.namespace.QName("", "decayperiod");
                private static final javax.xml.namespace.QName DECAYFUNCTION$4 = 
                    new javax.xml.namespace.QName("", "decayfunction");
                
                
                /**
                 * Gets the "decaytime" attribute
                 */
                public long getDecaytime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decaytime" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime xgetDecaytime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime)get_store().find_attribute_user(DECAYTIME$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decaytime" attribute
                 */
                public void setDecaytime(long decaytime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYTIME$0);
                      }
                      target.setLongValue(decaytime);
                    }
                }
                
                /**
                 * Sets (as xml) the "decaytime" attribute
                 */
                public void xsetDecaytime(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime decaytime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime)get_store().find_attribute_user(DECAYTIME$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime)get_store().add_attribute_user(DECAYTIME$0);
                      }
                      target.set(decaytime);
                    }
                }
                
                /**
                 * Gets the "decayperiod" attribute
                 */
                public int getDecayperiod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decayperiod" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod xgetDecayperiod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod)get_store().find_attribute_user(DECAYPERIOD$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decayperiod" attribute
                 */
                public void setDecayperiod(int decayperiod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYPERIOD$2);
                      }
                      target.setIntValue(decayperiod);
                    }
                }
                
                /**
                 * Sets (as xml) the "decayperiod" attribute
                 */
                public void xsetDecayperiod(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod decayperiod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod)get_store().find_attribute_user(DECAYPERIOD$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod)get_store().add_attribute_user(DECAYPERIOD$2);
                      }
                      target.set(decayperiod);
                    }
                }
                
                /**
                 * Gets the "decayfunction" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction.Enum getDecayfunction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYFUNCTION$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "decayfunction" attribute
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction xgetDecayfunction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction)get_store().find_attribute_user(DECAYFUNCTION$4);
                      return target;
                    }
                }
                
                /**
                 * Sets the "decayfunction" attribute
                 */
                public void setDecayfunction(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction.Enum decayfunction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECAYFUNCTION$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECAYFUNCTION$4);
                      }
                      target.setEnumValue(decayfunction);
                    }
                }
                
                /**
                 * Sets (as xml) the "decayfunction" attribute
                 */
                public void xsetDecayfunction(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction decayfunction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction)get_store().find_attribute_user(DECAYFUNCTION$4);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction)get_store().add_attribute_user(DECAYFUNCTION$4);
                      }
                      target.set(decayfunction);
                    }
                }
                /**
                 * An XML decaytime(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$EmotionSpecification$Decaytime.
                 */
                public static class DecaytimeImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decaytime
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecaytimeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecaytimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML decayperiod(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$EmotionSpecification$Decayperiod.
                 */
                public static class DecayperiodImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayperiod
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecayperiodImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecayperiodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML decayfunction(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectDefinitionDocument$AffectDefinition$GroupAffect$EmotionSpecification$Decayfunction.
                 */
                public static class DecayfunctionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.EmotionSpecification.Decayfunction
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DecayfunctionImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DecayfunctionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML Appraisal(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class AppraisalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal
            {
                private static final long serialVersionUID = 1L;
                
                public AppraisalImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName BASIC$0 = 
                    new javax.xml.namespace.QName("xml.affect.de", "Basic");
                private static final javax.xml.namespace.QName INDIRECTACT$2 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectAct");
                private static final javax.xml.namespace.QName INDIRECTEMOTION$4 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectEmotion");
                private static final javax.xml.namespace.QName INDIRECTMOOD$6 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectMood");
                
                
                /**
                 * Gets the "Basic" element
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic getBasic()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic)get_store().find_element_user(BASIC$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Basic" element
                 */
                public void setBasic(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic basic)
                {
                    generatedSetterHelperImpl(basic, BASIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "Basic" element
                 */
                public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic addNewBasic()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic target = null;
                      target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic)get_store().add_element_user(BASIC$0);
                      return target;
                    }
                }
                
                /**
                 * Gets a List of "IndirectAct" elements
                 */
                public java.util.List<de.affect.xml.IndirectActType> getIndirectActList()
                {
                    final class IndirectActList extends java.util.AbstractList<de.affect.xml.IndirectActType>
                    {
                      @Override
                      public de.affect.xml.IndirectActType get(int i)
                          { return AppraisalImpl.this.getIndirectActArray(i); }
                      
                      @Override
                      public de.affect.xml.IndirectActType set(int i, de.affect.xml.IndirectActType o)
                      {
                        de.affect.xml.IndirectActType old = AppraisalImpl.this.getIndirectActArray(i);
                        AppraisalImpl.this.setIndirectActArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.IndirectActType o)
                          { AppraisalImpl.this.insertNewIndirectAct(i).set(o); }
                      
                      @Override
                      public de.affect.xml.IndirectActType remove(int i)
                      {
                        de.affect.xml.IndirectActType old = AppraisalImpl.this.getIndirectActArray(i);
                        AppraisalImpl.this.removeIndirectAct(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfIndirectActArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new IndirectActList();
                    }
                }
                
                /**
                 * Gets array of all "IndirectAct" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.IndirectActType[] getIndirectActArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.IndirectActType> targetList = new java.util.ArrayList<de.affect.xml.IndirectActType>();
                      get_store().find_all_element_users(INDIRECTACT$2, targetList);
                      de.affect.xml.IndirectActType[] result = new de.affect.xml.IndirectActType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "IndirectAct" element
                 */
                public de.affect.xml.IndirectActType getIndirectActArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectActType target = null;
                      target = (de.affect.xml.IndirectActType)get_store().find_element_user(INDIRECTACT$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "IndirectAct" element
                 */
                public int sizeOfIndirectActArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDIRECTACT$2);
                    }
                }
                
                /**
                 * Sets array of all "IndirectAct" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectActArray(de.affect.xml.IndirectActType[] indirectActArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectActArray, INDIRECTACT$2);
                }
                
                /**
                 * Sets ith "IndirectAct" element
                 */
                public void setIndirectActArray(int i, de.affect.xml.IndirectActType indirectAct)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectActType target = null;
                      target = (de.affect.xml.IndirectActType)get_store().find_element_user(INDIRECTACT$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(indirectAct);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectAct" element
                 */
                public de.affect.xml.IndirectActType insertNewIndirectAct(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectActType target = null;
                      target = (de.affect.xml.IndirectActType)get_store().insert_element_user(INDIRECTACT$2, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectAct" element
                 */
                public de.affect.xml.IndirectActType addNewIndirectAct()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectActType target = null;
                      target = (de.affect.xml.IndirectActType)get_store().add_element_user(INDIRECTACT$2);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "IndirectAct" element
                 */
                public void removeIndirectAct(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDIRECTACT$2, i);
                    }
                }
                
                /**
                 * Gets a List of "IndirectEmotion" elements
                 */
                public java.util.List<de.affect.xml.IndirectEmotionType> getIndirectEmotionList()
                {
                    final class IndirectEmotionList extends java.util.AbstractList<de.affect.xml.IndirectEmotionType>
                    {
                      @Override
                      public de.affect.xml.IndirectEmotionType get(int i)
                          { return AppraisalImpl.this.getIndirectEmotionArray(i); }
                      
                      @Override
                      public de.affect.xml.IndirectEmotionType set(int i, de.affect.xml.IndirectEmotionType o)
                      {
                        de.affect.xml.IndirectEmotionType old = AppraisalImpl.this.getIndirectEmotionArray(i);
                        AppraisalImpl.this.setIndirectEmotionArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.IndirectEmotionType o)
                          { AppraisalImpl.this.insertNewIndirectEmotion(i).set(o); }
                      
                      @Override
                      public de.affect.xml.IndirectEmotionType remove(int i)
                      {
                        de.affect.xml.IndirectEmotionType old = AppraisalImpl.this.getIndirectEmotionArray(i);
                        AppraisalImpl.this.removeIndirectEmotion(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfIndirectEmotionArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new IndirectEmotionList();
                    }
                }
                
                /**
                 * Gets array of all "IndirectEmotion" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.IndirectEmotionType[] getIndirectEmotionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.IndirectEmotionType> targetList = new java.util.ArrayList<de.affect.xml.IndirectEmotionType>();
                      get_store().find_all_element_users(INDIRECTEMOTION$4, targetList);
                      de.affect.xml.IndirectEmotionType[] result = new de.affect.xml.IndirectEmotionType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "IndirectEmotion" element
                 */
                public de.affect.xml.IndirectEmotionType getIndirectEmotionArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectEmotionType target = null;
                      target = (de.affect.xml.IndirectEmotionType)get_store().find_element_user(INDIRECTEMOTION$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "IndirectEmotion" element
                 */
                public int sizeOfIndirectEmotionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDIRECTEMOTION$4);
                    }
                }
                
                /**
                 * Sets array of all "IndirectEmotion" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectEmotionArray(de.affect.xml.IndirectEmotionType[] indirectEmotionArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectEmotionArray, INDIRECTEMOTION$4);
                }
                
                /**
                 * Sets ith "IndirectEmotion" element
                 */
                public void setIndirectEmotionArray(int i, de.affect.xml.IndirectEmotionType indirectEmotion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectEmotionType target = null;
                      target = (de.affect.xml.IndirectEmotionType)get_store().find_element_user(INDIRECTEMOTION$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(indirectEmotion);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectEmotion" element
                 */
                public de.affect.xml.IndirectEmotionType insertNewIndirectEmotion(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectEmotionType target = null;
                      target = (de.affect.xml.IndirectEmotionType)get_store().insert_element_user(INDIRECTEMOTION$4, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectEmotion" element
                 */
                public de.affect.xml.IndirectEmotionType addNewIndirectEmotion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectEmotionType target = null;
                      target = (de.affect.xml.IndirectEmotionType)get_store().add_element_user(INDIRECTEMOTION$4);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "IndirectEmotion" element
                 */
                public void removeIndirectEmotion(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDIRECTEMOTION$4, i);
                    }
                }
                
                /**
                 * Gets a List of "IndirectMood" elements
                 */
                public java.util.List<de.affect.xml.IndirectMoodType> getIndirectMoodList()
                {
                    final class IndirectMoodList extends java.util.AbstractList<de.affect.xml.IndirectMoodType>
                    {
                      @Override
                      public de.affect.xml.IndirectMoodType get(int i)
                          { return AppraisalImpl.this.getIndirectMoodArray(i); }
                      
                      @Override
                      public de.affect.xml.IndirectMoodType set(int i, de.affect.xml.IndirectMoodType o)
                      {
                        de.affect.xml.IndirectMoodType old = AppraisalImpl.this.getIndirectMoodArray(i);
                        AppraisalImpl.this.setIndirectMoodArray(i, o);
                        return old;
                      }
                      
                      @Override
                      public void add(int i, de.affect.xml.IndirectMoodType o)
                          { AppraisalImpl.this.insertNewIndirectMood(i).set(o); }
                      
                      @Override
                      public de.affect.xml.IndirectMoodType remove(int i)
                      {
                        de.affect.xml.IndirectMoodType old = AppraisalImpl.this.getIndirectMoodArray(i);
                        AppraisalImpl.this.removeIndirectMood(i);
                        return old;
                      }
                      
                      @Override
                      public int size()
                          { return AppraisalImpl.this.sizeOfIndirectMoodArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new IndirectMoodList();
                    }
                }
                
                /**
                 * Gets array of all "IndirectMood" elements
                 * @deprecated
                 */
                @Deprecated
                public de.affect.xml.IndirectMoodType[] getIndirectMoodArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<de.affect.xml.IndirectMoodType> targetList = new java.util.ArrayList<de.affect.xml.IndirectMoodType>();
                      get_store().find_all_element_users(INDIRECTMOOD$6, targetList);
                      de.affect.xml.IndirectMoodType[] result = new de.affect.xml.IndirectMoodType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "IndirectMood" element
                 */
                public de.affect.xml.IndirectMoodType getIndirectMoodArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectMoodType target = null;
                      target = (de.affect.xml.IndirectMoodType)get_store().find_element_user(INDIRECTMOOD$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "IndirectMood" element
                 */
                public int sizeOfIndirectMoodArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INDIRECTMOOD$6);
                    }
                }
                
                /**
                 * Sets array of all "IndirectMood" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectMoodArray(de.affect.xml.IndirectMoodType[] indirectMoodArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectMoodArray, INDIRECTMOOD$6);
                }
                
                /**
                 * Sets ith "IndirectMood" element
                 */
                public void setIndirectMoodArray(int i, de.affect.xml.IndirectMoodType indirectMood)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectMoodType target = null;
                      target = (de.affect.xml.IndirectMoodType)get_store().find_element_user(INDIRECTMOOD$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(indirectMood);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "IndirectMood" element
                 */
                public de.affect.xml.IndirectMoodType insertNewIndirectMood(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectMoodType target = null;
                      target = (de.affect.xml.IndirectMoodType)get_store().insert_element_user(INDIRECTMOOD$6, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "IndirectMood" element
                 */
                public de.affect.xml.IndirectMoodType addNewIndirectMood()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.IndirectMoodType target = null;
                      target = (de.affect.xml.IndirectMoodType)get_store().add_element_user(INDIRECTMOOD$6);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "IndirectMood" element
                 */
                public void removeIndirectMood(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INDIRECTMOOD$6, i);
                    }
                }
                /**
                 * An XML Basic(@xml.affect.de).
                 *
                 * This is a complex type.
                 */
                public static class BasicImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic
                {
                    private static final long serialVersionUID = 1L;
                    
                    public BasicImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName GOODEVENT$0 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodEvent");
                    private static final javax.xml.namespace.QName GOODEVENTFORGOODOTHER$2 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodEventForGoodOther");
                    private static final javax.xml.namespace.QName GOODEVENTFORBADOTHER$4 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodEventForBadOther");
                    private static final javax.xml.namespace.QName BADEVENT$6 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadEvent");
                    private static final javax.xml.namespace.QName BADEVENTFORGOODOTHER$8 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadEventForGoodOther");
                    private static final javax.xml.namespace.QName BADEVENTFORBADOTHER$10 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadEventForBadOther");
                    private static final javax.xml.namespace.QName GOODLIKELYFUTUREEVENT$12 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodLikelyFutureEvent");
                    private static final javax.xml.namespace.QName GOODUNLIKELYFUTUREEVENT$14 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodUnlikelyFutureEvent");
                    private static final javax.xml.namespace.QName BADLIKELYFUTUREEVENT$16 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadLikelyFutureEvent");
                    private static final javax.xml.namespace.QName BADUNLIKELYFUTUREEVENT$18 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadUnlikelyFutureEvent");
                    private static final javax.xml.namespace.QName EVENTCONFIRMED$20 = 
                      new javax.xml.namespace.QName("xml.affect.de", "EventConfirmed");
                    private static final javax.xml.namespace.QName EVENTDISCONFIRMED$22 = 
                      new javax.xml.namespace.QName("xml.affect.de", "EventDisconfirmed");
                    private static final javax.xml.namespace.QName GOODACTSELF$24 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodActSelf");
                    private static final javax.xml.namespace.QName GOODACTOTHER$26 = 
                      new javax.xml.namespace.QName("xml.affect.de", "GoodActOther");
                    private static final javax.xml.namespace.QName BADACTSELF$28 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadActSelf");
                    private static final javax.xml.namespace.QName BADACTOTHER$30 = 
                      new javax.xml.namespace.QName("xml.affect.de", "BadActOther");
                    private static final javax.xml.namespace.QName NICETHING$32 = 
                      new javax.xml.namespace.QName("xml.affect.de", "NiceThing");
                    private static final javax.xml.namespace.QName NASTYTHING$34 = 
                      new javax.xml.namespace.QName("xml.affect.de", "NastyThing");
                    
                    
                    /**
                     * Gets the "GoodEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent getGoodEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent)get_store().find_element_user(GOODEVENT$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodEvent" element
                     */
                    public void setGoodEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent goodEvent)
                    {
                      generatedSetterHelperImpl(goodEvent, GOODEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent addNewGoodEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent)get_store().add_element_user(GOODEVENT$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodEventForGoodOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther getGoodEventForGoodOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther)get_store().find_element_user(GOODEVENTFORGOODOTHER$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodEventForGoodOther" element
                     */
                    public void setGoodEventForGoodOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther goodEventForGoodOther)
                    {
                      generatedSetterHelperImpl(goodEventForGoodOther, GOODEVENTFORGOODOTHER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodEventForGoodOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther addNewGoodEventForGoodOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther)get_store().add_element_user(GOODEVENTFORGOODOTHER$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodEventForBadOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther getGoodEventForBadOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther)get_store().find_element_user(GOODEVENTFORBADOTHER$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodEventForBadOther" element
                     */
                    public void setGoodEventForBadOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther goodEventForBadOther)
                    {
                      generatedSetterHelperImpl(goodEventForBadOther, GOODEVENTFORBADOTHER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodEventForBadOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther addNewGoodEventForBadOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther)get_store().add_element_user(GOODEVENTFORBADOTHER$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent getBadEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent)get_store().find_element_user(BADEVENT$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadEvent" element
                     */
                    public void setBadEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent badEvent)
                    {
                      generatedSetterHelperImpl(badEvent, BADEVENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent addNewBadEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent)get_store().add_element_user(BADEVENT$6);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadEventForGoodOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther getBadEventForGoodOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther)get_store().find_element_user(BADEVENTFORGOODOTHER$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadEventForGoodOther" element
                     */
                    public void setBadEventForGoodOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther badEventForGoodOther)
                    {
                      generatedSetterHelperImpl(badEventForGoodOther, BADEVENTFORGOODOTHER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadEventForGoodOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther addNewBadEventForGoodOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther)get_store().add_element_user(BADEVENTFORGOODOTHER$8);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadEventForBadOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther getBadEventForBadOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther)get_store().find_element_user(BADEVENTFORBADOTHER$10, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadEventForBadOther" element
                     */
                    public void setBadEventForBadOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther badEventForBadOther)
                    {
                      generatedSetterHelperImpl(badEventForBadOther, BADEVENTFORBADOTHER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadEventForBadOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther addNewBadEventForBadOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther)get_store().add_element_user(BADEVENTFORBADOTHER$10);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodLikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent getGoodLikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent)get_store().find_element_user(GOODLIKELYFUTUREEVENT$12, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodLikelyFutureEvent" element
                     */
                    public void setGoodLikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent goodLikelyFutureEvent)
                    {
                      generatedSetterHelperImpl(goodLikelyFutureEvent, GOODLIKELYFUTUREEVENT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodLikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent addNewGoodLikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent)get_store().add_element_user(GOODLIKELYFUTUREEVENT$12);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodUnlikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent getGoodUnlikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent)get_store().find_element_user(GOODUNLIKELYFUTUREEVENT$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodUnlikelyFutureEvent" element
                     */
                    public void setGoodUnlikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent goodUnlikelyFutureEvent)
                    {
                      generatedSetterHelperImpl(goodUnlikelyFutureEvent, GOODUNLIKELYFUTUREEVENT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodUnlikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent addNewGoodUnlikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent)get_store().add_element_user(GOODUNLIKELYFUTUREEVENT$14);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadLikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent getBadLikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent)get_store().find_element_user(BADLIKELYFUTUREEVENT$16, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadLikelyFutureEvent" element
                     */
                    public void setBadLikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent badLikelyFutureEvent)
                    {
                      generatedSetterHelperImpl(badLikelyFutureEvent, BADLIKELYFUTUREEVENT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadLikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent addNewBadLikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent)get_store().add_element_user(BADLIKELYFUTUREEVENT$16);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadUnlikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent getBadUnlikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent)get_store().find_element_user(BADUNLIKELYFUTUREEVENT$18, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadUnlikelyFutureEvent" element
                     */
                    public void setBadUnlikelyFutureEvent(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent badUnlikelyFutureEvent)
                    {
                      generatedSetterHelperImpl(badUnlikelyFutureEvent, BADUNLIKELYFUTUREEVENT$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadUnlikelyFutureEvent" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent addNewBadUnlikelyFutureEvent()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent)get_store().add_element_user(BADUNLIKELYFUTUREEVENT$18);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "EventConfirmed" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed getEventConfirmed()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed)get_store().find_element_user(EVENTCONFIRMED$20, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "EventConfirmed" element
                     */
                    public void setEventConfirmed(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed eventConfirmed)
                    {
                      generatedSetterHelperImpl(eventConfirmed, EVENTCONFIRMED$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "EventConfirmed" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed addNewEventConfirmed()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed)get_store().add_element_user(EVENTCONFIRMED$20);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "EventDisconfirmed" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed getEventDisconfirmed()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed)get_store().find_element_user(EVENTDISCONFIRMED$22, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "EventDisconfirmed" element
                     */
                    public void setEventDisconfirmed(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed eventDisconfirmed)
                    {
                      generatedSetterHelperImpl(eventDisconfirmed, EVENTDISCONFIRMED$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "EventDisconfirmed" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed addNewEventDisconfirmed()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed)get_store().add_element_user(EVENTDISCONFIRMED$22);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodActSelf" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf getGoodActSelf()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf)get_store().find_element_user(GOODACTSELF$24, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodActSelf" element
                     */
                    public void setGoodActSelf(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf goodActSelf)
                    {
                      generatedSetterHelperImpl(goodActSelf, GOODACTSELF$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodActSelf" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf addNewGoodActSelf()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf)get_store().add_element_user(GOODACTSELF$24);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "GoodActOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther getGoodActOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther)get_store().find_element_user(GOODACTOTHER$26, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "GoodActOther" element
                     */
                    public void setGoodActOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther goodActOther)
                    {
                      generatedSetterHelperImpl(goodActOther, GOODACTOTHER$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "GoodActOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther addNewGoodActOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther)get_store().add_element_user(GOODACTOTHER$26);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadActSelf" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf getBadActSelf()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf)get_store().find_element_user(BADACTSELF$28, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadActSelf" element
                     */
                    public void setBadActSelf(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf badActSelf)
                    {
                      generatedSetterHelperImpl(badActSelf, BADACTSELF$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadActSelf" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf addNewBadActSelf()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf)get_store().add_element_user(BADACTSELF$28);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "BadActOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther getBadActOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther)get_store().find_element_user(BADACTOTHER$30, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "BadActOther" element
                     */
                    public void setBadActOther(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther badActOther)
                    {
                      generatedSetterHelperImpl(badActOther, BADACTOTHER$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "BadActOther" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther addNewBadActOther()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther)get_store().add_element_user(BADACTOTHER$30);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "NiceThing" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing getNiceThing()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing)get_store().find_element_user(NICETHING$32, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "NiceThing" element
                     */
                    public void setNiceThing(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing niceThing)
                    {
                      generatedSetterHelperImpl(niceThing, NICETHING$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "NiceThing" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing addNewNiceThing()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing)get_store().add_element_user(NICETHING$32);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "NastyThing" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing getNastyThing()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing)get_store().find_element_user(NASTYTHING$34, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "NastyThing" element
                     */
                    public void setNastyThing(de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing nastyThing)
                    {
                      generatedSetterHelperImpl(nastyThing, NASTYTHING$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "NastyThing" element
                     */
                    public de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing addNewNastyThing()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing target = null;
                        target = (de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing)get_store().add_element_user(NASTYTHING$34);
                        return target;
                      }
                    }
                    /**
                     * An XML GoodEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                    }
                    /**
                     * An XML GoodEventForGoodOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodEventForGoodOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForGoodOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodEventForGoodOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName DESIRABILITY$2 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKING$4 = 
                        new javax.xml.namespace.QName("", "liking");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      public java.lang.String getLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      public de.affect.xml.Liking xgetLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Liking target = null;
                          target = (de.affect.xml.Liking)get_store().find_attribute_user(LIKING$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      public void setLiking(java.lang.String liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$4);
                          }
                          target.setStringValue(liking);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      public void xsetLiking(de.affect.xml.Liking liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Liking target = null;
                          target = (de.affect.xml.Liking)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (de.affect.xml.Liking)get_store().add_attribute_user(LIKING$4);
                          }
                          target.set(liking);
                        }
                      }
                    }
                    /**
                     * An XML GoodEventForBadOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodEventForBadOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodEventForBadOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodEventForBadOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName DESIRABILITY$2 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKING$4 = 
                        new javax.xml.namespace.QName("", "liking");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      public java.lang.String getLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      public de.affect.xml.Disliking xgetLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disliking target = null;
                          target = (de.affect.xml.Disliking)get_store().find_attribute_user(LIKING$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      public void setLiking(java.lang.String liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$4);
                          }
                          target.setStringValue(liking);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      public void xsetLiking(de.affect.xml.Disliking liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disliking target = null;
                          target = (de.affect.xml.Disliking)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (de.affect.xml.Disliking)get_store().add_attribute_user(LIKING$4);
                          }
                          target.set(liking);
                        }
                      }
                    }
                    /**
                     * An XML BadEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                    }
                    /**
                     * An XML BadEventForGoodOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadEventForGoodOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForGoodOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadEventForGoodOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName DESIRABILITY$2 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKING$4 = 
                        new javax.xml.namespace.QName("", "liking");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      public java.lang.String getLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      public de.affect.xml.Liking xgetLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Liking target = null;
                          target = (de.affect.xml.Liking)get_store().find_attribute_user(LIKING$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      public void setLiking(java.lang.String liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$4);
                          }
                          target.setStringValue(liking);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      public void xsetLiking(de.affect.xml.Liking liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Liking target = null;
                          target = (de.affect.xml.Liking)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (de.affect.xml.Liking)get_store().add_attribute_user(LIKING$4);
                          }
                          target.set(liking);
                        }
                      }
                    }
                    /**
                     * An XML BadEventForBadOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadEventForBadOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadEventForBadOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadEventForBadOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName DESIRABILITY$2 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKING$4 = 
                        new javax.xml.namespace.QName("", "liking");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$2);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "liking" attribute
                       */
                      public java.lang.String getLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "liking" attribute
                       */
                      public de.affect.xml.Disliking xgetLiking()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disliking target = null;
                          target = (de.affect.xml.Disliking)get_store().find_attribute_user(LIKING$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "liking" attribute
                       */
                      public void setLiking(java.lang.String liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$4);
                          }
                          target.setStringValue(liking);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "liking" attribute
                       */
                      public void xsetLiking(de.affect.xml.Disliking liking)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disliking target = null;
                          target = (de.affect.xml.Disliking)get_store().find_attribute_user(LIKING$4);
                          if (target == null)
                          {
                            target = (de.affect.xml.Disliking)get_store().add_attribute_user(LIKING$4);
                          }
                          target.set(liking);
                        }
                      }
                    }
                    /**
                     * An XML GoodLikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodLikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodLikelyFutureEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodLikelyFutureEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKELIHOOD$2 = 
                        new javax.xml.namespace.QName("", "likelihood");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      public java.lang.String getLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      public de.affect.xml.Likelihood xgetLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Likelihood target = null;
                          target = (de.affect.xml.Likelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      public void setLikelihood(java.lang.String likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.setStringValue(likelihood);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      public void xsetLikelihood(de.affect.xml.Likelihood likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Likelihood target = null;
                          target = (de.affect.xml.Likelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Likelihood)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.set(likelihood);
                        }
                      }
                    }
                    /**
                     * An XML GoodUnlikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodUnlikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodUnlikelyFutureEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodUnlikelyFutureEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKELIHOOD$2 = 
                        new javax.xml.namespace.QName("", "likelihood");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Desirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Desirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Desirability target = null;
                          target = (de.affect.xml.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Desirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      public java.lang.String getLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      public de.affect.xml.Unlikelihood xgetLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Unlikelihood target = null;
                          target = (de.affect.xml.Unlikelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      public void setLikelihood(java.lang.String likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.setStringValue(likelihood);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      public void xsetLikelihood(de.affect.xml.Unlikelihood likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Unlikelihood target = null;
                          target = (de.affect.xml.Unlikelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Unlikelihood)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.set(likelihood);
                        }
                      }
                    }
                    /**
                     * An XML BadLikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadLikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadLikelyFutureEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadLikelyFutureEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKELIHOOD$2 = 
                        new javax.xml.namespace.QName("", "likelihood");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      public java.lang.String getLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      public de.affect.xml.Likelihood xgetLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Likelihood target = null;
                          target = (de.affect.xml.Likelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      public void setLikelihood(java.lang.String likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.setStringValue(likelihood);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      public void xsetLikelihood(de.affect.xml.Likelihood likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Likelihood target = null;
                          target = (de.affect.xml.Likelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Likelihood)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.set(likelihood);
                        }
                      }
                    }
                    /**
                     * An XML BadUnlikelyFutureEvent(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadUnlikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadUnlikelyFutureEvent
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadUnlikelyFutureEventImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                        new javax.xml.namespace.QName("", "desirability");
                      private static final javax.xml.namespace.QName LIKELIHOOD$2 = 
                        new javax.xml.namespace.QName("", "likelihood");
                      
                      
                      /**
                       * Gets the "desirability" attribute
                       */
                      public java.lang.String getDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "desirability" attribute
                       */
                      public de.affect.xml.Undesirability xgetDesirability()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "desirability" attribute
                       */
                      public void setDesirability(java.lang.String desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.setStringValue(desirability);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "desirability" attribute
                       */
                      public void xsetDesirability(de.affect.xml.Undesirability desirability)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Undesirability target = null;
                          target = (de.affect.xml.Undesirability)get_store().find_attribute_user(DESIRABILITY$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Undesirability)get_store().add_attribute_user(DESIRABILITY$0);
                          }
                          target.set(desirability);
                        }
                      }
                      
                      /**
                       * Gets the "likelihood" attribute
                       */
                      public java.lang.String getLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "likelihood" attribute
                       */
                      public de.affect.xml.Unlikelihood xgetLikelihood()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Unlikelihood target = null;
                          target = (de.affect.xml.Unlikelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "likelihood" attribute
                       */
                      public void setLikelihood(java.lang.String likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.setStringValue(likelihood);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "likelihood" attribute
                       */
                      public void xsetLikelihood(de.affect.xml.Unlikelihood likelihood)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Unlikelihood target = null;
                          target = (de.affect.xml.Unlikelihood)get_store().find_attribute_user(LIKELIHOOD$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Unlikelihood)get_store().add_attribute_user(LIKELIHOOD$2);
                          }
                          target.set(likelihood);
                        }
                      }
                    }
                    /**
                     * An XML EventConfirmed(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class EventConfirmedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventConfirmed
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public EventConfirmedImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName REALIZATION$0 = 
                        new javax.xml.namespace.QName("", "realization");
                      
                      
                      /**
                       * Gets the "realization" attribute
                       */
                      public java.lang.String getRealization()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REALIZATION$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "realization" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetRealization()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(REALIZATION$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "realization" attribute
                       */
                      public void setRealization(java.lang.String realization)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REALIZATION$0);
                          }
                          target.setStringValue(realization);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "realization" attribute
                       */
                      public void xsetRealization(org.apache.xmlbeans.XmlString realization)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REALIZATION$0);
                          }
                          target.set(realization);
                        }
                      }
                    }
                    /**
                     * An XML EventDisconfirmed(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class EventDisconfirmedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.EventDisconfirmed
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public EventDisconfirmedImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName REALIZATION$0 = 
                        new javax.xml.namespace.QName("", "realization");
                      
                      
                      /**
                       * Gets the "realization" attribute
                       */
                      public java.lang.String getRealization()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REALIZATION$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "realization" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetRealization()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(REALIZATION$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "realization" attribute
                       */
                      public void setRealization(java.lang.String realization)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REALIZATION$0);
                          }
                          target.setStringValue(realization);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "realization" attribute
                       */
                      public void xsetRealization(org.apache.xmlbeans.XmlString realization)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REALIZATION$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REALIZATION$0);
                          }
                          target.set(realization);
                        }
                      }
                    }
                    /**
                     * An XML GoodActSelf(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodActSelfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActSelf
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodActSelfImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                        new javax.xml.namespace.QName("", "praiseworthiness");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      public java.lang.String getPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      public de.affect.xml.Praiseworthiness xgetPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Praiseworthiness target = null;
                          target = (de.affect.xml.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      public void setPraiseworthiness(java.lang.String praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.setStringValue(praiseworthiness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      public void xsetPraiseworthiness(de.affect.xml.Praiseworthiness praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Praiseworthiness target = null;
                          target = (de.affect.xml.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Praiseworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.set(praiseworthiness);
                        }
                      }
                    }
                    /**
                     * An XML GoodActOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class GoodActOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.GoodActOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public GoodActOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                        new javax.xml.namespace.QName("", "praiseworthiness");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      public java.lang.String getPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      public de.affect.xml.Praiseworthiness xgetPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Praiseworthiness target = null;
                          target = (de.affect.xml.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      public void setPraiseworthiness(java.lang.String praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.setStringValue(praiseworthiness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      public void xsetPraiseworthiness(de.affect.xml.Praiseworthiness praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Praiseworthiness target = null;
                          target = (de.affect.xml.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Praiseworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.set(praiseworthiness);
                        }
                      }
                    }
                    /**
                     * An XML BadActSelf(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadActSelfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActSelf
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadActSelfImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                        new javax.xml.namespace.QName("", "praiseworthiness");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      public java.lang.String getPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      public de.affect.xml.Blameworthiness xgetPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Blameworthiness target = null;
                          target = (de.affect.xml.Blameworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      public void setPraiseworthiness(java.lang.String praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.setStringValue(praiseworthiness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      public void xsetPraiseworthiness(de.affect.xml.Blameworthiness praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Blameworthiness target = null;
                          target = (de.affect.xml.Blameworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Blameworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.set(praiseworthiness);
                        }
                      }
                    }
                    /**
                     * An XML BadActOther(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class BadActOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.BadActOther
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public BadActOtherImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName AGENCY$0 = 
                        new javax.xml.namespace.QName("", "agency");
                      private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                        new javax.xml.namespace.QName("", "praiseworthiness");
                      
                      
                      /**
                       * Gets the "agency" attribute
                       */
                      public java.lang.String getAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCY$0);
                          }
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "agency" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetAgency()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AGENCY$0);
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "agency" attribute
                       */
                      public void setAgency(java.lang.String agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.setStringValue(agency);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "agency" attribute
                       */
                      public void xsetAgency(org.apache.xmlbeans.XmlString agency)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENCY$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENCY$0);
                          }
                          target.set(agency);
                        }
                      }
                      
                      /**
                       * Gets the "praiseworthiness" attribute
                       */
                      public java.lang.String getPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "praiseworthiness" attribute
                       */
                      public de.affect.xml.Blameworthiness xgetPraiseworthiness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Blameworthiness target = null;
                          target = (de.affect.xml.Blameworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "praiseworthiness" attribute
                       */
                      public void setPraiseworthiness(java.lang.String praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.setStringValue(praiseworthiness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "praiseworthiness" attribute
                       */
                      public void xsetPraiseworthiness(de.affect.xml.Blameworthiness praiseworthiness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Blameworthiness target = null;
                          target = (de.affect.xml.Blameworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                          if (target == null)
                          {
                            target = (de.affect.xml.Blameworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                          }
                          target.set(praiseworthiness);
                        }
                      }
                    }
                    /**
                     * An XML NiceThing(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class NiceThingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NiceThing
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NiceThingImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName APPEALINGNESS$0 = 
                        new javax.xml.namespace.QName("", "appealingness");
                      
                      
                      /**
                       * Gets the "appealingness" attribute
                       */
                      public java.lang.String getAppealingness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "appealingness" attribute
                       */
                      public de.affect.xml.Appealingness xgetAppealingness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Appealingness target = null;
                          target = (de.affect.xml.Appealingness)get_store().find_attribute_user(APPEALINGNESS$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "appealingness" attribute
                       */
                      public void setAppealingness(java.lang.String appealingness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPEALINGNESS$0);
                          }
                          target.setStringValue(appealingness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "appealingness" attribute
                       */
                      public void xsetAppealingness(de.affect.xml.Appealingness appealingness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Appealingness target = null;
                          target = (de.affect.xml.Appealingness)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Appealingness)get_store().add_attribute_user(APPEALINGNESS$0);
                          }
                          target.set(appealingness);
                        }
                      }
                    }
                    /**
                     * An XML NastyThing(@xml.affect.de).
                     *
                     * This is a complex type.
                     */
                    public static class NastyThingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectDefinitionDocument.AffectDefinition.GroupAffect.Appraisal.Basic.NastyThing
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NastyThingImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName APPEALINGNESS$0 = 
                        new javax.xml.namespace.QName("", "appealingness");
                      
                      
                      /**
                       * Gets the "appealingness" attribute
                       */
                      public java.lang.String getAppealingness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "appealingness" attribute
                       */
                      public de.affect.xml.Disappealingness xgetAppealingness()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disappealingness target = null;
                          target = (de.affect.xml.Disappealingness)get_store().find_attribute_user(APPEALINGNESS$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "appealingness" attribute
                       */
                      public void setAppealingness(java.lang.String appealingness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPEALINGNESS$0);
                          }
                          target.setStringValue(appealingness);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "appealingness" attribute
                       */
                      public void xsetAppealingness(de.affect.xml.Disappealingness appealingness)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          de.affect.xml.Disappealingness target = null;
                          target = (de.affect.xml.Disappealingness)get_store().find_attribute_user(APPEALINGNESS$0);
                          if (target == null)
                          {
                            target = (de.affect.xml.Disappealingness)get_store().add_attribute_user(APPEALINGNESS$0);
                          }
                          target.set(appealingness);
                        }
                      }
                    }
                }
            }
        }
    }
}
