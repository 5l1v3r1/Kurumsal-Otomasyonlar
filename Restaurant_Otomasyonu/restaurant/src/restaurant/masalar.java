/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fah
 */
public class masalar extends javax.swing.JFrame {

    /**
     * Creates new form masalar
     */
    public masalar() {
        initComponents();
        
        
        String baslik[] = new String[]{"Ad Soyad", "Telefon", "Masa No", "Kişi Sayısı"};  

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from musteriler order by id desc";             
            rs = st.executeQuery(sorgu21);
            
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("adi_soyadi"),  
                    rs.getString("tel"),
                    rs.getString("masa_konumu"),
                    rs.getString("kisi_sayisi"),
                    
                };
                i++;
            }
           
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3,st4,st5= null;
            ResultSet rs,rs2,rs3,rs4,rs5 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            st = con.createStatement();
            st2 = con.createStatement();
            st3 = con.createStatement();
            st4 = con.createStatement();
            st5 = con.createStatement();

            rs = st.executeQuery("select * from musteriler where masa_konumu='Masa 1' and giris_cikis='1'");
            rs.last();
            int kayitsayisi = rs.getRow();            
            if(kayitsayisi > 0){                
                btn_masa1.setText(rs.getString("adi_soyadi"));
                btn_masa1.setBackground(Color.RED);             
            }
            else {
                btn_masa1.setBackground(Color.BLUE);
            }
            
            rs2 = st2.executeQuery("select * from musteriler where masa_konumu='Masa 2' and giris_cikis='1'");
            rs2.last();
            int kayitsayisi2 = rs2.getRow();            
            if(kayitsayisi2 > 0){                
                btn_masa2.setText(rs2.getString("adi_soyadi"));
                btn_masa2.setBackground(Color.RED);                
            }
            else {
                btn_masa2.setBackground(Color.BLUE);
            }
                
            
            rs3 = st3.executeQuery("select * from musteriler where masa_konumu='Masa 3' and giris_cikis='1'");
            rs3.last();
            int kayitsayisi3 = rs3.getRow();            
            if(kayitsayisi3 > 0){                
                btn_masa3.setText(rs3.getString("adi_soyadi"));
                btn_masa3.setBackground(Color.RED);             
            }
            else {
                btn_masa3.setBackground(Color.BLUE);
            }
            
            rs4 = st4.executeQuery("select * from musteriler where masa_konumu='Masa 4' and giris_cikis='1'");
            rs4.last();
            int kayitsayisi4 = rs4.getRow();            
            if(kayitsayisi4 > 0){                
                btn_masa4.setText(rs4.getString("adi_soyadi"));
                btn_masa4.setBackground(Color.RED);             
            }
            else {
                btn_masa4.setBackground(Color.BLUE);
            }
            
            rs5 = st5.executeQuery("select * from musteriler where masa_konumu='Masa 5' and giris_cikis='1'");
            rs5.last();
            int kayitsayisi5 = rs5.getRow();            
            if(kayitsayisi5 > 0){                
                btn_masa5.setText(rs5.getString("adi_soyadi"));
                btn_masa5.setBackground(Color.RED);             
            }
            else {
                btn_masa5.setBackground(Color.BLUE);
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

        btn_masa1 = new javax.swing.JButton();
        btn_masa2 = new javax.swing.JButton();
        btn_masa5 = new javax.swing.JButton();
        btn_masa3 = new javax.swing.JButton();
        btn_masa4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_sayisi = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_adi = new javax.swing.JTextField();
        btn_iptal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_musteriler = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_masa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_masa1.setText("Masa 1");
        btn_masa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa1ActionPerformed(evt);
            }
        });

        btn_masa2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_masa2.setText("Masa 2");
        btn_masa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa2ActionPerformed(evt);
            }
        });

        btn_masa5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_masa5.setText("Masa 5");
        btn_masa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa5ActionPerformed(evt);
            }
        });

        btn_masa3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_masa3.setText("Masa 3");
        btn_masa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa3ActionPerformed(evt);
            }
        });

        btn_masa4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_masa4.setText("Masa 4");
        btn_masa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masa4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Bilgileri"));

        btn_iptal.setText("Rezervasyon İptal");
        btn_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iptalActionPerformed(evt);
            }
        });

        jLabel1.setText("Adı Soyadı");

        jLabel2.setText("Telefon");

        jLabel3.setText("Kişi Sayısı");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        table_musteriler.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_musteriler);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_masa1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_masa2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_masa3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_masa4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_masa5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_masa1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_masa2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_masa3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_masa4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_masa5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_masa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa1ActionPerformed
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from musteriler where masa_konumu='Masa 1' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();            
            if(kayitsayisi < 1){
                
                rezervasyon_al r = new rezervasyon_al();
                r.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("adi_soyadi"));
                txt_tel.setText(rs.getString("tel"));
                txt_sayisi.setText(rs.getString("kisi_sayisi"));
            }
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }//GEN-LAST:event_btn_masa1ActionPerformed

    private void btn_masa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa2ActionPerformed
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from musteriler where masa_konumu='Masa 2' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();            
            if(kayitsayisi < 1){
                
                rezervasyon_al r = new rezervasyon_al();
                r.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("adi_soyadi"));
                txt_tel.setText(rs.getString("tel"));
                txt_sayisi.setText(rs.getString("kisi_sayisi"));
            }
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }//GEN-LAST:event_btn_masa2ActionPerformed

    private void btn_masa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa4ActionPerformed
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from musteriler where masa_konumu='Masa 4' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();            
            if(kayitsayisi < 1){
                
                rezervasyon_al r = new rezervasyon_al();
                r.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("adi_soyadi"));
                txt_tel.setText(rs.getString("tel"));
                txt_sayisi.setText(rs.getString("kisi_sayisi"));
            }
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }//GEN-LAST:event_btn_masa4ActionPerformed

    private void btn_masa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa3ActionPerformed
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from musteriler where masa_konumu='Masa 3' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();            
            if(kayitsayisi < 1){
                
                rezervasyon_al r = new rezervasyon_al();
                r.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("adi_soyadi"));
                txt_tel.setText(rs.getString("tel"));
                txt_sayisi.setText(rs.getString("kisi_sayisi"));
            }
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }//GEN-LAST:event_btn_masa3ActionPerformed

    private void btn_masa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masa5ActionPerformed
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from musteriler where masa_konumu='Masa 5' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();            
            if(kayitsayisi < 1){
                
                rezervasyon_al r = new rezervasyon_al();
                r.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("adi_soyadi"));
                txt_tel.setText(rs.getString("tel"));
                txt_sayisi.setText(rs.getString("kisi_sayisi"));
            }
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }//GEN-LAST:event_btn_masa5ActionPerformed

    private void btn_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iptalActionPerformed
        
        try{
            
            String tel=txt_tel.getText();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st, st2 = null;
            ResultSet rs, rs2 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            st = con.createStatement();
            st2 = con.createStatement();

            rs2 = st2.executeQuery("select * from musteriler where tel='"+tel+"'");
            rs2.next();

            String sql1 = "update musteriler set giris_cikis='0' where tel='"+tel+"'";
            st.executeUpdate(sql1);

            JOptionPane.showMessageDialog(null, "Rezervasyon İptali Gerçekleştirilmiştir.");
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }//GEN-LAST:event_btn_iptalActionPerformed

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
            java.util.logging.Logger.getLogger(masalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masalar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iptal;
    private javax.swing.JButton btn_masa1;
    private javax.swing.JButton btn_masa2;
    private javax.swing.JButton btn_masa3;
    private javax.swing.JButton btn_masa4;
    private javax.swing.JButton btn_masa5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_musteriler;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_sayisi;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
