/**
 * SignatureProofOfDeliveryFaxRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * FedEx Signature Proof Of Delivery Fax request.
 */
public class SignatureProofOfDeliveryFaxRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.track.stub.WebAuthenticationDetail webAuthenticationDetail;

    /* Descriptive data identifying the client submitting the transaction. */
    private com.fedex.track.stub.ClientDetail clientDetail;

    /* Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations. */
    private com.fedex.track.stub.TransactionDetail transactionDetail;

    /* The version of the request being used. */
    private com.fedex.track.stub.VersionId version;

    /* Tracking number and additional shipment data used to identify
     * a unique shipment for proof of delivery. */
    private com.fedex.track.stub.QualifiedTrackingNumber qualifiedTrackingNumber;

    /* Additional customer-supplied text to be added to the body of
     * the letter. */
    private String additionalComments;

    /* Contact and address information about the person requesting
     * the fax to be sent. */
    private com.fedex.track.stub.ContactAndAddress faxSender;

    /* Contact and address information, including the fax number,
     * about the person to receive the fax. */
    private com.fedex.track.stub.ContactAndAddress faxRecipient;

    public SignatureProofOfDeliveryFaxRequest() {
    }

    public SignatureProofOfDeliveryFaxRequest(
           com.fedex.track.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.track.stub.ClientDetail clientDetail,
           com.fedex.track.stub.TransactionDetail transactionDetail,
           com.fedex.track.stub.VersionId version,
           com.fedex.track.stub.QualifiedTrackingNumber qualifiedTrackingNumber,
           String additionalComments,
           com.fedex.track.stub.ContactAndAddress faxSender,
           com.fedex.track.stub.ContactAndAddress faxRecipient) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.qualifiedTrackingNumber = qualifiedTrackingNumber;
           this.additionalComments = additionalComments;
           this.faxSender = faxSender;
           this.faxRecipient = faxRecipient;
    }


    /**
     * Gets the webAuthenticationDetail value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.track.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.track.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @return clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public com.fedex.track.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @param clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public void setClientDetail(com.fedex.track.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @return transactionDetail   * Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations.
     */
    public com.fedex.track.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @param transactionDetail   * Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations.
     */
    public void setTransactionDetail(com.fedex.track.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @return version   * The version of the request being used.
     */
    public com.fedex.track.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @param version   * The version of the request being used.
     */
    public void setVersion(com.fedex.track.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the qualifiedTrackingNumber value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @return qualifiedTrackingNumber   * Tracking number and additional shipment data used to identify
     * a unique shipment for proof of delivery.
     */
    public com.fedex.track.stub.QualifiedTrackingNumber getQualifiedTrackingNumber() {
        return qualifiedTrackingNumber;
    }


    /**
     * Sets the qualifiedTrackingNumber value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @param qualifiedTrackingNumber   * Tracking number and additional shipment data used to identify
     * a unique shipment for proof of delivery.
     */
    public void setQualifiedTrackingNumber(com.fedex.track.stub.QualifiedTrackingNumber qualifiedTrackingNumber) {
        this.qualifiedTrackingNumber = qualifiedTrackingNumber;
    }


    /**
     * Gets the additionalComments value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @return additionalComments   * Additional customer-supplied text to be added to the body of
     * the letter.
     */
    public String getAdditionalComments() {
        return additionalComments;
    }


    /**
     * Sets the additionalComments value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @param additionalComments   * Additional customer-supplied text to be added to the body of
     * the letter.
     */
    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }


    /**
     * Gets the faxSender value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @return faxSender   * Contact and address information about the person requesting
     * the fax to be sent.
     */
    public com.fedex.track.stub.ContactAndAddress getFaxSender() {
        return faxSender;
    }


    /**
     * Sets the faxSender value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @param faxSender   * Contact and address information about the person requesting
     * the fax to be sent.
     */
    public void setFaxSender(com.fedex.track.stub.ContactAndAddress faxSender) {
        this.faxSender = faxSender;
    }


    /**
     * Gets the faxRecipient value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @return faxRecipient   * Contact and address information, including the fax number,
     * about the person to receive the fax.
     */
    public com.fedex.track.stub.ContactAndAddress getFaxRecipient() {
        return faxRecipient;
    }


    /**
     * Sets the faxRecipient value for this SignatureProofOfDeliveryFaxRequest.
     * 
     * @param faxRecipient   * Contact and address information, including the fax number,
     * about the person to receive the fax.
     */
    public void setFaxRecipient(com.fedex.track.stub.ContactAndAddress faxRecipient) {
        this.faxRecipient = faxRecipient;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SignatureProofOfDeliveryFaxRequest)) return false;
        SignatureProofOfDeliveryFaxRequest other = (SignatureProofOfDeliveryFaxRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.qualifiedTrackingNumber==null && other.getQualifiedTrackingNumber()==null) || 
             (this.qualifiedTrackingNumber!=null &&
              this.qualifiedTrackingNumber.equals(other.getQualifiedTrackingNumber()))) &&
            ((this.additionalComments==null && other.getAdditionalComments()==null) || 
             (this.additionalComments!=null &&
              this.additionalComments.equals(other.getAdditionalComments()))) &&
            ((this.faxSender==null && other.getFaxSender()==null) || 
             (this.faxSender!=null &&
              this.faxSender.equals(other.getFaxSender()))) &&
            ((this.faxRecipient==null && other.getFaxRecipient()==null) || 
             (this.faxRecipient!=null &&
              this.faxRecipient.equals(other.getFaxRecipient())));
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
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getQualifiedTrackingNumber() != null) {
            _hashCode += getQualifiedTrackingNumber().hashCode();
        }
        if (getAdditionalComments() != null) {
            _hashCode += getAdditionalComments().hashCode();
        }
        if (getFaxSender() != null) {
            _hashCode += getFaxSender().hashCode();
        }
        if (getFaxRecipient() != null) {
            _hashCode += getFaxRecipient().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignatureProofOfDeliveryFaxRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ClientDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiedTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "QualifiedTrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "QualifiedTrackingNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalComments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AdditionalComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxSender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "FaxSender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "FaxRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ContactAndAddress"));
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
