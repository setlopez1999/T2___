/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab_07.VENTANAS;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.List;
import Entidades.CITA;
import Entidades.MEDICO;
import Entidades.PACIENTE;
import javax.swing.JOptionPane;

/**
 *
 * @author Set Lopez
 */
public class GestorCitas extends javax.swing.JFrame {

    DefaultListModel modeloCitas = new DefaultListModel();
    List<CITA> listaCitas = new ArrayList<>();
    List<MEDICO> listaMedicos= new ArrayList<>();
    List<PACIENTE> listaPacientes= new ArrayList<>();
    //List<ESPECIALIDAD> listaEspecialidades= new ArrayList<>();

    public GestorCitas() {
        initComponents();
        
        ActualizarModelo();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtBuscar = new javax.swing.JTextField();
        btnAgregarcita = new javax.swing.JButton();
        btnCancelarCita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTOR DE CITAS MEDICAS");

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("GESTOR DE CITAS MEDICAS");

        btnBuscar.setBackground(new java.awt.Color(0, 51, 204));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarcita.setBackground(new java.awt.Color(0, 102, 0));
        btnAgregarcita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregarcita.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarcita.setText("AGREGAR CITA");
        btnAgregarcita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAgregarcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarcitaMouseClicked(evt);
            }
        });

        btnCancelarCita.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelarCita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCita.setText("CANCELAR CITA");
        btnCancelarCita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarCitaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarcitaMouseClicked
        // TODO add your handling code here:
        //Abrimos A_cita
        A_CITA vent2 = new A_CITA(this);
        vent2.setVisible(true);
        vent2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgregarcitaMouseClicked

    private void btnCancelarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCitaMouseClicked
        // cancelar cita
        //Eliminamos la cita seleccionada
        if(jList1.getSelectedIndex() != -1){
            int index = jList1.getSelectedIndex();
            //Removemos la cita
            listaCitas.remove(index);
            ActualizarModelo();
        }
        else{
            //No hacemos nada
        }
    }//GEN-LAST:event_btnCancelarCitaMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // Buscar
        if(txtBuscar.getText().equals("")){
            //NO hacemos nada
        }else{
            //Vamos a buscar el string en la lista actual de Estudiante
            String palabra = txtBuscar.getText();
            int flag = 0;
            for( int i = 0; i< listaCitas.size();i++){
                String dniText = listaCitas.get(i).getPaciente().getDni();
                if(dniText.equals(palabra)){
                    //Mostramos que si esta encontrado
                    flag = 1;
                    //Mostramos mensaje
                    JOptionPane.showMessageDialog(null, ""
                            + "La Cita SI fue encontrada");
                }
            }
            if(flag == 0){
                JOptionPane.showMessageDialog(null, ""
                        + "La Cita NO fue encontrada");
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        //VISUALIZAR
        if(evt.getClickCount() == 2 && jList1.getSelectedIndex() != -1){
            //Si toca mas de una vez
            int index = jList1.getSelectedIndex();
            
            VISUALIZAR_CITA vent5 = new VISUALIZAR_CITA(this,
            listaCitas.get(index));
            vent5.setVisible(true);
            vent5.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jList1MouseClicked
////
    public void ActualizarModelo(){
        this.modeloCitas = new DefaultListModel();
        for (int i = 0; i < listaCitas.size(); i++) {
            String text = listaCitas.get(i).getTexto();
            this.modeloCitas.addElement(text);
        }
        this.jList1.setModel(modeloCitas);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarcita;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
