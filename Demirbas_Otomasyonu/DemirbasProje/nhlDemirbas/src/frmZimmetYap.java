
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class frmZimmetYap extends javax.swing.JFrame {
Connection con=null;
ResultSet rs = null;
PreparedStatement pst=null;

    public frmZimmetYap() {
        initComponents();
        con=database.ConnecrDb();
        BolumDoldur();
        KisiDoldur();
       tablodoldur();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtnKisi = new javax.swing.JRadioButton();
        rbtnBolum = new javax.swing.JRadioButton();
        lblKisi = new javax.swing.JLabel();
        lblBolum = new javax.swing.JLabel();
        cbxKisi = new javax.swing.JComboBox<>();
        cbxBolum = new javax.swing.JComboBox<>();
        btnZimmetle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDemirbas = new javax.swing.JTable();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(rbtnKisi);
        rbtnKisi.setSelected(true);
        rbtnKisi.setText("Kişiye Zimmet");

        buttonGroup1.add(rbtnBolum);
        rbtnBolum.setText("Bölüme Zimmet");

        lblKisi.setText("Kişi :");

        lblBolum.setText("Bölüm :");

        btnZimmetle.setText("Zimmetle");
        btnZimmetle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZimmetleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnKisi)
                    .addComponent(rbtnBolum))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBolum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxBolum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblKisi)
                        .addGap(18, 18, 18)
                        .addComponent(cbxKisi, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnZimmetle)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnKisi)
                    .addComponent(lblKisi)
                    .addComponent(cbxKisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZimmetle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnBolum)
                    .addComponent(lblBolum)
                    .addComponent(cbxBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDemirbas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Demirbas Kodu", "Demirbaş Adı", "Grubu"
            }
        ));
        jScrollPane1.setViewportView(tblDemirbas);

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCikis)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCikis)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tablodoldur(){
       
        
        String sSql = "select DemirbasID, DemirbasAdi, GrupAdi from demirbastanimlari"  ;
        
        
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
    
    private void KisiDoldur()
    {
        String sSql="select CONCAT_WS(' ',Adi,Soyadi) as Kisi from calisanlar"  ;
        try {

            pst=con.prepareStatement(sSql);
            rs = pst.executeQuery();
            while(rs.next())
                {
                   cbxKisi.addItem(rs.getString("Kisi"));
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
    private void BolumDoldur()
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
    
    private void btnZimmetleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZimmetleActionPerformed
       
        
        if (rbtnKisi.isSelected()) {
            
            try {
                String sSql = "insert kisiyezimmetler (DemirbasID, KisiAdi) values (?,?)";
                
                int satir = tblDemirbas.getSelectedRow(); 
                int DemirbasID = (int) tblDemirbas.getValueAt(satir, 0) ;
                String DemirbasAdi = (String) tblDemirbas.getValueAt(satir, 1);
                
                pst=con.prepareStatement(sSql);
                pst.setInt(1,DemirbasID);
                pst.setString(2, cbxKisi.getSelectedItem().toString());
                pst.execute();
               JOptionPane.showMessageDialog(null, DemirbasAdi + " isimli malzeme " + cbxKisi.getSelectedItem().toString() 
               + " Kişisine zimmet yapıldı.");
            } 
            catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
        if (rbtnBolum.isSelected()) {
            try {
                String sSql = "insert bolumezimmetler (DemirbasID, BolumAdi) values (?,?);";
                
                int satir = tblDemirbas.getSelectedRow(); 
                int DemirbasID = (int) tblDemirbas.getValueAt(satir, 0) ;
                String DemirbasAdi = (String) tblDemirbas.getValueAt(satir, 1);
                
                pst=con.prepareStatement(sSql);
                pst.setInt(1,DemirbasID);
                pst.setString(2, cbxBolum.getSelectedItem().toString());
                pst.execute();
               JOptionPane.showMessageDialog(null, DemirbasAdi + " isimli malzeme " +  cbxBolum.getSelectedItem().toString()
               + " Bölümüne zimmet yapıldı.");
            } 
            catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
        
    }//GEN-LAST:event_btnZimmetleActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        setVisible(false);
        new frmKullaniciMenu().setVisible(true);
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
            java.util.logging.Logger.getLogger(frmZimmetYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmZimmetYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmZimmetYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmZimmetYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmZimmetYap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnZimmetle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxBolum;
    private javax.swing.JComboBox<String> cbxKisi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBolum;
    private javax.swing.JLabel lblKisi;
    private javax.swing.JRadioButton rbtnBolum;
    private javax.swing.JRadioButton rbtnKisi;
    private javax.swing.JTable tblDemirbas;
    // End of variables declaration//GEN-END:variables

    
}
