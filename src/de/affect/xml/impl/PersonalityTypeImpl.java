/*
 * XML Type:  PersonalityType
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.PersonalityType
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * An XML PersonalityType(@xml.affect.de).
 *
 * This is a complex type.
 */
public class PersonalityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.PersonalityType
{
    private static final long serialVersionUID = 1L;
    
    public PersonalityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPENNESS$0 = 
        new javax.xml.namespace.QName("", "openness");
    private static final javax.xml.namespace.QName CONSCIENTIOUSNESS$2 = 
        new javax.xml.namespace.QName("", "conscientiousness");
    private static final javax.xml.namespace.QName EXTRAVERSION$4 = 
        new javax.xml.namespace.QName("", "extraversion");
    private static final javax.xml.namespace.QName AGREEABLENESS$6 = 
        new javax.xml.namespace.QName("", "agreeableness");
    private static final javax.xml.namespace.QName NEUROTISM$8 = 
        new javax.xml.namespace.QName("", "neurotism");
    
    
    /**
     * Gets the "openness" attribute
     */
    public double getOpenness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPENNESS$0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "openness" attribute
     */
    public de.affect.xml.SignedIntensity xgetOpenness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(OPENNESS$0);
            return target;
        }
    }
    
    /**
     * Sets the "openness" attribute
     */
    public void setOpenness(double openness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPENNESS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPENNESS$0);
            }
            target.setDoubleValue(openness);
        }
    }
    
    /**
     * Sets (as xml) the "openness" attribute
     */
    public void xsetOpenness(de.affect.xml.SignedIntensity openness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(OPENNESS$0);
            if (target == null)
            {
                target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(OPENNESS$0);
            }
            target.set(openness);
        }
    }
    
    /**
     * Gets the "conscientiousness" attribute
     */
    public double getConscientiousness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSCIENTIOUSNESS$2);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "conscientiousness" attribute
     */
    public de.affect.xml.SignedIntensity xgetConscientiousness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(CONSCIENTIOUSNESS$2);
            return target;
        }
    }
    
    /**
     * Sets the "conscientiousness" attribute
     */
    public void setConscientiousness(double conscientiousness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSCIENTIOUSNESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSCIENTIOUSNESS$2);
            }
            target.setDoubleValue(conscientiousness);
        }
    }
    
    /**
     * Sets (as xml) the "conscientiousness" attribute
     */
    public void xsetConscientiousness(de.affect.xml.SignedIntensity conscientiousness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(CONSCIENTIOUSNESS$2);
            if (target == null)
            {
                target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(CONSCIENTIOUSNESS$2);
            }
            target.set(conscientiousness);
        }
    }
    
    /**
     * Gets the "extraversion" attribute
     */
    public double getExtraversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRAVERSION$4);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "extraversion" attribute
     */
    public de.affect.xml.SignedIntensity xgetExtraversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(EXTRAVERSION$4);
            return target;
        }
    }
    
    /**
     * Sets the "extraversion" attribute
     */
    public void setExtraversion(double extraversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRAVERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTRAVERSION$4);
            }
            target.setDoubleValue(extraversion);
        }
    }
    
    /**
     * Sets (as xml) the "extraversion" attribute
     */
    public void xsetExtraversion(de.affect.xml.SignedIntensity extraversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(EXTRAVERSION$4);
            if (target == null)
            {
                target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(EXTRAVERSION$4);
            }
            target.set(extraversion);
        }
    }
    
    /**
     * Gets the "agreeableness" attribute
     */
    public double getAgreeableness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGREEABLENESS$6);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "agreeableness" attribute
     */
    public de.affect.xml.SignedIntensity xgetAgreeableness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AGREEABLENESS$6);
            return target;
        }
    }
    
    /**
     * Sets the "agreeableness" attribute
     */
    public void setAgreeableness(double agreeableness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGREEABLENESS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGREEABLENESS$6);
            }
            target.setDoubleValue(agreeableness);
        }
    }
    
    /**
     * Sets (as xml) the "agreeableness" attribute
     */
    public void xsetAgreeableness(de.affect.xml.SignedIntensity agreeableness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AGREEABLENESS$6);
            if (target == null)
            {
                target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(AGREEABLENESS$6);
            }
            target.set(agreeableness);
        }
    }
    
    /**
     * Gets the "neurotism" attribute
     */
    public double getNeurotism()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEUROTISM$8);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "neurotism" attribute
     */
    public de.affect.xml.SignedIntensity xgetNeurotism()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(NEUROTISM$8);
            return target;
        }
    }
    
    /**
     * Sets the "neurotism" attribute
     */
    public void setNeurotism(double neurotism)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEUROTISM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEUROTISM$8);
            }
            target.setDoubleValue(neurotism);
        }
    }
    
    /**
     * Sets (as xml) the "neurotism" attribute
     */
    public void xsetNeurotism(de.affect.xml.SignedIntensity neurotism)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.SignedIntensity target = null;
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(NEUROTISM$8);
            if (target == null)
            {
                target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(NEUROTISM$8);
            }
            target.set(neurotism);
        }
    }
}
