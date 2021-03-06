/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stok_takip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fah
 */
public class satislar extends javax.swing.JFrame {

    /**
     * Creates new form satislar
     */
    
    private void satis_urunler(){
    
     try {
            String baslik[] = new String[]{ "Kategori", "Ürün Adı","Alıcı", "Ürün Kodu", "Renk", "Fiyat", "Adet", "Açıklama" };  
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/stok?useUnicode=true&characterEncoding=UTF-8", "root", "");
            
            st = con.createStatement();                
            rs = st.executeQuery("select * from satislar ORDER BY id DESC");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    
                    rs.getString("kategori"),
                    rs.getString("urunadi"),
                    rs.getString("alici"),
                    rs.getString("urunkodu"),
                    rs.getString("renk"),  
                    rs.getString("fiyat"),
                    rs.getString("adet"),
                    rs.getString("aciklama"), 
                };
                i++;
            }
           
            con.close();
            table_satistaki_urunler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }
    
    
    public satislar() {
        initComponents();
        
        satis_urunler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table_satistaki_urunler = new javax.swing.JTable();
        lbl_filtrele = new javax.swing.JLabel();
        txt_ara = new javax.swing.JTextField();
        btn_ara = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(760, 450));
        setPreferredSize(new java.awt.Dimension(760, 450));
        getContentPane().setLayout(null);

        table_satistaki_urunler.setModel(new javax.swing.table.DefaultTableModel(
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
        table_satistaki_urunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_satistaki_urunlerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_satistaki_urunler);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 123, 730, 224);

        lbl_filtrele.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_filtrele.setForeground(new java.awt.Color(255, 255, 255));
        lbl_filtrele.setText("Filtrele");
        getContentPane().add(lbl_filtrele);
        lbl_filtrele.setBounds(28, 61, 110, 22);
        getContentPane().add(txt_ara);
        txt_ara.setBounds(110, 60, 170, 30);

        btn_ara.setText("Ara");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ara);
        btn_ara.setBounds(300, 60, 49, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bg.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(760, 450));
        jLabel1.setMinimumSize(new java.awt.Dimension(760, 450));
        jLabel1.setPreferredSize(new java.awt.Dimension(760, 450));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(4, 4, 760, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_satistaki_urunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_satistaki_urunlerMouseClicked

         

    }//GEN-LAST:event_table_satistaki_urunlerMouseClicked

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed

        String ara =txt_ara.getText();
        String baslik[] = new String[]{"Kategori", "Ürün Adı", "Alıcı", "Ürün Kodu", "Renk", "Fiyat", "Adet", "Açıklama" };

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/stok?useUnicode=true&characterEncoding=UTF-8", "root", "");

            String sorgu ="select * from satislar where urunadi like '%"+txt_ara.getText()+"%' or"
            +" kategori like '%"+txt_ara.getText()+"%' or"
            +" urunkodu like '%"+txt_ara.getText()+"%' or"
            +" renk like '%"+txt_ara.getText()+"%' or"
            +" alici like '%"+txt_ara.getText()+"%' ";

            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();

            int say = rs.getRow();
            rs.beforeFirst();

            String sayi = null;
            sayi = String.valueOf(rs.getRow());

            if(say < 1){
                JOptionPane.showMessageDialog(null, "Aradığınız Ürün Bulunamadı!");
            }
            else{
                Object data[][] = new Object[say][];
                int i = 0;

                while (rs.next()) {

                    data[i] = new Object[]{

                        rs.getString("kategori"),
                        rs.getString("urunadi"),
                        rs.getString("alici"),
                        rs.getString("urunkodu"),
                        rs.getString("renk"),
                        rs.getString("fiyat"),
                        rs.getString("adet"),
                        rs.getString("aciklama"),
                    };
                    i++;
                }
                table_satistaki_urunler.setModel(new DefaultTableModel(data, baslik));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_araActionPerformed

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
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satislar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_filtrele;
    private javax.swing.JTable table_satistaki_urunler;
    private javax.swing.JTextField txt_ara;
    // End of variables declaration//GEN-END:variables
}
