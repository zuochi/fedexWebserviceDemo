/**
 * TrackReturnDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackReturnDetail  implements java.io.Serializable {
    private com.fedex.track.stub.TrackReturnMovementStatusType movementStatus;

    private com.fedex.track.stub.TrackReturnLabelType labelType;

    private String description;

    private String authorizationName;

    public TrackReturnDetail() {
    }

    public TrackReturnDetail(
           com.fedex.track.stub.TrackReturnMovementStatusType movementStatus,
           com.fedex.track.stub.TrackReturnLabelType labelType,
           String description,
           String authorizationName) {
           this.movementStatus = movementStatus;
           this.labelType = labelType;
           this.description = description;
           this.authorizationName = authorizationName;
    }


    /**
     * Gets the movementStatus value for this TrackReturnDetail.
     * 
     * @return movementStatus
     */
    public com.fedex.track.stub.TrackReturnMovementStatusType getMovementStatus() {
        return movementStatus;
    }


    /**
     * Sets the movementStatus value for this TrackReturnDetail.
     * 
     * @param movementStatus
     */
    public void setMovementStatus(com.fedex.track.stub.TrackReturnMovementStatusType movementStatus) {
        this.movementStatus = movementStatus;
    }


    /**
     * Gets the labelType value for this TrackReturnDetail.
     * 
     * @return labelType
     */
    public com.fedex.track.stub.TrackReturnLabelType getLabelType() {
        return labelType;
    }


    /**
     * Sets the labelType value for this TrackReturnDetail.
     * 
     * @param labelType
     */
    public void setLabelType(com.fedex.track.stub.TrackReturnLabelType labelType) {
        this.labelType = labelType;
    }


    /**
     * Gets the description value for this TrackReturnDetail.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TrackReturnDetail.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the authorizationName value for this TrackReturnDetail.
     * 
     * @return authorizationName
     */
    public String getAuthorizationName() {
        return authorizationName;
    }


    /**
     * Sets the authorizationName value for this TrackReturnDetail.
     * 
     * @param authorizationName
     */
    public void setAuthorizationName(String authorizationName) {
        this.authorizationName = authorizationName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackReturnDetail)) return false;
        TrackReturnDetail other = (TrackReturnDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.movementStatus==null && other.getMovementStatus()==null) || 
             (this.movementStatus!=null &&
              this.movementStatus.equals(other.getMovementStatus()))) &&
            ((this.labelType==null && other.getLabelType()==null) || 
             (this.labelType!=null &&
              this.labelType.equals(other.getLabelType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.authorizationName==null && other.getAuthorizationName()==null) || 
             (this.authorizationName!=null &&
              this.authorizationName.equals(other.getAuthorizationName())));
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
        if (getMovementStatus() != null) {
            _hashCode += getMovementStatus().hashCode();
        }
        if (getLabelType() != null) {
            _hashCode += getLabelType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAuthorizationName() != null) {
            _hashCode += getAuthorizationName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackReturnDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReturnDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movementStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "MovementStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReturnMovementStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "LabelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReturnLabelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AuthorizationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
