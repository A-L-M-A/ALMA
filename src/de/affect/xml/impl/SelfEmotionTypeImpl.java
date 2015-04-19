/*
 * XML Type:  SelfEmotionType
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.SelfEmotionType
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * An XML SelfEmotionType(@xml.affect.de).
 *
 * This is a complex type.
 */
public class SelfEmotionTypeImpl extends de.affect.xml.impl.AppraisalTagImpl implements de.affect.xml.SelfEmotionType
{
    private static final long serialVersionUID = 1L;
    
    public SelfEmotionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMOTION$0 = 
        new javax.xml.namespace.QName("", "emotion");
    
    
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
}
