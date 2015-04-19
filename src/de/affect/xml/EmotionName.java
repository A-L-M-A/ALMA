/*
 * XML Type:  EmotionName
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.EmotionName
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml;


/**
 * An XML EmotionName(@xml.affect.de).
 *
 * This is an atomic type that is a restriction of de.affect.xml.EmotionName.
 */
public interface EmotionName extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmotionName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25552836AC541098714E7C2C64F0C27E").resolveHandle("emotionname1d40type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum DISTRESS = Enum.forString("Distress");
    static final Enum JOY = Enum.forString("Joy");
    static final Enum HAPPY_FOR = Enum.forString("HappyFor");
    static final Enum GLOATING = Enum.forString("Gloating");
    static final Enum RESENTMENT = Enum.forString("Resentment");
    static final Enum PITY = Enum.forString("Pity");
    static final Enum HOPE = Enum.forString("Hope");
    static final Enum FEAR = Enum.forString("Fear");
    static final Enum SATISFACTION = Enum.forString("Satisfaction");
    static final Enum RELIEF = Enum.forString("Relief");
    static final Enum FEARS_CONFIRMED = Enum.forString("FearsConfirmed");
    static final Enum DISAPPOINTMENT = Enum.forString("Disappointment");
    static final Enum PRIDE = Enum.forString("Pride");
    static final Enum ADMIRATION = Enum.forString("Admiration");
    static final Enum SHAME = Enum.forString("Shame");
    static final Enum REPROACH = Enum.forString("Reproach");
    static final Enum LIKING = Enum.forString("Liking");
    static final Enum DISLIKING = Enum.forString("Disliking");
    static final Enum GRATITUDE = Enum.forString("Gratitude");
    static final Enum ANGER = Enum.forString("Anger");
    static final Enum GRATIFICATION = Enum.forString("Gratification");
    static final Enum REMORSE = Enum.forString("Remorse");
    static final Enum LOVE = Enum.forString("Love");
    static final Enum HATE = Enum.forString("Hate");
    static final Enum UNDEFINED = Enum.forString("Undefined");
    static final Enum PHYSICAL = Enum.forString("Physical");
    
    static final int INT_DISTRESS = Enum.INT_DISTRESS;
    static final int INT_JOY = Enum.INT_JOY;
    static final int INT_HAPPY_FOR = Enum.INT_HAPPY_FOR;
    static final int INT_GLOATING = Enum.INT_GLOATING;
    static final int INT_RESENTMENT = Enum.INT_RESENTMENT;
    static final int INT_PITY = Enum.INT_PITY;
    static final int INT_HOPE = Enum.INT_HOPE;
    static final int INT_FEAR = Enum.INT_FEAR;
    static final int INT_SATISFACTION = Enum.INT_SATISFACTION;
    static final int INT_RELIEF = Enum.INT_RELIEF;
    static final int INT_FEARS_CONFIRMED = Enum.INT_FEARS_CONFIRMED;
    static final int INT_DISAPPOINTMENT = Enum.INT_DISAPPOINTMENT;
    static final int INT_PRIDE = Enum.INT_PRIDE;
    static final int INT_ADMIRATION = Enum.INT_ADMIRATION;
    static final int INT_SHAME = Enum.INT_SHAME;
    static final int INT_REPROACH = Enum.INT_REPROACH;
    static final int INT_LIKING = Enum.INT_LIKING;
    static final int INT_DISLIKING = Enum.INT_DISLIKING;
    static final int INT_GRATITUDE = Enum.INT_GRATITUDE;
    static final int INT_ANGER = Enum.INT_ANGER;
    static final int INT_GRATIFICATION = Enum.INT_GRATIFICATION;
    static final int INT_REMORSE = Enum.INT_REMORSE;
    static final int INT_LOVE = Enum.INT_LOVE;
    static final int INT_HATE = Enum.INT_HATE;
    static final int INT_UNDEFINED = Enum.INT_UNDEFINED;
    static final int INT_PHYSICAL = Enum.INT_PHYSICAL;
    
    /**
     * Enumeration value class for de.affect.xml.EmotionName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DISTRESS
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_DISTRESS = 1;
        static final int INT_JOY = 2;
        static final int INT_HAPPY_FOR = 3;
        static final int INT_GLOATING = 4;
        static final int INT_RESENTMENT = 5;
        static final int INT_PITY = 6;
        static final int INT_HOPE = 7;
        static final int INT_FEAR = 8;
        static final int INT_SATISFACTION = 9;
        static final int INT_RELIEF = 10;
        static final int INT_FEARS_CONFIRMED = 11;
        static final int INT_DISAPPOINTMENT = 12;
        static final int INT_PRIDE = 13;
        static final int INT_ADMIRATION = 14;
        static final int INT_SHAME = 15;
        static final int INT_REPROACH = 16;
        static final int INT_LIKING = 17;
        static final int INT_DISLIKING = 18;
        static final int INT_GRATITUDE = 19;
        static final int INT_ANGER = 20;
        static final int INT_GRATIFICATION = 21;
        static final int INT_REMORSE = 22;
        static final int INT_LOVE = 23;
        static final int INT_HATE = 24;
        static final int INT_UNDEFINED = 25;
        static final int INT_PHYSICAL = 26;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Distress", INT_DISTRESS),
                new Enum("Joy", INT_JOY),
                new Enum("HappyFor", INT_HAPPY_FOR),
                new Enum("Gloating", INT_GLOATING),
                new Enum("Resentment", INT_RESENTMENT),
                new Enum("Pity", INT_PITY),
                new Enum("Hope", INT_HOPE),
                new Enum("Fear", INT_FEAR),
                new Enum("Satisfaction", INT_SATISFACTION),
                new Enum("Relief", INT_RELIEF),
                new Enum("FearsConfirmed", INT_FEARS_CONFIRMED),
                new Enum("Disappointment", INT_DISAPPOINTMENT),
                new Enum("Pride", INT_PRIDE),
                new Enum("Admiration", INT_ADMIRATION),
                new Enum("Shame", INT_SHAME),
                new Enum("Reproach", INT_REPROACH),
                new Enum("Liking", INT_LIKING),
                new Enum("Disliking", INT_DISLIKING),
                new Enum("Gratitude", INT_GRATITUDE),
                new Enum("Anger", INT_ANGER),
                new Enum("Gratification", INT_GRATIFICATION),
                new Enum("Remorse", INT_REMORSE),
                new Enum("Love", INT_LOVE),
                new Enum("Hate", INT_HATE),
                new Enum("Undefined", INT_UNDEFINED),
                new Enum("Physical", INT_PHYSICAL),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.affect.xml.EmotionName newValue(java.lang.Object obj) {
          return (de.affect.xml.EmotionName) type.newValue( obj ); }
        
        public static de.affect.xml.EmotionName newInstance() {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.affect.xml.EmotionName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.affect.xml.EmotionName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.affect.xml.EmotionName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.affect.xml.EmotionName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.affect.xml.EmotionName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.affect.xml.EmotionName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.affect.xml.EmotionName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.affect.xml.EmotionName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.affect.xml.EmotionName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.affect.xml.EmotionName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.affect.xml.EmotionName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.affect.xml.EmotionName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.affect.xml.EmotionName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.affect.xml.EmotionName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.affect.xml.EmotionName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.EmotionName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.EmotionName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.EmotionName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
