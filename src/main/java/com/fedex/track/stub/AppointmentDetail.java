/**
 * AppointmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Specifies the different appointment times on a specific date.
 */
public class AppointmentDetail  implements java.io.Serializable {
    private java.util.Date date;

    /* Different appointment time windows on the date specified. */
    private com.fedex.track.stub.AppointmentTimeDetail[] windowDetails;

    public AppointmentDetail() {
    }

    public AppointmentDetail(
           java.util.Date date,
           com.fedex.track.stub.AppointmentTimeDetail[] windowDetails) {
           this.date = date;
           this.windowDetails = windowDetails;
    }


    /**
     * Gets the date value for this AppointmentDetail.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this AppointmentDetail.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the windowDetails value for this AppointmentDetail.
     * 
     * @return windowDetails   * Different appointment time windows on the date specified.
     */
    public com.fedex.track.stub.AppointmentTimeDetail[] getWindowDetails() {
        return windowDetails;
    }


    /**
     * Sets the windowDetails value for this AppointmentDetail.
     * 
     * @param windowDetails   * Different appointment time windows on the date specified.
     */
    public void setWindowDetails(com.fedex.track.stub.AppointmentTimeDetail[] windowDetails) {
        this.windowDetails = windowDetails;
    }

    public com.fedex.track.stub.AppointmentTimeDetail getWindowDetails(int i) {
        return this.windowDetails[i];
    }

    public void setWindowDetails(int i, com.fedex.track.stub.AppointmentTimeDetail _value) {
        this.windowDetails[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AppointmentDetail)) return false;
        AppointmentDetail other = (AppointmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.windowDetails==null && other.getWindowDetails()==null) || 
             (this.windowDetails!=null &&
              java.util.Arrays.equals(this.windowDetails, other.getWindowDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getWindowDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWindowDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWindowDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppointmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AppointmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WindowDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AppointmentTimeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
