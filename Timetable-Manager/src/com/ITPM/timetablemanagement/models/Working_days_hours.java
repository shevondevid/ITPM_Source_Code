/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.models;

/**
 *
 * @author Tiran Harsha
 */
public class Working_days_hours {
    private String id;
    private String numOfDays;
    private String days;
    private String hour;
    private String min;
    private String timeSlot;
    private String Stime;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the numOfDays
     */
    public String getNumOfDays() {
        return numOfDays;
    }

    /**
     * @return the days
     */
    public String getDays() {
        return days;
    }

    /**
     * @return the hour
     */
    public String getHour() {
        return hour;
    }

    /**
     * @return the min
     */
    public String getMin() {
        return min;
    }

    /**
     * @return the timeSlot
     */
    public String getTimeSlot() {
        return timeSlot;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param numOfDays the numOfDays to set
     */
    public void setNumOfDays(String numOfDays) {
        this.numOfDays = numOfDays;
    }

    /**
     * @param days the days to set
     */
    public void setDays(String days) {
        this.days = days;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * @param min the min to set
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * @param timeSlot the timeSlot to set
     */
    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    /**
     * @return the Stime
     */
    public String getStime() {
        return Stime;
    }

    /**
     * @param Stime the Stime to set
     */
    public void setStime(String Stime) {
        this.Stime = Stime;
    }
    
    
    
}
