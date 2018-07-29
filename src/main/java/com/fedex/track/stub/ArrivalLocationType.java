/**
 * ArrivalLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class ArrivalLocationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ArrivalLocationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _AIRPORT = "AIRPORT";
    public static final String _CUSTOMER = "CUSTOMER";
    public static final String _CUSTOMS_BROKER = "CUSTOMS_BROKER";
    public static final String _DELIVERY_LOCATION = "DELIVERY_LOCATION";
    public static final String _DESTINATION_AIRPORT = "DESTINATION_AIRPORT";
    public static final String _DESTINATION_FEDEX_FACILITY = "DESTINATION_FEDEX_FACILITY";
    public static final String _DROP_BOX = "DROP_BOX";
    public static final String _ENROUTE = "ENROUTE";
    public static final String _FEDEX_FACILITY = "FEDEX_FACILITY";
    public static final String _FEDEX_OFFICE_LOCATION = "FEDEX_OFFICE_LOCATION";
    public static final String _INTERLINE_CARRIER = "INTERLINE_CARRIER";
    public static final String _NON_FEDEX_FACILITY = "NON_FEDEX_FACILITY";
    public static final String _ORIGIN_AIRPORT = "ORIGIN_AIRPORT";
    public static final String _ORIGIN_FEDEX_FACILITY = "ORIGIN_FEDEX_FACILITY";
    public static final String _PICKUP_LOCATION = "PICKUP_LOCATION";
    public static final String _PLANE = "PLANE";
    public static final String _PORT_OF_ENTRY = "PORT_OF_ENTRY";
    public static final String _SHIP_AND_GET_LOCATION = "SHIP_AND_GET_LOCATION";
    public static final String _SORT_FACILITY = "SORT_FACILITY";
    public static final String _TURNPOINT = "TURNPOINT";
    public static final String _VEHICLE = "VEHICLE";
    public static final ArrivalLocationType AIRPORT = new ArrivalLocationType(_AIRPORT);
    public static final ArrivalLocationType CUSTOMER = new ArrivalLocationType(_CUSTOMER);
    public static final ArrivalLocationType CUSTOMS_BROKER = new ArrivalLocationType(_CUSTOMS_BROKER);
    public static final ArrivalLocationType DELIVERY_LOCATION = new ArrivalLocationType(_DELIVERY_LOCATION);
    public static final ArrivalLocationType DESTINATION_AIRPORT = new ArrivalLocationType(_DESTINATION_AIRPORT);
    public static final ArrivalLocationType DESTINATION_FEDEX_FACILITY = new ArrivalLocationType(_DESTINATION_FEDEX_FACILITY);
    public static final ArrivalLocationType DROP_BOX = new ArrivalLocationType(_DROP_BOX);
    public static final ArrivalLocationType ENROUTE = new ArrivalLocationType(_ENROUTE);
    public static final ArrivalLocationType FEDEX_FACILITY = new ArrivalLocationType(_FEDEX_FACILITY);
    public static final ArrivalLocationType FEDEX_OFFICE_LOCATION = new ArrivalLocationType(_FEDEX_OFFICE_LOCATION);
    public static final ArrivalLocationType INTERLINE_CARRIER = new ArrivalLocationType(_INTERLINE_CARRIER);
    public static final ArrivalLocationType NON_FEDEX_FACILITY = new ArrivalLocationType(_NON_FEDEX_FACILITY);
    public static final ArrivalLocationType ORIGIN_AIRPORT = new ArrivalLocationType(_ORIGIN_AIRPORT);
    public static final ArrivalLocationType ORIGIN_FEDEX_FACILITY = new ArrivalLocationType(_ORIGIN_FEDEX_FACILITY);
    public static final ArrivalLocationType PICKUP_LOCATION = new ArrivalLocationType(_PICKUP_LOCATION);
    public static final ArrivalLocationType PLANE = new ArrivalLocationType(_PLANE);
    public static final ArrivalLocationType PORT_OF_ENTRY = new ArrivalLocationType(_PORT_OF_ENTRY);
    public static final ArrivalLocationType SHIP_AND_GET_LOCATION = new ArrivalLocationType(_SHIP_AND_GET_LOCATION);
    public static final ArrivalLocationType SORT_FACILITY = new ArrivalLocationType(_SORT_FACILITY);
    public static final ArrivalLocationType TURNPOINT = new ArrivalLocationType(_TURNPOINT);
    public static final ArrivalLocationType VEHICLE = new ArrivalLocationType(_VEHICLE);
    public String getValue() { return _value_;}
    public static ArrivalLocationType fromValue(String value)
          throws IllegalArgumentException {
        ArrivalLocationType enumeration = (ArrivalLocationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ArrivalLocationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ArrivalLocationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ArrivalLocationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
