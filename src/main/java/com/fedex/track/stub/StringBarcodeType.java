/**
 * StringBarcodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class StringBarcodeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StringBarcodeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ADDRESS = "ADDRESS";
    public static final String _ASTRA = "ASTRA";
    public static final String _FEDEX_1D = "FEDEX_1D";
    public static final String _GROUND = "GROUND";
    public static final String _POSTAL = "POSTAL";
    public static final String _USPS = "USPS";
    public static final StringBarcodeType ADDRESS = new StringBarcodeType(_ADDRESS);
    public static final StringBarcodeType ASTRA = new StringBarcodeType(_ASTRA);
    public static final StringBarcodeType FEDEX_1D = new StringBarcodeType(_FEDEX_1D);
    public static final StringBarcodeType GROUND = new StringBarcodeType(_GROUND);
    public static final StringBarcodeType POSTAL = new StringBarcodeType(_POSTAL);
    public static final StringBarcodeType USPS = new StringBarcodeType(_USPS);
    public String getValue() { return _value_;}
    public static StringBarcodeType fromValue(String value)
          throws IllegalArgumentException {
        StringBarcodeType enumeration = (StringBarcodeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static StringBarcodeType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(StringBarcodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StringBarcodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
