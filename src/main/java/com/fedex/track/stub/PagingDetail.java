/**
 * PagingDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class PagingDetail  implements java.io.Serializable {
    /* When the MoreData field = true in a TrackReply the PagingToken
     * must be sent in the subsequent TrackRequest to retrieve the next page
     * of data. */
    private String pagingToken;

    /* Specifies the number of results to display per page when the
     * there is more than one page in the subsequent TrackReply. */
    private org.apache.axis.types.NonNegativeInteger numberOfResultsPerPage;

    public PagingDetail() {
    }

    public PagingDetail(
           String pagingToken,
           org.apache.axis.types.NonNegativeInteger numberOfResultsPerPage) {
           this.pagingToken = pagingToken;
           this.numberOfResultsPerPage = numberOfResultsPerPage;
    }


    /**
     * Gets the pagingToken value for this PagingDetail.
     * 
     * @return pagingToken   * When the MoreData field = true in a TrackReply the PagingToken
     * must be sent in the subsequent TrackRequest to retrieve the next page
     * of data.
     */
    public String getPagingToken() {
        return pagingToken;
    }


    /**
     * Sets the pagingToken value for this PagingDetail.
     * 
     * @param pagingToken   * When the MoreData field = true in a TrackReply the PagingToken
     * must be sent in the subsequent TrackRequest to retrieve the next page
     * of data.
     */
    public void setPagingToken(String pagingToken) {
        this.pagingToken = pagingToken;
    }


    /**
     * Gets the numberOfResultsPerPage value for this PagingDetail.
     * 
     * @return numberOfResultsPerPage   * Specifies the number of results to display per page when the
     * there is more than one page in the subsequent TrackReply.
     */
    public org.apache.axis.types.NonNegativeInteger getNumberOfResultsPerPage() {
        return numberOfResultsPerPage;
    }


    /**
     * Sets the numberOfResultsPerPage value for this PagingDetail.
     * 
     * @param numberOfResultsPerPage   * Specifies the number of results to display per page when the
     * there is more than one page in the subsequent TrackReply.
     */
    public void setNumberOfResultsPerPage(org.apache.axis.types.NonNegativeInteger numberOfResultsPerPage) {
        this.numberOfResultsPerPage = numberOfResultsPerPage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PagingDetail)) return false;
        PagingDetail other = (PagingDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pagingToken==null && other.getPagingToken()==null) || 
             (this.pagingToken!=null &&
              this.pagingToken.equals(other.getPagingToken()))) &&
            ((this.numberOfResultsPerPage==null && other.getNumberOfResultsPerPage()==null) || 
             (this.numberOfResultsPerPage!=null &&
              this.numberOfResultsPerPage.equals(other.getNumberOfResultsPerPage())));
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
        if (getPagingToken() != null) {
            _hashCode += getPagingToken().hashCode();
        }
        if (getNumberOfResultsPerPage() != null) {
            _hashCode += getNumberOfResultsPerPage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagingDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PagingDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagingToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PagingToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfResultsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NumberOfResultsPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
