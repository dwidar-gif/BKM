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

public class Zakat_mal extends javax.swing.JFrame {
    JasperReport jasperReport; 
    JasperDesign jasperDesign;
    JasperPrint jasperPrint;
    Map <String,Object> param = new HashMap<String,Object>();
    
    
    Connection conn = new Koneksi.Koneksi_DB().getConnection();
    ResultSet r;
    Statement s;
    
    private DefaultTableModel ModelTabel;
    private String  header[] = {"No Penerimaan","Tanggal","Nama Muzakki","Jenis Kelamin","Alamat","No Telepon","Nisab","Hitung Nisab","Hitung Harta","Bayar Harta","Infaq/Shadaqah"};

    public Zakat_mal(){
        initComponents();
        ModelTabel = new DefaultTableModel(null,header);
        tabelzakat_mal.setModel(ModelTabel);
        TableColumn kolom = null;
	for (int x = 0; x < 4; x++) {
            kolom =tabelzakat_mal.getColumnModel().getColumn(x);
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
        String query = "select * from zakat_mal";
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
        cbjenis_kelamin.setSelectedIndex(0);
        Txtalamat.setText("");
        Txtno_telepon.setText("");
         Txtnisab.setText("");
        Txthitung_nisab.setText("");
         Txthitung_harta.setText("");
        Txtbayar_mal.setText("");
         Txtinfaq_shadaqah.setText("");
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
        tabelzakat_mal = new javax.swing.JTable();
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
        cbjenis_kelamin = new javax.swing.JComboBox<>();
        Txtnisab = new javax.swing.JTextField();
        lblNama1 = new javax.swing.JLabel();
        Txthitung_harta = new javax.swing.JTextField();
        Txtinfaq_shadaqah = new javax.swing.JTextField();
        lblNama3 = new javax.swing.JLabel();
        lblNama4 = new javax.swing.JLabel();
        lblNama2 = new javax.swing.JLabel();
        Txtbayar_mal = new javax.swing.JTextField();
        lblJenkel4 = new javax.swing.JLabel();
        Txtno_telepon = new javax.swing.JTextField();
        lblJenkel5 = new javax.swing.JLabel();
        Txtnama_muzakki = new javax.swing.JTextField();
        Txthitung_nisab = new javax.swing.JTextField();
        lblPendidikan2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Btncetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM ZAKAT MAL");

        glassPanel1.setPreferredSize(new java.awt.Dimension(520, 560));

        lblForm.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        lblForm.setText("Zakat Mal");

        lblPendidikan.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPendidikan.setText("Hitung Harta");

        lblNama.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama.setText("Infaq/Shadaqah");

        Txtalamat.setColumns(20);
        Txtalamat.setRows(5);
        jScrollPane1.setViewportView(Txtalamat);

        Txtno_penerimaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtno_penerimaanActionPerformed(evt);
            }
        });

        tabelzakat_mal.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelzakat_mal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelzakat_malMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelzakat_mal);

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
        lblJenkel1.setText("Tanggal");

        lblPT3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        lblPT4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPT4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblJenkel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel2.setText("Jenis Kelamin");

        lblJenkel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel3.setText("Alamat");

        lblPendidikan1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPendidikan1.setText("Nisab");

        cbjenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Jenis Kelamin-----", "Laki-laki", "Perempuan" }));

        Txtnisab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtnisabActionPerformed(evt);
            }
        });

        lblNama1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama1.setText("No Penerimaan");

        Txthitung_harta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txthitung_hartaActionPerformed(evt);
            }
        });

        Txtinfaq_shadaqah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtinfaq_shadaqahActionPerformed(evt);
            }
        });

        lblNama3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama3.setText("x 85");

        lblNama4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama4.setText("x 2,5%");

        lblNama2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblNama2.setText("Bayar Mal");

        Txtbayar_mal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtbayar_malActionPerformed(evt);
            }
        });

        lblJenkel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel4.setText("Nama Muzakki");

        lblJenkel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblJenkel5.setText("No Telepon");

        lblPendidikan2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPendidikan2.setText("Hitung Nisab");

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hitung");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Btncetak.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        Btncetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer_on.png"))); // NOI18N
        Btncetak.setText("cetak");
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
                .addContainerGap()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblPT4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPT3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(343, 343, 343))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glassPanel1Layout.createSequentialGroup()
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glassPanel1Layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(lblPT))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glassPanel1Layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(lblLogo)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblJenkel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJenkel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                .addComponent(lblJenkel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BtnRefresh)))
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnBackToHome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Txtno_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Btncetak, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40))
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                        .addComponent(lblForm)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Txtno_penerimaan, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Txtnama_muzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbjenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPendidikan2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPendidikan1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Txthitung_harta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Txtnisab, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Txtbayar_mal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Txthitung_nisab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblNama3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(glassPanel1Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblNama4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton1)
                                                            .addComponent(jButton2)))))
                                            .addComponent(Txtinfaq_shadaqah, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)))
                                .addContainerGap())))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(40, 40, 40))))
        );
        glassPanel1Layout.setVerticalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPT))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblForm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txtno_penerimaan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPendidikan1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txtnisab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNama3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txthitung_nisab, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPendidikan2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJenkel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txttanggal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txtnama_muzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblJenkel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txthitung_harta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNama4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJenkel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbjenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txtbayar_mal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJenkel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(glassPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtinfaq_shadaqah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txtno_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJenkel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBackToHome)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1353, Short.MAX_VALUE)
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

    private void tabelzakat_malMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelzakat_malMouseClicked
        // TODO add your handling code here:
        if (tabelzakat_mal.getSelectedRow()>=0){
            try{
                Txtno_penerimaan.setText(tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(), 0).toString());
                 Txttanggal.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),1).toString());
                Txtnama_muzakki.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),2).toString());
                cbjenis_kelamin.setSelectedItem((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),3).toString());
                Txtalamat.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),4).toString());
                Txtno_telepon.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),5).toString());
                Txtnisab.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),6).toString());
                 Txthitung_nisab.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),7).toString());
                 Txthitung_harta.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),8).toString());
                  Txtbayar_mal.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),9).toString());
                   Txtinfaq_shadaqah.setText((String)tabelzakat_mal.getValueAt(tabelzakat_mal.getSelectedRow(),10).toString());
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_tabelzakat_malMouseClicked

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        if(Txtno_penerimaan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Data Zakal Belum Diisi ");
        } else {
            
            try{
                Connection conn = new Koneksi.Koneksi_DB().getConnection();
                String query = "insert into zakat_mal values(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement prepare = conn.prepareStatement(query);
                prepare.setString(1, Txtno_penerimaan.getText());
                prepare.setString(2, Txttanggal.getText());
                prepare.setString(3, Txtnama_muzakki.getText());
                prepare.setString(4, cbjenis_kelamin.getSelectedItem().toString());
                prepare.setString(5, Txtalamat.getText());
                prepare.setString(6, Txtno_telepon.getText());
                prepare.setString(7, Txtnisab.getText());
                prepare.setString(8, Txthitung_nisab.getText());
                prepare.setString(9, Txthitung_harta.getText());
                prepare.setString(10, Txtbayar_mal.getText());
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
            String query = "UPDATE zakat_mal SET tanggal=?, nama_muzakki=?, jenis_kelamin=?, alamat=?, no_telepon=?, nisab=?, hitung_nisab=?, hitung_harta=?, bayar_mal=?, infaq_shadaqah=? WHERE no_penerimaan=?";
            PreparedStatement prepare = conn.prepareStatement(query);
            prepare.setString(11, Txtno_penerimaan.getText());
            prepare.setString(1, Txttanggal.getText());
            prepare.setString(2, Txtnama_muzakki.getText());
            prepare.setString(3, cbjenis_kelamin.getSelectedItem().toString());
            prepare.setString(4, Txtalamat.getText());
            prepare.setString(5, Txtno_telepon.getText());
            prepare.setString(6, Txtnisab.getText());
            prepare.setString(7, Txthitung_nisab.getText());
            prepare.setString(8, Txthitung_harta.getText());
            prepare.setString(9, Txtbayar_mal.getText());
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
                String query = "delete from zakat_mal where no_penerimaan=?";
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

    private void TxtnisabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtnisabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtnisabActionPerformed

    private void Txthitung_hartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txthitung_hartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txthitung_hartaActionPerformed

    private void Txtinfaq_shadaqahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtinfaq_shadaqahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtinfaq_shadaqahActionPerformed

    private void Txtbayar_malActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtbayar_malActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txtbayar_malActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int nisab = Integer.parseInt(Txtnisab.getText());
        int hnisab= nisab*85;
        Txthitung_nisab.setText(String.valueOf(hnisab));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int hitung_harta = Integer.parseInt(Txthitung_harta.getText());
        double mal= hitung_harta*0.25;
        Txtbayar_mal.setText(String.valueOf(mal));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtncetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtncetakMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtncetakMouseClicked

    private void BtncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncetakActionPerformed
        // TODO add your handling code here:
         try {
            File file = new File("src/Laporan/mal.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport,param,conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak!"+ "\n" + e.getMessage(), "Cetak Data", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Zakat_mal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zakat_mal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zakat_mal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zakat_mal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Zakat_mal().setVisible(true);
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
    private javax.swing.JTextField Txtbayar_mal;
    private javax.swing.JTextField Txthitung_harta;
    private javax.swing.JTextField Txthitung_nisab;
    private javax.swing.JTextField Txtinfaq_shadaqah;
    private javax.swing.JTextField Txtnama_muzakki;
    private javax.swing.JTextField Txtnisab;
    private javax.swing.JTextField Txtno_penerimaan;
    private javax.swing.JTextField Txtno_telepon;
    private javax.swing.JTextField Txttanggal;
    private javax.swing.JComboBox<String> cbjenis_kelamin;
    private GlassSwingControl.GlassPanel glassPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblJenkel1;
    private javax.swing.JLabel lblJenkel2;
    private javax.swing.JLabel lblJenkel3;
    private javax.swing.JLabel lblJenkel4;
    private javax.swing.JLabel lblJenkel5;
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
    private javax.swing.JLabel lblPendidikan2;
    private javax.swing.JTable tabelzakat_mal;
    // End of variables declaration//GEN-END:variables
}
