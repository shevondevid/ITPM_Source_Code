/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.form.student_details;



/**
 *
 * @author hvdil
 */
public class addDetails_Home extends javax.swing.JPanel {
     
    
    /**
     * Creates new form addDetails_Home
     */
    public addDetails_Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_home_yNs = new javax.swing.JButton();
        btn_home_dp = new javax.swing.JButton();
        btn_home_Gno = new javax.swing.JButton();
        btn_home_sGno = new javax.swing.JButton();

        setBackground(java.awt.Color.gray);
        setToolTipText("");

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_home_yNs.setBackground(new java.awt.Color(204, 204, 204));
        btn_home_yNs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home_yNs.setForeground(new java.awt.Color(51, 51, 51));
        btn_home_yNs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home_yNs.setLabel("Academic Year And Semester");
        btn_home_yNs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home_yNsMousePressed(evt);
            }
        });
        btn_home_yNs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home_yNsActionPerformed(evt);
            }
        });

        btn_home_dp.setBackground(new java.awt.Color(204, 204, 204));
        btn_home_dp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home_dp.setForeground(new java.awt.Color(51, 51, 51));
        btn_home_dp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home_dp.setLabel("Degree Program");
        btn_home_dp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home_dpMousePressed(evt);
            }
        });
        btn_home_dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home_dpActionPerformed(evt);
            }
        });

        btn_home_Gno.setBackground(new java.awt.Color(204, 204, 204));
        btn_home_Gno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home_Gno.setForeground(new java.awt.Color(51, 51, 51));
        btn_home_Gno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home_Gno.setLabel("Group Number");
        btn_home_Gno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home_GnoMousePressed(evt);
            }
        });
        btn_home_Gno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home_GnoActionPerformed(evt);
            }
        });

        btn_home_sGno.setBackground(new java.awt.Color(204, 204, 204));
        btn_home_sGno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home_sGno.setForeground(new java.awt.Color(51, 51, 51));
        btn_home_sGno.setText("Sub-Group Number");
        btn_home_sGno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home_sGno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home_sGnoMousePressed(evt);
            }
        });
        btn_home_sGno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home_sGnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_home_yNs, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addComponent(btn_home_dp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home_Gno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home_sGno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btn_home_yNs, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home_dp, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home_Gno, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home_sGno, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_home_yNsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home_yNsActionPerformed
        // TODO add your handling code here:
               
    }//GEN-LAST:event_btn_home_yNsActionPerformed
        
    private void btn_home_dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home_dpActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_home_dpActionPerformed

    private void btn_home_sGnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home_sGnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home_sGnoActionPerformed

    private void btn_home_yNsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home_yNsMousePressed
        // TODO add your handling code here: 
        jPanel3.removeAll();
        jPanel2.add(new enterYnS());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btn_home_yNsMousePressed

    private void btn_home_GnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home_GnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home_GnoActionPerformed

    private void btn_home_dpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home_dpMousePressed
        // TODO add your handling code here:
        jPanel3.removeAll();      
        jPanel2.add(new enterDp());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btn_home_dpMousePressed

    private void btn_home_GnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home_GnoMousePressed
        // TODO add your handling code here:
        jPanel3.removeAll();      
        jPanel2.add(new enterGNo());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btn_home_GnoMousePressed

    private void btn_home_sGnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home_sGnoMousePressed
        // TODO add your handling code here:
        jPanel3.removeAll();      
        jPanel2.add(new enterSubGNo());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btn_home_sGnoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_home_Gno;
    private javax.swing.JButton btn_home_dp;
    private javax.swing.JButton btn_home_sGno;
    private javax.swing.JButton btn_home_yNs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

