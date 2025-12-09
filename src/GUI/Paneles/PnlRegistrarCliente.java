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

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
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

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("REGISTRAR CLIENTE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(244, 244, 244))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(14, 14, 14))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 50, 50));
        jLabel2.setText("DNI:");

        txtDNIRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 16)); // NOI18N
        jLabel4.setText("Datos del cliente a registrar:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 50, 50));
        jLabel5.setText("Celular:");

        txtCelularRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 50, 50));
        jLabel7.setText("Nombres:");

        txtNombreRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        txtNombreRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRCActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 50, 50));
        jLabel8.setText("Apellidos:");

        txtaApellidoRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        txtaApellidoRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaApellidoRCActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(50, 50, 50));
        jLabel6.setText("Contraseña:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 50, 50));
        jLabel10.setText("ID:");

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
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

        txtDireccionRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        txtDireccionRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionRCActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 50, 50));
        jLabel11.setText("Dirección:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 50, 50));
        jLabel9.setText("Correo:");

        txtContraseñaRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(270, 270, 270))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtaApellidoRC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDNIRC, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelularRC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreRC, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCorreoRC, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContraseñaRC))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccionRC, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCorreoRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDireccionRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(txtContraseñaRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRCActionPerformed

    private void txtaApellidoRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaApellidoRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaApellidoRCActionPerformed

    private void txtCorreoRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoRCActionPerformed

    private void txtDireccionRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionRCActionPerformed
                                          

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
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
