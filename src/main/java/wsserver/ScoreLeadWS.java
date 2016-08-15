/**
 * ScoreLeadWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsserver;

public interface ScoreLeadWS extends java.rmi.Remote {
    public model.LeadScore scoreLead(java.lang.String filePath, byte[] fileBinary) throws java.rmi.RemoteException;
}
