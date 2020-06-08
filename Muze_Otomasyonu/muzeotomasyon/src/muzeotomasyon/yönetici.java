/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muzeotomasyon;

import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class yönetici extends javax.swing.JFrame {

       Connection conn = null;
    Statement stmt=null;
    ResultSet rs=null;
    
    public void baglan() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/müze1", "root", "");
    }

    public void tablodoldur() throws SQLException {


        String baslik[] = new String[]{"id", "EserAdi", "Kategori","personel","Yil"};

        try {
            baglan();

            String sorgu = "select * from eserler";

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
                    rs.getInt("id"),
                    rs.getString("EserAdi"),
                    rs.getString("Kategori"),
                    rs.getString("personel"),
                    rs.getString("Yil")
                };
                i++;
            }
            conn.close();
            jTable2.setModel(new DefaultTableModel(data, baslik));
        } catch (Exception ex) {
        }

    }
    public void tablodoldur1() throws SQLException {


        String baslik[] = new String[]{"ıd", "Ad", "Soyad","No","Tel","Adre","Eserler"};

        try {
            baglan();

            String sorgu = "select * from personeller";

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
                    rs.getInt("ıd"),
                    rs.getString("Ad"),
                    rs.getString("Soyad"),
                    rs.getString("No"),
                    rs.getString("Tel"),
                    rs.getString("Adre"),
                    rs.getString("Eserler")
                    
                };
                i++;
            }
            conn.close();
            jTable3.setModel(new DefaultTableModel(data, baslik));
        } catch (Exception ex) {
        }

    }
    public void tablodoldur2() throws SQLException {


        String baslik[] = new String[]{"ıd", "Ad", "Soyad","Cinsiyet"};

        try {
            baglan();

            String sorgu = "select * from uyeler";

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
                    rs.getInt("ıd"),
                    rs.getString("Ad"),
                    rs.getString("Soyad"),
                    rs.getString("Cinsiyet"),
 
                    
                };
                i++;
            }
            conn.close();
            jTable4.setModel(new DefaultTableModel(data, baslik));
        } catch (Exception ex) {
        }

    }
        public void tablodoldur3() throws SQLException {


        String baslik2[] = new String[]{"id","Ad","Soyad","GirisTarihi","GirisSaati"};

        try {
            baglan();

            String sorgu = "select * from giriscikis";

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
                    rs.getInt("id"),
                    rs.getString("Ad"),
                    rs.getString("Soyad"),
                    rs.getString("GirisTarihi"),
                    rs.getString("GirisSaati"),
                    
                    
                };
                i++;
            }
            conn.close();
            jTable6.setModel(new DefaultTableModel(data, baslik2));
        } catch (Exception ex) {
        }

    } 
        
        public void tablodoldur4() throws SQLException {


        String baslik1[] = new String[]{"Gunler", "TarihiEserler", "SanatsalEserler","DiniEserler","YakinCagEserleri","OrtaCagEserleri","TasCagiEserleri","Romaİmparatorlugu","Bizansİmparatorlugu"};

        try {
            baglan();

            String sorgu = "select * from ziyaretsaatleri";

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
                    rs.getString("Gunler"),
                    rs.getString("TarihiEserler"),
                    rs.getString("SanatsalEserler"),
                    rs.getString("DiniEserler"),
                    rs.getString("YakinCagEserleri"),
                    rs.getString("OrtaCagEserleri"),
                    rs.getString("TasCagiEserleri"),
                    rs.getString("Romaİmparatorlugu"),
                    rs.getString("Bizansİmparatorlugu"),
                    
                };
                i++;
            }
            conn.close();
            jTable5.setModel(new DefaultTableModel(data, baslik1));
        } catch (Exception ex) {
        }

    } 
    public yönetici() throws SQLException {
        initComponents();
        tablodoldur();
        tablodoldur1();
        tablodoldur2();
        tablodoldur3();
        tablodoldur4();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(204, 204, 255)));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "İd", "Ad", "Soyad", "Cinsiyet"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 606, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 700, 340));

        jTabbedPane1.addTab("ÜYELERİMİZ", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 659, 118));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 340));

        jTabbedPane1.addTab("ZİYARET SAATLERİ", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton3.setText("Eser Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 261, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton4.setText("Eser Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 261, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton5.setText("Eser Güncelle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 261, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Eser Adı", "Kategori", "Eser Sorumlusu", "Geldiği Yıl"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 32, 556, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 340));

        jTabbedPane1.addTab("MÜZE ESERLERİ", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 204, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton6.setText("Personel Ekle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 244, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton8.setText("Personel Sil");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 244, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Adı", "Soyadı", "Personel No", "Adres", "Tel", "Eserler"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 44, 653, 164));

        jButton1.setText("Personel Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 244, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 340));

        jTabbedPane1.addTab("PERSONELLER", jPanel5);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 23, -1, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 340));

        jTabbedPane1.addTab("GİRİŞ-ÇIKIŞ", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 690, 360));

        jButton2.setText("Çıkış Yap");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       personelekle ekle = null;
           try {
               ekle = new personelekle ();
           } catch (SQLException ex) {
               Logger.getLogger(yönetici.class.getName()).log(Level.SEVERE, null, ex);
           }
        this.setVisible(false);
        ekle.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
try {
        baglan();
       
        String tablodangelen1 = jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString();
        JOptionPane.showMessageDialog(rootPane,tablodangelen1 );
        stmt = conn.createStatement();
        String sql = "DELETE FROM personeller "
                + "WHERE id = " + tablodangelen1;
        stmt.executeUpdate(sql);
         tablodoldur1();
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
         eserekle ekle = new eserekle ();
        this.setVisible(false);
        ekle.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try {
        baglan();
       
        String tablodangelen = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
        JOptionPane.showMessageDialog(rootPane,tablodangelen );
        stmt = conn.createStatement();
        String sql = "DELETE FROM eserler "
                + "WHERE id = " + tablodangelen;
        stmt.executeUpdate(sql);
         tablodoldur();
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    esergüncelle güncelle = new esergüncelle ();
        this.setVisible(false);
        güncelle.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       personelguncelle güncelle = null;
           try {
               güncelle = new personelguncelle ();
           } catch (SQLException ex) {
               Logger.getLogger(yönetici.class.getName()).log(Level.SEVERE, null, ex);
           }
        this.setVisible(false);

        güncelle.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        anasayfa ana = new anasayfa ();
        this.setVisible(false);
        ana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(yönetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yönetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yönetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yönetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new yönetici().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(yönetici.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
