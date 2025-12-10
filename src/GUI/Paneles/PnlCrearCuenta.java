package GUI.Paneles;
import Logica.*;
import Datos.CuentaDAO;
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
        jPanel1 = new javax.swing.JPanel();
        botonRC = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();
        idRC = new javax.swing.JLabel();
        saldoRC = new javax.swing.JLabel();
        idClienteRC = new javax.swing.JLabel();
        tipoRC = new javax.swing.JLabel();
        idDRC = new javax.swing.JTextField();
        saldoDRC = new javax.swing.JTextField();
        idClienteDRC = new javax.swing.JTextField();
        tipoDRC = new javax.swing.JComboBox<>();

        TITULO.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRAR CUENTA");

        javax.swing.GroupLayout TITULOLayout = new javax.swing.GroupLayout(TITULO);
        TITULO.setLayout(TITULOLayout);
        TITULOLayout.setHorizontalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TITULOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(255, 255, 255))
        );
        TITULOLayout.setVerticalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botonRC.setBackground(new java.awt.Color(0, 51, 102));
        botonRC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonRC.setForeground(new java.awt.Color(255, 255, 255));
        botonRC.setText("Enviar datos");
        botonRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRCActionPerformed(evt);
            }
        });

        titulo2.setFont(new java.awt.Font("Segoe UI Variable", 1, 16)); // NOI18N
        titulo2.setForeground(new java.awt.Color(50, 50, 50));
        titulo2.setText("Datos de la cuenta a registrar:");

        idRC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        idRC.setForeground(new java.awt.Color(50, 50, 50));
        idRC.setText("ID:");

        saldoRC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        saldoRC.setForeground(new java.awt.Color(50, 50, 50));
        saldoRC.setText("Saldo inicial:");

        idClienteRC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        idClienteRC.setForeground(new java.awt.Color(50, 50, 50));
        idClienteRC.setText("ID del Cliente titular:");

        tipoRC.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        tipoRC.setForeground(new java.awt.Color(50, 50, 50));
        tipoRC.setText("Tipo de cuenta:");

        idDRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        saldoDRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        idClienteDRC.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        tipoDRC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorro", "Corriente" }));
        tipoDRC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        tipoDRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDRCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(idRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idDRC, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idClienteRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idClienteDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tipoRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saldoRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saldoDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(titulo2))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(botonRC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(titulo2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoRC)
                    .addComponent(saldoDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idRC)
                    .addComponent(idDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idClienteRC)
                            .addComponent(idClienteDRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoRC)
                            .addComponent(tipoDRC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(botonRC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tipoDRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDRCActionPerformed

    private void botonRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRCActionPerformed
        String idCuenta = idDRC.getText();         
        String idCliente = idClienteDRC.getText(); 
        String tipo = tipoDRC.getSelectedItem().toString(); 
        double saldoInicial = Double.parseDouble(saldoDRC.getText()); 

        CuentaDAO dao = new CuentaDAO();

        if (dao.crearCuenta(idCuenta, tipo, saldoInicial)) {
            if (dao.agregarTitular(idCuenta, idCliente)) {
                JOptionPane.showMessageDialog(this, "Cuenta creada y titular asignado correctamente.");
                idDRC.setText("");
                idClienteDRC.setText("");
                saldoDRC.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Cuenta creada, PERO el cliente ID no existe.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error: El ID de cuenta ya existe.");
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField saldoDRC;
    private javax.swing.JLabel saldoRC;
    private javax.swing.JComboBox<String> tipoDRC;
    private javax.swing.JLabel tipoRC;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
