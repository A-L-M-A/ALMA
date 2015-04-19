/*
 * XML Type:  IndirectEmotionType
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.IndirectEmotionType
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * An XML IndirectEmotionType(@xml.affect.de).
 *
 * This is a complex type.
 */
public class IndirectEmotionTypeImpl extends de.affect.xml.impl.AppraisalTagImpl implements de.affect.xml.IndirectEmotionType
{
    private static final long serialVersionUID = 1L;
    
    public IndirectEmotionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMOTION$0 = 
        new javax.xml.namespace.QName("", "emotion");
    private static final javax.xml.namespace.QName PERFORMER$2 = 
        new javax.xml.namespace.QName("", "performer");
    
    
    /**
     * Gets the "emotion" attribute
     */
    public de.affect.xml.EmotionName.Enum getEmotion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMOTION$0);
            if (target == null)
            {
                return null;
            }
            return (de.affect.xml.EmotionName.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "emotion" attribute
     */
    public de.affect.xml.EmotionName xgetEmotion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.EmotionName target = null;
            target = (de.affect.xml.EmotionName)get_store().find_attribute_user(EMOTION$0);
            return target;
        }
    }
    
    /**
     * Sets the "emotion" attribute
     */
    public void setEmotion(de.affect.xml.EmotionName.Enum emotion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMOTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EMOTION$0);
            }
            target.setEnumValue(emotion);
        }
    }
    
    /**
     * Sets (as xml) the "emotion" attribute
     */
    public void xsetEmotion(de.affect.xml.EmotionName emotion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.EmotionName target = null;
            target = (de.affect.xml.EmotionName)get_store().find_attribute_user(EMOTION$0);
            if (target == null)
            {
                target = (de.affect.xml.EmotionName)get_store().add_attribute_user(EMOTION$0);
            }
            target.set(emotion);
        }
    }
    
    /**
     * Gets the "performer" attribute
     */
    public java.lang.String getPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMER$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "performer" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERFORMER$2);
            return target;
        }
    }
    
    /**
     * Sets the "performer" attribute
     */
    public void setPerformer(java.lang.String performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERFORMER$2);
            }
            target.setStringValue(performer);
        }
    }
    
    /**
     * Sets (as xml) the "performer" attribute
     */
    public void xsetPerformer(org.apache.xmlbeans.XmlString performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERFORMER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERFORMER$2);
            }
            target.set(performer);
        }
    }
}
