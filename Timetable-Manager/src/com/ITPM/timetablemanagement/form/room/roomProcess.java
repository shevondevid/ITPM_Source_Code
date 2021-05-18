/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.form.room;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ysraf
 */
public class roomProcess extends room{
    
    ArrayList<String> buildingList = new ArrayList<>();
    
    public roomProcess(){
        room();
    }
    
    public void addRoom (String building, String type) throws SQLException{
        String sql = "INSERT INTO room(building,type) VALUES('"+building+"','"+type+"')";
        getSt().executeUpdate(sql);
    }
    
    public void updateRoom (String id, String type, String building) throws SQLException{
        String sql = "UPDATE room SET type = '"+type+"', building = '"+building+"' WHERE id = '"+id+"'";
        getSt().executeUpdate(sql);
    }
    public void getRoom(DefaultTableModel dtm) throws SQLException{
        String sql = "SELECT * FROM room";
        
        setRs(getSt().executeQuery(sql));
        Object[] data = new Object[3];
        
        while (getRs().next()){
            data[0] = getRs().getString("id");
            data[1] = getRs().getString("building");
            data[2] = getRs().getString("type");
            dtm.addRow(data);
        }
        
    }
    public void getBuildings(JComboBox<String> building) throws SQLException{
        String sql = "SELECT * FROM building";
        setRs(getSt().executeQuery(sql));
        String [] data;
        
        while (getRs().next()){
            buildingList.add(getRs().getString("name"));
        }
        
        data = new String[buildingList.size()];
        
        for(int x = 0; x < buildingList.size();x++){
            data[x] = buildingList.get(x);
        }
            building.setModel(new DefaultComboBoxModel<>(data));
    }
    public void deleteRoom (String id) throws SQLException{
        String sql = "DELETE FROM room WHERE id = '"+id+"'";
        getSt().executeUpdate(sql);
    }
    
}
