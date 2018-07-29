/**
 * CustomsOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class CustomsOptionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomsOptionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _COURTESY_RETURN_LABEL = "COURTESY_RETURN_LABEL";
    public static final String _EXHIBITION_TRADE_SHOW = "EXHIBITION_TRADE_SHOW";
    public static final String _FAULTY_ITEM = "FAULTY_ITEM";
    public static final String _FOLLOWING_REPAIR = "FOLLOWING_REPAIR";
    public static final String _FOR_REPAIR = "FOR_REPAIR";
    public static final String _ITEM_FOR_LOAN = "ITEM_FOR_LOAN";
    public static final String _OTHER = "OTHER";
    public static final String _REJECTED = "REJECTED";
    public static final String _REPLACEMENT = "REPLACEMENT";
    public static final String _TRIAL = "TRIAL";
    public static final CustomsOptionType COURTESY_RETURN_LABEL = new CustomsOptionType(_COURTESY_RETURN_LABEL);
    public static final CustomsOptionType EXHIBITION_TRADE_SHOW = new CustomsOptionType(_EXHIBITION_TRADE_SHOW);
    public static final CustomsOptionType FAULTY_ITEM = new CustomsOptionType(_FAULTY_ITEM);
    public static final CustomsOptionType FOLLOWING_REPAIR = new CustomsOptionType(_FOLLOWING_REPAIR);
    public static final CustomsOptionType FOR_REPAIR = new CustomsOptionType(_FOR_REPAIR);
    public static final CustomsOptionType ITEM_FOR_LOAN = new CustomsOptionType(_ITEM_FOR_LOAN);
    public static final CustomsOptionType OTHER = new CustomsOptionType(_OTHER);
    public static final CustomsOptionType REJECTED = new CustomsOptionType(_REJECTED);
    public static final CustomsOptionType REPLACEMENT = new CustomsOptionType(_REPLACEMENT);
    public static final CustomsOptionType TRIAL = new CustomsOptionType(_TRIAL);
    public String getValue() { return _value_;}
    public static CustomsOptionType fromValue(String value)
          throws IllegalArgumentException {
        CustomsOptionType enumeration = (CustomsOptionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CustomsOptionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(CustomsOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CustomsOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
