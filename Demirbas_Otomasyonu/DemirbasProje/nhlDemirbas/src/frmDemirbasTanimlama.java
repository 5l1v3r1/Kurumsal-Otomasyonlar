import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class frmDemirbasTanimlama extends javax.swing.JFrame {
Connection con=null;
ResultSet rs = null;
PreparedStatement pst=null;

    public frmDemirbasTanimlama() {
        initComponents();
        con=database.ConnecrDb();
        GrupDoldur();
        tablodoldur();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDmbKodu = new javax.swing.JTextField();
        txtDmbAdi = new javax.swing.JTextField();
        cbxGrupAdi = new javax.swing.JComboBox<>();
        btnKaydet = new javax.swing.JButton();
        btnYeniKayit = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSeriNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDemirbas = new javax.swing.JTable();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Demirbaş Kodu:");

        jLabel2.setText("Demirbaş Adı:");

        jLabel3.setText("Grup Adı:");

        txtDmbKodu.setEnabled(false);

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnYeniKayit.setText("Yeni");
        btnYeniKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniKayitActionPerformed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        jLabel4.setText("Seri No :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDmbKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDmbAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxGrupAdi, 0, 253, Short.MAX_VALUE))))
                        .addGap(0, 279, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnYeniKayit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKaydet)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDmbKodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDmbAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKaydet)
                    .addComponent(btnYeniKayit)
                    .addComponent(btnSil)
                    .addComponent(jLabel3)
                    .addComponent(cbxGrupAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tblDemirbas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Demirbaş Kodu", "Demirbaş Adı", "Grup", "Seri No"
            }
        ));
        tblDemirbas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDemirbasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDemirbas);
        if (tblDemirbas.getColumnModel().getColumnCount() > 0) {
            tblDemirbas.getColumnModel().getColumn(0).setMinWidth(60);
            tblDemirbas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblDemirbas.getColumnModel().getColumn(0).setMaxWidth(150);
        }

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCikis)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void GrupDoldur()
    {
        String sSql="select GrupAdi from gruptanimlari where GrupTipi ='Demirbaş'"  ;
        try {

            pst=con.prepareStatement(sSql);
            rs = pst.executeQuery();
            while(rs.next())
                {
                   cbxGrupAdi.addItem(rs.getString("GrupAdi"));
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
            
    }
      private void tablodoldur(){
       
        
        String sSql = "select * from demirbastanimlari"  ;
        
        
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
            
            
            tblDemirbas.setModel(tm);
        
        //con.close();
    } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
}
     
    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        try {
            if (txtDmbKodu.getText().equals("")) {
            
                String sSql = "insert into demirbastanimlari (DemirbasAdi, GrupAdi, SeriNo) "
                        + " values (?,?,?)";
                
                pst=con.prepareStatement(sSql);
                pst.setString(1,txtDmbAdi.getText());
                pst.setString(2, cbxGrupAdi.getSelectedItem().toString());
                pst.setString(3,txtSeriNo.getText());
                pst.execute();
               JOptionPane.showMessageDialog(null,"Kaydedildi");
               tablodoldur();
               EkranTemizle();
               
            }
            else
        {
            
                String sSql = "update demirbastanimlari set DemirbasAdi = ?, GrupAdi = ?, SeriNo = ? "
                        + " where demirbasID = ?";
                
               pst=con.prepareStatement(sSql);
                pst.setString(1,txtDmbAdi.getText());
                pst.setString(2, cbxGrupAdi.getSelectedItem().toString());
                pst.setString(3, txtSeriNo.getText());
                pst.setInt(4,Integer.parseInt(txtDmbKodu.getText()));
               
                pst.execute();
               JOptionPane.showMessageDialog(null,"Güncellendi");
               tablodoldur();
        }
        }
        
         catch (SQLException ex) {
                Logger.getLogger(frmKullaniciTanim.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex);
            }
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void tblDemirbasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDemirbasMousePressed
       int satir = tblDemirbas.getSelectedRow(); 
        txtDmbKodu.setText(String.valueOf(tblDemirbas.getValueAt(satir, 0)));
        txtDmbAdi.setText(String.valueOf(tblDemirbas.getValueAt(satir, 1)));
        cbxGrupAdi.setSelectedItem(String.valueOf(tblDemirbas.getValueAt(satir, 2)));
        txtSeriNo.setText(String.valueOf(tblDemirbas.getValueAt(satir, 3)));
    }//GEN-LAST:event_tblDemirbasMousePressed

    private void EkranTemizle()
    {
        txtDmbKodu.setText("");
        txtDmbAdi.setText("");
        txtSeriNo.setText("");
    }
    private void btnYeniKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniKayitActionPerformed
        EkranTemizle();
    }//GEN-LAST:event_btnYeniKayitActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
       try{
            String sSql ="delete from demirbastanimlari where demirbasID = ?";
            pst=con.prepareStatement(sSql);
            pst.setInt(1,Integer.parseInt(txtDmbKodu.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Kayıt Silindi");
            tablodoldur();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        setVisible(false);
        new AnaMenu().setVisible(true);
    }//GEN-LAST:event_btnCikisActionPerformed

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
            java.util.logging.Logger.getLogger(frmDemirbasTanimlama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDemirbasTanimlama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDemirbasTanimlama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDemirbasTanimlama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDemirbasTanimlama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnYeniKayit;
    private javax.swing.JComboBox<String> cbxGrupAdi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDemirbas;
    private javax.swing.JTextField txtDmbAdi;
    private javax.swing.JTextField txtDmbKodu;
    private javax.swing.JTextField txtSeriNo;
    // End of variables declaration//GEN-END:variables
}
