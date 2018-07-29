/**
 * EMailNotificationEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class EMailNotificationEventType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EMailNotificationEventType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ON_DELIVERY = "ON_DELIVERY";
    public static final String _ON_EXCEPTION = "ON_EXCEPTION";
    public static final String _ON_SHIPMENT = "ON_SHIPMENT";
    public static final String _ON_TENDER = "ON_TENDER";
    public static final EMailNotificationEventType ON_DELIVERY = new EMailNotificationEventType(_ON_DELIVERY);
    public static final EMailNotificationEventType ON_EXCEPTION = new EMailNotificationEventType(_ON_EXCEPTION);
    public static final EMailNotificationEventType ON_SHIPMENT = new EMailNotificationEventType(_ON_SHIPMENT);
    public static final EMailNotificationEventType ON_TENDER = new EMailNotificationEventType(_ON_TENDER);
    public String getValue() { return _value_;}
    public static EMailNotificationEventType fromValue(String value)
          throws IllegalArgumentException {
        EMailNotificationEventType enumeration = (EMailNotificationEventType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static EMailNotificationEventType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMailNotificationEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailNotificationEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
