/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yetistirmeyurdu;

/**
 *
 * @author acerr
 */
public class anasayfa extends javax.swing.JFrame {

   
    public anasayfa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("YÖNETİCİ GİRİŞİ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 120, 170, 50);

        jButton2.setText("PERSONEL GİRİŞİ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 190, 170, 50);

        jButton3.setText("ÖĞRENCİ KAYDET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 260, 170, 50);

        jButton4.setText("KORUYUCU AİLE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(360, 330, 170, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("YETİŞTİRME  YURDU OTOMASYONU");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 30, 420, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/boss-icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 110, 50, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/icon_user.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 190, 50, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/kulanıcıekle.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 260, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/koruyucu.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 330, 50, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/96ed3shutterstock_104297528----Bulutlu-gokyuzu-ve-beyaz-cicekler.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, -20, 600, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    yöneticigrs admin = new yöneticigrs ();
        this.setVisible(false);
        admin.setVisible(true);
        dispose();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       personelgiris personel = new personelgiris ();
        this.setVisible(false);
        personel.setVisible(true);
        dispose();  
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    ogrenci_kayit ogrenci = new ogrenci_kayit ();
        this.setVisible(false);
        ogrenci.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   koruyucu_aile aile = new koruyucu_aile ();
        this.setVisible(false);
        aile.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new anasayfa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
