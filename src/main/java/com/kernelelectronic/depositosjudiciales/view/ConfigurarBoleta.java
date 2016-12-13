/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kernelelectronic.depositosjudiciales.view;

import com.kernelelectronic.depositosjudiciales.utils.statics.ReporteStatics;
import com.kernelelectronic.depositosjudiciales.model.Deposito;
import com.kernelelectronic.depositosjudiciales.utils.statics.ApplicationConstantsStatic;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

public class ConfigurarBoleta extends javax.swing.JFrame {

    public ConfigurarBoleta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jt_vertical = new javax.swing.JTextField();
        jt_horizontal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jb_paginaPrueba = new javax.swing.JButton();
        jb_restaurar = new javax.swing.JButton();
        jb_guardarConfiguracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Vertical");

        jt_vertical.setText("0");
        jt_vertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_verticalActionPerformed(evt);
            }
        });

        jt_horizontal.setText("0");

        jLabel2.setText("Horizontal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_vertical, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jt_horizontal))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_vertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_horizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jb_paginaPrueba.setText("Pagina de prueba");
        jb_paginaPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_paginaPruebaActionPerformed(evt);
            }
        });

        jb_restaurar.setText("Restaurar valor original");
        jb_restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_restaurarActionPerformed(evt);
            }
        });

        jb_guardarConfiguracion.setText("Guardar configuracion");
        jb_guardarConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_restaurar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_guardarConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_paginaPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb_guardarConfiguracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_paginaPrueba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_restaurar)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_paginaPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_paginaPruebaActionPerformed
        Deposito deposito = new Deposito();
        deposito.setAnio("XXXX");
        deposito.setBanco("XXXXXX");
        deposito.setImporte("XXXXX.XX");
        deposito.setJuicio("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        deposito.setNominacion("XXX");
        deposito.setNroCheque("XXXXXXXXXX");
        deposito.setNroCuenta("XXXXXXXXX");
        deposito.setOrdenJuzgado("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        deposito.setPesos("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        ReporteStatics.print(deposito);
    }//GEN-LAST:event_jb_paginaPruebaActionPerformed

    private void jb_guardarConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarConfiguracionActionPerformed
        try {
            int x = Integer.parseInt(jt_horizontal.getText());
            int y = Integer.parseInt(jt_vertical.getText());
            ReporteStatics.moverReporte(x, y);
        } catch (JRException ex) {
            Logger.getLogger(ConfigurarBoleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_guardarConfiguracionActionPerformed

    private void jt_verticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_verticalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_verticalActionPerformed

    private void jb_restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_restaurarActionPerformed
         File fileBackup = new File("ale.sas");//ApplicationConstantsStatic.FILE_BACKUP_JASPER_REPORT_JRXML);
         File fileOld = new File("ale.txt");//ApplicationConstantsStatic.FILE_JASPER_REPORT_JRXML);
         fileOld.delete();
         fileBackup.renameTo(fileOld);
    }//GEN-LAST:event_jb_restaurarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_guardarConfiguracion;
    private javax.swing.JButton jb_paginaPrueba;
    private javax.swing.JButton jb_restaurar;
    private javax.swing.JTextField jt_horizontal;
    private javax.swing.JTextField jt_vertical;
    // End of variables declaration//GEN-END:variables
}
