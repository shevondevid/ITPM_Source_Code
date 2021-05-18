/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.location;

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
public class building {
    

    Connection c;
    ResultSet rs;
    PreparedStatement statement;
    Statement st;
    

    public void building() {
        try {
            
            c = DBconnection.getConnection();
            st = c.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertBuilding.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null , "Cannot configure database"+ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(building.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null , "Cannot configure database"+ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
