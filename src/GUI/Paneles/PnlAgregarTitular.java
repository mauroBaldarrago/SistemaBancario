package GUI.Paneles;
import Logica.*;
import javax.swing.JOptionPane;

public class PnlAgregarTitular extends javax.swing.JPanel {
    private Banco banco;

    public PnlAgregarTitular(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idClienteATD = new javax.swing.JTextField();
        idCuentaATD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        idClienteAAT = new javax.swing.JLabel();
        idCuentaAT = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nombreBC = new javax.swing.JLabel();
        apellidoBC = new javax.swing.JLabel();
        dniBC = new javax.swing.JLabel();
        direccionBC = new javax.swing.JLabel();
        direccionADT = new javax.swing.JLabel();
        dniADT = new javax.swing.JLabel();
        nombreADT = new javax.swing.JLabel();
        apellidoADT = new javax.swing.JLabel();

        TITULO.setBackground(new java.awt.Color(0, 51, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGREGAR TITULAR");

        javax.swing.GroupLayout TITULOLayout = new javax.swing.GroupLayout(TITULO);
        TITULO.setLayout(TITULOLayout);
        TITULOLayout.setHorizontalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TITULOLayout.setVerticalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        idClienteATD.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        idCuentaATD.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enviar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ver cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        idClienteAAT.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        idClienteAAT.setForeground(new java.awt.Color(50, 50, 50));
        idClienteAAT.setText("ID del cliente a agregar:");

        idCuentaAT.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        idCuentaAT.setForeground(new java.awt.Color(50, 50, 50));
        idCuentaAT.setText("ID de la cuenta:");

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

        direccionADT.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        dniADT.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        nombreADT.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        apellidoADT.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

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
                        .addComponent(nombreADT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionBC)
                            .addComponent(apellidoBC)
                            .addComponent(dniBC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniADT, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionADT, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoADT, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreBC)
                    .addComponent(nombreADT, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidoBC)
                    .addComponent(apellidoADT, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniBC)
                    .addComponent(dniADT, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccionBC)
                    .addComponent(direccionADT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(idCuentaAT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCuentaATD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idClienteAAT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idClienteATD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jButton1)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCuentaAT)
                    .addComponent(idCuentaATD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idClienteATD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idClienteAAT)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idCuenta = idCuentaATD.getText().trim();
        String idClienteNuevo = idClienteATD.getText().trim();

        if (idCuenta.isEmpty() || idClienteNuevo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el ID de la Cuenta y del Cliente.");
            return;
        }

        Cuenta cuenta = banco.buscarCuenta(idCuenta);
        if (cuenta == null) {
            JOptionPane.showMessageDialog(this, "Error: La cuenta con ID " + idCuenta + " no existe.");
            return;
        }

        Cliente nuevoTitular = banco.buscarCliente(idClienteNuevo);
        if (nuevoTitular == null) {
            JOptionPane.showMessageDialog(this, "Error: El cliente con ID " + idClienteNuevo + " no existe.");
            return;
        }

        for (Cliente titular : cuenta.getTitulares()) {
            if (titular.getIdCliente().equals(idClienteNuevo)) {
                JOptionPane.showMessageDialog(this, "Este cliente YA es titular de esta cuenta.");
                return;
            }
        }

        cuenta.getTitulares().add(nuevoTitular);

        JOptionPane.showMessageDialog(this, "¡Titular agregado exitosamente!\n" +
                "Ahora la cuenta tiene " + cuenta.getTitulares().size() + " titulares.");

        idCuentaATD.setText("");
        idClienteATD.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idBuscado = idClienteATD.getText().trim();
        
        if (idBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un ID de Cliente.");
            return;
        }
        Cliente clienteEncontrado = banco.buscarCliente(idBuscado);

        if (clienteEncontrado != null) {
            nombreADT.setText(clienteEncontrado.getNombre());
            apellidoADT.setText(clienteEncontrado.getApellido());
            dniADT.setText(clienteEncontrado.getDni());
            direccionADT.setText(clienteEncontrado.getDireccion());
        } else 
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TITULO;
    private javax.swing.JLabel apellidoADT;
    private javax.swing.JLabel apellidoBC;
    private javax.swing.JLabel direccionADT;
    private javax.swing.JLabel direccionBC;
    private javax.swing.JLabel dniADT;
    private javax.swing.JLabel dniBC;
    private javax.swing.JLabel idClienteAAT;
    private javax.swing.JTextField idClienteATD;
    private javax.swing.JLabel idCuentaAT;
    private javax.swing.JTextField idCuentaATD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nombreADT;
    private javax.swing.JLabel nombreBC;
    // End of variables declaration//GEN-END:variables
}
