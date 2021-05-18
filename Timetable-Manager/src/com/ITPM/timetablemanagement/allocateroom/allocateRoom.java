/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.allocateroom;

import com.ITPM.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiran Harsha
 */
public class allocateRoom extends javax.swing.JPanel {

    private String ID;
    private String Type;
    private String Sub;
    allocateProcess rp;
    private DefaultTableModel dtm;
    
    
    /**
     * Creates new form InsertWorkingHours
     */
    public allocateRoom() throws ClassNotFoundException {
        initComponents();
        rp = new allocateProcess();
        getRoom();
        getsubRoom();
        getgroupRoom();
        getlectRoom();
        getsessionRoom();
        getconssessionRoom();
        gettimeRoom();
        
        try{
            Connection con = DBconnection.getConnection();
            Statement stat = con.createStatement();    
            String selectQuery="select Tag from tag";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next())
            {
                tag.addItem(rs.getString("Tag"));
                t1.addItem(rs.getString("Tag"));
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
//-------------------------------------------------------------------------------------------------------
        try{
            
            Connection con = DBconnection.getConnection();
            Statement stat2 = con.createStatement();    
            String selectQuery="select id from room";
            ResultSet rs=stat2.executeQuery(selectQuery);
            while(rs.next())
            {
                room.addItem(rs.getString("id"));
                r1.addItem(rs.getString("id"));
                rfl_room.addItem(rs.getString("id"));
                rfg_room.addItem(rs.getString("id"));
                rfg_room1.addItem(rs.getString("id"));
                rfg_room2.addItem(rs.getString("id"));
                rroom.addItem(rs.getString("id"));
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
//-------------------------------------------------------------------------------------------------------
        try{
            Connection con = DBconnection.getConnection();
            Statement stat2 = con.createStatement();    
            String selectQuery="select subject_name from subject";
            ResultSet rs=stat2.executeQuery(selectQuery);
            while(rs.next())
            {
                sub1.addItem(rs.getString("subject_name"));
               
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
 //-------------------------------------------------------------------------------------------------------
        try{
            Connection con = DBconnection.getConnection();
            Statement stat2 = con.createStatement();    
            String selectQuery="select name from lecturer";
            ResultSet rs=stat2.executeQuery(selectQuery);
            while(rs.next())
            {
                rfl_lect.addItem(rs.getString("name"));
               
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }   
        
//-------------------------------------------------------------------------------------------------------
        try{
            Connection con = DBconnection.getConnection();
            Statement stat2 = con.createStatement();    
            String selectQuery="select gId from generated_group_id";
            ResultSet rs=stat2.executeQuery(selectQuery);
            while(rs.next())
            {
                rfg_group.addItem(rs.getString("gId"));
               
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  

//-------------------------------------------------------------------------------------------------------
        try{
           Connection con = DBconnection.getConnection();
            Statement stat2 = con.createStatement();    
            String selectQuery="select id from session";
            ResultSet rs=stat2.executeQuery(selectQuery);
            while(rs.next())
            {
                rfg_group1.addItem(rs.getString("id"));
               
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
//-------------------------------------------------------------------------------------------------------
        try{
            Connection con = DBconnection.getConnection();
            Statement stat2 = con.createStatement();    
            String selectQuery="select id from sp2_consecutive_session";
            ResultSet rs=stat2.executeQuery(selectQuery);
            while(rs.next())
            {
                rfg_group2.addItem(rs.getString("id"));
               
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        RoomsForTags = new javax.swing.JPanel();
        tag = new javax.swing.JComboBox<>();
        room = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        txt_error = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RoomsForSubNTags = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        r1 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JComboBox<>();
        sub1 = new javax.swing.JComboBox<>();
        add1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        RoomsForLecturers = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        rfl_room = new javax.swing.JComboBox<>();
        rfl_lect = new javax.swing.JComboBox<>();
        RoomsForGroups = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        add3 = new javax.swing.JButton();
        delete3 = new javax.swing.JButton();
        rfg_room = new javax.swing.JComboBox<>();
        rfg_group = new javax.swing.JComboBox<>();
        RoomsForSession = new javax.swing.JPanel();
        rfg_room1 = new javax.swing.JComboBox<>();
        rfg_group1 = new javax.swing.JComboBox<>();
        add4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        delete4 = new javax.swing.JButton();
        RoomsForConsSession = new javax.swing.JPanel();
        add5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        delete5 = new javax.swing.JButton();
        rfg_group2 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        rfg_room2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ReserveRooms = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        add6 = new javax.swing.JButton();
        rroom = new javax.swing.JComboBox<>();
        delete6 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        stime = new javax.swing.JTextField();
        etime = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1000, 689));

        jScrollPane8.setPreferredSize(new java.awt.Dimension(1400, 1400));

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 910));

        RoomsForTags.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Allocate Rooms for Tags");

        jLabel2.setText("Tag");

        jLabel3.setText("Room");

        add.setText("Allocate");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag", "Room"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout RoomsForTagsLayout = new javax.swing.GroupLayout(RoomsForTags);
        RoomsForTags.setLayout(RoomsForTagsLayout);
        RoomsForTagsLayout.setHorizontalGroup(
            RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
            .addGroup(RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RoomsForTagsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(RoomsForTagsLayout.createSequentialGroup()
                            .addComponent(add)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(delete))
                        .addGroup(RoomsForTagsLayout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addGroup(RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(42, 42, 42)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        RoomsForTagsLayout.setVerticalGroup(
            RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
            .addGroup(RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RoomsForTagsLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RoomsForTagsLayout.createSequentialGroup()
                            .addGroup(RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(RoomsForTagsLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addGroup(RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel3))
                                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(RoomsForTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(add)
                                .addComponent(delete)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        RoomsForSubNTags.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag", "Room", "Subject"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Subject");
        }

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Add Rooms for Subjects and Tags");

        jLabel5.setText("Tag");

        jLabel6.setText("Room");

        jLabel7.setText("Subject");

        add1.setText("Allocate");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RoomsForSubNTagsLayout = new javax.swing.GroupLayout(RoomsForSubNTags);
        RoomsForSubNTags.setLayout(RoomsForSubNTagsLayout);
        RoomsForSubNTagsLayout.setHorizontalGroup(
            RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RoomsForSubNTagsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(RoomsForSubNTagsLayout.createSequentialGroup()
                            .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(35, 35, 35)
                            .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(RoomsForSubNTagsLayout.createSequentialGroup()
                            .addComponent(add1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(delete1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        RoomsForSubNTagsLayout.setVerticalGroup(
            RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RoomsForSubNTagsLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RoomsForSubNTagsLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(RoomsForSubNTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(add1)
                                .addComponent(delete1)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        RoomsForLecturers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Lecturer"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Rooms for Lecturers");

        jLabel9.setText("Room");

        jLabel10.setText("Lecturer");

        add2.setText("Allocate");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        delete2.setText("Delete");
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RoomsForLecturersLayout = new javax.swing.GroupLayout(RoomsForLecturers);
        RoomsForLecturers.setLayout(RoomsForLecturersLayout);
        RoomsForLecturersLayout.setHorizontalGroup(
            RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoomsForLecturersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RoomsForLecturersLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RoomsForLecturersLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rfl_lect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RoomsForLecturersLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rfl_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RoomsForLecturersLayout.createSequentialGroup()
                                .addComponent(add2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete2))))
                    .addContainerGap(425, Short.MAX_VALUE)))
        );
        RoomsForLecturersLayout.setVerticalGroup(
            RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoomsForLecturersLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RoomsForLecturersLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel8)
                    .addGap(18, 18, 18)
                    .addGroup(RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(rfl_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(rfl_lect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(RoomsForLecturersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add2)
                        .addComponent(delete2))
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        RoomsForGroups.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Rooms for Groups");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Group"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel12.setText("Room");

        jLabel13.setText("Group");

        add3.setText("Allocate");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        delete3.setText("Delete");
        delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RoomsForGroupsLayout = new javax.swing.GroupLayout(RoomsForGroups);
        RoomsForGroups.setLayout(RoomsForGroupsLayout);
        RoomsForGroupsLayout.setHorizontalGroup(
            RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsForGroupsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RoomsForGroupsLayout.createSequentialGroup()
                        .addComponent(add3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete3))
                    .addGroup(RoomsForGroupsLayout.createSequentialGroup()
                        .addGroup(RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(33, 33, 33)
                        .addGroup(RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rfg_group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rfg_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RoomsForGroupsLayout.setVerticalGroup(
            RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsForGroupsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RoomsForGroupsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(21, 21, 21)
                        .addGroup(RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(rfg_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(rfg_group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(RoomsForGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add3)
                            .addComponent(delete3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoomsForSession.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RoomsForSession.setPreferredSize(new java.awt.Dimension(200, 222));

        add4.setText("Allocate");
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Session"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jLabel15.setText("Room");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Rooms for Session");

        jLabel16.setText("Session");

        delete4.setText("Delete");
        delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RoomsForSessionLayout = new javax.swing.GroupLayout(RoomsForSession);
        RoomsForSession.setLayout(RoomsForSessionLayout);
        RoomsForSessionLayout.setHorizontalGroup(
            RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsForSessionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RoomsForSessionLayout.createSequentialGroup()
                        .addComponent(add4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete4))
                    .addGroup(RoomsForSessionLayout.createSequentialGroup()
                        .addGroup(RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(33, 33, 33)
                        .addGroup(RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rfg_group1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rfg_room1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RoomsForSessionLayout.setVerticalGroup(
            RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsForSessionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RoomsForSessionLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(21, 21, 21)
                        .addGroup(RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(rfg_room1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(rfg_group1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(RoomsForSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add4)
                            .addComponent(delete4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoomsForConsSession.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RoomsForConsSession.setPreferredSize(new java.awt.Dimension(300, 209));

        add5.setText("Allocate");
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Rooms for Cons.Sessions");

        delete5.setText("Delete");
        delete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete5ActionPerformed(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Cons.Session"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jLabel17.setText("Room");

        jLabel19.setText("Cons.Session");

        javax.swing.GroupLayout RoomsForConsSessionLayout = new javax.swing.GroupLayout(RoomsForConsSession);
        RoomsForConsSession.setLayout(RoomsForConsSessionLayout);
        RoomsForConsSessionLayout.setHorizontalGroup(
            RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsForConsSessionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RoomsForConsSessionLayout.createSequentialGroup()
                        .addComponent(add5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete5))
                    .addGroup(RoomsForConsSessionLayout.createSequentialGroup()
                        .addGroup(RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(33, 33, 33)
                        .addGroup(RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rfg_group2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rfg_room2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RoomsForConsSessionLayout.setVerticalGroup(
            RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoomsForConsSessionLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RoomsForConsSessionLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(21, 21, 21)
                        .addGroup(RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(rfg_room2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(rfg_group2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(RoomsForConsSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add5)
                            .addComponent(delete5)))))
        );

        ReserveRooms.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setText("Room");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Reserve Rooms");

        add6.setText("Allocate");
        add6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add6ActionPerformed(evt);
            }
        });

        delete6.setText("Delete");
        delete6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete6ActionPerformed(evt);
            }
        });

        jLabel22.setText("Start Time");

        jLabel23.setText("End Time");

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Start", "End"
            }
        ));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);

        stime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stimeActionPerformed(evt);
            }
        });

        etime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReserveRoomsLayout = new javax.swing.GroupLayout(ReserveRooms);
        ReserveRooms.setLayout(ReserveRoomsLayout);
        ReserveRoomsLayout.setHorizontalGroup(
            ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReserveRoomsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(ReserveRoomsLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(add6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete6))
                    .addGroup(ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReserveRoomsLayout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addGap(62, 62, 62)
                            .addComponent(stime, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReserveRoomsLayout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addGap(69, 69, 69)
                            .addComponent(etime)))
                    .addGroup(ReserveRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(88, 88, 88)
                        .addComponent(rroom, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(223, 223, 223)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(496, Short.MAX_VALUE))
        );
        ReserveRoomsLayout.setVerticalGroup(
            ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReserveRoomsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ReserveRoomsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReserveRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(rroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(stime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReserveRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add6)
                            .addComponent(delete6))))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RoomsForTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RoomsForGroups, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ReserveRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RoomsForLecturers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoomsForSubNTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RoomsForSession, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                            .addComponent(RoomsForConsSession, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoomsForTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomsForGroups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RoomsForSession, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(RoomsForSubNTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RoomsForLecturers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RoomsForConsSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReserveRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jScrollPane8.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        addRoom();
        getRoom();
       
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        deleteRoom();
        getRoom();
         
    }//GEN-LAST:event_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        tableClicked();
    }//GEN-LAST:event_jTable1MouseClicked

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        addsubRoom();
        getsubRoom();
    }//GEN-LAST:event_add1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        deletesubRoom();
        getsubRoom();
    }//GEN-LAST:event_delete1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        tableClicked1();
    }//GEN-LAST:event_jTable2MouseClicked

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        addlectRoom();
        getlectRoom();
    }//GEN-LAST:event_add2ActionPerformed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
        deletelectRoom();
        getlectRoom();
    }//GEN-LAST:event_delete2ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        tableClickedgroup();
    }//GEN-LAST:event_jTable4MouseClicked

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        addgroupRoom();
        getgroupRoom();
    }//GEN-LAST:event_add3ActionPerformed

    private void delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete3ActionPerformed
        deletegroupRoom();
        getgroupRoom();
    }//GEN-LAST:event_delete3ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        tableClickedsession();
    }//GEN-LAST:event_jTable5MouseClicked

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
        addsessionRoom();
        getsessionRoom();
    }//GEN-LAST:event_add4ActionPerformed

    private void delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete4ActionPerformed
        deletesessionRoom();
        getsessionRoom();
    }//GEN-LAST:event_delete4ActionPerformed

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5ActionPerformed
        addconssessionRoom();
        getconssessionRoom();
    }//GEN-LAST:event_add5ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        tableClickedconssession();
    }//GEN-LAST:event_jTable6MouseClicked

    private void delete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete5ActionPerformed
        deleteconssessionRoom();
        getconssessionRoom();
    }//GEN-LAST:event_delete5ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        tableClickedlect();
    }//GEN-LAST:event_jTable3MouseClicked

    private void add6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add6ActionPerformed
        addtimeRoom();
        gettimeRoom();
    }//GEN-LAST:event_add6ActionPerformed

    private void delete6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete6ActionPerformed
        deletetimeRoom();
        gettimeRoom();
    }//GEN-LAST:event_delete6ActionPerformed

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        tableClickedtime();
    }//GEN-LAST:event_jTable7MouseClicked

    private void stimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stimeActionPerformed

    private void etimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ReserveRooms;
    private javax.swing.JPanel RoomsForConsSession;
    private javax.swing.JPanel RoomsForGroups;
    private javax.swing.JPanel RoomsForLecturers;
    private javax.swing.JPanel RoomsForSession;
    private javax.swing.JPanel RoomsForSubNTags;
    private javax.swing.JPanel RoomsForTags;
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton add4;
    private javax.swing.JButton add5;
    private javax.swing.JButton add6;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JButton delete3;
    private javax.swing.JButton delete4;
    private javax.swing.JButton delete5;
    private javax.swing.JButton delete6;
    private javax.swing.JTextField etime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JComboBox<String> r1;
    private javax.swing.JComboBox<String> rfg_group;
    private javax.swing.JComboBox<String> rfg_group1;
    private javax.swing.JComboBox<String> rfg_group2;
    private javax.swing.JComboBox<String> rfg_room;
    private javax.swing.JComboBox<String> rfg_room1;
    private javax.swing.JComboBox<String> rfg_room2;
    private javax.swing.JComboBox<String> rfl_lect;
    private javax.swing.JComboBox<String> rfl_room;
    private javax.swing.JComboBox<String> room;
    private javax.swing.JComboBox<String> rroom;
    private javax.swing.JTextField stime;
    private javax.swing.JComboBox<String> sub1;
    private javax.swing.JComboBox<String> t1;
    private javax.swing.JComboBox<String> tag;
    private javax.swing.JLabel txt_error;
    // End of variables declaration//GEN-END:variables

//--------------------------------------------------------------------------------------
       public void addRoom(){
        String STag = tag.getSelectedItem().toString();
        String SRoom = room.getSelectedItem().toString();
        
        if (STag.isEmpty() || SRoom.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = SRoom;
                rp.addRoom(ID, Type);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }

    
    public void deleteRoom(){
        String STag = tag.getSelectedItem().toString();
        String SRoom = room.getSelectedItem().toString();
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = SRoom;
                
                rp.deleteRoom(ID,Type);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
   
    

    
    public void getRoom(){
        try {
            dtm = (DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
            rp.getRoom(dtm);
            jTable1.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClicked(){
        
        
        
       tag.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
       room.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
    }
    
//--------------------------------------------------------------------------------------
       public void addsubRoom(){
        String STag = t1.getSelectedItem().toString();
        String SRoom = r1.getSelectedItem().toString();
        String SSub = sub1.getSelectedItem().toString();
        
        if (STag.isEmpty() || SRoom.isEmpty() || SSub.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = SRoom;
                Sub = SSub;
                rp.addsubRoom(ID, Type, Sub);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }

    
    public void deletesubRoom(){
        String STag = t1.getSelectedItem().toString();
        String SRoom = r1.getSelectedItem().toString();
        String SSub = sub1.getSelectedItem().toString();
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = SRoom;
                Sub = SSub;
                
                rp.deletesubRoom(ID,Type,Sub);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    

    

    
    public void getsubRoom(){
        try {
            dtm = (DefaultTableModel)jTable2.getModel();
            dtm.setRowCount(0);
            rp.getsubRoom(dtm);
            jTable2.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClicked1(){

       t1.setSelectedItem(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
       r1.setSelectedItem(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString());
       sub1.setSelectedItem(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString());
       
    }
    
    
//--------------------------------------------------------------------------------------
       public void addlectRoom(){
        String STag = rfl_room.getSelectedItem().toString();
        String SRoom = rfl_lect.getSelectedItem().toString();
        
        if (STag.isEmpty() || SRoom.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = SRoom;
                rp.addlectRoom(ID, Type);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }
  
    public void deletelectRoom(){
        String STag = rfl_room.getSelectedItem().toString();
        String SRoom = rfl_lect.getSelectedItem().toString();
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = SRoom;
                
                rp.deletelectRoom(ID,Type);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
    public void getlectRoom(){
        try {
            dtm = (DefaultTableModel)jTable3.getModel();
            dtm.setRowCount(0);
            rp.getlectRoom(dtm);
            jTable3.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClickedlect(){
  
       rfl_room.setSelectedItem(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
       rfl_lect.setSelectedItem(jTable3.getValueAt(jTable3.getSelectedRow(), 1).toString());
    }
    
//--------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------
       public void addgroupRoom(){
        String STag = rfg_room.getSelectedItem().toString();
        String SRoom = rfg_group.getSelectedItem().toString();
        
        if (STag.isEmpty() || SRoom.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = SRoom;
                rp.addgroupRoom(ID, Type);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }
  
    public void deletegroupRoom(){
        String STag = rfg_room.getSelectedItem().toString();
        String SRoom = rfg_group.getSelectedItem().toString();
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = SRoom;
                
                rp.deletegroupRoom(ID,Type);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
    public void getgroupRoom(){
        try {
            dtm = (DefaultTableModel)jTable4.getModel();
            dtm.setRowCount(0);
            rp.getgroupRoom(dtm);
            jTable4.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClickedgroup(){
  
       rfg_room.setSelectedItem(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
       rfg_group.setSelectedItem(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString());
    }
    
//--------------------------------------------------------------------------------------
    
//--------------------------------------------------------------------------------------
       public void addsessionRoom(){
        String STag = rfg_room1.getSelectedItem().toString();
        String SRoom = rfg_group1.getSelectedItem().toString();
        
        if (STag.isEmpty() || SRoom.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = SRoom;
                rp.addsesRoom(ID, Type);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }
  
    public void deletesessionRoom(){
        String STag = rfg_room1.getSelectedItem().toString();
        String SRoom = rfg_group1.getSelectedItem().toString();
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = SRoom;
                
                rp.deletesesRoom(ID,Type);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
    public void getsessionRoom(){
        try {
            dtm = (DefaultTableModel)jTable5.getModel();
            dtm.setRowCount(0);
            rp.getsesRoom(dtm);
            jTable5.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClickedsession(){
  
       rfg_room1.setSelectedItem(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString());
       rfg_group1.setSelectedItem(jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString());
    }
//--------------------------------------------------------------------------------------
       public void addconssessionRoom(){
        String STag = rfg_room2.getSelectedItem().toString();
        String SRoom = rfg_group2.getSelectedItem().toString();
        
        if (STag.isEmpty() || SRoom.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = SRoom;
                rp.addcsesRoom(ID, Type);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }
  
    public void deleteconssessionRoom(){
        String STag = rfg_room2.getSelectedItem().toString();
        String SRoom = rfg_group2.getSelectedItem().toString();
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = SRoom;
                
                rp.deletecsesRoom(ID,Type);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
    public void getconssessionRoom(){
        try {
            dtm = (DefaultTableModel)jTable6.getModel();
            dtm.setRowCount(0);
            rp.getcsesRoom(dtm);
            jTable6.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClickedconssession(){
  
       rfg_room2.setSelectedItem(jTable6.getValueAt(jTable6.getSelectedRow(), 0).toString());
       rfg_group2.setSelectedItem(jTable6.getValueAt(jTable6.getSelectedRow(), 1).toString());
    }
  
//--------------------------------------------------------------------------------------
       public void addtimeRoom(){
        String STag = rroom.getSelectedItem().toString();
        
        
        if (STag.isEmpty() || stime.getText().isEmpty() || etime.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = stime.getText();
                Sub = etime.getText();
                
                rp.addtimeRoom(ID, Type, Sub);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }

    
    public void deletetimeRoom(){
        String STag = rroom.getSelectedItem().toString();
        
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = stime.getText();
                Sub = etime.getText();
                
                rp.deletetimeRoom(ID,Type,Sub);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void gettimeRoom(){
        try {
            dtm = (DefaultTableModel)jTable7.getModel();
            dtm.setRowCount(0);
            rp.gettimeRoom(dtm);
            jTable7.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClickedtime(){

       rroom.setSelectedItem(jTable7.getValueAt(jTable7.getSelectedRow(), 0).toString());
       stime.setText(jTable7.getValueAt(jTable7.getSelectedRow(), 1).toString());
       etime.setText(jTable7.getValueAt(jTable7.getSelectedRow(), 2).toString());
       
    }
}
