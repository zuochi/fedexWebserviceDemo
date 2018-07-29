/**
 * AppointmentTimeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Specifies the details about the appointment time window.
 */
public class AppointmentTimeDetail  implements java.io.Serializable {
    /* The description that FedEx Ground uses for the appointment
     * window being specified. */
    private com.fedex.track.stub.AppointmentWindowType type;

    /* Specifies the window of time for an appointment. */
    private com.fedex.track.stub.LocalTimeRange window;

    private String description;

    public AppointmentTimeDetail() {
    }

    public AppointmentTimeDetail(
           com.fedex.track.stub.AppointmentWindowType type,
           com.fedex.track.stub.LocalTimeRange window,
           String description) {
           this.type = type;
           this.window = window;
           this.description = description;
    }


    /**
     * Gets the type value for this AppointmentTimeDetail.
     * 
     * @return type   * The description that FedEx Ground uses for the appointment
     * window being specified.
     */
    public com.fedex.track.stub.AppointmentWindowType getType() {
        return type;
    }


    /**
     * Sets the type value for this AppointmentTimeDetail.
     * 
     * @param type   * The description that FedEx Ground uses for the appointment
     * window being specified.
     */
    public void setType(com.fedex.track.stub.AppointmentWindowType type) {
        this.type = type;
    }


    /**
     * Gets the window value for this AppointmentTimeDetail.
     * 
     * @return window   * Specifies the window of time for an appointment.
     */
    public com.fedex.track.stub.LocalTimeRange getWindow() {
        return window;
    }


    /**
     * Sets the window value for this AppointmentTimeDetail.
     * 
     * @param window   * Specifies the window of time for an appointment.
     */
    public void setWindow(com.fedex.track.stub.LocalTimeRange window) {
        this.window = window;
    }


    /**
     * Gets the description value for this AppointmentTimeDetail.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AppointmentTimeDetail.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AppointmentTimeDetail)) return false;
        AppointmentTimeDetail other = (AppointmentTimeDetail) obj;
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
            ((this.window==null && other.getWindow()==null) || 
             (this.window!=null &&
              this.window.equals(other.getWindow()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getWindow() != null) {
            _hashCode += getWindow().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppointmentTimeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AppointmentTimeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AppointmentWindowType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("window");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Window"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "LocalTimeRange"));
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
