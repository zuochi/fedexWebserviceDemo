/**
 * TrackServiceDescriptionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackServiceDescriptionDetail  implements java.io.Serializable {
    private com.fedex.track.stub.ServiceType type;

    private String description;

    /* Specifies a shorter description for the service that is calculated
     * per the service code. */
    private String shortDescription;

    public TrackServiceDescriptionDetail() {
    }

    public TrackServiceDescriptionDetail(
           com.fedex.track.stub.ServiceType type,
           String description,
           String shortDescription) {
           this.type = type;
           this.description = description;
           this.shortDescription = shortDescription;
    }


    /**
     * Gets the type value for this TrackServiceDescriptionDetail.
     * 
     * @return type
     */
    public com.fedex.track.stub.ServiceType getType() {
        return type;
    }


    /**
     * Sets the type value for this TrackServiceDescriptionDetail.
     * 
     * @param type
     */
    public void setType(com.fedex.track.stub.ServiceType type) {
        this.type = type;
    }


    /**
     * Gets the description value for this TrackServiceDescriptionDetail.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TrackServiceDescriptionDetail.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the shortDescription value for this TrackServiceDescriptionDetail.
     * 
     * @return shortDescription   * Specifies a shorter description for the service that is calculated
     * per the service code.
     */
    public String getShortDescription() {
        return shortDescription;
    }


    /**
     * Sets the shortDescription value for this TrackServiceDescriptionDetail.
     * 
     * @param shortDescription   * Specifies a shorter description for the service that is calculated
     * per the service code.
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackServiceDescriptionDetail)) return false;
        TrackServiceDescriptionDetail other = (TrackServiceDescriptionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.shortDescription==null && other.getShortDescription()==null) || 
             (this.shortDescription!=null &&
              this.shortDescription.equals(other.getShortDescription())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getShortDescription() != null) {
            _hashCode += getShortDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackServiceDescriptionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackServiceDescriptionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ServiceType"));
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
        elemField.setFieldName("shortDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ShortDescription"));
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
