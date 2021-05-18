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
public class SubGroupNo {
    private int id;
    private String SGno;
    
    public SubGroupNo(int ID, String sgn){
        this.id = ID;
        this.SGno = sgn;
    } 

    public SubGroupNo() {
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getSGno()
    {
        return SGno;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param SGno the SGno to set
     */
    public void setSGno(String SGno) {
        this.SGno = SGno;
    }
}
