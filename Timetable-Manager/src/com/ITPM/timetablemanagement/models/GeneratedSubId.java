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
public class GeneratedSubId {
    
    private int id;
    private String sGid;

    public GeneratedSubId() {
    }
    
    public GeneratedSubId(int id, String sGid){
        this.id = id;
        this.sGid = sGid;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getSgId()
    {
        return sGid;
    }

    /**
     * @return the sGid
     */
    public String getsGid() {
        return sGid;
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
}
