package Tampilan;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Pendistribusian extends javax.swing.JFrame {
    
    Connection conn = new Koneksi.Koneksi_DB().getConnection();
    ResultSet r;
    Statement s;
    
    public String id_mustahiq, nama_mustahiq, jenis_kelamin, golongan, alamat;
    private DefaultTableModel ModelTabel;
    private String  header[] = {"Id Mustahiq","Nama Mustahiq","Jenis Kelamin","Golongan","Alamat","Tanggal","Pendistribusian","Keterangan"};

    public Pendistribusian(){
        initComponents();
        ModelTabel = new DefaultTableModel(null,header);
        tabelpendistribusian.setModel(ModelTabel);
        TableColumn kolom = null;
	for (int x = 0; x < 4; x++) {
            kolom =tabelpendistribusian.getColumnModel().getColumn(x);
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
        String query = "select * from pendistribusian";
	ResultSet rs = st.executeQuery(query);
	while(rs.next())
	{
	Object obj[] = {
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            rs.getString(6),
            rs.getString(7),
            rs.getString(8)};
        ModelTabel.addRow(obj);
	}
        rs.close();
	s.close();
	} catch(Exception ex){
	}
	}
    
    
    
    private void batal(){
        Txtid_mustahiq.setText("");
        Txtnama_mustahiq.setText("");
        Cbjenis_kelamin.setSelectedIndex(0);
        Cbgolongan.setSelectedIndex(0);
        Cbpendistribusian.setSelectedIndex(0);
        Cbgolongan.setSelectedIndex(0);
        Txtalamat.setText("");
        Txttanggal.setText("");
        Cbpendistribusian.setSelectedIndex(0);
        Txtketerangan.setText("");
        
        }
    
    public void itemTerpilih(){
PopUp_pendistribusian popup = new PopUp_pendistribusian();
popup.pendistribusian = this;
Txtid_mustahiq.setText(id_mustahiq);
Txtnama_mustahiq.setText(nama_mustahiq);
Txtalamat.setText(alamat);
Cbjenis_kelamin.setSelectedItem(jenis_kelamin);
Cbgolongan.setSelectedItem(golongan);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glassPanel1 = new GlassSwingControl.GlassPanel();
        lblForm = new javax.swing.JLabel();
        lblNIK = new javax.swing.JLabel();
        Txtid_mustahiq = new javax.swing.JTextField();
        lblAlamat = new javax.swing.JLabel();
        lblAgama = new javax.swing.JLabel();
        lblPendidikan = new javax.swing.JLabel();
        lblJenkel = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txtalamat = new javax.swing.JTextArea();
        Txtnama_mustahiq = new javax.swing.JTextField();
        Cbpendistribusian = new javax.swing.JComboBox();
        Cbgolongan = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelpendistribusian = new javax.swing.JTable();
        Cbjenis_kelamin = new javax.swing.JComboBox<>();
        BtnBackToHome = new javax.swing.JButton();
        BtnNIK = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        lblPT = new javax.swing.JLabel();
        BtnRefresh = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblPendidikan1 = new javax.swing.JLabel();
        lblNama1 = new javax.swing.JLabel();
        Txtketerangan = new javax.swing.JTextField();
        Txttanggal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM PENDISTRIBUSIAN");

        glassPanel1.setPreferredSize(new java.awt.Dimension(520, 560));

        lblForm.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        lblForm.setText("Pendistribusian");

        lblNIK.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNIK.setText("Id Mustahiq");

        Txtid_mustahiq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtid_mustahiqActionPerformed(evt);
            }
        });

        lblAlamat.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblAlamat.setText("Alamat");

        lblAgama.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblAgama.setText("Golongan");

        lblPendidikan.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPendidikan.setText("Pendistribusian");

        lblJenkel.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel.setText("Jenis Kelamin");

        lblNama.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama.setText("Tanggal");

        Txtalamat.setColumns(20);
        Txtalamat.setRows(5);
        jScrollPane1.setViewportView(Txtalamat);

        Cbpendistribusian.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----- Pilih Pendistribusian-----", "Uang", "Beras" }));

        Cbgolongan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----- Pilih Golongan-----", "Fakir", "Miskin", "Fisabilillah", "Amilin" }));

        tabelpendistribusian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        tabelpendistribusian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpendistribusianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelpendistribusian);

        Cbjenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----- Pilih Jenis Kelamin -----", "Laki-Laki", "Perempuan" }));

        BtnBackToHome.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnBackToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home-icon.png"))); // NOI18N
        BtnBackToHome.setText("Kembali");
        BtnBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackToHomeActionPerformed(evt);
            }
        });

        BtnNIK.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnNIK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        BtnNIK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNIKActionPerformed(evt);
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

        lblPendidikan1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPendidikan1.setText("Keterangan");

        lblNama1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama1.setText("Nama Mustahiq");

        Txtketerangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtketeranganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout glassPanel1Layout = new javax.swing.GroupLayout(glassPanel1);
        glassPanel1.setLayout(glassPanel1Layout);
        glassPanel1Layout.setHorizontalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(lblLogo))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lblPT)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txtnama_mustahiq, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cbjenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cbgolongan, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addComponent(lblNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblForm)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addComponent(Txtid_mustahiq, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                .addComponent(lblPendidikan1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addComponent(lblPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cbpendistribusian, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txtketerangan)
                            .addComponent(Txttanggal)))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addComponent(BtnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBackToHome))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        glassPanel1Layout.setVerticalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblForm)
                .addGap(37, 37, 37)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(18, 18, 18)
                        .addComponent(lblPT))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Txtid_mustahiq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(6, 6, 6)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Txtnama_mustahiq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(Txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cbjenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cbgolongan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cbpendistribusian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPendidikan1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtketerangan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBackToHome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );

        glassPanel1.getAccessibleContext().setAccessibleName("PT. TJM");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackToHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnBackToHomeActionPerformed

    private void tabelpendistribusianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpendistribusianMouseClicked
        // TODO add your handling code here:
        if (tabelpendistribusian.getSelectedRow()>=0){
            try{
                Txtid_mustahiq.setText(tabelpendistribusian.getValueAt(tabelpendistribusian.getSelectedRow(), 0).toString());
                Txtnama_mustahiq.setText(tabelpendistribusian.getValueAt(tabelpendistribusian.getSelectedRow(), 1).toString());
                Cbjenis_kelamin.setSelectedItem((String)tabelpendistribusian.getValueAt(tabelpendistribusian.getSelectedRow(),2).toString());
                Cbpendistribusian.setSelectedItem((String)tabelpendistribusian.getValueAt(tabelpendistribusian.getSelectedRow(),6).toString());
                Cbgolongan.setSelectedItem((String)tabelpendistribusian.getValueAt(tabelpendistribusian.getSelectedRow(),3).toString());
                Txtalamat.setText((String)tabelpendistribusian.getValueAt(tabelpendistribusian.getSelectedRow(),4).toString());
                Txttanggal.setText((String)tabelpendistribusian.getValueAt(tabelpendistribusian.getSelectedRow(),5).toString());
                Txtketerangan.setText((String)tabelpendistribusian.getValueAt(tabelpendistribusian.getSelectedRow(),7).toString());
               }catch(Exception e){

            }
        }
    }//GEN-LAST:event_tabelpendistribusianMouseClicked

    private void BtnNIKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNIKActionPerformed
        // TODO add your handling code here:
        PopUp_pendistribusian popup = new PopUp_pendistribusian();
        popup.pendistribusian = this;
        popup.setVisible(true);
        popup.setResizable(false);
    }//GEN-LAST:event_BtnNIKActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        if(Txtid_mustahiq.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Pendistribusian Belum Diisi ");
        } else {
            
            try{
                Connection conn = new Koneksi.Koneksi_DB().getConnection();
                String query = "insert into pendistribusian values(?,?,?,?,?,?,?,?)";
                PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, Txtid_mustahiq.getText());
                prepare.setString(2, Txtnama_mustahiq.getText());
                prepare.setString(3, Cbjenis_kelamin.getSelectedItem().toString());
                prepare.setString(7, Cbpendistribusian.getSelectedItem().toString());
                prepare.setString(4, Cbgolongan.getSelectedItem().toString());
                prepare.setString(5, Txtalamat.getText());
                prepare.setString(6, Txttanggal.getText());
               prepare.setString(8, Txtketerangan.getText());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan Ke Database");
                getDataTable();
            } catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Data gagal disimpan karena : " + e.getMessage());
                }
            batal();
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
      
        try{
            Connection conn = new Koneksi.Koneksi_DB().getConnection();
            String query = "UPDATE pendistribusian SET nama_mustahiq=?, jenis_kelamin=?, golongan=?, alamat=?, tanggal=?, pendistribusian=?, keterangan=? WHERE id_mustahiq=?";
            PreparedStatement prepare = conn.prepareStatement(query);
            prepare.setString(8, Txtid_mustahiq.getText());
            prepare.setString(1, Txtnama_mustahiq.getText());
            prepare.setString(2, Cbjenis_kelamin.getSelectedItem().toString());
            prepare.setString(6, Cbpendistribusian.getSelectedItem().toString());
            prepare.setString(3, Cbgolongan.getSelectedItem().toString());
            prepare.setString(4, Txtalamat.getText());
            prepare.setString(5, Txttanggal.getText());
            prepare.setString(7, Txtketerangan.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diedit Kedalam Database");
            getDataTable();
            batal();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal Diedit Karena : " + e.getMessage());
            }    
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        ModelTabel.getDataVector().removeAllElements();
	ModelTabel.fireTableDataChanged();
            try {
		Connection conn = new Koneksi.Koneksi_DB().getConnection();
                String query = "delete from pendistribusian where id_mustahiq=?";
		PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, Txtid_mustahiq.getText());
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

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        getDataTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void TxtketeranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtketeranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtketeranganActionPerformed

    private void Txtid_mustahiqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtid_mustahiqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtid_mustahiqActionPerformed

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
            java.util.logging.Logger.getLogger(Pendistribusian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendistribusian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendistribusian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendistribusian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Pendistribusian().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBackToHome;
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnNIK;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JComboBox Cbgolongan;
    private javax.swing.JComboBox<String> Cbjenis_kelamin;
    private javax.swing.JComboBox Cbpendistribusian;
    private javax.swing.JTextArea Txtalamat;
    private javax.swing.JTextField Txtid_mustahiq;
    private javax.swing.JTextField Txtketerangan;
    private javax.swing.JTextField Txtnama_mustahiq;
    private javax.swing.JTextField Txttanggal;
    private GlassSwingControl.GlassPanel glassPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgama;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblJenkel;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNIK;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JLabel lblPT;
    private javax.swing.JLabel lblPendidikan;
    private javax.swing.JLabel lblPendidikan1;
    private javax.swing.JTable tabelpendistribusian;
    // End of variables declaration//GEN-END:variables
}
