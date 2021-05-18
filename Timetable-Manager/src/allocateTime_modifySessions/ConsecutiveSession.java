/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allocateTime_modifySessions;

/**
 *
 * @author hvdil
 */
public class ConsecutiveSession {
    
    private int id;
    private String sGid;
    private String cSession;
    private String SessionID;

    public ConsecutiveSession(){
        
    }
    public ConsecutiveSession(int ID, String sGid, String cSession, String SessionID){
        this.id = ID;
        this.sGid = sGid;
        this.cSession = cSession;
        this.SessionID = SessionID;
    } 
    
    
    public int getId()
    {
        return id;
    }
    
    public String getSgid()
    {
        return sGid;
    }
    
    public String gettag()
    {
        return cSession;
    }

    /**
     * @return the SessionID
     */
    public String getSessionID() {
        return SessionID;
    }

    /**
     * @param SessionID the SessionID to set
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * @return the sGid
     */
    public String getsGid() {
        return sGid;
    }

    /**
     * @return the cSession
     */
    public String getcSession() {
        return cSession;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param sGid the sGid to set
     */
    public void setsGid(String sGid) {
        this.sGid = sGid;
    }

    /**
     * @param cSession the cSession to set
     */
    public void setcSession(String cSession) {
        this.cSession = cSession;
    }

}
