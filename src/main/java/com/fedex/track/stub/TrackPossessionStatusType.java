/**
 * TrackPossessionStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackPossessionStatusType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrackPossessionStatusType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BROKER = "BROKER";
    public static final String _CARRIER = "CARRIER";
    public static final String _CUSTOMS = "CUSTOMS";
    public static final String _RECIPIENT = "RECIPIENT";
    public static final String _SHIPPER = "SHIPPER";
    public static final String _SPLIT_STATUS = "SPLIT_STATUS";
    public static final String _TRANSFER_PARTNER = "TRANSFER_PARTNER";
    public static final TrackPossessionStatusType BROKER = new TrackPossessionStatusType(_BROKER);
    public static final TrackPossessionStatusType CARRIER = new TrackPossessionStatusType(_CARRIER);
    public static final TrackPossessionStatusType CUSTOMS = new TrackPossessionStatusType(_CUSTOMS);
    public static final TrackPossessionStatusType RECIPIENT = new TrackPossessionStatusType(_RECIPIENT);
    public static final TrackPossessionStatusType SHIPPER = new TrackPossessionStatusType(_SHIPPER);
    public static final TrackPossessionStatusType SPLIT_STATUS = new TrackPossessionStatusType(_SPLIT_STATUS);
    public static final TrackPossessionStatusType TRANSFER_PARTNER = new TrackPossessionStatusType(_TRANSFER_PARTNER);
    public String getValue() { return _value_;}
    public static TrackPossessionStatusType fromValue(String value)
          throws IllegalArgumentException {
        TrackPossessionStatusType enumeration = (TrackPossessionStatusType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TrackPossessionStatusType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TrackPossessionStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackPossessionStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
