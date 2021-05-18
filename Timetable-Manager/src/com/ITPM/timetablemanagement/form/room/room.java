/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.form.room;

import com.ITPM.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ysraf
 */
public class room {
    

    private Connection c;
    private ResultSet rs;
    private PreparedStatement statement;
    private Statement st;
    
    private int id;
    private String building;
    private String type;
    private String tag;
    private String room;
    private String consecutive;
    private String group;
    private String lecture;
    private String session;
    private String subjectAndTag;
    private String start;
    private String end;

    public void room() {
        try {
            
            c = DBconnection.getConnection();
            st = c.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertRoom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error on create Connection"+ex.getMessage(), "Data load error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(room.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error on create Connection"+ex.getMessage(), "Data load error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public room() {
    }

    public room(Connection c, ResultSet rs, PreparedStatement statement, Statement st, int id, String building, String type) {
        this.c = c;
        this.rs = rs;
        this.statement = statement;
        this.st = st;
        this.id = id;
        this.building = building;
        this.type = type;
    }

    /**
     * @return the start
     */
    public String getStart() {
        return start;
    }

    /**
     * @return the end
     */
    public String getEnd() {
        return end;
    }

    /**
     * @param start the start to set
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @return the consecutive
     */
    public String getConsecutive() {
        return consecutive;
    }

    /**
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @return the lecture
     */
    public String getLecture() {
        return lecture;
    }

    /**
     * @return the session
     */
    public String getSession() {
        return session;
    }

    /**
     * @return the subjectAndTag
     */
    public String getSubjectAndTag() {
        return subjectAndTag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @param consecutive the consecutive to set
     */
    public void setConsecutive(String consecutive) {
        this.consecutive = consecutive;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @param lecture the lecture to set
     */
    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    /**
     * @param session the session to set
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * @param subjectAndTag the subjectAndTag to set
     */
    public void setSubjectAndTag(String subjectAndTag) {
        this.subjectAndTag = subjectAndTag;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the building
     */
    public String getBuilding() {
        return building;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param c the c to set
     */
    public void setC(Connection c) {
        this.c = c;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(PreparedStatement statement) {
        this.statement = statement;
    }

    /**
     * @param st the st to set
     */
    public void setSt(Statement st) {
        this.st = st;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param building the building to set
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the c
     */
    public Connection getC() {
        return c;
    }

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @return the statement
     */
    public PreparedStatement getStatement() {
        return statement;
    }

    /**
     * @return the st
     */
    public Statement getSt() {
        return st;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }
}
