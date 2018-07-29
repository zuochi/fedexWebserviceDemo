/**
 * TrackIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackIdentifierType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrackIdentifierType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BILL_OF_LADING = "BILL_OF_LADING";
    public static final String _COD_RETURN_TRACKING_NUMBER = "COD_RETURN_TRACKING_NUMBER";
    public static final String _CUSTOMER_AUTHORIZATION_NUMBER = "CUSTOMER_AUTHORIZATION_NUMBER";
    public static final String _CUSTOMER_REFERENCE = "CUSTOMER_REFERENCE";
    public static final String _DEPARTMENT = "DEPARTMENT";
    public static final String _DOCUMENT_AIRWAY_BILL = "DOCUMENT_AIRWAY_BILL";
    public static final String _FREE_FORM_REFERENCE = "FREE_FORM_REFERENCE";
    public static final String _GROUND_INTERNATIONAL = "GROUND_INTERNATIONAL";
    public static final String _GROUND_SHIPMENT_ID = "GROUND_SHIPMENT_ID";
    public static final String _GROUP_MPS = "GROUP_MPS";
    public static final String _INVOICE = "INVOICE";
    public static final String _JOB_GLOBAL_TRACKING_NUMBER = "JOB_GLOBAL_TRACKING_NUMBER";
    public static final String _ORDER_GLOBAL_TRACKING_NUMBER = "ORDER_GLOBAL_TRACKING_NUMBER";
    public static final String _ORDER_TO_PAY_NUMBER = "ORDER_TO_PAY_NUMBER";
    public static final String _OUTBOUND_LINK_TO_RETURN = "OUTBOUND_LINK_TO_RETURN";
    public static final String _PARTNER_CARRIER_NUMBER = "PARTNER_CARRIER_NUMBER";
    public static final String _PART_NUMBER = "PART_NUMBER";
    public static final String _PURCHASE_ORDER = "PURCHASE_ORDER";
    public static final String _REROUTE_TRACKING_NUMBER = "REROUTE_TRACKING_NUMBER";
    public static final String _RETURNED_TO_SHIPPER_TRACKING_NUMBER = "RETURNED_TO_SHIPPER_TRACKING_NUMBER";
    public static final String _RETURN_MATERIALS_AUTHORIZATION = "RETURN_MATERIALS_AUTHORIZATION";
    public static final String _SHIPPER_REFERENCE = "SHIPPER_REFERENCE";
    public static final String _STANDARD_MPS = "STANDARD_MPS";
    public static final String _TRACKING_NUMBER_OR_DOORTAG = "TRACKING_NUMBER_OR_DOORTAG";
    public static final String _TRANSPORTATION_CONTROL_NUMBER = "TRANSPORTATION_CONTROL_NUMBER";
    public static final TrackIdentifierType BILL_OF_LADING = new TrackIdentifierType(_BILL_OF_LADING);
    public static final TrackIdentifierType COD_RETURN_TRACKING_NUMBER = new TrackIdentifierType(_COD_RETURN_TRACKING_NUMBER);
    public static final TrackIdentifierType CUSTOMER_AUTHORIZATION_NUMBER = new TrackIdentifierType(_CUSTOMER_AUTHORIZATION_NUMBER);
    public static final TrackIdentifierType CUSTOMER_REFERENCE = new TrackIdentifierType(_CUSTOMER_REFERENCE);
    public static final TrackIdentifierType DEPARTMENT = new TrackIdentifierType(_DEPARTMENT);
    public static final TrackIdentifierType DOCUMENT_AIRWAY_BILL = new TrackIdentifierType(_DOCUMENT_AIRWAY_BILL);
    public static final TrackIdentifierType FREE_FORM_REFERENCE = new TrackIdentifierType(_FREE_FORM_REFERENCE);
    public static final TrackIdentifierType GROUND_INTERNATIONAL = new TrackIdentifierType(_GROUND_INTERNATIONAL);
    public static final TrackIdentifierType GROUND_SHIPMENT_ID = new TrackIdentifierType(_GROUND_SHIPMENT_ID);
    public static final TrackIdentifierType GROUP_MPS = new TrackIdentifierType(_GROUP_MPS);
    public static final TrackIdentifierType INVOICE = new TrackIdentifierType(_INVOICE);
    public static final TrackIdentifierType JOB_GLOBAL_TRACKING_NUMBER = new TrackIdentifierType(_JOB_GLOBAL_TRACKING_NUMBER);
    public static final TrackIdentifierType ORDER_GLOBAL_TRACKING_NUMBER = new TrackIdentifierType(_ORDER_GLOBAL_TRACKING_NUMBER);
    public static final TrackIdentifierType ORDER_TO_PAY_NUMBER = new TrackIdentifierType(_ORDER_TO_PAY_NUMBER);
    public static final TrackIdentifierType OUTBOUND_LINK_TO_RETURN = new TrackIdentifierType(_OUTBOUND_LINK_TO_RETURN);
    public static final TrackIdentifierType PARTNER_CARRIER_NUMBER = new TrackIdentifierType(_PARTNER_CARRIER_NUMBER);
    public static final TrackIdentifierType PART_NUMBER = new TrackIdentifierType(_PART_NUMBER);
    public static final TrackIdentifierType PURCHASE_ORDER = new TrackIdentifierType(_PURCHASE_ORDER);
    public static final TrackIdentifierType REROUTE_TRACKING_NUMBER = new TrackIdentifierType(_REROUTE_TRACKING_NUMBER);
    public static final TrackIdentifierType RETURNED_TO_SHIPPER_TRACKING_NUMBER = new TrackIdentifierType(_RETURNED_TO_SHIPPER_TRACKING_NUMBER);
    public static final TrackIdentifierType RETURN_MATERIALS_AUTHORIZATION = new TrackIdentifierType(_RETURN_MATERIALS_AUTHORIZATION);
    public static final TrackIdentifierType SHIPPER_REFERENCE = new TrackIdentifierType(_SHIPPER_REFERENCE);
    public static final TrackIdentifierType STANDARD_MPS = new TrackIdentifierType(_STANDARD_MPS);
    public static final TrackIdentifierType TRACKING_NUMBER_OR_DOORTAG = new TrackIdentifierType(_TRACKING_NUMBER_OR_DOORTAG);
    public static final TrackIdentifierType TRANSPORTATION_CONTROL_NUMBER = new TrackIdentifierType(_TRANSPORTATION_CONTROL_NUMBER);
    public String getValue() { return _value_;}
    public static TrackIdentifierType fromValue(String value)
          throws IllegalArgumentException {
        TrackIdentifierType enumeration = (TrackIdentifierType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TrackIdentifierType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TrackIdentifierType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackIdentifierType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
