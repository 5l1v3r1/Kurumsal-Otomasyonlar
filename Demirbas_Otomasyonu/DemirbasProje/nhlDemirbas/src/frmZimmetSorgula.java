
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmZimmetSorgula extends javax.swing.JFrame {
Connection con=null;
ResultSet rs = null;
PreparedStatement pst=null;
  
    public frmZimmetSorgula() {
        initComponents();
        con=database.ConnecrDb();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblZimmetler = new javax.swing.JTable();
        btnCikis = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbtnKisiyeGore = new javax.swing.JRadioButton();
        rbtnBolumeGore = new javax.swing.JRadioButton();
        btnSorgula = new javax.swing.JButton();
        btnZimmetSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblZimmetler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Zimmet Kodu", "Kişi/Bölüm Adı", "Demirbaş Kodu", "Demirbaş Adı"
            }
        ));
        jScrollPane1.setViewportView(tblZimmetler);

        btnCikis.setText("Çıkış");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(rbtnKisiyeGore);
        rbtnKisiyeGore.setSelected(true);
        rbtnKisiyeGore.setText("Kişiye Göre");

        buttonGroup1.add(rbtnBolumeGore);
        rbtnBolumeGore.setText("Bolume Göre");

        btnSorgula.setText("Sorgula");
        btnSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorgulaActionPerformed(evt);
            }
        });

        btnZimmetSil.setText("Zimmet Sil");
        btnZimmetSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZimmetSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnKisiyeGore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSorgula))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnBolumeGore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnZimmetSil)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnKisiyeGore)
                    .addComponent(btnSorgula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnBolumeGore)
                    .addComponent(btnZimmetSil))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCikis))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCikis)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorgulaActionPerformed
        if (rbtnKisiyeGore.isSelected()) {

        String sSql = "select k.KisiZimmetID, k.kisiAdi 'Kişi/Bölüm Adı', \n" +
                        "k.DemirbasID as 'Demirbaş Kodu',\n" +
                        "d.DemirbasAdi as 'Demirbaş Adı'\n" +
                        "  from kisiyezimmetler k \n" +
                        "inner join demirbastanimlari d on k.DemirbasID = d.demirbasID"  ;
            try {
                pst=con.prepareStatement(sSql);
                rs = pst.executeQuery();  
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

                tblZimmetler.setModel(tm);
                } catch(Exception e){
                JOptionPane.showMessageDialog(null,e);

            }
        }
        
        if (rbtnBolumeGore.isSelected()) {
             String sSql = "select b.BolumZimmetID, b.bolumAdi , \n" +
                            "b.DemirbasID ,\n" +
                            "d.DemirbasAdi\n" +
                            "  from  bolumezimmetler b \n" +
                            "inner join demirbastanimlari d on b.DemirbasID = d.demirbasID"  ;
            try {
                pst=con.prepareStatement(sSql);
                rs = pst.executeQuery();   
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

                tblZimmetler.setModel(tm);
                } catch(Exception e){
                JOptionPane.showMessageDialog(null,e);

            }
        }
    }//GEN-LAST:event_btnSorgulaActionPerformed

    private void btnZimmetSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZimmetSilActionPerformed
        
        if (rbtnKisiyeGore.isSelected()) {
            try{
                int satir = tblZimmetler.getSelectedRow(); 
                int KisiyeZimmetID = (int) tblZimmetler.getValueAt(satir, 0) ;
                String sSql ="delete from kisiyezimmetler where KisiZimmetID = ?";
                pst=con.prepareStatement(sSql);
                pst.setInt(1,KisiyeZimmetID);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Zimmet Silindi");

            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        
        if (rbtnBolumeGore.isSelected()) {
            try{
                int satir = tblZimmetler.getSelectedRow(); 
                int BolumeZimmetID = (int) tblZimmetler.getValueAt(satir, 0) ;
                String sSql ="delete from bolumezimmetler where BolumZimmetID = ?";
                pst=con.prepareStatement(sSql);
                pst.setInt(1,BolumeZimmetID);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Zimmet Silindi");

            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        
        
    }//GEN-LAST:event_btnZimmetSilActionPerformed

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
            java.util.logging.Logger.getLogger(frmZimmetSorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmZimmetSorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmZimmetSorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmZimmetSorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmZimmetSorgula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnSorgula;
    private javax.swing.JButton btnZimmetSil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnBolumeGore;
    private javax.swing.JRadioButton rbtnKisiyeGore;
    private javax.swing.JTable tblZimmetler;
    // End of variables declaration//GEN-END:variables
}
