/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otopark_otomasyon;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Enes ŞAHİNER
 */
public class musteri extends javax.swing.JFrame {

    /**
     * Creates new form musteri
     */
    public musteri() {
        
        super("Otopark Ekranı");
        initComponents();
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12 = null;
            ResultSet rs,rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10,rs11,rs12 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            st2 = con.createStatement();
            st3 = con.createStatement();
            st4 = con.createStatement();
            st5 = con.createStatement();
            st6 = con.createStatement();
            st7 = con.createStatement();
            st7 = con.createStatement();
            st8 = con.createStatement();
            st9 = con.createStatement();
            st10 = con.createStatement();
            st11 = con.createStatement();
            st12 = con.createStatement();

            rs = st.executeQuery("select * from araclar where yeri='A1' and giris_cikis='1'");
            rs.last();
            int kayitsayisi = rs.getRow();            
            if(kayitsayisi > 0){                
                btn_a1.setText("DOLU");
                btn_a1.setBackground(Color.RED);             
            }
            else {
                btn_a1.setText("BOŞ - A1");
                btn_a1.setBackground(Color.GREEN);
            }
            
            rs2 = st2.executeQuery("select * from araclar where yeri='A2' and giris_cikis='1'");
            rs2.last();
            int kayitsayisi2 = rs2.getRow();            
            if(kayitsayisi2 > 0){                
                btn_a2.setText("DOLU");
                btn_a2.setBackground(Color.RED);                
            }
            else {
                btn_a2.setText("BOŞ - A2");
                btn_a2.setBackground(Color.GREEN);
            }
                
            
            rs3 = st3.executeQuery("select * from araclar where yeri='A3' and giris_cikis='1'");
            rs3.last();
            int kayitsayisi3 = rs3.getRow();            
            if(kayitsayisi3 > 0){                
                btn_a3.setText("DOLU");
                btn_a3.setBackground(Color.RED);             
            }
            else {
                btn_a3.setText("BOŞ - A3");
                btn_a3.setBackground(Color.GREEN);
            }
            
            rs4 = st4.executeQuery("select * from araclar where yeri='A4' and giris_cikis='1'");
            rs4.last();
            int kayitsayisi4 = rs4.getRow();            
            if(kayitsayisi4 > 0){                
                btn_a4.setText("DOLU");
                btn_a4.setBackground(Color.RED);             
            }
            else {
                btn_a4.setText("BOŞ-A4");
                btn_a4.setBackground(Color.GREEN);
            }
            
            rs5 = st5.executeQuery("select * from araclar where yeri='A5' and giris_cikis='1'");
            rs5.last();
            int kayitsayisi5 = rs5.getRow();            
            if(kayitsayisi5 > 0){                
                btn_a5.setText("DOLU");
                btn_a5.setBackground(Color.RED);             
            }
            else {
                btn_a5.setText("BOŞ-A5");
                btn_a5.setBackground(Color.GREEN);
            }
            
            rs6 = st6.executeQuery("select * from araclar where yeri='A6' and giris_cikis='1'");
            rs6.last();
            int kayitsayisi6 = rs6.getRow();            
            if(kayitsayisi6 > 0){                
                btn_a6.setText("DOLU");
                btn_a6.setBackground(Color.RED);             
            }
            else {
                btn_a6.setText("BOŞ-A6");
                btn_a6.setBackground(Color.GREEN);
            }
            
            rs7 = st7.executeQuery("select * from araclar where yeri='A7' and giris_cikis='1'");
            rs7.last();
            int kayitsayisi7 = rs7.getRow();            
            if(kayitsayisi7 > 0){                
                btn_a7.setText("DOLU");
                btn_a7.setBackground(Color.RED);             
            }
            else {
                btn_a7.setText("BOŞ-A7");
                btn_a7.setBackground(Color.GREEN);
            }
            
            rs8 = st8.executeQuery("select * from araclar where yeri='A8' and giris_cikis='1'");
            rs8.last();
            int kayitsayisi8 = rs8.getRow();            
            if(kayitsayisi8 > 0){                
                btn_a8.setText("DOLU");
                btn_a8.setBackground(Color.RED);             
            }
            else {
                btn_a8.setText("BOŞ-A8");
                btn_a8.setBackground(Color.GREEN);
            }
            
            rs9 = st9.executeQuery("select * from araclar where yeri='A9' and giris_cikis='1'");
            rs9.last();
            int kayitsayisi9 = rs9.getRow();            
            if(kayitsayisi9 > 0){                
                btn_a9.setText("DOLU");
                btn_a9.setBackground(Color.RED);             
            }
            else {
                btn_a9.setText("BOŞ-A9");
                btn_a9.setBackground(Color.GREEN);
            }
            
            rs10 = st10.executeQuery("select * from araclar where yeri='A10' and giris_cikis='1'");
            rs10.last();
            int kayitsayisi10 = rs10.getRow();            
            if(kayitsayisi10 > 0){                
                btn_a10.setText("DOLU");
                btn_a10.setBackground(Color.RED);             
            }
            else {
                btn_a10.setText("BOŞ-A10");
                btn_a10.setBackground(Color.GREEN);
            }
            
            rs11 = st11.executeQuery("select * from araclar where yeri='A11' and giris_cikis='1'");
            rs11.last();
            int kayitsayisi11 = rs11.getRow();            
            if(kayitsayisi11 > 0){                
                btn_a11.setText("DOLU");
                btn_a11.setBackground(Color.RED);             
            }
            else {
                btn_a11.setText("BOŞ-A11");
                btn_a11.setBackground(Color.GREEN);
            }
            
            rs12 = st12.executeQuery("select * from araclar where yeri='A12' and giris_cikis='1'");
            rs12.last();
            int kayitsayisi12 = rs12.getRow();            
            if(kayitsayisi12 > 0){                
                btn_a12.setText("DOLU");
                btn_a12.setBackground(Color.RED);             
            }
            else {
                btn_a12.setText("BOŞ-A12");
                btn_a12.setBackground(Color.GREEN);
            }
            
            
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
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

        jPanel1 = new javax.swing.JPanel();
        btn_a3 = new javax.swing.JButton();
        btn_a2 = new javax.swing.JButton();
        btn_a4 = new javax.swing.JButton();
        btn_a7 = new javax.swing.JButton();
        btn_a5 = new javax.swing.JButton();
        btn_a6 = new javax.swing.JButton();
        btn_a8 = new javax.swing.JButton();
        btn_a9 = new javax.swing.JButton();
        btn_a11 = new javax.swing.JButton();
        btn_a10 = new javax.swing.JButton();
        btn_a12 = new javax.swing.JButton();
        btn_a1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btn_a3.setText("A3");
        btn_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a3ActionPerformed(evt);
            }
        });

        btn_a2.setText("A2");
        btn_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a2ActionPerformed(evt);
            }
        });

        btn_a4.setText("A4");
        btn_a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a4ActionPerformed(evt);
            }
        });

        btn_a7.setText("A7");
        btn_a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a7ActionPerformed(evt);
            }
        });

        btn_a5.setText("A5");
        btn_a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a5ActionPerformed(evt);
            }
        });

        btn_a6.setText("A6");
        btn_a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a6ActionPerformed(evt);
            }
        });

        btn_a8.setText("A8");
        btn_a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a8ActionPerformed(evt);
            }
        });

        btn_a9.setText("A9");
        btn_a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a9ActionPerformed(evt);
            }
        });

        btn_a11.setText("A11");
        btn_a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a11ActionPerformed(evt);
            }
        });

        btn_a10.setText("A10");
        btn_a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a10ActionPerformed(evt);
            }
        });

        btn_a12.setText("A12");
        btn_a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a12ActionPerformed(evt);
            }
        });

        btn_a1.setText("A1");
        btn_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_a9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_a10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_a11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_a12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_a5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_a6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_a7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_a8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_a4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_a5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_a9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a7ActionPerformed
        
    }//GEN-LAST:event_btn_a7ActionPerformed

    private void btn_a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a6ActionPerformed
        
    }//GEN-LAST:event_btn_a6ActionPerformed

    private void btn_a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a8ActionPerformed
        
    }//GEN-LAST:event_btn_a8ActionPerformed

    private void btn_a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a9ActionPerformed
       
    }//GEN-LAST:event_btn_a9ActionPerformed

    private void btn_a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a11ActionPerformed
       
    }//GEN-LAST:event_btn_a11ActionPerformed

    private void btn_a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a10ActionPerformed
        
    }//GEN-LAST:event_btn_a10ActionPerformed

    private void btn_a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a12ActionPerformed
        
    }//GEN-LAST:event_btn_a12ActionPerformed

    private void btn_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a1ActionPerformed

    }//GEN-LAST:event_btn_a1ActionPerformed

    private void btn_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a3ActionPerformed

    }//GEN-LAST:event_btn_a3ActionPerformed

    private void btn_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a2ActionPerformed
  
    }//GEN-LAST:event_btn_a2ActionPerformed

    private void btn_a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a4ActionPerformed
       
    }//GEN-LAST:event_btn_a4ActionPerformed

    private void btn_a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a5ActionPerformed
        
    }//GEN-LAST:event_btn_a5ActionPerformed

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
            java.util.logging.Logger.getLogger(musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_a1;
    private javax.swing.JButton btn_a10;
    private javax.swing.JButton btn_a11;
    private javax.swing.JButton btn_a12;
    private javax.swing.JButton btn_a2;
    private javax.swing.JButton btn_a3;
    private javax.swing.JButton btn_a4;
    private javax.swing.JButton btn_a5;
    private javax.swing.JButton btn_a6;
    private javax.swing.JButton btn_a7;
    private javax.swing.JButton btn_a8;
    private javax.swing.JButton btn_a9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
