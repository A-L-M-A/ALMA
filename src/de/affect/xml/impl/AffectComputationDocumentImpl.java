/*
 * An XML document type.
 * Localname: AffectComputation
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectComputationDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * A document containing one AffectComputation(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public class AffectComputationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AffectComputationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFECTCOMPUTATION$0 = 
        new javax.xml.namespace.QName("xml.affect.de", "AffectComputation");
    
    
    /**
     * Gets the "AffectComputation" element
     */
    public de.affect.xml.AffectComputationDocument.AffectComputation getAffectComputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectComputationDocument.AffectComputation target = null;
            target = (de.affect.xml.AffectComputationDocument.AffectComputation)get_store().find_element_user(AFFECTCOMPUTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffectComputation" element
     */
    public void setAffectComputation(de.affect.xml.AffectComputationDocument.AffectComputation affectComputation)
    {
        generatedSetterHelperImpl(affectComputation, AFFECTCOMPUTATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AffectComputation" element
     */
    public de.affect.xml.AffectComputationDocument.AffectComputation addNewAffectComputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectComputationDocument.AffectComputation target = null;
            target = (de.affect.xml.AffectComputationDocument.AffectComputation)get_store().add_element_user(AFFECTCOMPUTATION$0);
            return target;
        }
    }
    /**
     * An XML AffectComputation(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class AffectComputationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation
    {
        private static final long serialVersionUID = 1L;
        
        public AffectComputationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AVAILABLEACTS$0 = 
            new javax.xml.namespace.QName("xml.affect.de", "AvailableActs");
        private static final javax.xml.namespace.QName AVAILABLEEMOTIONS$2 = 
            new javax.xml.namespace.QName("xml.affect.de", "AvailableEmotions");
        private static final javax.xml.namespace.QName MOODRELATIONS$4 = 
            new javax.xml.namespace.QName("xml.affect.de", "MoodRelations");
        private static final javax.xml.namespace.QName PERSONALITYRELATIONS$6 = 
            new javax.xml.namespace.QName("xml.affect.de", "PersonalityRelations");
        private static final javax.xml.namespace.QName REALTIMEOUTPUT$8 = 
            new javax.xml.namespace.QName("xml.affect.de", "RealtimeOutput");
        private static final javax.xml.namespace.QName RUNTIMEINTERACTIONMONITOR$10 = 
            new javax.xml.namespace.QName("xml.affect.de", "RuntimeInteractionMonitor");
        
        
        /**
         * Gets the "AvailableActs" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs getAvailableActs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs)get_store().find_element_user(AVAILABLEACTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AvailableActs" element
         */
        public void setAvailableActs(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs availableActs)
        {
            generatedSetterHelperImpl(availableActs, AVAILABLEACTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AvailableActs" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs addNewAvailableActs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs)get_store().add_element_user(AVAILABLEACTS$0);
                return target;
            }
        }
        
        /**
         * Gets the "AvailableEmotions" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions getAvailableEmotions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions)get_store().find_element_user(AVAILABLEEMOTIONS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AvailableEmotions" element
         */
        public void setAvailableEmotions(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions availableEmotions)
        {
            generatedSetterHelperImpl(availableEmotions, AVAILABLEEMOTIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AvailableEmotions" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions addNewAvailableEmotions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions)get_store().add_element_user(AVAILABLEEMOTIONS$2);
                return target;
            }
        }
        
        /**
         * Gets the "MoodRelations" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations getMoodRelations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations)get_store().find_element_user(MOODRELATIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "MoodRelations" element
         */
        public void setMoodRelations(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations moodRelations)
        {
            generatedSetterHelperImpl(moodRelations, MOODRELATIONS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "MoodRelations" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations addNewMoodRelations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations)get_store().add_element_user(MOODRELATIONS$4);
                return target;
            }
        }
        
        /**
         * Gets the "PersonalityRelations" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations getPersonalityRelations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations)get_store().find_element_user(PERSONALITYRELATIONS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "PersonalityRelations" element
         */
        public void setPersonalityRelations(de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations personalityRelations)
        {
            generatedSetterHelperImpl(personalityRelations, PERSONALITYRELATIONS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PersonalityRelations" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations addNewPersonalityRelations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations)get_store().add_element_user(PERSONALITYRELATIONS$6);
                return target;
            }
        }
        
        /**
         * Gets the "RealtimeOutput" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput getRealtimeOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput)get_store().find_element_user(REALTIMEOUTPUT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RealtimeOutput" element
         */
        public void setRealtimeOutput(de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput realtimeOutput)
        {
            generatedSetterHelperImpl(realtimeOutput, REALTIMEOUTPUT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "RealtimeOutput" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput addNewRealtimeOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput)get_store().add_element_user(REALTIMEOUTPUT$8);
                return target;
            }
        }
        
        /**
         * Gets the "RuntimeInteractionMonitor" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor getRuntimeInteractionMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor)get_store().find_element_user(RUNTIMEINTERACTIONMONITOR$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RuntimeInteractionMonitor" element
         */
        public void setRuntimeInteractionMonitor(de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor runtimeInteractionMonitor)
        {
            generatedSetterHelperImpl(runtimeInteractionMonitor, RUNTIMEINTERACTIONMONITOR$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "RuntimeInteractionMonitor" element
         */
        public de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor addNewRuntimeInteractionMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor target = null;
                target = (de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor)get_store().add_element_user(RUNTIMEINTERACTIONMONITOR$10);
                return target;
            }
        }
        /**
         * An XML AvailableActs(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class AvailableActsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs
        {
            private static final long serialVersionUID = 1L;
            
            public AvailableActsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ACTSPECIFICATION$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "ActSpecification");
            
            
            /**
             * Gets a List of "ActSpecification" elements
             */
            public java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification> getActSpecificationList()
            {
                final class ActSpecificationList extends java.util.AbstractList<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification>
                {
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification get(int i)
                        { return AvailableActsImpl.this.getActSpecificationArray(i); }
                    
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification set(int i, de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification o)
                    {
                      de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification old = AvailableActsImpl.this.getActSpecificationArray(i);
                      AvailableActsImpl.this.setActSpecificationArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification o)
                        { AvailableActsImpl.this.insertNewActSpecification(i).set(o); }
                    
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification remove(int i)
                    {
                      de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification old = AvailableActsImpl.this.getActSpecificationArray(i);
                      AvailableActsImpl.this.removeActSpecification(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return AvailableActsImpl.this.sizeOfActSpecificationArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new ActSpecificationList();
                }
            }
            
            /**
             * Gets array of all "ActSpecification" elements
             * @deprecated
             */
            @Deprecated
            public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification[] getActSpecificationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification> targetList = new java.util.ArrayList<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification>();
                    get_store().find_all_element_users(ACTSPECIFICATION$0, targetList);
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification[] result = new de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ActSpecification" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification getActSpecificationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification)get_store().find_element_user(ACTSPECIFICATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ActSpecification" element
             */
            public int sizeOfActSpecificationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ACTSPECIFICATION$0);
                }
            }
            
            /**
             * Sets array of all "ActSpecification" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setActSpecificationArray(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification[] actSpecificationArray)
            {
                check_orphaned();
                arraySetterHelper(actSpecificationArray, ACTSPECIFICATION$0);
            }
            
            /**
             * Sets ith "ActSpecification" element
             */
            public void setActSpecificationArray(int i, de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification actSpecification)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification)get_store().find_element_user(ACTSPECIFICATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(actSpecification);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ActSpecification" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification insertNewActSpecification(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification)get_store().insert_element_user(ACTSPECIFICATION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ActSpecification" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification addNewActSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification)get_store().add_element_user(ACTSPECIFICATION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ActSpecification" element
             */
            public void removeActSpecification(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ACTSPECIFICATION$0, i);
                }
            }
            /**
             * An XML ActSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class ActSpecificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification
            {
                private static final long serialVersionUID = 1L;
                
                public ActSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName USE$2 = 
                    new javax.xml.namespace.QName("", "use");
                private static final javax.xml.namespace.QName DOCU$4 = 
                    new javax.xml.namespace.QName("", "docu");
                
                
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
                public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name target = null;
                      target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name)get_store().find_attribute_user(NAME$0);
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
                public void xsetName(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name target = null;
                      target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name)get_store().add_attribute_user(NAME$0);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Gets the "use" attribute
                 */
                public boolean getUse()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$2);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "use" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetUse()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USE$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "use" attribute
                 */
                public void setUse(boolean use)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$2);
                      }
                      target.setBooleanValue(use);
                    }
                }
                
                /**
                 * Sets (as xml) the "use" attribute
                 */
                public void xsetUse(org.apache.xmlbeans.XmlBoolean use)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USE$2);
                      }
                      target.set(use);
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
                 * An XML name(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectComputationDocument$AffectComputation$AvailableActs$ActSpecification$Name.
                 */
                public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.affect.xml.AffectComputationDocument.AffectComputation.AvailableActs.ActSpecification.Name
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
        }
        /**
         * An XML AvailableEmotions(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class AvailableEmotionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions
        {
            private static final long serialVersionUID = 1L;
            
            public AvailableEmotionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EMOTIONSPECIFICATION$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "EmotionSpecification");
            
            
            /**
             * Gets a List of "EmotionSpecification" elements
             */
            public java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification> getEmotionSpecificationList()
            {
                final class EmotionSpecificationList extends java.util.AbstractList<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification>
                {
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification get(int i)
                        { return AvailableEmotionsImpl.this.getEmotionSpecificationArray(i); }
                    
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification set(int i, de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification o)
                    {
                      de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification old = AvailableEmotionsImpl.this.getEmotionSpecificationArray(i);
                      AvailableEmotionsImpl.this.setEmotionSpecificationArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification o)
                        { AvailableEmotionsImpl.this.insertNewEmotionSpecification(i).set(o); }
                    
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification remove(int i)
                    {
                      de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification old = AvailableEmotionsImpl.this.getEmotionSpecificationArray(i);
                      AvailableEmotionsImpl.this.removeEmotionSpecification(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return AvailableEmotionsImpl.this.sizeOfEmotionSpecificationArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new EmotionSpecificationList();
                }
            }
            
            /**
             * Gets array of all "EmotionSpecification" elements
             * @deprecated
             */
            @Deprecated
            public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification[] getEmotionSpecificationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification> targetList = new java.util.ArrayList<de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification>();
                    get_store().find_all_element_users(EMOTIONSPECIFICATION$0, targetList);
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification[] result = new de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "EmotionSpecification" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification getEmotionSpecificationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification)get_store().find_element_user(EMOTIONSPECIFICATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "EmotionSpecification" element
             */
            public int sizeOfEmotionSpecificationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EMOTIONSPECIFICATION$0);
                }
            }
            
            /**
             * Sets array of all "EmotionSpecification" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setEmotionSpecificationArray(de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification[] emotionSpecificationArray)
            {
                check_orphaned();
                arraySetterHelper(emotionSpecificationArray, EMOTIONSPECIFICATION$0);
            }
            
            /**
             * Sets ith "EmotionSpecification" element
             */
            public void setEmotionSpecificationArray(int i, de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification emotionSpecification)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification)get_store().find_element_user(EMOTIONSPECIFICATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(emotionSpecification);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "EmotionSpecification" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification insertNewEmotionSpecification(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification)get_store().insert_element_user(EMOTIONSPECIFICATION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "EmotionSpecification" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification addNewEmotionSpecification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification)get_store().add_element_user(EMOTIONSPECIFICATION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "EmotionSpecification" element
             */
            public void removeEmotionSpecification(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EMOTIONSPECIFICATION$0, i);
                }
            }
            /**
             * An XML EmotionSpecification(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class EmotionSpecificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.AvailableEmotions.EmotionSpecification
            {
                private static final long serialVersionUID = 1L;
                
                public EmotionSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName USE$2 = 
                    new javax.xml.namespace.QName("", "use");
                private static final javax.xml.namespace.QName DOCU$4 = 
                    new javax.xml.namespace.QName("", "docu");
                
                
                /**
                 * Gets the "name" attribute
                 */
                public de.affect.xml.EmotionName.Enum getName()
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
                      return (de.affect.xml.EmotionName.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                public de.affect.xml.EmotionName xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.EmotionName target = null;
                      target = (de.affect.xml.EmotionName)get_store().find_attribute_user(NAME$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "name" attribute
                 */
                public void setName(de.affect.xml.EmotionName.Enum name)
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
                      target.setEnumValue(name);
                    }
                }
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                public void xsetName(de.affect.xml.EmotionName name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.EmotionName target = null;
                      target = (de.affect.xml.EmotionName)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.EmotionName)get_store().add_attribute_user(NAME$0);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Gets the "use" attribute
                 */
                public boolean getUse()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$2);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "use" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetUse()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USE$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "use" attribute
                 */
                public void setUse(boolean use)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$2);
                      }
                      target.setBooleanValue(use);
                    }
                }
                
                /**
                 * Sets (as xml) the "use" attribute
                 */
                public void xsetUse(org.apache.xmlbeans.XmlBoolean use)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USE$2);
                      }
                      target.set(use);
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
            }
        }
        /**
         * An XML MoodRelations(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class MoodRelationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations
        {
            private static final long serialVersionUID = 1L;
            
            public MoodRelationsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OPENNESSRELATION$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "OpennessRelation");
            private static final javax.xml.namespace.QName CONSCIENTIOUSNESSRELATION$2 = 
                new javax.xml.namespace.QName("xml.affect.de", "ConscientiousnessRelation");
            private static final javax.xml.namespace.QName EXTRAVERSIONRELATION$4 = 
                new javax.xml.namespace.QName("xml.affect.de", "ExtraversionRelation");
            private static final javax.xml.namespace.QName AGREEABLENESSRELATION$6 = 
                new javax.xml.namespace.QName("xml.affect.de", "AgreeablenessRelation");
            private static final javax.xml.namespace.QName NEUROTISMRELATION$8 = 
                new javax.xml.namespace.QName("xml.affect.de", "NeurotismRelation");
            private static final javax.xml.namespace.QName EMOTIONRELATION$10 = 
                new javax.xml.namespace.QName("xml.affect.de", "EmotionRelation");
            private static final javax.xml.namespace.QName DOCU$12 = 
                new javax.xml.namespace.QName("", "docu");
            
            
            /**
             * Gets the "OpennessRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation getOpennessRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation)get_store().find_element_user(OPENNESSRELATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "OpennessRelation" element
             */
            public void setOpennessRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation opennessRelation)
            {
                generatedSetterHelperImpl(opennessRelation, OPENNESSRELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "OpennessRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation addNewOpennessRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation)get_store().add_element_user(OPENNESSRELATION$0);
                    return target;
                }
            }
            
            /**
             * Gets the "ConscientiousnessRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation getConscientiousnessRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation)get_store().find_element_user(CONSCIENTIOUSNESSRELATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ConscientiousnessRelation" element
             */
            public void setConscientiousnessRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation conscientiousnessRelation)
            {
                generatedSetterHelperImpl(conscientiousnessRelation, CONSCIENTIOUSNESSRELATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "ConscientiousnessRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation addNewConscientiousnessRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation)get_store().add_element_user(CONSCIENTIOUSNESSRELATION$2);
                    return target;
                }
            }
            
            /**
             * Gets the "ExtraversionRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation getExtraversionRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation)get_store().find_element_user(EXTRAVERSIONRELATION$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ExtraversionRelation" element
             */
            public void setExtraversionRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation extraversionRelation)
            {
                generatedSetterHelperImpl(extraversionRelation, EXTRAVERSIONRELATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "ExtraversionRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation addNewExtraversionRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation)get_store().add_element_user(EXTRAVERSIONRELATION$4);
                    return target;
                }
            }
            
            /**
             * Gets the "AgreeablenessRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation getAgreeablenessRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation)get_store().find_element_user(AGREEABLENESSRELATION$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "AgreeablenessRelation" element
             */
            public void setAgreeablenessRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation agreeablenessRelation)
            {
                generatedSetterHelperImpl(agreeablenessRelation, AGREEABLENESSRELATION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "AgreeablenessRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation addNewAgreeablenessRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation)get_store().add_element_user(AGREEABLENESSRELATION$6);
                    return target;
                }
            }
            
            /**
             * Gets the "NeurotismRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation getNeurotismRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation)get_store().find_element_user(NEUROTISMRELATION$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "NeurotismRelation" element
             */
            public void setNeurotismRelation(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation neurotismRelation)
            {
                generatedSetterHelperImpl(neurotismRelation, NEUROTISMRELATION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "NeurotismRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation addNewNeurotismRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation)get_store().add_element_user(NEUROTISMRELATION$8);
                    return target;
                }
            }
            
            /**
             * Gets a List of "EmotionRelation" elements
             */
            public java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation> getEmotionRelationList()
            {
                final class EmotionRelationList extends java.util.AbstractList<de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation>
                {
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation get(int i)
                        { return MoodRelationsImpl.this.getEmotionRelationArray(i); }
                    
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation set(int i, de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation o)
                    {
                      de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation old = MoodRelationsImpl.this.getEmotionRelationArray(i);
                      MoodRelationsImpl.this.setEmotionRelationArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation o)
                        { MoodRelationsImpl.this.insertNewEmotionRelation(i).set(o); }
                    
                    @Override
                    public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation remove(int i)
                    {
                      de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation old = MoodRelationsImpl.this.getEmotionRelationArray(i);
                      MoodRelationsImpl.this.removeEmotionRelation(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return MoodRelationsImpl.this.sizeOfEmotionRelationArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new EmotionRelationList();
                }
            }
            
            /**
             * Gets array of all "EmotionRelation" elements
             * @deprecated
             */
            @Deprecated
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation[] getEmotionRelationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation> targetList = new java.util.ArrayList<de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation>();
                    get_store().find_all_element_users(EMOTIONRELATION$10, targetList);
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation[] result = new de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "EmotionRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation getEmotionRelationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation)get_store().find_element_user(EMOTIONRELATION$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "EmotionRelation" element
             */
            public int sizeOfEmotionRelationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EMOTIONRELATION$10);
                }
            }
            
            /**
             * Sets array of all "EmotionRelation" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setEmotionRelationArray(de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation[] emotionRelationArray)
            {
                check_orphaned();
                arraySetterHelper(emotionRelationArray, EMOTIONRELATION$10);
            }
            
            /**
             * Sets ith "EmotionRelation" element
             */
            public void setEmotionRelationArray(int i, de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation emotionRelation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation)get_store().find_element_user(EMOTIONRELATION$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(emotionRelation);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "EmotionRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation insertNewEmotionRelation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation)get_store().insert_element_user(EMOTIONRELATION$10, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "EmotionRelation" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation addNewEmotionRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation)get_store().add_element_user(EMOTIONRELATION$10);
                    return target;
                }
            }
            
            /**
             * Removes the ith "EmotionRelation" element
             */
            public void removeEmotionRelation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EMOTIONRELATION$10, i);
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
             * An XML OpennessRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class OpennessRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.OpennessRelation
            {
                private static final long serialVersionUID = 1L;
                
                public OpennessRelationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLEASURE$0 = 
                    new javax.xml.namespace.QName("", "pleasure");
                private static final javax.xml.namespace.QName AROUSAL$2 = 
                    new javax.xml.namespace.QName("", "arousal");
                private static final javax.xml.namespace.QName DOMINANCE$4 = 
                    new javax.xml.namespace.QName("", "dominance");
                
                
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
                public de.affect.xml.SignedIntensity xgetPleasure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
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
                public void xsetPleasure(de.affect.xml.SignedIntensity pleasure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(PLEASURE$0);
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
                public de.affect.xml.SignedIntensity xgetArousal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
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
                public void xsetArousal(de.affect.xml.SignedIntensity arousal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(AROUSAL$2);
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
                public de.affect.xml.SignedIntensity xgetDominance()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
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
                public void xsetDominance(de.affect.xml.SignedIntensity dominance)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(DOMINANCE$4);
                      }
                      target.set(dominance);
                    }
                }
            }
            /**
             * An XML ConscientiousnessRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class ConscientiousnessRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ConscientiousnessRelation
            {
                private static final long serialVersionUID = 1L;
                
                public ConscientiousnessRelationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLEASURE$0 = 
                    new javax.xml.namespace.QName("", "pleasure");
                private static final javax.xml.namespace.QName AROUSAL$2 = 
                    new javax.xml.namespace.QName("", "arousal");
                private static final javax.xml.namespace.QName DOMINANCE$4 = 
                    new javax.xml.namespace.QName("", "dominance");
                
                
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
                public de.affect.xml.SignedIntensity xgetPleasure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
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
                public void xsetPleasure(de.affect.xml.SignedIntensity pleasure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(PLEASURE$0);
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
                public de.affect.xml.SignedIntensity xgetArousal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
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
                public void xsetArousal(de.affect.xml.SignedIntensity arousal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(AROUSAL$2);
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
                public de.affect.xml.SignedIntensity xgetDominance()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
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
                public void xsetDominance(de.affect.xml.SignedIntensity dominance)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(DOMINANCE$4);
                      }
                      target.set(dominance);
                    }
                }
            }
            /**
             * An XML ExtraversionRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class ExtraversionRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.ExtraversionRelation
            {
                private static final long serialVersionUID = 1L;
                
                public ExtraversionRelationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLEASURE$0 = 
                    new javax.xml.namespace.QName("", "pleasure");
                private static final javax.xml.namespace.QName AROUSAL$2 = 
                    new javax.xml.namespace.QName("", "arousal");
                private static final javax.xml.namespace.QName DOMINANCE$4 = 
                    new javax.xml.namespace.QName("", "dominance");
                
                
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
                public de.affect.xml.SignedIntensity xgetPleasure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
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
                public void xsetPleasure(de.affect.xml.SignedIntensity pleasure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(PLEASURE$0);
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
                public de.affect.xml.SignedIntensity xgetArousal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
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
                public void xsetArousal(de.affect.xml.SignedIntensity arousal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(AROUSAL$2);
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
                public de.affect.xml.SignedIntensity xgetDominance()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
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
                public void xsetDominance(de.affect.xml.SignedIntensity dominance)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(DOMINANCE$4);
                      }
                      target.set(dominance);
                    }
                }
            }
            /**
             * An XML AgreeablenessRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class AgreeablenessRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.AgreeablenessRelation
            {
                private static final long serialVersionUID = 1L;
                
                public AgreeablenessRelationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLEASURE$0 = 
                    new javax.xml.namespace.QName("", "pleasure");
                private static final javax.xml.namespace.QName AROUSAL$2 = 
                    new javax.xml.namespace.QName("", "arousal");
                private static final javax.xml.namespace.QName DOMINANCE$4 = 
                    new javax.xml.namespace.QName("", "dominance");
                
                
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
                public de.affect.xml.SignedIntensity xgetPleasure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
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
                public void xsetPleasure(de.affect.xml.SignedIntensity pleasure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(PLEASURE$0);
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
                public de.affect.xml.SignedIntensity xgetArousal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
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
                public void xsetArousal(de.affect.xml.SignedIntensity arousal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(AROUSAL$2);
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
                public de.affect.xml.SignedIntensity xgetDominance()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
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
                public void xsetDominance(de.affect.xml.SignedIntensity dominance)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(DOMINANCE$4);
                      }
                      target.set(dominance);
                    }
                }
            }
            /**
             * An XML NeurotismRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class NeurotismRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.NeurotismRelation
            {
                private static final long serialVersionUID = 1L;
                
                public NeurotismRelationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLEASURE$0 = 
                    new javax.xml.namespace.QName("", "pleasure");
                private static final javax.xml.namespace.QName AROUSAL$2 = 
                    new javax.xml.namespace.QName("", "arousal");
                private static final javax.xml.namespace.QName DOMINANCE$4 = 
                    new javax.xml.namespace.QName("", "dominance");
                
                
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
                public de.affect.xml.SignedIntensity xgetPleasure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
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
                public void xsetPleasure(de.affect.xml.SignedIntensity pleasure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(PLEASURE$0);
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
                public de.affect.xml.SignedIntensity xgetArousal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
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
                public void xsetArousal(de.affect.xml.SignedIntensity arousal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(AROUSAL$2);
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
                public de.affect.xml.SignedIntensity xgetDominance()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
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
                public void xsetDominance(de.affect.xml.SignedIntensity dominance)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$4);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(DOMINANCE$4);
                      }
                      target.set(dominance);
                    }
                }
            }
            /**
             * An XML EmotionRelation(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class EmotionRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.MoodRelations.EmotionRelation
            {
                private static final long serialVersionUID = 1L;
                
                public EmotionRelationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName PLEASURE$2 = 
                    new javax.xml.namespace.QName("", "pleasure");
                private static final javax.xml.namespace.QName AROUSAL$4 = 
                    new javax.xml.namespace.QName("", "arousal");
                private static final javax.xml.namespace.QName DOMINANCE$6 = 
                    new javax.xml.namespace.QName("", "dominance");
                
                
                /**
                 * Gets the "name" attribute
                 */
                public de.affect.xml.EmotionName.Enum getName()
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
                      return (de.affect.xml.EmotionName.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                public de.affect.xml.EmotionName xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.EmotionName target = null;
                      target = (de.affect.xml.EmotionName)get_store().find_attribute_user(NAME$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "name" attribute
                 */
                public void setName(de.affect.xml.EmotionName.Enum name)
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
                      target.setEnumValue(name);
                    }
                }
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                public void xsetName(de.affect.xml.EmotionName name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.EmotionName target = null;
                      target = (de.affect.xml.EmotionName)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.EmotionName)get_store().add_attribute_user(NAME$0);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Gets the "pleasure" attribute
                 */
                public double getPleasure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLEASURE$2);
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
                public de.affect.xml.SignedIntensity xgetPleasure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$2);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLEASURE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLEASURE$2);
                      }
                      target.setDoubleValue(pleasure);
                    }
                }
                
                /**
                 * Sets (as xml) the "pleasure" attribute
                 */
                public void xsetPleasure(de.affect.xml.SignedIntensity pleasure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$2);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(PLEASURE$2);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AROUSAL$4);
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
                public de.affect.xml.SignedIntensity xgetArousal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AROUSAL$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AROUSAL$4);
                      }
                      target.setDoubleValue(arousal);
                    }
                }
                
                /**
                 * Sets (as xml) the "arousal" attribute
                 */
                public void xsetArousal(de.affect.xml.SignedIntensity arousal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$4);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(AROUSAL$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMINANCE$6);
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
                public de.affect.xml.SignedIntensity xgetDominance()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMINANCE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMINANCE$6);
                      }
                      target.setDoubleValue(dominance);
                    }
                }
                
                /**
                 * Sets (as xml) the "dominance" attribute
                 */
                public void xsetDominance(de.affect.xml.SignedIntensity dominance)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.SignedIntensity target = null;
                      target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$6);
                      if (target == null)
                      {
                        target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(DOMINANCE$6);
                      }
                      target.set(dominance);
                    }
                }
            }
        }
        /**
         * An XML PersonalityRelations(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class PersonalityRelationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.PersonalityRelations
        {
            private static final long serialVersionUID = 1L;
            
            public PersonalityRelationsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PLEASURERELATION$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "PleasureRelation");
            private static final javax.xml.namespace.QName AROUSALRELATION$2 = 
                new javax.xml.namespace.QName("xml.affect.de", "ArousalRelation");
            private static final javax.xml.namespace.QName DOMINANCERELATION$4 = 
                new javax.xml.namespace.QName("xml.affect.de", "DominanceRelation");
            
            
            /**
             * Gets the "PleasureRelation" element
             */
            public de.affect.xml.PersonalityType getPleasureRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.PersonalityType target = null;
                    target = (de.affect.xml.PersonalityType)get_store().find_element_user(PLEASURERELATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PleasureRelation" element
             */
            public void setPleasureRelation(de.affect.xml.PersonalityType pleasureRelation)
            {
                generatedSetterHelperImpl(pleasureRelation, PLEASURERELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "PleasureRelation" element
             */
            public de.affect.xml.PersonalityType addNewPleasureRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.PersonalityType target = null;
                    target = (de.affect.xml.PersonalityType)get_store().add_element_user(PLEASURERELATION$0);
                    return target;
                }
            }
            
            /**
             * Gets the "ArousalRelation" element
             */
            public de.affect.xml.PersonalityType getArousalRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.PersonalityType target = null;
                    target = (de.affect.xml.PersonalityType)get_store().find_element_user(AROUSALRELATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ArousalRelation" element
             */
            public void setArousalRelation(de.affect.xml.PersonalityType arousalRelation)
            {
                generatedSetterHelperImpl(arousalRelation, AROUSALRELATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "ArousalRelation" element
             */
            public de.affect.xml.PersonalityType addNewArousalRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.PersonalityType target = null;
                    target = (de.affect.xml.PersonalityType)get_store().add_element_user(AROUSALRELATION$2);
                    return target;
                }
            }
            
            /**
             * Gets the "DominanceRelation" element
             */
            public de.affect.xml.PersonalityType getDominanceRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.PersonalityType target = null;
                    target = (de.affect.xml.PersonalityType)get_store().find_element_user(DOMINANCERELATION$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "DominanceRelation" element
             */
            public void setDominanceRelation(de.affect.xml.PersonalityType dominanceRelation)
            {
                generatedSetterHelperImpl(dominanceRelation, DOMINANCERELATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "DominanceRelation" element
             */
            public de.affect.xml.PersonalityType addNewDominanceRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.PersonalityType target = null;
                    target = (de.affect.xml.PersonalityType)get_store().add_element_user(DOMINANCERELATION$4);
                    return target;
                }
            }
        }
        /**
         * An XML RealtimeOutput(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class RealtimeOutputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput
        {
            private static final long serialVersionUID = 1L;
            
            public RealtimeOutputImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FILELOG$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "FileLog");
            private static final javax.xml.namespace.QName CONSOLELOG$2 = 
                new javax.xml.namespace.QName("xml.affect.de", "ConsoleLog");
            private static final javax.xml.namespace.QName ENABLE$4 = 
                new javax.xml.namespace.QName("", "enable");
            private static final javax.xml.namespace.QName PERIOD$6 = 
                new javax.xml.namespace.QName("", "period");
            
            
            /**
             * Gets the "FileLog" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog getFileLog()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog)get_store().find_element_user(FILELOG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "FileLog" element
             */
            public void setFileLog(de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog fileLog)
            {
                generatedSetterHelperImpl(fileLog, FILELOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "FileLog" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog addNewFileLog()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog)get_store().add_element_user(FILELOG$0);
                    return target;
                }
            }
            
            /**
             * Gets the "ConsoleLog" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog getConsoleLog()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog)get_store().find_element_user(CONSOLELOG$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ConsoleLog" element
             */
            public void setConsoleLog(de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog consoleLog)
            {
                generatedSetterHelperImpl(consoleLog, CONSOLELOG$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "ConsoleLog" element
             */
            public de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog addNewConsoleLog()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog target = null;
                    target = (de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog)get_store().add_element_user(CONSOLELOG$2);
                    return target;
                }
            }
            
            /**
             * Gets the "enable" attribute
             */
            public boolean getEnable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLE$4);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "enable" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetEnable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLE$4);
                    return target;
                }
            }
            
            /**
             * Sets the "enable" attribute
             */
            public void setEnable(boolean enable)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLE$4);
                    }
                    target.setBooleanValue(enable);
                }
            }
            
            /**
             * Sets (as xml) the "enable" attribute
             */
            public void xsetEnable(org.apache.xmlbeans.XmlBoolean enable)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLE$4);
                    }
                    target.set(enable);
                }
            }
            
            /**
             * Gets the "period" attribute
             */
            public int getPeriod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$6);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "period" attribute
             */
            public org.apache.xmlbeans.XmlInt xgetPeriod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PERIOD$6);
                    return target;
                }
            }
            
            /**
             * Sets the "period" attribute
             */
            public void setPeriod(int period)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIOD$6);
                    }
                    target.setIntValue(period);
                }
            }
            
            /**
             * Sets (as xml) the "period" attribute
             */
            public void xsetPeriod(org.apache.xmlbeans.XmlInt period)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PERIOD$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PERIOD$6);
                    }
                    target.set(period);
                }
            }
            /**
             * An XML FileLog(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class FileLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.FileLog
            {
                private static final long serialVersionUID = 1L;
                
                public FileLogImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName ENABLE$0 = 
                    new javax.xml.namespace.QName("", "enable");
                private static final javax.xml.namespace.QName FILE$2 = 
                    new javax.xml.namespace.QName("", "file");
                
                
                /**
                 * Gets the "enable" attribute
                 */
                public boolean getEnable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLE$0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "enable" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetEnable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLE$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "enable" attribute
                 */
                public void setEnable(boolean enable)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLE$0);
                      }
                      target.setBooleanValue(enable);
                    }
                }
                
                /**
                 * Sets (as xml) the "enable" attribute
                 */
                public void xsetEnable(org.apache.xmlbeans.XmlBoolean enable)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLE$0);
                      }
                      target.set(enable);
                    }
                }
                
                /**
                 * Gets the "file" attribute
                 */
                public java.lang.String getFile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "file" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetFile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILE$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "file" attribute
                 */
                public void setFile(java.lang.String file)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILE$2);
                      }
                      target.setStringValue(file);
                    }
                }
                
                /**
                 * Sets (as xml) the "file" attribute
                 */
                public void xsetFile(org.apache.xmlbeans.XmlString file)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILE$2);
                      }
                      target.set(file);
                    }
                }
            }
            /**
             * An XML ConsoleLog(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class ConsoleLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.RealtimeOutput.ConsoleLog
            {
                private static final long serialVersionUID = 1L;
                
                public ConsoleLogImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName ENABLE$0 = 
                    new javax.xml.namespace.QName("", "enable");
                
                
                /**
                 * Gets the "enable" attribute
                 */
                public boolean getEnable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLE$0);
                      if (target == null)
                      {
                        return false;
                      }
                      return target.getBooleanValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "enable" attribute
                 */
                public org.apache.xmlbeans.XmlBoolean xgetEnable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLE$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "enable" attribute
                 */
                public void setEnable(boolean enable)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLE$0);
                      }
                      target.setBooleanValue(enable);
                    }
                }
                
                /**
                 * Sets (as xml) the "enable" attribute
                 */
                public void xsetEnable(org.apache.xmlbeans.XmlBoolean enable)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBoolean target = null;
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLE$0);
                      }
                      target.set(enable);
                    }
                }
            }
        }
        /**
         * An XML RuntimeInteractionMonitor(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class RuntimeInteractionMonitorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectComputationDocument.AffectComputation.RuntimeInteractionMonitor
        {
            private static final long serialVersionUID = 1L;
            
            public RuntimeInteractionMonitorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ENABLED$0 = 
                new javax.xml.namespace.QName("", "enabled");
            
            
            /**
             * Gets the "enabled" attribute
             */
            public boolean getEnabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "enabled" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetEnabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLED$0);
                    return target;
                }
            }
            
            /**
             * Sets the "enabled" attribute
             */
            public void setEnabled(boolean enabled)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLED$0);
                    }
                    target.setBooleanValue(enabled);
                }
            }
            
            /**
             * Sets (as xml) the "enabled" attribute
             */
            public void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLED$0);
                    }
                    target.set(enabled);
                }
            }
        }
    }
}
