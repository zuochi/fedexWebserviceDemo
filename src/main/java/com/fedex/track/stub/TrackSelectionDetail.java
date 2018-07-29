/**
 * TrackSelectionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackSelectionDetail  implements java.io.Serializable {
    /* The FedEx operating company (transportation) used for this
     * package's delivery. */
    private com.fedex.track.stub.CarrierCodeType carrierCode;

    /* Identifies operating transportation company that is the specific
     * to the carrier code. */
    private com.fedex.track.stub.OperatingCompanyType operatingCompany;

    /* The type and value of the package identifier that is to be
     * used to retrieve the tracking information for a package or group of
     * packages. */
    private com.fedex.track.stub.TrackPackageIdentifier packageIdentifier;

    /* Used to distinguish duplicate FedEx tracking numbers. */
    private String trackingNumberUniqueIdentifier;

    /* To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates. */
    private java.util.Date shipDateRangeBegin;

    /* To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates. */
    private java.util.Date shipDateRangeEnd;

    /* For tracking by references information either the account number
     * or destination postal code and country must be provided. */
    private String shipmentAccountNumber;

    /* Specifies the SPOD account number for the shipment being tracked. */
    private String secureSpodAccount;

    /* For tracking by references information either the account number
     * or destination postal code and country must be provided. */
    private com.fedex.track.stub.Address destination;

    /* Specifies the details about how to retrieve the subsequent
     * pages when there is more than one page in the TrackReply. */
    private com.fedex.track.stub.PagingDetail pagingDetail;

    /* The customer can specify a desired time out value for this
     * particular tracking number. */
    private org.apache.axis.types.NonNegativeInteger customerSpecifiedTimeOutValueInMilliseconds;

    public TrackSelectionDetail() {
    }

    public TrackSelectionDetail(
           com.fedex.track.stub.CarrierCodeType carrierCode,
           com.fedex.track.stub.OperatingCompanyType operatingCompany,
           com.fedex.track.stub.TrackPackageIdentifier packageIdentifier,
           String trackingNumberUniqueIdentifier,
           java.util.Date shipDateRangeBegin,
           java.util.Date shipDateRangeEnd,
           String shipmentAccountNumber,
           String secureSpodAccount,
           com.fedex.track.stub.Address destination,
           com.fedex.track.stub.PagingDetail pagingDetail,
           org.apache.axis.types.NonNegativeInteger customerSpecifiedTimeOutValueInMilliseconds) {
           this.carrierCode = carrierCode;
           this.operatingCompany = operatingCompany;
           this.packageIdentifier = packageIdentifier;
           this.trackingNumberUniqueIdentifier = trackingNumberUniqueIdentifier;
           this.shipDateRangeBegin = shipDateRangeBegin;
           this.shipDateRangeEnd = shipDateRangeEnd;
           this.shipmentAccountNumber = shipmentAccountNumber;
           this.secureSpodAccount = secureSpodAccount;
           this.destination = destination;
           this.pagingDetail = pagingDetail;
           this.customerSpecifiedTimeOutValueInMilliseconds = customerSpecifiedTimeOutValueInMilliseconds;
    }


    /**
     * Gets the carrierCode value for this TrackSelectionDetail.
     * 
     * @return carrierCode   * The FedEx operating company (transportation) used for this
     * package's delivery.
     */
    public com.fedex.track.stub.CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this TrackSelectionDetail.
     * 
     * @param carrierCode   * The FedEx operating company (transportation) used for this
     * package's delivery.
     */
    public void setCarrierCode(com.fedex.track.stub.CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the operatingCompany value for this TrackSelectionDetail.
     * 
     * @return operatingCompany   * Identifies operating transportation company that is the specific
     * to the carrier code.
     */
    public com.fedex.track.stub.OperatingCompanyType getOperatingCompany() {
        return operatingCompany;
    }


    /**
     * Sets the operatingCompany value for this TrackSelectionDetail.
     * 
     * @param operatingCompany   * Identifies operating transportation company that is the specific
     * to the carrier code.
     */
    public void setOperatingCompany(com.fedex.track.stub.OperatingCompanyType operatingCompany) {
        this.operatingCompany = operatingCompany;
    }


    /**
     * Gets the packageIdentifier value for this TrackSelectionDetail.
     * 
     * @return packageIdentifier   * The type and value of the package identifier that is to be
     * used to retrieve the tracking information for a package or group of
     * packages.
     */
    public com.fedex.track.stub.TrackPackageIdentifier getPackageIdentifier() {
        return packageIdentifier;
    }


    /**
     * Sets the packageIdentifier value for this TrackSelectionDetail.
     * 
     * @param packageIdentifier   * The type and value of the package identifier that is to be
     * used to retrieve the tracking information for a package or group of
     * packages.
     */
    public void setPackageIdentifier(com.fedex.track.stub.TrackPackageIdentifier packageIdentifier) {
        this.packageIdentifier = packageIdentifier;
    }


    /**
     * Gets the trackingNumberUniqueIdentifier value for this TrackSelectionDetail.
     * 
     * @return trackingNumberUniqueIdentifier   * Used to distinguish duplicate FedEx tracking numbers.
     */
    public String getTrackingNumberUniqueIdentifier() {
        return trackingNumberUniqueIdentifier;
    }


    /**
     * Sets the trackingNumberUniqueIdentifier value for this TrackSelectionDetail.
     * 
     * @param trackingNumberUniqueIdentifier   * Used to distinguish duplicate FedEx tracking numbers.
     */
    public void setTrackingNumberUniqueIdentifier(String trackingNumberUniqueIdentifier) {
        this.trackingNumberUniqueIdentifier = trackingNumberUniqueIdentifier;
    }


    /**
     * Gets the shipDateRangeBegin value for this TrackSelectionDetail.
     * 
     * @return shipDateRangeBegin   * To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates.
     */
    public java.util.Date getShipDateRangeBegin() {
        return shipDateRangeBegin;
    }


    /**
     * Sets the shipDateRangeBegin value for this TrackSelectionDetail.
     * 
     * @param shipDateRangeBegin   * To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates.
     */
    public void setShipDateRangeBegin(java.util.Date shipDateRangeBegin) {
        this.shipDateRangeBegin = shipDateRangeBegin;
    }


    /**
     * Gets the shipDateRangeEnd value for this TrackSelectionDetail.
     * 
     * @return shipDateRangeEnd   * To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates.
     */
    public java.util.Date getShipDateRangeEnd() {
        return shipDateRangeEnd;
    }


    /**
     * Sets the shipDateRangeEnd value for this TrackSelectionDetail.
     * 
     * @param shipDateRangeEnd   * To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates.
     */
    public void setShipDateRangeEnd(java.util.Date shipDateRangeEnd) {
        this.shipDateRangeEnd = shipDateRangeEnd;
    }


    /**
     * Gets the shipmentAccountNumber value for this TrackSelectionDetail.
     * 
     * @return shipmentAccountNumber   * For tracking by references information either the account number
     * or destination postal code and country must be provided.
     */
    public String getShipmentAccountNumber() {
        return shipmentAccountNumber;
    }


    /**
     * Sets the shipmentAccountNumber value for this TrackSelectionDetail.
     * 
     * @param shipmentAccountNumber   * For tracking by references information either the account number
     * or destination postal code and country must be provided.
     */
    public void setShipmentAccountNumber(String shipmentAccountNumber) {
        this.shipmentAccountNumber = shipmentAccountNumber;
    }


    /**
     * Gets the secureSpodAccount value for this TrackSelectionDetail.
     * 
     * @return secureSpodAccount   * Specifies the SPOD account number for the shipment being tracked.
     */
    public String getSecureSpodAccount() {
        return secureSpodAccount;
    }


    /**
     * Sets the secureSpodAccount value for this TrackSelectionDetail.
     * 
     * @param secureSpodAccount   * Specifies the SPOD account number for the shipment being tracked.
     */
    public void setSecureSpodAccount(String secureSpodAccount) {
        this.secureSpodAccount = secureSpodAccount;
    }


    /**
     * Gets the destination value for this TrackSelectionDetail.
     * 
     * @return destination   * For tracking by references information either the account number
     * or destination postal code and country must be provided.
     */
    public com.fedex.track.stub.Address getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this TrackSelectionDetail.
     * 
     * @param destination   * For tracking by references information either the account number
     * or destination postal code and country must be provided.
     */
    public void setDestination(com.fedex.track.stub.Address destination) {
        this.destination = destination;
    }


    /**
     * Gets the pagingDetail value for this TrackSelectionDetail.
     * 
     * @return pagingDetail   * Specifies the details about how to retrieve the subsequent
     * pages when there is more than one page in the TrackReply.
     */
    public com.fedex.track.stub.PagingDetail getPagingDetail() {
        return pagingDetail;
    }


    /**
     * Sets the pagingDetail value for this TrackSelectionDetail.
     * 
     * @param pagingDetail   * Specifies the details about how to retrieve the subsequent
     * pages when there is more than one page in the TrackReply.
     */
    public void setPagingDetail(com.fedex.track.stub.PagingDetail pagingDetail) {
        this.pagingDetail = pagingDetail;
    }


    /**
     * Gets the customerSpecifiedTimeOutValueInMilliseconds value for this TrackSelectionDetail.
     * 
     * @return customerSpecifiedTimeOutValueInMilliseconds   * The customer can specify a desired time out value for this
     * particular tracking number.
     */
    public org.apache.axis.types.NonNegativeInteger getCustomerSpecifiedTimeOutValueInMilliseconds() {
        return customerSpecifiedTimeOutValueInMilliseconds;
    }


    /**
     * Sets the customerSpecifiedTimeOutValueInMilliseconds value for this TrackSelectionDetail.
     * 
     * @param customerSpecifiedTimeOutValueInMilliseconds   * The customer can specify a desired time out value for this
     * particular tracking number.
     */
    public void setCustomerSpecifiedTimeOutValueInMilliseconds(org.apache.axis.types.NonNegativeInteger customerSpecifiedTimeOutValueInMilliseconds) {
        this.customerSpecifiedTimeOutValueInMilliseconds = customerSpecifiedTimeOutValueInMilliseconds;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackSelectionDetail)) return false;
        TrackSelectionDetail other = (TrackSelectionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.operatingCompany==null && other.getOperatingCompany()==null) || 
             (this.operatingCompany!=null &&
              this.operatingCompany.equals(other.getOperatingCompany()))) &&
            ((this.packageIdentifier==null && other.getPackageIdentifier()==null) || 
             (this.packageIdentifier!=null &&
              this.packageIdentifier.equals(other.getPackageIdentifier()))) &&
            ((this.trackingNumberUniqueIdentifier==null && other.getTrackingNumberUniqueIdentifier()==null) || 
             (this.trackingNumberUniqueIdentifier!=null &&
              this.trackingNumberUniqueIdentifier.equals(other.getTrackingNumberUniqueIdentifier()))) &&
            ((this.shipDateRangeBegin==null && other.getShipDateRangeBegin()==null) || 
             (this.shipDateRangeBegin!=null &&
              this.shipDateRangeBegin.equals(other.getShipDateRangeBegin()))) &&
            ((this.shipDateRangeEnd==null && other.getShipDateRangeEnd()==null) || 
             (this.shipDateRangeEnd!=null &&
              this.shipDateRangeEnd.equals(other.getShipDateRangeEnd()))) &&
            ((this.shipmentAccountNumber==null && other.getShipmentAccountNumber()==null) || 
             (this.shipmentAccountNumber!=null &&
              this.shipmentAccountNumber.equals(other.getShipmentAccountNumber()))) &&
            ((this.secureSpodAccount==null && other.getSecureSpodAccount()==null) || 
             (this.secureSpodAccount!=null &&
              this.secureSpodAccount.equals(other.getSecureSpodAccount()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.pagingDetail==null && other.getPagingDetail()==null) || 
             (this.pagingDetail!=null &&
              this.pagingDetail.equals(other.getPagingDetail()))) &&
            ((this.customerSpecifiedTimeOutValueInMilliseconds==null && other.getCustomerSpecifiedTimeOutValueInMilliseconds()==null) || 
             (this.customerSpecifiedTimeOutValueInMilliseconds!=null &&
              this.customerSpecifiedTimeOutValueInMilliseconds.equals(other.getCustomerSpecifiedTimeOutValueInMilliseconds())));
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
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getOperatingCompany() != null) {
            _hashCode += getOperatingCompany().hashCode();
        }
        if (getPackageIdentifier() != null) {
            _hashCode += getPackageIdentifier().hashCode();
        }
        if (getTrackingNumberUniqueIdentifier() != null) {
            _hashCode += getTrackingNumberUniqueIdentifier().hashCode();
        }
        if (getShipDateRangeBegin() != null) {
            _hashCode += getShipDateRangeBegin().hashCode();
        }
        if (getShipDateRangeEnd() != null) {
            _hashCode += getShipDateRangeEnd().hashCode();
        }
        if (getShipmentAccountNumber() != null) {
            _hashCode += getShipmentAccountNumber().hashCode();
        }
        if (getSecureSpodAccount() != null) {
            _hashCode += getSecureSpodAccount().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getPagingDetail() != null) {
            _hashCode += getPagingDetail().hashCode();
        }
        if (getCustomerSpecifiedTimeOutValueInMilliseconds() != null) {
            _hashCode += getCustomerSpecifiedTimeOutValueInMilliseconds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackSelectionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSelectionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CarrierCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "OperatingCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "OperatingCompanyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("shipDateRangeBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ShipDateRangeBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDateRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ShipDateRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ShipmentAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureSpodAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SecureSpodAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pagingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PagingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PagingDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSpecifiedTimeOutValueInMilliseconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CustomerSpecifiedTimeOutValueInMilliseconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
