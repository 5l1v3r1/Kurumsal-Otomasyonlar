
package Cafe_Restaurant;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UrunSiparisi extends javax.swing.JFrame {

                Connection con = null;
                Statement st = null;
                ResultSet rs = null;
   
    public  UrunSiparisi(String masaadi) {
        initComponents();
this.setExtendedState(UrunSiparisi.MAXIMIZED_BOTH);//sayfa tam ekran yapma kodu
        jLabel1.setText(masaadi);
        masasiparisleri(masaadi);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        lbluruncesidi = new javax.swing.JLabel();
        lblfiyat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Çorbalar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Dönerler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Pideler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Et Yemekleri");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Kebaplar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Salatalar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Tatlılar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("İçecekler");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jList1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("1");
        jButton3.setToolTipText("");
        jButton3.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 51));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("2");
        jButton10.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 51));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("4");
        jButton11.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 51));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("5");
        jButton12.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 51));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText("7");
        jButton13.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 51));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("3");
        jButton14.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 255, 51));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("6");
        jButton15.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 255, 51));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setText("9");
        jButton16.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 255, 51));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setText("8");
        jButton17.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setToolTipText("");

        jButton22.setBackground(new java.awt.Color(255, 255, 51));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setText("C");
        jButton22.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 255, 51));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.setText("0");
        jButton23.setMargin(new java.awt.Insets(9, 15, 9, 15));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setText("Ekle");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton17))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton10)
                    .addComponent(jButton14))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.setText("Kapat");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton24.setText("İptal");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton25.setText("Ödeme");
        jButton25.setMargin(new java.awt.Insets(6, 20, 6, 20));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton19.setForeground(new java.awt.Color(255, 0, 0));
        jButton19.setText("Ana Menü");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Toplam:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbluruncesidi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton19)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblid)
                                .addGap(18, 18, 18)
                                .addComponent(lbluruncesidi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19)
                        .addGap(22, 22, 22))))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
  public void masasiparisleri(String masaad)
  {
       //veri tabanından masa siparislerini çekmek için 
     if(masaad.equals("Masa 1"))  
     {
                 int toplam=0;
try {          
                Class.forName("com.mysql.jdbc.Driver");

               
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = (Statement) con.createStatement();
                
                rs = st.executeQuery("select * from masa1");
                
                
                DefaultListModel model1=new DefaultListModel();
                while(rs.next()){
                    toplam+=(Integer.parseInt(rs.getString("adet")))*(Integer.parseInt(rs.getString("tutar")));
                  model1.addElement(rs.getString("id")+"    "+rs.getString("adet")+" Adet "+rs.getString("siparis")+"  "+rs.getString("tutar"));
                }
                jList1.setModel(model1);
                
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    
         jLabel2.setText(String.valueOf(toplam+" TL"));
     }//masa1 sonu
     else if(masaad.equals("Masa 2"))
     {
          int toplam=0;
         try {          
                Class.forName("com.mysql.jdbc.Driver");

               

                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = (Statement) con.createStatement();
                
                rs = st.executeQuery("select * from masa2");
                
                
                DefaultListModel model1=new DefaultListModel();
                while(rs.next()){
                    toplam+=(Integer.parseInt(rs.getString("adet")))*(Integer.parseInt(rs.getString("tutar")));
                  model1.addElement(rs.getString("id")+"    "+rs.getString("adet")+" Adet "+rs.getString("siparis")+"  "+rs.getString("tutar"));
                }
                jList1.setModel(model1);
 
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         jLabel2.setText(String.valueOf(toplam+" TL"));
     }//masa2 sonu
      else if(masaad.equals("Masa 3"))
     {
        
         int toplam=0;
         try {          
                Class.forName("com.mysql.jdbc.Driver");

               

                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = (Statement) con.createStatement();
                
                rs = st.executeQuery("select * from masa3");
                
                
                DefaultListModel model1=new DefaultListModel();
                while(rs.next()){
                    toplam+=(Integer.parseInt(rs.getString("adet")))*(Integer.parseInt(rs.getString("tutar")));
                  model1.addElement(rs.getString("id")+"    "+rs.getString("adet")+" Adet "+rs.getString("siparis")+"  "+rs.getString("tutar"));
                }
                jList1.setModel(model1);
 
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         jLabel2.setText(String.valueOf(toplam+" TL"));
     }//masa3 sonu
      else if(masaad.equals("Masa 4"))
     {
         int toplam=0;
         try {          
                Class.forName("com.mysql.jdbc.Driver");

               

                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = (Statement) con.createStatement();
                
                rs = st.executeQuery("select * from masa4");
                
                
                DefaultListModel model1=new DefaultListModel();
                while(rs.next()){
                     toplam+=(Integer.parseInt(rs.getString("adet")))*(Integer.parseInt(rs.getString("tutar")));
                  model1.addElement(rs.getString("id")+"    "+rs.getString("adet")+" Adet "+rs.getString("siparis")+"  "+rs.getString("tutar"));
                }
                jList1.setModel(model1);
 
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         jLabel2.setText(String.valueOf(toplam+" TL"));
     }//masa4 sonu
      else if(masaad.equals("Masa 5"))
     {
         int toplam=0;
         try {          
                Class.forName("com.mysql.jdbc.Driver");

               

                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = (Statement) con.createStatement();
                
                rs = st.executeQuery("select * from masa5");
                
                
                DefaultListModel model1=new DefaultListModel();
                while(rs.next()){
                     toplam+=(Integer.parseInt(rs.getString("adet")))*(Integer.parseInt(rs.getString("tutar")));
                  model1.addElement(rs.getString("id")+"    "+rs.getString("adet")+" Adet "+rs.getString("siparis")+"  "+rs.getString("tutar"));
                }
                jList1.setModel(model1);
 
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         jLabel2.setText(String.valueOf(toplam+" TL"));
     }//masa5 sonu
       else if(masaad.equals("Masa 6"))
     {
         int toplam=0;
         try {          
                Class.forName("com.mysql.jdbc.Driver");

               

                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = (Statement) con.createStatement();
                
                rs = st.executeQuery("select * from masa6");
                
                
                DefaultListModel model1=new DefaultListModel();
                while(rs.next()){
                     toplam+=(Integer.parseInt(rs.getString("adet")))*(Integer.parseInt(rs.getString("tutar")));
                  model1.addElement(rs.getString("id")+"    "+rs.getString("adet")+" Adet "+rs.getString("siparis")+"  "+rs.getString("tutar"));
                }
                jList1.setModel(model1);
 
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         jLabel2.setText(String.valueOf(toplam+" TL"));
     }//masa6 sonu
      else if(masaad.equals("Masa 7"))
     {
         int toplam=0;
         try {          
                Class.forName("com.mysql.jdbc.Driver");

               

                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = (Statement) con.createStatement();
                
                rs = st.executeQuery("select * from masa7");
                
                
                DefaultListModel model1=new DefaultListModel();
                while(rs.next()){
                     toplam+=(Integer.parseInt(rs.getString("adet")))*(Integer.parseInt(rs.getString("tutar")));
                  model1.addElement(rs.getString("id")+"    "+rs.getString("adet")+" Adet "+rs.getString("siparis")+"  "+rs.getString("tutar"));
                }
                jList1.setModel(model1);
 
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         jLabel2.setText(String.valueOf(toplam+" TL"));
     }//masa7 sonu
      else if(masaad.equals("Masa 8"))
     {
         int toplam=0;
         try {          
                Class.forName("com.mysql.jdbc.Driver");

               

                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = (Statement) con.createStatement();
                
                rs = st.executeQuery("select * from masa8");
                
                
                DefaultListModel model1=new DefaultListModel();
                while(rs.next()){
                     toplam+=(Integer.parseInt(rs.getString("adet")))*(Integer.parseInt(rs.getString("tutar")));
                  model1.addElement(rs.getString("id")+"    "+rs.getString("adet")+" Adet "+rs.getString("siparis")+"  "+rs.getString("tutar"));
                }
                jList1.setModel(model1);
 
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         jLabel2.setText(String.valueOf(toplam+" TL"));
     }//masa8 sonu
  }
    public void siparissil(String masa_adi,String silinecek)
  {
      if(masa_adi.equals("masa1"))
      {
          
   try {
            
          
              Class.forName("com.mysql.jdbc.Driver");
 
                Connection con = null;
                Statement st = null;
             
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql =" Delete from masa1 where id='"+silinecek+"'";
                 st.executeUpdate(sql);          
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
      }
      else if(masa_adi.equals("masa2"))
      {
          
   try {
            
          
              Class.forName("com.mysql.jdbc.Driver");
 
                Connection con = null;
                Statement st = null;
             
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql =" Delete from masa2 where id='"+silinecek+"'";
                 st.executeUpdate(sql);          
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
      }
        else if(masa_adi.equals("masa3"))
      {
          
   try {
            
          
              Class.forName("com.mysql.jdbc.Driver");
 
                Connection con = null;
                Statement st = null;
             
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql =" Delete from masa3 where id='"+silinecek+"'";
                 st.executeUpdate(sql);          
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
      }
        else if(masa_adi.equals("masa4"))
      {
          
   try {
            
          
              Class.forName("com.mysql.jdbc.Driver");
 
                Connection con = null;
                Statement st = null;
             
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql =" Delete from masa4 where id='"+silinecek+"'";
                 st.executeUpdate(sql);          
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
      }
        else if(masa_adi.equals("masa5"))
      {
          
   try {
            
          
              Class.forName("com.mysql.jdbc.Driver");
 
                Connection con = null;
                Statement st = null;
             
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql =" Delete from masa5 where id='"+silinecek+"'";
                 st.executeUpdate(sql);          
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
      }
        else if(masa_adi.equals("masa6"))
      {
          
   try {
            
          
              Class.forName("com.mysql.jdbc.Driver");
 
                Connection con = null;
                Statement st = null;
             
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql =" Delete from masa6 where id='"+silinecek+"'";
                 st.executeUpdate(sql);          
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
      }
        else if(masa_adi.equals("masa7"))
      {
          
   try {
            
          
              Class.forName("com.mysql.jdbc.Driver");
 
                Connection con = null;
                Statement st = null;
             
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql =" Delete from masa7 where id='"+silinecek+"'";
                 st.executeUpdate(sql);          
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
      }
        else if(masa_adi.equals("masa8"))
      {
          
   try {
            
          
              Class.forName("com.mysql.jdbc.Driver");
 
                Connection con = null;
                Statement st = null;
             
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql =" Delete from masa8 where id='"+silinecek+"'";
                 st.executeUpdate(sql);          
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
      }
  }
 
 public void veritabani(String isim)//veri tabanına siparis ekleme 
 {
     
     if(isim.equals("masa1"))//masa1 kodları
     {
      try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql = "INSERT INTO masa1 (adet,siparis,tutar)" 
                        + " VALUES ('"+jTextField1.getText()+"', '"+lbluruncesidi.getText()+"', '"+lblfiyat.getText()+"')";
                st.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        } 
     }//masa1 kodları sonu
  
     else if(isim.equals("masa2"))   //masa2 kodları
     {
        
      try {
                Class.forName("com.mysql.jdbc.Driver");
              
               
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql = "INSERT INTO masa2 (adet,siparis,tutar)" 
                        + " VALUES ('"+jTextField1.getText()+"','"+lbluruncesidi.getText()+"', '"+lblfiyat.getText()+"')";

                st.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
     }//masa2 kodları sonu
   
     else if(isim.equals("masa3"))  //masa3 kodları
     {
      try {
                Class.forName("com.mysql.jdbc.Driver");
              
               
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql = "INSERT INTO masa3 (adet,siparis,tutar)" 
                        + " VALUES ('"+jTextField1.getText()+"','"+lbluruncesidi.getText()+"', '"+lblfiyat.getText()+"')";

                st.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
 }//masa 3 kodları sonu
      else if(isim.equals("masa4"))  //masa4 kodları
     {
      try {
                Class.forName("com.mysql.jdbc.Driver");
              
               
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql = "INSERT INTO masa4 (adet,siparis,tutar)" 
                        + " VALUES ('"+jTextField1.getText()+"','"+lbluruncesidi.getText()+"', '"+lblfiyat.getText()+"')";

                st.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
 }//masa 4 kodları sonu
      else if(isim.equals("masa5"))  //masa5 kodları
     {
      try {
                Class.forName("com.mysql.jdbc.Driver");
              
               
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql = "INSERT INTO masa5 (adet,siparis,tutar)" 
                        + " VALUES ('"+jTextField1.getText()+"','"+lbluruncesidi.getText()+"', '"+lblfiyat.getText()+"')";

                st.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
 }//masa 5 kodları sonu
      else if(isim.equals("masa6"))  //masa6 kodları
     {
      try {
                Class.forName("com.mysql.jdbc.Driver");
              
               
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql = "INSERT INTO masa6 (adet,siparis,tutar)" 
                        + " VALUES ('"+jTextField1.getText()+"','"+lbluruncesidi.getText()+"', '"+lblfiyat.getText()+"')";

                st.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
 }//masa 6 kodları sonu
      else if(isim.equals("masa7"))  //masa7 kodları
     {
      try {
                Class.forName("com.mysql.jdbc.Driver");
              
               
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql = "INSERT INTO masa7 (adet,siparis,tutar)" 
                        + " VALUES ('"+jTextField1.getText()+"','"+lbluruncesidi.getText()+"', '"+lblfiyat.getText()+"')";

                st.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
 }//masa 7 kodları sonu
      else if(isim.equals("masa8"))  //masa8 kodları
     {
      try {
                Class.forName("com.mysql.jdbc.Driver");
              
               
                con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", "");
              st = (Statement) con.createStatement();
                String sql = "INSERT INTO masa8 (adet,siparis,tutar)" 
                        + " VALUES ('"+jTextField1.getText()+"','"+lbluruncesidi.getText()+"', '"+lblfiyat.getText()+"')";

                st.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
 }//masa 8 kodları sonu
 }//son
  
    private void YemekSectir(String belirtec){
        DefaultTableModel tm = new DefaultTableModel(); 
       
        try {
           
         Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/cafe-restaurant?useUnicode=true&characterEncoding=UTF-8", "root", ""); //Mysql sunucusuna bağlandık
        Statement st = (Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from urunler1 where urun_adi='"+belirtec+"'")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
       
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            jTable1.removeAll();
            jTable1.setModel(tm);
        }
        con.close();
    } catch (ClassNotFoundException | SQLException hata) {
       JOptionPane.showMessageDialog(null,"Hata!!"+ hata);
    }
    }
      
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      jTextField1.setText(jTextField1.getText()+"1");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         jTextField1.setText(jTextField1.getText()+"2");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         jTextField1.setText(jTextField1.getText()+"3");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         jTextField1.setText(jTextField1.getText()+"4");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTextField1.setText(jTextField1.getText()+"5");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       jTextField1.setText(jTextField1.getText()+"6");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         jTextField1.setText(jTextField1.getText()+"7");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTextField1.setText(jTextField1.getText()+"8");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       jTextField1.setText(jTextField1.getText()+"9");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jTextField1.setText(jTextField1.getText()+"0");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jTextField1.setText(null);
        
    }//GEN-LAST:event_jButton22ActionPerformed
    //masa bağlama 
   DefaultListModel listmodel=new DefaultListModel();
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    
        lbluruncesidi.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),2))); 
        lblfiyat.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),3))); 
        lblid.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0))); 
        if(jLabel1.getText().equals("Masa 1"))
        {
            if(jTextField1.getText().equals(""))
            {
                   jTextField1.setText("1");
            veritabani("masa1");    
        listmodel.addElement(lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 1");
            }
            else
            {
                veritabani("masa1");
         listmodel.addElement(jTextField1.getText()+" Adet "+lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 1");
            }
             
        }
        //
      else if(jLabel1.getText().equals("Masa 2"))
        {
            if(jTextField1.getText().equals(""))
            {
                   jTextField1.setText("1");
            veritabani("masa2");    
        listmodel.addElement(lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 2");
            }
            else
            {
                veritabani("masa2");
         listmodel.addElement(jTextField1.getText()+" Adet "+lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 2");
            }   
        } 
      //
        else if(jLabel1.getText().equals("Masa 3"))
        {
           if(jTextField1.getText().equals(""))
            {
                   jTextField1.setText("1");
            veritabani("masa3");    
        listmodel.addElement(lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 3");
            }
            else
            {
                veritabani("masa3");
         listmodel.addElement(jTextField1.getText()+" Adet "+lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 3");
            }   
        } 
        //
        else if(jLabel1.getText().equals("Masa 4"))
        {
           if(jTextField1.getText().equals(""))
            {
                   jTextField1.setText("1");
            veritabani("masa4");    
        listmodel.addElement(lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 4");
            }
            else
            {
                veritabani("masa4");
         listmodel.addElement(jTextField1.getText()+" Adet "+lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 4");
            }   
        } 
        //
         else if(jLabel1.getText().equals("Masa 5"))
        {
           if(jTextField1.getText().equals(""))
            {
                   jTextField1.setText("1");
            veritabani("masa5");    
        listmodel.addElement(lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 5");
            }
            else
            {
                veritabani("masa5");
         listmodel.addElement(jTextField1.getText()+" Adet "+lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 5");
            }  
        }
         //
         else if(jLabel1.getText().equals("Masa 6"))
        {
         if(jTextField1.getText().equals(""))
            {
                   jTextField1.setText("1");
            veritabani("masa6");    
        listmodel.addElement(lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 6");
            }
            else
            {
                veritabani("masa6");
         listmodel.addElement(jTextField1.getText()+" Adet "+lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 6");
            }  
        }
         //
         else if(jLabel1.getText().equals("Masa 7"))
        {
            if(jTextField1.getText().equals(""))
            {
                   jTextField1.setText("1");
            veritabani("masa7");    
        listmodel.addElement(lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 7");
            }
            else
            {
                veritabani("masa7");
         listmodel.addElement(jTextField1.getText()+" Adet "+lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 7");
            }   
        }
         //
         else if(jLabel1.getText().equals("Masa 8"))
        {
            if(jTextField1.getText().equals(""))
            {
                   jTextField1.setText("1");
            veritabani("masa8");    
        listmodel.addElement(lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 8");
            }
            else
            {
                veritabani("masa8");
         listmodel.addElement(jTextField1.getText()+" Adet "+lbluruncesidi.getText()+"  "+ lblfiyat.getText());
        jList1.setModel(listmodel);
         masasiparisleri("Masa 8");
            } 
        }
        //
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        YemekSectir("Icecekler");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        YemekSectir("Tatlilar");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        YemekSectir("Salatalar");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        YemekSectir("Kebaplar");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        YemekSectir("Et Yemekleri");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        YemekSectir("Pideler");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        YemekSectir("Dönerler");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        YemekSectir("Çorbalar");
    }//GEN-LAST:event_jButton1ActionPerformed
 
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
 
 String isim=jList1.getSelectedValue().toString();
 String a=isim.substring(0,2);
 if(jLabel1.getText().equals("Masa 1"))
 {   
    
  siparissil("masa1", a);
     masasiparisleri("Masa 1");
     
 }
 else if(jLabel1.getText().equals("Masa 2"))
 {   
    
  siparissil("masa2", a);
     masasiparisleri("Masa 2");
     
 }
  else if(jLabel1.getText().equals("Masa 3"))
 {   
    
  siparissil("masa3", a);
     masasiparisleri("Masa 3");
     
 }
  else if(jLabel1.getText().equals("Masa 4"))
 {   
    
  siparissil("masa4", a);
     masasiparisleri("Masa 4");
     
 }
  else if(jLabel1.getText().equals("Masa 5"))
 {   
    
  siparissil("masa5", a);
    masasiparisleri("Masa 5");
     
 }
  else if(jLabel1.getText().equals("Masa 6"))
 {   
    
  siparissil("masa6", a);
     masasiparisleri("Masa 6");
     
 }
  else if(jLabel1.getText().equals("Masa 7"))
 {   
    
  siparissil("masa7", a);
     masasiparisleri("Masa 7");
     
 }
  else if(jLabel1.getText().equals("Masa 8"))
 {   
    
    siparissil("masa8", a);
     masasiparisleri("Masa 8");
     
 }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Masalar01 frame=new Masalar01();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
       String _masaadi=jLabel1.getText();
        Odeme frame=new Odeme(_masaadi);
      frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
      Anasayfa frame=new Anasayfa();
      frame.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      

    }//GEN-LAST:event_jTable1MouseClicked

 
    public static void main(String args[]) {
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrunSiparisi("masa").setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblfiyat;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbluruncesidi;
    // End of variables declaration//GEN-END:variables
}
