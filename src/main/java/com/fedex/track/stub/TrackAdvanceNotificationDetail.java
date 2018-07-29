/**
 * TrackAdvanceNotificationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackAdvanceNotificationDetail  implements java.io.Serializable {
    private java.util.Calendar estimatedTimeOfArrival;

    private String reason;

    private com.fedex.track.stub.TrackAdvanceNotificationStatusType status;

    private String statusDescription;

    private java.util.Calendar statusTime;

    public TrackAdvanceNotificationDetail() {
    }

    public TrackAdvanceNotificationDetail(
           java.util.Calendar estimatedTimeOfArrival,
           String reason,
           com.fedex.track.stub.TrackAdvanceNotificationStatusType status,
           String statusDescription,
           java.util.Calendar statusTime) {
           this.estimatedTimeOfArrival = estimatedTimeOfArrival;
           this.reason = reason;
           this.status = status;
           this.statusDescription = statusDescription;
           this.statusTime = statusTime;
    }


    /**
     * Gets the estimatedTimeOfArrival value for this TrackAdvanceNotificationDetail.
     * 
     * @return estimatedTimeOfArrival
     */
    public java.util.Calendar getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }


    /**
     * Sets the estimatedTimeOfArrival value for this TrackAdvanceNotificationDetail.
     * 
     * @param estimatedTimeOfArrival
     */
    public void setEstimatedTimeOfArrival(java.util.Calendar estimatedTimeOfArrival) {
        this.estimatedTimeOfArrival = estimatedTimeOfArrival;
    }


    /**
     * Gets the reason value for this TrackAdvanceNotificationDetail.
     * 
     * @return reason
     */
    public String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this TrackAdvanceNotificationDetail.
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * Gets the status value for this TrackAdvanceNotificationDetail.
     * 
     * @return status
     */
    public com.fedex.track.stub.TrackAdvanceNotificationStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TrackAdvanceNotificationDetail.
     * 
     * @param status
     */
    public void setStatus(com.fedex.track.stub.TrackAdvanceNotificationStatusType status) {
        this.status = status;
    }


    /**
     * Gets the statusDescription value for this TrackAdvanceNotificationDetail.
     * 
     * @return statusDescription
     */
    public String getStatusDescription() {
        return statusDescription;
    }


    /**
     * Sets the statusDescription value for this TrackAdvanceNotificationDetail.
     * 
     * @param statusDescription
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }


    /**
     * Gets the statusTime value for this TrackAdvanceNotificationDetail.
     * 
     * @return statusTime
     */
    public java.util.Calendar getStatusTime() {
        return statusTime;
    }


    /**
     * Sets the statusTime value for this TrackAdvanceNotificationDetail.
     * 
     * @param statusTime
     */
    public void setStatusTime(java.util.Calendar statusTime) {
        this.statusTime = statusTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackAdvanceNotificationDetail)) return false;
        TrackAdvanceNotificationDetail other = (TrackAdvanceNotificationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estimatedTimeOfArrival==null && other.getEstimatedTimeOfArrival()==null) || 
             (this.estimatedTimeOfArrival!=null &&
              this.estimatedTimeOfArrival.equals(other.getEstimatedTimeOfArrival()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDescription==null && other.getStatusDescription()==null) || 
             (this.statusDescription!=null &&
              this.statusDescription.equals(other.getStatusDescription()))) &&
            ((this.statusTime==null && other.getStatusTime()==null) || 
             (this.statusTime!=null &&
              this.statusTime.equals(other.getStatusTime())));
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
        if (getEstimatedTimeOfArrival() != null) {
            _hashCode += getEstimatedTimeOfArrival().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDescription() != null) {
            _hashCode += getStatusDescription().hashCode();
        }
        if (getStatusTime() != null) {
            _hashCode += getStatusTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackAdvanceNotificationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackAdvanceNotificationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOfArrival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EstimatedTimeOfArrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackAdvanceNotificationStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StatusDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StatusTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
