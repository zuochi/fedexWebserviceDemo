/**
 * SendNotificationsReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class SendNotificationsReply  implements java.io.Serializable {
    /* This contains the severity type of the most severe Notification
     * in the Notifications array. */
    private com.fedex.track.stub.NotificationSeverityType highestSeverity;

    /* Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply. */
    private com.fedex.track.stub.Notification[] notifications;

    /* Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data. */
    private com.fedex.track.stub.TransactionDetail transactionDetail;

    /* Contains the version of the reply being used. */
    private com.fedex.track.stub.VersionId version;

    /* True if duplicate packages (more than one package with the
     * same tracking number) have been found, the packages array contains
     * information about each duplicate. Use this information to determine
     * which of the tracking numbers is the one you need and resend your
     * request using the tracking number and TrackingNumberUniqueIdentifier
     * for that package. */
    private Boolean duplicateWaybill;

    /* True if additional packages remain to be retrieved. */
    private Boolean moreDataAvailable;

    /* Value that must be passed in a TrackNotification request to
     * retrieve the next set of packages (when MoreDataAvailable = true). */
    private String pagingToken;

    /* Information about the notifications that are available for
     * this tracking number. If there are duplicates the ship date and destination
     * address information is returned for determining which TrackingNumberUniqueIdentifier
     * to use on a subsequent request. */
    private com.fedex.track.stub.TrackNotificationPackage[] packages;

    public SendNotificationsReply() {
    }

    public SendNotificationsReply(
           com.fedex.track.stub.NotificationSeverityType highestSeverity,
           com.fedex.track.stub.Notification[] notifications,
           com.fedex.track.stub.TransactionDetail transactionDetail,
           com.fedex.track.stub.VersionId version,
           Boolean duplicateWaybill,
           Boolean moreDataAvailable,
           String pagingToken,
           com.fedex.track.stub.TrackNotificationPackage[] packages) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.duplicateWaybill = duplicateWaybill;
           this.moreDataAvailable = moreDataAvailable;
           this.pagingToken = pagingToken;
           this.packages = packages;
    }


    /**
     * Gets the highestSeverity value for this SendNotificationsReply.
     * 
     * @return highestSeverity   * This contains the severity type of the most severe Notification
     * in the Notifications array.
     */
    public com.fedex.track.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this SendNotificationsReply.
     * 
     * @param highestSeverity   * This contains the severity type of the most severe Notification
     * in the Notifications array.
     */
    public void setHighestSeverity(com.fedex.track.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this SendNotificationsReply.
     * 
     * @return notifications   * Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply.
     */
    public com.fedex.track.stub.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this SendNotificationsReply.
     * 
     * @param notifications   * Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply.
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
     * Gets the transactionDetail value for this SendNotificationsReply.
     * 
     * @return transactionDetail   * Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data.
     */
    public com.fedex.track.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this SendNotificationsReply.
     * 
     * @param transactionDetail   * Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data.
     */
    public void setTransactionDetail(com.fedex.track.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this SendNotificationsReply.
     * 
     * @return version   * Contains the version of the reply being used.
     */
    public com.fedex.track.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SendNotificationsReply.
     * 
     * @param version   * Contains the version of the reply being used.
     */
    public void setVersion(com.fedex.track.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the duplicateWaybill value for this SendNotificationsReply.
     * 
     * @return duplicateWaybill   * True if duplicate packages (more than one package with the
     * same tracking number) have been found, the packages array contains
     * information about each duplicate. Use this information to determine
     * which of the tracking numbers is the one you need and resend your
     * request using the tracking number and TrackingNumberUniqueIdentifier
     * for that package.
     */
    public Boolean getDuplicateWaybill() {
        return duplicateWaybill;
    }


    /**
     * Sets the duplicateWaybill value for this SendNotificationsReply.
     * 
     * @param duplicateWaybill   * True if duplicate packages (more than one package with the
     * same tracking number) have been found, the packages array contains
     * information about each duplicate. Use this information to determine
     * which of the tracking numbers is the one you need and resend your
     * request using the tracking number and TrackingNumberUniqueIdentifier
     * for that package.
     */
    public void setDuplicateWaybill(Boolean duplicateWaybill) {
        this.duplicateWaybill = duplicateWaybill;
    }


    /**
     * Gets the moreDataAvailable value for this SendNotificationsReply.
     * 
     * @return moreDataAvailable   * True if additional packages remain to be retrieved.
     */
    public Boolean getMoreDataAvailable() {
        return moreDataAvailable;
    }


    /**
     * Sets the moreDataAvailable value for this SendNotificationsReply.
     * 
     * @param moreDataAvailable   * True if additional packages remain to be retrieved.
     */
    public void setMoreDataAvailable(Boolean moreDataAvailable) {
        this.moreDataAvailable = moreDataAvailable;
    }


    /**
     * Gets the pagingToken value for this SendNotificationsReply.
     * 
     * @return pagingToken   * Value that must be passed in a TrackNotification request to
     * retrieve the next set of packages (when MoreDataAvailable = true).
     */
    public String getPagingToken() {
        return pagingToken;
    }


    /**
     * Sets the pagingToken value for this SendNotificationsReply.
     * 
     * @param pagingToken   * Value that must be passed in a TrackNotification request to
     * retrieve the next set of packages (when MoreDataAvailable = true).
     */
    public void setPagingToken(String pagingToken) {
        this.pagingToken = pagingToken;
    }


    /**
     * Gets the packages value for this SendNotificationsReply.
     * 
     * @return packages   * Information about the notifications that are available for
     * this tracking number. If there are duplicates the ship date and destination
     * address information is returned for determining which TrackingNumberUniqueIdentifier
     * to use on a subsequent request.
     */
    public com.fedex.track.stub.TrackNotificationPackage[] getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this SendNotificationsReply.
     * 
     * @param packages   * Information about the notifications that are available for
     * this tracking number. If there are duplicates the ship date and destination
     * address information is returned for determining which TrackingNumberUniqueIdentifier
     * to use on a subsequent request.
     */
    public void setPackages(com.fedex.track.stub.TrackNotificationPackage[] packages) {
        this.packages = packages;
    }

    public com.fedex.track.stub.TrackNotificationPackage getPackages(int i) {
        return this.packages[i];
    }

    public void setPackages(int i, com.fedex.track.stub.TrackNotificationPackage _value) {
        this.packages[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SendNotificationsReply)) return false;
        SendNotificationsReply other = (SendNotificationsReply) obj;
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
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.duplicateWaybill==null && other.getDuplicateWaybill()==null) || 
             (this.duplicateWaybill!=null &&
              this.duplicateWaybill.equals(other.getDuplicateWaybill()))) &&
            ((this.moreDataAvailable==null && other.getMoreDataAvailable()==null) || 
             (this.moreDataAvailable!=null &&
              this.moreDataAvailable.equals(other.getMoreDataAvailable()))) &&
            ((this.pagingToken==null && other.getPagingToken()==null) || 
             (this.pagingToken!=null &&
              this.pagingToken.equals(other.getPagingToken()))) &&
            ((this.packages==null && other.getPackages()==null) || 
             (this.packages!=null &&
              java.util.Arrays.equals(this.packages, other.getPackages())));
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
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDuplicateWaybill() != null) {
            _hashCode += getDuplicateWaybill().hashCode();
        }
        if (getMoreDataAvailable() != null) {
            _hashCode += getMoreDataAvailable().hashCode();
        }
        if (getPagingToken() != null) {
            _hashCode += getPagingToken().hashCode();
        }
        if (getPackages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackages());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPackages(), i);
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
        new org.apache.axis.description.TypeDesc(SendNotificationsReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SendNotificationsReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("duplicateWaybill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "DuplicateWaybill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreDataAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "MoreDataAvailable"));
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
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Packages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackNotificationPackage"));
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
