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
public class koruyucu_aile_güncelle extends javax.swing.JFrame {

    /**
     * Creates new form koruyucu_aile_güncelle
     */
    public koruyucu_aile_güncelle() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("GÜNCELLE");
        getContentPane().add(jButton1);
        jButton1.setBounds(162, 233, 101, 23);

        jLabel1.setText("ANNE ADI :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(112, 64, 55, 14);

        jLabel2.setText("BABA ADI:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(116, 109, 51, 14);

        jLabel3.setText("MAAŞ :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(132, 156, 35, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(244, 61, 96, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(244, 106, 96, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(244, 153, 96, 20);

        jLabel6.setText("GÜNCELLE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 20, 70, 14);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/259225__nature-flowers-landscapes-grass-sky-sun-light_p.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 410, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(koruyucu_aile_güncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(koruyucu_aile_güncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(koruyucu_aile_güncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(koruyucu_aile_güncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new koruyucu_aile_güncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
