/**
 * TrackServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.fedex.track.stub.TrackPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveSignatureProofOfDeliveryLetter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryLetterRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryLetterRequest"), com.fedex.track.stub.SignatureProofOfDeliveryLetterRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryLetterReply"));
        oper.setReturnClass(com.fedex.track.stub.SignatureProofOfDeliveryLetterReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryLetterReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("track");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackRequest"), com.fedex.track.stub.TrackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReply"));
        oper.setReturnClass(com.fedex.track.stub.TrackReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendSignatureProofOfDeliveryFax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxRequest"), com.fedex.track.stub.SignatureProofOfDeliveryFaxRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxReply"));
        oper.setReturnClass(com.fedex.track.stub.SignatureProofOfDeliveryFaxReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendNotifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SendNotificationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SendNotificationsRequest"), com.fedex.track.stub.SendNotificationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SendNotificationsReply"));
        oper.setReturnClass(com.fedex.track.stub.SendNotificationsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SendNotificationsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public TrackServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TrackServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TrackServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Address");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AppointmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.AppointmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AppointmentTimeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.AppointmentTimeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AppointmentWindowType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.AppointmentWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ArrivalLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.ArrivalLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "AvailableImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.AvailableImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CompletedTrackDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.CompletedTrackDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Contact");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CustomerExceptionRequestDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.CustomerExceptionRequestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "DeliveryOptionEligibilityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.DeliveryOptionEligibilityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "DeliveryOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.DeliveryOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Distance");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Distance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "DistanceUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.DistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EligibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.EligibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.EMailNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailNotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.EMailNotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailNotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.EMailNotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailNotificationRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.EMailNotificationRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Localization");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "LocalTimeRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.LocalTimeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Measure");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Money");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Notification");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "OfficeOrderDeliveryMethodType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.OfficeOrderDeliveryMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "OperatingCompanyType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.OperatingCompanyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PagingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.PagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PieceCountLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.PieceCountLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "PieceCountVerificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.PieceCountVerificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "QualifiedTrackingNumber");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.QualifiedTrackingNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SendNotificationsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SendNotificationsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SendNotificationsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SendNotificationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureImageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SignatureImageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SignatureProofOfDeliveryFaxReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SignatureProofOfDeliveryFaxRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SignatureProofOfDeliveryImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryLetterReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SignatureProofOfDeliveryLetterReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryLetterRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SignatureProofOfDeliveryLetterRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SpecialInstructionsStatusCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SpecialInstructionsStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SpecialInstructionStatusDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.SpecialInstructionStatusDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StringBarcode");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.StringBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "StringBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.StringBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackAdvanceNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackAdvanceNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackAdvanceNotificationStatusType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackAdvanceNotificationStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackChargeDetailType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackChargeDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDeliveryLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackDeliveryLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDeliveryOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackDeliveryOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDetailAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackDetailAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackEvent");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackNotificationPackage");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackNotificationPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackNotificationRecipientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackNotificationRecipientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackOtherIdentifierDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackOtherIdentifierDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackPackageIdentifier");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackPackageIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackPaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackPossessionStatusType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackPossessionStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReconciliation");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackReconciliation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackRequestProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackRequestProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReturnDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackReturnDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReturnLabelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackReturnLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackReturnMovementStatusType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackReturnMovementStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSelectionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackSelectionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackServiceDescriptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackServiceDescriptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSpecialHandling");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackSpecialHandling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSpecialHandlingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackSpecialHandlingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSpecialInstruction");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackSpecialInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSplitShipmentPart");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackSplitShipmentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackStatusAncillaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackStatusAncillaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackStatusDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TrackStatusDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Weight");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.track.stub.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fedex.track.stub.SignatureProofOfDeliveryLetterReply retrieveSignatureProofOfDeliveryLetter(com.fedex.track.stub.SignatureProofOfDeliveryLetterRequest signatureProofOfDeliveryLetterRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v9/retrieveSignatureProofOfDeliveryLetter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveSignatureProofOfDeliveryLetter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {signatureProofOfDeliveryLetterRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.track.stub.SignatureProofOfDeliveryLetterReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.track.stub.SignatureProofOfDeliveryLetterReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.track.stub.SignatureProofOfDeliveryLetterReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.track.stub.TrackReply track(com.fedex.track.stub.TrackRequest trackRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v9/track");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "track"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {trackRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.track.stub.TrackReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.track.stub.TrackReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.track.stub.TrackReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.track.stub.SignatureProofOfDeliveryFaxReply sendSignatureProofOfDeliveryFax(com.fedex.track.stub.SignatureProofOfDeliveryFaxRequest signatureProofOfDeliveryFaxRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v9/sendSignatureProofOfDeliveryFax");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendSignatureProofOfDeliveryFax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {signatureProofOfDeliveryFaxRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.track.stub.SignatureProofOfDeliveryFaxReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.track.stub.SignatureProofOfDeliveryFaxReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.track.stub.SignatureProofOfDeliveryFaxReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.track.stub.SendNotificationsReply sendNotifications(com.fedex.track.stub.SendNotificationsRequest sendNotificationsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v9/sendNotifications");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendNotifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sendNotificationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.track.stub.SendNotificationsReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.track.stub.SendNotificationsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.track.stub.SendNotificationsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
