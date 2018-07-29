/**
 * CarrierCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class CarrierCodeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CarrierCodeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FDXC = "FDXC";
    public static final String _FDXE = "FDXE";
    public static final String _FDXG = "FDXG";
    public static final String _FXCC = "FXCC";
    public static final String _FXFR = "FXFR";
    public static final String _FXSP = "FXSP";
    public static final CarrierCodeType FDXC = new CarrierCodeType(_FDXC);
    public static final CarrierCodeType FDXE = new CarrierCodeType(_FDXE);
    public static final CarrierCodeType FDXG = new CarrierCodeType(_FDXG);
    public static final CarrierCodeType FXCC = new CarrierCodeType(_FXCC);
    public static final CarrierCodeType FXFR = new CarrierCodeType(_FXFR);
    public static final CarrierCodeType FXSP = new CarrierCodeType(_FXSP);
    public String getValue() { return _value_;}
    public static CarrierCodeType fromValue(String value)
          throws IllegalArgumentException {
        CarrierCodeType enumeration = (CarrierCodeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CarrierCodeType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(CarrierCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CarrierCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
