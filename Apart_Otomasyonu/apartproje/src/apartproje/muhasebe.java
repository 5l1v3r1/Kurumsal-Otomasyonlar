/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartproje;
import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author delll
 */
public class muhasebe extends javax.swing.JFrame {

     Connection conn = null;
    Statement stmt=null;
    ResultSet rs=null;
    
    public void baglan() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/apart", "root", "");
    } 
   

     
  public void aratablodoldur(String ad) throws SQLException {

        String gelenad=ad;
        String baslik[] = new String[]{"ogr_id","ogr_ad", "ogr_soyad", "ogr_dno", "ogr_borc", "ogr_odeme", "ogr_taksit", "ogr_depozito", "ogr_aciklama","odenmis_taksit_sayisi"};

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
                    rs.getInt("ogr_id"),
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
        }}
  /**
     *
     * @param ad
     * @throws SQLException
     */
   
 public void tablodoldur() throws SQLException {


        String baslik[] = new String[]{"ogr_id","ogr_ad","ogr_soyad","ogr_dno","ogr_borc", "ogr_odeme", "ogr_taksit", "depozito","ogr_aciklama","odenmis_taksit_sayisi"};

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
                    rs.getInt("ogr_id"),
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
        } catch (Exception ex) {}
     
 
 }
     public void textFieldTEmizle() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
    }
 public void ogrenciGuncelle(String ogr_id, String ogr_ad, String ogr_soyad, String ogr_dno, String ogr_borc,
            String ogr_odeme, String ogr_taksit, String ogr_depozito,String ogr_aciklama,String odenmis_taksit_sayisi, String guncellenecekVeriId) {
        
     try {
         try {
             baglan();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(muhasebe.class.getName()).log(Level.SEVERE, null, ex);
         }
           String sql = "UPDATE ogrenci SET " + 
                   "ogr_id = '" + ogr_id + 
                    "ogr_ad = '" + ogr_ad + 
                    "', ogr_soyad='" + ogr_soyad +
                    "', ogr_dno=" + ogr_dno + 
                    ", ogr_borc='" + ogr_borc +
                    "', ogr_odeme='" + ogr_odeme +
                    "', ogr_taksit='" + ogr_taksit+ 
                    "', ogr_depozito='" + ogr_depozito +
                     "', ogr_aciklama='" + ogr_aciklama +
                            "', odenmis_taksit_sayisi='" + odenmis_taksit_sayisi +
                    "' WHERE ogr_id=" + guncellenecekVeriId;
            
           
            stmt = conn.createStatement();
             rs = stmt.executeQuery(sql);
conn.close();
                    tablodoldur();
                    textFieldTEmizle();
                    JOptionPane.showMessageDialog(null, "Öğrenci Başarıyla Güncellendi...");
            
        } catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, "hata!!!\n" + e);
        }
    }
 public muhasebe() throws SQLException {
        initComponents();
       
        tablodoldur();
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        ogr_ad = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/ai.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel2.setMinimumSize(null);
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(700, 500));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MUHASEBE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 69, 17);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/1464592347_exit.png"))); // NOI18N
        jButton6.setText("Çıkış Yap");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(637, 10, 100, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Öğrenci Adı");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 60, 80, 17);

        ogr_ad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(ogr_ad);
        ogr_ad.setBounds(120, 50, 125, 30);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/1464595104_edit.png"))); // NOI18N
        jButton9.setText("Ödemeyi Kaydet");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(590, 370, 140, 30);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/ui_04_of_9-15-24.png"))); // NOI18N
        jButton10.setText("BUL");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(260, 50, 140, 30);

        jPanel10.setLayout(null);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "AD", "SOYAD", "Daire NO", "TOPLAM BORÇ", "ÖDEME ŞEKLİ", "TAKSİT SAYISI", "DEPOZİTO", "AÇIKLAMA", "Ödenmiş Taksit Sayisi"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable4MousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jPanel10.add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 720, 100);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/ai.jpg"))); // NOI18N
        jLabel19.setText("jLabel1");
        jLabel19.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel19.setMinimumSize(null);
        jLabel19.setName(""); // NOI18N
        jLabel19.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel10.add(jLabel19);
        jLabel19.setBounds(-20, -100, 760, 480);

        jTabbedPane7.addTab("ÖĞRENCİNİN ÖDEME PLANI", jPanel10);

        getContentPane().add(jTabbedPane7);
        jTabbedPane7.setBounds(10, 120, 720, 130);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/cancel.png"))); // NOI18N
        jButton8.setText("İptal");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(590, 410, 140, 30);

        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 270, 100, 30);

        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 310, 100, 30);

        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(100, 350, 100, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(100, 390, 100, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(100, 430, 100, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(390, 270, 100, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(390, 310, 100, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(390, 350, 100, 30);

        jTextField9.setEnabled(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(390, 390, 100, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Öğrenci İd");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 280, 80, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ödenmiş Taksit Sayısı");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(230, 430, 140, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Öğrenci Soyadı");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 350, 80, 20);
        jLabel22.getAccessibleContext().setAccessibleDescription("");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Daire No");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(10, 390, 80, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Toplam Borç");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(10, 430, 80, 20);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Ödeme Şekli");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(230, 280, 80, 20);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Taksit Sayısı");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(230, 320, 80, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Depozito");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(230, 360, 80, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Açıklama");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(230, 400, 80, 20);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(390, 430, 100, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Öğrenci Adı");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(10, 320, 80, 17);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartproje/ai.jpg"))); // NOI18N
        jLabel15.setText("jLabel1");
        jLabel15.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel15.setMinimumSize(null);
        jLabel15.setName(""); // NOI18N
        jLabel15.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(-10, 0, 760, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        giris girissayfa=new giris();
        girissayfa.setVisible(true);
        this.hide();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
  ogrenciGuncelle(
                jTextField1.getText(),
                jTextField2.getText(),
                jTextField3.getText(),
                jTextField4.getText(),
                jTextField5.getText(),
                jTextField6.getText(),
                jTextField7.getText(),
                jTextField8.getText(),
                jTextField9.getText(),
                jTextField10.getText(),
                jTable4.getValueAt(jTable4.getSelectedRow(), 3).toString());     
          
       
    }//GEN-LAST:event_jButton9ActionPerformed
  
     
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 try {
        String gidenad=ogr_ad.getText();
        aratablodoldur(gidenad);
       }
       catch(Exception e){} 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

       giris giris = new giris();
      giris.setVisible(true);
    this.hide(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MousePressed
jTextField1.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
        jTextField2.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString());
        jTextField3.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString());
        jTextField4.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 3).toString());
        jTextField5.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 4).toString());
        jTextField6.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 5).toString());
        jTextField7.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 6).toString());
        jTextField8.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 7).toString());
        jTextField9.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 8).toString());
        jTextField10.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 9).toString());
            }//GEN-LAST:event_jTable4MousePressed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(muhasebe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(muhasebe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(muhasebe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(muhasebe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
                try {
                  new muhasebe().setVisible(true);
    
                } catch (SQLException ex) {
                    Logger.getLogger(muhasebe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField ogr_ad;
    // End of variables declaration//GEN-END:variables
}
