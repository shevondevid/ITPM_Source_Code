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
public class GeneratedId {
    
    private int id;
    private String gId;

    public GeneratedId() {
    }
    
    public GeneratedId(int ID, String gId){
        this.id = ID;
        this.gId = gId;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getGid()
    {
        return gId;
    }

    /**
     * @return the gId
     */
    public String getgId() {
        return gId;
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
    
}
