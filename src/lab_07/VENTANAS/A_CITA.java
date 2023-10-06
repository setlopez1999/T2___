/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab_07.VENTANAS;


import Entidades.CITA;
import Entidades.ESPECIALIDAD;
import Entidades.MEDICO;
import Entidades.PACIENTE;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author user
 */
public class A_CITA extends javax.swing.JFrame {
    
    JComboBox<String> comboBox = new JComboBox<>();
    List<ESPECIALIDAD> listaEsp_cb = new ArrayList<>();
    GestorCitas padre;
    
    //Instancias para crear la cita
    PACIENTE paciente_selec;
    MEDICO medico_selec;
    ESPECIALIDAD especialidad_selec;
    
    
    public A_CITA(GestorCitas padre) {
        initComponents();
        this.padre = padre;
        AñadirFechas();
        AñadirHoras();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnAgregarCita = new javax.swing.JButton();
        btnBuscarPaciente = new javax.swing.JButton();
        btnBuscarMedico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        txtMedico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        cbEspecialidad.setForeground(new java.awt.Color(153, 153, 153));
        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==ESPECIALIDAD==" }));
        cbEspecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarCita.setBackground(new java.awt.Color(0, 102, 0));
        btnAgregarCita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCita.setText("AGREGAR CITA");
        btnAgregarCita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAgregarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCitaMouseClicked(evt);
            }
        });

        btnBuscarPaciente.setBackground(new java.awt.Color(0, 51, 204));
        btnBuscarPaciente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPaciente.setText("BUSCAR PACIENTE");
        btnBuscarPaciente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnBuscarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPacienteMouseClicked(evt);
            }
        });

        btnBuscarMedico.setBackground(new java.awt.Color(0, 51, 204));
        btnBuscarMedico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarMedico.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarMedico.setText("BUSCAR MEDICO");
        btnBuscarMedico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnBuscarMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMedicoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("NUEVA CITA");

        txtPaciente.setEditable(false);
        txtPaciente.setForeground(new java.awt.Color(153, 153, 153));
        txtPaciente.setText("   ==PACIENTE==");
        txtPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMedico.setEditable(false);
        txtMedico.setForeground(new java.awt.Color(153, 153, 153));
        txtMedico.setText("   ==MEDICO==");
        txtMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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

    private void btnBuscarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPacienteMouseClicked
        // TODO add your handling code here:
        //Abrimos la ventana Paciente
        V_PACIENTES vent3 = new V_PACIENTES(this,padre);
        vent3.setVisible(true);
        vent3.setLocationRelativeTo(null);
        this.dispose();
        //
        
        
    }//GEN-LAST:event_btnBuscarPacienteMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        Salir();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnBuscarMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedicoMouseClicked
        // Abrimos la lista de medicos
        V_MEDICO vent3 = new V_MEDICO(this,padre);
        vent3.setVisible(true);
        vent3.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBuscarMedicoMouseClicked

    private void btnAgregarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCitaMouseClicked
        //Buscamos la especialidad seleccioanda en el combobox
        int index = cbEspecialidad.getSelectedIndex();
        if(index != -1){
            
            especialidad_selec =listaEsp_cb.get(index);
        }
        
        // Ahora creamos una lista
        if(txtPaciente.getText().equals("")||
                txtMedico.getText().equals("")||
                cbEspecialidad.getSelectedItem().equals("")){
            //No se hace nada
        }
        else{
            //Agregamos la lista con los items seleccioandos
            CITA cita_nueva;
            cita_nueva = new CITA(medico_selec, 
                    paciente_selec, 
                    especialidad_selec);
            cita_nueva.setFecha(jComboBox1.getSelectedItem().toString());
            cita_nueva.setHora(jComboBox2.getSelectedItem().toString());
            //Ahora lo agregamos a la lista de la base
            padre.listaCitas.add(cita_nueva);
            padre.ActualizarModelo();
            Salir();
        }
        
    }//GEN-LAST:event_btnAgregarCitaMouseClicked

    //ACtualizar
    public void AñadirFechas(){
        
        List<String> lista = new ArrayList<>();
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String fecha_actual = ahora.format(formato);
        for(int i = 0 ; i<30 ; i++){
            lista.add(fecha_actual);
            ahora = ahora.plusDays(1);
            fecha_actual = ahora.format(formato);
        }
        for (int i = 0; i < lista.size(); i++) {
            String text = lista.get(i);
            this.jComboBox1.addItem(text);
        }
    }
    
    public void AñadirHoras(){
        
        List<String> lista = new ArrayList<>();
        int hora = 9;
        String hora_actual;
        for(int i = 1 ; i<20 ; i++){
            hora_actual = hora+":00";
            if(i % 2 == 0){
                hora_actual = hora + ":30";
                lista.add(hora_actual);
                hora++;
                continue;
            }
            lista.add(hora_actual);
        }
        for (int i = 0; i < lista.size(); i++) {
            String text = lista.get(i);
            this.jComboBox2.addItem(text);
        }
    }
    
    public void ActualizarDatos(int pac ,int med){
        if(pac != -1){
            //VOLVEMOS AL COLOR NORMAL
            txtPaciente.setForeground(Color.BLACK);
            txtPaciente.setText(
                    padre.listaPacientes.get(pac).getNombre());
            //Guardamos el PACIENTE
            paciente_selec = padre.listaPacientes.get(pac);
        }
        if(med != -1){
            //VOLVEMOS AL COLOR NEGRO
            txtMedico.setForeground(Color.BLACK);
            cbEspecialidad.setForeground(Color.BLACK);
            txtMedico.setText(
                    padre.listaMedicos.get(med).getNombre());
            //Ahora actualizamos las especialidades
            listaEsp_cb = padre.listaMedicos.get(med).getEspecialidad();
            //this.cbEspecialidad.removeAllItems();
            //comboBox.removeAllItems();
            ActualizarModelo();
            //Guardamos el MEDICO
            medico_selec = padre.listaMedicos.get(med);
            
        }
    }
    
    public void ActualizarModelo(){
        
        comboBox = new JComboBox<>();
        for (int i = 0; i < listaEsp_cb.size(); i++) {
            String text = listaEsp_cb.get(i).getTexto();
            this.comboBox.addItem(text);
        }
        this.cbEspecialidad.setModel(comboBox.getModel());
        
    }
    
    public void Salir(){
        padre.setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCita;
    private javax.swing.JButton btnBuscarMedico;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
