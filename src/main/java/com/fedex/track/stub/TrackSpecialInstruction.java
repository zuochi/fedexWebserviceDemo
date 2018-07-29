/**
 * TrackSpecialInstruction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackSpecialInstruction  implements java.io.Serializable {
    private String description;

    private com.fedex.track.stub.TrackDeliveryOptionType deliveryOption;

    /* Specifies the status and status update time of the track special
     * instructions. */
    private com.fedex.track.stub.SpecialInstructionStatusDetail statusDetail;

    /* Specifies the estimated delivery time that was originally estimated
     * when the shipment was shipped. */
    private java.util.Calendar originalEstimatedDeliveryTimestamp;

    /* Specifies the time the customer requested a change to the shipment. */
    private java.util.Calendar originalRequestTime;

    /* The requested appointment time for delivery. */
    private com.fedex.track.stub.AppointmentDetail requestedAppointmentTime;

    public TrackSpecialInstruction() {
    }

    public TrackSpecialInstruction(
           String description,
           com.fedex.track.stub.TrackDeliveryOptionType deliveryOption,
           com.fedex.track.stub.SpecialInstructionStatusDetail statusDetail,
           java.util.Calendar originalEstimatedDeliveryTimestamp,
           java.util.Calendar originalRequestTime,
           com.fedex.track.stub.AppointmentDetail requestedAppointmentTime) {
           this.description = description;
           this.deliveryOption = deliveryOption;
           this.statusDetail = statusDetail;
           this.originalEstimatedDeliveryTimestamp = originalEstimatedDeliveryTimestamp;
           this.originalRequestTime = originalRequestTime;
           this.requestedAppointmentTime = requestedAppointmentTime;
    }


    /**
     * Gets the description value for this TrackSpecialInstruction.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TrackSpecialInstruction.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the deliveryOption value for this TrackSpecialInstruction.
     * 
     * @return deliveryOption
     */
    public com.fedex.track.stub.TrackDeliveryOptionType getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this TrackSpecialInstruction.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(com.fedex.track.stub.TrackDeliveryOptionType deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the statusDetail value for this TrackSpecialInstruction.
     * 
     * @return statusDetail   * Specifies the status and status update time of the track special
     * instructions.
     */
    public com.fedex.track.stub.SpecialInstructionStatusDetail getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this TrackSpecialInstruction.
     * 
     * @param statusDetail   * Specifies the status and status update time of the track special
     * instructions.
     */
    public void setStatusDetail(com.fedex.track.stub.SpecialInstructionStatusDetail statusDetail) {
        this.statusDetail = statusDetail;
    }


    /**
     * Gets the originalEstimatedDeliveryTimestamp value for this TrackSpecialInstruction.
     * 
     * @return originalEstimatedDeliveryTimestamp   * Specifies the estimated delivery time that was originally estimated
     * when the shipment was shipped.
     */
    public java.util.Calendar getOriginalEstimatedDeliveryTimestamp() {
        return originalEstimatedDeliveryTimestamp;
    }


    /**
     * Sets the originalEstimatedDeliveryTimestamp value for this TrackSpecialInstruction.
     * 
     * @param originalEstimatedDeliveryTimestamp   * Specifies the estimated delivery time that was originally estimated
     * when the shipment was shipped.
     */
    public void setOriginalEstimatedDeliveryTimestamp(java.util.Calendar originalEstimatedDeliveryTimestamp) {
        this.originalEstimatedDeliveryTimestamp = originalEstimatedDeliveryTimestamp;
    }


    /**
     * Gets the originalRequestTime value for this TrackSpecialInstruction.
     * 
     * @return originalRequestTime   * Specifies the time the customer requested a change to the shipment.
     */
    public java.util.Calendar getOriginalRequestTime() {
        return originalRequestTime;
    }


    /**
     * Sets the originalRequestTime value for this TrackSpecialInstruction.
     * 
     * @param originalRequestTime   * Specifies the time the customer requested a change to the shipment.
     */
    public void setOriginalRequestTime(java.util.Calendar originalRequestTime) {
        this.originalRequestTime = originalRequestTime;
    }


    /**
     * Gets the requestedAppointmentTime value for this TrackSpecialInstruction.
     * 
     * @return requestedAppointmentTime   * The requested appointment time for delivery.
     */
    public com.fedex.track.stub.AppointmentDetail getRequestedAppointmentTime() {
        return requestedAppointmentTime;
    }


    /**
     * Sets the requestedAppointmentTime value for this TrackSpecialInstruction.
     * 
     * @param requestedAppointmentTime   * The requested appointment time for delivery.
     */
    public void setRequestedAppointmentTime(com.fedex.track.stub.AppointmentDetail requestedAppointmentTime) {
        this.requestedAppointmentTime = requestedAppointmentTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackSpecialInstruction)) return false;
        TrackSpecialInstruction other = (TrackSpecialInstruction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.statusDetail==null && other.getStatusDetail()==null) || 
             (this.statusDetail!=null &&
              this.statusDetail.equals(other.getStatusDetail()))) &&
            ((this.originalEstimatedDeliveryTimestamp==null && other.getOriginalEstimatedDeliveryTimestamp()==null) || 
             (this.originalEstimatedDeliveryTimestamp!=null &&
              this.originalEstimatedDeliveryTimestamp.equals(other.getOriginalEstimatedDeliveryTimestamp()))) &&
            ((this.originalRequestTime==null && other.getOriginalRequestTime()==null) || 
             (this.originalRequestTime!=null &&
              this.originalRequestTime.equals(other.getOriginalRequestTime()))) &&
            ((this.requestedAppointmentTime==null && other.getRequestedAppointmentTime()==null) || 
             (this.requestedAppointmentTime!=null &&
              this.requestedAppointmentTime.equals(other.getRequestedAppointmentTime())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getStatusDetail() != null) {
            _hashCode += getStatusDetail().hashCode();
        }
        if (getOriginalEstimatedDeliveryTimestamp() != null) {
            _hashCode += getOriginalEstimatedDeliveryTimestamp().hashCode();
        }
        if (getOriginalRequestTime() != null) {
            _hashCode += getOriginalRequestTime().hashCode();
        }
        if (getRequestedAppointmentTime() != null) {
            _hashCode += getRequestedAppointmentTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackSpecialInstruction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSpecialInstruction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "DeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDeliveryOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StatusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SpecialInstructionStatusDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalEstimatedDeliveryTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "OriginalEstimatedDeliveryTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalRequestTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "OriginalRequestTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedAppointmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "RequestedAppointmentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AppointmentDetail"));
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
