package Tampilan;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Data_Petugas extends javax.swing.JFrame {
    
    Connection conn = new Koneksi.Koneksi_DB().getConnection();
    ResultSet r;
    Statement s;
    
    private DefaultTableModel ModelTabel;
    private String  header[] = {"Id Petugas","Nama Petugas","Jenis Kelamin","Status","No Telepon","Alamat"};

    public Data_Petugas(){
        initComponents();
        ModelTabel = new DefaultTableModel(null,header);
        tabeldata_petugas.setModel(ModelTabel);
        TableColumn kolom = null;
	for (int x = 0; x < 4; x++) {
            kolom =tabeldata_petugas.getColumnModel().getColumn(x);
	    if (x == 0){
	        kolom.setPreferredWidth(100);}
            else if(x == 1){
		kolom.setPreferredWidth(100);}
            else if(x == 2){
		kolom.setPreferredWidth(100);}
            else if(x == 3){
		kolom.setPreferredWidth(100);}
            else if(x == 4){
            kolom.setPreferredWidth(100);}
            }
        }
    
    private void getDataTable(){
	ModelTabel.getDataVector().removeAllElements();
	ModelTabel.fireTableDataChanged();
	
        try {
        Connection conn = new Koneksi.Koneksi_DB().getConnection();
	Statement st = conn.createStatement();
        String query = "select * from data_petugas";
	ResultSet rs = st.executeQuery(query);
	while(rs.next())
	{
	Object obj[] = {
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            rs.getString(6)};
        ModelTabel.addRow(obj);
	}
        rs.close();
	s.close();
	} catch(Exception ex){
	}
	}
    
 
    
    private void batal(){
        Txtid_petugas.setText("");
        Txtno_telepon.setText("");
        Txtalamat.setText("");
        Txtnama_Petugas.setText("");
        jComboBoxjenis_kelamin.setSelectedIndex(0);
        jComboBoxstatus.setSelectedIndex(0);
        }
    
    Calendar gc = new GregorianCalendar();
    String tanggal ="dd-MM-yyyy" ; 
    DateFormat fm = new SimpleDateFormat(tanggal);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glassPanel1 = new GlassSwingControl.GlassPanel();
        lblForm = new javax.swing.JLabel();
        lblPendidikan = new javax.swing.JLabel();
        lblTglLahir = new javax.swing.JLabel();
        lblJenkel = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txtalamat = new javax.swing.JTextArea();
        Txtid_petugas = new javax.swing.JTextField();
        Txtno_telepon = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeldata_petugas = new javax.swing.JTable();
        BtnBackToHome = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        lblPT = new javax.swing.JLabel();
        BtnRefresh = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblTglLahir1 = new javax.swing.JLabel();
        lblJenkel1 = new javax.swing.JLabel();
        lblPT3 = new javax.swing.JLabel();
        lblPT4 = new javax.swing.JLabel();
        Txtnama_Petugas = new javax.swing.JTextField();
        jComboBoxjenis_kelamin = new javax.swing.JComboBox<>();
        lblJenkel2 = new javax.swing.JLabel();
        jComboBoxstatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM DATA PETUGAS");

        glassPanel1.setPreferredSize(new java.awt.Dimension(520, 560));

        lblForm.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        lblForm.setText("Data Petugas");

        lblPendidikan.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPendidikan.setText("Alamat");

        lblTglLahir.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblTglLahir.setText("Nama Petugas");

        lblJenkel.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel.setText("No Telepon");

        lblNama.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama.setText("Id Petugas");

        Txtalamat.setColumns(20);
        Txtalamat.setRows(5);
        jScrollPane1.setViewportView(Txtalamat);

        Txtid_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtid_petugasActionPerformed(evt);
            }
        });

        tabeldata_petugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabeldata_petugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldata_petugasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeldata_petugas);

        BtnBackToHome.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnBackToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home-icon.png"))); // NOI18N
        BtnBackToHome.setText("Kembali");
        BtnBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackToHomeActionPerformed(evt);
            }
        });

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
        BtnEdit.setText(" Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnHapus.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
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

        lblPT.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblPT.setText("Masjid Jami' Al-Hidayah");

        BtnRefresh.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BtnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view-refresh-3.png"))); // NOI18N
        BtnRefresh.setText("Tabel");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo masjid.png"))); // NOI18N

        lblTglLahir1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblTglLahir1.setText("Jenis Kelamin");

        lblJenkel1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        lblPT3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        lblPT4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPT4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jComboBoxjenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih Jenis Kelamin---", "Laki-Laki", "Perempuan" }));

        lblJenkel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel2.setText("Status");

        jComboBoxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih Status---", "Menikah", "Belum Menikah" }));

        javax.swing.GroupLayout glassPanel1Layout = new javax.swing.GroupLayout(glassPanel1);
        glassPanel1.setLayout(glassPanel1Layout);
        glassPanel1Layout.setHorizontalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPT)
                                    .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblPT4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPT3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(lblLogo)))
                        .addGap(64, 64, 64)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTglLahir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTglLahir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblJenkel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBoxstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxjenis_kelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblJenkel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(Txtnama_Petugas)
                                    .addComponent(Txtid_petugas)))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPendidikan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(Txtno_telepon)))))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lblForm))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BtnRefresh)
                        .addGap(521, 521, 521)
                        .addComponent(BtnBackToHome))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        glassPanel1Layout.setVerticalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addComponent(lblForm)
                        .addGap(28, 28, 28)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txtid_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtnama_Petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTglLahir1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxjenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblJenkel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblJenkel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))))
                            .addComponent(lblLogo)))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addComponent(lblPT3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPT4)
                        .addGap(220, 220, 220)))
                .addGap(9, 9, 9)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenkel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtno_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBackToHome))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        glassPanel1.getAccessibleContext().setAccessibleName("PT. TJM");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        getDataTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        ModelTabel.getDataVector().removeAllElements();
        ModelTabel.fireTableDataChanged();
        try {
            Connection conn = new Koneksi.Koneksi_DB().getConnection();
            String query = "delete from data_petugas where id_petugas=?";
            PreparedStatement prepare = conn.prepareStatement(query);
            prepare.setString(1, Txtid_petugas.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
            getDataTable();
            batal();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = new Koneksi.Koneksi_DB().getConnection();
            String query = "UPDATE data_petugas SET nama_petugas=?,jenis_kelamin=?, status=?, no_telepon=?, alamat=? WHERE id_petugas=?";
            PreparedStatement prepare = conn.prepareStatement(query);
            prepare.setString(6, Txtid_petugas.getText());
            prepare.setString(1, Txtnama_Petugas.getText());
            prepare.setString(2,jComboBoxjenis_kelamin.getSelectedItem().toString());
                prepare.setString(3,jComboBoxstatus.getSelectedItem().toString());
                prepare.setString(4, Txtno_telepon.getText());
                prepare.setString(5, Txtalamat.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diedit Kedalam Database");
            getDataTable();
            batal();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal Diedit Karena : " + e.getMessage());
        }
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        if(Txtid_petugas.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Data Petugas Belum Diisi ");
        } else {
            
            try{
                Connection conn = new Koneksi.Koneksi_DB().getConnection();
                String query = "insert into data_petugas values(?,?,?,?,?,?)";
                PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, Txtid_petugas.getText());
                prepare.setString(2, Txtnama_Petugas.getText());
                prepare.setString(3,jComboBoxjenis_kelamin.getSelectedItem().toString());
                prepare.setString(4,jComboBoxstatus.getSelectedItem().toString());
                prepare.setString(5, Txtno_telepon.getText());
                prepare.setString(6, Txtalamat.getText());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan Ke Database");
                getDataTable();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data gagal disimpan karena : " + e.getMessage());
            }
            batal();
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackToHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnBackToHomeActionPerformed

    private void tabeldata_petugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldata_petugasMouseClicked
        // TODO add your handling code here:
        if (tabeldata_petugas.getSelectedRow()>=0){
            try{
                Txtid_petugas.setText(tabeldata_petugas.getValueAt(tabeldata_petugas.getSelectedRow(), 0).toString());
                Txtnama_Petugas.setText(tabeldata_petugas.getValueAt(tabeldata_petugas.getSelectedRow(), 1).toString());
                jComboBoxjenis_kelamin.setSelectedItem((String)tabeldata_petugas.getValueAt(tabeldata_petugas.getSelectedRow(), 2).toString());
                  jComboBoxstatus.setSelectedItem((String)tabeldata_petugas.getValueAt(tabeldata_petugas.getSelectedRow(), 3).toString());
                Txtno_telepon.setText(tabeldata_petugas.getValueAt(tabeldata_petugas.getSelectedRow(), 4).toString());
                Txtalamat.setText((String)tabeldata_petugas.getValueAt(tabeldata_petugas.getSelectedRow(),5).toString());
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_tabeldata_petugasMouseClicked

    private void Txtid_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtid_petugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtid_petugasActionPerformed

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
            java.util.logging.Logger.getLogger(Data_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Petugas().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBackToHome;
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JTextArea Txtalamat;
    private javax.swing.JTextField Txtid_petugas;
    private javax.swing.JTextField Txtnama_Petugas;
    private javax.swing.JTextField Txtno_telepon;
    private GlassSwingControl.GlassPanel glassPanel1;
    private javax.swing.JComboBox<String> jComboBoxjenis_kelamin;
    private javax.swing.JComboBox<String> jComboBoxstatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblJenkel;
    private javax.swing.JLabel lblJenkel1;
    private javax.swing.JLabel lblJenkel2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblPT;
    private javax.swing.JLabel lblPT3;
    private javax.swing.JLabel lblPT4;
    private javax.swing.JLabel lblPendidikan;
    private javax.swing.JLabel lblTglLahir;
    private javax.swing.JLabel lblTglLahir1;
    private javax.swing.JTable tabeldata_petugas;
    // End of variables declaration//GEN-END:variables
}
