package Cafe_Restaurant;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author duman
 */
public class Masalar01 extends javax.swing.JFrame {

    private void masaacma(String masaadi){
// masalar açma işine yarar
        UrunSiparisi frame=new UrunSiparisi(masaadi);
        frame.setVisible(true);
        this.setVisible(false);
    }
     
    public Masalar01() {
        initComponents();
//sayfa tam ekran yapma kodu
this.setExtendedState(this.MAXIMIZED_BOTH);
            
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btnmasa2 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        Btnmasa5 = new javax.swing.JButton();
        Btnmasa1 = new javax.swing.JButton();
        Btnmasa3 = new javax.swing.JButton();
        Btnmasa7 = new javax.swing.JButton();
        Btnmasa8 = new javax.swing.JButton();
        Btnmasa4 = new javax.swing.JButton();
        Btnmasa6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Btnmasa2.setBackground(new java.awt.Color(204, 204, 204));
        Btnmasa2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btnmasa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.png"))); // NOI18N
        Btnmasa2.setText("Masa 2");
        Btnmasa2.setIconTextGap(-135);
        Btnmasa2.setVerifyInputWhenFocusTarget(false);
        Btnmasa2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnmasa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnmasa2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnmasa2MouseExited(evt);
            }
        });
        Btnmasa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnmasa2ActionPerformed(evt);
            }
        });

        jButton43.setForeground(new java.awt.Color(255, 0, 0));
        jButton43.setText("Ana Menü");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        Btnmasa5.setBackground(new java.awt.Color(204, 204, 204));
        Btnmasa5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btnmasa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.png"))); // NOI18N
        Btnmasa5.setText("Masa 5");
        Btnmasa5.setIconTextGap(-135);
        Btnmasa5.setVerifyInputWhenFocusTarget(false);
        Btnmasa5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnmasa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnmasa5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnmasa5MouseExited(evt);
            }
        });
        Btnmasa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnmasa5ActionPerformed(evt);
            }
        });

        Btnmasa1.setBackground(new java.awt.Color(204, 204, 204));
        Btnmasa1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btnmasa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.png"))); // NOI18N
        Btnmasa1.setText("Masa 1");
        Btnmasa1.setIconTextGap(-135);
        Btnmasa1.setVerifyInputWhenFocusTarget(false);
        Btnmasa1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnmasa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnmasa1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnmasa1MouseExited(evt);
            }
        });
        Btnmasa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnmasa1ActionPerformed(evt);
            }
        });

        Btnmasa3.setBackground(new java.awt.Color(204, 204, 204));
        Btnmasa3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btnmasa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.png"))); // NOI18N
        Btnmasa3.setText("Masa 3");
        Btnmasa3.setIconTextGap(-135);
        Btnmasa3.setVerifyInputWhenFocusTarget(false);
        Btnmasa3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnmasa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnmasa3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnmasa3MouseExited(evt);
            }
        });
        Btnmasa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnmasa3ActionPerformed(evt);
            }
        });

        Btnmasa7.setBackground(new java.awt.Color(204, 204, 204));
        Btnmasa7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btnmasa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.png"))); // NOI18N
        Btnmasa7.setText("Masa 7");
        Btnmasa7.setIconTextGap(-135);
        Btnmasa7.setVerifyInputWhenFocusTarget(false);
        Btnmasa7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnmasa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnmasa7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnmasa7MouseExited(evt);
            }
        });
        Btnmasa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnmasa7ActionPerformed(evt);
            }
        });

        Btnmasa8.setBackground(new java.awt.Color(204, 204, 204));
        Btnmasa8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btnmasa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.png"))); // NOI18N
        Btnmasa8.setText("Masa 8");
        Btnmasa8.setIconTextGap(-135);
        Btnmasa8.setVerifyInputWhenFocusTarget(false);
        Btnmasa8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnmasa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnmasa8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnmasa8MouseExited(evt);
            }
        });
        Btnmasa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnmasa8ActionPerformed(evt);
            }
        });

        Btnmasa4.setBackground(new java.awt.Color(204, 204, 204));
        Btnmasa4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btnmasa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.png"))); // NOI18N
        Btnmasa4.setText("Masa 4");
        Btnmasa4.setIconTextGap(-135);
        Btnmasa4.setVerifyInputWhenFocusTarget(false);
        Btnmasa4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnmasa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnmasa4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnmasa4MouseExited(evt);
            }
        });
        Btnmasa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnmasa4ActionPerformed(evt);
            }
        });

        Btnmasa6.setBackground(new java.awt.Color(204, 204, 204));
        Btnmasa6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btnmasa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/masalar.png"))); // NOI18N
        Btnmasa6.setText("Masa 6");
        Btnmasa6.setIconTextGap(-135);
        Btnmasa6.setVerifyInputWhenFocusTarget(false);
        Btnmasa6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnmasa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnmasa6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnmasa6MouseExited(evt);
            }
        });
        Btnmasa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnmasa6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnmasa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnmasa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnmasa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnmasa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa8, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnmasa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnmasa5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btnmasa6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btnmasa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnmasa2ActionPerformed
       masaacma("Masa 2");
    
    }//GEN-LAST:event_Btnmasa2ActionPerformed

    private void Btnmasa2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa2MouseExited
Btnmasa2.setBackground(Color.LIGHT_GRAY);    
        // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa2MouseExited

    private void Btnmasa2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa2MouseEntered
Btnmasa2.setBackground(Color.GREEN);    
        // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa2MouseEntered

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
      Anasayfa frame=new Anasayfa();
      frame.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void Btnmasa5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa5MouseEntered
    Btnmasa5.setBackground(Color.GREEN);     // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa5MouseEntered

    private void Btnmasa5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa5MouseExited
       Btnmasa5.setBackground(Color.LIGHT_GRAY); // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa5MouseExited

    private void Btnmasa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnmasa5ActionPerformed
        masaacma("Masa 5");
    }//GEN-LAST:event_Btnmasa5ActionPerformed

    private void Btnmasa1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa1MouseEntered
      Btnmasa1.setBackground(Color.GREEN);   // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa1MouseEntered

    private void Btnmasa1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa1MouseExited
      Btnmasa1.setBackground(Color.LIGHT_GRAY);  // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa1MouseExited

    private void Btnmasa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnmasa1ActionPerformed
      
//       masaislemleri cls=new masaislemleri();
//        int uzunluk=Btnmasa1.getText().length();
//    
//        cls._ButtonValue=Btnmasa1.getText().substring(uzunluk-6,6);
//        cls._ButtonAdi=Btnmasa1.getText();
       
        
        
        masaacma("Masa 1"); // masa açma formu gelecek
      
    }//GEN-LAST:event_Btnmasa1ActionPerformed

    private void Btnmasa3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa3MouseEntered
       Btnmasa3.setBackground(Color.GREEN);  // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa3MouseEntered

    private void Btnmasa3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa3MouseExited
       Btnmasa3.setBackground(Color.LIGHT_GRAY); // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa3MouseExited

    private void Btnmasa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnmasa3ActionPerformed
masaacma("Masa 3");      
    }//GEN-LAST:event_Btnmasa3ActionPerformed

    private void Btnmasa7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa7MouseEntered
      Btnmasa7.setBackground(Color.GREEN);   // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa7MouseEntered

    private void Btnmasa7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa7MouseExited
      Btnmasa7.setBackground(Color.LIGHT_GRAY);  // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa7MouseExited

    private void Btnmasa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnmasa7ActionPerformed
       masaacma("Masa 7");
    }//GEN-LAST:event_Btnmasa7ActionPerformed

    private void Btnmasa8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa8MouseEntered
      Btnmasa8.setBackground(Color.GREEN);   // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa8MouseEntered

    private void Btnmasa8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa8MouseExited
      Btnmasa8.setBackground(Color.LIGHT_GRAY);   // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa8MouseExited

    private void Btnmasa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnmasa8ActionPerformed
       masaacma("Masa 8");
    }//GEN-LAST:event_Btnmasa8ActionPerformed

    private void Btnmasa4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa4MouseEntered
    Btnmasa4.setBackground(Color.GREEN);     // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa4MouseEntered

    private void Btnmasa4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa4MouseExited
       Btnmasa4.setBackground(Color.LIGHT_GRAY);  // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa4MouseExited

    private void Btnmasa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnmasa4ActionPerformed
masaacma("Masa 4");        
    }//GEN-LAST:event_Btnmasa4ActionPerformed

    private void Btnmasa6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa6MouseEntered
      Btnmasa6.setBackground(Color.GREEN);   // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa6MouseEntered

    private void Btnmasa6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnmasa6MouseExited
       Btnmasa6.setBackground(Color.LIGHT_GRAY);  // TODO add your handling code here:
    }//GEN-LAST:event_Btnmasa6MouseExited

    private void Btnmasa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnmasa6ActionPerformed
       masaacma("Masa 6");
    }//GEN-LAST:event_Btnmasa6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Masalar01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnmasa1;
    private javax.swing.JButton Btnmasa2;
    private javax.swing.JButton Btnmasa3;
    private javax.swing.JButton Btnmasa4;
    private javax.swing.JButton Btnmasa5;
    private javax.swing.JButton Btnmasa6;
    private javax.swing.JButton Btnmasa7;
    private javax.swing.JButton Btnmasa8;
    private javax.swing.JButton jButton43;
    // End of variables declaration//GEN-END:variables
}
