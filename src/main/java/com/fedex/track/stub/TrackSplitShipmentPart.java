/**
 * TrackSplitShipmentPart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Used when a cargo shipment is split across vehicles. This is used
 * to give the status of each part of the shipment.
 */
public class TrackSplitShipmentPart  implements java.io.Serializable {
    /* The number of pieces in this part. */
    private org.apache.axis.types.PositiveInteger pieceCount;

    /* The date and time this status began. */
    private java.util.Calendar timestamp;

    /* A code that identifies this type of status. */
    private String statusCode;

    /* A human-readable description of this status. */
    private String statusDescription;

    public TrackSplitShipmentPart() {
    }

    public TrackSplitShipmentPart(
           org.apache.axis.types.PositiveInteger pieceCount,
           java.util.Calendar timestamp,
           String statusCode,
           String statusDescription) {
           this.pieceCount = pieceCount;
           this.timestamp = timestamp;
           this.statusCode = statusCode;
           this.statusDescription = statusDescription;
    }


    /**
     * Gets the pieceCount value for this TrackSplitShipmentPart.
     * 
     * @return pieceCount   * The number of pieces in this part.
     */
    public org.apache.axis.types.PositiveInteger getPieceCount() {
        return pieceCount;
    }


    /**
     * Sets the pieceCount value for this TrackSplitShipmentPart.
     * 
     * @param pieceCount   * The number of pieces in this part.
     */
    public void setPieceCount(org.apache.axis.types.PositiveInteger pieceCount) {
        this.pieceCount = pieceCount;
    }


    /**
     * Gets the timestamp value for this TrackSplitShipmentPart.
     * 
     * @return timestamp   * The date and time this status began.
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TrackSplitShipmentPart.
     * 
     * @param timestamp   * The date and time this status began.
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the statusCode value for this TrackSplitShipmentPart.
     * 
     * @return statusCode   * A code that identifies this type of status.
     */
    public String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this TrackSplitShipmentPart.
     * 
     * @param statusCode   * A code that identifies this type of status.
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusDescription value for this TrackSplitShipmentPart.
     * 
     * @return statusDescription   * A human-readable description of this status.
     */
    public String getStatusDescription() {
        return statusDescription;
    }


    /**
     * Sets the statusDescription value for this TrackSplitShipmentPart.
     * 
     * @param statusDescription   * A human-readable description of this status.
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackSplitShipmentPart)) return false;
        TrackSplitShipmentPart other = (TrackSplitShipmentPart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pieceCount==null && other.getPieceCount()==null) || 
             (this.pieceCount!=null &&
              this.pieceCount.equals(other.getPieceCount()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusDescription==null && other.getStatusDescription()==null) || 
             (this.statusDescription!=null &&
              this.statusDescription.equals(other.getStatusDescription())));
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
        if (getPieceCount() != null) {
            _hashCode += getPieceCount().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusDescription() != null) {
            _hashCode += getStatusDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackSplitShipmentPart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSplitShipmentPart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PieceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
