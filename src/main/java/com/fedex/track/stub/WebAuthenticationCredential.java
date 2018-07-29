/**
 * WebAuthenticationCredential.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Two part authentication string used for the sender's identity
 */
public class WebAuthenticationCredential  implements java.io.Serializable {
    /* Identifying part of authentication credential. This value is
     * provided by FedEx after registration */
    private String key;

    /* Secret part of authentication key. This value is provided by
     * FedEx after registration. */
    private String password;

    public WebAuthenticationCredential() {
    }

    public WebAuthenticationCredential(
           String key,
           String password) {
           this.key = key;
           this.password = password;
    }


    /**
     * Gets the key value for this WebAuthenticationCredential.
     * 
     * @return key   * Identifying part of authentication credential. This value is
     * provided by FedEx after registration
     */
    public String getKey() {
        return key;
    }


    /**
     * Sets the key value for this WebAuthenticationCredential.
     * 
     * @param key   * Identifying part of authentication credential. This value is
     * provided by FedEx after registration
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * Gets the password value for this WebAuthenticationCredential.
     * 
     * @return password   * Secret part of authentication key. This value is provided by
     * FedEx after registration.
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this WebAuthenticationCredential.
     * 
     * @param password   * Secret part of authentication key. This value is provided by
     * FedEx after registration.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WebAuthenticationCredential)) return false;
        WebAuthenticationCredential other = (WebAuthenticationCredential) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebAuthenticationCredential.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WebAuthenticationCredential"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
