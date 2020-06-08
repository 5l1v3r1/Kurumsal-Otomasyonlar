/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe_Restaurant;

/**
 *
 * @author duman
 */
public class Anasayfa extends javax.swing.JFrame {

    /**
     * Creates new form Anasayfa
     */
    public Anasayfa() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);// tam ekran çalıştırma 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setText("Depolar");
        jButton5.setPreferredSize(new java.awt.Dimension(93, 100));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafe/Restaurant ");
        setBackground(new java.awt.Color(0, 0, 204));
        setForeground(java.awt.Color.red);
        setLocationByPlatform(true);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.jpg"))); // NOI18N
        jButton1.setText("Post");
        jButton1.setMaximumSize(new java.awt.Dimension(400, 400));
        jButton1.setMinimumSize(new java.awt.Dimension(300, 300));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 90));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/Ürünler1.jpg"))); // NOI18N
        jButton6.setText("Raporlar");
        jButton6.setMaximumSize(new java.awt.Dimension(400, 400));
        jButton6.setMinimumSize(new java.awt.Dimension(300, 300));
        jButton6.setPreferredSize(new java.awt.Dimension(93, 100));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/Yönetim.jpg"))); // NOI18N
        jButton7.setText("Yönetim");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton7.setIconTextGap(-4);
        jButton7.setMaximumSize(new java.awt.Dimension(400, 400));
        jButton7.setMinimumSize(new java.awt.Dimension(300, 300));
        jButton7.setPreferredSize(new java.awt.Dimension(93, 100));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 102, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/Gün işlemleri.jpg"))); // NOI18N
        jButton8.setText("Gün İşlemleri");
        jButton8.setMaximumSize(new java.awt.Dimension(400, 400));
        jButton8.setMinimumSize(new java.awt.Dimension(300, 300));
        jButton8.setPreferredSize(new java.awt.Dimension(93, 100));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/Çıkış..jpg"))); // NOI18N
        jButton2.setText("Çıkış");
        jButton2.setMaximumSize(new java.awt.Dimension(400, 400));
        jButton2.setMinimumSize(new java.awt.Dimension(300, 300));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/restaurant-cafe-logo-.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
  yonetm frame=new yonetm();//tıklandığında yönetim sayafasına bağlıyor
  frame.setVisible(true);//sayafayı göster
  this.dispose();//var olan sayfayı kapat
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Masalar01 frame=new Masalar01();
    frame.setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 KullaniciGirisi frame= new KullaniciGirisi();
        frame.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      urunler frame=new urunler();
      frame.setVisible(true);
      this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    Gunİslemleri frame=new Gunİslemleri();
    frame.setVisible(true);
    this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
