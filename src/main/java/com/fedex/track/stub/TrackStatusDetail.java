/**
 * TrackStatusDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Specifies the details about the status of the track information
 * for the shipments being tracked.
 */
public class TrackStatusDetail  implements java.io.Serializable {
    private java.util.Calendar creationTime;

    private String code;

    private String description;

    private com.fedex.track.stub.Address location;

    private com.fedex.track.stub.TrackStatusAncillaryDetail[] ancillaryDetails;

    public TrackStatusDetail() {
    }

    public TrackStatusDetail(
           java.util.Calendar creationTime,
           String code,
           String description,
           com.fedex.track.stub.Address location,
           com.fedex.track.stub.TrackStatusAncillaryDetail[] ancillaryDetails) {
           this.creationTime = creationTime;
           this.code = code;
           this.description = description;
           this.location = location;
           this.ancillaryDetails = ancillaryDetails;
    }


    /**
     * Gets the creationTime value for this TrackStatusDetail.
     * 
     * @return creationTime
     */
    public java.util.Calendar getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this TrackStatusDetail.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.util.Calendar creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the code value for this TrackStatusDetail.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this TrackStatusDetail.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this TrackStatusDetail.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TrackStatusDetail.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the location value for this TrackStatusDetail.
     * 
     * @return location
     */
    public com.fedex.track.stub.Address getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TrackStatusDetail.
     * 
     * @param location
     */
    public void setLocation(com.fedex.track.stub.Address location) {
        this.location = location;
    }


    /**
     * Gets the ancillaryDetails value for this TrackStatusDetail.
     * 
     * @return ancillaryDetails
     */
    public com.fedex.track.stub.TrackStatusAncillaryDetail[] getAncillaryDetails() {
        return ancillaryDetails;
    }


    /**
     * Sets the ancillaryDetails value for this TrackStatusDetail.
     * 
     * @param ancillaryDetails
     */
    public void setAncillaryDetails(com.fedex.track.stub.TrackStatusAncillaryDetail[] ancillaryDetails) {
        this.ancillaryDetails = ancillaryDetails;
    }

    public com.fedex.track.stub.TrackStatusAncillaryDetail getAncillaryDetails(int i) {
        return this.ancillaryDetails[i];
    }

    public void setAncillaryDetails(int i, com.fedex.track.stub.TrackStatusAncillaryDetail _value) {
        this.ancillaryDetails[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackStatusDetail)) return false;
        TrackStatusDetail other = (TrackStatusDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.ancillaryDetails==null && other.getAncillaryDetails()==null) || 
             (this.ancillaryDetails!=null &&
              java.util.Arrays.equals(this.ancillaryDetails, other.getAncillaryDetails())));
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
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getAncillaryDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAncillaryDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAncillaryDetails(), i);
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
        new org.apache.axis.description.TypeDesc(TrackStatusDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackStatusDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CreationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AncillaryDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackStatusAncillaryDetail"));
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
