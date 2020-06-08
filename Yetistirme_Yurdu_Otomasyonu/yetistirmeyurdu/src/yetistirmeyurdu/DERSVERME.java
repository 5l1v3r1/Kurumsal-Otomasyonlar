
package yetistirmeyurdu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DERSVERME extends javax.swing.JFrame {
    
   Connection conn = null;
    Statement stmt=null;
    ResultSet rs=null;
    
     public void baglan() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/yetistirme", "root", "");
    }

  
    public DERSVERME() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/işlem.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 40, 130, 120);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("GÖNÜLLÜ DERS VERME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 10, 270, 22);

        jLabel3.setText("DERSİ VERENİN ;");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 60, 100, 14);

        jLabel4.setText("ADI :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 94, 50, 10);

        jLabel5.setText("SOYADI :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 130, 70, 14);

        jLabel6.setText("VERECEĞİ DERSİN ADI :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 170, 150, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(250, 90, 120, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(250, 130, 120, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(250, 170, 120, 20);

        jButton1.setText("KAYDET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 230, 90, 23);

        jButton2.setText("SİL");
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 230, 100, 23);

        jToggleButton1.setText("SOSYAL FAALİYET");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(160, 300, 160, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/259225__nature-flowers-landscapes-grass-sky-sun-light_p.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -6, 530, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        sosyaletkinlik admin = new sosyaletkinlik ();
        this.setVisible(false);
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DERSVERME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
