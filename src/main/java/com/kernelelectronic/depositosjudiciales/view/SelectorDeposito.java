package com.kernelelectronic.depositosjudiciales.view;

import com.kernelelectronic.depositosjudiciales.controller.DepositoController;
import com.kernelelectronic.depositosjudiciales.utils.statics.ReporteStatics;
import com.kernelelectronic.depositosjudiciales.model.Deposito;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SelectorDeposito extends javax.swing.JFrame {

    private DepositoController depositoController = DepositoController.getInstance();
    private List<Deposito> depositos;
    public SelectorDeposito() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jt_deposito.getModel();
        depositos = depositoController.getDepositos();
        for (Deposito deposito : depositos) {
            String[] object = {deposito.getNroCheque()};
            modelo.addRow(object);
        }
        jt_deposito.setModel(modelo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpm_seleccionar = new javax.swing.JPopupMenu();
        jmi_eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jb_cerrar = new javax.swing.JButton();
        jb_imprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_deposito = new javax.swing.JTable();

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        jpm_seleccionar.add(jmi_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jb_cerrar.setText("Cerrar");
        jb_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cerrarActionPerformed(evt);
            }
        });

        jb_imprimir.setText("imprimir");
        jb_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(jb_imprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_cerrar)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_imprimir)
                    .addComponent(jb_cerrar))
                .addContainerGap())
        );

        jt_deposito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de cheque"
            }
        ));
        jt_deposito.setToolTipText("");
        jt_deposito.setComponentPopupMenu(jpm_seleccionar);
        jScrollPane1.setViewportView(jt_deposito);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jb_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jb_cerrarActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jt_deposito.getModel(); 
        
        for(int index : jt_deposito.getSelectedRows()){
            modelo.removeRow(index);
            depositos.remove(index);
        }
        jt_deposito.setModel(modelo);
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jb_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_imprimirActionPerformed
        ReporteStatics.printSelected(depositos);
    }//GEN-LAST:event_jb_imprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_cerrar;
    private javax.swing.JButton jb_imprimir;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JPopupMenu jpm_seleccionar;
    private javax.swing.JTable jt_deposito;
    // End of variables declaration//GEN-END:variables
}
