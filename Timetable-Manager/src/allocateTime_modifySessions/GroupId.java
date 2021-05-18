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
public class GroupId {
    
    private int id;
    private String gId;
    private String day;
    private String time_from;
    private String time_to;
    
    public GroupId(){
        
    }
    public GroupId(int ID, String gId, String day,String time_from, String time_to){
        this.id = ID;
        this.gId = gId;
        this.day = day;
        this.time_from = time_from;
        this.time_to = time_to;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getGid()
    {
        return gId;
    }
    
    public String getday()
    {
        return day;
    }
    
    public String gettime_from()
    {
        return time_from;
    }
    
    public String gettime_to()
    {
        return time_to;
    }

    /**
     * @return the gId
     */
    public String getgId() {
        return gId;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @return the time_from
     */
    public String getTime_from() {
        return time_from;
    }

    /**
     * @return the time_to
     */
    public String getTime_to() {
        return time_to;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param gId the gId to set
     */
    public void setgId(String gId) {
        this.gId = gId;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @param time_from the time_from to set
     */
    public void setTime_from(String time_from) {
        this.time_from = time_from;
    }

    /**
     * @param time_to the time_to to set
     */
    public void setTime_to(String time_to) {
        this.time_to = time_to;
    }
    
}
