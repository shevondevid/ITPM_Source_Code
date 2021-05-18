/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.form.working_hours;

import com.ITPM.timetablemanagement.models.Working_days_hours;
import com.ITPM.timetablemanagement.util.Constant;
import com.ITPM.timetablemanagement.util.CreateQuery;
import com.ITPM.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class ViewWorkingDayHours extends javax.swing.JPanel {

    private Working_days_hours model;
    private static int error = 0;
    /**
     * Creates new form ViewWorkingDayHours
     */
    public ViewWorkingDayHours() {
        initComponents();
        
        topic_weekday.setVisible(false);
        details_weekday.setVisible(false);
        edit_weekday.setVisible(false);
        delete_weekday.setVisible(false);
        
        topic_weekend.setVisible(false);
        details_weekend.setVisible(false);
        edit_weekend.setVisible(false);
        delete_weekend.setVisible(false);

        execute();
    }
    
    private void execute(){
        
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        
        try {
            connection = DBconnection.getConnection();
            statement = connection.createStatement();
            
            resultSet = statement.executeQuery(CreateQuery.getQuery(Constant.GET_WORKING_HOUR_TABLE));
            
            while(resultSet.next()){
                model = new Working_days_hours();
                
                model.setId(resultSet.getString(1));
                model.setNumOfDays(resultSet.getString(2));
                model.setDays(resultSet.getString(3));
                model.setHour(resultSet.getString(4));
                model.setMin(resultSet.getString(5));
                model.setTimeSlot(resultSet.getString(6));
                
                error++;
                
                if(setValues(model))
                    JOptionPane.showMessageDialog(ViewWorkingDayHours.this, "Cannot load data", "Data error", JOptionPane.ERROR_MESSAGE);
            }
            
            if(error == 0){
                setValues(null);
            }else
                error = 0;
            connection.close();
            
        } catch (SQLException | ClassNotFoundException | IOException | ParserConfigurationException | SAXException ex) {
            Logger.getLogger(ViewWorkingDayHours.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(ViewWorkingDayHours.this, "Cannot load data"+ex.getMessage(), "Data error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean setValues(Working_days_hours model){
        
        if(model == null){
            JOptionPane.showMessageDialog(ViewWorkingDayHours.this, "No Data to show", "Data error", JOptionPane.ERROR_MESSAGE);
            topic_weekday.setVisible(false);
            details_weekday.setVisible(false);
            edit_weekday.setVisible(false);
            delete_weekday.setVisible(false);

            topic_weekend.setVisible(false);
            details_weekend.setVisible(false);
            edit_weekend.setVisible(false);
            delete_weekend.setVisible(false);
        }else{
            
            if((error == 1) && (1 != Integer.parseInt(model.getId()))){
                topic_weekday.setVisible(false);
                details_weekday.setVisible(false);
                edit_weekday.setVisible(false);
                delete_weekday.setVisible(false);
            }
            if((error == 1) && (2 != Integer.parseInt(model.getId()))){
                topic_weekend.setVisible(false);
                details_weekend.setVisible(false);
                edit_weekend.setVisible(false);
                delete_weekend.setVisible(false);
            }
            if(Integer.parseInt(model.getId())== 1){

                topic_weekday.setVisible(true);
                details_weekday.setVisible(true);
                edit_weekday.setVisible(true);
                delete_weekday.setVisible(true);
                
                lbl_numOfDays_wd.setText(model.getNumOfDays());
                
                if(Integer.parseInt(model.getTimeSlot()) == 1){
                    lbl_timeSlot_wd.setText("1 hour");
                }else
                    lbl_timeSlot_wd.setText("30 minutes");

                String days = model.getDays();

                lbl_workDays_wd.setText(days);
                lbl_workHours_wd.setText(model.getHour()+ " H ");

                return false;
            }
            if(Integer.parseInt(model.getId())== 2){

                topic_weekend.setVisible(true);
                details_weekend.setVisible(true);
                edit_weekend.setVisible(true);
                delete_weekend.setVisible(true);
                
                lbl_numOfDays_we.setText(model.getNumOfDays());
                
                if(Integer.parseInt(model.getTimeSlot()) == 1){
                    lbl_timeSlot_we.setText("1 hour");
                }else
                    lbl_timeSlot_we.setText("30 minutes");
                
                String days = model.getDays();

                lbl_workDays_we.setText(days);
                lbl_workHours_we.setText(model.getHour()+ " H " );

                return false;
            }
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        topic_weekday = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        topic_weekend = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        details_weekday = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_numOfDays_wd = new javax.swing.JLabel();
        lbl_workDays_wd = new javax.swing.JLabel();
        lbl_workHours_wd = new javax.swing.JLabel();
        lbl_timeSlot_wd = new javax.swing.JLabel();
        details_weekend = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_numOfDays_we = new javax.swing.JLabel();
        lbl_workDays_we = new javax.swing.JLabel();
        lbl_workHours_we = new javax.swing.JLabel();
        lbl_timeSlot_we = new javax.swing.JLabel();
        edit_weekday = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        delete_weekday = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        edit_weekend = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        delete_weekend = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(835, 560));

        jPanel2.setBackground(new java.awt.Color(92, 141, 224));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(337, 337, 337))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        topic_weekday.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setBackground(new java.awt.Color(255, 0, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Weekday");

        javax.swing.GroupLayout topic_weekdayLayout = new javax.swing.GroupLayout(topic_weekday);
        topic_weekday.setLayout(topic_weekdayLayout);
        topic_weekdayLayout.setHorizontalGroup(
            topic_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topic_weekdayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topic_weekdayLayout.setVerticalGroup(
            topic_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topic_weekdayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        topic_weekend.setBackground(new java.awt.Color(51, 0, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Weekend");

        javax.swing.GroupLayout topic_weekendLayout = new javax.swing.GroupLayout(topic_weekend);
        topic_weekend.setLayout(topic_weekendLayout);
        topic_weekendLayout.setHorizontalGroup(
            topic_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topic_weekendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topic_weekendLayout.setVerticalGroup(
            topic_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topic_weekendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        details_weekday.setBackground(new java.awt.Color(153, 153, 153));
        details_weekday.setPreferredSize(new java.awt.Dimension(600, 200));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number of working days");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Working days");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Working hours per day");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time slot");

        lbl_numOfDays_wd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_numOfDays_wd.setForeground(new java.awt.Color(255, 255, 255));

        lbl_workDays_wd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_workDays_wd.setForeground(new java.awt.Color(255, 255, 255));

        lbl_workHours_wd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_workHours_wd.setForeground(new java.awt.Color(255, 255, 255));

        lbl_timeSlot_wd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_timeSlot_wd.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout details_weekdayLayout = new javax.swing.GroupLayout(details_weekday);
        details_weekday.setLayout(details_weekdayLayout);
        details_weekdayLayout.setHorizontalGroup(
            details_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, details_weekdayLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(details_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(74, 74, 74)
                .addGroup(details_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_numOfDays_wd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_workDays_wd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_workHours_wd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_timeSlot_wd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(383, 383, 383))
        );
        details_weekdayLayout.setVerticalGroup(
            details_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_weekdayLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(details_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_numOfDays_wd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(details_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lbl_workDays_wd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(details_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(details_weekdayLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, details_weekdayLayout.createSequentialGroup()
                        .addComponent(lbl_workHours_wd)
                        .addGap(18, 18, 18)))
                .addGroup(details_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_timeSlot_wd, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        details_weekdayLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbl_numOfDays_wd, lbl_timeSlot_wd, lbl_workDays_wd, lbl_workHours_wd});

        details_weekend.setBackground(new java.awt.Color(153, 153, 153));
        details_weekend.setPreferredSize(new java.awt.Dimension(600, 200));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number of working days");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Working days");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Working hours per day");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Time slot");

        lbl_numOfDays_we.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_numOfDays_we.setForeground(new java.awt.Color(255, 255, 255));

        lbl_workDays_we.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_workDays_we.setForeground(new java.awt.Color(255, 255, 255));

        lbl_workHours_we.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_workHours_we.setForeground(new java.awt.Color(255, 255, 255));

        lbl_timeSlot_we.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_timeSlot_we.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout details_weekendLayout = new javax.swing.GroupLayout(details_weekend);
        details_weekend.setLayout(details_weekendLayout);
        details_weekendLayout.setHorizontalGroup(
            details_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_weekendLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(details_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(77, 77, 77)
                .addGroup(details_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_numOfDays_we, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lbl_workDays_we, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_workHours_we, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_timeSlot_we, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(255, 255, 255))
        );
        details_weekendLayout.setVerticalGroup(
            details_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_weekendLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(details_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_numOfDays_we, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(details_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lbl_workDays_we))
                .addGap(18, 18, 18)
                .addGroup(details_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lbl_workHours_we, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(details_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lbl_timeSlot_we))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        details_weekendLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbl_numOfDays_we, lbl_timeSlot_we, lbl_workDays_we, lbl_workHours_we});

        edit_weekday.setBackground(new java.awt.Color(26, 182, 89));
        edit_weekday.setToolTipText("Edit weekday details");
        edit_weekday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edit");

        javax.swing.GroupLayout edit_weekdayLayout = new javax.swing.GroupLayout(edit_weekday);
        edit_weekday.setLayout(edit_weekdayLayout);
        edit_weekdayLayout.setHorizontalGroup(
            edit_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_weekdayLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        edit_weekdayLayout.setVerticalGroup(
            edit_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_weekdayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        delete_weekday.setBackground(new java.awt.Color(255, 0, 51));
        delete_weekday.setToolTipText("Delete weekday details");
        delete_weekday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_weekday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delete_weekdayMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Delete");

        javax.swing.GroupLayout delete_weekdayLayout = new javax.swing.GroupLayout(delete_weekday);
        delete_weekday.setLayout(delete_weekdayLayout);
        delete_weekdayLayout.setHorizontalGroup(
            delete_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_weekdayLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        delete_weekdayLayout.setVerticalGroup(
            delete_weekdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_weekdayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        edit_weekend.setBackground(new java.awt.Color(26, 182, 89));
        edit_weekend.setToolTipText("Edit weekend details");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Edit");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout edit_weekendLayout = new javax.swing.GroupLayout(edit_weekend);
        edit_weekend.setLayout(edit_weekendLayout);
        edit_weekendLayout.setHorizontalGroup(
            edit_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_weekendLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(32, 32, 32))
        );
        edit_weekendLayout.setVerticalGroup(
            edit_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_weekendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        delete_weekend.setBackground(new java.awt.Color(255, 51, 51));
        delete_weekend.setToolTipText("Delete weekend details");
        delete_weekend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_weekend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delete_weekendMousePressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Delete");

        javax.swing.GroupLayout delete_weekendLayout = new javax.swing.GroupLayout(delete_weekend);
        delete_weekend.setLayout(delete_weekendLayout);
        delete_weekendLayout.setHorizontalGroup(
            delete_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_weekendLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delete_weekendLayout.setVerticalGroup(
            delete_weekendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_weekendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(details_weekend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete_weekend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit_weekend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(topic_weekend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(details_weekday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_weekday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_weekday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(topic_weekday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {delete_weekday, edit_weekday});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(topic_weekday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(details_weekday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(edit_weekday, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(delete_weekday, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(topic_weekend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(details_weekend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(edit_weekend, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(delete_weekend, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delete_weekday, edit_weekday});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {details_weekday, details_weekend});

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delete_weekdayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_weekdayMousePressed
        int value = JOptionPane.showConfirmDialog(ViewWorkingDayHours.this, "Are you sure to delete this!", "Delete",JOptionPane.OK_CANCEL_OPTION);
        
        if(value == 0){
            if(deleteValue(1)){
                JOptionPane.showMessageDialog(ViewWorkingDayHours.this, "Delete Success","Delete", JOptionPane.OK_OPTION);
                execute();
            }
            else
                JOptionPane.showMessageDialog(ViewWorkingDayHours.this, "Delete Unuccess!","Delete", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_weekdayMousePressed

    private void delete_weekendMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_weekendMousePressed
       int value = JOptionPane.showConfirmDialog(ViewWorkingDayHours.this, "Are you sure to delete this!", "Delete",JOptionPane.WARNING_MESSAGE);
        
        if(value == 0){
            if(deleteValue(2)){
                JOptionPane.showMessageDialog(ViewWorkingDayHours.this, "Delete Success","Delete", JOptionPane.OK_OPTION);
                execute();
            }
            else
                JOptionPane.showMessageDialog(ViewWorkingDayHours.this, "Delete Unuccess!","Delete", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_weekendMousePressed

    private boolean deleteValue(int type){
        
        try {
            Connection connection;
            PreparedStatement statement;
            
            connection = DBconnection.getConnection();
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.REMOVE_WORKING_HOUR_TABLE));
            
            if(type == 1)
                statement.setInt(1, 1);
            else
                statement.setInt(1, 2);
            
            statement.execute();
            
            return true;
            
        } catch (IOException | SQLException | ClassNotFoundException | ParserConfigurationException | SAXException ex) {
            Logger.getLogger(ViewWorkingDayHours.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel delete_weekday;
    private javax.swing.JPanel delete_weekend;
    private javax.swing.JPanel details_weekday;
    private javax.swing.JPanel details_weekend;
    private javax.swing.JPanel edit_weekday;
    private javax.swing.JPanel edit_weekend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_numOfDays_wd;
    private javax.swing.JLabel lbl_numOfDays_we;
    private javax.swing.JLabel lbl_timeSlot_wd;
    private javax.swing.JLabel lbl_timeSlot_we;
    private javax.swing.JLabel lbl_workDays_wd;
    private javax.swing.JLabel lbl_workDays_we;
    private javax.swing.JLabel lbl_workHours_wd;
    private javax.swing.JLabel lbl_workHours_we;
    private javax.swing.JPanel topic_weekday;
    private javax.swing.JPanel topic_weekend;
    // End of variables declaration//GEN-END:variables
}
