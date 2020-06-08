
package anaokulu;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Kullanici_Kayit extends javax.swing.JFrame {

    private Connection conn = null; 
    private String url = "jdbc:mysql://localhost:3306/";
    private String dbName = "anaokulu"; 
    private String driver = "com.mysql.jdbc.Driver";
    private String userName = "root"; 
    private String password = ""; 
    private ResultSet res; 

   
    public Kullanici_Kayit() {
        initComponents(); 

        Statement st; 
        try {
            st = baglantiAc(); 
            res = st.executeQuery("SELECT * FROM  kullanici"); 
        } catch (Exception ex) {
            
            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
        }

        kadi.setText("");
        parola.setText("");
        ad.setText("");
        soyad.setText("");
        tc.setText("");
        telefon.setText("");
        adres.setText("");
        jComboBox1.setSelectedIndex(0);
    }

    public Statement baglantiAc() throws Exception {
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url + dbName, userName, password);//bağlantı açılıyor           
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    public void baglantiKapat() throws Exception {
        conn.close();
    }

    public void KayitGetir(String yon) {
        try {

            if (yon.equals("ileri")) {
                res.next();
            } else if (yon.equals("geri")) {
                res.previous();
            } else if (yon.equals("ilk")) {
                res.first();
            } else if (yon.equals("son")) {
                res.last();
            } else if (yon.equals("mutlak")) {
                res.absolute(Integer.parseInt(no.getText()));

            }

            kadi.setText(res.getString("kadi"));
            parola.setText(res.getString("parola"));
            ad.setText(res.getString("Ad"));
            soyad.setText(res.getString("Soyad"));
            tc.setText(res.getString("tc"));
            telefon.setText(res.getString("telefon"));
            adres.setText(res.getString("adres"));
            if (res.getInt("yetki") == 1) {
                jComboBox1.setSelectedIndex(0);
            } else {
                jComboBox1.setSelectedIndex(1);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Kayıt Mevcut Değil", "Kullanici Tablosu", JOptionPane.PLAIN_MESSAGE);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kadi = new javax.swing.JTextField();
        parola = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        soyad = new javax.swing.JTextField();
        adres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ilkButton = new javax.swing.JButton();
        oncekiButton = new javax.swing.JButton();
        sonrakiButton = new javax.swing.JButton();
        sonButton = new javax.swing.JButton();
        yeniButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        ekleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();
        gitButton = new javax.swing.JButton();
        no = new javax.swing.JTextField();
        telefon = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tc = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Parola :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Ad :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Soyad :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Telefon :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Adres :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Kayıt No :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("T.C No :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Yetki :");

        ilkButton.setBackground(new java.awt.Color(255, 255, 255));
        ilkButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ilkButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\ilk.png")); // NOI18N
        ilkButton.setText("İlk Kayıt       ");
        ilkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilkButtonActionPerformed(evt);
            }
        });

        oncekiButton.setBackground(new java.awt.Color(255, 255, 255));
        oncekiButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        oncekiButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\geri.png")); // NOI18N
        oncekiButton.setText("Önceki Kayıt");
        oncekiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oncekiButtonActionPerformed(evt);
            }
        });

        sonrakiButton.setBackground(new java.awt.Color(255, 255, 255));
        sonrakiButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sonrakiButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\ileri.png")); // NOI18N
        sonrakiButton.setText("Sonraki Kayıt");
        sonrakiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonrakiButtonActionPerformed(evt);
            }
        });

        sonButton.setBackground(new java.awt.Color(255, 255, 255));
        sonButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sonButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\son.png")); // NOI18N
        sonButton.setText("Son Kayıt     ");
        sonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonButtonActionPerformed(evt);
            }
        });

        yeniButton.setBackground(new java.awt.Color(255, 255, 255));
        yeniButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        yeniButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/yenikayit.png"))); // NOI18N
        yeniButton.setText(" Yeni Kayıt");
        yeniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniButtonActionPerformed(evt);
            }
        });

        guncelleButton.setBackground(new java.awt.Color(255, 255, 255));
        guncelleButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        guncelleButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\güncelle.png")); // NOI18N
        guncelleButton.setText("Kayıt Güncelle");
        guncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButtonActionPerformed(evt);
            }
        });

        ekleButton.setBackground(new java.awt.Color(255, 255, 255));
        ekleButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ekleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/save-icon.png"))); // NOI18N
        ekleButton.setText("Kayıt Ekle");
        ekleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButtonActionPerformed(evt);
            }
        });

        silButton.setBackground(new java.awt.Color(255, 255, 255));
        silButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        silButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/sil.png"))); // NOI18N
        silButton.setText("Kayıt Sil");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        gitButton.setBackground(new java.awt.Color(255, 255, 255));
        gitButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        gitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/kayıtlar.png"))); // NOI18N
        gitButton.setText("Kayda Git");
        gitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitButtonActionPerformed(evt);
            }
        });

        telefon.setColumns(10);
        try {
            telefon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+90(###)### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel11.setText("KULLANICI KAYIT");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        tc.setColumns(11);
        try {
            tc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\logo 100.png")); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yönetici", "Öğretmen" }));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\Close-icon.png")); // NOI18N
        jButton1.setText("KAPAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(parola, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(soyad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adres, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kadi)
                        .addComponent(no)
                        .addComponent(telefon)
                        .addComponent(tc, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sonrakiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oncekiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ilkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(gitButton))
                .addGap(261, 261, 261))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yeniButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ilkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oncekiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sonrakiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sonButton)
                        .addGap(69, 69, 69)
                        .addComponent(gitButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(parola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekleButton)
                    .addComponent(silButton)
                    .addComponent(guncelleButton))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ilkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilkButtonActionPerformed
        KayitGetir("ilk");
    }//GEN-LAST:event_ilkButtonActionPerformed

    private void oncekiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oncekiButtonActionPerformed
        KayitGetir("geri");
    }//GEN-LAST:event_oncekiButtonActionPerformed

    private void sonrakiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonrakiButtonActionPerformed
        KayitGetir("ileri");
    }//GEN-LAST:event_sonrakiButtonActionPerformed

    private void sonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonButtonActionPerformed
        KayitGetir("son");
    }//GEN-LAST:event_sonButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        try {
            res.updateString("kadi", kadi.getText());
            res.updateString("parola", parola.getText());
            res.updateString("Ad", ad.getText());
            res.updateString("Soyad", soyad.getText());
            res.updateString("tc", tc.getText());
            res.updateString("telefon", telefon.getText());
            res.updateString("adres", adres.getText());
            boolean yetki;
            if (jComboBox1.getSelectedIndex() == 0) {
                yetki = true;
            } else {
                yetki = false;
            }
            res.updateBoolean("yetki", yetki);
            res.updateRow();
            JOptionPane.showConfirmDialog(null, "Kayıt Güncellendi", "Kullanici Tablosu", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Kayıt Güncellenmedi", "Kullanici Tablosu", JOptionPane.PLAIN_MESSAGE);
}        
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        try {
            res.moveToInsertRow();
            res.updateString("kadi", kadi.getText());
            res.updateString("parola", parola.getText());
            res.updateString("Ad", ad.getText());
            res.updateString("Soyad", soyad.getText());
            res.updateString("tc", tc.getText());
            res.updateString("telefon", telefon.getText());
            res.updateString("adres", adres.getText());
            boolean yetki;
            if (jComboBox1.getSelectedIndex() == 0) {
                yetki = true;
            } else {
                yetki = false;
            }
            res.updateBoolean("yetki", yetki);
            res.insertRow();
            JOptionPane.showConfirmDialog(null, "Kayıt Eklendi", "Kullanici Tablosu", JOptionPane.PLAIN_MESSAGE);
       }catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Kayıt Eklenemedi", "Kullanici Tablosu", JOptionPane.PLAIN_MESSAGE);
       }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        try {
            int onay = JOptionPane.showConfirmDialog(null, "Emin misiniz?", "Kişiler Tablosu", JOptionPane.YES_NO_OPTION);

            if (onay == 0) {    
                res.deleteRow();
                KayitGetir("ilk");
            } else {            

            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Kayıt Silinemedi", "Kişiler Tablosu", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_silButtonActionPerformed

    private void gitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitButtonActionPerformed
        KayitGetir("mutlak");
    }//GEN-LAST:event_gitButtonActionPerformed

    private void telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonActionPerformed

    private void yeniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniButtonActionPerformed
        kadi.setText("");
        parola.setText("");
        ad.setText("");
        soyad.setText("");
        tc.setText("");
        telefon.setText("");
        adres.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_yeniButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kullanici_Kayit().setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JTextField adres;
    private javax.swing.JButton ekleButton;
    private javax.swing.JButton gitButton;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JButton ilkButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kadi;
    private javax.swing.JTextField no;
    private javax.swing.JButton oncekiButton;
    private javax.swing.JTextField parola;
    private javax.swing.JButton silButton;
    private javax.swing.JButton sonButton;
    private javax.swing.JButton sonrakiButton;
    private javax.swing.JTextField soyad;
    private javax.swing.JFormattedTextField tc;
    private javax.swing.JFormattedTextField telefon;
    private javax.swing.JButton yeniButton;
    // End of variables declaration//GEN-END:variables
}
