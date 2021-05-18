/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.location;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ysraf
 */
public class buildingProcess extends building{
    public buildingProcess(){
        building();
    }
    
    public void addBuilding (String id, String type) throws SQLException{
        String sql = "INSERT INTO building(name) VALUES('"+type+"')";
//        System.out.println(sql);
        st.executeUpdate(sql);
    }
    
    public void updateBuilding (String id, String type) throws SQLException{
        String sql = "UPDATE building SET name = '"+type+"' WHERE id = '"+id+"'";
        st.executeUpdate(sql);
    }
    public void getBuilding(DefaultTableModel dtm) throws SQLException{
        String sql = "SELECT * FROM building";
        
        rs = st.executeQuery(sql);
        Object[] data = new Object[2];
        
        while (rs.next()){
            data[0] = rs.getString("id");
            data[1] = rs.getString("name");
            dtm.addRow(data);
        }
        
    }
    public void deleteBuilding (String id) throws SQLException{
        String sql = "DELETE FROM building WHERE id = '"+id+"'";
        st.executeUpdate(sql);
    }
    
}
