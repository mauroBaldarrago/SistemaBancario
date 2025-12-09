package GUI.Paneles;
import Logica.*;
import javax.swing.JOptionPane;

public class PnlBuscarCliente extends javax.swing.JPanel {
    private Banco banco;

    public PnlBuscarCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        idClienteDBC = new javax.swing.JTextField();
        idClienteBC = new javax.swing.JLabel();
        enviarBC = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nombreBC = new javax.swing.JLabel();
        apellidoBC = new javax.swing.JLabel();
        dniBC = new javax.swing.JLabel();
        direccionBC = new javax.swing.JLabel();
        direccionMBC = new javax.swing.JLabel();
        dniMBC = new javax.swing.JLabel();
        nombreMBC = new javax.swing.JLabel();
        apellidoMBC = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        idClienteDBC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        idClienteBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 16)); // NOI18N
        idClienteBC.setForeground(new java.awt.Color(50, 50, 50));
        idClienteBC.setText("ID del cliente:");

        enviarBC.setBackground(new java.awt.Color(0, 51, 102));
        enviarBC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enviarBC.setForeground(new java.awt.Color(255, 255, 255));
        enviarBC.setText("Enviar datos");
        enviarBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBCActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 102))); // NOI18N

        nombreBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        nombreBC.setForeground(new java.awt.Color(50, 50, 50));
        nombreBC.setText("Nombres:");

        apellidoBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        apellidoBC.setForeground(new java.awt.Color(50, 50, 50));
        apellidoBC.setText("Apellidos:");

        dniBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        dniBC.setForeground(new java.awt.Color(50, 50, 50));
        dniBC.setText("DNI:");

        direccionBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        direccionBC.setForeground(new java.awt.Color(50, 50, 50));
        direccionBC.setText("Dirección:");

        direccionMBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        dniMBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        nombreMBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        apellidoMBC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nombreBC)
                        .addGap(18, 18, 18)
                        .addComponent(nombreMBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionBC)
                            .addComponent(apellidoBC)
                            .addComponent(dniBC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniMBC, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionMBC, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoMBC, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreBC)
                    .addComponent(nombreMBC, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidoBC)
                    .addComponent(apellidoMBC, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniMBC, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(dniBC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccionBC)
                    .addComponent(direccionMBC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(idClienteBC, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idClienteDBC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviarBC)))
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClienteBC)
                    .addComponent(idClienteDBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarBC))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR CLIENTE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(266, 266, 266))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBCActionPerformed
        String idBuscado = idClienteDBC.getText().trim();
        
        if (idBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un ID de Cliente.");
            return;
        }
        Cliente clienteEncontrado = banco.buscarCliente(idBuscado);

        if (clienteEncontrado != null) {
            nombreMBC.setText(clienteEncontrado.getNombre());
            apellidoMBC.setText(clienteEncontrado.getApellido());
            dniMBC.setText(clienteEncontrado.getDni());
            direccionMBC.setText(clienteEncontrado.getDireccion());
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            limpiarCampos();
        }
    }//GEN-LAST:event_enviarBCActionPerformed

    private void limpiarCampos() {
        nombreMBC.setText("---");
        apellidoMBC.setText("---");
        dniMBC.setText("---");
        direccionMBC.setText("---");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoBC;
    private javax.swing.JLabel apellidoMBC;
    private javax.swing.JLabel direccionBC;
    private javax.swing.JLabel direccionMBC;
    private javax.swing.JLabel dniBC;
    private javax.swing.JLabel dniMBC;
    private javax.swing.JButton enviarBC;
    private javax.swing.JLabel idClienteBC;
    private javax.swing.JTextField idClienteDBC;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nombreBC;
    private javax.swing.JLabel nombreMBC;
    // End of variables declaration//GEN-END:variables
}
