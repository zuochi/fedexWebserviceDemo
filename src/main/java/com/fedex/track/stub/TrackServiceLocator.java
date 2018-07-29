/**
 * TrackServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackServiceLocator extends org.apache.axis.client.Service implements com.fedex.track.stub.TrackService {

    public TrackServiceLocator() {
    }


    public TrackServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TrackServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TrackServicePort
    private String TrackServicePort_address = "https://wsbeta.fedex.com:443/web-services/track";

    public String getTrackServicePortAddress() {
        return TrackServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String TrackServicePortWSDDServiceName = "TrackServicePort";

    public String getTrackServicePortWSDDServiceName() {
        return TrackServicePortWSDDServiceName;
    }

    public void setTrackServicePortWSDDServiceName(String name) {
        TrackServicePortWSDDServiceName = name;
    }

    public com.fedex.track.stub.TrackPortType getTrackServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TrackServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTrackServicePort(endpoint);
    }

    public com.fedex.track.stub.TrackPortType getTrackServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fedex.track.stub.TrackServiceSoapBindingStub _stub = new com.fedex.track.stub.TrackServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTrackServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTrackServicePortEndpointAddress(String address) {
        TrackServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fedex.track.stub.TrackPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fedex.track.stub.TrackServiceSoapBindingStub _stub = new com.fedex.track.stub.TrackServiceSoapBindingStub(new java.net.URL(TrackServicePort_address), this);
                _stub.setPortName(getTrackServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("TrackServicePort".equals(inputPortName)) {
            return getTrackServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("TrackServicePort".equals(portName)) {
            setTrackServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
