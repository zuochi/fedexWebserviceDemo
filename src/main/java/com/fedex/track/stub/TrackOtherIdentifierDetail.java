/**
 * TrackOtherIdentifierDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackOtherIdentifierDetail  implements java.io.Serializable {
    private com.fedex.track.stub.TrackPackageIdentifier packageIdentifier;

    private String trackingNumberUniqueIdentifier;

    private com.fedex.track.stub.CarrierCodeType carrierCode;

    public TrackOtherIdentifierDetail() {
    }

    public TrackOtherIdentifierDetail(
           com.fedex.track.stub.TrackPackageIdentifier packageIdentifier,
           String trackingNumberUniqueIdentifier,
           com.fedex.track.stub.CarrierCodeType carrierCode) {
           this.packageIdentifier = packageIdentifier;
           this.trackingNumberUniqueIdentifier = trackingNumberUniqueIdentifier;
           this.carrierCode = carrierCode;
    }


    /**
     * Gets the packageIdentifier value for this TrackOtherIdentifierDetail.
     * 
     * @return packageIdentifier
     */
    public com.fedex.track.stub.TrackPackageIdentifier getPackageIdentifier() {
        return packageIdentifier;
    }


    /**
     * Sets the packageIdentifier value for this TrackOtherIdentifierDetail.
     * 
     * @param packageIdentifier
     */
    public void setPackageIdentifier(com.fedex.track.stub.TrackPackageIdentifier packageIdentifier) {
        this.packageIdentifier = packageIdentifier;
    }


    /**
     * Gets the trackingNumberUniqueIdentifier value for this TrackOtherIdentifierDetail.
     * 
     * @return trackingNumberUniqueIdentifier
     */
    public String getTrackingNumberUniqueIdentifier() {
        return trackingNumberUniqueIdentifier;
    }


    /**
     * Sets the trackingNumberUniqueIdentifier value for this TrackOtherIdentifierDetail.
     * 
     * @param trackingNumberUniqueIdentifier
     */
    public void setTrackingNumberUniqueIdentifier(String trackingNumberUniqueIdentifier) {
        this.trackingNumberUniqueIdentifier = trackingNumberUniqueIdentifier;
    }


    /**
     * Gets the carrierCode value for this TrackOtherIdentifierDetail.
     * 
     * @return carrierCode
     */
    public com.fedex.track.stub.CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this TrackOtherIdentifierDetail.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(com.fedex.track.stub.CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackOtherIdentifierDetail)) return false;
        TrackOtherIdentifierDetail other = (TrackOtherIdentifierDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageIdentifier==null && other.getPackageIdentifier()==null) || 
             (this.packageIdentifier!=null &&
              this.packageIdentifier.equals(other.getPackageIdentifier()))) &&
            ((this.trackingNumberUniqueIdentifier==null && other.getTrackingNumberUniqueIdentifier()==null) || 
             (this.trackingNumberUniqueIdentifier!=null &&
              this.trackingNumberUniqueIdentifier.equals(other.getTrackingNumberUniqueIdentifier()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode())));
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
        if (getPackageIdentifier() != null) {
            _hashCode += getPackageIdentifier().hashCode();
        }
        if (getTrackingNumberUniqueIdentifier() != null) {
            _hashCode += getTrackingNumberUniqueIdentifier().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackOtherIdentifierDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackOtherIdentifierDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PackageIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackPackageIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumberUniqueIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackingNumberUniqueIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CarrierCodeType"));
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
