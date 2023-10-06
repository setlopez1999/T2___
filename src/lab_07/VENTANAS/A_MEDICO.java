package lab_07.VENTANAS;
import Entidades.ESPECIALIDAD;
import Entidades.MEDICO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
/**
 *
 * @author Set Lopez
 */
public class A_MEDICO extends javax.swing.JFrame {

    GestorCitas base;
    V_MEDICO padre;
    DefaultListModel modeloEspecialidades = new DefaultListModel();
    List<ESPECIALIDAD> listaEspecialidades = new ArrayList<>();
    
    public A_MEDICO(V_MEDICO padre,GestorCitas base) {
        initComponents();
        this.padre = padre;
        this.base = base;
        //this.listaEspecialidades = base.listaMedicos.get;
        //ActualizarModelo();
    }

    public void ActualizarModelo(){
        this.modeloEspecialidades = new DefaultListModel();
        for (int i = 0; i < listaEspecialidades.size(); i++) {
            String text = listaEspecialidades.get(i).getTexto();
            this.modeloEspecialidades.addElement(text);
        }
        this.jList1.setModel(modeloEspecialidades);
        this.jList1.setForeground(Color.BLACK);
    }
    public void Salir(){
        padre.setVisible(true);
        this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCmp = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregarcita = new javax.swing.JButton();
        btnCancelarcita = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAgregarEspecialidad = new javax.swing.JButton();
        btnEliminarEspecialidad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR MEDICO");

        txtCmp.setForeground(new java.awt.Color(153, 153, 153));
        txtCmp.setText("  CMP");
        txtCmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCmpMouseClicked(evt);
            }
        });

        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("  NOMBRE");
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });

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

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setForeground(new java.awt.Color(153, 153, 153));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "ESPECIALIDAD" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        btnAgregarEspecialidad.setBackground(new java.awt.Color(0, 0, 153));
        btnAgregarEspecialidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregarEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEspecialidad.setText("+");
        btnAgregarEspecialidad.setToolTipText("");
        btnAgregarEspecialidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAgregarEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarEspecialidadMouseClicked(evt);
            }
        });

        btnEliminarEspecialidad.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarEspecialidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEspecialidad.setText("-");
        btnEliminarEspecialidad.setToolTipText("");
        btnEliminarEspecialidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnEliminarEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarEspecialidadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(btnAgregarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCmp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
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

    private void btnAgregarEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEspecialidadMouseClicked
        // T
        A_ESPECIALIDAD vent4 = new A_ESPECIALIDAD(this,base);
        vent4.setVisible(true);
        vent4.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgregarEspecialidadMouseClicked

    private void btnAgregarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarcitaMouseClicked
        // Guardar medico
        if(txtNombre.getText().equals("")||
                txtCmp.getText().equals("")||
                listaEspecialidades.isEmpty()){
            //no hacemos nada
        }
        else{
            //Agregamos el medico a la listaMedicos de la base
            String nombre = txtNombre.getText();
            String cmp = txtCmp.getText();
            List<ESPECIALIDAD> especialidades = listaEspecialidades;
            MEDICO medico_actual = new MEDICO(
            nombre,cmp, especialidades);
            //Agregamos el medico
            base.listaMedicos.add(medico_actual);
            padre.ActualizarModelo();
            Salir();
        }
    }//GEN-LAST:event_btnAgregarcitaMouseClicked

    private void btnCancelarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarcitaMouseClicked
        // TODO add your handling code here:
        Salir();
    }//GEN-LAST:event_btnCancelarcitaMouseClicked

    private void btnEliminarEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEspecialidadMouseClicked
        // 
        if(jList1.getSelectedIndex() == -1){
            //No hacemos nada
        }
        else{
            //buscamos el indice
            int index = jList1.getSelectedIndex();
            listaEspecialidades.remove(index);
            ActualizarModelo();
        }
    }//GEN-LAST:event_btnEliminarEspecialidadMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        if(txtNombre.getText().equals("  NOMBRE")){
            //se borra
            txtNombre.setText("");
            //Cambiamos el color
            txtNombre.setForeground(Color.BLACK);
        }
        
        //Ahora evaluamos los otros
        if(txtCmp.getText().equals("")){
            //Si no puso texto le ponemos la marca y cambiamos el color
            txtCmp.setText("  CMP");
            txtCmp.setForeground(new java.awt.Color(204, 204, 204));
        }
        
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtCmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCmpMouseClicked
        // 
        if(txtCmp.getText().equals("  CMP")){
            //se borra
            txtCmp.setText("");
            //Cambiamos el color
            txtCmp.setForeground(Color.BLACK);
        }
        
        //Ahora evaluamos los otros
        if(txtNombre.getText().equals("")){
            //Si no puso texto le ponemos la marca y cambiamos el color
            txtNombre.setText("  NOMBRE");
            txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtCmpMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEspecialidad;
    private javax.swing.JButton btnAgregarcita;
    private javax.swing.JButton btnCancelarcita;
    private javax.swing.JButton btnEliminarEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCmp;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
