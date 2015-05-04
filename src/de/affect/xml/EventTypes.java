/*
 * XML Type:  EventTypes
 * Namespace: xml.affect.de
 * Java type: de.affect.xml.EventTypes
 *
 * Automatically generated - do not modify.
 */
package de.affect.xml;


/**
 * An XML EventTypes(@xml.affect.de).
 *
 * This is an atomic type that is a restriction of de.affect.xml.EventTypes.
 */
public interface EventTypes extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD0073D900832184E9BED1EA3B81E0474").resolveHandle("eventtypes87ebtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum GOOD_EVENT = Enum.forString("GoodEvent");
    static final Enum GOOD_EVENT_FOR_GOOD_OTHER = Enum.forString("GoodEventForGoodOther");
    static final Enum GOOD_EVENT_FOR_BAD_OTHER = Enum.forString("GoodEventForBadOther");
    static final Enum BAD_EVENT = Enum.forString("BadEvent");
    static final Enum BAD_EVENT_FOR_GOOD_OTHER = Enum.forString("BadEventForGoodOther");
    static final Enum BAD_EVENT_FOR_BAD_OTHER = Enum.forString("BadEventForBadOther");
    static final Enum GOOD_LIKELY_FUTURE_EVENT = Enum.forString("GoodLikelyFutureEvent");
    static final Enum GOOD_UNLIKELY_FUTURE_EVENT = Enum.forString("GoodUnlikelyFutureEvent");
    static final Enum BAD_LIKELY_FUTURE_EVENT = Enum.forString("BadLikelyFutureEvent");
    static final Enum BAD_UNLIKELY_FUTURE_EVENT = Enum.forString("BadUnlikelyFutureEvent");
    static final Enum EVENT_CONFIRMED = Enum.forString("EventConfirmed");
    static final Enum EVENT_DISCONFIRMED = Enum.forString("EventDisconfirmed");
    
    static final int INT_GOOD_EVENT = Enum.INT_GOOD_EVENT;
    static final int INT_GOOD_EVENT_FOR_GOOD_OTHER = Enum.INT_GOOD_EVENT_FOR_GOOD_OTHER;
    static final int INT_GOOD_EVENT_FOR_BAD_OTHER = Enum.INT_GOOD_EVENT_FOR_BAD_OTHER;
    static final int INT_BAD_EVENT = Enum.INT_BAD_EVENT;
    static final int INT_BAD_EVENT_FOR_GOOD_OTHER = Enum.INT_BAD_EVENT_FOR_GOOD_OTHER;
    static final int INT_BAD_EVENT_FOR_BAD_OTHER = Enum.INT_BAD_EVENT_FOR_BAD_OTHER;
    static final int INT_GOOD_LIKELY_FUTURE_EVENT = Enum.INT_GOOD_LIKELY_FUTURE_EVENT;
    static final int INT_GOOD_UNLIKELY_FUTURE_EVENT = Enum.INT_GOOD_UNLIKELY_FUTURE_EVENT;
    static final int INT_BAD_LIKELY_FUTURE_EVENT = Enum.INT_BAD_LIKELY_FUTURE_EVENT;
    static final int INT_BAD_UNLIKELY_FUTURE_EVENT = Enum.INT_BAD_UNLIKELY_FUTURE_EVENT;
    static final int INT_EVENT_CONFIRMED = Enum.INT_EVENT_CONFIRMED;
    static final int INT_EVENT_DISCONFIRMED = Enum.INT_EVENT_DISCONFIRMED;
    
    /**
     * Enumeration value class for de.affect.xml.EventTypes.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_GOOD_EVENT
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
        
        static final int INT_GOOD_EVENT = 1;
        static final int INT_GOOD_EVENT_FOR_GOOD_OTHER = 2;
        static final int INT_GOOD_EVENT_FOR_BAD_OTHER = 3;
        static final int INT_BAD_EVENT = 4;
        static final int INT_BAD_EVENT_FOR_GOOD_OTHER = 5;
        static final int INT_BAD_EVENT_FOR_BAD_OTHER = 6;
        static final int INT_GOOD_LIKELY_FUTURE_EVENT = 7;
        static final int INT_GOOD_UNLIKELY_FUTURE_EVENT = 8;
        static final int INT_BAD_LIKELY_FUTURE_EVENT = 9;
        static final int INT_BAD_UNLIKELY_FUTURE_EVENT = 10;
        static final int INT_EVENT_CONFIRMED = 11;
        static final int INT_EVENT_DISCONFIRMED = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("GoodEvent", INT_GOOD_EVENT),
                new Enum("GoodEventForGoodOther", INT_GOOD_EVENT_FOR_GOOD_OTHER),
                new Enum("GoodEventForBadOther", INT_GOOD_EVENT_FOR_BAD_OTHER),
                new Enum("BadEvent", INT_BAD_EVENT),
                new Enum("BadEventForGoodOther", INT_BAD_EVENT_FOR_GOOD_OTHER),
                new Enum("BadEventForBadOther", INT_BAD_EVENT_FOR_BAD_OTHER),
                new Enum("GoodLikelyFutureEvent", INT_GOOD_LIKELY_FUTURE_EVENT),
                new Enum("GoodUnlikelyFutureEvent", INT_GOOD_UNLIKELY_FUTURE_EVENT),
                new Enum("BadLikelyFutureEvent", INT_BAD_LIKELY_FUTURE_EVENT),
                new Enum("BadUnlikelyFutureEvent", INT_BAD_UNLIKELY_FUTURE_EVENT),
                new Enum("EventConfirmed", INT_EVENT_CONFIRMED),
                new Enum("EventDisconfirmed", INT_EVENT_DISCONFIRMED),
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
        public static de.affect.xml.EventTypes newValue(java.lang.Object obj) {
          return (de.affect.xml.EventTypes) type.newValue( obj ); }
        
        public static de.affect.xml.EventTypes newInstance() {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.affect.xml.EventTypes newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.affect.xml.EventTypes parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.affect.xml.EventTypes parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.affect.xml.EventTypes parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.affect.xml.EventTypes parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.affect.xml.EventTypes parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.affect.xml.EventTypes parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.affect.xml.EventTypes parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.affect.xml.EventTypes parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.affect.xml.EventTypes parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.affect.xml.EventTypes parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.affect.xml.EventTypes parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.affect.xml.EventTypes parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.affect.xml.EventTypes parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.affect.xml.EventTypes parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.EventTypes parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.affect.xml.EventTypes parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.affect.xml.EventTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
