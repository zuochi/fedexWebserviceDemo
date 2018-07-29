/**
 * NotificationSeverityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class NotificationSeverityType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NotificationSeverityType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ERROR = "ERROR";
    public static final String _FAILURE = "FAILURE";
    public static final String _NOTE = "NOTE";
    public static final String _SUCCESS = "SUCCESS";
    public static final String _WARNING = "WARNING";
    public static final NotificationSeverityType ERROR = new NotificationSeverityType(_ERROR);
    public static final NotificationSeverityType FAILURE = new NotificationSeverityType(_FAILURE);
    public static final NotificationSeverityType NOTE = new NotificationSeverityType(_NOTE);
    public static final NotificationSeverityType SUCCESS = new NotificationSeverityType(_SUCCESS);
    public static final NotificationSeverityType WARNING = new NotificationSeverityType(_WARNING);
    public String getValue() { return _value_;}
    public static NotificationSeverityType fromValue(String value)
          throws IllegalArgumentException {
        NotificationSeverityType enumeration = (NotificationSeverityType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static NotificationSeverityType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(NotificationSeverityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NotificationSeverityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
