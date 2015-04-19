/*
 * XML Type:  SelfMoodType
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.SelfMoodType
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * An XML SelfMoodType(@xml.affect.de).
 *
 * This is a complex type.
 */
public class SelfMoodTypeImpl extends de.affect.xml.impl.AppraisalTagImpl implements de.affect.xml.SelfMoodType
{
    private static final long serialVersionUID = 1L;
    
    public SelfMoodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOOD$0 = 
        new javax.xml.namespace.QName("", "mood");
    
    
    /**
     * Gets the "mood" attribute
     */
    public de.affect.xml.MoodWord.Enum getMood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOOD$0);
            if (target == null)
            {
                return null;
            }
            return (de.affect.xml.MoodWord.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "mood" attribute
     */
    public de.affect.xml.MoodWord xgetMood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.MoodWord target = null;
            target = (de.affect.xml.MoodWord)get_store().find_attribute_user(MOOD$0);
            return target;
        }
    }
    
    /**
     * Sets the "mood" attribute
     */
    public void setMood(de.affect.xml.MoodWord.Enum mood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOOD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOOD$0);
            }
            target.setEnumValue(mood);
        }
    }
    
    /**
     * Sets (as xml) the "mood" attribute
     */
    public void xsetMood(de.affect.xml.MoodWord mood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.MoodWord target = null;
            target = (de.affect.xml.MoodWord)get_store().find_attribute_user(MOOD$0);
            if (target == null)
            {
                target = (de.affect.xml.MoodWord)get_store().add_attribute_user(MOOD$0);
            }
            target.set(mood);
        }
    }
}
