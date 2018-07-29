/**
 * FedExLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class FedExLocationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FedExLocationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FEDEX_AUTHORIZED_SHIP_CENTER = "FEDEX_AUTHORIZED_SHIP_CENTER";
    public static final String _FEDEX_EXPRESS_STATION = "FEDEX_EXPRESS_STATION";
    public static final String _FEDEX_FACILITY = "FEDEX_FACILITY";
    public static final String _FEDEX_FREIGHT_SERVICE_CENTER = "FEDEX_FREIGHT_SERVICE_CENTER";
    public static final String _FEDEX_GROUND_TERMINAL = "FEDEX_GROUND_TERMINAL";
    public static final String _FEDEX_HOME_DELIVERY_STATION = "FEDEX_HOME_DELIVERY_STATION";
    public static final String _FEDEX_OFFICE = "FEDEX_OFFICE";
    public static final String _FEDEX_SELF_SERVICE_LOCATION = "FEDEX_SELF_SERVICE_LOCATION";
    public static final String _FEDEX_SHIPSITE = "FEDEX_SHIPSITE";
    public static final String _FEDEX_SMART_POST_HUB = "FEDEX_SMART_POST_HUB";
    public static final FedExLocationType FEDEX_AUTHORIZED_SHIP_CENTER = new FedExLocationType(_FEDEX_AUTHORIZED_SHIP_CENTER);
    public static final FedExLocationType FEDEX_EXPRESS_STATION = new FedExLocationType(_FEDEX_EXPRESS_STATION);
    public static final FedExLocationType FEDEX_FACILITY = new FedExLocationType(_FEDEX_FACILITY);
    public static final FedExLocationType FEDEX_FREIGHT_SERVICE_CENTER = new FedExLocationType(_FEDEX_FREIGHT_SERVICE_CENTER);
    public static final FedExLocationType FEDEX_GROUND_TERMINAL = new FedExLocationType(_FEDEX_GROUND_TERMINAL);
    public static final FedExLocationType FEDEX_HOME_DELIVERY_STATION = new FedExLocationType(_FEDEX_HOME_DELIVERY_STATION);
    public static final FedExLocationType FEDEX_OFFICE = new FedExLocationType(_FEDEX_OFFICE);
    public static final FedExLocationType FEDEX_SELF_SERVICE_LOCATION = new FedExLocationType(_FEDEX_SELF_SERVICE_LOCATION);
    public static final FedExLocationType FEDEX_SHIPSITE = new FedExLocationType(_FEDEX_SHIPSITE);
    public static final FedExLocationType FEDEX_SMART_POST_HUB = new FedExLocationType(_FEDEX_SMART_POST_HUB);
    public String getValue() { return _value_;}
    public static FedExLocationType fromValue(String value)
          throws IllegalArgumentException {
        FedExLocationType enumeration = (FedExLocationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static FedExLocationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(FedExLocationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "FedExLocationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
