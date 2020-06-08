/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package muzeotomasyon;

import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *

 */
public class ziyaretcigiris extends javax.swing.JFrame {

    /**
     * Creates new form pencere1
     */
    public ziyaretcigiris() {
        initComponents();
    }

    public void giris(String gkadi, String gsifre) throws SQLException {

        String gelenkadi = gkadi;
        String gelensifre = gsifre;
    Connection conn = null;


        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/müze1", "root", "");

            String sorgu = "select * from uyeler where Kadi ='" + gelenkadi + "' and Sifre ='" + gelensifre + "'";

        
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sorgu);
       
            // herhangi bir kayit kalmadiginda -1 dondurur, yani false.
            if (rs.first()) {
 
             
               ziyaretci prsnl = new ziyaretci ();
        this.setVisible(false);
        prsnl.setVisible(true);
        dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Kullanici Adi veya Sifre Hatali");
                kadi.setText("");
                sifre.setText("");
            }
            conn.close();

        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sifre = new javax.swing.JPasswordField();
        kadi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("YÖNETİCİ GİRİŞİ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Sifre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jButton1.setText("Giriş Yap");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 91, -1));
        getContentPane().add(sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 141, -1));
        getContentPane().add(kadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 141, -1));

        jLabel1.setText("Kullanici Adi:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("ZİYARETÇİ GİRİŞİ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 142, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String gelenkadi = kadi.getText();
            String gelensifre = sifre.getText();
            

            giris(gelenkadi, gelensifre);

        } catch (Exception ex) {
        

    }//GEN-LAST:event_jButton1ActionPerformed
 }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(ziyaretcigiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ziyaretcigiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ziyaretcigiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ziyaretcigiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ziyaretcigiris().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kadi;
    private javax.swing.JPasswordField sifre;
    // End of variables declaration//GEN-END:variables
}
