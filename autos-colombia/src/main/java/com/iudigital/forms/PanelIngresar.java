/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iudigital.forms;

import com.iudigital.clase.Vehiculo;
import com.iudigital.dao.VehiDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Darwin Felix
 */
public class PanelIngresar extends javax.swing.JPanel {

    /**
     * Creates new form PanelIngresar
     */
    public static String tipoVehiculo = "";
    public static String marca;
    public static String modelo;
    public static String color;
    public static String placa;
    public static String observ;

    public PanelIngresar() {
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

        grupoTipos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        rbCarro = new javax.swing.JRadioButton();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObser = new javax.swing.JTextArea();
        rbMoto = new javax.swing.JRadioButton();
        rbBicicleta = new javax.swing.JRadioButton();
        btnRegVehi = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar veh??culo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("PLACA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("TIPO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MARCA:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("MODELO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("COLOR:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("OBSERVACIONES:");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        grupoTipos.add(rbCarro);
        rbCarro.setText("Carro");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        txtObser.setColumns(20);
        txtObser.setRows(5);
        jScrollPane1.setViewportView(txtObser);

        grupoTipos.add(rbMoto);
        rbMoto.setText("Moto");

        grupoTipos.add(rbBicicleta);
        rbBicicleta.setText("Bicicleta");

        btnRegVehi.setText("Registrar");
        btnRegVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegVehiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMarca)
                                .addComponent(txtModelo)
                                .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbCarro)
                                .addGap(18, 18, 18)
                                .addComponent(rbMoto)
                                .addGap(26, 26, 26)
                                .addComponent(rbBicicleta))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(btnRegVehi)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbCarro)
                    .addComponent(rbMoto)
                    .addComponent(rbBicicleta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnRegVehi)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnRegVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegVehiActionPerformed
        // TODO add your handling code here:

        if (rbCarro.isSelected()) {
            tipoVehiculo = "Automovil";
        }
        if (rbMoto.isSelected()) {
            tipoVehiculo = "Motocicleta";
        }
        if (rbBicicleta.isSelected()) {
            tipoVehiculo = "Bicicleta";
        }

        placa = txtPlaca.getText();
        marca = txtMarca.getText();
        modelo = txtModelo.getText();
        color = txtColor.getText();
        observ = txtObser.getText();

        VehiDao guardarVeh = new VehiDao();

        Vehiculo nuevoVehi = new Vehiculo();

        nuevoVehi.setTipoVehi(tipoVehiculo);
        nuevoVehi.setPlaca(placa);
        nuevoVehi.setMarca(marca);
        nuevoVehi.setModelo(modelo);
        nuevoVehi.setColor(color);
        nuevoVehi.setObservaciones(observ);

        guardarVeh.registrarVehi(nuevoVehi);

        JOptionPane.showMessageDialog(this, "Vehiculo guardado correctamente");

        txtPlaca.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtObser.setText("");


    }//GEN-LAST:event_btnRegVehiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegVehi;
    private javax.swing.ButtonGroup grupoTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbBicicleta;
    private javax.swing.JRadioButton rbCarro;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextArea txtObser;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
