package GUI.Paneles;
import Logica.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PnlCrearCuenta extends javax.swing.JPanel {
    private Banco banco;
    
    public PnlCrearCuenta(Banco banco) {
        this.banco = banco;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        idRC = new javax.swing.JLabel();
        saldoRC = new javax.swing.JLabel();
        idClienteRC = new javax.swing.JLabel();
        tipoRC = new javax.swing.JLabel();
        idDRC = new javax.swing.JTextField();
        saldoDRC = new javax.swing.JTextField();
        idClienteDRC = new javax.swing.JTextField();
        tipoDRC = new javax.swing.JComboBox<>();
        botonRC = new javax.swing.JButton();

        TITULO.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRAR CUENTA");

        javax.swing.GroupLayout TITULOLayout = new javax.swing.GroupLayout(TITULO);
        TITULO.setLayout(TITULOLayout);
        TITULOLayout.setHorizontalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TITULOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(127, 127, 127))
        );
        TITULOLayout.setVerticalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        titulo2.setFont(new java.awt.Font("Segoe UI Variable", 3, 16)); // NOI18N
        titulo2.setText("Datos de la cuenta a registrar:");

        idRC.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        idRC.setText("ID:");

        saldoRC.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        saldoRC.setText("Saldo inicial:");

        idClienteRC.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        idClienteRC.setText("ID del Cliente titular:");

        tipoRC.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        tipoRC.setText("Tipo de cuenta:");

        tipoDRC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorro", "Corriente" }));
        tipoDRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDRCActionPerformed(evt);
            }
        });

        botonRC.setBackground(new java.awt.Color(204, 204, 204));
        botonRC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonRC.setText("Enviar datos");
        botonRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipoRC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(idClienteRC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idClienteDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saldoRC))
                            .addComponent(titulo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldoDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(botonRC)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRC)
                    .addComponent(saldoRC)
                    .addComponent(saldoDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClienteRC)
                    .addComponent(idClienteDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoRC)
                    .addComponent(tipoDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(botonRC)
                .addGap(0, 44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tipoDRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDRCActionPerformed

    private void botonRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRCActionPerformed
        try {
            String idCuenta = idDRC.getText().trim();
            String saldoTxt = saldoDRC.getText().trim();
            String idCliente = idClienteDRC.getText().trim();
            String tipo = tipoDRC.getSelectedItem().toString();

            if (idCuenta.isEmpty() || saldoTxt.isEmpty() || idCliente.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }
            double saldo = Double.parseDouble(saldoTxt);
            if (saldo < 0) {
                JOptionPane.showMessageDialog(this, "El saldo inicial no puede ser negativo.");
                return;
            }
            if (banco.buscarCuenta(idCuenta) != null) {
                JOptionPane.showMessageDialog(this, "Error: Ya existe una cuenta con el ID " + idCuenta);
                return;
            }

            Cliente titular = banco.buscarCliente(idCliente);

            if (titular == null) {
                JOptionPane.showMessageDialog(this, "Error: El Cliente con ID " + idCliente + " no existe.");
                return;
            }

            ArrayList<Cliente> listaTitulares = new ArrayList<>();
            listaTitulares.add(titular);
            Cuenta nuevaCuenta = new Cuenta(idCuenta, tipo, saldo, listaTitulares);
            
            banco.getCuentas().add(nuevaCuenta);

            JOptionPane.showMessageDialog(this, "¡Cuenta creada exitosamente!");

            idDRC.setText("");
            saldoDRC.setText("");
            idClienteDRC.setText("");
            tipoDRC.setSelectedIndex(0);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El saldo debe ser un número válido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage());
        }
    }//GEN-LAST:event_botonRCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TITULO;
    private javax.swing.JButton botonRC;
    private javax.swing.JTextField idClienteDRC;
    private javax.swing.JLabel idClienteRC;
    private javax.swing.JTextField idDRC;
    private javax.swing.JLabel idRC;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField saldoDRC;
    private javax.swing.JLabel saldoRC;
    private javax.swing.JComboBox<String> tipoDRC;
    private javax.swing.JLabel tipoRC;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
