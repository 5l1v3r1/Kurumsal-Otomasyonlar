/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartproje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author delll
 */
public class personelmhs extends javax.swing.JFrame {

    /**
     * Creates new form personelmhs
     */
    public personelmhs() throws SQLException {
        initComponents();
        tablodoldur();
    }
      Connection conn = null;
    Statement stmt=null;
    ResultSet rs=null;
    
    public void baglan() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/apart", "root", "");
    } 
    public void tablodoldur() throws SQLException {


        String baslik[] = new String[]{ "ogr_ad", "ogr_soyad","ogr_dno", "ogr_borc", "ogr_odeme", "ogr_taksit", "ogr_depozito", "ogr_aciklama","odenmis_taksit_sayisi"};

        try {
            baglan();

            String sorgu = "select * from ogrenci";

            stmt = conn.createStatement();
             rs = stmt.executeQuery(sorgu);

            // kac tane kayit var onu buluyor
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();


            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{
                    rs.getString("ogr_ad"),
                    rs.getString("ogr_soyad"),
                    rs.getString("ogr_dno"),
                    rs.getString("ogr_borc"),
                    rs.getString("ogr_odeme"),
                    rs.getString("ogr_taksit"),
                    rs.getString("ogr_depozito"),
                    rs.getString("ogr_aciklama"),
                    rs.getString("odenmis_taksit_sayisi")
                };
                i++;
            }
            conn.close();
            jTable4.setModel(new DefaultTableModel(data, baslik));
        } catch (Exception ex) {
        }}
public void aratablodoldur(String ad) throws SQLException {

        String gelenad=ad;
        String baslik[] = new String[]{ "ogr_ad", "ogr_soyad","ogr_dno", "ogr_borc", "ogr_odeme", "ogr_taksit", "ogr_depozito", "ogr_aciklama","odenmis_taksit_sayisi"};

        try {
            baglan();

            String sorgu = "select * from ogrenci where ogr_ad like '%"+gelenad+"%'";
          
            stmt = conn.createStatement();
             rs = stmt.executeQuery(sorgu);

            // kac tane kayit var onu buluyor
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();


            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{
                    rs.getString("ogr_ad"),
                    rs.getString("ogr_soyad"),
                    rs.getString("ogr_dno"),
                    rs.getString("ogr_borc"),
                    rs.getString("ogr_odeme"),
                    rs.getString("ogr_taksit"),
                    rs.getString("ogr_depozito"),
                    rs.getString("ogr_aciklama"),
                    rs.getString("odenmis_taksit_sayisi")
                };
                i++;
            }
            conn.close();
            jTable4.setModel(new DefaultTableModel(data, baslik));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "HATA!!");
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

        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ogr_ad = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(760, 480));
        setPreferredSize(new java.awt.Dimension(760, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(null);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "AD", "SOYAD", "Daire NO", "TOPLAM BORÇ", "ÖDEME ŞEKLİ", "TAKSİT SAYISI", "DEPOZİTO", "AÇIKLAMA", "Ödenmiş Taksit Sayisi"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jPanel10.add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 720, 180);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/ai.jpg"))); // NOI18N
        jLabel19.setText("jLabel1");
        jLabel19.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel19.setMinimumSize(null);
        jLabel19.setName(""); // NOI18N
        jLabel19.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel10.add(jLabel19);
        jLabel19.setBounds(-20, -100, 760, 480);

        jTabbedPane7.addTab("ÖĞRENCİLERİN ÖDEME PLANI", jPanel10);

        getContentPane().add(jTabbedPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 720, 210));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Öğrenci Adı");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        ogr_ad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(ogr_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 100, 30));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/ui_04_of_9-15-24.png"))); // NOI18N
        jButton10.setText("BUL");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/arrow-left-circle-blue-20.png"))); // NOI18N
        jButton1.setText("Geri Dön");
        jButton1.setActionCommand("Geri Dön");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 130, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/ai.jpg"))); // NOI18N
        jLabel9.setText("jLabel1");
        jLabel9.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel9.setMinimumSize(null);
        jLabel9.setName(""); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      try {
        String gidenad=ogr_ad.getText();
        aratablodoldur(gidenad);
       }
       catch(Exception e){}
                                            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       personel prs=new personel();
       prs.setVisible(true);
this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(personelmhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personelmhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personelmhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personelmhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new personelmhs().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(personelmhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField ogr_ad;
    // End of variables declaration//GEN-END:variables
}