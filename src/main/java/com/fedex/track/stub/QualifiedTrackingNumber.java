/**
 * QualifiedTrackingNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Tracking number and additional shipment data used to identify a
 * unique shipment for proof of delivery.
 */
public class QualifiedTrackingNumber  implements java.io.Serializable {
    /* FedEx assigned identifier for a package/shipment. */
    private String trackingNumber;

    /* The date the package was shipped. */
    private java.util.Date shipDate;

    /* If the account number used to ship the package is provided
     * in the request the shipper and recipient information is included on
     * the letter or fax. */
    private String accountNumber;

    /* FedEx operating company that delivered the package. */
    private com.fedex.track.stub.CarrierCodeType carrier;

    /* Only country is used for elimination of duplicate tracking
     * numbers. */
    private com.fedex.track.stub.Address destination;

    public QualifiedTrackingNumber() {
    }

    public QualifiedTrackingNumber(
           String trackingNumber,
           java.util.Date shipDate,
           String accountNumber,
           com.fedex.track.stub.CarrierCodeType carrier,
           com.fedex.track.stub.Address destination) {
           this.trackingNumber = trackingNumber;
           this.shipDate = shipDate;
           this.accountNumber = accountNumber;
           this.carrier = carrier;
           this.destination = destination;
    }


    /**
     * Gets the trackingNumber value for this QualifiedTrackingNumber.
     * 
     * @return trackingNumber   * FedEx assigned identifier for a package/shipment.
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this QualifiedTrackingNumber.
     * 
     * @param trackingNumber   * FedEx assigned identifier for a package/shipment.
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the shipDate value for this QualifiedTrackingNumber.
     * 
     * @return shipDate   * The date the package was shipped.
     */
    public java.util.Date getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this QualifiedTrackingNumber.
     * 
     * @param shipDate   * The date the package was shipped.
     */
    public void setShipDate(java.util.Date shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the accountNumber value for this QualifiedTrackingNumber.
     * 
     * @return accountNumber   * If the account number used to ship the package is provided
     * in the request the shipper and recipient information is included on
     * the letter or fax.
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this QualifiedTrackingNumber.
     * 
     * @param accountNumber   * If the account number used to ship the package is provided
     * in the request the shipper and recipient information is included on
     * the letter or fax.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the carrier value for this QualifiedTrackingNumber.
     * 
     * @return carrier   * FedEx operating company that delivered the package.
     */
    public com.fedex.track.stub.CarrierCodeType getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this QualifiedTrackingNumber.
     * 
     * @param carrier   * FedEx operating company that delivered the package.
     */
    public void setCarrier(com.fedex.track.stub.CarrierCodeType carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the destination value for this QualifiedTrackingNumber.
     * 
     * @return destination   * Only country is used for elimination of duplicate tracking
     * numbers.
     */
    public com.fedex.track.stub.Address getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this QualifiedTrackingNumber.
     * 
     * @param destination   * Only country is used for elimination of duplicate tracking
     * numbers.
     */
    public void setDestination(com.fedex.track.stub.Address destination) {
        this.destination = destination;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof QualifiedTrackingNumber)) return false;
        QualifiedTrackingNumber other = (QualifiedTrackingNumber) obj;
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
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination())));
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
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QualifiedTrackingNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "QualifiedTrackingNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CarrierCodeType"));
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
