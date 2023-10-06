/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab_07.VENTANAS;

import Entidades.CITA;
import javax.swing.JComboBox;

/**
 *
 * @author user
 */
public class VISUALIZAR_CITA extends javax.swing.JFrame {

    /**
     * Creates new form VISUALIZAR_CITA
     */
    GestorCitas padre;
    CITA cita ;
    public VISUALIZAR_CITA(GestorCitas padre,CITA cita) {
        initComponents();
        this.padre= padre;
        this.cita = cita;
        setDatos();
        
    }

    public void setDatos(){
        //Seteamos los datos de la cita
        
        txtNombre.setText(cita.getPaciente().getNombre());
        txtMedico.setText(cita.getMedico().getNombre());
        txtEspecialidad.setText(cita.getEspecialidad().getNombre());
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem(cita.getFecha());
        this.jComboBoxFecha.setModel(comboBox.getModel());
        
        JComboBox<String> comboBox2 = new JComboBox<>();
        comboBox2.addItem(cita.getHora());
        this.jComboBoxHora.setModel(comboBox2.getModel());
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMedico = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        btnCancelarcita = new javax.swing.JButton();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jComboBoxFecha = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("VISUALIZAR CITA");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("ESPECIALIDAD");
        jLabel2.setToolTipText("");
        jLabel2.setAutoscrolls(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 80, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("NOMBRE");
        jLabel3.setToolTipText("");
        jLabel3.setAutoscrolls(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 60, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("MEDICO");
        jLabel4.setToolTipText("");
        jLabel4.setAutoscrolls(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 60, 20));

        txtNombre.setEditable(false);
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 343, 37));

        txtMedico.setEditable(false);
        txtMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 343, 37));

        txtEspecialidad.setEditable(false);
        txtEspecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 343, 37));

        btnCancelarcita.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelarcita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelarcita.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarcita.setText("CANCELAR");
        btnCancelarcita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelarcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarcitaMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelarcita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 197, 37));

        jComboBoxHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxHora.setEnabled(false);
        jPanel2.add(jComboBoxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 148, 37));

        jComboBoxFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxFecha.setEnabled(false);
        jPanel2.add(jComboBoxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 148, 37));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarcitaMouseClicked
        // TODO add your handling code here:
        Salir();
    }//GEN-LAST:event_btnCancelarcitaMouseClicked

    public void Salir(){
        padre.setVisible(true);
        this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarcita;
    private javax.swing.JComboBox<String> jComboBoxFecha;
    private javax.swing.JComboBox<String> jComboBoxHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
