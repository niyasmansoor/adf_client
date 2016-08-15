/**
 * ScoreLeadWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsserver;

public class ScoreLeadWSServiceLocator extends org.apache.axis.client.Service implements wsserver.ScoreLeadWSService {

    public ScoreLeadWSServiceLocator() {
    }


    public ScoreLeadWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ScoreLeadWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ScoreLeadWS
    private java.lang.String ScoreLeadWS_address = "http://localhost:8080/adfserver/services/ScoreLeadWS";

    public java.lang.String getScoreLeadWSAddress() {
        return ScoreLeadWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ScoreLeadWSWSDDServiceName = "ScoreLeadWS";

    public java.lang.String getScoreLeadWSWSDDServiceName() {
        return ScoreLeadWSWSDDServiceName;
    }

    public void setScoreLeadWSWSDDServiceName(java.lang.String name) {
        ScoreLeadWSWSDDServiceName = name;
    }

    public wsserver.ScoreLeadWS getScoreLeadWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ScoreLeadWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getScoreLeadWS(endpoint);
    }

    public wsserver.ScoreLeadWS getScoreLeadWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            wsserver.ScoreLeadWSSoapBindingStub _stub = new wsserver.ScoreLeadWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getScoreLeadWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setScoreLeadWSEndpointAddress(java.lang.String address) {
        ScoreLeadWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (wsserver.ScoreLeadWS.class.isAssignableFrom(serviceEndpointInterface)) {
                wsserver.ScoreLeadWSSoapBindingStub _stub = new wsserver.ScoreLeadWSSoapBindingStub(new java.net.URL(ScoreLeadWS_address), this);
                _stub.setPortName(getScoreLeadWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ScoreLeadWS".equals(inputPortName)) {
            return getScoreLeadWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wsserver", "ScoreLeadWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wsserver", "ScoreLeadWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ScoreLeadWS".equals(portName)) {
            setScoreLeadWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
