package com.kernelelectronic.depositosjudiciales.view;

import com.kernelelectronic.depositosjudiciales.model.Deposito;
import com.kernelelectronic.depositosjudiciales.controller.DepositoController;
import com.kernelelectronic.depositosjudiciales.utils.statics.ReporteStatics;
import com.kernelelectronic.depositosjudiciales.utils.statics.NumeroLetraStatics;
import com.kernelelectronic.depositosjudiciales.utils.statics.constants.ApplicationConstantsStatic;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;
import javax.swing.*;

public class Form extends javax.swing.JFrame {

    private DepositoController depositoController = DepositoController.getInstance();

    public Form() {
        initComponents();
        rellenarNroCuenta();
        rellenarAnyo();
        this.setLocationRelativeTo(null);
        jb_anterior.setEnabled(false);
        jb_siguiente.setEnabled(false);
    }

    @Override 
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ApplicationConstantsStatic.ICON_APPLICATION);
        return retValue;
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
        jLabel4 = new javax.swing.JLabel();
        t_cheque = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t_banco = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jb_ultimo = new javax.swing.JButton();
        jb_primero = new javax.swing.JButton();
        jb_anterior = new javax.swing.JButton();
        jb_siguiente = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mi_nuevo = new javax.swing.JMenuItem();
        mi_guardar = new javax.swing.JMenuItem();
        mi_modificar = new javax.swing.JMenuItem();
        mi_eliminar = new javax.swing.JMenuItem();
        jS1 = new javax.swing.JPopupMenu.Separator();
        jmi_configurar = new javax.swing.JMenuItem();
        jS2 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        informeMenu = new javax.swing.JMenu();
        jmi_seleccionar = new javax.swing.JMenuItem();
        jmi_todos = new javax.swing.JMenuItem();
        jmi_actual = new javax.swing.JMenuItem();
        jmi_today = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Depositos Judiciales");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
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

        jLabel4.setText("Nro de Cheque");

        jLabel10.setText("Banco");

        t_banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_bancoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(4, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jb_ultimo.setText("Ultimo");
        jb_ultimo.setMaximumSize(new java.awt.Dimension(77, 23));
        jb_ultimo.setMinimumSize(new java.awt.Dimension(77, 23));
        jb_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ultimoActionPerformed(evt);
            }
        });

        jb_primero.setText("Primero");
        jb_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_primeroActionPerformed(evt);
            }
        });

        jb_anterior.setText("Anterior");
        jb_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_anteriorActionPerformed(evt);
            }
        });

        jb_siguiente.setText("Siguiente");
        jb_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_juzgado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_pesos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_importe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_anyo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_expediente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_buscarCuenta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_banco))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_juicio, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_nominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_primero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_siguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(t_banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
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
                    .addComponent(t_juicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_primero)
                    .addComponent(jb_anterior)
                    .addComponent(jb_siguiente)
                    .addComponent(jb_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        fileMenu.add(jS1);

        jmi_configurar.setText("Configurar");
        jmi_configurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_configurarActionPerformed(evt);
            }
        });
        fileMenu.add(jmi_configurar);
        fileMenu.add(jS2);

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

        informeMenu.setText("Informes");

        jmi_seleccionar.setText("Imprimir selecionados");
        jmi_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_seleccionarActionPerformed(evt);
            }
        });
        informeMenu.add(jmi_seleccionar);

        jmi_todos.setText("Imprimir todos");
        jmi_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_todosActionPerformed(evt);
            }
        });
        informeMenu.add(jmi_todos);

        jmi_actual.setText("Imprimir actual");
        jmi_actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualActionPerformed(evt);
            }
        });
        informeMenu.add(jmi_actual);

        jmi_today.setText("Imprimir hoy");
        jmi_today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_todayActionPerformed(evt);
            }
        });
        informeMenu.add(jmi_today);

        menuBar.add(informeMenu);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mi_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_nuevoActionPerformed
        limpiar();
        rellenarAnyo();
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
                            + "los datos ingresados \n recuerde que no puede haber campos vacios"
                            + "\n ni se puede ingresar el mismo deposito.",
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

    private void jmi_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        new SelectorDeposito().setVisible(true);
    }

    private void t_importeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_importeFocusLost
        // falta validadcion por si ponen letras en vez de numeros o un numero no valido..atenti
        try {
            if (t_importe.getText().length() > 0) {
                t_pesos.setText(NumeroLetraStatics.numeroALetra(t_importe.getText()));
            }
        } catch (Exception e) {
            t_importe.setText("");
            t_pesos.setText("");
        }
    }//GEN-LAST:event_t_importeFocusLost

    private void t_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cuentaActionPerformed
        t_cuenta.transferFocus();
    }//GEN-LAST:event_t_cuentaActionPerformed

    private void t_bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_bancoActionPerformed
        t_banco.transferFocus();
    }//GEN-LAST:event_t_bancoActionPerformed

    private void jmi_todayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_todayActionPerformed
        ReporteStatics.printToday();
    }//GEN-LAST:event_jmi_todayActionPerformed

    private void jmi_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_todosActionPerformed
        ReporteStatics.printAll();
    }//GEN-LAST:event_jmi_todosActionPerformed

    private void jmi_actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualActionPerformed
        ReporteStatics.print(viewToModel(new Deposito()));
    }//GEN-LAST:event_jmi_actualActionPerformed

    private void jmi_configurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_configurarActionPerformed
        new ConfigurarBoleta().setVisible(true);
    }//GEN-LAST:event_jmi_configurarActionPerformed

    private void jb_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_primeroActionPerformed
        modelToView(depositoController.getFirst());
        jb_anterior.setEnabled(false);
        jb_siguiente.setEnabled(true);
        jb_ultimo.setEnabled(true);
    }//GEN-LAST:event_jb_primeroActionPerformed

    private void jb_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_anteriorActionPerformed
        modelToView(depositoController.getPrevious());
        if(depositoController.isFirst()){
            jb_anterior.setEnabled(false);
        }
        
            jb_siguiente.setEnabled(true);
            jb_ultimo.setEnabled(true);
    }//GEN-LAST:event_jb_anteriorActionPerformed

    private void jb_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_siguienteActionPerformed
        
        modelToView(depositoController.getNext());
        jb_anterior.setEnabled(true);
        if (depositoController.isLast()) {
            jb_siguiente.setEnabled(false);
            jb_ultimo.setEnabled(false);
        }
    }//GEN-LAST:event_jb_siguienteActionPerformed

    private void jb_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ultimoActionPerformed
        modelToView(depositoController.getLast());
        jb_siguiente.setEnabled(false);
    }//GEN-LAST:event_jb_ultimoActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        new About().setVisible(true);
    }

    void limpiar() {
        t_anyo.setText("");
        t_cuenta.getEditor().setItem("");
        t_expediente.setText("");
        t_banco.setText("");
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
            deposito.setAnio(t_anyo.getText());
            deposito.setNroCuenta(t_cuenta.getEditor().getItem().toString());
            deposito.setNroExpediente(t_expediente.getText());
            deposito.setBanco(t_banco.getText());
            deposito.setImporte(t_importe.getText());
            deposito.setPesos(t_pesos.getText());
            deposito.setJuicio(t_juicio.getText());
            deposito.setOrdenJuzgado(t_juzgado.getText());
            deposito.setNominacion(t_nominacion.getText());
            deposito.setNroCheque(t_cheque.getText());
            deposito.setLocalDate(LocalDate.now());
        } catch (Exception e) {
            return null;
        }
        return deposito;
    }

    private void modelToView(Deposito deposito) {
        t_anyo.setText(String.valueOf(deposito.getAnio()));
        t_cuenta.getEditor().setItem(deposito.getNroCuenta());
        t_expediente.setText(deposito.getNroExpediente());
        t_banco.setText(deposito.getBanco());
        t_importe.setText(String.valueOf(deposito.getImporte()));
        t_pesos.setText(deposito.getPesos());
        t_juicio.setText(deposito.getJuicio());
        t_juzgado.setText(deposito.getOrdenJuzgado());
        t_nominacion.setText(deposito.getNominacion());
        t_cheque.setText(deposito.getNroCheque());
    }

    private void rellenarNroCuenta() {
        List<Deposito> depositos = depositoController.getDepositos();
        t_cuenta.removeAllItems();
        t_cuenta.addItem("");
        for (Deposito deposito : depositos) {
            t_cuenta.addItem(deposito.getNroCuenta());
        }
    }

    private void rellenarAnyo() {
        t_anyo.setText(String.valueOf(LocalDate.now().getYear()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_buscarCuenta;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu informeMenu;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jS1;
    private javax.swing.JPopupMenu.Separator jS2;
    private javax.swing.JButton jb_anterior;
    private javax.swing.JButton jb_primero;
    private javax.swing.JButton jb_siguiente;
    private javax.swing.JButton jb_ultimo;
    private javax.swing.JMenuItem jmi_actual;
    private javax.swing.JMenuItem jmi_configurar;
    private javax.swing.JMenuItem jmi_seleccionar;
    private javax.swing.JMenuItem jmi_today;
    private javax.swing.JMenuItem jmi_todos;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_guardar;
    private javax.swing.JMenuItem mi_modificar;
    private javax.swing.JMenuItem mi_nuevo;
    private javax.swing.JTextField t_anyo;
    private javax.swing.JTextField t_banco;
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