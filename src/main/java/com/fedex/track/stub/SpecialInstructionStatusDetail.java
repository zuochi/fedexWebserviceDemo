/**
 * SpecialInstructionStatusDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class SpecialInstructionStatusDetail  implements java.io.Serializable {
    /* Specifies the status of the track special instructions requested. */
    private com.fedex.track.stub.SpecialInstructionsStatusCode status;

    /* Time when the status was changed. */
    private java.util.Calendar statusCreateTime;

    public SpecialInstructionStatusDetail() {
    }

    public SpecialInstructionStatusDetail(
           com.fedex.track.stub.SpecialInstructionsStatusCode status,
           java.util.Calendar statusCreateTime) {
           this.status = status;
           this.statusCreateTime = statusCreateTime;
    }


    /**
     * Gets the status value for this SpecialInstructionStatusDetail.
     * 
     * @return status   * Specifies the status of the track special instructions requested.
     */
    public com.fedex.track.stub.SpecialInstructionsStatusCode getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SpecialInstructionStatusDetail.
     * 
     * @param status   * Specifies the status of the track special instructions requested.
     */
    public void setStatus(com.fedex.track.stub.SpecialInstructionsStatusCode status) {
        this.status = status;
    }


    /**
     * Gets the statusCreateTime value for this SpecialInstructionStatusDetail.
     * 
     * @return statusCreateTime   * Time when the status was changed.
     */
    public java.util.Calendar getStatusCreateTime() {
        return statusCreateTime;
    }


    /**
     * Sets the statusCreateTime value for this SpecialInstructionStatusDetail.
     * 
     * @param statusCreateTime   * Time when the status was changed.
     */
    public void setStatusCreateTime(java.util.Calendar statusCreateTime) {
        this.statusCreateTime = statusCreateTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SpecialInstructionStatusDetail)) return false;
        SpecialInstructionStatusDetail other = (SpecialInstructionStatusDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusCreateTime==null && other.getStatusCreateTime()==null) || 
             (this.statusCreateTime!=null &&
              this.statusCreateTime.equals(other.getStatusCreateTime())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusCreateTime() != null) {
            _hashCode += getStatusCreateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialInstructionStatusDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SpecialInstructionStatusDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SpecialInstructionsStatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCreateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StatusCreateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
