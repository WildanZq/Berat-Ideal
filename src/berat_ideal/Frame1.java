/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berat_ideal;

import javax.swing.JOptionPane;

/**
 *
 * @author Wahaz
 */
public class Frame1 extends javax.swing.JFrame {
    String temp = "";
    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        beratbdn = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();
        diagnosa1 = new javax.swing.JTextField();
        diagnosa2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        keluar = new javax.swing.JButton();
        hitung = new javax.swing.JButton();
        cblg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 40, 180, 30);

        jLabel2.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 320, 200, 30);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 90, 50, 20);

        jLabel4.setText("Tinggi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 130, 50, 20);

        jLabel5.setText("Berat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 170, 70, 20);

        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 210, 100, 20);

        jLabel7.setText("cm");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 130, 40, 20);

        jLabel8.setText("kg");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 170, 30, 20);

        jLabel9.setText("Berat Badan Ideal Anda Adalah");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 280, 180, 30);

        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 280, 40, 30);
        getContentPane().add(nama);
        nama.setBounds(150, 90, 260, 30);
        getContentPane().add(tinggi);
        tinggi.setBounds(150, 130, 210, 30);
        getContentPane().add(beratbdn);
        beratbdn.setBounds(150, 170, 210, 30);

        hasil.setEditable(false);
        getContentPane().add(hasil);
        hasil.setBounds(240, 280, 120, 30);

        diagnosa1.setEditable(false);
        getContentPane().add(diagnosa1);
        diagnosa1.setBounds(60, 350, 350, 30);

        diagnosa2.setEditable(false);
        getContentPane().add(diagnosa2);
        diagnosa2.setBounds(60, 390, 350, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Laki - Laki");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(150, 210, 90, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("perempuan");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(240, 210, 130, 30);

        keluar.setText("keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(320, 250, 90, 23);

        hitung.setText("hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung);
        hitung.setBounds(60, 250, 140, 23);

        cblg.setText("coba lagi");
        cblg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblgActionPerformed(evt);
            }
        });
        getContentPane().add(cblg);
        cblg.setBounds(210, 250, 100, 23);

        setBounds(0, 0, 486, 492);
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        if(nama.getText().equals("")||tinggi.getText().equals("")|beratbdn.getText().equals("")){
            JOptionPane.showMessageDialog(null,"data harus diisikan semua");
        } else if(jRadioButton1.isSelected()||jRadioButton2.isSelected()){
            try{
                Proses(); 
            }catch(Exception E){
                JOptionPane.showMessageDialog(null,"Inputan ada yg belum diisi");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Radion Button Harus Diisi");
        }
    }//GEN-LAST:event_hitungActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void cblgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblgActionPerformed
        nama.setText("");
        tinggi.setText("");
        beratbdn.setText("");
        buttonGroup1.clearSelection();
        hasil.setText("");
        diagnosa1.setText("");
        diagnosa2.setText("");
        
    }//GEN-LAST:event_cblgActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beratbdn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cblg;
    private javax.swing.JTextField diagnosa1;
    private javax.swing.JTextField diagnosa2;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        Double ti = Double.valueOf(tinggi.getText());
        Double bt = Double.valueOf(beratbdn.getText());
        Double hl = null;
        
        if(jRadioButton1.isSelected()){
            hl = (ti-100)*1;
        } else if (jRadioButton2.isSelected()){
            hl = (ti-104)*1;
        }
        temp = Double.toString(hl.intValue());
        
        if(hl<bt){
            hasil.setText(temp);
            diagnosa1.setText("Maaf " + nama.getText()+", Sepertinya anda Overweight :( ");
            diagnosa2.setText("Banyaklah berolahraga dan hindari makanan berkolesterol") ;
            
        } else if (hl > bt) {
             hasil.setText(temp);
            diagnosa1.setText("Maaf " + nama.getText()+", Sepertinya anda UnderWeight :( ");
            diagnosa2.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
           
        } else {
             hasil.setText(temp);
            diagnosa1.setText("Hallo " + nama.getText()+", Berat badan anda sudah ideal :) ");
            diagnosa2.setText("Lanjutkan pola makan teratur dan gaya hidup sehat");
        }
    }
}
