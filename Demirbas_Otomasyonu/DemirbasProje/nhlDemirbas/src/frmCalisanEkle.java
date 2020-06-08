import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class frmCalisanEkle extends javax.swing.JFrame {
Connection con=null;
ResultSet rs = null;
PreparedStatement pst=null;
   
    public frmCalisanEkle() {
        initComponents();
        con=database.ConnecrDb();
        GrupDoldur();
        tablodoldur();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSil = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        btnYeni = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        txtGorev = new javax.swing.JTextField();
        cbxBolum = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtKodu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalisan = new javax.swing.JTable();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnYeni.setText("Yeni");
        btnYeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniActionPerformed(evt);
            }
        });

        jLabel1.setText("Adı :");

        jLabel2.setText("Soyadı :");

        jLabel3.setText("Görevi :");

        jLabel4.setText("Bölüm :");

        txtGorev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGorevActionPerformed(evt);
            }
        });

        jLabel5.setText("Kodu :");

        txtKodu.setEditable(false);
        txtKodu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKoduActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cbxBolum, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnYeni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKaydet))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtGorev, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtKodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGorev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnYeni)
                            .addComponent(btnSil)
                            .addComponent(btnKaydet))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tblCalisan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Adı", "Soyadı", "Görevi", "Bölümü"
            }
        ));
        tblCalisan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCalisanMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCalisan);

        btnCikis.setText("Çıkış");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCikis)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCikis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void GrupDoldur()
    {
        String sSql="select BolumAdi from bolumtanimlari"  ;
        try {

            pst=con.prepareStatement(sSql);
            rs = pst.executeQuery();
            while(rs.next())
                {
                   cbxBolum.addItem(rs.getString("BolumAdi"));
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
            
    }
    private void tablodoldur(){
       
        //select cümlemizi yazıyoruz.
        String sSql = "select * from Calisanlar"  ;
        
        
        try {
            
            pst=con.prepareStatement(sSql);
            
            
            ResultSet rs = pst.executeQuery();  
            
            int colcount = rs.getMetaData().getColumnCount(); 
            DefaultTableModel tm = new DefaultTableModel(); 
            
           
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); 
           
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            
            
            tblCalisan.setModel(tm);
        
        //con.close();
    } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
}
    
    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        setVisible(false);
        new AnaMenu().setVisible(true);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
            try {
            if (txtKodu.getText().equals("")) {
            
                String sSql = "insert into Calisanlar (Adi, Soyadi, Gorevi, Bolum) "
                        + " values (?,?,?,?)";
                
                pst=con.prepareStatement(sSql);
                pst.setString(1,txtAdi.getText());
                pst.setString(2,txtSoyadi.getText());
                pst.setString(3,txtGorev.getText());
                pst.setString(4, cbxBolum.getSelectedItem().toString());
                pst.execute();
               JOptionPane.showMessageDialog(null,"Kaydedildi");
               tablodoldur();
               EkranTemizle();
         
               
            }
            else
        {
            
                String sSql = "update Calisanlar set Adi = ?, Soyadi = ?, Gorevi = ?, Bolum = ? "
                        + " where CalisanID = ?";
                
               pst=con.prepareStatement(sSql);
                pst.setString(1,txtAdi.getText());
                pst.setString(2,txtSoyadi.getText());
                pst.setString(3,txtGorev.getText());
                pst.setString(4, cbxBolum.getSelectedItem().toString());
                pst.setString(5,txtKodu.getText());
                pst.execute();
               JOptionPane.showMessageDialog(null,"Güncellendi");
               tablodoldur();
        }
        }
        
         catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
    }//GEN-LAST:event_btnKaydetActionPerformed

    
    
    private void txtKoduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKoduActionPerformed
       EkranTemizle(); 
    }//GEN-LAST:event_txtKoduActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        try{
            String sSql ="delete from Calisanlar where CalisanID = ?";
            pst=con.prepareStatement(sSql);
            pst.setInt(1,Integer.parseInt(txtKodu.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Kayıt Silindi");
            tablodoldur();
          
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void tblCalisanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCalisanMousePressed
        int satir = tblCalisan.getSelectedRow(); 
        txtKodu.setText(String.valueOf(tblCalisan.getValueAt(satir, 0)));
        txtAdi.setText(String.valueOf(tblCalisan.getValueAt(satir, 1)));
        txtSoyadi.setText(String.valueOf(tblCalisan.getValueAt(satir, 2)));
        cbxBolum.setSelectedItem(String.valueOf(tblCalisan.getValueAt(satir, 4)));
        txtGorev.setText(String.valueOf(tblCalisan.getValueAt(satir, 3)));
        
    }//GEN-LAST:event_tblCalisanMousePressed
  
   private void  EkranTemizle()
    {
        txtAdi.setText("");
        txtSoyadi.setText("");
        txtKodu.setText("");
        txtGorev.setText("");
    }                 
        
    
    private void btnYeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniActionPerformed
        EkranTemizle();
    }//GEN-LAST:event_btnYeniActionPerformed

    private void txtGorevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGorevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGorevActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalisanEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalisanEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalisanEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalisanEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalisanEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnYeni;
    private javax.swing.JComboBox<String> cbxBolum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCalisan;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtGorev;
    private javax.swing.JTextField txtKodu;
    private javax.swing.JTextField txtSoyadi;
    // End of variables declaration//GEN-END:variables
}
