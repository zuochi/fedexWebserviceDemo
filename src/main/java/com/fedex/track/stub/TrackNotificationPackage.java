/**
 * TrackNotificationPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackNotificationPackage  implements java.io.Serializable {
    /* FedEx assigned identifier for a package/shipment. */
    private String trackingNumber;

    /* When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number. */
    private String trackingNumberUniqueIdentifiers;

    /* Identification of a FedEx operating company (transportation). */
    private com.fedex.track.stub.CarrierCodeType carrierCode;

    /* The date the package was shipped (tendered to FedEx). */
    private java.util.Date shipDate;

    /* The destination address of this package. Only city, state/province,
     * and country are returned. */
    private com.fedex.track.stub.Address destination;

    /* Options available for a tracking notification recipient. */
    private com.fedex.track.stub.TrackNotificationRecipientDetail[] recipientDetails;

    public TrackNotificationPackage() {
    }

    public TrackNotificationPackage(
           String trackingNumber,
           String trackingNumberUniqueIdentifiers,
           com.fedex.track.stub.CarrierCodeType carrierCode,
           java.util.Date shipDate,
           com.fedex.track.stub.Address destination,
           com.fedex.track.stub.TrackNotificationRecipientDetail[] recipientDetails) {
           this.trackingNumber = trackingNumber;
           this.trackingNumberUniqueIdentifiers = trackingNumberUniqueIdentifiers;
           this.carrierCode = carrierCode;
           this.shipDate = shipDate;
           this.destination = destination;
           this.recipientDetails = recipientDetails;
    }


    /**
     * Gets the trackingNumber value for this TrackNotificationPackage.
     * 
     * @return trackingNumber   * FedEx assigned identifier for a package/shipment.
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this TrackNotificationPackage.
     * 
     * @param trackingNumber   * FedEx assigned identifier for a package/shipment.
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the trackingNumberUniqueIdentifiers value for this TrackNotificationPackage.
     * 
     * @return trackingNumberUniqueIdentifiers   * When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number.
     */
    public String getTrackingNumberUniqueIdentifiers() {
        return trackingNumberUniqueIdentifiers;
    }


    /**
     * Sets the trackingNumberUniqueIdentifiers value for this TrackNotificationPackage.
     * 
     * @param trackingNumberUniqueIdentifiers   * When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number.
     */
    public void setTrackingNumberUniqueIdentifiers(String trackingNumberUniqueIdentifiers) {
        this.trackingNumberUniqueIdentifiers = trackingNumberUniqueIdentifiers;
    }


    /**
     * Gets the carrierCode value for this TrackNotificationPackage.
     * 
     * @return carrierCode   * Identification of a FedEx operating company (transportation).
     */
    public com.fedex.track.stub.CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this TrackNotificationPackage.
     * 
     * @param carrierCode   * Identification of a FedEx operating company (transportation).
     */
    public void setCarrierCode(com.fedex.track.stub.CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the shipDate value for this TrackNotificationPackage.
     * 
     * @return shipDate   * The date the package was shipped (tendered to FedEx).
     */
    public java.util.Date getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this TrackNotificationPackage.
     * 
     * @param shipDate   * The date the package was shipped (tendered to FedEx).
     */
    public void setShipDate(java.util.Date shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the destination value for this TrackNotificationPackage.
     * 
     * @return destination   * The destination address of this package. Only city, state/province,
     * and country are returned.
     */
    public com.fedex.track.stub.Address getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this TrackNotificationPackage.
     * 
     * @param destination   * The destination address of this package. Only city, state/province,
     * and country are returned.
     */
    public void setDestination(com.fedex.track.stub.Address destination) {
        this.destination = destination;
    }


    /**
     * Gets the recipientDetails value for this TrackNotificationPackage.
     * 
     * @return recipientDetails   * Options available for a tracking notification recipient.
     */
    public com.fedex.track.stub.TrackNotificationRecipientDetail[] getRecipientDetails() {
        return recipientDetails;
    }


    /**
     * Sets the recipientDetails value for this TrackNotificationPackage.
     * 
     * @param recipientDetails   * Options available for a tracking notification recipient.
     */
    public void setRecipientDetails(com.fedex.track.stub.TrackNotificationRecipientDetail[] recipientDetails) {
        this.recipientDetails = recipientDetails;
    }

    public com.fedex.track.stub.TrackNotificationRecipientDetail getRecipientDetails(int i) {
        return this.recipientDetails[i];
    }

    public void setRecipientDetails(int i, com.fedex.track.stub.TrackNotificationRecipientDetail _value) {
        this.recipientDetails[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackNotificationPackage)) return false;
        TrackNotificationPackage other = (TrackNotificationPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.trackingNumberUniqueIdentifiers==null && other.getTrackingNumberUniqueIdentifiers()==null) || 
             (this.trackingNumberUniqueIdentifiers!=null &&
              this.trackingNumberUniqueIdentifiers.equals(other.getTrackingNumberUniqueIdentifiers()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.recipientDetails==null && other.getRecipientDetails()==null) || 
             (this.recipientDetails!=null &&
              java.util.Arrays.equals(this.recipientDetails, other.getRecipientDetails())));
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
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getTrackingNumberUniqueIdentifiers() != null) {
            _hashCode += getTrackingNumberUniqueIdentifiers().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getRecipientDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRecipientDetails(), i);
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
        new org.apache.axis.description.TypeDesc(TrackNotificationPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackNotificationPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumberUniqueIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackingNumberUniqueIdentifiers"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "RecipientDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackNotificationRecipientDetail"));
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
