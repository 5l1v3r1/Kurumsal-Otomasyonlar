
package yetistirmeyurdu;




import javax.swing.JOptionPane;


public class personelgiris extends javax.swing.JFrame {

   
    public personelgiris() {
        initComponents();
    }
   
        

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("KULLANICI ADI:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 100, 120, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ŞİFRE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 160, 100, 17);

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(290, 100, 130, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("GİRİŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 240, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PERSONEL GİRİŞİ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 30, 180, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/girişonayla.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 130, 130);

        jPasswordField1.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(290, 160, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yetistirmeyurdu/a5.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(1404, 768));
        jLabel4.setMinimumSize(new java.awt.Dimension(1404, 768));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -6, 450, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           try {
            String kadi_1 = jTextField1.getText();
            String sifre = jPasswordField1.getText();
            

            giris(kadi_1, sifre);


        } catch (Exception ex) {
        }       
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           
    }            
     public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personelgiris().setVisible(true);
            }
        });
    }
       
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;

    void visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void giris(String gelenno, String gelenkod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       private static class kullanıcıekle {

        public kullanıcıekle() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    } 
    
  

  




    }//GEN-LAST:event_jButton2ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

