/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postOffice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lakshan
 */
public class AdminSideSendDailyPplAies extends javax.swing.JFrame {
Connection conn=DBconnection.connect();
    /**
     * Creates new form AdminSideSendDailyPplAies
     */
    public AdminSideSendDailyPplAies() {
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

        jPanel1456 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PpleAiedCname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Reset02_Channel = new javax.swing.JButton();
        PpleAiedSumbit = new javax.swing.JButton();
        PpleAiedCAC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PpleAiedCAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1456.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1456.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1456.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postOffice/DOP_header.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1456.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 760, -1));

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postOffice/back3.png"))); // NOI18N
        jButton8.setText("GO Back");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1456.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 45));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("People Aieds /");
        jPanel1456.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 240, -1));

        jLabel3.setFont(new java.awt.Font("4u-Malith", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ck;d wdOdr ");
        jPanel1456.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 350, 30));

        PpleAiedCname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PpleAiedCname.setToolTipText("");
        PpleAiedCname.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PpleAiedCname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PpleAiedCnameActionPerformed(evt);
            }
        });
        jPanel1456.add(PpleAiedCname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 250, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Client Name");
        jPanel1456.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 130, 30));

        Reset02_Channel.setBackground(new java.awt.Color(255, 51, 51));
        Reset02_Channel.setForeground(new java.awt.Color(255, 255, 255));
        Reset02_Channel.setText("Reset");
        Reset02_Channel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset02_ChannelActionPerformed(evt);
            }
        });
        jPanel1456.add(Reset02_Channel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 810, 120, 40));

        PpleAiedSumbit.setBackground(new java.awt.Color(255, 51, 51));
        PpleAiedSumbit.setForeground(new java.awt.Color(255, 255, 255));
        PpleAiedSumbit.setText("login");
        PpleAiedSumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PpleAiedSumbitActionPerformed(evt);
            }
        });
        jPanel1456.add(PpleAiedSumbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 810, 120, 40));

        PpleAiedCAC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PpleAiedCAC.setToolTipText("");
        PpleAiedCAC.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PpleAiedCAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PpleAiedCACActionPerformed(evt);
            }
        });
        jPanel1456.add(PpleAiedCAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 250, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Account Number");
        jPanel1456.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 150, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Amount");
        jPanel1456.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 150, 30));

        PpleAiedCAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PpleAiedCAmount.setToolTipText("");
        PpleAiedCAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PpleAiedCAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PpleAiedCAmountActionPerformed(evt);
            }
        });
        jPanel1456.add(PpleAiedCAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1456, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1456, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        MainMenu MM=new MainMenu();
        setVisible(false);
        MM.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void PpleAiedCnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PpleAiedCnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PpleAiedCnameActionPerformed

    private void Reset02_ChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset02_ChannelActionPerformed
        // TODO add your handling code here:
        //   Cname_Channel.setText(null);
        // Nic_Channel.setText(null);
        //Cusphn_Channel.setText(null);
    }//GEN-LAST:event_Reset02_ChannelActionPerformed

    private void PpleAiedSumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PpleAiedSumbitActionPerformed
    try {
        // TODO add your handling code here:
        String PplAiedAdd="insert into people_aieds(User_name,Acc_no,Ammout) values('"+PpleAiedCname.getText()+"','"+PpleAiedCAC.getText()+"','"+PpleAiedCAmount.getText()+"')";
        PreparedStatement ps =conn.prepareStatement(PplAiedAdd);
        ps.execute();
//people_aieds ``User_name``Acc_no``Ammout`
    } catch (SQLException ex) {
        Logger.getLogger(AdminSideSendDailyPplAies.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_PpleAiedSumbitActionPerformed

    private void PpleAiedCACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PpleAiedCACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PpleAiedCACActionPerformed

    private void PpleAiedCAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PpleAiedCAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PpleAiedCAmountActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminSideSendDailyPplAies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSideSendDailyPplAies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSideSendDailyPplAies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSideSendDailyPplAies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSideSendDailyPplAies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PpleAiedCAC;
    private javax.swing.JTextField PpleAiedCAmount;
    private javax.swing.JTextField PpleAiedCname;
    private javax.swing.JButton PpleAiedSumbit;
    private javax.swing.JButton Reset02_Channel;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1456;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
