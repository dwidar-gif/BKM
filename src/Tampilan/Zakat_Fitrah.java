package Tampilan;

import java.io.File;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Zakat_Fitrah extends javax.swing.JFrame {
    JasperReport jasperReport; 
    JasperDesign jasperDesign;
    JasperPrint jasperPrint;
    Map <String,Object> param = new HashMap<String,Object>();
    
    
    Connection conn = new Koneksi.Koneksi_DB().getConnection();
    ResultSet r;
    Statement s;
    
    private DefaultTableModel ModelTabel;
    private String  header[] = {"No Penerimaan","Tanggal","Nama Muzakki","Jenis Kelamin","Alamat","No Telepn","Jiwa","Nama Jiwa","Pilih Fitrah","Bayar Fitrah","Infaq/Shadaqah"};
    private JasperDesign jasdes;
    private JasperReport jasrep;
    private JasperPrint jaspri;

    public Zakat_Fitrah(){
        initComponents();
        ModelTabel = new DefaultTableModel(null,header);
        tabelzakat_fitrah.setModel(ModelTabel);
        TableColumn kolom = null;
	for (int x = 0; x < 4; x++) {
            kolom =tabelzakat_fitrah.getColumnModel().getColumn(x);
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
        String query = "select * from zakat_fitrah";
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
            rs.getString(8),
            rs.getString(9),
            rs.getString(10),
            rs.getString(11)};
        ModelTabel.addRow(obj);
	}
        rs.close();
	s.close();
	} catch(Exception ex){
	}
	}
    
        
    private void batal(){
        Txtno_penerimaan.setText("");
        Txttanggal.setText("");
        Txtnama_muzakki.setText("");
        Txtalamat.setText("");
         Txtno_telepon.setText("");
          Txtjiwa.setText("");
        Txtnama_jiwa.setText("");
         Txtbayar_fitrah.setText("");
          Txtinfaq_shadaqah.setText("");
            cbjenis_kelamin.setSelectedIndex(0);
              cbpilih_fitrah.setSelectedIndex(0);
        }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glassPanel1 = new GlassSwingControl.GlassPanel();
        lblForm = new javax.swing.JLabel();
        lblPendidikan = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txtalamat = new javax.swing.JTextArea();
        Txtno_penerimaan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelzakat_fitrah = new javax.swing.JTable();
        BtnBackToHome = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        lblPT = new javax.swing.JLabel();
        BtnRefresh = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblJenkel1 = new javax.swing.JLabel();
        Txttanggal = new javax.swing.JTextField();
        lblPT3 = new javax.swing.JLabel();
        lblPT4 = new javax.swing.JLabel();
        lblJenkel2 = new javax.swing.JLabel();
        lblJenkel3 = new javax.swing.JLabel();
        lblPendidikan1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Txtnama_jiwa = new javax.swing.JTextArea();
        cbjenis_kelamin = new javax.swing.JComboBox<>();
        Txtno_telepon = new javax.swing.JTextField();
        lblNama1 = new javax.swing.JLabel();
        cbpilih_fitrah = new javax.swing.JComboBox<>();
        lblNama2 = new javax.swing.JLabel();
        Txtinfaq_shadaqah = new javax.swing.JTextField();
        lblNama3 = new javax.swing.JLabel();
        Txtjiwa = new javax.swing.JTextField();
        Txtnama_muzakki = new javax.swing.JTextField();
        lblJenkel4 = new javax.swing.JLabel();
        lblNama4 = new javax.swing.JLabel();
        Txtbayar_fitrah = new javax.swing.JTextField();
        jButtonhitung = new javax.swing.JButton();
        Btncetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM ZAKAT FITRAH");

        glassPanel1.setPreferredSize(new java.awt.Dimension(520, 560));

        lblForm.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        lblForm.setText("Zakat Fitrah");

        lblPendidikan.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPendidikan.setText("Jiwa");

        lblNama.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama.setText("Bayar Fitrah");

        Txtalamat.setColumns(20);
        Txtalamat.setRows(5);
        jScrollPane1.setViewportView(Txtalamat);

        Txtno_penerimaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtno_penerimaanActionPerformed(evt);
            }
        });

        tabelzakat_fitrah.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelzakat_fitrah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelzakat_fitrahMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelzakat_fitrah);

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
        BtnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSimpanMouseClicked(evt);
            }
        });
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
        BtnHapus.setText("hapus");
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

        lblJenkel1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel1.setText("Nama Muzakki");

        lblPT3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        lblPT4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPT4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblJenkel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel2.setText("Jenis Kelamin");

        lblJenkel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel3.setText("Tanggal");

        lblPendidikan1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPendidikan1.setText("Nama Jiwa");

        Txtnama_jiwa.setColumns(20);
        Txtnama_jiwa.setRows(5);
        jScrollPane3.setViewportView(Txtnama_jiwa);

        cbjenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Jenis Kelamin-----", "Laki-Laki", "Perempuan" }));

        Txtno_telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtno_teleponActionPerformed(evt);
            }
        });

        lblNama1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama1.setText("No Penerimaan");

        cbpilih_fitrah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Pilih Fitrah-----", "Uang", "Beras" }));
        cbpilih_fitrah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpilih_fitrahActionPerformed(evt);
            }
        });

        lblNama2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama2.setText("Pilih Fitrah");

        Txtinfaq_shadaqah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtinfaq_shadaqahActionPerformed(evt);
            }
        });

        lblNama3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama3.setText("No Telepon");

        Txtjiwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtjiwaActionPerformed(evt);
            }
        });

        lblJenkel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel4.setText("Alamat");

        lblNama4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama4.setText("Infaq/Shadaqah");

        Txtbayar_fitrah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtbayar_fitrahActionPerformed(evt);
            }
        });

        jButtonhitung.setText("Hitung");
        jButtonhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonhitungActionPerformed(evt);
            }
        });

        Btncetak.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        Btncetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer_on.png"))); // NOI18N
        Btncetak.setText("Cetak");
        Btncetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtncetakMouseClicked(evt);
            }
        });
        Btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout glassPanel1Layout = new javax.swing.GroupLayout(glassPanel1);
        glassPanel1.setLayout(glassPanel1Layout);
        glassPanel1Layout.setHorizontalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblPT4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPT3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNama1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblJenkel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblNama3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(lblPT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                        .addComponent(lblJenkel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(lblLogo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblJenkel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblJenkel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txtno_penerimaan, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtno_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblForm)
                                    .addComponent(Txtnama_muzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbjenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                                .addComponent(cbpilih_fitrah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonhitung))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glassPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Txtjiwa, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glassPanel1Layout.createSequentialGroup()
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPendidikan1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNama4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Txtinfaq_shadaqah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Txtbayar_fitrah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(BtnRefresh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnBackToHome))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Btncetak)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))
                        .addGap(42, 42, 42)))
                .addContainerGap())
        );
        glassPanel1Layout.setVerticalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lblLogo)
                        .addGap(18, 18, 18)
                        .addComponent(lblPT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblForm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtno_penerimaan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtjiwa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPendidikan1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txtnama_muzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbjenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblJenkel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNama)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cbpilih_fitrah, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonhitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txtbayar_fitrah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txtinfaq_shadaqah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNama4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtno_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNama3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                        .addComponent(lblPT3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPT4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btncetak, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBackToHome))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        glassPanel1.getAccessibleContext().setAccessibleName("PT. TJM");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackToHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnBackToHomeActionPerformed

    private void tabelzakat_fitrahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelzakat_fitrahMouseClicked
        // TODO add your handling code here:
        if (tabelzakat_fitrah.getSelectedRow()>=0){
            try{
                Txtno_penerimaan.setText(tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(), 0).toString());
                Txttanggal.setText((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),1).toString());
                Txtnama_muzakki.setText(tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(), 2).toString());
                cbjenis_kelamin.setSelectedItem((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),3).toString());
                cbpilih_fitrah.setSelectedItem((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),8).toString());  
                Txtalamat.setText((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),4).toString());
                Txtnama_jiwa.setText((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),7).toString());
                Txtno_telepon.setText((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),5).toString());
                 Txtjiwa.setText((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),6).toString());
                Txtbayar_fitrah.setText((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),9).toString());
                Txtinfaq_shadaqah.setText((String)tabelzakat_fitrah.getValueAt(tabelzakat_fitrah.getSelectedRow(),10).toString());
               
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_tabelzakat_fitrahMouseClicked

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        if(Txtno_penerimaan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Data Zakat Belum Diisi ");
        } else {
            
            try{
                Connection conn = new Koneksi.Koneksi_DB().getConnection();
                String query = "insert into zakat_fitrah values(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, Txtno_penerimaan.getText());
                prepare.setString(2, Txttanggal.getText());
                prepare.setString(3, Txtnama_muzakki.getText());
                prepare.setString(4, cbjenis_kelamin.getSelectedItem().toString());
                prepare.setString(5, Txtalamat.getText());
                prepare.setString(6, Txtno_telepon.getText());
                prepare.setString(7, Txtjiwa.getText());
                prepare.setString(8, Txtnama_jiwa.getText());
                prepare.setString(9, cbpilih_fitrah.getSelectedItem().toString());
                prepare.setString(10, Txtbayar_fitrah.getText());
                prepare.setString(11, Txtinfaq_shadaqah.getText());
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
            String query = "UPDATE zakat_fitrah SET tanggal=?, nama_muzakki=?, jenis_kelamin=?, alamat=?, no_telepon=?, jiwa=?, nama_jiwa=?, pilih_fitrah=?, bayar_fitrah=?, infaq_shadaqah=? WHERE no_penerimaan=?";
            PreparedStatement prepare = conn.prepareStatement(query);
            prepare.setString(11, Txtno_penerimaan.getText());
            prepare.setString(1, Txttanggal.getText());
            prepare.setString(2, Txtnama_muzakki.getText());
            prepare.setString(3, cbjenis_kelamin.getSelectedItem().toString());
            prepare.setString(4, Txtalamat.getText());
            prepare.setString(5, Txtno_telepon.getText());
            prepare.setString(6, Txtjiwa.getText());
            prepare.setString(7, Txtnama_jiwa.getText());
            prepare.setString(8, cbpilih_fitrah.getSelectedItem().toString());
            prepare.setString(9, Txtbayar_fitrah.getText());
            prepare.setString(10, Txtinfaq_shadaqah.getText());
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
                String query = "delete from zakat_fitrah where no_penerimaan=?";
		PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, Txtno_penerimaan.getText());
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

    private void Txtno_penerimaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtno_penerimaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtno_penerimaanActionPerformed

    private void BtnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSimpanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSimpanMouseClicked

    private void Txtno_teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtno_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtno_teleponActionPerformed

    private void Txtinfaq_shadaqahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtinfaq_shadaqahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtinfaq_shadaqahActionPerformed

    private void TxtjiwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtjiwaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtjiwaActionPerformed

    private void cbpilih_fitrahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpilih_fitrahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpilih_fitrahActionPerformed

    private void Txtbayar_fitrahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtbayar_fitrahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtbayar_fitrahActionPerformed

    private void jButtonhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonhitungActionPerformed
        // TODO add your handling code here:
        int jiwa = Integer.parseInt(Txtjiwa.getText());
        double fitrah=0;
        if (cbpilih_fitrah.getSelectedItem()=="Uang"){
            fitrah = jiwa*35000;
            Txtbayar_fitrah.setText("Rp "+String.valueOf(fitrah));
        } else if (cbpilih_fitrah.getSelectedItem()=="Beras"){
            fitrah = jiwa*2.5;
            Txtbayar_fitrah.setText(String.valueOf(fitrah)+" Kg");
        }
    }//GEN-LAST:event_jButtonhitungActionPerformed

    private void BtncetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtncetakMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtncetakMouseClicked

    private void BtncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncetakActionPerformed
        // TODO add your handling code here:
           Map hash= new HashMap();
        try {
            File file=new File("src/laporan/fitrah.jrxml");
                    jasdes = net.sf.jasperreports.engine.xml.JRXmlLoader.load(file);
                    jasrep=net.sf.jasperreports.engine.JasperCompileManager.compileReport(jasdes);
                    jaspri=net.sf.jasperreports.engine.JasperFillManager.fillReport(jasrep,hash,conn);
                    JasperViewer.viewReport(jaspri,false);
                   
        }catch (Exception e) {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_BtncetakActionPerformed

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
            java.util.logging.Logger.getLogger(Zakat_Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zakat_Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zakat_Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zakat_Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Zakat_Fitrah().setVisible(true);
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
    private javax.swing.JButton Btncetak;
    private javax.swing.JTextArea Txtalamat;
    private javax.swing.JTextField Txtbayar_fitrah;
    private javax.swing.JTextField Txtinfaq_shadaqah;
    private javax.swing.JTextField Txtjiwa;
    private javax.swing.JTextArea Txtnama_jiwa;
    private javax.swing.JTextField Txtnama_muzakki;
    private javax.swing.JTextField Txtno_penerimaan;
    private javax.swing.JTextField Txtno_telepon;
    private javax.swing.JTextField Txttanggal;
    private javax.swing.JComboBox<String> cbjenis_kelamin;
    private javax.swing.JComboBox<String> cbpilih_fitrah;
    private GlassSwingControl.GlassPanel glassPanel1;
    private javax.swing.JButton jButtonhitung;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblJenkel1;
    private javax.swing.JLabel lblJenkel2;
    private javax.swing.JLabel lblJenkel3;
    private javax.swing.JLabel lblJenkel4;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JLabel lblNama2;
    private javax.swing.JLabel lblNama3;
    private javax.swing.JLabel lblNama4;
    private javax.swing.JLabel lblPT;
    private javax.swing.JLabel lblPT3;
    private javax.swing.JLabel lblPT4;
    private javax.swing.JLabel lblPendidikan;
    private javax.swing.JLabel lblPendidikan1;
    private javax.swing.JTable tabelzakat_fitrah;
    // End of variables declaration//GEN-END:variables
}
