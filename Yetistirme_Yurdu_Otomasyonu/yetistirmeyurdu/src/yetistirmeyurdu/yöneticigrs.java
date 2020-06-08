
package yetistirmeyurdu;

import javax.swing.JOptionPane;


public class yöneticigrs extends javax.swing.JFrame {

    
    public yöneticigrs() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kadi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        sifre = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/kullanıc2ı.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 50, 150, 160);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("KULLANICI ADI :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 100, 100, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ŞİFRE :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 150, 90, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("YÖNETİCİ GİRİŞİ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 30, 200, 22);

        kadi.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(kadi);
        kadi.setBounds(310, 100, 110, 30);

        jButton1.setText("GİRİŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 220, 100, 30);

        sifre.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(sifre);
        sifre.setBounds(310, 140, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/a5.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1404, 768));
        jLabel5.setMinimumSize(new java.awt.Dimension(1404, 768));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 470, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String username=kadi.getText();
        String pswrd=sifre.getText();
        try {
            if (username.equals("admin") &&pswrd.equals("admin") )
            {
        yönetici admin = new yönetici ();
        this.setVisible(false);
        admin.setVisible(true);
        dispose();
            }
            else {
                
            JOptionPane.showMessageDialog(null, "kullanıcı adı veya şifre hatalı");            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "hata"+ex);
        }

    }
    
  
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yöneticigrs().setVisible(true);
            }
        });
    
    }//GEN-LAST:event_jButton1ActionPerformed
         
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField sifre;
    private javax.swing.JTextField kadi;
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

