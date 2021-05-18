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
public class AllDetails {
    
    private int id;
    private String yNs;
    private String dp;
    private String gId;
    private String sGid;
    
    
    public AllDetails(int ID, String yNs, String dp, String gId, String sGid){
        this.id = ID;
        this.yNs = yNs;
        this.dp = dp;
        this.gId = gId;
        this.sGid = sGid;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getyNs()
    {
        return yNs;
    }
    
    public String getdp()
    {
        return dp;
    }
    
    public String getGid()
    {
        return gId;
    }
    
    public String getSgId()
    {
        return sGid;
    }
    
}
