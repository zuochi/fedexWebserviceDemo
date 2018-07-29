/**
 * NaftaPreferenceCriterionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class NaftaPreferenceCriterionCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NaftaPreferenceCriterionCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _A = "A";
    public static final String _B = "B";
    public static final String _C = "C";
    public static final String _D = "D";
    public static final String _E = "E";
    public static final String _F = "F";
    public static final NaftaPreferenceCriterionCode A = new NaftaPreferenceCriterionCode(_A);
    public static final NaftaPreferenceCriterionCode B = new NaftaPreferenceCriterionCode(_B);
    public static final NaftaPreferenceCriterionCode C = new NaftaPreferenceCriterionCode(_C);
    public static final NaftaPreferenceCriterionCode D = new NaftaPreferenceCriterionCode(_D);
    public static final NaftaPreferenceCriterionCode E = new NaftaPreferenceCriterionCode(_E);
    public static final NaftaPreferenceCriterionCode F = new NaftaPreferenceCriterionCode(_F);
    public String getValue() { return _value_;}
    public static NaftaPreferenceCriterionCode fromValue(String value)
          throws IllegalArgumentException {
        NaftaPreferenceCriterionCode enumeration = (NaftaPreferenceCriterionCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static NaftaPreferenceCriterionCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(NaftaPreferenceCriterionCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NaftaPreferenceCriterionCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
