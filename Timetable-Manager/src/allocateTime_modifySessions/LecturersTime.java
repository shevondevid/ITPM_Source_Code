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
public class LecturersTime {
    
    private int id;
    private String lecName;
    private int lecId;
    private String day;
    private String time_from;
    private String time_to;
    
    public LecturersTime(){
        
    }
    public LecturersTime(int ID, String lecName,int lecId, String day,String time_from, String time_to){
        this.id = ID;
        this.lecName = lecName;
        this.lecId = lecId;
        this.day = day;
        this.time_from = time_from;
        this.time_to = time_to;
    }
    public int getId()
    {
        return id;
    }
    
    public String getLecName()
    {
        return lecName;
    }
    public int getLecId()
    {
        return lecId;
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
     * @param lecName the lecName to set
     */
    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    /**
     * @param lecId the lecId to set
     */
    public void setLecId(int lecId) {
        this.lecId = lecId;
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
