/**
 * CompletedTrackDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class CompletedTrackDetail  implements java.io.Serializable {
    private com.fedex.track.stub.NotificationSeverityType highestSeverity;

    private com.fedex.track.stub.Notification[] notifications;

    /* True if duplicate packages (more than one package with the
     * same tracking number) have been found, and only limited data will
     * be provided for each one. */
    private Boolean duplicateWaybill;

    /* True if additional packages remain to be retrieved. */
    private Boolean moreData;

    /* Value that must be passed in a TrackNotification request to
     * retrieve the next set of packages (when MoreDataAvailable = true). */
    private String pagingToken;

    /* Identifies the total number of available track details across
     * all pages. */
    private org.apache.axis.types.NonNegativeInteger trackDetailsCount;

    /* Contains detailed tracking information for the requested packages(s). */
    private com.fedex.track.stub.TrackDetail[] trackDetails;

    public CompletedTrackDetail() {
    }

    public CompletedTrackDetail(
           com.fedex.track.stub.NotificationSeverityType highestSeverity,
           com.fedex.track.stub.Notification[] notifications,
           Boolean duplicateWaybill,
           Boolean moreData,
           String pagingToken,
           org.apache.axis.types.NonNegativeInteger trackDetailsCount,
           com.fedex.track.stub.TrackDetail[] trackDetails) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.duplicateWaybill = duplicateWaybill;
           this.moreData = moreData;
           this.pagingToken = pagingToken;
           this.trackDetailsCount = trackDetailsCount;
           this.trackDetails = trackDetails;
    }


    /**
     * Gets the highestSeverity value for this CompletedTrackDetail.
     * 
     * @return highestSeverity
     */
    public com.fedex.track.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this CompletedTrackDetail.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.track.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this CompletedTrackDetail.
     * 
     * @return notifications
     */
    public com.fedex.track.stub.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this CompletedTrackDetail.
     * 
     * @param notifications
     */
    public void setNotifications(com.fedex.track.stub.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.fedex.track.stub.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.fedex.track.stub.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the duplicateWaybill value for this CompletedTrackDetail.
     * 
     * @return duplicateWaybill   * True if duplicate packages (more than one package with the
     * same tracking number) have been found, and only limited data will
     * be provided for each one.
     */
    public Boolean getDuplicateWaybill() {
        return duplicateWaybill;
    }


    /**
     * Sets the duplicateWaybill value for this CompletedTrackDetail.
     * 
     * @param duplicateWaybill   * True if duplicate packages (more than one package with the
     * same tracking number) have been found, and only limited data will
     * be provided for each one.
     */
    public void setDuplicateWaybill(Boolean duplicateWaybill) {
        this.duplicateWaybill = duplicateWaybill;
    }


    /**
     * Gets the moreData value for this CompletedTrackDetail.
     * 
     * @return moreData   * True if additional packages remain to be retrieved.
     */
    public Boolean getMoreData() {
        return moreData;
    }


    /**
     * Sets the moreData value for this CompletedTrackDetail.
     * 
     * @param moreData   * True if additional packages remain to be retrieved.
     */
    public void setMoreData(Boolean moreData) {
        this.moreData = moreData;
    }


    /**
     * Gets the pagingToken value for this CompletedTrackDetail.
     * 
     * @return pagingToken   * Value that must be passed in a TrackNotification request to
     * retrieve the next set of packages (when MoreDataAvailable = true).
     */
    public String getPagingToken() {
        return pagingToken;
    }


    /**
     * Sets the pagingToken value for this CompletedTrackDetail.
     * 
     * @param pagingToken   * Value that must be passed in a TrackNotification request to
     * retrieve the next set of packages (when MoreDataAvailable = true).
     */
    public void setPagingToken(String pagingToken) {
        this.pagingToken = pagingToken;
    }


    /**
     * Gets the trackDetailsCount value for this CompletedTrackDetail.
     * 
     * @return trackDetailsCount   * Identifies the total number of available track details across
     * all pages.
     */
    public org.apache.axis.types.NonNegativeInteger getTrackDetailsCount() {
        return trackDetailsCount;
    }


    /**
     * Sets the trackDetailsCount value for this CompletedTrackDetail.
     * 
     * @param trackDetailsCount   * Identifies the total number of available track details across
     * all pages.
     */
    public void setTrackDetailsCount(org.apache.axis.types.NonNegativeInteger trackDetailsCount) {
        this.trackDetailsCount = trackDetailsCount;
    }


    /**
     * Gets the trackDetails value for this CompletedTrackDetail.
     * 
     * @return trackDetails   * Contains detailed tracking information for the requested packages(s).
     */
    public com.fedex.track.stub.TrackDetail[] getTrackDetails() {
        return trackDetails;
    }


    /**
     * Sets the trackDetails value for this CompletedTrackDetail.
     * 
     * @param trackDetails   * Contains detailed tracking information for the requested packages(s).
     */
    public void setTrackDetails(com.fedex.track.stub.TrackDetail[] trackDetails) {
        this.trackDetails = trackDetails;
    }

    public com.fedex.track.stub.TrackDetail getTrackDetails(int i) {
        return this.trackDetails[i];
    }

    public void setTrackDetails(int i, com.fedex.track.stub.TrackDetail _value) {
        this.trackDetails[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedTrackDetail)) return false;
        CompletedTrackDetail other = (CompletedTrackDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.duplicateWaybill==null && other.getDuplicateWaybill()==null) || 
             (this.duplicateWaybill!=null &&
              this.duplicateWaybill.equals(other.getDuplicateWaybill()))) &&
            ((this.moreData==null && other.getMoreData()==null) || 
             (this.moreData!=null &&
              this.moreData.equals(other.getMoreData()))) &&
            ((this.pagingToken==null && other.getPagingToken()==null) || 
             (this.pagingToken!=null &&
              this.pagingToken.equals(other.getPagingToken()))) &&
            ((this.trackDetailsCount==null && other.getTrackDetailsCount()==null) || 
             (this.trackDetailsCount!=null &&
              this.trackDetailsCount.equals(other.getTrackDetailsCount()))) &&
            ((this.trackDetails==null && other.getTrackDetails()==null) || 
             (this.trackDetails!=null &&
              java.util.Arrays.equals(this.trackDetails, other.getTrackDetails())));
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
        if (getHighestSeverity() != null) {
            _hashCode += getHighestSeverity().hashCode();
        }
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDuplicateWaybill() != null) {
            _hashCode += getDuplicateWaybill().hashCode();
        }
        if (getMoreData() != null) {
            _hashCode += getMoreData().hashCode();
        }
        if (getPagingToken() != null) {
            _hashCode += getPagingToken().hashCode();
        }
        if (getTrackDetailsCount() != null) {
            _hashCode += getTrackDetailsCount().hashCode();
        }
        if (getTrackDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTrackDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CompletedTrackDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CompletedTrackDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NotificationSeverityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateWaybill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "DuplicateWaybill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "MoreData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagingToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PagingToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackDetailsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDetailsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDetail"));
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
