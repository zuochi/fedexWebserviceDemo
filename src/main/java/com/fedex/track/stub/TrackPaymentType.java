/**
 * TrackPaymentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackPaymentType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrackPaymentType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CASH_OR_CHECK_AT_DESTINATION = "CASH_OR_CHECK_AT_DESTINATION";
    public static final String _CASH_OR_CHECK_AT_ORIGIN = "CASH_OR_CHECK_AT_ORIGIN";
    public static final String _CREDIT_CARD_AT_DESTINATION = "CREDIT_CARD_AT_DESTINATION";
    public static final String _CREDIT_CARD_AT_ORIGIN = "CREDIT_CARD_AT_ORIGIN";
    public static final String _OTHER = "OTHER";
    public static final String _RECIPIENT_ACCOUNT = "RECIPIENT_ACCOUNT";
    public static final String _SHIPPER_ACCOUNT = "SHIPPER_ACCOUNT";
    public static final String _THIRD_PARTY_ACCOUNT = "THIRD_PARTY_ACCOUNT";
    public static final TrackPaymentType CASH_OR_CHECK_AT_DESTINATION = new TrackPaymentType(_CASH_OR_CHECK_AT_DESTINATION);
    public static final TrackPaymentType CASH_OR_CHECK_AT_ORIGIN = new TrackPaymentType(_CASH_OR_CHECK_AT_ORIGIN);
    public static final TrackPaymentType CREDIT_CARD_AT_DESTINATION = new TrackPaymentType(_CREDIT_CARD_AT_DESTINATION);
    public static final TrackPaymentType CREDIT_CARD_AT_ORIGIN = new TrackPaymentType(_CREDIT_CARD_AT_ORIGIN);
    public static final TrackPaymentType OTHER = new TrackPaymentType(_OTHER);
    public static final TrackPaymentType RECIPIENT_ACCOUNT = new TrackPaymentType(_RECIPIENT_ACCOUNT);
    public static final TrackPaymentType SHIPPER_ACCOUNT = new TrackPaymentType(_SHIPPER_ACCOUNT);
    public static final TrackPaymentType THIRD_PARTY_ACCOUNT = new TrackPaymentType(_THIRD_PARTY_ACCOUNT);
    public String getValue() { return _value_;}
    public static TrackPaymentType fromValue(String value)
          throws IllegalArgumentException {
        TrackPaymentType enumeration = (TrackPaymentType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TrackPaymentType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TrackPaymentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackPaymentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
