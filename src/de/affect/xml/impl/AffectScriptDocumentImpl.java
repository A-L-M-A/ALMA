/*
 * An XML document type.
 * Localname: AffectScript
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AffectScriptDocument
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * A document containing one AffectScript(@xml.affect.de) element.
 *
 * This is a complex type.
 */
public class AffectScriptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectScriptDocument
{
    private static final long serialVersionUID = 1L;
    
    public AffectScriptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFECTSCRIPT$0 = 
        new javax.xml.namespace.QName("xml.affect.de", "AffectScript");
    
    
    /**
     * Gets the "AffectScript" element
     */
    public de.affect.xml.AffectScriptDocument.AffectScript getAffectScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectScriptDocument.AffectScript target = null;
            target = (de.affect.xml.AffectScriptDocument.AffectScript)get_store().find_element_user(AFFECTSCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffectScript" element
     */
    public void setAffectScript(de.affect.xml.AffectScriptDocument.AffectScript affectScript)
    {
        generatedSetterHelperImpl(affectScript, AFFECTSCRIPT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AffectScript" element
     */
    public de.affect.xml.AffectScriptDocument.AffectScript addNewAffectScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AffectScriptDocument.AffectScript target = null;
            target = (de.affect.xml.AffectScriptDocument.AffectScript)get_store().add_element_user(AFFECTSCRIPT$0);
            return target;
        }
    }
    /**
     * An XML AffectScript(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class AffectScriptImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectScriptDocument.AffectScript
    {
        private static final long serialVersionUID = 1L;
        
        public AffectScriptImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTEXT$0 = 
            new javax.xml.namespace.QName("xml.affect.de", "Context");
        private static final javax.xml.namespace.QName ITEM$2 = 
            new javax.xml.namespace.QName("xml.affect.de", "Item");
        
        
        /**
         * Gets the "Context" element
         */
        public java.lang.String getContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Context" element
         */
        public org.apache.xmlbeans.XmlString xgetContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEXT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Context" element
         */
        public boolean isSetContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTEXT$0) != 0;
            }
        }
        
        /**
         * Sets the "Context" element
         */
        public void setContext(java.lang.String context)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEXT$0);
                }
                target.setStringValue(context);
            }
        }
        
        /**
         * Sets (as xml) the "Context" element
         */
        public void xsetContext(org.apache.xmlbeans.XmlString context)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEXT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTEXT$0);
                }
                target.set(context);
            }
        }
        
        /**
         * Unsets the "Context" element
         */
        public void unsetContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTEXT$0, 0);
            }
        }
        
        /**
         * Gets a List of "Item" elements
         */
        public java.util.List<de.affect.xml.AffectScriptDocument.AffectScript.Item> getItemList()
        {
            final class ItemList extends java.util.AbstractList<de.affect.xml.AffectScriptDocument.AffectScript.Item>
            {
                @Override
                public de.affect.xml.AffectScriptDocument.AffectScript.Item get(int i)
                    { return AffectScriptImpl.this.getItemArray(i); }
                
                @Override
                public de.affect.xml.AffectScriptDocument.AffectScript.Item set(int i, de.affect.xml.AffectScriptDocument.AffectScript.Item o)
                {
                    de.affect.xml.AffectScriptDocument.AffectScript.Item old = AffectScriptImpl.this.getItemArray(i);
                    AffectScriptImpl.this.setItemArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.affect.xml.AffectScriptDocument.AffectScript.Item o)
                    { AffectScriptImpl.this.insertNewItem(i).set(o); }
                
                @Override
                public de.affect.xml.AffectScriptDocument.AffectScript.Item remove(int i)
                {
                    de.affect.xml.AffectScriptDocument.AffectScript.Item old = AffectScriptImpl.this.getItemArray(i);
                    AffectScriptImpl.this.removeItem(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AffectScriptImpl.this.sizeOfItemArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ItemList();
            }
        }
        
        /**
         * Gets array of all "Item" elements
         * @deprecated
         */
        @Deprecated
        public de.affect.xml.AffectScriptDocument.AffectScript.Item[] getItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.affect.xml.AffectScriptDocument.AffectScript.Item> targetList = new java.util.ArrayList<de.affect.xml.AffectScriptDocument.AffectScript.Item>();
                get_store().find_all_element_users(ITEM$2, targetList);
                de.affect.xml.AffectScriptDocument.AffectScript.Item[] result = new de.affect.xml.AffectScriptDocument.AffectScript.Item[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Item" element
         */
        public de.affect.xml.AffectScriptDocument.AffectScript.Item getItemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectScriptDocument.AffectScript.Item target = null;
                target = (de.affect.xml.AffectScriptDocument.AffectScript.Item)get_store().find_element_user(ITEM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Item" element
         */
        public int sizeOfItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ITEM$2);
            }
        }
        
        /**
         * Sets array of all "Item" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setItemArray(de.affect.xml.AffectScriptDocument.AffectScript.Item[] itemArray)
        {
            check_orphaned();
            arraySetterHelper(itemArray, ITEM$2);
        }
        
        /**
         * Sets ith "Item" element
         */
        public void setItemArray(int i, de.affect.xml.AffectScriptDocument.AffectScript.Item item)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectScriptDocument.AffectScript.Item target = null;
                target = (de.affect.xml.AffectScriptDocument.AffectScript.Item)get_store().find_element_user(ITEM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(item);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Item" element
         */
        public de.affect.xml.AffectScriptDocument.AffectScript.Item insertNewItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectScriptDocument.AffectScript.Item target = null;
                target = (de.affect.xml.AffectScriptDocument.AffectScript.Item)get_store().insert_element_user(ITEM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Item" element
         */
        public de.affect.xml.AffectScriptDocument.AffectScript.Item addNewItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.affect.xml.AffectScriptDocument.AffectScript.Item target = null;
                target = (de.affect.xml.AffectScriptDocument.AffectScript.Item)get_store().add_element_user(ITEM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Item" element
         */
        public void removeItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ITEM$2, i);
            }
        }
        /**
         * An XML Item(@xml.affect.de).
         *
         * This is a complex type.
         */
        public static class ItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectScriptDocument.AffectScript.Item
        {
            private static final long serialVersionUID = 1L;
            
            public ItemImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AFFECTINPUT$0 = 
                new javax.xml.namespace.QName("xml.affect.de", "AffectInput");
            private static final javax.xml.namespace.QName APPRAISAL$2 = 
                new javax.xml.namespace.QName("xml.affect.de", "Appraisal");
            private static final javax.xml.namespace.QName RESETCHARACTER$4 = 
                new javax.xml.namespace.QName("xml.affect.de", "ResetCharacter");
            private static final javax.xml.namespace.QName CONTEXT$6 = 
                new javax.xml.namespace.QName("xml.affect.de", "Context");
            private static final javax.xml.namespace.QName TIME$8 = 
                new javax.xml.namespace.QName("", "time");
            
            
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
             * True if has "AffectInput" element
             */
            public boolean isSetAffectInput()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AFFECTINPUT$0) != 0;
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
             * Unsets the "AffectInput" element
             */
            public void unsetAffectInput()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AFFECTINPUT$0, 0);
                }
            }
            
            /**
             * Gets the "Appraisal" element
             */
            public de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal getAppraisal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal target = null;
                    target = (de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal)get_store().find_element_user(APPRAISAL$2, 0);
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
                    return get_store().count_elements(APPRAISAL$2) != 0;
                }
            }
            
            /**
             * Sets the "Appraisal" element
             */
            public void setAppraisal(de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal appraisal)
            {
                generatedSetterHelperImpl(appraisal, APPRAISAL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "Appraisal" element
             */
            public de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal addNewAppraisal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal target = null;
                    target = (de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal)get_store().add_element_user(APPRAISAL$2);
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
                    get_store().remove_element(APPRAISAL$2, 0);
                }
            }
            
            /**
             * Gets the "ResetCharacter" element
             */
            public de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter getResetCharacter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter target = null;
                    target = (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter)get_store().find_element_user(RESETCHARACTER$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "ResetCharacter" element
             */
            public boolean isSetResetCharacter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESETCHARACTER$4) != 0;
                }
            }
            
            /**
             * Sets the "ResetCharacter" element
             */
            public void setResetCharacter(de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter resetCharacter)
            {
                generatedSetterHelperImpl(resetCharacter, RESETCHARACTER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "ResetCharacter" element
             */
            public de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter addNewResetCharacter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter target = null;
                    target = (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter)get_store().add_element_user(RESETCHARACTER$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "ResetCharacter" element
             */
            public void unsetResetCharacter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESETCHARACTER$4, 0);
                }
            }
            
            /**
             * Gets the "Context" element
             */
            public java.lang.String getContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Context" element
             */
            public org.apache.xmlbeans.XmlString xgetContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEXT$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Context" element
             */
            public boolean isSetContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONTEXT$6) != 0;
                }
            }
            
            /**
             * Sets the "Context" element
             */
            public void setContext(java.lang.String context)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEXT$6);
                    }
                    target.setStringValue(context);
                }
            }
            
            /**
             * Sets (as xml) the "Context" element
             */
            public void xsetContext(org.apache.xmlbeans.XmlString context)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEXT$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTEXT$6);
                    }
                    target.set(context);
                }
            }
            
            /**
             * Unsets the "Context" element
             */
            public void unsetContext()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONTEXT$6, 0);
                }
            }
            
            /**
             * Gets the "time" attribute
             */
            public long getTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$8);
                    if (target == null)
                    {
                      return 0L;
                    }
                    return target.getLongValue();
                }
            }
            
            /**
             * Gets (as xml) the "time" attribute
             */
            public org.apache.xmlbeans.XmlLong xgetTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLong target = null;
                    target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIME$8);
                    return target;
                }
            }
            
            /**
             * Sets the "time" attribute
             */
            public void setTime(long time)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$8);
                    }
                    target.setLongValue(time);
                }
            }
            
            /**
             * Sets (as xml) the "time" attribute
             */
            public void xsetTime(org.apache.xmlbeans.XmlLong time)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLong target = null;
                    target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(TIME$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(TIME$8);
                    }
                    target.set(time);
                }
            }
            /**
             * An XML Appraisal(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class AppraisalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectScriptDocument.AffectScript.Item.Appraisal
            {
                private static final long serialVersionUID = 1L;
                
                public AppraisalImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SELFACT$0 = 
                    new javax.xml.namespace.QName("xml.affect.de", "SelfAct");
                private static final javax.xml.namespace.QName DIRECTACT$2 = 
                    new javax.xml.namespace.QName("xml.affect.de", "DirectAct");
                private static final javax.xml.namespace.QName INDIRECTACT$4 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectAct");
                private static final javax.xml.namespace.QName SELFEMOTION$6 = 
                    new javax.xml.namespace.QName("xml.affect.de", "SelfEmotion");
                private static final javax.xml.namespace.QName INDIRECTEMOTION$8 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectEmotion");
                private static final javax.xml.namespace.QName SELFMOOD$10 = 
                    new javax.xml.namespace.QName("xml.affect.de", "SelfMood");
                private static final javax.xml.namespace.QName INDIRECTMOOD$12 = 
                    new javax.xml.namespace.QName("xml.affect.de", "IndirectMood");
                
                
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
                      get_store().find_all_element_users(SELFACT$0, targetList);
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
                      target = (de.affect.xml.SelfActType)get_store().find_element_user(SELFACT$0, i);
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
                      return get_store().count_elements(SELFACT$0);
                    }
                }
                
                /**
                 * Sets array of all "SelfAct" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setSelfActArray(de.affect.xml.SelfActType[] selfActArray)
                {
                    check_orphaned();
                    arraySetterHelper(selfActArray, SELFACT$0);
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
                      target = (de.affect.xml.SelfActType)get_store().find_element_user(SELFACT$0, i);
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
                      target = (de.affect.xml.SelfActType)get_store().insert_element_user(SELFACT$0, i);
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
                      target = (de.affect.xml.SelfActType)get_store().add_element_user(SELFACT$0);
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
                      get_store().remove_element(SELFACT$0, i);
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
                      get_store().find_all_element_users(DIRECTACT$2, targetList);
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
                      target = (de.affect.xml.DirectActType)get_store().find_element_user(DIRECTACT$2, i);
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
                      return get_store().count_elements(DIRECTACT$2);
                    }
                }
                
                /**
                 * Sets array of all "DirectAct" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setDirectActArray(de.affect.xml.DirectActType[] directActArray)
                {
                    check_orphaned();
                    arraySetterHelper(directActArray, DIRECTACT$2);
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
                      target = (de.affect.xml.DirectActType)get_store().find_element_user(DIRECTACT$2, i);
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
                      target = (de.affect.xml.DirectActType)get_store().insert_element_user(DIRECTACT$2, i);
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
                      target = (de.affect.xml.DirectActType)get_store().add_element_user(DIRECTACT$2);
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
                      get_store().remove_element(DIRECTACT$2, i);
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
                      get_store().find_all_element_users(INDIRECTACT$4, targetList);
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
                      target = (de.affect.xml.IndirectActType)get_store().find_element_user(INDIRECTACT$4, i);
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
                      return get_store().count_elements(INDIRECTACT$4);
                    }
                }
                
                /**
                 * Sets array of all "IndirectAct" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectActArray(de.affect.xml.IndirectActType[] indirectActArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectActArray, INDIRECTACT$4);
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
                      target = (de.affect.xml.IndirectActType)get_store().find_element_user(INDIRECTACT$4, i);
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
                      target = (de.affect.xml.IndirectActType)get_store().insert_element_user(INDIRECTACT$4, i);
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
                      target = (de.affect.xml.IndirectActType)get_store().add_element_user(INDIRECTACT$4);
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
                      get_store().remove_element(INDIRECTACT$4, i);
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
                      get_store().find_all_element_users(SELFEMOTION$6, targetList);
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
                      target = (de.affect.xml.SelfEmotionType)get_store().find_element_user(SELFEMOTION$6, i);
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
                      return get_store().count_elements(SELFEMOTION$6);
                    }
                }
                
                /**
                 * Sets array of all "SelfEmotion" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setSelfEmotionArray(de.affect.xml.SelfEmotionType[] selfEmotionArray)
                {
                    check_orphaned();
                    arraySetterHelper(selfEmotionArray, SELFEMOTION$6);
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
                      target = (de.affect.xml.SelfEmotionType)get_store().find_element_user(SELFEMOTION$6, i);
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
                      target = (de.affect.xml.SelfEmotionType)get_store().insert_element_user(SELFEMOTION$6, i);
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
                      target = (de.affect.xml.SelfEmotionType)get_store().add_element_user(SELFEMOTION$6);
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
                      get_store().remove_element(SELFEMOTION$6, i);
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
                      get_store().find_all_element_users(INDIRECTEMOTION$8, targetList);
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
                      target = (de.affect.xml.IndirectEmotionType)get_store().find_element_user(INDIRECTEMOTION$8, i);
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
                      return get_store().count_elements(INDIRECTEMOTION$8);
                    }
                }
                
                /**
                 * Sets array of all "IndirectEmotion" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectEmotionArray(de.affect.xml.IndirectEmotionType[] indirectEmotionArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectEmotionArray, INDIRECTEMOTION$8);
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
                      target = (de.affect.xml.IndirectEmotionType)get_store().find_element_user(INDIRECTEMOTION$8, i);
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
                      target = (de.affect.xml.IndirectEmotionType)get_store().insert_element_user(INDIRECTEMOTION$8, i);
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
                      target = (de.affect.xml.IndirectEmotionType)get_store().add_element_user(INDIRECTEMOTION$8);
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
                      get_store().remove_element(INDIRECTEMOTION$8, i);
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
                      get_store().find_all_element_users(SELFMOOD$10, targetList);
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
                      target = (de.affect.xml.SelfMoodType)get_store().find_element_user(SELFMOOD$10, i);
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
                      return get_store().count_elements(SELFMOOD$10);
                    }
                }
                
                /**
                 * Sets array of all "SelfMood" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setSelfMoodArray(de.affect.xml.SelfMoodType[] selfMoodArray)
                {
                    check_orphaned();
                    arraySetterHelper(selfMoodArray, SELFMOOD$10);
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
                      target = (de.affect.xml.SelfMoodType)get_store().find_element_user(SELFMOOD$10, i);
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
                      target = (de.affect.xml.SelfMoodType)get_store().insert_element_user(SELFMOOD$10, i);
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
                      target = (de.affect.xml.SelfMoodType)get_store().add_element_user(SELFMOOD$10);
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
                      get_store().remove_element(SELFMOOD$10, i);
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
                      get_store().find_all_element_users(INDIRECTMOOD$12, targetList);
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
                      target = (de.affect.xml.IndirectMoodType)get_store().find_element_user(INDIRECTMOOD$12, i);
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
                      return get_store().count_elements(INDIRECTMOOD$12);
                    }
                }
                
                /**
                 * Sets array of all "IndirectMood" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setIndirectMoodArray(de.affect.xml.IndirectMoodType[] indirectMoodArray)
                {
                    check_orphaned();
                    arraySetterHelper(indirectMoodArray, INDIRECTMOOD$12);
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
                      target = (de.affect.xml.IndirectMoodType)get_store().find_element_user(INDIRECTMOOD$12, i);
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
                      target = (de.affect.xml.IndirectMoodType)get_store().insert_element_user(INDIRECTMOOD$12, i);
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
                      target = (de.affect.xml.IndirectMoodType)get_store().add_element_user(INDIRECTMOOD$12);
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
                      get_store().remove_element(INDIRECTMOOD$12, i);
                    }
                }
            }
            /**
             * An XML ResetCharacter(@xml.affect.de).
             *
             * This is a complex type.
             */
            public static class ResetCharacterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter
            {
                private static final long serialVersionUID = 1L;
                
                public ResetCharacterImpl(org.apache.xmlbeans.SchemaType sType)
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
                public de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name target = null;
                      target = (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name)get_store().find_attribute_user(NAME$0);
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
                public void xsetName(de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name target = null;
                      target = (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        target = (de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name)get_store().add_attribute_user(NAME$0);
                      }
                      target.set(name);
                    }
                }
                /**
                 * An XML name(@).
                 *
                 * This is an atomic type that is a restriction of de.affect.xml.AffectScriptDocument$AffectScript$Item$ResetCharacter$Name.
                 */
                public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.affect.xml.AffectScriptDocument.AffectScript.Item.ResetCharacter.Name
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
    }
}
