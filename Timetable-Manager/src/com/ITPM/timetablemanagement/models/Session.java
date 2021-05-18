/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.models;

/**
 *
 * @author IT18216974
 */
public class Session {
    private int id;
    private String sub;
    private String subc;
    private String tag;
    private String duration;
    private int stu_count;
    private String groupID;
    private String subgroupID;
    private String[] lec;

    public Session() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sub
     */
    public String getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(String sub) {
        this.sub = sub;
    }

    /**
     * @return the subc
     */
    public String getSubc() {
        return subc;
    }

    /**
     * @param subc the subc to set
     */
    public void setSubc(String subc) {
        this.subc = subc;
    }

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the stu_count
     */
    public int getStu_count() {
        return stu_count;
    }

    /**
     * @param stu_count the stu_count to set
     */
    public void setStu_count(int stu_count) {
        this.stu_count = stu_count;
    }

    /**
     * @return the groupID
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * @param groupID the groupID to set
     */
    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    /**
     * @return the lec
     */
    public String[] getLec() {
        return lec;
    }

    /**
     * @param lec the lec to set
     */
    public void setLec(String[] lec) {
        this.lec = lec;
    }

    /**
     * @return the subgroupID
     */
    public String getSubgroupID() {
        return subgroupID;
    }

    /**
     * @param subgroupID the subgroupID to set
     */
    public void setSubgroupID(String subgroupID) {
        this.subgroupID = subgroupID;
    }
    
    
}


