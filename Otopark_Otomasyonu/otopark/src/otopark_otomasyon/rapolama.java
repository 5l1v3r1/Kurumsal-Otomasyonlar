/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otopark_otomasyon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enes ŞAHİNER
 */

public class rapolama extends javax.swing.JFrame {

    /**
     * Creates new form rapolama
     */
    public rapolama() {
        super("Gün Sonu Hesaplaması");
        
        initComponents();
        
        String baslik[] = new String[]{"Ad Soyad", "Plaka", "Marka", "renk", "cep_no", "giris_cikis", "tarihi", "saati", "tipi", "ucret", "toplam_ucret", "yeri" };  

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from araclar order by id desc";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu21);
            
            rs.last();
            int kayitsayisi = rs.getRow();
            
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("ad_soyad"),
                    rs.getString("plaka"),
                    rs.getString("marka"),
                    rs.getString("renk"),
                    rs.getString("cep_no"),  
                    rs.getString("giris_cikis"),
                    rs.getString("tarihi"),
                    rs.getString("saati"),                    
                    rs.getString("tipi"),  
                    rs.getString("ucret"),
                    rs.getString("toplam_ucret"),
                    rs.getString("yeri"),
                };
                i++;
            }
           
            table_araclar.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
        /*******************************/
        
        try{
            
            SimpleDateFormat bicim3=new SimpleDateFormat("hh.mm");
            GregorianCalendar gcalender=new GregorianCalendar();
            
            String saati=bicim3.format(gcalender.getTime());
            
            String[] Aylar = { "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
            "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
 
        
            Calendar takvim = Calendar.getInstance();
            String tarih = takvim.get(Calendar.DATE) + " " + Aylar[takvim.get(Calendar.MONTH)]
                    + " " + takvim.get(Calendar.YEAR);
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            st2 = con.createStatement();
            st3 = con.createStatement();

            rs = st.executeQuery("select sum(toplam_ucret) as sonuc from araclar where giris_cikis='0'");
            rs2 = st2.executeQuery("select count(tipi) as toplam_otomobil from araclar where tipi='Otomobil'");
            rs3 = st3.executeQuery("select count(tipi) as toplam_kamyon from araclar where tipi='Kamyon'");
            
            rs.next();
            rs2.next();
            rs3.next();

            int toplam_ucret = Integer.parseInt(rs.getString("sonuc"));

            txt_tarih.setText(String.valueOf(tarih));
            txt_ucret.setText(String.valueOf(toplam_ucret) + " TL");
            txt_otomobil.setText(rs2.getString("toplam_otomobil"));
            txt_kamyon.setText(rs3.getString("toplam_kamyon"));
            
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_tarih = new javax.swing.JTextField();
        txt_kamyon = new javax.swing.JTextField();
        txt_otomobil = new javax.swing.JTextField();
        txt_ucret = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_araclar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        uye_btn = new javax.swing.JButton();
        park_btn = new javax.swing.JButton();
        yeniarac_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 570));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setText("Giren Kamyon Sayısı");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 130, 120, 14);

        jLabel5.setText("Tarih");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 90, 70, 14);

        jLabel6.setText("Toplam Ücret");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 210, 90, 14);
        jPanel1.add(txt_tarih);
        txt_tarih.setBounds(300, 80, 130, 30);
        jPanel1.add(txt_kamyon);
        txt_kamyon.setBounds(300, 120, 130, 30);
        jPanel1.add(txt_otomobil);
        txt_otomobil.setBounds(300, 160, 130, 30);
        jPanel1.add(txt_ucret);
        txt_ucret.setBounds(300, 200, 130, 30);

        jButton1.setText("ÇIKIŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 20, 80, 23);

        table_araclar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_araclar);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 291, 1060, 206);

        jLabel2.setText("Giren Otomobil Sayısı");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 170, 130, 14);

        uye_btn.setText("ÜYE EKLE");
        uye_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_btnActionPerformed(evt);
            }
        });
        jPanel1.add(uye_btn);
        uye_btn.setBounds(660, 90, 100, 23);

        park_btn.setText("PARK EKRANI");
        park_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                park_btnActionPerformed(evt);
            }
        });
        jPanel1.add(park_btn);
        park_btn.setBounds(640, 130, 120, 23);

        yeniarac_btn.setText("YENİ ARAÇ EKLE");
        yeniarac_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniarac_btnActionPerformed(evt);
            }
        });
        jPanel1.add(yeniarac_btn);
        yeniarac_btn.setBounds(630, 170, 130, 23);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(32, 436, 0, 0);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1070, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rapolama ac = new rapolama();
        ac.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uye_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_btnActionPerformed
        String mudur = "Müdür";
        uye_ekle ac = new uye_ekle(mudur);
        ac.setVisible(true);
        
    }//GEN-LAST:event_uye_btnActionPerformed

    private void park_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_park_btnActionPerformed
        park_ekrani ac = new park_ekrani();
        ac.setVisible(true);
    }//GEN-LAST:event_park_btnActionPerformed

    private void yeniarac_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniarac_btnActionPerformed
        araclar ac = new araclar();
        ac.setVisible(true);
    }//GEN-LAST:event_yeniarac_btnActionPerformed

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
            java.util.logging.Logger.getLogger(rapolama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rapolama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rapolama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rapolama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rapolama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton park_btn;
    private javax.swing.JTable table_araclar;
    private javax.swing.JTextField txt_kamyon;
    private javax.swing.JTextField txt_otomobil;
    private javax.swing.JTextField txt_tarih;
    private javax.swing.JTextField txt_ucret;
    private javax.swing.JButton uye_btn;
    private javax.swing.JButton yeniarac_btn;
    // End of variables declaration//GEN-END:variables
}
