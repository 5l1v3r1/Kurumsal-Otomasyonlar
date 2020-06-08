
public class frmKullaniciMenu extends javax.swing.JFrame {


    public frmKullaniciMenu() {
        initComponents();
        EkranKontrol();
    
    }

    private void EkranKontrol()
    {
        if ("Admin".equals(frmGiris.KullaniciYetki)) {
            btnAdminMenu.setVisible(true);
        }
        else
        {
            btnAdminMenu.setVisible(false);
        }
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnZimmetYap = new javax.swing.JButton();
        btnZimmetSorgula = new javax.swing.JButton();
        btnAdminMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnZimmetYap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZimmetYap.setText("Zimmet Yap");
        btnZimmetYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZimmetYapActionPerformed(evt);
            }
        });

        btnZimmetSorgula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZimmetSorgula.setText("Zimmet Sorgula");
        btnZimmetSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZimmetSorgulaActionPerformed(evt);
            }
        });

        btnAdminMenu.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAdminMenu.setText("Admin Menu");
        btnAdminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnZimmetYap, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnZimmetSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnZimmetYap, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(btnZimmetSorgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAdminMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZimmetYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZimmetYapActionPerformed
        setVisible(false);
        new frmZimmetYap().setVisible(true);
    }//GEN-LAST:event_btnZimmetYapActionPerformed

    private void btnZimmetSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZimmetSorgulaActionPerformed
        setVisible(false);
        new frmZimmetSorgula().setVisible(true);
    }//GEN-LAST:event_btnZimmetSorgulaActionPerformed

    private void btnAdminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminMenuActionPerformed
        setVisible(false);
        new AnaMenu().setVisible(true);
    }//GEN-LAST:event_btnAdminMenuActionPerformed

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
            java.util.logging.Logger.getLogger(frmKullaniciMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKullaniciMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKullaniciMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminMenu;
    private javax.swing.JButton btnZimmetSorgula;
    private javax.swing.JButton btnZimmetYap;
    // End of variables declaration//GEN-END:variables
}
