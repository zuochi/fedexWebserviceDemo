/**
 * TrackChargeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackChargeDetail  implements java.io.Serializable {
    private com.fedex.track.stub.TrackChargeDetailType type;

    private com.fedex.track.stub.Money chargeAmount;

    public TrackChargeDetail() {
    }

    public TrackChargeDetail(
           com.fedex.track.stub.TrackChargeDetailType type,
           com.fedex.track.stub.Money chargeAmount) {
           this.type = type;
           this.chargeAmount = chargeAmount;
    }


    /**
     * Gets the type value for this TrackChargeDetail.
     * 
     * @return type
     */
    public com.fedex.track.stub.TrackChargeDetailType getType() {
        return type;
    }


    /**
     * Sets the type value for this TrackChargeDetail.
     * 
     * @param type
     */
    public void setType(com.fedex.track.stub.TrackChargeDetailType type) {
        this.type = type;
    }


    /**
     * Gets the chargeAmount value for this TrackChargeDetail.
     * 
     * @return chargeAmount
     */
    public com.fedex.track.stub.Money getChargeAmount() {
        return chargeAmount;
    }


    /**
     * Sets the chargeAmount value for this TrackChargeDetail.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(com.fedex.track.stub.Money chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackChargeDetail)) return false;
        TrackChargeDetail other = (TrackChargeDetail) obj;
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
            ((this.chargeAmount==null && other.getChargeAmount()==null) || 
             (this.chargeAmount!=null &&
              this.chargeAmount.equals(other.getChargeAmount())));
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
        if (getChargeAmount() != null) {
            _hashCode += getChargeAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackChargeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackChargeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackChargeDetailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Money"));
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
