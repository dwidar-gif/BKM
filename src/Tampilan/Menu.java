/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Menu extends javax.swing.JFrame{
    
    Connection conn = new Koneksi.Koneksi_DB().getConnection();
    ResultSet r;
    Statement s;
    
    public Menu(String HakAkses) {
        initComponents();
        cariHakAkses(HakAkses);
    }
    
    private void cariHakAkses(String Hak){
        if(Hak.equalsIgnoreCase("Admin")){
           BtnZakatMal.setVisible(true);
            BtnLogout.setVisible(true);
            BtnKelolaPassword.setVisible(true);
            txtHakAkses.setText("Admin");
            }
        
        else if(Hak.equalsIgnoreCase("Petugas")){
            BtnPetugas.setEnabled(false);
            BtnKelolaPassword.setEnabled(false);
            BtnMustahiq.setEnabled(false);
            txtHakAkses.setText("Petugas");
            }
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glassPanel1 = new GlassSwingControl.GlassPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnZakatMal = new GlassSwingControl.GlassButton();
        BtnKelolaPassword = new GlassSwingControl.GlassButton();
        BtnLogout = new GlassSwingControl.GlassButton();
        txtHakAkses1 = new javax.swing.JLabel();
        txtHakAkses = new javax.swing.JLabel();
        LblJabatan = new javax.swing.JLabel();
        BtnPendistribusian = new GlassSwingControl.GlassButton();
        LblJabatan1 = new javax.swing.JLabel();
        LblJabatan2 = new javax.swing.JLabel();
        LblKaryawan1 = new javax.swing.JLabel();
        LblJabatan4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnLaporanMal = new GlassSwingControl.GlassButton();
        LblJabatan6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnMustahiq = new GlassSwingControl.GlassButton();
        BtnPetugas = new GlassSwingControl.GlassButton();
        BtnZakatFitrah = new GlassSwingControl.GlassButton();
        LblJabatan3 = new javax.swing.JLabel();
        LblKaryawan2 = new javax.swing.JLabel();
        BtnLaporanFitrah = new GlassSwingControl.GlassButton();
        LblJabatan7 = new javax.swing.JLabel();
        BtnLaporanPendistribusian = new GlassSwingControl.GlassButton();
        LblJabatan8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 30)); // NOI18N
        jLabel3.setText("Sistem Informasi Pengelolaan Dana Zakat Infaq dan Shadaqah (ZIS)");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Masjid Jami' Al-Hidayah");

        BtnZakatMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1369491936_coins.png"))); // NOI18N
        BtnZakatMal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnZakatMalActionPerformed(evt);
            }
        });

        BtnKelolaPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Batal.png"))); // NOI18N
        BtnKelolaPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKelolaPasswordActionPerformed(evt);
            }
        });

        BtnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });

        txtHakAkses1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHakAkses1.setForeground(new java.awt.Color(0, 51, 204));
        txtHakAkses1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1369491944_Profile.png"))); // NOI18N
        txtHakAkses1.setText("Anda Login Sebagai :");

        txtHakAkses.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHakAkses.setForeground(new java.awt.Color(0, 0, 255));

        LblJabatan.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblJabatan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJabatan.setText("Data Petugas");

        BtnPendistribusian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1369491920_23.png"))); // NOI18N
        BtnPendistribusian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPendistribusianActionPerformed(evt);
            }
        });

        LblJabatan1.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblJabatan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJabatan1.setText("Data Mustahiq");

        LblJabatan2.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblJabatan2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJabatan2.setText("Pendistribusian");

        LblKaryawan1.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblKaryawan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblKaryawan1.setText("Kelola Password");

        LblJabatan4.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblJabatan4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJabatan4.setText("Keluar");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat :");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Komp. Rafflesia Jl. Papandayan Rw-014 Jatimakmur Bekasi");

        BtnLaporanMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer_on.png"))); // NOI18N
        BtnLaporanMal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLaporanMalActionPerformed(evt);
            }
        });

        LblJabatan6.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblJabatan6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJabatan6.setText("Laporan Zakat Fitrah");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo masjid.png"))); // NOI18N

        BtnMustahiq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/friends.png"))); // NOI18N
        BtnMustahiq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMustahiqActionPerformed(evt);
            }
        });

        BtnPetugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1369491944_Profile.png"))); // NOI18N
        BtnPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPetugasActionPerformed(evt);
            }
        });

        BtnZakatFitrah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1369491936_coins.png"))); // NOI18N
        BtnZakatFitrah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnZakatFitrahActionPerformed(evt);
            }
        });

        LblJabatan3.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblJabatan3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJabatan3.setText("Zakat Fitrah");

        LblKaryawan2.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblKaryawan2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblKaryawan2.setText("Zakat Mal");

        BtnLaporanFitrah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer_on.png"))); // NOI18N
        BtnLaporanFitrah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLaporanFitrahActionPerformed(evt);
            }
        });

        LblJabatan7.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblJabatan7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJabatan7.setText("Laporan Zakat Mal");

        BtnLaporanPendistribusian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer_on.png"))); // NOI18N
        BtnLaporanPendistribusian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLaporanPendistribusianActionPerformed(evt);
            }
        });

        LblJabatan8.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        LblJabatan8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJabatan8.setText("Laporan Pendistribusian");

        javax.swing.GroupLayout glassPanel1Layout = new javax.swing.GroupLayout(glassPanel1);
        glassPanel1.setLayout(glassPanel1Layout);
        glassPanel1Layout.setHorizontalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblKaryawan2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnLaporanFitrah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblJabatan6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BtnLaporanPendistribusian, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(BtnKelolaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblJabatan7)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addComponent(LblJabatan8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LblKaryawan1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addGap(11, 11, 11)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnPendistribusian, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblJabatan2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(BtnLaporanMal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(glassPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(BtnPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(BtnMustahiq, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(BtnZakatFitrah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                            .addComponent(LblJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LblJabatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(LblJabatan3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(BtnZakatMal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblJabatan4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(txtHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(txtHakAkses1)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        glassPanel1Layout.setVerticalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(60, 60, 60)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMustahiq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnZakatFitrah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblJabatan3)
                        .addComponent(LblJabatan1))
                    .addComponent(LblJabatan))
                .addGap(11, 11, 11)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnZakatMal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPendistribusian, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnLaporanMal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblJabatan2)
                            .addComponent(LblKaryawan2)
                            .addComponent(LblJabatan7))
                        .addGap(18, 18, 18)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnLaporanFitrah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnKelolaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnLaporanPendistribusian, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblJabatan6)
                                    .addComponent(LblJabatan8)
                                    .addComponent(LblKaryawan1))
                                .addGap(18, 18, 18)
                                .addComponent(BtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LblJabatan4)
                                .addGap(0, 17, Short.MAX_VALUE))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(txtHakAkses1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(192, 192, 192)))
                .addComponent(txtHakAkses, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnZakatMalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnZakatMalActionPerformed
        // TODO add your handling code here:
        new Zakat_mal().show();
    }//GEN-LAST:event_BtnZakatMalActionPerformed

    private void BtnKelolaPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKelolaPasswordActionPerformed
        // TODO add your handling code here:
        new Kelola_Password().show();
    }//GEN-LAST:event_BtnKelolaPasswordActionPerformed

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Apakah Anda Akan Keluar Dari Program Ini...?","INFORMASI",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/Image/gnome_session_logout.png"));
        try {
            new Login().show();

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void BtnPendistribusianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPendistribusianActionPerformed
        // TODO add your handling code here:
        new Pendistribusian().show();
    }//GEN-LAST:event_BtnPendistribusianActionPerformed

    private void BtnLaporanMalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLaporanMalActionPerformed
        // TODO add your handling code here:
        new Cetak_Laporan_Zakat_mal().show();
    }//GEN-LAST:event_BtnLaporanMalActionPerformed

    private void BtnMustahiqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMustahiqActionPerformed
        // TODO add your handling code here:
        new Data_Mustahiq ().show();
        
    }//GEN-LAST:event_BtnMustahiqActionPerformed

    private void BtnPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPetugasActionPerformed
        // TODO add your handling code here:
        new Data_Petugas().show();
    }//GEN-LAST:event_BtnPetugasActionPerformed

    private void BtnZakatFitrahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnZakatFitrahActionPerformed
        // TODO add your handling code here:
        new Zakat_Fitrah().show();
    }//GEN-LAST:event_BtnZakatFitrahActionPerformed

    private void BtnLaporanFitrahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLaporanFitrahActionPerformed
        // TODO add your handling code here:
        new Cetak_Laporan_Zakat_Fitrah().show();
    }//GEN-LAST:event_BtnLaporanFitrahActionPerformed

    private void BtnLaporanPendistribusianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLaporanPendistribusianActionPerformed
        // TODO add your handling code here:
        new Cetak_Laporan_Pendistribusian().show();
    }//GEN-LAST:event_BtnLaporanPendistribusianActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GlassSwingControl.GlassButton BtnKelolaPassword;
    private GlassSwingControl.GlassButton BtnLaporanFitrah;
    private GlassSwingControl.GlassButton BtnLaporanMal;
    private GlassSwingControl.GlassButton BtnLaporanPendistribusian;
    private GlassSwingControl.GlassButton BtnLogout;
    private GlassSwingControl.GlassButton BtnMustahiq;
    private GlassSwingControl.GlassButton BtnPendistribusian;
    private GlassSwingControl.GlassButton BtnPetugas;
    private GlassSwingControl.GlassButton BtnZakatFitrah;
    private GlassSwingControl.GlassButton BtnZakatMal;
    private javax.swing.JLabel LblJabatan;
    private javax.swing.JLabel LblJabatan1;
    private javax.swing.JLabel LblJabatan2;
    private javax.swing.JLabel LblJabatan3;
    private javax.swing.JLabel LblJabatan4;
    private javax.swing.JLabel LblJabatan6;
    private javax.swing.JLabel LblJabatan7;
    private javax.swing.JLabel LblJabatan8;
    private javax.swing.JLabel LblKaryawan1;
    private javax.swing.JLabel LblKaryawan2;
    private GlassSwingControl.GlassPanel glassPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txtHakAkses;
    private javax.swing.JLabel txtHakAkses1;
    // End of variables declaration//GEN-END:variables
}
