/**
 * TrackNotificationRecipientDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Options available for a tracking notification recipient.
 */
public class TrackNotificationRecipientDetail  implements java.io.Serializable {
    /* The types of email notifications available for this recipient. */
    private com.fedex.track.stub.EMailNotificationEventType[] notificationEventsAvailable;

    public TrackNotificationRecipientDetail() {
    }

    public TrackNotificationRecipientDetail(
           com.fedex.track.stub.EMailNotificationEventType[] notificationEventsAvailable) {
           this.notificationEventsAvailable = notificationEventsAvailable;
    }


    /**
     * Gets the notificationEventsAvailable value for this TrackNotificationRecipientDetail.
     * 
     * @return notificationEventsAvailable   * The types of email notifications available for this recipient.
     */
    public com.fedex.track.stub.EMailNotificationEventType[] getNotificationEventsAvailable() {
        return notificationEventsAvailable;
    }


    /**
     * Sets the notificationEventsAvailable value for this TrackNotificationRecipientDetail.
     * 
     * @param notificationEventsAvailable   * The types of email notifications available for this recipient.
     */
    public void setNotificationEventsAvailable(com.fedex.track.stub.EMailNotificationEventType[] notificationEventsAvailable) {
        this.notificationEventsAvailable = notificationEventsAvailable;
    }

    public com.fedex.track.stub.EMailNotificationEventType getNotificationEventsAvailable(int i) {
        return this.notificationEventsAvailable[i];
    }

    public void setNotificationEventsAvailable(int i, com.fedex.track.stub.EMailNotificationEventType _value) {
        this.notificationEventsAvailable[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackNotificationRecipientDetail)) return false;
        TrackNotificationRecipientDetail other = (TrackNotificationRecipientDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notificationEventsAvailable==null && other.getNotificationEventsAvailable()==null) || 
             (this.notificationEventsAvailable!=null &&
              java.util.Arrays.equals(this.notificationEventsAvailable, other.getNotificationEventsAvailable())));
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
        if (getNotificationEventsAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationEventsAvailable());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotificationEventsAvailable(), i);
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
        new org.apache.axis.description.TypeDesc(TrackNotificationRecipientDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackNotificationRecipientDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEventsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NotificationEventsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailNotificationEventType"));
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
