/**
 * TrackRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * The descriptive data sent by a client to track a FedEx package.
 */
public class TrackRequest  implements java.io.Serializable {
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

    /* Specifies the details needed to select the shipment being requested
     * to be tracked. */
    private com.fedex.track.stub.TrackSelectionDetail[] selectionDetails;

    /* The customer can specify a desired time out value for this
     * particular transaction. */
    private org.apache.axis.types.NonNegativeInteger transactionTimeOutValueInMilliseconds;

    private com.fedex.track.stub.TrackRequestProcessingOptionType[] processingOptions;

    public TrackRequest() {
    }

    public TrackRequest(
           com.fedex.track.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.track.stub.ClientDetail clientDetail,
           com.fedex.track.stub.TransactionDetail transactionDetail,
           com.fedex.track.stub.VersionId version,
           com.fedex.track.stub.TrackSelectionDetail[] selectionDetails,
           org.apache.axis.types.NonNegativeInteger transactionTimeOutValueInMilliseconds,
           com.fedex.track.stub.TrackRequestProcessingOptionType[] processingOptions) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.selectionDetails = selectionDetails;
           this.transactionTimeOutValueInMilliseconds = transactionTimeOutValueInMilliseconds;
           this.processingOptions = processingOptions;
    }


    /**
     * Gets the webAuthenticationDetail value for this TrackRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.track.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this TrackRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.track.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this TrackRequest.
     * 
     * @return clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public com.fedex.track.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this TrackRequest.
     * 
     * @param clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public void setClientDetail(com.fedex.track.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this TrackRequest.
     * 
     * @return transactionDetail   * Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations.
     */
    public com.fedex.track.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this TrackRequest.
     * 
     * @param transactionDetail   * Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations.
     */
    public void setTransactionDetail(com.fedex.track.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this TrackRequest.
     * 
     * @return version   * The version of the request being used.
     */
    public com.fedex.track.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this TrackRequest.
     * 
     * @param version   * The version of the request being used.
     */
    public void setVersion(com.fedex.track.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the selectionDetails value for this TrackRequest.
     * 
     * @return selectionDetails   * Specifies the details needed to select the shipment being requested
     * to be tracked.
     */
    public com.fedex.track.stub.TrackSelectionDetail[] getSelectionDetails() {
        return selectionDetails;
    }


    /**
     * Sets the selectionDetails value for this TrackRequest.
     * 
     * @param selectionDetails   * Specifies the details needed to select the shipment being requested
     * to be tracked.
     */
    public void setSelectionDetails(com.fedex.track.stub.TrackSelectionDetail[] selectionDetails) {
        this.selectionDetails = selectionDetails;
    }

    public com.fedex.track.stub.TrackSelectionDetail getSelectionDetails(int i) {
        return this.selectionDetails[i];
    }

    public void setSelectionDetails(int i, com.fedex.track.stub.TrackSelectionDetail _value) {
        this.selectionDetails[i] = _value;
    }


    /**
     * Gets the transactionTimeOutValueInMilliseconds value for this TrackRequest.
     * 
     * @return transactionTimeOutValueInMilliseconds   * The customer can specify a desired time out value for this
     * particular transaction.
     */
    public org.apache.axis.types.NonNegativeInteger getTransactionTimeOutValueInMilliseconds() {
        return transactionTimeOutValueInMilliseconds;
    }


    /**
     * Sets the transactionTimeOutValueInMilliseconds value for this TrackRequest.
     * 
     * @param transactionTimeOutValueInMilliseconds   * The customer can specify a desired time out value for this
     * particular transaction.
     */
    public void setTransactionTimeOutValueInMilliseconds(org.apache.axis.types.NonNegativeInteger transactionTimeOutValueInMilliseconds) {
        this.transactionTimeOutValueInMilliseconds = transactionTimeOutValueInMilliseconds;
    }


    /**
     * Gets the processingOptions value for this TrackRequest.
     * 
     * @return processingOptions
     */
    public com.fedex.track.stub.TrackRequestProcessingOptionType[] getProcessingOptions() {
        return processingOptions;
    }


    /**
     * Sets the processingOptions value for this TrackRequest.
     * 
     * @param processingOptions
     */
    public void setProcessingOptions(com.fedex.track.stub.TrackRequestProcessingOptionType[] processingOptions) {
        this.processingOptions = processingOptions;
    }

    public com.fedex.track.stub.TrackRequestProcessingOptionType getProcessingOptions(int i) {
        return this.processingOptions[i];
    }

    public void setProcessingOptions(int i, com.fedex.track.stub.TrackRequestProcessingOptionType _value) {
        this.processingOptions[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackRequest)) return false;
        TrackRequest other = (TrackRequest) obj;
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
            ((this.selectionDetails==null && other.getSelectionDetails()==null) || 
             (this.selectionDetails!=null &&
              java.util.Arrays.equals(this.selectionDetails, other.getSelectionDetails()))) &&
            ((this.transactionTimeOutValueInMilliseconds==null && other.getTransactionTimeOutValueInMilliseconds()==null) || 
             (this.transactionTimeOutValueInMilliseconds!=null &&
              this.transactionTimeOutValueInMilliseconds.equals(other.getTransactionTimeOutValueInMilliseconds()))) &&
            ((this.processingOptions==null && other.getProcessingOptions()==null) || 
             (this.processingOptions!=null &&
              java.util.Arrays.equals(this.processingOptions, other.getProcessingOptions())));
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
        if (getSelectionDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelectionDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSelectionDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionTimeOutValueInMilliseconds() != null) {
            _hashCode += getTransactionTimeOutValueInMilliseconds().hashCode();
        }
        if (getProcessingOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessingOptions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProcessingOptions(), i);
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
        new org.apache.axis.description.TypeDesc(TrackRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackRequest"));
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
        elemField.setFieldName("selectionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SelectionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSelectionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTimeOutValueInMilliseconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TransactionTimeOutValueInMilliseconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ProcessingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackRequestProcessingOptionType"));
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
