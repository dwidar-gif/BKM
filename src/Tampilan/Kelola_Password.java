package Tampilan;

import java.io.File;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Kelola_Password extends javax.swing.JFrame {

    JasperReport jasperReport; 
    JasperDesign jasperDesign;
    JasperPrint jasperPrint;
    Map <String,Object> param = new HashMap<String,Object>();
    
    Connection conn = new Koneksi.Koneksi_DB().getConnection();
    ResultSet r;
    Statement s;
    private DefaultTableModel ModelTabel;
    private String[] header={"Username","Password","Hak Akses"};
    
    public Kelola_Password(){
        initComponents();
        ModelTabel = new DefaultTableModel(null,header);
        Tabel_User.setModel(ModelTabel);
        TableColumn kolom = null;
	for (int x = 0; x < 3; x++) {
            kolom =Tabel_User.getColumnModel().getColumn(x);
	    if (x == 0){
	        kolom.setPreferredWidth(100);}
            else if(x == 1){
		kolom.setPreferredWidth(100);}
            else if(x == 2){
		kolom.setPreferredWidth(100);}
            else if(x == 3){
		
            kolom.setPreferredWidth(100);}
            }
    }
    
    private void getDataTable(){
	ModelTabel.getDataVector().removeAllElements();
	ModelTabel.fireTableDataChanged();
	
        try {
        Connection conn = new Koneksi.Koneksi_DB().getConnection();
	Statement st = conn.createStatement();
        String query = "select * from user";
	ResultSet rs = st.executeQuery(query);
	while(rs.next()){
	Object obj[] = {
            rs.getString(1),
            rs.getString(2),
            rs.getString(3)};
        ModelTabel.addRow(obj);
	}
        rs.close();
	s.close();
	} catch(Exception ex){
        }
    }
    
    private void Bersih() {
        txtUsername.setText("");
        CbHakAkses.setSelectedIndex(0);
        txtPassword.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glassPanel1 = new GlassSwingControl.GlassPanel();
        lblForm = new javax.swing.JLabel();
        lblKode = new javax.swing.JLabel();
        lblJabatan = new javax.swing.JLabel();
        CbHakAkses = new javax.swing.JComboBox();
        lblGapok = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        BtnSimpan = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        lblPT2 = new javax.swing.JLabel();
        BtnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_User = new javax.swing.JTable();
        BtnPrint = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        lblGapok1 = new javax.swing.JLabel();
        CtkHakAkses = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENGATURAN USER");

        glassPanel1.setPreferredSize(new java.awt.Dimension(520, 560));

        lblForm.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        lblForm.setText("Pengaturan User");

        lblKode.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblKode.setText("Username");

        lblJabatan.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJabatan.setText("Password");

        CbHakAkses.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CbHakAkses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----- Pilih Hak Akses -----", "Master", "Pegawai", "Sekretaris", "Lurah" }));
        CbHakAkses.setToolTipText("");

        lblGapok.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblGapok.setText("Hak Akses");

        BtnSimpan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Simpan_2.png"))); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnEdit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit.png"))); // NOI18N
        BtnEdit.setText("Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnBatal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hapus2.png"))); // NOI18N
        BtnBatal.setText("Batal");
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });

        lblPT2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPT2.setText("Kelurahan Pejaten Timur");

        BtnHapus.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        Tabel_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Tabel_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_User);

        BtnPrint.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer_on.png"))); // NOI18N
        BtnPrint.setText("Print");
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });

        BtnBack.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home-icon.png"))); // NOI18N
        BtnBack.setText("Kembali");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnRefresh.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BtnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        BtnRefresh.setText(" Refresh");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        lblGapok1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblGapok1.setText(".: Cetak berdasarkan hak akses");

        CtkHakAkses.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CtkHakAkses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----- Pilih Hak Akses -----", "Master", "Pegawai", "Sekretaris", "Lurah" }));

        javax.swing.GroupLayout glassPanel1Layout = new javax.swing.GroupLayout(glassPanel1);
        glassPanel1.setLayout(glassPanel1Layout);
        glassPanel1Layout.setHorizontalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addComponent(lblJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                .addComponent(lblGapok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CbHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addComponent(lblKode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblForm)
                                    .addComponent(lblPT2)))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addComponent(CtkHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnBack))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblGapok1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRefresh)))
                .addContainerGap())
        );
        glassPanel1Layout.setVerticalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPT2)
                .addGap(18, 18, 18)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGapok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGapok1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack)
                    .addComponent(CtkHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = new Koneksi.Koneksi_DB().getConnection();
            String query = "insert into user values(?,?,?)";
                PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, txtUsername.getText());
                prepare.setString(2, txtPassword.getText());
                prepare.setString(3, CbHakAkses.getSelectedItem().toString());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data User Berhasil Disimpan Ke Database");
                getDataTable();
            } catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Data gagal disimpan karena : " + e.getMessage());
                }
            Bersih();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = new Koneksi.Koneksi_DB().getConnection();
            String query = "UPDATE user SET username=?, password=? WHERE hak_akses=?";
            PreparedStatement prepare = conn.prepareStatement(query);
            prepare.setString(3, CbHakAkses.getSelectedItem().toString());
            prepare.setString(1, txtUsername.getText());
            prepare.setString(2, txtPassword.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diedit Kedalam Database");
            getDataTable();
            Bersih();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal Diedit Karena : " + e.getMessage());
        }
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        // TODO add your handling code here:
        Bersih();
    }//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
        // TODO add your handling code here:
            try { 
            File file = new File("src/Laporan/lap_data_password.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.put("hak_akses",CtkHakAkses.getSelectedItem());
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport,param,conn);
            JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak!"+ "\n" + e.getMessage(), "Cetak Data", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_BtnPrintActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void Tabel_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_UserMouseClicked
        // TODO add your handling code here:
        if (Tabel_User.getSelectedRow()>=0){
            try{
                txtUsername.setText(Tabel_User.getValueAt(Tabel_User.getSelectedRow(), 0).toString());
                txtPassword.setText(Tabel_User.getValueAt(Tabel_User.getSelectedRow(), 1).toString());
                CbHakAkses.setSelectedItem((String)Tabel_User.getValueAt(Tabel_User.getSelectedRow(),2).toString());
                }catch(Exception e){
            }
        }
    }//GEN-LAST:event_Tabel_UserMouseClicked

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        ModelTabel.getDataVector().removeAllElements();
	ModelTabel.fireTableDataChanged();
            try {
		Connection conn = new Koneksi.Koneksi_DB().getConnection();
                String query = "delete from user where hak_akses=?";
		PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, CbHakAkses.getSelectedItem().toString());
                prepare.executeUpdate();
		JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
		getDataTable();
                Bersih();
                } 
		catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex);
                    System.out.println(ex);
            }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        getDataTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelola_Password().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnPrint;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JComboBox CbHakAkses;
    private javax.swing.JComboBox CtkHakAkses;
    private javax.swing.JTable Tabel_User;
    private GlassSwingControl.GlassPanel glassPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblGapok;
    private javax.swing.JLabel lblGapok1;
    private javax.swing.JLabel lblJabatan;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblPT2;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
