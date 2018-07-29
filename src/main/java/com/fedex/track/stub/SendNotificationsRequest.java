/**
 * SendNotificationsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class SendNotificationsRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.track.stub.WebAuthenticationDetail webAuthenticationDetail;

    /* Descriptive data identifying the client submitting the transaction. */
    private com.fedex.track.stub.ClientDetail clientDetail;

    /* Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations */
    private com.fedex.track.stub.TransactionDetail transactionDetail;

    private com.fedex.track.stub.VersionId version;

    /* The tracking number to which the notifications will be triggered
     * from. */
    private String trackingNumber;

    /* Indicates whether to return tracking information for all associated
     * packages. */
    private Boolean multiPiece;

    /* When the MoreDataAvailable field is true in a TrackNotificationReply
     * the PagingToken must be sent in the subsequent TrackNotificationRequest
     * to retrieve the next page of data. */
    private String pagingToken;

    /* Use this field when your original request informs you that
     * there are duplicates of this tracking number. If you get duplicates
     * you will also receive some information about each of the duplicate
     * tracking numbers to enable you to chose one and resend that number
     * along with the TrackingNumberUniqueId to get notifications for that
     * tracking number. */
    private String trackingNumberUniqueId;

    /* To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates. */
    private java.util.Date shipDateRangeBegin;

    /* To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates. */
    private java.util.Date shipDateRangeEnd;

    /* Included in the email notification identifying the requester
     * of this notification. */
    private String senderEMailAddress;

    /* Included in the email notification identifying the requester
     * of this notification. */
    private String senderContactName;

    /* Who to send the email notifications to and for which events.
     * The notificationRecipientType and NotifyOnShipment fields are not
     * used in this request. */
    private com.fedex.track.stub.EMailNotificationDetail notificationDetail;

    public SendNotificationsRequest() {
    }

    public SendNotificationsRequest(
           com.fedex.track.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.track.stub.ClientDetail clientDetail,
           com.fedex.track.stub.TransactionDetail transactionDetail,
           com.fedex.track.stub.VersionId version,
           String trackingNumber,
           Boolean multiPiece,
           String pagingToken,
           String trackingNumberUniqueId,
           java.util.Date shipDateRangeBegin,
           java.util.Date shipDateRangeEnd,
           String senderEMailAddress,
           String senderContactName,
           com.fedex.track.stub.EMailNotificationDetail notificationDetail) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.trackingNumber = trackingNumber;
           this.multiPiece = multiPiece;
           this.pagingToken = pagingToken;
           this.trackingNumberUniqueId = trackingNumberUniqueId;
           this.shipDateRangeBegin = shipDateRangeBegin;
           this.shipDateRangeEnd = shipDateRangeEnd;
           this.senderEMailAddress = senderEMailAddress;
           this.senderContactName = senderContactName;
           this.notificationDetail = notificationDetail;
    }


    /**
     * Gets the webAuthenticationDetail value for this SendNotificationsRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.track.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this SendNotificationsRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.track.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this SendNotificationsRequest.
     * 
     * @return clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public com.fedex.track.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this SendNotificationsRequest.
     * 
     * @param clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public void setClientDetail(com.fedex.track.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this SendNotificationsRequest.
     * 
     * @return transactionDetail   * Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations
     */
    public com.fedex.track.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this SendNotificationsRequest.
     * 
     * @param transactionDetail   * Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations
     */
    public void setTransactionDetail(com.fedex.track.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this SendNotificationsRequest.
     * 
     * @return version
     */
    public com.fedex.track.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SendNotificationsRequest.
     * 
     * @param version
     */
    public void setVersion(com.fedex.track.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the trackingNumber value for this SendNotificationsRequest.
     * 
     * @return trackingNumber   * The tracking number to which the notifications will be triggered
     * from.
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this SendNotificationsRequest.
     * 
     * @param trackingNumber   * The tracking number to which the notifications will be triggered
     * from.
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the multiPiece value for this SendNotificationsRequest.
     * 
     * @return multiPiece   * Indicates whether to return tracking information for all associated
     * packages.
     */
    public Boolean getMultiPiece() {
        return multiPiece;
    }


    /**
     * Sets the multiPiece value for this SendNotificationsRequest.
     * 
     * @param multiPiece   * Indicates whether to return tracking information for all associated
     * packages.
     */
    public void setMultiPiece(Boolean multiPiece) {
        this.multiPiece = multiPiece;
    }


    /**
     * Gets the pagingToken value for this SendNotificationsRequest.
     * 
     * @return pagingToken   * When the MoreDataAvailable field is true in a TrackNotificationReply
     * the PagingToken must be sent in the subsequent TrackNotificationRequest
     * to retrieve the next page of data.
     */
    public String getPagingToken() {
        return pagingToken;
    }


    /**
     * Sets the pagingToken value for this SendNotificationsRequest.
     * 
     * @param pagingToken   * When the MoreDataAvailable field is true in a TrackNotificationReply
     * the PagingToken must be sent in the subsequent TrackNotificationRequest
     * to retrieve the next page of data.
     */
    public void setPagingToken(String pagingToken) {
        this.pagingToken = pagingToken;
    }


    /**
     * Gets the trackingNumberUniqueId value for this SendNotificationsRequest.
     * 
     * @return trackingNumberUniqueId   * Use this field when your original request informs you that
     * there are duplicates of this tracking number. If you get duplicates
     * you will also receive some information about each of the duplicate
     * tracking numbers to enable you to chose one and resend that number
     * along with the TrackingNumberUniqueId to get notifications for that
     * tracking number.
     */
    public String getTrackingNumberUniqueId() {
        return trackingNumberUniqueId;
    }


    /**
     * Sets the trackingNumberUniqueId value for this SendNotificationsRequest.
     * 
     * @param trackingNumberUniqueId   * Use this field when your original request informs you that
     * there are duplicates of this tracking number. If you get duplicates
     * you will also receive some information about each of the duplicate
     * tracking numbers to enable you to chose one and resend that number
     * along with the TrackingNumberUniqueId to get notifications for that
     * tracking number.
     */
    public void setTrackingNumberUniqueId(String trackingNumberUniqueId) {
        this.trackingNumberUniqueId = trackingNumberUniqueId;
    }


    /**
     * Gets the shipDateRangeBegin value for this SendNotificationsRequest.
     * 
     * @return shipDateRangeBegin   * To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates.
     */
    public java.util.Date getShipDateRangeBegin() {
        return shipDateRangeBegin;
    }


    /**
     * Sets the shipDateRangeBegin value for this SendNotificationsRequest.
     * 
     * @param shipDateRangeBegin   * To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates.
     */
    public void setShipDateRangeBegin(java.util.Date shipDateRangeBegin) {
        this.shipDateRangeBegin = shipDateRangeBegin;
    }


    /**
     * Gets the shipDateRangeEnd value for this SendNotificationsRequest.
     * 
     * @return shipDateRangeEnd   * To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates.
     */
    public java.util.Date getShipDateRangeEnd() {
        return shipDateRangeEnd;
    }


    /**
     * Sets the shipDateRangeEnd value for this SendNotificationsRequest.
     * 
     * @param shipDateRangeEnd   * To narrow the search to a period in time the ShipDateRangeBegin
     * and ShipDateRangeEnd can be used to help eliminate duplicates.
     */
    public void setShipDateRangeEnd(java.util.Date shipDateRangeEnd) {
        this.shipDateRangeEnd = shipDateRangeEnd;
    }


    /**
     * Gets the senderEMailAddress value for this SendNotificationsRequest.
     * 
     * @return senderEMailAddress   * Included in the email notification identifying the requester
     * of this notification.
     */
    public String getSenderEMailAddress() {
        return senderEMailAddress;
    }


    /**
     * Sets the senderEMailAddress value for this SendNotificationsRequest.
     * 
     * @param senderEMailAddress   * Included in the email notification identifying the requester
     * of this notification.
     */
    public void setSenderEMailAddress(String senderEMailAddress) {
        this.senderEMailAddress = senderEMailAddress;
    }


    /**
     * Gets the senderContactName value for this SendNotificationsRequest.
     * 
     * @return senderContactName   * Included in the email notification identifying the requester
     * of this notification.
     */
    public String getSenderContactName() {
        return senderContactName;
    }


    /**
     * Sets the senderContactName value for this SendNotificationsRequest.
     * 
     * @param senderContactName   * Included in the email notification identifying the requester
     * of this notification.
     */
    public void setSenderContactName(String senderContactName) {
        this.senderContactName = senderContactName;
    }


    /**
     * Gets the notificationDetail value for this SendNotificationsRequest.
     * 
     * @return notificationDetail   * Who to send the email notifications to and for which events.
     * The notificationRecipientType and NotifyOnShipment fields are not
     * used in this request.
     */
    public com.fedex.track.stub.EMailNotificationDetail getNotificationDetail() {
        return notificationDetail;
    }


    /**
     * Sets the notificationDetail value for this SendNotificationsRequest.
     * 
     * @param notificationDetail   * Who to send the email notifications to and for which events.
     * The notificationRecipientType and NotifyOnShipment fields are not
     * used in this request.
     */
    public void setNotificationDetail(com.fedex.track.stub.EMailNotificationDetail notificationDetail) {
        this.notificationDetail = notificationDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SendNotificationsRequest)) return false;
        SendNotificationsRequest other = (SendNotificationsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.multiPiece==null && other.getMultiPiece()==null) || 
             (this.multiPiece!=null &&
              this.multiPiece.equals(other.getMultiPiece()))) &&
            ((this.pagingToken==null && other.getPagingToken()==null) || 
             (this.pagingToken!=null &&
              this.pagingToken.equals(other.getPagingToken()))) &&
            ((this.trackingNumberUniqueId==null && other.getTrackingNumberUniqueId()==null) || 
             (this.trackingNumberUniqueId!=null &&
              this.trackingNumberUniqueId.equals(other.getTrackingNumberUniqueId()))) &&
            ((this.shipDateRangeBegin==null && other.getShipDateRangeBegin()==null) || 
             (this.shipDateRangeBegin!=null &&
              this.shipDateRangeBegin.equals(other.getShipDateRangeBegin()))) &&
            ((this.shipDateRangeEnd==null && other.getShipDateRangeEnd()==null) || 
             (this.shipDateRangeEnd!=null &&
              this.shipDateRangeEnd.equals(other.getShipDateRangeEnd()))) &&
            ((this.senderEMailAddress==null && other.getSenderEMailAddress()==null) || 
             (this.senderEMailAddress!=null &&
              this.senderEMailAddress.equals(other.getSenderEMailAddress()))) &&
            ((this.senderContactName==null && other.getSenderContactName()==null) || 
             (this.senderContactName!=null &&
              this.senderContactName.equals(other.getSenderContactName()))) &&
            ((this.notificationDetail==null && other.getNotificationDetail()==null) || 
             (this.notificationDetail!=null &&
              this.notificationDetail.equals(other.getNotificationDetail())));
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
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getMultiPiece() != null) {
            _hashCode += getMultiPiece().hashCode();
        }
        if (getPagingToken() != null) {
            _hashCode += getPagingToken().hashCode();
        }
        if (getTrackingNumberUniqueId() != null) {
            _hashCode += getTrackingNumberUniqueId().hashCode();
        }
        if (getShipDateRangeBegin() != null) {
            _hashCode += getShipDateRangeBegin().hashCode();
        }
        if (getShipDateRangeEnd() != null) {
            _hashCode += getShipDateRangeEnd().hashCode();
        }
        if (getSenderEMailAddress() != null) {
            _hashCode += getSenderEMailAddress().hashCode();
        }
        if (getSenderContactName() != null) {
            _hashCode += getSenderContactName().hashCode();
        }
        if (getNotificationDetail() != null) {
            _hashCode += getNotificationDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendNotificationsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SendNotificationsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ClientDetail"));
        elemField.setNillable(false);
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
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiPiece");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "MultiPiece"));
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
        elemField.setFieldName("trackingNumberUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackingNumberUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDateRangeBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ShipDateRangeBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDateRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ShipDateRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderEMailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SenderEMailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SenderContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NotificationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailNotificationDetail"));
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
