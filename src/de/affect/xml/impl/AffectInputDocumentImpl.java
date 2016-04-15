/*
 * An XML document type.
 * Localname: AffectInput
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectInputDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * A document containing one AffectInput(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public class AffectInputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument
{
    private static final long serialVersionUID = 1L;
    
    public AffectInputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFECTINPUT$0 = 
        new javax.xml.namespace.QName("xml.affect.de", "AffectInput");
    
    
    /**
     * Gets the "AffectInput" element
     */
    public de.affect.xml.AffectInputDocument.AffectInput getAffectInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectInputDocument.AffectInput target = null;
            target = (de.affect.xml.AffectInputDocument.AffectInput)get_store().find_element_user(AFFECTINPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffectInput" element
     */
    public void setAffectInput(de.affect.xml.AffectInputDocument.AffectInput affectInput)
    {
        generatedSetterHelperImpl(affectInput, AFFECTINPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AffectInput" element
     */
    public de.affect.xml.AffectInputDocument.AffectInput addNewAffectInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectInputDocument.AffectInput target = null;
            target = (de.affect.xml.AffectInputDocument.AffectInput)get_store().add_element_user(AFFECTINPUT$0);
            return target;
        }
    }
    /**
     * An XML AffectInput(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class AffectInputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput
    {
        private static final long serialVersionUID = 1L;
        
        public AffectInputImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHARACTER$0 = 
            new javax.xml.namespace.QName("xml.affect.de", "Character");
        private static final javax.xml.namespace.QName ACT$2 = 
            new javax.xml.namespace.QName("xml.affect.de", "Act");
        private static final javax.xml.namespace.QName EMOTIONDISPLAY$4 = 
            new javax.xml.namespace.QName("xml.affect.de", "EmotionDisplay");
        private static final javax.xml.namespace.QName MOODDISPLAY$6 = 
            new javax.xml.namespace.QName("xml.affect.de", "MoodDisplay");
        private static final javax.xml.namespace.QName ACTION$8 = 
            new javax.xml.namespace.QName("xml.affect.de", "Action");
        private static final javax.xml.namespace.QName EVENT$10 = 
            new javax.xml.namespace.QName("xml.affect.de", "Event");
        private static final javax.xml.namespace.QName OBJECT$12 = 
            new javax.xml.namespace.QName("xml.affect.de", "Object");
        private static final javax.xml.namespace.QName BASICEEC$14 = 
            new javax.xml.namespace.QName("xml.affect.de", "BasicEEC");
        private static final javax.xml.namespace.QName PAD$16 = 
            new javax.xml.namespace.QName("xml.affect.de", "PAD");
        
        
        /**
         * Gets the "Character" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Character getCharacter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Character target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Character)get_store().find_element_user(CHARACTER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Character" element
         */
        public void setCharacter(de.affect.xml.AffectInputDocument.AffectInput.Character character)
        {
            generatedSetterHelperImpl(character, CHARACTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Character" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Character addNewCharacter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Character target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Character)get_store().add_element_user(CHARACTER$0);
                return target;
            }
        }
        
        /**
         * Gets the "Act" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Act getAct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Act target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Act)get_store().find_element_user(ACT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Act" element
         */
        public boolean isSetAct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACT$2) != 0;
            }
        }
        
        /**
         * Sets the "Act" element
         */
        public void setAct(de.affect.xml.AffectInputDocument.AffectInput.Act act)
        {
            generatedSetterHelperImpl(act, ACT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Act" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Act addNewAct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Act target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Act)get_store().add_element_user(ACT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Act" element
         */
        public void unsetAct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACT$2, 0);
            }
        }
        
        /**
         * Gets the "EmotionDisplay" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay getEmotionDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay)get_store().find_element_user(EMOTIONDISPLAY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EmotionDisplay" element
         */
        public boolean isSetEmotionDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMOTIONDISPLAY$4) != 0;
            }
        }
        
        /**
         * Sets the "EmotionDisplay" element
         */
        public void setEmotionDisplay(de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay emotionDisplay)
        {
            generatedSetterHelperImpl(emotionDisplay, EMOTIONDISPLAY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "EmotionDisplay" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay addNewEmotionDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay)get_store().add_element_user(EMOTIONDISPLAY$4);
                return target;
            }
        }
        
        /**
         * Unsets the "EmotionDisplay" element
         */
        public void unsetEmotionDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMOTIONDISPLAY$4, 0);
            }
        }
        
        /**
         * Gets the "MoodDisplay" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay getMoodDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay)get_store().find_element_user(MOODDISPLAY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "MoodDisplay" element
         */
        public boolean isSetMoodDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOODDISPLAY$6) != 0;
            }
        }
        
        /**
         * Sets the "MoodDisplay" element
         */
        public void setMoodDisplay(de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay moodDisplay)
        {
            generatedSetterHelperImpl(moodDisplay, MOODDISPLAY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "MoodDisplay" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay addNewMoodDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay)get_store().add_element_user(MOODDISPLAY$6);
                return target;
            }
        }
        
        /**
         * Unsets the "MoodDisplay" element
         */
        public void unsetMoodDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOODDISPLAY$6, 0);
            }
        }
        
        /**
         * Gets the "Action" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Action getAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Action target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Action)get_store().find_element_user(ACTION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Action" element
         */
        public boolean isSetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTION$8) != 0;
            }
        }
        
        /**
         * Sets the "Action" element
         */
        public void setAction(de.affect.xml.AffectInputDocument.AffectInput.Action action)
        {
            generatedSetterHelperImpl(action, ACTION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Action" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Action addNewAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Action target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Action)get_store().add_element_user(ACTION$8);
                return target;
            }
        }
        
        /**
         * Unsets the "Action" element
         */
        public void unsetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTION$8, 0);
            }
        }
        
        /**
         * Gets the "Event" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Event getEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Event target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Event)get_store().find_element_user(EVENT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Event" element
         */
        public boolean isSetEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENT$10) != 0;
            }
        }
        
        /**
         * Sets the "Event" element
         */
        public void setEvent(de.affect.xml.AffectInputDocument.AffectInput.Event event)
        {
            generatedSetterHelperImpl(event, EVENT$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Event" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Event addNewEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Event target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Event)get_store().add_element_user(EVENT$10);
                return target;
            }
        }
        
        /**
         * Unsets the "Event" element
         */
        public void unsetEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENT$10, 0);
            }
        }
        
        /**
         * Gets the "Object" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Object getObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Object target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Object)get_store().find_element_user(OBJECT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Object" element
         */
        public boolean isSetObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECT$12) != 0;
            }
        }
        
        /**
         * Sets the "Object" element
         */
        public void setObject(de.affect.xml.AffectInputDocument.AffectInput.Object object)
        {
            generatedSetterHelperImpl(object, OBJECT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Object" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.Object addNewObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.Object target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.Object)get_store().add_element_user(OBJECT$12);
                return target;
            }
        }
        
        /**
         * Unsets the "Object" element
         */
        public void unsetObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECT$12, 0);
            }
        }
        
        /**
         * Gets the "BasicEEC" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC getBasicEEC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.BasicEEC target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC)get_store().find_element_user(BASICEEC$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BasicEEC" element
         */
        public boolean isSetBasicEEC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BASICEEC$14) != 0;
            }
        }
        
        /**
         * Sets the "BasicEEC" element
         */
        public void setBasicEEC(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC basicEEC)
        {
            generatedSetterHelperImpl(basicEEC, BASICEEC$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "BasicEEC" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC addNewBasicEEC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.BasicEEC target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC)get_store().add_element_user(BASICEEC$14);
                return target;
            }
        }
        
        /**
         * Unsets the "BasicEEC" element
         */
        public void unsetBasicEEC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BASICEEC$14, 0);
            }
        }
        
        /**
         * Gets the "PAD" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.PAD getPAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.PAD target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.PAD)get_store().find_element_user(PAD$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PAD" element
         */
        public boolean isSetPAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PAD$16) != 0;
            }
        }
        
        /**
         * Sets the "PAD" element
         */
        public void setPAD(de.affect.xml.AffectInputDocument.AffectInput.PAD pad)
        {
            generatedSetterHelperImpl(pad, PAD$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PAD" element
         */
        public de.affect.xml.AffectInputDocument.AffectInput.PAD addNewPAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectInputDocument.AffectInput.PAD target = null;
                target = (de.affect.xml.AffectInputDocument.AffectInput.PAD)get_store().add_element_user(PAD$16);
                return target;
            }
        }
        
        /**
         * Unsets the "PAD" element
         */
        public void unsetPAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PAD$16, 0);
            }
        }
        /**
         * An XML Character(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class CharacterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.Character
        {
            private static final long serialVersionUID = 1L;
            
            public CharacterImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("", "name");
            
            
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
            public de.affect.xml.AffectInputDocument.AffectInput.Character.Name xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.Character.Name target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.Character.Name)get_store().find_attribute_user(NAME$0);
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
            public void xsetName(de.affect.xml.AffectInputDocument.AffectInput.Character.Name name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.Character.Name target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.Character.Name)get_store().find_attribute_user(NAME$0);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.Character.Name)get_store().add_attribute_user(NAME$0);
                    }
                    target.set(name);
                }
            }
            /**
             * An XML name(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$Character$Name.
             */
            public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.Character.Name
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
         * An XML Act(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class ActImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.Act
        {
            private static final long serialVersionUID = 1L;
            
            public ActImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ADDRESSEE$0 = 
                new javax.xml.namespace.QName("", "addressee");
            private static final javax.xml.namespace.QName LISTENER$2 = 
                new javax.xml.namespace.QName("", "listener");
            private static final javax.xml.namespace.QName TYPE$4 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName INTENSITY$6 = 
                new javax.xml.namespace.QName("", "intensity");
            private static final javax.xml.namespace.QName ELICITOR$8 = 
                new javax.xml.namespace.QName("", "elicitor");
            
            
            /**
             * Gets the "addressee" attribute
             */
            public java.lang.String getAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "addressee" attribute
             */
            public org.apache.xmlbeans.XmlString xgetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESSEE$0);
                    return target;
                }
            }
            
            /**
             * True if has "addressee" attribute
             */
            public boolean isSetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ADDRESSEE$0) != null;
                }
            }
            
            /**
             * Sets the "addressee" attribute
             */
            public void setAddressee(java.lang.String addressee)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSEE$0);
                    }
                    target.setStringValue(addressee);
                }
            }
            
            /**
             * Sets (as xml) the "addressee" attribute
             */
            public void xsetAddressee(org.apache.xmlbeans.XmlString addressee)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESSEE$0);
                    }
                    target.set(addressee);
                }
            }
            
            /**
             * Unsets the "addressee" attribute
             */
            public void unsetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ADDRESSEE$0);
                }
            }
            
            /**
             * Gets the "listener" attribute
             */
            public java.lang.String getListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "listener" attribute
             */
            public org.apache.xmlbeans.XmlString xgetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENER$2);
                    return target;
                }
            }
            
            /**
             * True if has "listener" attribute
             */
            public boolean isSetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LISTENER$2) != null;
                }
            }
            
            /**
             * Sets the "listener" attribute
             */
            public void setListener(java.lang.String listener)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTENER$2);
                    }
                    target.setStringValue(listener);
                }
            }
            
            /**
             * Sets (as xml) the "listener" attribute
             */
            public void xsetListener(org.apache.xmlbeans.XmlString listener)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LISTENER$2);
                    }
                    target.set(listener);
                }
            }
            
            /**
             * Unsets the "listener" attribute
             */
            public void unsetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LISTENER$2);
                }
            }
            
            /**
             * Gets the "type" attribute
             */
            public java.lang.String getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public org.apache.xmlbeans.XmlString xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(java.lang.String type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                    }
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(org.apache.xmlbeans.XmlString type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Gets the "intensity" attribute
             */
            public java.lang.String getIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "intensity" attribute
             */
            public de.affect.xml.Intensity xgetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$6);
                    return target;
                }
            }
            
            /**
             * True if has "intensity" attribute
             */
            public boolean isSetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INTENSITY$6) != null;
                }
            }
            
            /**
             * Sets the "intensity" attribute
             */
            public void setIntensity(java.lang.String intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTENSITY$6);
                    }
                    target.setStringValue(intensity);
                }
            }
            
            /**
             * Sets (as xml) the "intensity" attribute
             */
            public void xsetIntensity(de.affect.xml.Intensity intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      target = (de.affect.xml.Intensity)get_store().add_attribute_user(INTENSITY$6);
                    }
                    target.set(intensity);
                }
            }
            
            /**
             * Unsets the "intensity" attribute
             */
            public void unsetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INTENSITY$6);
                }
            }
            
            /**
             * Gets the "elicitor" attribute
             */
            public java.lang.String getElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "elicitor" attribute
             */
            public org.apache.xmlbeans.XmlString xgetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$8);
                    return target;
                }
            }
            
            /**
             * True if has "elicitor" attribute
             */
            public boolean isSetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ELICITOR$8) != null;
                }
            }
            
            /**
             * Sets the "elicitor" attribute
             */
            public void setElicitor(java.lang.String elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELICITOR$8);
                    }
                    target.setStringValue(elicitor);
                }
            }
            
            /**
             * Sets (as xml) the "elicitor" attribute
             */
            public void xsetElicitor(org.apache.xmlbeans.XmlString elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELICITOR$8);
                    }
                    target.set(elicitor);
                }
            }
            
            /**
             * Unsets the "elicitor" attribute
             */
            public void unsetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ELICITOR$8);
                }
            }
        }
        /**
         * An XML EmotionDisplay(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class EmotionDisplayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.EmotionDisplay
        {
            private static final long serialVersionUID = 1L;
            
            public EmotionDisplayImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ADDRESSEE$0 = 
                new javax.xml.namespace.QName("", "addressee");
            private static final javax.xml.namespace.QName LISTENER$2 = 
                new javax.xml.namespace.QName("", "listener");
            private static final javax.xml.namespace.QName TYPE$4 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName INTENSITY$6 = 
                new javax.xml.namespace.QName("", "intensity");
            private static final javax.xml.namespace.QName ELICITOR$8 = 
                new javax.xml.namespace.QName("", "elicitor");
            
            
            /**
             * Gets the "addressee" attribute
             */
            public java.lang.String getAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "addressee" attribute
             */
            public org.apache.xmlbeans.XmlString xgetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESSEE$0);
                    return target;
                }
            }
            
            /**
             * True if has "addressee" attribute
             */
            public boolean isSetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ADDRESSEE$0) != null;
                }
            }
            
            /**
             * Sets the "addressee" attribute
             */
            public void setAddressee(java.lang.String addressee)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSEE$0);
                    }
                    target.setStringValue(addressee);
                }
            }
            
            /**
             * Sets (as xml) the "addressee" attribute
             */
            public void xsetAddressee(org.apache.xmlbeans.XmlString addressee)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESSEE$0);
                    }
                    target.set(addressee);
                }
            }
            
            /**
             * Unsets the "addressee" attribute
             */
            public void unsetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ADDRESSEE$0);
                }
            }
            
            /**
             * Gets the "listener" attribute
             */
            public java.lang.String getListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "listener" attribute
             */
            public org.apache.xmlbeans.XmlString xgetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENER$2);
                    return target;
                }
            }
            
            /**
             * True if has "listener" attribute
             */
            public boolean isSetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LISTENER$2) != null;
                }
            }
            
            /**
             * Sets the "listener" attribute
             */
            public void setListener(java.lang.String listener)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTENER$2);
                    }
                    target.setStringValue(listener);
                }
            }
            
            /**
             * Sets (as xml) the "listener" attribute
             */
            public void xsetListener(org.apache.xmlbeans.XmlString listener)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LISTENER$2);
                    }
                    target.set(listener);
                }
            }
            
            /**
             * Unsets the "listener" attribute
             */
            public void unsetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LISTENER$2);
                }
            }
            
            /**
             * Gets the "type" attribute
             */
            public de.affect.xml.EmotionName.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return (de.affect.xml.EmotionName.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public de.affect.xml.EmotionName xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.EmotionName target = null;
                    target = (de.affect.xml.EmotionName)get_store().find_attribute_user(TYPE$4);
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(de.affect.xml.EmotionName.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(de.affect.xml.EmotionName type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.EmotionName target = null;
                    target = (de.affect.xml.EmotionName)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (de.affect.xml.EmotionName)get_store().add_attribute_user(TYPE$4);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Gets the "intensity" attribute
             */
            public java.lang.String getIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "intensity" attribute
             */
            public de.affect.xml.Intensity xgetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$6);
                    return target;
                }
            }
            
            /**
             * True if has "intensity" attribute
             */
            public boolean isSetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INTENSITY$6) != null;
                }
            }
            
            /**
             * Sets the "intensity" attribute
             */
            public void setIntensity(java.lang.String intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTENSITY$6);
                    }
                    target.setStringValue(intensity);
                }
            }
            
            /**
             * Sets (as xml) the "intensity" attribute
             */
            public void xsetIntensity(de.affect.xml.Intensity intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      target = (de.affect.xml.Intensity)get_store().add_attribute_user(INTENSITY$6);
                    }
                    target.set(intensity);
                }
            }
            
            /**
             * Unsets the "intensity" attribute
             */
            public void unsetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INTENSITY$6);
                }
            }
            
            /**
             * Gets the "elicitor" attribute
             */
            public java.lang.String getElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "elicitor" attribute
             */
            public org.apache.xmlbeans.XmlString xgetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$8);
                    return target;
                }
            }
            
            /**
             * True if has "elicitor" attribute
             */
            public boolean isSetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ELICITOR$8) != null;
                }
            }
            
            /**
             * Sets the "elicitor" attribute
             */
            public void setElicitor(java.lang.String elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELICITOR$8);
                    }
                    target.setStringValue(elicitor);
                }
            }
            
            /**
             * Sets (as xml) the "elicitor" attribute
             */
            public void xsetElicitor(org.apache.xmlbeans.XmlString elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELICITOR$8);
                    }
                    target.set(elicitor);
                }
            }
            
            /**
             * Unsets the "elicitor" attribute
             */
            public void unsetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ELICITOR$8);
                }
            }
        }
        /**
         * An XML MoodDisplay(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class MoodDisplayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.MoodDisplay
        {
            private static final long serialVersionUID = 1L;
            
            public MoodDisplayImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ADDRESSEE$0 = 
                new javax.xml.namespace.QName("", "addressee");
            private static final javax.xml.namespace.QName LISTENER$2 = 
                new javax.xml.namespace.QName("", "listener");
            private static final javax.xml.namespace.QName TYPE$4 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName INTENSITY$6 = 
                new javax.xml.namespace.QName("", "intensity");
            private static final javax.xml.namespace.QName ELICITOR$8 = 
                new javax.xml.namespace.QName("", "elicitor");
            
            
            /**
             * Gets the "addressee" attribute
             */
            public java.lang.String getAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "addressee" attribute
             */
            public org.apache.xmlbeans.XmlString xgetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESSEE$0);
                    return target;
                }
            }
            
            /**
             * True if has "addressee" attribute
             */
            public boolean isSetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ADDRESSEE$0) != null;
                }
            }
            
            /**
             * Sets the "addressee" attribute
             */
            public void setAddressee(java.lang.String addressee)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSEE$0);
                    }
                    target.setStringValue(addressee);
                }
            }
            
            /**
             * Sets (as xml) the "addressee" attribute
             */
            public void xsetAddressee(org.apache.xmlbeans.XmlString addressee)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESSEE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESSEE$0);
                    }
                    target.set(addressee);
                }
            }
            
            /**
             * Unsets the "addressee" attribute
             */
            public void unsetAddressee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ADDRESSEE$0);
                }
            }
            
            /**
             * Gets the "listener" attribute
             */
            public java.lang.String getListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "listener" attribute
             */
            public org.apache.xmlbeans.XmlString xgetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENER$2);
                    return target;
                }
            }
            
            /**
             * True if has "listener" attribute
             */
            public boolean isSetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LISTENER$2) != null;
                }
            }
            
            /**
             * Sets the "listener" attribute
             */
            public void setListener(java.lang.String listener)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTENER$2);
                    }
                    target.setStringValue(listener);
                }
            }
            
            /**
             * Sets (as xml) the "listener" attribute
             */
            public void xsetListener(org.apache.xmlbeans.XmlString listener)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENER$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LISTENER$2);
                    }
                    target.set(listener);
                }
            }
            
            /**
             * Unsets the "listener" attribute
             */
            public void unsetListener()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LISTENER$2);
                }
            }
            
            /**
             * Gets the "type" attribute
             */
            public de.affect.xml.MoodWord.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return (de.affect.xml.MoodWord.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public de.affect.xml.MoodWord xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.MoodWord target = null;
                    target = (de.affect.xml.MoodWord)get_store().find_attribute_user(TYPE$4);
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(de.affect.xml.MoodWord.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(de.affect.xml.MoodWord type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.MoodWord target = null;
                    target = (de.affect.xml.MoodWord)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (de.affect.xml.MoodWord)get_store().add_attribute_user(TYPE$4);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Gets the "intensity" attribute
             */
            public java.lang.String getIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "intensity" attribute
             */
            public de.affect.xml.Intensity xgetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$6);
                    return target;
                }
            }
            
            /**
             * True if has "intensity" attribute
             */
            public boolean isSetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INTENSITY$6) != null;
                }
            }
            
            /**
             * Sets the "intensity" attribute
             */
            public void setIntensity(java.lang.String intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTENSITY$6);
                    }
                    target.setStringValue(intensity);
                }
            }
            
            /**
             * Sets (as xml) the "intensity" attribute
             */
            public void xsetIntensity(de.affect.xml.Intensity intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      target = (de.affect.xml.Intensity)get_store().add_attribute_user(INTENSITY$6);
                    }
                    target.set(intensity);
                }
            }
            
            /**
             * Unsets the "intensity" attribute
             */
            public void unsetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INTENSITY$6);
                }
            }
            
            /**
             * Gets the "elicitor" attribute
             */
            public java.lang.String getElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "elicitor" attribute
             */
            public org.apache.xmlbeans.XmlString xgetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$8);
                    return target;
                }
            }
            
            /**
             * True if has "elicitor" attribute
             */
            public boolean isSetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ELICITOR$8) != null;
                }
            }
            
            /**
             * Sets the "elicitor" attribute
             */
            public void setElicitor(java.lang.String elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELICITOR$8);
                    }
                    target.setStringValue(elicitor);
                }
            }
            
            /**
             * Sets (as xml) the "elicitor" attribute
             */
            public void xsetElicitor(org.apache.xmlbeans.XmlString elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELICITOR$8);
                    }
                    target.set(elicitor);
                }
            }
            
            /**
             * Unsets the "elicitor" attribute
             */
            public void unsetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ELICITOR$8);
                }
            }
        }
        /**
         * An XML Action(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class ActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.Action
        {
            private static final long serialVersionUID = 1L;
            
            public ActionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName INTENSITY$2 = 
                new javax.xml.namespace.QName("", "intensity");
            private static final javax.xml.namespace.QName ELICITOR$4 = 
                new javax.xml.namespace.QName("", "elicitor");
            
            
            /**
             * Gets the "type" attribute
             */
            public de.affect.xml.ActionTypes.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (de.affect.xml.ActionTypes.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public de.affect.xml.ActionTypes xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.ActionTypes target = null;
                    target = (de.affect.xml.ActionTypes)get_store().find_attribute_user(TYPE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(de.affect.xml.ActionTypes.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(de.affect.xml.ActionTypes type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.ActionTypes target = null;
                    target = (de.affect.xml.ActionTypes)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (de.affect.xml.ActionTypes)get_store().add_attribute_user(TYPE$0);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Gets the "intensity" attribute
             */
            public java.lang.String getIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "intensity" attribute
             */
            public de.affect.xml.Intensity xgetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$2);
                    return target;
                }
            }
            
            /**
             * True if has "intensity" attribute
             */
            public boolean isSetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INTENSITY$2) != null;
                }
            }
            
            /**
             * Sets the "intensity" attribute
             */
            public void setIntensity(java.lang.String intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTENSITY$2);
                    }
                    target.setStringValue(intensity);
                }
            }
            
            /**
             * Sets (as xml) the "intensity" attribute
             */
            public void xsetIntensity(de.affect.xml.Intensity intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      target = (de.affect.xml.Intensity)get_store().add_attribute_user(INTENSITY$2);
                    }
                    target.set(intensity);
                }
            }
            
            /**
             * Unsets the "intensity" attribute
             */
            public void unsetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INTENSITY$2);
                }
            }
            
            /**
             * Gets the "elicitor" attribute
             */
            public java.lang.String getElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "elicitor" attribute
             */
            public org.apache.xmlbeans.XmlString xgetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$4);
                    return target;
                }
            }
            
            /**
             * True if has "elicitor" attribute
             */
            public boolean isSetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ELICITOR$4) != null;
                }
            }
            
            /**
             * Sets the "elicitor" attribute
             */
            public void setElicitor(java.lang.String elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELICITOR$4);
                    }
                    target.setStringValue(elicitor);
                }
            }
            
            /**
             * Sets (as xml) the "elicitor" attribute
             */
            public void xsetElicitor(org.apache.xmlbeans.XmlString elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELICITOR$4);
                    }
                    target.set(elicitor);
                }
            }
            
            /**
             * Unsets the "elicitor" attribute
             */
            public void unsetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ELICITOR$4);
                }
            }
        }
        /**
         * An XML Event(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class EventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.Event
        {
            private static final long serialVersionUID = 1L;
            
            public EventImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName INTENSITY$2 = 
                new javax.xml.namespace.QName("", "intensity");
            private static final javax.xml.namespace.QName ELICITOR$4 = 
                new javax.xml.namespace.QName("", "elicitor");
            
            
            /**
             * Gets the "type" attribute
             */
            public de.affect.xml.EventTypes.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (de.affect.xml.EventTypes.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public de.affect.xml.EventTypes xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.EventTypes target = null;
                    target = (de.affect.xml.EventTypes)get_store().find_attribute_user(TYPE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(de.affect.xml.EventTypes.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(de.affect.xml.EventTypes type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.EventTypes target = null;
                    target = (de.affect.xml.EventTypes)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (de.affect.xml.EventTypes)get_store().add_attribute_user(TYPE$0);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Gets the "intensity" attribute
             */
            public java.lang.String getIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "intensity" attribute
             */
            public de.affect.xml.Intensity xgetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$2);
                    return target;
                }
            }
            
            /**
             * True if has "intensity" attribute
             */
            public boolean isSetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INTENSITY$2) != null;
                }
            }
            
            /**
             * Sets the "intensity" attribute
             */
            public void setIntensity(java.lang.String intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTENSITY$2);
                    }
                    target.setStringValue(intensity);
                }
            }
            
            /**
             * Sets (as xml) the "intensity" attribute
             */
            public void xsetIntensity(de.affect.xml.Intensity intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      target = (de.affect.xml.Intensity)get_store().add_attribute_user(INTENSITY$2);
                    }
                    target.set(intensity);
                }
            }
            
            /**
             * Unsets the "intensity" attribute
             */
            public void unsetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INTENSITY$2);
                }
            }
            
            /**
             * Gets the "elicitor" attribute
             */
            public java.lang.String getElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "elicitor" attribute
             */
            public org.apache.xmlbeans.XmlString xgetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$4);
                    return target;
                }
            }
            
            /**
             * True if has "elicitor" attribute
             */
            public boolean isSetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ELICITOR$4) != null;
                }
            }
            
            /**
             * Sets the "elicitor" attribute
             */
            public void setElicitor(java.lang.String elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELICITOR$4);
                    }
                    target.setStringValue(elicitor);
                }
            }
            
            /**
             * Sets (as xml) the "elicitor" attribute
             */
            public void xsetElicitor(org.apache.xmlbeans.XmlString elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELICITOR$4);
                    }
                    target.set(elicitor);
                }
            }
            
            /**
             * Unsets the "elicitor" attribute
             */
            public void unsetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ELICITOR$4);
                }
            }
        }
        /**
         * An XML Object(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class ObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.Object
        {
            private static final long serialVersionUID = 1L;
            
            public ObjectImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName INTENSITY$2 = 
                new javax.xml.namespace.QName("", "intensity");
            private static final javax.xml.namespace.QName ELICITOR$4 = 
                new javax.xml.namespace.QName("", "elicitor");
            
            
            /**
             * Gets the "type" attribute
             */
            public de.affect.xml.ObjectTypes.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (de.affect.xml.ObjectTypes.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public de.affect.xml.ObjectTypes xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.ObjectTypes target = null;
                    target = (de.affect.xml.ObjectTypes)get_store().find_attribute_user(TYPE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(de.affect.xml.ObjectTypes.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(de.affect.xml.ObjectTypes type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.ObjectTypes target = null;
                    target = (de.affect.xml.ObjectTypes)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (de.affect.xml.ObjectTypes)get_store().add_attribute_user(TYPE$0);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Gets the "intensity" attribute
             */
            public java.lang.String getIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "intensity" attribute
             */
            public de.affect.xml.Intensity xgetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$2);
                    return target;
                }
            }
            
            /**
             * True if has "intensity" attribute
             */
            public boolean isSetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INTENSITY$2) != null;
                }
            }
            
            /**
             * Sets the "intensity" attribute
             */
            public void setIntensity(java.lang.String intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTENSITY$2);
                    }
                    target.setStringValue(intensity);
                }
            }
            
            /**
             * Sets (as xml) the "intensity" attribute
             */
            public void xsetIntensity(de.affect.xml.Intensity intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.Intensity target = null;
                    target = (de.affect.xml.Intensity)get_store().find_attribute_user(INTENSITY$2);
                    if (target == null)
                    {
                      target = (de.affect.xml.Intensity)get_store().add_attribute_user(INTENSITY$2);
                    }
                    target.set(intensity);
                }
            }
            
            /**
             * Unsets the "intensity" attribute
             */
            public void unsetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INTENSITY$2);
                }
            }
            
            /**
             * Gets the "elicitor" attribute
             */
            public java.lang.String getElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "elicitor" attribute
             */
            public org.apache.xmlbeans.XmlString xgetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$4);
                    return target;
                }
            }
            
            /**
             * True if has "elicitor" attribute
             */
            public boolean isSetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ELICITOR$4) != null;
                }
            }
            
            /**
             * Sets the "elicitor" attribute
             */
            public void setElicitor(java.lang.String elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELICITOR$4);
                    }
                    target.setStringValue(elicitor);
                }
            }
            
            /**
             * Sets (as xml) the "elicitor" attribute
             */
            public void xsetElicitor(org.apache.xmlbeans.XmlString elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELICITOR$4);
                    }
                    target.set(elicitor);
                }
            }
            
            /**
             * Unsets the "elicitor" attribute
             */
            public void unsetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ELICITOR$4);
                }
            }
        }
        /**
         * An XML BasicEEC(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class BasicEECImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.BasicEEC
        {
            private static final long serialVersionUID = 1L;
            
            public BasicEECImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DESIRABILITY$0 = 
                new javax.xml.namespace.QName("", "desirability");
            private static final javax.xml.namespace.QName PRAISEWORTHINESS$2 = 
                new javax.xml.namespace.QName("", "praiseworthiness");
            private static final javax.xml.namespace.QName APPEALINGNESS$4 = 
                new javax.xml.namespace.QName("", "appealingness");
            private static final javax.xml.namespace.QName LIKELIHOOD$6 = 
                new javax.xml.namespace.QName("", "likelihood");
            private static final javax.xml.namespace.QName REALIZATION$8 = 
                new javax.xml.namespace.QName("", "realization");
            private static final javax.xml.namespace.QName LIKING$10 = 
                new javax.xml.namespace.QName("", "liking");
            private static final javax.xml.namespace.QName AGENCY$12 = 
                new javax.xml.namespace.QName("", "agency");
            private static final javax.xml.namespace.QName ELICITOR$14 = 
                new javax.xml.namespace.QName("", "elicitor");
            
            
            /**
             * Gets the "desirability" attribute
             */
            public double getDesirability()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESIRABILITY$0);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "desirability" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Desirability xgetDesirability()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Desirability target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                    return target;
                }
            }
            
            /**
             * Sets the "desirability" attribute
             */
            public void setDesirability(double desirability)
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
                    target.setDoubleValue(desirability);
                }
            }
            
            /**
             * Sets (as xml) the "desirability" attribute
             */
            public void xsetDesirability(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Desirability desirability)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Desirability target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Desirability)get_store().find_attribute_user(DESIRABILITY$0);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Desirability)get_store().add_attribute_user(DESIRABILITY$0);
                    }
                    target.set(desirability);
                }
            }
            
            /**
             * Gets the "praiseworthiness" attribute
             */
            public double getPraiseworthiness()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "praiseworthiness" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Praiseworthiness xgetPraiseworthiness()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Praiseworthiness target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                    return target;
                }
            }
            
            /**
             * Sets the "praiseworthiness" attribute
             */
            public void setPraiseworthiness(double praiseworthiness)
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
                    target.setDoubleValue(praiseworthiness);
                }
            }
            
            /**
             * Sets (as xml) the "praiseworthiness" attribute
             */
            public void xsetPraiseworthiness(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Praiseworthiness praiseworthiness)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Praiseworthiness target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Praiseworthiness)get_store().find_attribute_user(PRAISEWORTHINESS$2);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Praiseworthiness)get_store().add_attribute_user(PRAISEWORTHINESS$2);
                    }
                    target.set(praiseworthiness);
                }
            }
            
            /**
             * Gets the "appealingness" attribute
             */
            public double getAppealingness()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$4);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "appealingness" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Appealingness xgetAppealingness()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Appealingness target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Appealingness)get_store().find_attribute_user(APPEALINGNESS$4);
                    return target;
                }
            }
            
            /**
             * Sets the "appealingness" attribute
             */
            public void setAppealingness(double appealingness)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEALINGNESS$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPEALINGNESS$4);
                    }
                    target.setDoubleValue(appealingness);
                }
            }
            
            /**
             * Sets (as xml) the "appealingness" attribute
             */
            public void xsetAppealingness(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Appealingness appealingness)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Appealingness target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Appealingness)get_store().find_attribute_user(APPEALINGNESS$4);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Appealingness)get_store().add_attribute_user(APPEALINGNESS$4);
                    }
                    target.set(appealingness);
                }
            }
            
            /**
             * Gets the "likelihood" attribute
             */
            public double getLikelihood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$6);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "likelihood" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Likelihood xgetLikelihood()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Likelihood target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Likelihood)get_store().find_attribute_user(LIKELIHOOD$6);
                    return target;
                }
            }
            
            /**
             * Sets the "likelihood" attribute
             */
            public void setLikelihood(double likelihood)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKELIHOOD$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKELIHOOD$6);
                    }
                    target.setDoubleValue(likelihood);
                }
            }
            
            /**
             * Sets (as xml) the "likelihood" attribute
             */
            public void xsetLikelihood(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Likelihood likelihood)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Likelihood target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Likelihood)get_store().find_attribute_user(LIKELIHOOD$6);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Likelihood)get_store().add_attribute_user(LIKELIHOOD$6);
                    }
                    target.set(likelihood);
                }
            }
            
            /**
             * Gets the "realization" attribute
             */
            public double getRealization()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$8);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "realization" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Realization xgetRealization()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Realization target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Realization)get_store().find_attribute_user(REALIZATION$8);
                    return target;
                }
            }
            
            /**
             * Sets the "realization" attribute
             */
            public void setRealization(double realization)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REALIZATION$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REALIZATION$8);
                    }
                    target.setDoubleValue(realization);
                }
            }
            
            /**
             * Sets (as xml) the "realization" attribute
             */
            public void xsetRealization(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Realization realization)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Realization target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Realization)get_store().find_attribute_user(REALIZATION$8);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Realization)get_store().add_attribute_user(REALIZATION$8);
                    }
                    target.set(realization);
                }
            }
            
            /**
             * Gets the "liking" attribute
             */
            public double getLiking()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$10);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "liking" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Liking xgetLiking()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Liking target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Liking)get_store().find_attribute_user(LIKING$10);
                    return target;
                }
            }
            
            /**
             * Sets the "liking" attribute
             */
            public void setLiking(double liking)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIKING$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIKING$10);
                    }
                    target.setDoubleValue(liking);
                }
            }
            
            /**
             * Sets (as xml) the "liking" attribute
             */
            public void xsetLiking(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Liking liking)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Liking target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Liking)get_store().find_attribute_user(LIKING$10);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Liking)get_store().add_attribute_user(LIKING$10);
                    }
                    target.set(liking);
                }
            }
            
            /**
             * Gets the "agency" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency.Enum getAgency()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "agency" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency xgetAgency()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency)get_store().find_attribute_user(AGENCY$12);
                    return target;
                }
            }
            
            /**
             * Sets the "agency" attribute
             */
            public void setAgency(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency.Enum agency)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCY$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCY$12);
                    }
                    target.setEnumValue(agency);
                }
            }
            
            /**
             * Sets (as xml) the "agency" attribute
             */
            public void xsetAgency(de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency agency)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency)get_store().find_attribute_user(AGENCY$12);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency)get_store().add_attribute_user(AGENCY$12);
                    }
                    target.set(agency);
                }
            }
            
            /**
             * Gets the "elicitor" attribute
             */
            public java.lang.String getElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "elicitor" attribute
             */
            public org.apache.xmlbeans.XmlString xgetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$14);
                    return target;
                }
            }
            
            /**
             * True if has "elicitor" attribute
             */
            public boolean isSetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ELICITOR$14) != null;
                }
            }
            
            /**
             * Sets the "elicitor" attribute
             */
            public void setElicitor(java.lang.String elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELICITOR$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELICITOR$14);
                    }
                    target.setStringValue(elicitor);
                }
            }
            
            /**
             * Sets (as xml) the "elicitor" attribute
             */
            public void xsetElicitor(org.apache.xmlbeans.XmlString elicitor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ELICITOR$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ELICITOR$14);
                    }
                    target.set(elicitor);
                }
            }
            
            /**
             * Unsets the "elicitor" attribute
             */
            public void unsetElicitor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ELICITOR$14);
                }
            }
            /**
             * An XML desirability(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$BasicEEC$Desirability.
             */
            public static class DesirabilityImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Desirability
            {
                private static final long serialVersionUID = 1L;
                
                public DesirabilityImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected DesirabilityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML praiseworthiness(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$BasicEEC$Praiseworthiness.
             */
            public static class PraiseworthinessImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Praiseworthiness
            {
                private static final long serialVersionUID = 1L;
                
                public PraiseworthinessImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected PraiseworthinessImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML appealingness(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$BasicEEC$Appealingness.
             */
            public static class AppealingnessImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Appealingness
            {
                private static final long serialVersionUID = 1L;
                
                public AppealingnessImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected AppealingnessImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML likelihood(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$BasicEEC$Likelihood.
             */
            public static class LikelihoodImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Likelihood
            {
                private static final long serialVersionUID = 1L;
                
                public LikelihoodImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected LikelihoodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML realization(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$BasicEEC$Realization.
             */
            public static class RealizationImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Realization
            {
                private static final long serialVersionUID = 1L;
                
                public RealizationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected RealizationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML liking(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$BasicEEC$Liking.
             */
            public static class LikingImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Liking
            {
                private static final long serialVersionUID = 1L;
                
                public LikingImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected LikingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML agency(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$BasicEEC$Agency.
             */
            public static class AgencyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.BasicEEC.Agency
            {
                private static final long serialVersionUID = 1L;
                
                public AgencyImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected AgencyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML PAD(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class PADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectInputDocument.AffectInput.PAD
        {
            private static final long serialVersionUID = 1L;
            
            public PADImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PLEASURE$0 = 
                new javax.xml.namespace.QName("", "pleasure");
            private static final javax.xml.namespace.QName AROUSAL$2 = 
                new javax.xml.namespace.QName("", "arousal");
            private static final javax.xml.namespace.QName DOMINANCE$4 = 
                new javax.xml.namespace.QName("", "dominance");
            private static final javax.xml.namespace.QName INTENSITY$6 = 
                new javax.xml.namespace.QName("", "intensity");
            private static final javax.xml.namespace.QName DESCRIPTION$8 = 
                new javax.xml.namespace.QName("", "description");
            
            
            /**
             * Gets the "pleasure" attribute
             */
            public double getPleasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLEASURE$0);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "pleasure" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.PAD.Pleasure xgetPleasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.PAD.Pleasure target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Pleasure)get_store().find_attribute_user(PLEASURE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "pleasure" attribute
             */
            public void setPleasure(double pleasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLEASURE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLEASURE$0);
                    }
                    target.setDoubleValue(pleasure);
                }
            }
            
            /**
             * Sets (as xml) the "pleasure" attribute
             */
            public void xsetPleasure(de.affect.xml.AffectInputDocument.AffectInput.PAD.Pleasure pleasure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.PAD.Pleasure target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Pleasure)get_store().find_attribute_user(PLEASURE$0);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Pleasure)get_store().add_attribute_user(PLEASURE$0);
                    }
                    target.set(pleasure);
                }
            }
            
            /**
             * Gets the "arousal" attribute
             */
            public double getArousal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AROUSAL$2);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "arousal" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.PAD.Arousal xgetArousal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.PAD.Arousal target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Arousal)get_store().find_attribute_user(AROUSAL$2);
                    return target;
                }
            }
            
            /**
             * Sets the "arousal" attribute
             */
            public void setArousal(double arousal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AROUSAL$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AROUSAL$2);
                    }
                    target.setDoubleValue(arousal);
                }
            }
            
            /**
             * Sets (as xml) the "arousal" attribute
             */
            public void xsetArousal(de.affect.xml.AffectInputDocument.AffectInput.PAD.Arousal arousal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.PAD.Arousal target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Arousal)get_store().find_attribute_user(AROUSAL$2);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Arousal)get_store().add_attribute_user(AROUSAL$2);
                    }
                    target.set(arousal);
                }
            }
            
            /**
             * Gets the "dominance" attribute
             */
            public double getDominance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMINANCE$4);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "dominance" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.PAD.Dominance xgetDominance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.PAD.Dominance target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Dominance)get_store().find_attribute_user(DOMINANCE$4);
                    return target;
                }
            }
            
            /**
             * Sets the "dominance" attribute
             */
            public void setDominance(double dominance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMINANCE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMINANCE$4);
                    }
                    target.setDoubleValue(dominance);
                }
            }
            
            /**
             * Sets (as xml) the "dominance" attribute
             */
            public void xsetDominance(de.affect.xml.AffectInputDocument.AffectInput.PAD.Dominance dominance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.PAD.Dominance target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Dominance)get_store().find_attribute_user(DOMINANCE$4);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Dominance)get_store().add_attribute_user(DOMINANCE$4);
                    }
                    target.set(dominance);
                }
            }
            
            /**
             * Gets the "intensity" attribute
             */
            public double getIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "intensity" attribute
             */
            public de.affect.xml.AffectInputDocument.AffectInput.PAD.Intensity xgetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.PAD.Intensity target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Intensity)get_store().find_attribute_user(INTENSITY$6);
                    return target;
                }
            }
            
            /**
             * True if has "intensity" attribute
             */
            public boolean isSetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INTENSITY$6) != null;
                }
            }
            
            /**
             * Sets the "intensity" attribute
             */
            public void setIntensity(double intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTENSITY$6);
                    }
                    target.setDoubleValue(intensity);
                }
            }
            
            /**
             * Sets (as xml) the "intensity" attribute
             */
            public void xsetIntensity(de.affect.xml.AffectInputDocument.AffectInput.PAD.Intensity intensity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectInputDocument.AffectInput.PAD.Intensity target = null;
                    target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Intensity)get_store().find_attribute_user(INTENSITY$6);
                    if (target == null)
                    {
                      target = (de.affect.xml.AffectInputDocument.AffectInput.PAD.Intensity)get_store().add_attribute_user(INTENSITY$6);
                    }
                    target.set(intensity);
                }
            }
            
            /**
             * Unsets the "intensity" attribute
             */
            public void unsetIntensity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INTENSITY$6);
                }
            }
            
            /**
             * Gets the "description" attribute
             */
            public java.lang.String getDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "description" attribute
             */
            public org.apache.xmlbeans.XmlString xgetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
                    return target;
                }
            }
            
            /**
             * True if has "description" attribute
             */
            public boolean isSetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DESCRIPTION$8) != null;
                }
            }
            
            /**
             * Sets the "description" attribute
             */
            public void setDescription(java.lang.String description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$8);
                    }
                    target.setStringValue(description);
                }
            }
            
            /**
             * Sets (as xml) the "description" attribute
             */
            public void xsetDescription(org.apache.xmlbeans.XmlString description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$8);
                    }
                    target.set(description);
                }
            }
            
            /**
             * Unsets the "description" attribute
             */
            public void unsetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DESCRIPTION$8);
                }
            }
            /**
             * An XML pleasure(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$PAD$Pleasure.
             */
            public static class PleasureImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.PAD.Pleasure
            {
                private static final long serialVersionUID = 1L;
                
                public PleasureImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected PleasureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML arousal(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$PAD$Arousal.
             */
            public static class ArousalImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.PAD.Arousal
            {
                private static final long serialVersionUID = 1L;
                
                public ArousalImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ArousalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML dominance(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$PAD$Dominance.
             */
            public static class DominanceImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.PAD.Dominance
            {
                private static final long serialVersionUID = 1L;
                
                public DominanceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected DominanceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML intensity(@).
             *
             * This is an atomic type that is a restriction of de.affect.xml.AffectInputDocument$AffectInput$PAD$Intensity.
             */
            public static class IntensityImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements de.affect.xml.AffectInputDocument.AffectInput.PAD.Intensity
            {
                private static final long serialVersionUID = 1L;
                
                public IntensityImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected IntensityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
