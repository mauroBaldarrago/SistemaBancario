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
        idClienteAAT = new javax.swing.JLabel();
        idCuentaAT = new javax.swing.JLabel();
        idClienteATD = new javax.swing.JTextField();
        idCuentaATD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        TITULO.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGREGAR TITULAR");

        javax.swing.GroupLayout TITULOLayout = new javax.swing.GroupLayout(TITULO);
        TITULO.setLayout(TITULOLayout);
        TITULOLayout.setHorizontalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(112, 112, 112)
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

        idClienteAAT.setFont(new java.awt.Font("Segoe UI Variable", 3, 16)); // NOI18N
        idClienteAAT.setText("ID DEL CLIENTE A AGREGAR:");

        idCuentaAT.setFont(new java.awt.Font("Segoe UI Variable", 3, 16)); // NOI18N
        idCuentaAT.setText("ID DE LA CUENTA:");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Enviar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idCuentaAT, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCuentaATD, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idClienteAAT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idClienteATD)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCuentaAT)
                    .addComponent(idCuentaATD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClienteATD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idClienteAAT))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(69, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TITULO;
    private javax.swing.JLabel idClienteAAT;
    private javax.swing.JTextField idClienteATD;
    private javax.swing.JLabel idCuentaAT;
    private javax.swing.JTextField idCuentaATD;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
