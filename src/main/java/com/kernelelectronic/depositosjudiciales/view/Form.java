package com.kernelelectronic.depositosjudiciales.view;

import com.ibm.icu.util.Calendar;
import com.kernelelectronic.depositosjudiciales.model.Deposito;
import com.kernelelectronic.depositosjudiciales.controller.DepositoController;
import com.kernelelectronic.depositosjudiciales.utils.NumeroLetra;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;

public class Form extends javax.swing.JFrame {

    private final DepositoController depositoController;
    private Iterator<Deposito> iteratorDepositos;
    private Deposito previus;

    public Form() {
        initComponents();
        depositoController = DepositoController.getInstance();
        iteratorDepositos = depositoController.getDepositos().iterator();
        rellenarNroCuenta();
        t_anyo.setText(String.valueOf(GregorianCalendar.getInstance().get(Calendar.YEAR)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t_expediente = new javax.swing.JTextField();
        t_anyo = new javax.swing.JTextField();
        t_importe = new javax.swing.JTextField();
        t_pesos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        B_buscarCuenta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t_cuenta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        t_juzgado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_nominacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_juicio = new javax.swing.JTextField();
        b_buscarJuicio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        t_cheque = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mi_nuevo = new javax.swing.JMenuItem();
        mi_guardar = new javax.swing.JMenuItem();
        mi_modificar = new javax.swing.JMenuItem();
        mi_eliminar = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Depositos Judiciales");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        t_expediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_expedienteActionPerformed(evt);
            }
        });

        t_anyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_anyoActionPerformed(evt);
            }
        });

        t_importe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_importeFocusLost(evt);
            }
        });
        t_importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_importeActionPerformed(evt);
            }
        });

        t_pesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pesosActionPerformed(evt);
            }
        });

        jLabel5.setText("Cuenta N°");

        B_buscarCuenta.setText("Buscar");
        B_buscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_buscarCuentaActionPerformed(evt);
            }
        });

        jLabel6.setText("Expediente N°");

        jLabel7.setText("Año");

        jLabel8.setText("Importe");

        jLabel9.setText("Son pesos");

        t_cuenta.setEditable(true);
        t_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cuentaActionPerformed(evt);
            }
        });

        jLabel1.setText("A la orden del juzgado:");

        t_juzgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_juzgadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nominacion:");

        t_nominacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nominacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Y perteneciente al Juicio:");

        t_juicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_juicioActionPerformed(evt);
            }
        });

        b_buscarJuicio.setText("Buscar");
        b_buscarJuicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarJuicioActionPerformed(evt);
            }
        });

        jLabel4.setText("Nro de Cheque");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_juzgado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_pesos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t_importe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t_anyo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t_expediente))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B_buscarCuenta)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_juicio, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_buscarJuicio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_nominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(B_buscarCuenta)
                    .addComponent(t_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t_expediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t_anyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(t_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(t_pesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_juzgado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_nominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_juicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_buscarJuicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("Menu");

        mi_nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mi_nuevo.setMnemonic('o');
        mi_nuevo.setText("Nuevo");
        mi_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_nuevoActionPerformed(evt);
            }
        });
        fileMenu.add(mi_nuevo);

        mi_guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mi_guardar.setMnemonic('s');
        mi_guardar.setText("Guardar");
        mi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_guardarActionPerformed(evt);
            }
        });
        fileMenu.add(mi_guardar);

        mi_modificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mi_modificar.setMnemonic('a');
        mi_modificar.setText("Modificar");
        mi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarActionPerformed(evt);
            }
        });
        fileMenu.add(mi_modificar);

        mi_eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        mi_eliminar.setMnemonic('d');
        mi_eliminar.setText("Eliminar");
        mi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarActionPerformed(evt);
            }
        });
        fileMenu.add(mi_eliminar);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText("Informes");

        jMenuItem1.setText("Generar PDF");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBar.add(jMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Acerca de");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mi_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_nuevoActionPerformed
        limpiar();
        t_cuenta.requestFocus();

    }//GEN-LAST:event_mi_nuevoActionPerformed

    private void mi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar este registro?");
        if (JOptionPane.OK_OPTION == resp) {
            Deposito deposito = new Deposito();
            deposito = viewToModel(deposito);
            if (depositoController.eliminarDeposito(deposito)) {
                JOptionPane.showMessageDialog(null, "Los datos fueron Eliminados con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Algo salio mal",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_mi_eliminarActionPerformed

    private void t_expedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_expedienteActionPerformed
        t_expediente.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t_expedienteActionPerformed

    private void t_anyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_anyoActionPerformed
        t_anyo.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t_anyoActionPerformed

    private void t_importeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_importeActionPerformed
        t_importe.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t_importeActionPerformed

    private void t_pesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pesosActionPerformed
        t_pesos.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t_pesosActionPerformed

    private void t_juzgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_juzgadoActionPerformed
        t_juzgado.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t_juzgadoActionPerformed

    private void t_nominacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nominacionActionPerformed
        t_nominacion.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t_nominacionActionPerformed

    private void t_juicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_juicioActionPerformed
        t_juicio.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t_juicioActionPerformed

    private void mi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_guardarActionPerformed
        Deposito deposito = new Deposito();
        if (depositoController.agregarDeposito(viewToModel(deposito))) {
            JOptionPane.showMessageDialog(null, "Los datos fueron Guardados con exito");
            t_cuenta.addItem(deposito.getNroCuenta());

        } else {
            JOptionPane.showMessageDialog(null, "Algo salio mal. Por Favor verifique "
                    + "los datos ingresados \n recuerde que no puede haber campos vacions",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mi_guardarActionPerformed

    private void B_buscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_buscarCuentaActionPerformed
        String nroCuenta = t_cuenta.getEditor().getItem().toString();
        Deposito deposito = depositoController.buscarNroCuenta(nroCuenta);
        if (deposito != null) {
            modelToView(deposito);
        } else {
            JOptionPane.showMessageDialog(null, "Registro no encontrado",
                    "Atencion", JOptionPane.WARNING_MESSAGE);
            limpiar();
        }
    }//GEN-LAST:event_B_buscarCuentaActionPerformed

    private void b_buscarJuicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarJuicioActionPerformed
//        String sql;
//        String juicio;
//        if (!"".equals(t_juicio.getText())) {
//            juicio = t_juicio.getText();
//            sql = "SELECT * FROM depositojudicial WHERE Juicio='" + juicio + "'";
//
//            try {
//                Statement st = cn.createStatement();
//                ResultSet rs;
//                rs = st.executeQuery(sql);
//                rs.next();
//                t_cuenta.setText(rs.getString("NroCuenta"));
//                t_expediente.setText(rs.getString("ExpedienteNro"));
//                t_cheque.setText(rs.getString("NroCheque"));
//                t_importe.setText(rs.getString("Importe"));
//                t_juzgado.setText(rs.getString("OrdenJuzgado"));
//                t_nominacion.setText(rs.getString("Nominacion"));
//
//                t_pesos.setText(rs.getString("SonPesos"));
//                t_anyo.setText(rs.getString("anyo"));
//
//            } catch (SQLException ex) {
//                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Numero de cuenta vacio");
//        }
    }//GEN-LAST:event_b_buscarJuicioActionPerformed

    private void mi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Modificar este registro?");
        if (JOptionPane.OK_OPTION == resp) {
            if (depositoController.modificarDeposito(viewToModel(new Deposito()))) {
                JOptionPane.showMessageDialog(null, "Los datos fueron Modificados con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Algo salio mal. Por Favor verifique "
                        + "los datos ingresados",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_mi_modificarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

//        try {
//
//            JasperReport report;
//            String ubicacion = System.getProperty("user.dir") + "/src/Reportes/DepositosJudiciales.jrxml";
//            String ubicacion2 = System.getProperty("user.dir") + "/src/PDF/";
//            report = JasperCompileManager.compileReport(ubicacion);
//            //report=(JasperReport) JRLoader.loadObject(null);
//            JasperPrint print;
//            print = JasperFillManager.fillReport(report, null, cn);
//
//            // Exporta el informe a PDF
//            JasperExportManager.exportReportToPdfFile(print, ubicacion2 + "DepositosJudiciales" + ".pdf");
//            //Para visualizar el pdf directamente desde java
//            JasperViewer.viewReport(print, false);
//
//        } catch (JRException ex) {
//            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void t_importeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_importeFocusLost
        // falta validadcion por si ponen letras en vez de numeros o un numero no valido..atenti
        try {
            if (t_importe.getText().length() > 0) {
                rellenarImporte();
            }
        } catch (Exception e) {
            t_importe.setText("");
            t_pesos.setText("");
        }
    }//GEN-LAST:event_t_importeFocusLost

    private void t_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cuentaActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        Icon deadComputerIcon = new ImageIcon(getClass().getResource("./deadComputer.jpg"));
        JOptionPane.showMessageDialog(null, "Introducir un numero"
                , "Ventana",JOptionPane.INFORMATION_MESSAGE, deadComputerIcon);
    }
    void limpiar() {
        t_anyo.setText("");
        t_cuenta.getEditor().setItem("");
        t_expediente.setText("");
        t_importe.setText("");
        t_juicio.setText("");
        t_juzgado.setText("");
        t_nominacion.setText("");
        t_pesos.setText("");
        t_cheque.setText("");
        rellenarNroCuenta();
    }

    private Deposito viewToModel(Deposito deposito) {
        try {
            deposito.setAnio(Integer.valueOf(t_anyo.getText()));
            deposito.setNroCuenta(t_cuenta.getEditor().getItem().toString());
            deposito.setNroExpediente(t_expediente.getText());
            deposito.setImporte(Double.valueOf(t_importe.getText()));
            deposito.setJuicio(t_juicio.getText());
            deposito.setOrdenJuzgado(t_juzgado.getText());
            deposito.setNominacion(t_nominacion.getText());
            deposito.setNroCheque(t_cheque.getText());
        } catch (Exception e) {
            return null;
        }
        return deposito;
    }

    private void modelToView(Deposito deposito) {
        t_anyo.setText(String.valueOf(deposito.getAnio()));
        t_cuenta.getEditor().setItem(deposito.getNroCuenta());
        t_expediente.setText(deposito.getNroExpediente());
        t_importe.setText(String.valueOf(deposito.getImporte()));
        t_juicio.setText(deposito.getJuicio());
        t_juzgado.setText(deposito.getOrdenJuzgado());
        t_nominacion.setText(deposito.getNominacion());
        t_cheque.setText(deposito.getNroCheque());
        rellenarImporte();
    }

    private void rellenarImporte() {
        t_pesos.setText(NumeroLetra.numeroALetra(t_importe.getText()));
    }

    private void rellenarNroCuenta() {
        List<Deposito> depositos = depositoController.getDepositos();
        t_cuenta.removeAllItems();
        t_cuenta.addItem("");
        for (Deposito deposito : depositos) {
            t_cuenta.addItem(deposito.getNroCuenta());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_buscarCuenta;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton b_buscarJuicio;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_guardar;
    private javax.swing.JMenuItem mi_modificar;
    private javax.swing.JMenuItem mi_nuevo;
    private javax.swing.JTextField t_anyo;
    private javax.swing.JTextField t_cheque;
    private javax.swing.JComboBox<String> t_cuenta;
    private javax.swing.JTextField t_expediente;
    private javax.swing.JTextField t_importe;
    private javax.swing.JTextField t_juicio;
    private javax.swing.JTextField t_juzgado;
    private javax.swing.JTextField t_nominacion;
    private javax.swing.JTextField t_pesos;
    // End of variables declaration//GEN-END:variables
}
