/*
 * XML Type:  AppraisalTag
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.AppraisalTag
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * An XML AppraisalTag(@xml.affect.de).
 *
 * This is a complex type.
 */
public class AppraisalTagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag
{
    private static final long serialVersionUID = 1L;
    
    public AppraisalTagImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GOODEVENT$0 = 
        new javax.xml.namespace.QName("xml.affect.de", "GoodEvent");
    private static final javax.xml.namespace.QName GOODEVENTFORGOODOTHER$2 = 
        new javax.xml.namespace.QName("xml.affect.de", "GoodEventForGoodOther");
    private static final javax.xml.namespace.QName GOODEVENTFORBADOTHER$4 = 
        new javax.xml.namespace.QName("xml.affect.de", "GoodEventForBadOther");
    private static final javax.xml.namespace.QName GOODLIKELYFUTUREEVENT$6 = 
        new javax.xml.namespace.QName("xml.affect.de", "GoodLikelyFutureEvent");
    private static final javax.xml.namespace.QName GOODUNLIKELYFUTUREEVENT$8 = 
        new javax.xml.namespace.QName("xml.affect.de", "GoodUnlikelyFutureEvent");
    private static final javax.xml.namespace.QName BADEVENT$10 = 
        new javax.xml.namespace.QName("xml.affect.de", "BadEvent");
    private static final javax.xml.namespace.QName BADEVENTFORGOODOTHER$12 = 
        new javax.xml.namespace.QName("xml.affect.de", "BadEventForGoodOther");
    private static final javax.xml.namespace.QName BADEVENTFORBADOTHER$14 = 
        new javax.xml.namespace.QName("xml.affect.de", "BadEventForBadOther");
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
    private static final javax.xml.namespace.QName BADACTSELF$26 = 
        new javax.xml.namespace.QName("xml.affect.de", "BadActSelf");
    private static final javax.xml.namespace.QName GOODACTOTHER$28 = 
        new javax.xml.namespace.QName("xml.affect.de", "GoodActOther");
    private static final javax.xml.namespace.QName BADACTOTHER$30 = 
        new javax.xml.namespace.QName("xml.affect.de", "BadActOther");
    private static final javax.xml.namespace.QName NICETHING$32 = 
        new javax.xml.namespace.QName("xml.affect.de", "NiceThing");
    private static final javax.xml.namespace.QName NASTYTHING$34 = 
        new javax.xml.namespace.QName("xml.affect.de", "NastyThing");
    
    
    /**
     * Gets the "GoodEvent" element
     */
    public de.affect.xml.AppraisalTag.GoodEvent getGoodEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodEvent target = null;
            target = (de.affect.xml.AppraisalTag.GoodEvent)get_store().find_element_user(GOODEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GoodEvent" element
     */
    public boolean isSetGoodEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODEVENT$0) != 0;
        }
    }
    
    /**
     * Sets the "GoodEvent" element
     */
    public void setGoodEvent(de.affect.xml.AppraisalTag.GoodEvent goodEvent)
    {
        generatedSetterHelperImpl(goodEvent, GOODEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GoodEvent" element
     */
    public de.affect.xml.AppraisalTag.GoodEvent addNewGoodEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodEvent target = null;
            target = (de.affect.xml.AppraisalTag.GoodEvent)get_store().add_element_user(GOODEVENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "GoodEvent" element
     */
    public void unsetGoodEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODEVENT$0, 0);
        }
    }
    
    /**
     * Gets the "GoodEventForGoodOther" element
     */
    public de.affect.xml.AppraisalTag.GoodEventForGoodOther getGoodEventForGoodOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodEventForGoodOther target = null;
            target = (de.affect.xml.AppraisalTag.GoodEventForGoodOther)get_store().find_element_user(GOODEVENTFORGOODOTHER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GoodEventForGoodOther" element
     */
    public boolean isSetGoodEventForGoodOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODEVENTFORGOODOTHER$2) != 0;
        }
    }
    
    /**
     * Sets the "GoodEventForGoodOther" element
     */
    public void setGoodEventForGoodOther(de.affect.xml.AppraisalTag.GoodEventForGoodOther goodEventForGoodOther)
    {
        generatedSetterHelperImpl(goodEventForGoodOther, GOODEVENTFORGOODOTHER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GoodEventForGoodOther" element
     */
    public de.affect.xml.AppraisalTag.GoodEventForGoodOther addNewGoodEventForGoodOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodEventForGoodOther target = null;
            target = (de.affect.xml.AppraisalTag.GoodEventForGoodOther)get_store().add_element_user(GOODEVENTFORGOODOTHER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "GoodEventForGoodOther" element
     */
    public void unsetGoodEventForGoodOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODEVENTFORGOODOTHER$2, 0);
        }
    }
    
    /**
     * Gets the "GoodEventForBadOther" element
     */
    public de.affect.xml.AppraisalTag.GoodEventForBadOther getGoodEventForBadOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodEventForBadOther target = null;
            target = (de.affect.xml.AppraisalTag.GoodEventForBadOther)get_store().find_element_user(GOODEVENTFORBADOTHER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GoodEventForBadOther" element
     */
    public boolean isSetGoodEventForBadOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODEVENTFORBADOTHER$4) != 0;
        }
    }
    
    /**
     * Sets the "GoodEventForBadOther" element
     */
    public void setGoodEventForBadOther(de.affect.xml.AppraisalTag.GoodEventForBadOther goodEventForBadOther)
    {
        generatedSetterHelperImpl(goodEventForBadOther, GOODEVENTFORBADOTHER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GoodEventForBadOther" element
     */
    public de.affect.xml.AppraisalTag.GoodEventForBadOther addNewGoodEventForBadOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodEventForBadOther target = null;
            target = (de.affect.xml.AppraisalTag.GoodEventForBadOther)get_store().add_element_user(GOODEVENTFORBADOTHER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "GoodEventForBadOther" element
     */
    public void unsetGoodEventForBadOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODEVENTFORBADOTHER$4, 0);
        }
    }
    
    /**
     * Gets the "GoodLikelyFutureEvent" element
     */
    public de.affect.xml.AppraisalTag.GoodLikelyFutureEvent getGoodLikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodLikelyFutureEvent target = null;
            target = (de.affect.xml.AppraisalTag.GoodLikelyFutureEvent)get_store().find_element_user(GOODLIKELYFUTUREEVENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GoodLikelyFutureEvent" element
     */
    public boolean isSetGoodLikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODLIKELYFUTUREEVENT$6) != 0;
        }
    }
    
    /**
     * Sets the "GoodLikelyFutureEvent" element
     */
    public void setGoodLikelyFutureEvent(de.affect.xml.AppraisalTag.GoodLikelyFutureEvent goodLikelyFutureEvent)
    {
        generatedSetterHelperImpl(goodLikelyFutureEvent, GOODLIKELYFUTUREEVENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GoodLikelyFutureEvent" element
     */
    public de.affect.xml.AppraisalTag.GoodLikelyFutureEvent addNewGoodLikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodLikelyFutureEvent target = null;
            target = (de.affect.xml.AppraisalTag.GoodLikelyFutureEvent)get_store().add_element_user(GOODLIKELYFUTUREEVENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "GoodLikelyFutureEvent" element
     */
    public void unsetGoodLikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODLIKELYFUTUREEVENT$6, 0);
        }
    }
    
    /**
     * Gets the "GoodUnlikelyFutureEvent" element
     */
    public de.affect.xml.AppraisalTag.GoodUnlikelyFutureEvent getGoodUnlikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodUnlikelyFutureEvent target = null;
            target = (de.affect.xml.AppraisalTag.GoodUnlikelyFutureEvent)get_store().find_element_user(GOODUNLIKELYFUTUREEVENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GoodUnlikelyFutureEvent" element
     */
    public boolean isSetGoodUnlikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODUNLIKELYFUTUREEVENT$8) != 0;
        }
    }
    
    /**
     * Sets the "GoodUnlikelyFutureEvent" element
     */
    public void setGoodUnlikelyFutureEvent(de.affect.xml.AppraisalTag.GoodUnlikelyFutureEvent goodUnlikelyFutureEvent)
    {
        generatedSetterHelperImpl(goodUnlikelyFutureEvent, GOODUNLIKELYFUTUREEVENT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GoodUnlikelyFutureEvent" element
     */
    public de.affect.xml.AppraisalTag.GoodUnlikelyFutureEvent addNewGoodUnlikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodUnlikelyFutureEvent target = null;
            target = (de.affect.xml.AppraisalTag.GoodUnlikelyFutureEvent)get_store().add_element_user(GOODUNLIKELYFUTUREEVENT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "GoodUnlikelyFutureEvent" element
     */
    public void unsetGoodUnlikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODUNLIKELYFUTUREEVENT$8, 0);
        }
    }
    
    /**
     * Gets the "BadEvent" element
     */
    public de.affect.xml.AppraisalTag.BadEvent getBadEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadEvent target = null;
            target = (de.affect.xml.AppraisalTag.BadEvent)get_store().find_element_user(BADEVENT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BadEvent" element
     */
    public boolean isSetBadEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BADEVENT$10) != 0;
        }
    }
    
    /**
     * Sets the "BadEvent" element
     */
    public void setBadEvent(de.affect.xml.AppraisalTag.BadEvent badEvent)
    {
        generatedSetterHelperImpl(badEvent, BADEVENT$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BadEvent" element
     */
    public de.affect.xml.AppraisalTag.BadEvent addNewBadEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadEvent target = null;
            target = (de.affect.xml.AppraisalTag.BadEvent)get_store().add_element_user(BADEVENT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "BadEvent" element
     */
    public void unsetBadEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BADEVENT$10, 0);
        }
    }
    
    /**
     * Gets the "BadEventForGoodOther" element
     */
    public de.affect.xml.AppraisalTag.BadEventForGoodOther getBadEventForGoodOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadEventForGoodOther target = null;
            target = (de.affect.xml.AppraisalTag.BadEventForGoodOther)get_store().find_element_user(BADEVENTFORGOODOTHER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BadEventForGoodOther" element
     */
    public boolean isSetBadEventForGoodOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BADEVENTFORGOODOTHER$12) != 0;
        }
    }
    
    /**
     * Sets the "BadEventForGoodOther" element
     */
    public void setBadEventForGoodOther(de.affect.xml.AppraisalTag.BadEventForGoodOther badEventForGoodOther)
    {
        generatedSetterHelperImpl(badEventForGoodOther, BADEVENTFORGOODOTHER$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BadEventForGoodOther" element
     */
    public de.affect.xml.AppraisalTag.BadEventForGoodOther addNewBadEventForGoodOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadEventForGoodOther target = null;
            target = (de.affect.xml.AppraisalTag.BadEventForGoodOther)get_store().add_element_user(BADEVENTFORGOODOTHER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "BadEventForGoodOther" element
     */
    public void unsetBadEventForGoodOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BADEVENTFORGOODOTHER$12, 0);
        }
    }
    
    /**
     * Gets the "BadEventForBadOther" element
     */
    public de.affect.xml.AppraisalTag.BadEventForBadOther getBadEventForBadOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadEventForBadOther target = null;
            target = (de.affect.xml.AppraisalTag.BadEventForBadOther)get_store().find_element_user(BADEVENTFORBADOTHER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BadEventForBadOther" element
     */
    public boolean isSetBadEventForBadOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BADEVENTFORBADOTHER$14) != 0;
        }
    }
    
    /**
     * Sets the "BadEventForBadOther" element
     */
    public void setBadEventForBadOther(de.affect.xml.AppraisalTag.BadEventForBadOther badEventForBadOther)
    {
        generatedSetterHelperImpl(badEventForBadOther, BADEVENTFORBADOTHER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BadEventForBadOther" element
     */
    public de.affect.xml.AppraisalTag.BadEventForBadOther addNewBadEventForBadOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadEventForBadOther target = null;
            target = (de.affect.xml.AppraisalTag.BadEventForBadOther)get_store().add_element_user(BADEVENTFORBADOTHER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "BadEventForBadOther" element
     */
    public void unsetBadEventForBadOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BADEVENTFORBADOTHER$14, 0);
        }
    }
    
    /**
     * Gets the "BadLikelyFutureEvent" element
     */
    public de.affect.xml.AppraisalTag.BadLikelyFutureEvent getBadLikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadLikelyFutureEvent target = null;
            target = (de.affect.xml.AppraisalTag.BadLikelyFutureEvent)get_store().find_element_user(BADLIKELYFUTUREEVENT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BadLikelyFutureEvent" element
     */
    public boolean isSetBadLikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BADLIKELYFUTUREEVENT$16) != 0;
        }
    }
    
    /**
     * Sets the "BadLikelyFutureEvent" element
     */
    public void setBadLikelyFutureEvent(de.affect.xml.AppraisalTag.BadLikelyFutureEvent badLikelyFutureEvent)
    {
        generatedSetterHelperImpl(badLikelyFutureEvent, BADLIKELYFUTUREEVENT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BadLikelyFutureEvent" element
     */
    public de.affect.xml.AppraisalTag.BadLikelyFutureEvent addNewBadLikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadLikelyFutureEvent target = null;
            target = (de.affect.xml.AppraisalTag.BadLikelyFutureEvent)get_store().add_element_user(BADLIKELYFUTUREEVENT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "BadLikelyFutureEvent" element
     */
    public void unsetBadLikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BADLIKELYFUTUREEVENT$16, 0);
        }
    }
    
    /**
     * Gets the "BadUnlikelyFutureEvent" element
     */
    public de.affect.xml.AppraisalTag.BadUnlikelyFutureEvent getBadUnlikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadUnlikelyFutureEvent target = null;
            target = (de.affect.xml.AppraisalTag.BadUnlikelyFutureEvent)get_store().find_element_user(BADUNLIKELYFUTUREEVENT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BadUnlikelyFutureEvent" element
     */
    public boolean isSetBadUnlikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BADUNLIKELYFUTUREEVENT$18) != 0;
        }
    }
    
    /**
     * Sets the "BadUnlikelyFutureEvent" element
     */
    public void setBadUnlikelyFutureEvent(de.affect.xml.AppraisalTag.BadUnlikelyFutureEvent badUnlikelyFutureEvent)
    {
        generatedSetterHelperImpl(badUnlikelyFutureEvent, BADUNLIKELYFUTUREEVENT$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BadUnlikelyFutureEvent" element
     */
    public de.affect.xml.AppraisalTag.BadUnlikelyFutureEvent addNewBadUnlikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadUnlikelyFutureEvent target = null;
            target = (de.affect.xml.AppraisalTag.BadUnlikelyFutureEvent)get_store().add_element_user(BADUNLIKELYFUTUREEVENT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "BadUnlikelyFutureEvent" element
     */
    public void unsetBadUnlikelyFutureEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BADUNLIKELYFUTUREEVENT$18, 0);
        }
    }
    
    /**
     * Gets the "EventConfirmed" element
     */
    public de.affect.xml.AppraisalTag.EventConfirmed getEventConfirmed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.EventConfirmed target = null;
            target = (de.affect.xml.AppraisalTag.EventConfirmed)get_store().find_element_user(EVENTCONFIRMED$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EventConfirmed" element
     */
    public boolean isSetEventConfirmed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTCONFIRMED$20) != 0;
        }
    }
    
    /**
     * Sets the "EventConfirmed" element
     */
    public void setEventConfirmed(de.affect.xml.AppraisalTag.EventConfirmed eventConfirmed)
    {
        generatedSetterHelperImpl(eventConfirmed, EVENTCONFIRMED$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EventConfirmed" element
     */
    public de.affect.xml.AppraisalTag.EventConfirmed addNewEventConfirmed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.EventConfirmed target = null;
            target = (de.affect.xml.AppraisalTag.EventConfirmed)get_store().add_element_user(EVENTCONFIRMED$20);
            return target;
        }
    }
    
    /**
     * Unsets the "EventConfirmed" element
     */
    public void unsetEventConfirmed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTCONFIRMED$20, 0);
        }
    }
    
    /**
     * Gets the "EventDisconfirmed" element
     */
    public de.affect.xml.AppraisalTag.EventDisconfirmed getEventDisconfirmed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.EventDisconfirmed target = null;
            target = (de.affect.xml.AppraisalTag.EventDisconfirmed)get_store().find_element_user(EVENTDISCONFIRMED$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EventDisconfirmed" element
     */
    public boolean isSetEventDisconfirmed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDISCONFIRMED$22) != 0;
        }
    }
    
    /**
     * Sets the "EventDisconfirmed" element
     */
    public void setEventDisconfirmed(de.affect.xml.AppraisalTag.EventDisconfirmed eventDisconfirmed)
    {
        generatedSetterHelperImpl(eventDisconfirmed, EVENTDISCONFIRMED$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EventDisconfirmed" element
     */
    public de.affect.xml.AppraisalTag.EventDisconfirmed addNewEventDisconfirmed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.EventDisconfirmed target = null;
            target = (de.affect.xml.AppraisalTag.EventDisconfirmed)get_store().add_element_user(EVENTDISCONFIRMED$22);
            return target;
        }
    }
    
    /**
     * Unsets the "EventDisconfirmed" element
     */
    public void unsetEventDisconfirmed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDISCONFIRMED$22, 0);
        }
    }
    
    /**
     * Gets the "GoodActSelf" element
     */
    public de.affect.xml.AppraisalTag.GoodActSelf getGoodActSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodActSelf target = null;
            target = (de.affect.xml.AppraisalTag.GoodActSelf)get_store().find_element_user(GOODACTSELF$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GoodActSelf" element
     */
    public boolean isSetGoodActSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODACTSELF$24) != 0;
        }
    }
    
    /**
     * Sets the "GoodActSelf" element
     */
    public void setGoodActSelf(de.affect.xml.AppraisalTag.GoodActSelf goodActSelf)
    {
        generatedSetterHelperImpl(goodActSelf, GOODACTSELF$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GoodActSelf" element
     */
    public de.affect.xml.AppraisalTag.GoodActSelf addNewGoodActSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodActSelf target = null;
            target = (de.affect.xml.AppraisalTag.GoodActSelf)get_store().add_element_user(GOODACTSELF$24);
            return target;
        }
    }
    
    /**
     * Unsets the "GoodActSelf" element
     */
    public void unsetGoodActSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODACTSELF$24, 0);
        }
    }
    
    /**
     * Gets the "BadActSelf" element
     */
    public de.affect.xml.AppraisalTag.BadActSelf getBadActSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadActSelf target = null;
            target = (de.affect.xml.AppraisalTag.BadActSelf)get_store().find_element_user(BADACTSELF$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BadActSelf" element
     */
    public boolean isSetBadActSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BADACTSELF$26) != 0;
        }
    }
    
    /**
     * Sets the "BadActSelf" element
     */
    public void setBadActSelf(de.affect.xml.AppraisalTag.BadActSelf badActSelf)
    {
        generatedSetterHelperImpl(badActSelf, BADACTSELF$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BadActSelf" element
     */
    public de.affect.xml.AppraisalTag.BadActSelf addNewBadActSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadActSelf target = null;
            target = (de.affect.xml.AppraisalTag.BadActSelf)get_store().add_element_user(BADACTSELF$26);
            return target;
        }
    }
    
    /**
     * Unsets the "BadActSelf" element
     */
    public void unsetBadActSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BADACTSELF$26, 0);
        }
    }
    
    /**
     * Gets the "GoodActOther" element
     */
    public de.affect.xml.AppraisalTag.GoodActOther getGoodActOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodActOther target = null;
            target = (de.affect.xml.AppraisalTag.GoodActOther)get_store().find_element_user(GOODACTOTHER$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GoodActOther" element
     */
    public boolean isSetGoodActOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODACTOTHER$28) != 0;
        }
    }
    
    /**
     * Sets the "GoodActOther" element
     */
    public void setGoodActOther(de.affect.xml.AppraisalTag.GoodActOther goodActOther)
    {
        generatedSetterHelperImpl(goodActOther, GOODACTOTHER$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GoodActOther" element
     */
    public de.affect.xml.AppraisalTag.GoodActOther addNewGoodActOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.GoodActOther target = null;
            target = (de.affect.xml.AppraisalTag.GoodActOther)get_store().add_element_user(GOODACTOTHER$28);
            return target;
        }
    }
    
    /**
     * Unsets the "GoodActOther" element
     */
    public void unsetGoodActOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODACTOTHER$28, 0);
        }
    }
    
    /**
     * Gets the "BadActOther" element
     */
    public de.affect.xml.AppraisalTag.BadActOther getBadActOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadActOther target = null;
            target = (de.affect.xml.AppraisalTag.BadActOther)get_store().find_element_user(BADACTOTHER$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BadActOther" element
     */
    public boolean isSetBadActOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BADACTOTHER$30) != 0;
        }
    }
    
    /**
     * Sets the "BadActOther" element
     */
    public void setBadActOther(de.affect.xml.AppraisalTag.BadActOther badActOther)
    {
        generatedSetterHelperImpl(badActOther, BADACTOTHER$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BadActOther" element
     */
    public de.affect.xml.AppraisalTag.BadActOther addNewBadActOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.BadActOther target = null;
            target = (de.affect.xml.AppraisalTag.BadActOther)get_store().add_element_user(BADACTOTHER$30);
            return target;
        }
    }
    
    /**
     * Unsets the "BadActOther" element
     */
    public void unsetBadActOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BADACTOTHER$30, 0);
        }
    }
    
    /**
     * Gets the "NiceThing" element
     */
    public de.affect.xml.AppraisalTag.NiceThing getNiceThing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.NiceThing target = null;
            target = (de.affect.xml.AppraisalTag.NiceThing)get_store().find_element_user(NICETHING$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NiceThing" element
     */
    public boolean isSetNiceThing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NICETHING$32) != 0;
        }
    }
    
    /**
     * Sets the "NiceThing" element
     */
    public void setNiceThing(de.affect.xml.AppraisalTag.NiceThing niceThing)
    {
        generatedSetterHelperImpl(niceThing, NICETHING$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "NiceThing" element
     */
    public de.affect.xml.AppraisalTag.NiceThing addNewNiceThing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.NiceThing target = null;
            target = (de.affect.xml.AppraisalTag.NiceThing)get_store().add_element_user(NICETHING$32);
            return target;
        }
    }
    
    /**
     * Unsets the "NiceThing" element
     */
    public void unsetNiceThing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NICETHING$32, 0);
        }
    }
    
    /**
     * Gets the "NastyThing" element
     */
    public de.affect.xml.AppraisalTag.NastyThing getNastyThing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.NastyThing target = null;
            target = (de.affect.xml.AppraisalTag.NastyThing)get_store().find_element_user(NASTYTHING$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NastyThing" element
     */
    public boolean isSetNastyThing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NASTYTHING$34) != 0;
        }
    }
    
    /**
     * Sets the "NastyThing" element
     */
    public void setNastyThing(de.affect.xml.AppraisalTag.NastyThing nastyThing)
    {
        generatedSetterHelperImpl(nastyThing, NASTYTHING$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "NastyThing" element
     */
    public de.affect.xml.AppraisalTag.NastyThing addNewNastyThing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.AppraisalTag.NastyThing target = null;
            target = (de.affect.xml.AppraisalTag.NastyThing)get_store().add_element_user(NASTYTHING$34);
            return target;
        }
    }
    
    /**
     * Unsets the "NastyThing" element
     */
    public void unsetNastyThing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NASTYTHING$34, 0);
        }
    }
    /**
     * An XML GoodEvent(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class GoodEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.GoodEvent
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
    public static class GoodEventForGoodOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.GoodEventForGoodOther
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
    public static class GoodEventForBadOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.GoodEventForBadOther
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
     * An XML GoodLikelyFutureEvent(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class GoodLikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.GoodLikelyFutureEvent
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
    public static class GoodUnlikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.GoodUnlikelyFutureEvent
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
     * An XML BadEvent(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class BadEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.BadEvent
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
    public static class BadEventForGoodOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.BadEventForGoodOther
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
    public static class BadEventForBadOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.BadEventForBadOther
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
     * An XML BadLikelyFutureEvent(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class BadLikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.BadLikelyFutureEvent
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
    public static class BadUnlikelyFutureEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.BadUnlikelyFutureEvent
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
    public static class EventConfirmedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.EventConfirmed
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
    public static class EventDisconfirmedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.EventDisconfirmed
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
    public static class GoodActSelfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.GoodActSelf
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
     * An XML BadActSelf(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class BadActSelfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.BadActSelf
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
     * An XML GoodActOther(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class GoodActOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.GoodActOther
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
     * An XML BadActOther(@xml.affect.de).
     *
     * This is a complex type.
     */
    public static class BadActOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.BadActOther
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
    public static class NiceThingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.NiceThing
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
    public static class NastyThingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.AppraisalTag.NastyThing
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
