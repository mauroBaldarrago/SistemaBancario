package GUI.Paneles;
import Logica.*;
import javax.swing.JOptionPane;

public class PnlRegistrarCliente extends javax.swing.JPanel {
    private Banco banco;
    
    public PnlRegistrarCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDNIRC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCelularRC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombreRC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtaApellidoRC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDRC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtCorreoRC = new javax.swing.JTextField();
        txtDireccionRC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtContraseñaRC = new javax.swing.JPasswordField();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRAR CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 3, 16)); // NOI18N
        jLabel4.setText("Datos del cliente a registrar:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel7.setText("Nombres:");

        txtNombreRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRCActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel8.setText("Apellidos:");

        txtaApellidoRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaApellidoRCActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel10.setText("ID:");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Enviar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCorreoRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoRCActionPerformed(evt);
            }
        });

        txtDireccionRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionRCActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel11.setText("Dirección:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel9.setText("Correo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtaApellidoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreRC, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDNIRC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCelularRC, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseñaRC))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCorreoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionRC, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNIRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCelularRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtaApellidoRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCorreoRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDireccionRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(txtContraseñaRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRCActionPerformed

    private void txtaApellidoRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaApellidoRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaApellidoRCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String dni       = txtDNIRC.getText();
            String nombre    = txtNombreRC.getText(); 
            String apellido  = txtaApellidoRC.getText(); 
            String direccion = txtDireccionRC.getText(); 
            String celular   = txtCelularRC.getText(); 
            String email     = txtCorreoRC.getText(); 
            String idCliente = txtIDRC.getText(); 
            String pass      = new String(txtContraseñaRC.getPassword());

            if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || 
                direccion.isEmpty() || celular.isEmpty() || email.isEmpty() || 
                idCliente.isEmpty() || pass.isEmpty()) {
                
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }
            if (!dni.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos numéricos.");
                return;
            }
            if (banco.buscarCliente(idCliente) != null) {
                JOptionPane.showMessageDialog(this, "Ya existe un cliente con ese ID.");
                return;
            }
            Cliente nuevoCliente = new Cliente(
                    nombre, 
                    apellido, 
                    dni, 
                    direccion, 
                    celular, 
                    idCliente, 
                    email, 
                    pass
            );
            banco.registrarCliente(nuevoCliente);
            JOptionPane.showMessageDialog(this, "¡Cliente registrado exitosamente!");
            
            txtDNIRC.setText("");
            txtDireccionRC.setText("");
            txtCorreoRC.setText("");
            txtIDRC.setText("");
            txtNombreRC.setText("");
            txtaApellidoRC.setText("");
            txtCelularRC.setText("");
            txtContraseñaRC.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCorreoRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoRCActionPerformed

    private void txtDireccionRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionRCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCelularRC;
    private javax.swing.JPasswordField txtContraseñaRC;
    private javax.swing.JTextField txtCorreoRC;
    private javax.swing.JTextField txtDNIRC;
    private javax.swing.JTextField txtDireccionRC;
    private javax.swing.JTextField txtIDRC;
    private javax.swing.JTextField txtNombreRC;
    private javax.swing.JTextField txtaApellidoRC;
    // End of variables declaration//GEN-END:variables
}
