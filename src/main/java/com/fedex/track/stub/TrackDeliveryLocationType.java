/**
 * TrackDeliveryLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackDeliveryLocationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrackDeliveryLocationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _APARTMENT_OFFICE = "APARTMENT_OFFICE";
    public static final String _FEDEX_LOCATION = "FEDEX_LOCATION";
    public static final String _GATE_HOUSE = "GATE_HOUSE";
    public static final String _GUARD_OR_SECURITY_STATION = "GUARD_OR_SECURITY_STATION";
    public static final String _IN_BOND_OR_CAGE = "IN_BOND_OR_CAGE";
    public static final String _LEASING_OFFICE = "LEASING_OFFICE";
    public static final String _MAILROOM = "MAILROOM";
    public static final String _MAIN_OFFICE = "MAIN_OFFICE";
    public static final String _MANAGER_OFFICE = "MANAGER_OFFICE";
    public static final String _OTHER = "OTHER";
    public static final String _PHARMACY = "PHARMACY";
    public static final String _RECEPTIONIST_OR_FRONT_DESK = "RECEPTIONIST_OR_FRONT_DESK";
    public static final String _RENTAL_OFFICE = "RENTAL_OFFICE";
    public static final String _RESIDENCE = "RESIDENCE";
    public static final String _SHIPPING_RECEIVING = "SHIPPING_RECEIVING";
    public static final TrackDeliveryLocationType APARTMENT_OFFICE = new TrackDeliveryLocationType(_APARTMENT_OFFICE);
    public static final TrackDeliveryLocationType FEDEX_LOCATION = new TrackDeliveryLocationType(_FEDEX_LOCATION);
    public static final TrackDeliveryLocationType GATE_HOUSE = new TrackDeliveryLocationType(_GATE_HOUSE);
    public static final TrackDeliveryLocationType GUARD_OR_SECURITY_STATION = new TrackDeliveryLocationType(_GUARD_OR_SECURITY_STATION);
    public static final TrackDeliveryLocationType IN_BOND_OR_CAGE = new TrackDeliveryLocationType(_IN_BOND_OR_CAGE);
    public static final TrackDeliveryLocationType LEASING_OFFICE = new TrackDeliveryLocationType(_LEASING_OFFICE);
    public static final TrackDeliveryLocationType MAILROOM = new TrackDeliveryLocationType(_MAILROOM);
    public static final TrackDeliveryLocationType MAIN_OFFICE = new TrackDeliveryLocationType(_MAIN_OFFICE);
    public static final TrackDeliveryLocationType MANAGER_OFFICE = new TrackDeliveryLocationType(_MANAGER_OFFICE);
    public static final TrackDeliveryLocationType OTHER = new TrackDeliveryLocationType(_OTHER);
    public static final TrackDeliveryLocationType PHARMACY = new TrackDeliveryLocationType(_PHARMACY);
    public static final TrackDeliveryLocationType RECEPTIONIST_OR_FRONT_DESK = new TrackDeliveryLocationType(_RECEPTIONIST_OR_FRONT_DESK);
    public static final TrackDeliveryLocationType RENTAL_OFFICE = new TrackDeliveryLocationType(_RENTAL_OFFICE);
    public static final TrackDeliveryLocationType RESIDENCE = new TrackDeliveryLocationType(_RESIDENCE);
    public static final TrackDeliveryLocationType SHIPPING_RECEIVING = new TrackDeliveryLocationType(_SHIPPING_RECEIVING);
    public String getValue() { return _value_;}
    public static TrackDeliveryLocationType fromValue(String value)
          throws IllegalArgumentException {
        TrackDeliveryLocationType enumeration = (TrackDeliveryLocationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TrackDeliveryLocationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TrackDeliveryLocationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDeliveryLocationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
