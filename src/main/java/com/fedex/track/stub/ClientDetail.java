/**
 * ClientDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Descriptive data for the client submitting a transaction.
 */
public class ClientDetail  implements java.io.Serializable {
    /* The FedEx account number associated with this transaction. */
    private String accountNumber;

    /* This number is assigned by FedEx and identifies the unique
     * device from which the request is originating */
    private String meterNumber;

    /* Only used in transactions which require identification of the
     * FedEx Office integrator. */
    private String integratorId;

    /* The language to be used for human-readable Notification.localizedMessages
     * in responses to the request containing this ClientDetail object. Different
     * requests from the same client may contain different Localization data.
     * (Contrast with TransactionDetail.localization, which governs data
     * payload language/translation.) */
    private com.fedex.track.stub.Localization localization;

    public ClientDetail() {
    }

    public ClientDetail(
           String accountNumber,
           String meterNumber,
           String integratorId,
           com.fedex.track.stub.Localization localization) {
           this.accountNumber = accountNumber;
           this.meterNumber = meterNumber;
           this.integratorId = integratorId;
           this.localization = localization;
    }


    /**
     * Gets the accountNumber value for this ClientDetail.
     * 
     * @return accountNumber   * The FedEx account number associated with this transaction.
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this ClientDetail.
     * 
     * @param accountNumber   * The FedEx account number associated with this transaction.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the meterNumber value for this ClientDetail.
     * 
     * @return meterNumber   * This number is assigned by FedEx and identifies the unique
     * device from which the request is originating
     */
    public String getMeterNumber() {
        return meterNumber;
    }


    /**
     * Sets the meterNumber value for this ClientDetail.
     * 
     * @param meterNumber   * This number is assigned by FedEx and identifies the unique
     * device from which the request is originating
     */
    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }


    /**
     * Gets the integratorId value for this ClientDetail.
     * 
     * @return integratorId   * Only used in transactions which require identification of the
     * FedEx Office integrator.
     */
    public String getIntegratorId() {
        return integratorId;
    }


    /**
     * Sets the integratorId value for this ClientDetail.
     * 
     * @param integratorId   * Only used in transactions which require identification of the
     * FedEx Office integrator.
     */
    public void setIntegratorId(String integratorId) {
        this.integratorId = integratorId;
    }


    /**
     * Gets the localization value for this ClientDetail.
     * 
     * @return localization   * The language to be used for human-readable Notification.localizedMessages
     * in responses to the request containing this ClientDetail object. Different
     * requests from the same client may contain different Localization data.
     * (Contrast with TransactionDetail.localization, which governs data
     * payload language/translation.)
     */
    public com.fedex.track.stub.Localization getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this ClientDetail.
     * 
     * @param localization   * The language to be used for human-readable Notification.localizedMessages
     * in responses to the request containing this ClientDetail object. Different
     * requests from the same client may contain different Localization data.
     * (Contrast with TransactionDetail.localization, which governs data
     * payload language/translation.)
     */
    public void setLocalization(com.fedex.track.stub.Localization localization) {
        this.localization = localization;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ClientDetail)) return false;
        ClientDetail other = (ClientDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.meterNumber==null && other.getMeterNumber()==null) || 
             (this.meterNumber!=null &&
              this.meterNumber.equals(other.getMeterNumber()))) &&
            ((this.integratorId==null && other.getIntegratorId()==null) || 
             (this.integratorId!=null &&
              this.integratorId.equals(other.getIntegratorId()))) &&
            ((this.localization==null && other.getLocalization()==null) || 
             (this.localization!=null &&
              this.localization.equals(other.getLocalization())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getMeterNumber() != null) {
            _hashCode += getMeterNumber().hashCode();
        }
        if (getIntegratorId() != null) {
            _hashCode += getIntegratorId().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ClientDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meterNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "MeterNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integratorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "IntegratorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Localization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Localization"));
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
