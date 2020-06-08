
public class AnaMenu extends javax.swing.JFrame {


    public AnaMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDmrbasTanim = new javax.swing.JButton();
        btnKullaniciTanimlama = new javax.swing.JButton();
        btnGrupAltgrpTanım = new javax.swing.JButton();
        btnKullaniciMenu = new javax.swing.JButton();
        btnBolumTanimlama = new javax.swing.JButton();
        btnCalisanEkle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDmrbasTanim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDmrbasTanim.setText("Demirbaş Tanımlama");
        btnDmrbasTanim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDmrbasTanimActionPerformed(evt);
            }
        });

        btnKullaniciTanimlama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKullaniciTanimlama.setText("Kullanıcı Tanımlama");
        btnKullaniciTanimlama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciTanimlamaActionPerformed(evt);
            }
        });

        btnGrupAltgrpTanım.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGrupAltgrpTanım.setText("Grup - Altgrup Tanımlama");
        btnGrupAltgrpTanım.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupAltgrpTanımActionPerformed(evt);
            }
        });

        btnKullaniciMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKullaniciMenu.setText("Kullanıcı Menusu");
        btnKullaniciMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciMenuActionPerformed(evt);
            }
        });

        btnBolumTanimlama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBolumTanimlama.setText("Bölüm Tanımlama");
        btnBolumTanimlama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolumTanimlamaActionPerformed(evt);
            }
        });

        btnCalisanEkle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalisanEkle.setText("Çalışan Ekle");
        btnCalisanEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalisanEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnDmrbasTanim, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addComponent(btnKullaniciTanimlama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnKullaniciMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGrupAltgrpTanım, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBolumTanimlama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalisanEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDmrbasTanim, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrupAltgrpTanım, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKullaniciTanimlama, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBolumTanimlama, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKullaniciMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnCalisanEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrupAltgrpTanımActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupAltgrpTanımActionPerformed
        setVisible(false);
        new frmGrpAltGrpTanim().setVisible(true);
    }//GEN-LAST:event_btnGrupAltgrpTanımActionPerformed

    private void btnKullaniciTanimlamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciTanimlamaActionPerformed
        setVisible(false);
        new frmKullaniciTanim().setVisible(true);
    }//GEN-LAST:event_btnKullaniciTanimlamaActionPerformed

    private void btnKullaniciMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciMenuActionPerformed
        setVisible(false);
        new frmKullaniciMenu().setVisible(true);
    }//GEN-LAST:event_btnKullaniciMenuActionPerformed

    private void btnDmrbasTanimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDmrbasTanimActionPerformed
        setVisible(false);
        new frmDemirbasTanimlama().setVisible(true);
    }//GEN-LAST:event_btnDmrbasTanimActionPerformed

    private void btnBolumTanimlamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolumTanimlamaActionPerformed
        setVisible(false);
        new BolumTanimlama().setVisible(true);
    }//GEN-LAST:event_btnBolumTanimlamaActionPerformed

    private void btnCalisanEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalisanEkleActionPerformed
        setVisible(false);
        new frmCalisanEkle().setVisible(true);
    }//GEN-LAST:event_btnCalisanEkleActionPerformed

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
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBolumTanimlama;
    private javax.swing.JButton btnCalisanEkle;
    private javax.swing.JButton btnDmrbasTanim;
    private javax.swing.JButton btnGrupAltgrpTanım;
    private javax.swing.JButton btnKullaniciMenu;
    private javax.swing.JButton btnKullaniciTanimlama;
    // End of variables declaration//GEN-END:variables
}
