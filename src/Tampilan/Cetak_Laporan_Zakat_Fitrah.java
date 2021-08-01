package Tampilan;

import java.io.File;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Cetak_Laporan_Zakat_Fitrah extends javax.swing.JFrame {
    JasperReport jasperReport; 
    JasperDesign jasperDesign;
    JasperPrint jasperPrint;
    Map <String,Object> param = new HashMap<String,Object>();
    
    Connection conn = new Koneksi.Koneksi_DB().getConnection();
    ResultSet r;
    Statement s;
    
    private Object [][] data=null;
    private String  [] Header = {"No Penerimaan","Tanggal","Nama Muzakki","Jenis Kelamin","Alamat","No Telepon","Jiwa","Fitrah","Bayar Fitrah","Infaq/Shadaqah"};

    public Cetak_Laporan_Zakat_Fitrah() {
        initComponents();
        setDataTabel();
    }
    
    private void setDataTabel(){
        try {
            s=conn.createStatement();
            String sql="select * from zakat_fitrah";
            r=s.executeQuery(sql);
            ResultSetMetaData m= r.getMetaData();
            int kolom=m.getColumnCount();
            int baris=0;
            while(r.next()){
                baris=r.getRow();
            }
            data=new Object[baris][kolom];
            int x=0;
            r.beforeFirst();
            while(r.next()){
                data[x][0]=r.getString("no_penerimaan");
                data[x][1]=r.getString("tanggal");
                data[x][2]=r.getString("nama_muzakki");
                data[x][3]=r.getString("jenis_kelamin");
                data[x][4]=r.getString("alamat");
                data[x][5]=r.getString("no_telepon");
                data[x][6]=r.getString("jiwa");
                data[x][7]=r.getString("pilih_fitrah");
                data[x][8]=r.getString("bayar_fitrah");
                data[x][9]=r.getString("infaq_shadaqah");
                
                x++;
            }
            tabelzakat_fitrah.setModel(new DefaultTableModel(data,Header));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glassPanel1 = new GlassSwingControl.GlassPanel();
        lblForm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelzakat_fitrah = new javax.swing.JTable();
        BtnBackHome = new javax.swing.JButton();
        lblPT2 = new javax.swing.JLabel();
        BtnPrint = new javax.swing.JButton();
        cbpilih_fitrah = new javax.swing.JComboBox<>();
        lblForm4 = new javax.swing.JLabel();
        lblForm3 = new javax.swing.JLabel();
        lblForm2 = new javax.swing.JLabel();
        lblForm1 = new javax.swing.JLabel();
        lblForm5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CETAK LAPORAN ZAKAT FITRAH");

        lblForm.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        lblForm.setText("Cetak Laporan Penerimaan Zakat Fitrah");

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
        jScrollPane1.setViewportView(tabelzakat_fitrah);

        BtnBackHome.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnBackHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home-icon.png"))); // NOI18N
        BtnBackHome.setText("Kembali");
        BtnBackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackHomeActionPerformed(evt);
            }
        });

        lblPT2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPT2.setText("Masjid Jami' Al-Hidayah");

        BtnPrint.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        BtnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer_on.png"))); // NOI18N
        BtnPrint.setText("Cetak");
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });

        cbpilih_fitrah.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        cbpilih_fitrah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Bayar Fitrah-----", "Uang", "Beras" }));
        cbpilih_fitrah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpilih_fitrahActionPerformed(evt);
            }
        });

        lblForm4.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        lblForm4.setForeground(new java.awt.Color(255, 255, 255));
        lblForm4.setText("3. Tekan Tombol Cetak");

        lblForm3.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        lblForm3.setForeground(new java.awt.Color(255, 255, 255));
        lblForm3.setText("2. Pilih Bayar Fitrah pada Combo Box Pilihan");

        lblForm2.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        lblForm2.setForeground(new java.awt.Color(255, 255, 255));
        lblForm2.setText("1. Untuk mencetak Laporan Zakat Fitrah Silahkan Tekan Bayar Fitrah");

        lblForm1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblForm1.setForeground(new java.awt.Color(255, 255, 255));
        lblForm1.setText("Petunjuk Penggunaan :");

        lblForm5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblForm5.setForeground(new java.awt.Color(255, 255, 255));
        lblForm5.setText("Pilih Bayar Fitrah:");

        javax.swing.GroupLayout glassPanel1Layout = new javax.swing.GroupLayout(glassPanel1);
        glassPanel1.setLayout(glassPanel1Layout);
        glassPanel1Layout.setHorizontalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblForm)
                            .addComponent(lblPT2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glassPanel1Layout.createSequentialGroup()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(cbpilih_fitrah, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPrint))
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblForm5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
                .addComponent(BtnBackHome)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glassPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblForm3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblForm4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblForm2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblForm1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        glassPanel1Layout.setVerticalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPT2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblForm1)
                .addGap(14, 14, 14)
                .addComponent(lblForm2)
                .addGap(15, 15, 15)
                .addComponent(lblForm3)
                .addGap(11, 11, 11)
                .addComponent(lblForm4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBackHome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glassPanel1Layout.createSequentialGroup()
                        .addComponent(lblForm5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbpilih_fitrah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glassPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnBackHomeActionPerformed

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("src/Laporan/laporan_fitrah.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            //param.put("St_Kerja",CbStKerja.getSelectedItem());
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport,param,conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak!"+ "\n" + e.getMessage(), "Cetak Data", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnPrintActionPerformed

    private void cbpilih_fitrahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpilih_fitrahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpilih_fitrahActionPerformed

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
            java.util.logging.Logger.getLogger(Cetak_Laporan_Zakat_Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cetak_Laporan_Zakat_Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cetak_Laporan_Zakat_Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cetak_Laporan_Zakat_Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Cetak_Laporan_Zakat_Fitrah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBackHome;
    private javax.swing.JButton BtnPrint;
    private javax.swing.JComboBox<String> cbpilih_fitrah;
    private GlassSwingControl.GlassPanel glassPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblForm1;
    private javax.swing.JLabel lblForm2;
    private javax.swing.JLabel lblForm3;
    private javax.swing.JLabel lblForm4;
    private javax.swing.JLabel lblForm5;
    private javax.swing.JLabel lblPT2;
    private javax.swing.JTable tabelzakat_fitrah;
    // End of variables declaration//GEN-END:variables
}
