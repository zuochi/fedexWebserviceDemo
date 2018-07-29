/**
 * DeliveryOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class DeliveryOptionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeliveryOptionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _INDIRECT_SIGNATURE_RELEASE = "INDIRECT_SIGNATURE_RELEASE";
    public static final String _REDIRECT_TO_HOLD_AT_LOCATION = "REDIRECT_TO_HOLD_AT_LOCATION";
    public static final String _REROUTE = "REROUTE";
    public static final String _RESCHEDULE = "RESCHEDULE";
    public static final DeliveryOptionType INDIRECT_SIGNATURE_RELEASE = new DeliveryOptionType(_INDIRECT_SIGNATURE_RELEASE);
    public static final DeliveryOptionType REDIRECT_TO_HOLD_AT_LOCATION = new DeliveryOptionType(_REDIRECT_TO_HOLD_AT_LOCATION);
    public static final DeliveryOptionType REROUTE = new DeliveryOptionType(_REROUTE);
    public static final DeliveryOptionType RESCHEDULE = new DeliveryOptionType(_RESCHEDULE);
    public String getValue() { return _value_;}
    public static DeliveryOptionType fromValue(String value)
          throws IllegalArgumentException {
        DeliveryOptionType enumeration = (DeliveryOptionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DeliveryOptionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DeliveryOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "DeliveryOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
