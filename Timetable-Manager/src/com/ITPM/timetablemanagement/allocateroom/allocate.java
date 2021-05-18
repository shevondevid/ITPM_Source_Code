/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.allocateroom;

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
public class allocate {
    

    Connection c;
    ResultSet rs;
    PreparedStatement statement;
    Statement st;
    

    public void allocate() {
        try {
            
            c = DBconnection.getConnection();
            st = c.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error on create Connection"+ex.getMessage(), "Data load error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(allocate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error on create Connection"+ex.getMessage(), "Data load error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
