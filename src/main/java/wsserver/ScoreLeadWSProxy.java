package wsserver;

import java.rmi.RemoteException;

import model.LeadScore;

public class ScoreLeadWSProxy implements wsserver.ScoreLeadWS {
  private String _endpoint = null;
  private wsserver.ScoreLeadWS scoreLeadWS = null;
  
  public ScoreLeadWSProxy() {
    _initScoreLeadWSProxy();
  }
  
  public ScoreLeadWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initScoreLeadWSProxy();
  }
  
  private void _initScoreLeadWSProxy() {
    try {
      scoreLeadWS = (new wsserver.ScoreLeadWSServiceLocator()).getScoreLeadWS();
      if (scoreLeadWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)scoreLeadWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)scoreLeadWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (scoreLeadWS != null)
      ((javax.xml.rpc.Stub)scoreLeadWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public wsserver.ScoreLeadWS getScoreLeadWS() {
    if (scoreLeadWS == null)
      _initScoreLeadWSProxy();
    return scoreLeadWS;
  }

@Override
public LeadScore scoreLead(String filePath, byte[] fileBinary)
		throws RemoteException {
	// TODO Auto-generated method stub
	
	return scoreLeadWS.scoreLead(filePath, fileBinary);
}
  
  
}