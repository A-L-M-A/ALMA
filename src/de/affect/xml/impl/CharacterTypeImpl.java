/*
 * XML Type:  CharacterType
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.CharacterType
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * An XML CharacterType(@xml.affect.de).
 *
 * This is a complex type.
 */
public class CharacterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.CharacterType
{
    private static final long serialVersionUID = 1L;
    
    public CharacterTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    public de.affect.xml.CharacterType.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.CharacterType.Name target = null;
            target = (de.affect.xml.CharacterType.Name)get_store().find_attribute_user(NAME$0);
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
    public void xsetName(de.affect.xml.CharacterType.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.CharacterType.Name target = null;
            target = (de.affect.xml.CharacterType.Name)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (de.affect.xml.CharacterType.Name)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    /**
     * An XML name(@).
     *
     * This is an atomic type that is a restriction of de.affect.xml.CharacterType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.affect.xml.CharacterType.Name
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
