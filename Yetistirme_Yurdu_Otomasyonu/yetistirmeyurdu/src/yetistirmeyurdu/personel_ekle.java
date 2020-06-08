
package yetistirmeyurdu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class personel_ekle extends javax.swing.JFrame {
   Connection conn = null;
    Statement stmt=null;
    ResultSet rs=null;
    public personel_ekle() {
        initComponents();
    }
     public void baglan() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/yetistirme", "root", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("ADI :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(85, 82, 25, 14);

        jLabel2.setText("SOYADI :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(72, 120, 45, 14);

        jLabel3.setText("NO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(72, 158, 19, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(155, 79, 89, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(155, 117, 89, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(155, 155, 89, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PERSONEL EKLE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(129, 19, 102, 17);

        jButton1.setText("EKLE");
        getContentPane().add(jButton1);
        jButton1.setBounds(292, 241, 79, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/259225__nature-flowers-landscapes-grass-sky-sun-light_p.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -6, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personel_ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
