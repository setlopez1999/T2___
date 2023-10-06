/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab_07.VENTANAS;

import Entidades.ESPECIALIDAD;
import java.awt.Color;

/**
 *
 * @author user
 */
public class A_ESPECIALIDAD extends javax.swing.JFrame {

    GestorCitas base;
    A_MEDICO padre;
    
    public A_ESPECIALIDAD(A_MEDICO padre,GestorCitas base) {
        initComponents();
        this.padre = padre;
        this.base = base;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregarcita = new javax.swing.JButton();
        btnCancelarcita = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregarcita.setBackground(new java.awt.Color(0, 102, 0));
        btnAgregarcita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregarcita.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarcita.setText("GUARDAR");
        btnAgregarcita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAgregarcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarcitaMouseClicked(evt);
            }
        });

        btnCancelarcita.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelarcita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelarcita.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarcita.setText("CANCELAR");
        btnCancelarcita.setToolTipText("");
        btnCancelarcita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelarcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarcitaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR ESPECIALIDAD");

        txtEspecialidad.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtEspecialidad.setForeground(new java.awt.Color(153, 153, 153));
        txtEspecialidad.setText("  NOMBRE");
        txtEspecialidad.setToolTipText("");
        txtEspecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEspecialidadMouseClicked(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(btnAgregarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarcitaMouseClicked
        // Salir
        Salir();
    }//GEN-LAST:event_btnCancelarcitaMouseClicked

    private void btnAgregarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarcitaMouseClicked
        // Agregar especialidad al medico
        if(txtEspecialidad.getText().equals("")||
                txtEspecialidad.getText().equals(  "  NOMBRE")){
            //No hacemos nada
        }else{
            ESPECIALIDAD esp = new ESPECIALIDAD(txtEspecialidad.getText());
            padre.listaEspecialidades.add(esp);
            padre.ActualizarModelo();
            Salir();
        }
        
    }//GEN-LAST:event_btnAgregarcitaMouseClicked

    private void txtEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEspecialidadMouseClicked
        // BORRAMOS Y CAMBIAMOS DE COLOR
        txtEspecialidad.setText("");
        txtEspecialidad.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtEspecialidadMouseClicked

    public void Salir(){
        padre.setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarcita;
    private javax.swing.JButton btnCancelarcita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtEspecialidad;
    // End of variables declaration//GEN-END:variables
}
