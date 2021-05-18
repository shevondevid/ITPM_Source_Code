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
public class Lecturer {
    private int id;
    private String name;
    private String lec_id;
    private String faculty;
    private String department;
    private String center;
    private String building;
    private String rank;
    private String level;

    public Lecturer() {
    }

    public Lecturer(int id, String name, String lec_id, String faculty, String department,
            String center, String building, String rank, String level) {
        this.id = id;
        this.name = name;
        this.lec_id = lec_id;
        this.faculty = faculty;
        this.department = department;
        this.center = center;
        this.building = building;
        this.rank = rank;
        this.level = level;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the lec_id
     */
    public String getLec_id() {
        return lec_id;
    }

    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return the center
     */
    public String getCenter() {
        return center;
    }

    /**
     * @return the building
     */
    public String getBuilding() {
        return building;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param lec_id the lec_id to set
     */
    public void setLec_id(String lec_id) {
        this.lec_id = lec_id;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(String center) {
        this.center = center;
    }

    /**
     * @param building the building to set
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }
    
    
}
