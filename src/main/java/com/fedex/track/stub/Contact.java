/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * The descriptive data for a point-of-contact person.
 */
public class Contact  implements java.io.Serializable {
    /* Identifies the contact person's name. */
    private String personName;

    /* Identifies the contact person's title. */
    private String title;

    /* Identifies the company this contact is associated with. */
    private String companyName;

    /* Identifies the phone number associated with this contact. */
    private String phoneNumber;

    /* Identifies the phone extension associated with this contact. */
    private String phoneExtension;

    /* Identifies a toll free number, if any, associated with this
     * contact. */
    private String tollFreePhoneNumber;

    /* Identifies the pager number associated with this contact. */
    private String pagerNumber;

    /* Identifies the fax number associated with this contact. */
    private String faxNumber;

    /* Identifies the email address associated with this contact. */
    private String EMailAddress;

    public Contact() {
    }

    public Contact(
           String personName,
           String title,
           String companyName,
           String phoneNumber,
           String phoneExtension,
           String tollFreePhoneNumber,
           String pagerNumber,
           String faxNumber,
           String EMailAddress) {
           this.personName = personName;
           this.title = title;
           this.companyName = companyName;
           this.phoneNumber = phoneNumber;
           this.phoneExtension = phoneExtension;
           this.tollFreePhoneNumber = tollFreePhoneNumber;
           this.pagerNumber = pagerNumber;
           this.faxNumber = faxNumber;
           this.EMailAddress = EMailAddress;
    }


    /**
     * Gets the personName value for this Contact.
     * 
     * @return personName   * Identifies the contact person's name.
     */
    public String getPersonName() {
        return personName;
    }


    /**
     * Sets the personName value for this Contact.
     * 
     * @param personName   * Identifies the contact person's name.
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }


    /**
     * Gets the title value for this Contact.
     * 
     * @return title   * Identifies the contact person's title.
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Contact.
     * 
     * @param title   * Identifies the contact person's title.
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the companyName value for this Contact.
     * 
     * @return companyName   * Identifies the company this contact is associated with.
     */
    public String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Contact.
     * 
     * @param companyName   * Identifies the company this contact is associated with.
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the phoneNumber value for this Contact.
     * 
     * @return phoneNumber   * Identifies the phone number associated with this contact.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this Contact.
     * 
     * @param phoneNumber   * Identifies the phone number associated with this contact.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the phoneExtension value for this Contact.
     * 
     * @return phoneExtension   * Identifies the phone extension associated with this contact.
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }


    /**
     * Sets the phoneExtension value for this Contact.
     * 
     * @param phoneExtension   * Identifies the phone extension associated with this contact.
     */
    public void setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }


    /**
     * Gets the tollFreePhoneNumber value for this Contact.
     * 
     * @return tollFreePhoneNumber   * Identifies a toll free number, if any, associated with this
     * contact.
     */
    public String getTollFreePhoneNumber() {
        return tollFreePhoneNumber;
    }


    /**
     * Sets the tollFreePhoneNumber value for this Contact.
     * 
     * @param tollFreePhoneNumber   * Identifies a toll free number, if any, associated with this
     * contact.
     */
    public void setTollFreePhoneNumber(String tollFreePhoneNumber) {
        this.tollFreePhoneNumber = tollFreePhoneNumber;
    }


    /**
     * Gets the pagerNumber value for this Contact.
     * 
     * @return pagerNumber   * Identifies the pager number associated with this contact.
     */
    public String getPagerNumber() {
        return pagerNumber;
    }


    /**
     * Sets the pagerNumber value for this Contact.
     * 
     * @param pagerNumber   * Identifies the pager number associated with this contact.
     */
    public void setPagerNumber(String pagerNumber) {
        this.pagerNumber = pagerNumber;
    }


    /**
     * Gets the faxNumber value for this Contact.
     * 
     * @return faxNumber   * Identifies the fax number associated with this contact.
     */
    public String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this Contact.
     * 
     * @param faxNumber   * Identifies the fax number associated with this contact.
     */
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the EMailAddress value for this Contact.
     * 
     * @return EMailAddress   * Identifies the email address associated with this contact.
     */
    public String getEMailAddress() {
        return EMailAddress;
    }


    /**
     * Sets the EMailAddress value for this Contact.
     * 
     * @param EMailAddress   * Identifies the email address associated with this contact.
     */
    public void setEMailAddress(String EMailAddress) {
        this.EMailAddress = EMailAddress;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.personName==null && other.getPersonName()==null) || 
             (this.personName!=null &&
              this.personName.equals(other.getPersonName()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.phoneExtension==null && other.getPhoneExtension()==null) || 
             (this.phoneExtension!=null &&
              this.phoneExtension.equals(other.getPhoneExtension()))) &&
            ((this.tollFreePhoneNumber==null && other.getTollFreePhoneNumber()==null) || 
             (this.tollFreePhoneNumber!=null &&
              this.tollFreePhoneNumber.equals(other.getTollFreePhoneNumber()))) &&
            ((this.pagerNumber==null && other.getPagerNumber()==null) || 
             (this.pagerNumber!=null &&
              this.pagerNumber.equals(other.getPagerNumber()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.EMailAddress==null && other.getEMailAddress()==null) || 
             (this.EMailAddress!=null &&
              this.EMailAddress.equals(other.getEMailAddress())));
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
        if (getPersonName() != null) {
            _hashCode += getPersonName().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getPhoneExtension() != null) {
            _hashCode += getPhoneExtension().hashCode();
        }
        if (getTollFreePhoneNumber() != null) {
            _hashCode += getTollFreePhoneNumber().hashCode();
        }
        if (getPagerNumber() != null) {
            _hashCode += getPagerNumber().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getEMailAddress() != null) {
            _hashCode += getEMailAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PersonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PhoneExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollFreePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TollFreePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PagerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "FaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailAddress"));
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
