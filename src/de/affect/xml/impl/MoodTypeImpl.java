/*
 * XML Type:  MoodType
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.MoodType
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml.impl;
/**
 * An XML MoodType(@xml.affect.de).
 *
 * This is a complex type.
 */
public class MoodTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.affect.xml.MoodType
{
    private static final long serialVersionUID = 1L;
    
    public MoodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOODWORD$0 = 
        new javax.xml.namespace.QName("", "moodword");
    private static final javax.xml.namespace.QName INTENSITY$2 = 
        new javax.xml.namespace.QName("", "intensity");
    private static final javax.xml.namespace.QName PLEASURE$4 = 
        new javax.xml.namespace.QName("", "pleasure");
    private static final javax.xml.namespace.QName AROUSAL$6 = 
        new javax.xml.namespace.QName("", "arousal");
    private static final javax.xml.namespace.QName DOMINANCE$8 = 
        new javax.xml.namespace.QName("", "dominance");
    
    
    /**
     * Gets the "moodword" attribute
     */
    public de.affect.xml.MoodWord.Enum getMoodword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODWORD$0);
            if (target == null)
            {
                return null;
            }
            return (de.affect.xml.MoodWord.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "moodword" attribute
     */
    public de.affect.xml.MoodWord xgetMoodword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.MoodWord target = null;
            target = (de.affect.xml.MoodWord)get_store().find_attribute_user(MOODWORD$0);
            return target;
        }
    }
    
    /**
     * Sets the "moodword" attribute
     */
    public void setMoodword(de.affect.xml.MoodWord.Enum moodword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODWORD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODWORD$0);
            }
            target.setEnumValue(moodword);
        }
    }
    
    /**
     * Sets (as xml) the "moodword" attribute
     */
    public void xsetMoodword(de.affect.xml.MoodWord moodword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.MoodWord target = null;
            target = (de.affect.xml.MoodWord)get_store().find_attribute_user(MOODWORD$0);
            if (target == null)
            {
                target = (de.affect.xml.MoodWord)get_store().add_attribute_user(MOODWORD$0);
            }
            target.set(moodword);
        }
    }
    
    /**
     * Gets the "intensity" attribute
     */
    public de.affect.xml.MoodType.Intensity.Enum getIntensity()
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
            return (de.affect.xml.MoodType.Intensity.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "intensity" attribute
     */
    public de.affect.xml.MoodType.Intensity xgetIntensity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.MoodType.Intensity target = null;
            target = (de.affect.xml.MoodType.Intensity)get_store().find_attribute_user(INTENSITY$2);
            return target;
        }
    }
    
    /**
     * Sets the "intensity" attribute
     */
    public void setIntensity(de.affect.xml.MoodType.Intensity.Enum intensity)
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
            target.setEnumValue(intensity);
        }
    }
    
    /**
     * Sets (as xml) the "intensity" attribute
     */
    public void xsetIntensity(de.affect.xml.MoodType.Intensity intensity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.affect.xml.MoodType.Intensity target = null;
            target = (de.affect.xml.MoodType.Intensity)get_store().find_attribute_user(INTENSITY$2);
            if (target == null)
            {
                target = (de.affect.xml.MoodType.Intensity)get_store().add_attribute_user(INTENSITY$2);
            }
            target.set(intensity);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLEASURE$4);
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
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$4);
            return target;
        }
    }
    
    /**
     * True if has "pleasure" attribute
     */
    public boolean isSetPleasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PLEASURE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLEASURE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLEASURE$4);
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
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(PLEASURE$4);
            if (target == null)
            {
                target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(PLEASURE$4);
            }
            target.set(pleasure);
        }
    }
    
    /**
     * Unsets the "pleasure" attribute
     */
    public void unsetPleasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PLEASURE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AROUSAL$6);
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
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$6);
            return target;
        }
    }
    
    /**
     * True if has "arousal" attribute
     */
    public boolean isSetArousal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AROUSAL$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AROUSAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AROUSAL$6);
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
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(AROUSAL$6);
            if (target == null)
            {
                target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(AROUSAL$6);
            }
            target.set(arousal);
        }
    }
    
    /**
     * Unsets the "arousal" attribute
     */
    public void unsetArousal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AROUSAL$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMINANCE$8);
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
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$8);
            return target;
        }
    }
    
    /**
     * True if has "dominance" attribute
     */
    public boolean isSetDominance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOMINANCE$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMINANCE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMINANCE$8);
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
            target = (de.affect.xml.SignedIntensity)get_store().find_attribute_user(DOMINANCE$8);
            if (target == null)
            {
                target = (de.affect.xml.SignedIntensity)get_store().add_attribute_user(DOMINANCE$8);
            }
            target.set(dominance);
        }
    }
    
    /**
     * Unsets the "dominance" attribute
     */
    public void unsetDominance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOMINANCE$8);
        }
    }
    /**
     * An XML intensity(@).
     *
     * This is an atomic type that is a restriction of de.affect.xml.MoodType$Intensity.
     */
    public static class IntensityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements de.affect.xml.MoodType.Intensity
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
