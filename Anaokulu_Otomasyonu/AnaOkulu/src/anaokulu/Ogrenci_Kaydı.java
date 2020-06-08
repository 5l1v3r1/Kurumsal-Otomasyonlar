
package anaokulu;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ogrenci_Kaydı extends javax.swing.JFrame {
private Connection conn = null; //Bağlantı nesnemiz
    private String url = "jdbc:mysql://localhost:3306/";
    private String dbName = "anaokulu"; 
    private String driver = "com.mysql.jdbc.Driver";
    private String userName = "root"; 
    private String password = ""; 
    private ResultSet res; 

    
    public Ogrenci_Kaydı() {
        initComponents(); 

        Statement st; 
        try {
            st = baglantiAc(); 
            res = st.executeQuery("SELECT * FROM  ogrenci");
        } catch (Exception ex) {
           
            JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
        }

        oadi.setText("");
        osoyadi.setText("");
        otc.setText("");
        dyer.setText("");
        dtarih.setText("");
        ktarih.setText("");
        vadi.setText("");
        vsoyadi.setText("");
        telefon.setText("");
        adres.setText("");
        cinsiyetComboBox.setSelectedIndex(0);        
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
            }

            oadi.setText(res.getString("oadi"));
            osoyadi.setText(res.getString("osoyadi"));
            otc.setText(res.getString("otc"));
            dyer.setText(res.getString("dyer"));
            dtarih.setText(res.getString("dtarih"));
            ktarih.setText(res.getString("ktarih"));
            vadi.setText(res.getString("vadi"));
            vsoyadi.setText(res.getString("vsoyadi"));
            telefon.setText(res.getString("telefon"));
            adres.setText(res.getString("adres"));
            if (res.getInt("Cinsiyet") == 1) {
                cinsiyetComboBox.setSelectedIndex(0);
            } else {
                cinsiyetComboBox.setSelectedIndex(1);
            }
           

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Kayıt Mevcut Değil", "Öğrenci Tablosu", JOptionPane.PLAIN_MESSAGE);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        sonButton = new javax.swing.JButton();
        yeniButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        ekleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();
        ilkButton = new javax.swing.JButton();
        oncekiButton = new javax.swing.JButton();
        sonrakiButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        oadi = new javax.swing.JTextField();
        osoyadi = new javax.swing.JTextField();
        dyer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cinsiyetComboBox = new javax.swing.JComboBox<>();
        dtarih = new javax.swing.JFormattedTextField();
        ktarih = new javax.swing.JFormattedTextField();
        otc = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vadi = new javax.swing.JTextField();
        vsoyadi = new javax.swing.JTextField();
        adres = new javax.swing.JTextField();
        telefon = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        sonButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/son.png"))); // NOI18N
        sonButton.setText("Son Kayıt      ");
        sonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonButtonActionPerformed(evt);
            }
        });

        yeniButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        yeniButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/yenikayit.png"))); // NOI18N
        yeniButton.setText("Yeni Kayıt      ");
        yeniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniButtonActionPerformed(evt);
            }
        });

        guncelleButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        guncelleButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\güncelle.png")); // NOI18N
        guncelleButton.setText("Kayıt Güncelle");
        guncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButtonActionPerformed(evt);
            }
        });

        ekleButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ekleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/yenikayit.png"))); // NOI18N
        ekleButton.setText("Kayıt Ekle       ");
        ekleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButtonActionPerformed(evt);
            }
        });

        silButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        silButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/sil.png"))); // NOI18N
        silButton.setText("Kayıt Sil         ");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        ilkButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ilkButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\ilk.png")); // NOI18N
        ilkButton.setText("İlk Kayıt       ");
        ilkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilkButtonActionPerformed(evt);
            }
        });

        oncekiButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        oncekiButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\edaaaa\\geri.png")); // NOI18N
        oncekiButton.setText("Önceki Kayıt ");
        oncekiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oncekiButtonActionPerformed(evt);
            }
        });

        sonrakiButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sonrakiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/ileri.png"))); // NOI18N
        sonrakiButton.setText("Sonraki Kayıt");
        sonrakiButton.setToolTipText("");
        sonrakiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonrakiButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Öğrenci Bilgileri", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Öğrenci Adı :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Öğrenci Soyadı :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Doğum Yeri :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Doğum Tarihi :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Kayıt Tarihi :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Öğrenci TC :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Cinsiyet :");

        cinsiyetComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kız" }));

        dtarih.setColumns(8);
        try {
            dtarih.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ktarih.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        otc.setColumns(11);
        try {
            otc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(oadi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(osoyadi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dyer, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cinsiyetComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtarih)
                    .addComponent(ktarih)
                    .addComponent(otc, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(oadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(osoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(otc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cinsiyetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dtarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ktarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Veli Bilgileri", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Veli Adı :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Veli Soyadı :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Telefon :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Adres :");

        telefon.setColumns(10);
        try {
            telefon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) ### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(vadi, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(vsoyadi)
                        .addComponent(adres))
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(vsoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(adres, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 102, 102));
        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 35)); // NOI18N
        jLabel12.setText("ÖĞRENCİ KAYIT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anaokulu/logo 100.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ultrAslanx3\\Desktop\\Close-icon.png")); // NOI18N
        jButton1.setText("KAPAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ilkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oncekiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sonrakiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yeniButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guncelleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ekleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ilkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(oncekiButton)
                        .addGap(18, 18, 18)
                        .addComponent(sonrakiButton)
                        .addGap(18, 18, 18)
                        .addComponent(sonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yeniButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void yeniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniButtonActionPerformed
        oadi.setText("");
        osoyadi.setText("");
        otc.setText("");
        dyer.setText("");
        dtarih.setText("");
        ktarih.setText("");
        vadi.setText("");
        vsoyadi.setText("");
        telefon.setText("");
        adres.setText("");
        cinsiyetComboBox.setSelectedIndex(0);   
        
    }//GEN-LAST:event_yeniButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        try{
            res.moveToInsertRow();
            res.updateString("oadi", oadi.getText());
            res.updateString("osoyadi", osoyadi.getText());
            res.updateString("otc", otc.getText());
            res.updateString("dyer", dyer.getText());
            res.updateString("dtarih", dtarih.getText());
            res.updateString("ktarih", ktarih.getText());
            res.updateString("vadi", vadi.getText());
            res.updateString("vsoyadi", vsoyadi.getText());
            res.updateString("telefon", telefon.getText());
            res.updateString("adres", adres.getText());
            boolean cns;
            if (cinsiyetComboBox.getSelectedIndex() == 0) {
                cns = true;
            } else {
                cns = false;
            }
            res.updateBoolean("Cinsiyet", cns);
            res.updateRow();
            JOptionPane.showConfirmDialog(null, "Kayıt Güncellendi", "Öğrenci Tablosu", JOptionPane.PLAIN_MESSAGE);
        }catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Kayıt Güncellenemedi", "Öğrenci Tablosu", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
            try {
            
            res.moveToInsertRow();
            res.updateString("oadi", oadi.getText());
            res.updateString("osoyadi", osoyadi.getText());
            res.updateString("otc", otc.getText());
            res.updateString("dyer", dyer.getText());
            res.updateString("dtarih", dtarih.getText());
            res.updateString("ktarih", ktarih.getText());
            res.updateString("vadi", vadi.getText());
            res.updateString("vsoyadi", vsoyadi.getText());
            res.updateString("telefon", telefon.getText());
            res.updateString("adres", adres.getText());
            boolean cns;
            if (cinsiyetComboBox.getSelectedIndex() == 0) {
                cns = true;
            } else {
                cns = false;
            }
            res.updateBoolean("Cinsiyet", cns);
            res.insertRow();
            JOptionPane.showConfirmDialog(null, "Kayıt Eklendi", "Öğrenci Tablosu", JOptionPane.PLAIN_MESSAGE);
        }catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Kayıt Eklenemedi", "Öğrenci Tablosu", JOptionPane.PLAIN_MESSAGE);
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
            JOptionPane.showConfirmDialog(null, "Kayıt Silindi", "Öğrenci Tablosu", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Kayıt Silinemedi", "Öğrenci Tablosu", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_silButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ogrenci_Kaydı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adres;
    private javax.swing.JComboBox<String> cinsiyetComboBox;
    private javax.swing.JFormattedTextField dtarih;
    private javax.swing.JTextField dyer;
    private javax.swing.JButton ekleButton;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JButton ilkButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFormattedTextField ktarih;
    private javax.swing.JTextField oadi;
    private javax.swing.JButton oncekiButton;
    private javax.swing.JTextField osoyadi;
    private javax.swing.JFormattedTextField otc;
    private javax.swing.JButton silButton;
    private javax.swing.JButton sonButton;
    private javax.swing.JButton sonrakiButton;
    private javax.swing.JFormattedTextField telefon;
    private javax.swing.JTextField vadi;
    private javax.swing.JTextField vsoyadi;
    private javax.swing.JButton yeniButton;
    // End of variables declaration//GEN-END:variables
}
