/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.timetablemanagement.form.lecturer;

import com.ITPM.timetablemanagement.models.Building;
import com.ITPM.timetablemanagement.models.Lecturer;
import com.ITPM.timetablemanagement.util.CharecterSizeFilter;
import com.ITPM.timetablemanagement.util.Constant;
import com.ITPM.timetablemanagement.util.CreateQuery;
import com.ITPM.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class EditModel extends javax.swing.JFrame {
    private final ArrayList<Building> buildingList = new ArrayList();
    private final ArrayList<String> faculty = new ArrayList();
    private final ArrayList<String> center = new ArrayList();
    private final ArrayList<String> level = new ArrayList();
    private final ArrayList<String> department = new ArrayList();
    
    private static String buildings[];
    private static String faculties[];
    private static String centers[];
    private static String levels[];
    private static String departments[];
    private int id = 0;
    
    private static PreparedStatement statement1, statement2, statement3, statement4;
    private static ResultSet resultSet;
    /**
     * Creates new form EditModel
     */
    public EditModel() {
        initComponents();
        
        txt_lec_id.setDocument(new CharecterSizeFilter(6));
        txt_id.setVisible(false);
        execute();
    }

    private void execute(){
        try {
            try {
                statement1 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_BUILDINGS));
                statement2 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_FACULTY));
                statement3 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_CENTER));
                statement4 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_LEVEL));
                
                resultSet = statement1.executeQuery();
                
                while(resultSet.next()){
                    Building building = new Building();
                    
                    building.setId(resultSet.getInt(1));
                    building.setName(resultSet.getString(2));
                    buildingList.add(building);
                    
                }
                resultSet.close();
                resultSet = statement2.executeQuery();
                
                while(resultSet.next()){
                    faculty.add(resultSet.getString("name"));
                }
                resultSet.close();
                resultSet = statement3.executeQuery();
                
                while(resultSet.next()){
                    center.add(resultSet.getString("name"));
                }
                resultSet.close();
                resultSet = statement4.executeQuery();
                
                while(resultSet.next()){
                    level.add(resultSet.getString("name"));
                }
                resultSet.close();
                
        } catch (ParserConfigurationException | SAXException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
        buildings = new String[buildingList.size()];
        for(int i = 0; i < buildingList.size();i++){
            buildings[i] = buildingList.get(i).getName();
        }
        cmb_lec_building.setModel(new DefaultComboBoxModel<>(buildings));
        
        faculties = new String[faculty.size()+1];
        faculties[0] = "Select";
        for(int i = 1; i <= faculty.size();i++){
            faculties[i] = faculty.get(i-1);
        }
        cmb_lec_faculty.setModel(new DefaultComboBoxModel<>(faculties));
        
        centers = new String[center.size()];
        for(int i = 0; i < center.size();i++){
            centers[i] = center.get(i);
        }
        cmb_lec_center.setModel(new DefaultComboBoxModel<>(centers));
        
        levels = new String[level.size()];
        for(int i = 0; i < level.size();i++){
            levels[i] = level.get(i);
        }
        cmb_lec_level.setModel(new DefaultComboBoxModel<>(levels));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        generateRank = new javax.swing.JButton();
        txt_lec_rank = new javax.swing.JTextField();
        txt_lec_name = new javax.swing.JTextField();
        txt_lec_id = new javax.swing.JTextField();
        cmb_lec_faculty = new javax.swing.JComboBox<>();
        cmb_lec_dept = new javax.swing.JComboBox<>();
        cmb_lec_center = new javax.swing.JComboBox<>();
        cmb_lec_building = new javax.swing.JComboBox<>();
        cmb_lec_level = new javax.swing.JComboBox<>();
        btn_save = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Faculty");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department");
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Center");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Building");
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Level");
        jLabel8.setPreferredSize(new java.awt.Dimension(60, 30));

        generateRank.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        generateRank.setText("Generate Rank");
        generateRank.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generateRank.setMaximumSize(new java.awt.Dimension(80, 20));
        generateRank.setMinimumSize(new java.awt.Dimension(80, 20));
        generateRank.setPreferredSize(new java.awt.Dimension(80, 20));
        generateRank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                generateRankMousePressed(evt);
            }
        });

        txt_lec_rank.setEditable(false);
        txt_lec_rank.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_lec_rank.setMinimumSize(new java.awt.Dimension(60, 20));
        txt_lec_rank.setName(""); // NOI18N
        txt_lec_rank.setPreferredSize(new java.awt.Dimension(100, 20));

        txt_lec_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_lec_name.setMinimumSize(new java.awt.Dimension(60, 20));
        txt_lec_name.setName(""); // NOI18N
        txt_lec_name.setPreferredSize(new java.awt.Dimension(140, 30));

        txt_lec_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_lec_id.setMinimumSize(new java.awt.Dimension(60, 20));
        txt_lec_id.setName(""); // NOI18N
        txt_lec_id.setPreferredSize(new java.awt.Dimension(100, 30));

        cmb_lec_faculty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_lec_faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmb_lec_faculty.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_faculty.setPreferredSize(new java.awt.Dimension(140, 30));
        cmb_lec_faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_lec_facultyActionPerformed(evt);
            }
        });

        cmb_lec_dept.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_lec_dept.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_dept.setPreferredSize(new java.awt.Dimension(140, 30));

        cmb_lec_center.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_lec_center.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_lec_center.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_center.setPreferredSize(new java.awt.Dimension(100, 30));

        cmb_lec_building.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_lec_building.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_building.setPreferredSize(new java.awt.Dimension(140, 30));

        cmb_lec_level.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_lec_level.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_level.setPreferredSize(new java.awt.Dimension(100, 30));

        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.setPreferredSize(new java.awt.Dimension(60, 30));
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_saveMousePressed(evt);
            }
        });

        txt_id.setEditable(false);
        txt_id.setAutoscrolls(false);
        txt_id.setEnabled(false);
        txt_id.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(generateRank, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmb_lec_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_lec_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_lec_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_lec_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_lec_rank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_lec_building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_lec_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_lec_faculty, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(143, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_lec_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_lec_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_lec_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_lec_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_lec_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_lec_building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_lec_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generateRank, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_lec_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(146, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateRankMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateRankMousePressed
        if(txt_lec_id.getText().contentEquals("")){
            JOptionPane.showMessageDialog(EditModel.this, "Lecture id cannot be empty!", "Data missing", JOptionPane.ERROR_MESSAGE);
        }
        else if(txt_lec_id.getText().length()!= 6){
            JOptionPane.showMessageDialog(EditModel.this, "Lecture id Should be 6 characters", "Data missing", JOptionPane.ERROR_MESSAGE);
        }
        else{

            txt_lec_rank.setText(cmb_lec_level.getSelectedItem().toString() + "." + txt_lec_id.getText());
        }
    }//GEN-LAST:event_generateRankMousePressed

    private void cmb_lec_facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_lec_facultyActionPerformed
        int faculty = cmb_lec_faculty.getSelectedIndex();
        department.clear();
        try {
            statement1 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_DEPARTMENT));
            statement1.setInt(1, faculty);

            resultSet = statement1.executeQuery();

            while(resultSet.next()){
                department.add(resultSet.getString("name"));
            }

            resultSet.close();
            departments = new String[department.size()];

            for(int i = 0; i < department.size();i++){
                departments[i] = department.get(i);
            }
            cmb_lec_dept.setModel(new DefaultComboBoxModel<>(departments));

        } catch (ParserConfigurationException | SAXException | SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb_lec_facultyActionPerformed

    private void btn_saveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMousePressed
        boolean error = false;

        if(txt_lec_rank.getText().contentEquals("")){
            JOptionPane.showMessageDialog(EditModel.this, "Rank cannot be empty!", "Data missing", JOptionPane.ERROR_MESSAGE);
            error = true;
        }
        if(txt_lec_name.getText().contentEquals("")){
            JOptionPane.showMessageDialog(EditModel.this, "Name cannot be empty!", "Data missing", JOptionPane.ERROR_MESSAGE);
            error = true;
        }
        if(cmb_lec_faculty.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(EditModel.this, "Select faculty", "Data missing", JOptionPane.ERROR_MESSAGE);
            error = true;
        }

        if(!error){
            Lecturer lec = new Lecturer();
               
            lec.setId(Integer.parseInt(txt_id.getText()));
            lec.setName(txt_lec_name.getText());
            lec.setLec_id(txt_lec_id.getText());
            lec.setFaculty(cmb_lec_faculty.getSelectedItem().toString());
            lec.setDepartment(cmb_lec_dept.getSelectedItem().toString());
            lec.setCenter(cmb_lec_center.getSelectedItem().toString());
            lec.setBuilding(cmb_lec_building.getSelectedItem().toString());
            lec.setLevel(cmb_lec_level.getSelectedItem().toString());
            lec.setRank(txt_lec_rank.getText());

            try {
                Connection connection = DBconnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.UPDATE_LECTURER));

                statement.setString(1, lec.getName());
                statement.setString(2, lec.getLec_id());
                statement.setString(3, lec.getFaculty());
                statement.setString(4, lec.getDepartment());
                statement.setString(5, lec.getCenter());
                statement.setString(6, lec.getBuilding());
                statement.setString(7, lec.getLevel());
                statement.setString(8, lec.getRank());
                statement.setString(9, Integer.toString(lec.getId()));

                statement.execute();

                JOptionPane.showMessageDialog(EditModel.this, "Lecturer Updated", "Lecturer Updated", JOptionPane.DEFAULT_OPTION);
                
                DefaultTableModel model = (DefaultTableModel) new ViewLecturer().jTable1.getModel();
                model.setRowCount(0);
                
                model.fireTableRowsUpdated(new ViewLecturer().row, new ViewLecturer().row);
               
            } catch (SQLException | ClassNotFoundException | IOException |
                ParserConfigurationException | SAXException ex) {
                Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(EditModel.this, "Lecturer Updating Error"+ex.getMessage(), "Lecturer Update Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_saveMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditModel().setVisible(false);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btn_save;
    protected javax.swing.JComboBox<String> cmb_lec_building;
    protected javax.swing.JComboBox<String> cmb_lec_center;
    protected javax.swing.JComboBox<String> cmb_lec_dept;
    protected javax.swing.JComboBox<String> cmb_lec_faculty;
    protected javax.swing.JComboBox<String> cmb_lec_level;
    private javax.swing.JButton generateRank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField txt_id;
    protected javax.swing.JTextField txt_lec_id;
    protected javax.swing.JTextField txt_lec_name;
    protected javax.swing.JTextField txt_lec_rank;
    // End of variables declaration//GEN-END:variables
}
