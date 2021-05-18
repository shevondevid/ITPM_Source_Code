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
public class Subject {
     private int id;
     private String sub_year;
     private String sub_sem;
     private String sub_name;
     private String sub_code;
     private String sub_lec_hr;
     private String sub_tute_hr;
     private String sub_lab_hr;
     private String sub_eva_hr;

    public Subject() {
    }

    public Subject(int id, String sub_year, String sub_sem, String sub_name, String sub_code, String sub_lec_hr, String sub_tute_hr, String sub_lab_hr, String sub_eva_hr) {
        this.id = id;
        this.sub_year = sub_year;
        this.sub_sem = sub_sem;
        this.sub_name = sub_name;
        this.sub_code = sub_code;
        this.sub_lec_hr = sub_lec_hr;
        this.sub_tute_hr = sub_tute_hr;
        this.sub_lab_hr = sub_lab_hr;
        this.sub_eva_hr = sub_eva_hr;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the sub_year
     */
    public String getSub_year() {
        return sub_year;
    }

    /**
     * @return the sub_sem
     */
    public String getSub_sem() {
        return sub_sem;
    }

    /**
     * @return the sub_name
     */
    public String getSub_name() {
        return sub_name;
    }

    /**
     * @return the sub_code
     */
    public String getSub_code() {
        return sub_code;
    }

    /**
     * @return the sub_lec_hr
     */
    public String getSub_lec_hr() {
        return sub_lec_hr;
    }

    /**
     * @return the sub_tute_hr
     */
    public String getSub_tute_hr() {
        return sub_tute_hr;
    }

    /**
     * @return the sub_lab_hr
     */
    public String getSub_lab_hr() {
        return sub_lab_hr;
    }

    /**
     * @return the sub_eva_hr
     */
    public String getSub_eva_hr() {
        return sub_eva_hr;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param sub_year the sub_year to set
     */
    public void setSub_year(String sub_year) {
        this.sub_year = sub_year;
    }

    /**
     * @param sub_sem the sub_sem to set
     */
    public void setSub_sem(String sub_sem) {
        this.sub_sem = sub_sem;
    }

    /**
     * @param sub_name the sub_name to set
     */
    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    /**
     * @param sub_code the sub_code to set
     */
    public void setSub_code(String sub_code) {
        this.sub_code = sub_code;
    }

    /**
     * @param sub_lec_hr the sub_lec_hr to set
     */
    public void setSub_lec_hr(String sub_lec_hr) {
        this.sub_lec_hr = sub_lec_hr;
    }

    /**
     * @param sub_tute_hr the sub_tute_hr to set
     */
    public void setSub_tute_hr(String sub_tute_hr) {
        this.sub_tute_hr = sub_tute_hr;
    }

    /**
     * @param sub_lab_hr the sub_lab_hr to set
     */
    public void setSub_lab_hr(String sub_lab_hr) {
        this.sub_lab_hr = sub_lab_hr;
    }

    /**
     * @param sub_eva_hr the sub_eva_hr to set
     */
    public void setSub_eva_hr(String sub_eva_hr) {
        this.sub_eva_hr = sub_eva_hr;
    }
     
    
}
