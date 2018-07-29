/**
 * PieceCountVerificationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class PieceCountVerificationDetail  implements java.io.Serializable {
    private com.fedex.track.stub.PieceCountLocationType countLocationType;

    private org.apache.axis.types.NonNegativeInteger count;

    private String description;

    public PieceCountVerificationDetail() {
    }

    public PieceCountVerificationDetail(
           com.fedex.track.stub.PieceCountLocationType countLocationType,
           org.apache.axis.types.NonNegativeInteger count,
           String description) {
           this.countLocationType = countLocationType;
           this.count = count;
           this.description = description;
    }


    /**
     * Gets the countLocationType value for this PieceCountVerificationDetail.
     * 
     * @return countLocationType
     */
    public com.fedex.track.stub.PieceCountLocationType getCountLocationType() {
        return countLocationType;
    }


    /**
     * Sets the countLocationType value for this PieceCountVerificationDetail.
     * 
     * @param countLocationType
     */
    public void setCountLocationType(com.fedex.track.stub.PieceCountLocationType countLocationType) {
        this.countLocationType = countLocationType;
    }


    /**
     * Gets the count value for this PieceCountVerificationDetail.
     * 
     * @return count
     */
    public org.apache.axis.types.NonNegativeInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this PieceCountVerificationDetail.
     * 
     * @param count
     */
    public void setCount(org.apache.axis.types.NonNegativeInteger count) {
        this.count = count;
    }


    /**
     * Gets the description value for this PieceCountVerificationDetail.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PieceCountVerificationDetail.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PieceCountVerificationDetail)) return false;
        PieceCountVerificationDetail other = (PieceCountVerificationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countLocationType==null && other.getCountLocationType()==null) || 
             (this.countLocationType!=null &&
              this.countLocationType.equals(other.getCountLocationType()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getCountLocationType() != null) {
            _hashCode += getCountLocationType().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PieceCountVerificationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PieceCountVerificationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countLocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CountLocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PieceCountLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
