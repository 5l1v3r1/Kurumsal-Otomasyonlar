
package yetistirmeyurdu;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ogrenci_kayit extends javax.swing.JFrame {
 Connection conn = null;
    Statement stmt=null;
    ResultSet rs=null;
    
     public void baglan() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/yetistirme", "root", "");
    }
    public ogrenci_kayit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ADI :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 120, 90, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("SOYADI :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 160, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("YAŞI :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 210, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("OKULU :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 260, 80, 17);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(290, 100, 130, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(290, 150, 130, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(290, 200, 130, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(290, 250, 130, 30);

        jToggleButton1.setText("KAYDET");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(210, 300, 130, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("ÖĞRENCİ KAYDET");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 50, 190, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/ÖĞRENCİ22.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 120, 120, 130);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/259225__nature-flowers-landscapes-grass-sky-sun-light_p.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -6, 540, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     
        String ad = jTextField1.getText();
        String soyad = jTextField2.getText();
        String yas = jTextField3.getText();
        String cinsiyet = jTextField4.getText();
        
        try {

            baglan();
            String sorgu = "insert into kayıt_ekle (Ad,Soyad,Yas,Cinsiyet) values ('" + ad + "','" + soyad + "','" + yas + "','" + cinsiyet + "' )";
            Statement stmt1 = conn.createStatement();
            JOptionPane.showMessageDialog(rootPane, "Eklendi");
            stmt1.executeUpdate(sorgu);
            conn.close();
            ogrenci_kayit ekle = new ogrenci_kayit ();
        this.setVisible(false);
        ekle.setVisible(true);
        dispose();

        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            Logger.getLogger(ogrenci_kayit.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(() -> {
             new ogrenci_kayit().setVisible(true);
        });
       

    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
 
    }//GEN-LAST:event_jToggleButton1ActionPerformed

   
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

