/*
 * XML Type:  EmotionType
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.EmotionType
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * An XML EmotionType(@xml.affect.de).
 *
 * This is a complex type.
 */
public class EmotionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.EmotionType
{
    private static final long serialVersionUID = 1L;
    
    public EmotionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "value");
    
    
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
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
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
            target = (de.affect.xml.Intensity)get_store().find_attribute_user(VALUE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
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
            target = (de.affect.xml.Intensity)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (de.affect.xml.Intensity)get_store().add_attribute_user(VALUE$2);
            }
            target.set(value);
        }
    }
}
