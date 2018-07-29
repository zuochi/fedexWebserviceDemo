/**
 * TrackEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * FedEx scanning information about a package.
 */
public class TrackEvent  implements java.io.Serializable {
    /* The time this event occurred. */
    private java.util.Calendar timestamp;

    /* Carrier's scan code. Pairs with EventDescription. */
    private String eventType;

    /* Literal description that pairs with the EventType. */
    private String eventDescription;

    /* Further defines the Scan Type code's specific type (e.g., DEX08
     * business closed). Pairs with StatusExceptionDescription. */
    private String statusExceptionCode;

    /* Literal description that pairs with the StatusExceptionCode. */
    private String statusExceptionDescription;

    /* Address information of the station that is responsible for
     * the scan. */
    private com.fedex.track.stub.Address address;

    /* FedEx location ID where the scan took place. (Returned for
     * CSR SL only.) */
    private String stationId;

    /* Indicates where the arrival actually occurred. */
    private com.fedex.track.stub.ArrivalLocationType arrivalLocation;

    public TrackEvent() {
    }

    public TrackEvent(
           java.util.Calendar timestamp,
           String eventType,
           String eventDescription,
           String statusExceptionCode,
           String statusExceptionDescription,
           com.fedex.track.stub.Address address,
           String stationId,
           com.fedex.track.stub.ArrivalLocationType arrivalLocation) {
           this.timestamp = timestamp;
           this.eventType = eventType;
           this.eventDescription = eventDescription;
           this.statusExceptionCode = statusExceptionCode;
           this.statusExceptionDescription = statusExceptionDescription;
           this.address = address;
           this.stationId = stationId;
           this.arrivalLocation = arrivalLocation;
    }


    /**
     * Gets the timestamp value for this TrackEvent.
     * 
     * @return timestamp   * The time this event occurred.
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TrackEvent.
     * 
     * @param timestamp   * The time this event occurred.
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the eventType value for this TrackEvent.
     * 
     * @return eventType   * Carrier's scan code. Pairs with EventDescription.
     */
    public String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this TrackEvent.
     * 
     * @param eventType   * Carrier's scan code. Pairs with EventDescription.
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the eventDescription value for this TrackEvent.
     * 
     * @return eventDescription   * Literal description that pairs with the EventType.
     */
    public String getEventDescription() {
        return eventDescription;
    }


    /**
     * Sets the eventDescription value for this TrackEvent.
     * 
     * @param eventDescription   * Literal description that pairs with the EventType.
     */
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }


    /**
     * Gets the statusExceptionCode value for this TrackEvent.
     * 
     * @return statusExceptionCode   * Further defines the Scan Type code's specific type (e.g., DEX08
     * business closed). Pairs with StatusExceptionDescription.
     */
    public String getStatusExceptionCode() {
        return statusExceptionCode;
    }


    /**
     * Sets the statusExceptionCode value for this TrackEvent.
     * 
     * @param statusExceptionCode   * Further defines the Scan Type code's specific type (e.g., DEX08
     * business closed). Pairs with StatusExceptionDescription.
     */
    public void setStatusExceptionCode(String statusExceptionCode) {
        this.statusExceptionCode = statusExceptionCode;
    }


    /**
     * Gets the statusExceptionDescription value for this TrackEvent.
     * 
     * @return statusExceptionDescription   * Literal description that pairs with the StatusExceptionCode.
     */
    public String getStatusExceptionDescription() {
        return statusExceptionDescription;
    }


    /**
     * Sets the statusExceptionDescription value for this TrackEvent.
     * 
     * @param statusExceptionDescription   * Literal description that pairs with the StatusExceptionCode.
     */
    public void setStatusExceptionDescription(String statusExceptionDescription) {
        this.statusExceptionDescription = statusExceptionDescription;
    }


    /**
     * Gets the address value for this TrackEvent.
     * 
     * @return address   * Address information of the station that is responsible for
     * the scan.
     */
    public com.fedex.track.stub.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TrackEvent.
     * 
     * @param address   * Address information of the station that is responsible for
     * the scan.
     */
    public void setAddress(com.fedex.track.stub.Address address) {
        this.address = address;
    }


    /**
     * Gets the stationId value for this TrackEvent.
     * 
     * @return stationId   * FedEx location ID where the scan took place. (Returned for
     * CSR SL only.)
     */
    public String getStationId() {
        return stationId;
    }


    /**
     * Sets the stationId value for this TrackEvent.
     * 
     * @param stationId   * FedEx location ID where the scan took place. (Returned for
     * CSR SL only.)
     */
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }


    /**
     * Gets the arrivalLocation value for this TrackEvent.
     * 
     * @return arrivalLocation   * Indicates where the arrival actually occurred.
     */
    public com.fedex.track.stub.ArrivalLocationType getArrivalLocation() {
        return arrivalLocation;
    }


    /**
     * Sets the arrivalLocation value for this TrackEvent.
     * 
     * @param arrivalLocation   * Indicates where the arrival actually occurred.
     */
    public void setArrivalLocation(com.fedex.track.stub.ArrivalLocationType arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackEvent)) return false;
        TrackEvent other = (TrackEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.eventDescription==null && other.getEventDescription()==null) || 
             (this.eventDescription!=null &&
              this.eventDescription.equals(other.getEventDescription()))) &&
            ((this.statusExceptionCode==null && other.getStatusExceptionCode()==null) || 
             (this.statusExceptionCode!=null &&
              this.statusExceptionCode.equals(other.getStatusExceptionCode()))) &&
            ((this.statusExceptionDescription==null && other.getStatusExceptionDescription()==null) || 
             (this.statusExceptionDescription!=null &&
              this.statusExceptionDescription.equals(other.getStatusExceptionDescription()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.stationId==null && other.getStationId()==null) || 
             (this.stationId!=null &&
              this.stationId.equals(other.getStationId()))) &&
            ((this.arrivalLocation==null && other.getArrivalLocation()==null) || 
             (this.arrivalLocation!=null &&
              this.arrivalLocation.equals(other.getArrivalLocation())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getEventDescription() != null) {
            _hashCode += getEventDescription().hashCode();
        }
        if (getStatusExceptionCode() != null) {
            _hashCode += getStatusExceptionCode().hashCode();
        }
        if (getStatusExceptionDescription() != null) {
            _hashCode += getStatusExceptionDescription().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getStationId() != null) {
            _hashCode += getStationId().hashCode();
        }
        if (getArrivalLocation() != null) {
            _hashCode += getArrivalLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EventDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusExceptionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StatusExceptionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusExceptionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StatusExceptionDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ArrivalLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ArrivalLocationType"));
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
