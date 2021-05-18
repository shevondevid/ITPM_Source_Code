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
public class ParallelSession {
    
    private int id;
    private String yNs;
    private String session;
    private String sessionID;

    public ParallelSession(){
        
    }
    public ParallelSession(int ID, String yNs, String session, String sessionID){
        this.id = ID;
        this.yNs = yNs;
        this.session = session;
        this.sessionID = sessionID;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getYnS()
    {
        return yNs;
    }
    
    public String getPSession()
    {
        return session;
    }

    /**
     * @return the sessionID
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * @param sessionID the sessionID to set
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * @return the yNs
     */
    public String getyNs() {
        return yNs;
    }

    /**
     * @return the session
     */
    public String getSession() {
        return session;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param yNs the yNs to set
     */
    public void setyNs(String yNs) {
        this.yNs = yNs;
    }

    /**
     * @param session the session to set
     */
    public void setSession(String session) {
        this.session = session;
    }
}
