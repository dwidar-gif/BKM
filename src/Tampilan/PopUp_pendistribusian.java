package Tampilan;

import java.io.File;
import java.sql.*;
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

public class PopUp_pendistribusian extends javax.swing.JFrame {
    
    
    Connection conn = new Koneksi.Koneksi_DB().getConnection();
    ResultSet r;
    Statement s;
     
    public Pendistribusian pendistribusian=null;
    private Object [][] data=null;
    private String  Header[] = {"Id Mustahiq","Nama Mustahiq","Jenis Kelamin","Golongan","Alamat"};
    public PopUp_pendistribusian() {
        initComponents();
        setDataTabel();
    
        }
    
    private void setDataTabel(){
        String cariitem = Txtcari.getText();
        try {
        s=conn.createStatement();
        String sql="select * from data_mustahiq where id_mustahiq like '%"+cariitem+"%' or nama_mustahiq like'%"+cariitem+"%' order by id_mustahiq asc";
        r=s. executeQuery(sql);
	ResultSetMetaData m= r.getMetaData();
        int kolom=m.getColumnCount();
        int baris=0;
	while(r.next()){
            baris=r.getRow();
        }
        data=new Object[baris][kolom];
        int x=0;
        r.beforeFirst();
        while (r.next())
        {
            data [x][0]=r.getString("id_mustahiq");
            data [x][1]=r.getString("nama_mustahiq");
            data [x][2]=r.getString("jenis_kelamin");
            data [x][3]=r.getString("golongan");
            data [x][4]=r.getString("alamat");
            x++;
        }
        popup_data_mustahiq.setModel(new DefaultTableModel (data,Header));
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
        popup_data_mustahiq = new javax.swing.JTable();
        BtnBackHome = new javax.swing.JButton();
        lblPT2 = new javax.swing.JLabel();
        lblPT3 = new javax.swing.JLabel();
        Txtcari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CETAK LAPORAN DATA PEGAWAI");

        lblForm.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        lblForm.setText("Cek Data Mustahiq");

        popup_data_mustahiq.setModel(new javax.swing.table.DefaultTableModel(
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
        popup_data_mustahiq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popup_data_mustahiqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(popup_data_mustahiq);

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

        lblPT3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPT3.setText("Id Mustahiq");

        Txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcariActionPerformed(evt);
            }
        });
        Txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtcariKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout glassPanel1Layout = new javax.swing.GroupLayout(glassPanel1);
        glassPanel1.setLayout(glassPanel1Layout);
        glassPanel1Layout.setHorizontalGroup(
            glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnBackHome)
                .addGap(39, 39, 39))
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1580, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(glassPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPT2)
                    .addGroup(glassPanel1Layout.createSequentialGroup()
                        .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPT3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblForm, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(glassPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPT3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(BtnBackHome)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(glassPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void TxtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcariActionPerformed

    private void popup_data_mustahiqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popup_data_mustahiqMouseClicked
        // TODO add your handling code here:
        int popup=popup_data_mustahiq.getSelectedRow();
        pendistribusian.id_mustahiq = popup_data_mustahiq.getValueAt(popup, 0).toString();
         pendistribusian.nama_mustahiq = popup_data_mustahiq.getValueAt(popup, 1).toString();
         pendistribusian.jenis_kelamin = popup_data_mustahiq.getValueAt(popup, 2).toString();
          pendistribusian.golongan = popup_data_mustahiq.getValueAt(popup, 3).toString();
           pendistribusian.alamat = popup_data_mustahiq.getValueAt(popup, 4).toString();
           pendistribusian.itemTerpilih();
           this.dispose();
    }//GEN-LAST:event_popup_data_mustahiqMouseClicked

    private void TxtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtcariKeyReleased
        // TODO add your handling code here:
        setDataTabel();
    }//GEN-LAST:event_TxtcariKeyReleased

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
            java.util.logging.Logger.getLogger(PopUp_pendistribusian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUp_pendistribusian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUp_pendistribusian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUp_pendistribusian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PopUp_pendistribusian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBackHome;
    private javax.swing.JTextField Txtcari;
    private GlassSwingControl.GlassPanel glassPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblPT2;
    private javax.swing.JLabel lblPT3;
    private javax.swing.JTable popup_data_mustahiq;
    // End of variables declaration//GEN-END:variables
}
