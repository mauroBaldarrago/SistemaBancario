package GUI.Paneles;
import Logica.*; 
import javax.swing.JOptionPane;

public class PnlTransferir extends javax.swing.JPanel {
    private Banco banco;

    public PnlTransferir(Banco banco) {
        initComponents();
        this.banco = banco;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtETransferencia = new javax.swing.JTextField();
        txtMTransferencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCOTransferencia = new javax.swing.JTextField();
        txtCliTransferencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIDTransferencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCDTransferencia = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TRANSFERIR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(284, 284, 284))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enviar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtETransferencia.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        txtMTransferencia.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 50, 50));
        jLabel7.setText("ID del empleado (si aplica):");

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 50, 50));
        jLabel10.setText("Monto a transferir:");

        txtCOTransferencia.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        txtCliTransferencia.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 50, 50));
        jLabel9.setText("ID del cliente:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(50, 50, 50));
        jLabel12.setText("ID de cuenta origen:");

        txtIDTransferencia.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 50, 50));
        jLabel11.setText("ID de cuenta destino:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 50, 50));
        jLabel8.setText("ID de transferencia:");

        txtCDTransferencia.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(txtIDTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCDTransferencia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCOTransferencia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtETransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMTransferencia))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCliTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIDTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCDTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtCOTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCliTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtETransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtMTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String idTrans   = txtIDTransferencia.getText();
            String idOrigen  = txtCOTransferencia.getText();
            String idDestino = txtCDTransferencia.getText();
            String idCliente = txtCliTransferencia.getText();
            String idEmp     = txtETransferencia.getText();
            String montoTxt  = txtMTransferencia.getText();

            if (idTrans.isEmpty() || idOrigen.isEmpty() || idDestino.isEmpty() || 
                idCliente.isEmpty() || idEmp.isEmpty() || montoTxt.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }
            if (idOrigen.equals(idDestino)) {
                JOptionPane.showMessageDialog(this, "No puede transferir a la misma cuenta.");
                return;
            }

            double monto = Double.parseDouble(montoTxt);
            if (monto <= 0) {
                JOptionPane.showMessageDialog(this, "El monto debe ser mayor a 0.");
                return;
            }

            Cuenta cOrigen  = banco.buscarCuenta(idOrigen);
            Cuenta cDestino = banco.buscarCuenta(idDestino);
            Cliente cliente = banco.buscarCliente(idCliente);
            Empleado empleado = banco.buscarEmpleado(idEmp);

            if (cOrigen == null) {
                JOptionPane.showMessageDialog(this, "La Cuenta Origen no existe.");
                return;
            }
            if (cDestino == null) {
                JOptionPane.showMessageDialog(this, "La Cuenta Destino no existe.");
                return;
            }
            if (cliente == null) {
                JOptionPane.showMessageDialog(this, "El Cliente no existe.");
                return;
            }
            if (empleado == null) {
                JOptionPane.showMessageDialog(this, "El Empleado no existe.");
                return;
            }
            if (cOrigen.consultarSaldo() < monto) {
                JOptionPane.showMessageDialog(this, "Saldo insuficiente en cuenta origen.\nSaldo: " + cOrigen.consultarSaldo());
                return;
            }

            Transferencia nuevaTrans = new Transferencia(idTrans, monto, cliente, empleado);
            nuevaTrans.procesar(cOrigen, cDestino, monto, nuevaTrans);

            JOptionPane.showMessageDialog(this, "¡Transferencia Exitosa!");

            txtCDTransferencia.setText("");
            txtCOTransferencia.setText("");
            txtCliTransferencia.setText("");
            txtETransferencia.setText("");
            txtIDTransferencia.setText("");
            txtMTransferencia.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El monto debe ser numérico.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCDTransferencia;
    private javax.swing.JTextField txtCOTransferencia;
    private javax.swing.JTextField txtCliTransferencia;
    private javax.swing.JTextField txtETransferencia;
    private javax.swing.JTextField txtIDTransferencia;
    private javax.swing.JTextField txtMTransferencia;
    // End of variables declaration//GEN-END:variables
}
