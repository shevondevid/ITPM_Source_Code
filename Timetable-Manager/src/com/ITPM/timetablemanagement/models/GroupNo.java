/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.models;

/**
 *
 * @author hvdil
 */
public class GroupNo {
    private int id;
    private String gNo;

    public GroupNo() {
    }
    
    
    public GroupNo(int ID, String gn){
        this.id = ID;
        this.gNo = gn;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getGn()
    {
        return gNo;
    }

    /**
     * @return the gNo
     */
    public String getgNo() {
        return gNo;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param gNo the gNo to set
     */
    public void setgNo(String gNo) {
        this.gNo = gNo;
    }
    
}
