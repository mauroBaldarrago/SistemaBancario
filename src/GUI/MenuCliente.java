package GUI;
import Logica.*;
import GUI.Paneles.*;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MenuCliente extends javax.swing.JFrame {
    private Banco banco;
    private Cliente cliente;
    
    public MenuCliente(Banco banco, Cliente cliente) {
        this.banco = banco;
        this.cliente = cliente;
        initComponents();
        this.setLocationRelativeTo(null);
        
        // Configurar logo
        SetImageLabel(Logo, "src/GUI/imgs/LogoBanco.png");
        
        if (lblNombreUsuario != null) lblNombreUsuario.setText(cliente.getNombre() + " " + cliente.getApellido());
        if (lblDNIUsuario != null) lblDNIUsuario.setText(cliente.getDni());
        if (lblCorreoUsuario != null) lblCorreoUsuario.setText(cliente.getCorreo());
        if (lblBienvenidoCliente != null) lblBienvenidoCliente.setText("¡Bienvenido, cliente " + cliente.getNombre() + " " + cliente.getApellido() + "!");
        
        actualizarSaldo();
    }

    private void mostrarPanel(JPanel p) {
        // Asumiendo que tu panel blanco grande se llama "PanelDerecho"
        p.setSize(PanelLayOut.getWidth(), PanelLayOut.getHeight());
        p.setLocation(0, 0);
        
        PanelLayOut.removeAll();
        PanelLayOut.add(p, BorderLayout.CENTER);
        PanelLayOut.revalidate();
        PanelLayOut.repaint();
    }
    
    public void actualizarSaldo() {
        double saldoTotal = 0;
        boolean tieneCuentas = false;

        for (Cuenta c : banco.getCuentas()) {
            for (Cliente titular : c.getTitulares()) {
                if (titular.getIdCliente().equals(cliente.getIdCliente())) {
                    saldoTotal += c.consultarSaldo();
                    tieneCuentas = true;
                }
            }
        }

        if (tieneCuentas) {
            lbLSaldo.setText(String.format("%.2f", saldoTotal));
        } else {
            lbLSaldo.setText("0.00");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSuperior = new javax.swing.JPanel();
        lblBienvenidoCliente = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelIzquierdo = new javax.swing.JPanel();
        btnMostrarTransacciones = new javax.swing.JButton();
        btnPagoServicio = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblEmpleados1 = new javax.swing.JLabel();
        lblEmpleados2 = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblEmpleados3 = new javax.swing.JLabel();
        lblDNIUsuario = new javax.swing.JLabel();
        lblEmpleados4 = new javax.swing.JLabel();
        lblCorreoUsuario = new javax.swing.JLabel();
        lblDNIUsuario2 = new javax.swing.JLabel();
        lbLSaldo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        PanelLayOut = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        PanelSuperior.setBackground(new java.awt.Color(0, 51, 102));

        lblBienvenidoCliente.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        lblBienvenidoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenidoCliente.setText("Bienvenido, cliente [NOMBRE]");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema Bancario - Usuario Cliente");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenidoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBienvenidoCliente)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        PanelIzquierdo.setBackground(new java.awt.Color(255, 255, 255));

        btnMostrarTransacciones.setBackground(new java.awt.Color(0, 51, 102));
        btnMostrarTransacciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMostrarTransacciones.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarTransacciones.setText("Mostrar transacciones");
        btnMostrarTransacciones.setActionCommand("");
        btnMostrarTransacciones.setBorder(null);
        btnMostrarTransacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTransaccionesActionPerformed(evt);
            }
        });

        btnPagoServicio.setBackground(new java.awt.Color(0, 51, 102));
        btnPagoServicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPagoServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnPagoServicio.setText("Servicios");
        btnPagoServicio.setActionCommand("");
        btnPagoServicio.setBorder(null);
        btnPagoServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoServicioActionPerformed(evt);
            }
        });

        btnDeposito.setBackground(new java.awt.Color(0, 51, 102));
        btnDeposito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposito.setText("Depósito");
        btnDeposito.setActionCommand("");
        btnDeposito.setBorder(null);
        btnDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnRetiro.setBackground(new java.awt.Color(0, 51, 102));
        btnRetiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetiro.setForeground(new java.awt.Color(255, 255, 255));
        btnRetiro.setText("Retiro");
        btnRetiro.setActionCommand("");
        btnRetiro.setBorder(null);
        btnRetiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        btnTransferencia.setBackground(new java.awt.Color(0, 51, 102));
        btnTransferencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferencia.setText("Transferencia");
        btnTransferencia.setActionCommand("");
        btnTransferencia.setBorder(null);
        btnTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout PanelIzquierdoLayout = new javax.swing.GroupLayout(PanelIzquierdo);
        PanelIzquierdo.setLayout(PanelIzquierdoLayout);
        PanelIzquierdoLayout.setHorizontalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addComponent(jSeparator1)
        );
        PanelIzquierdoLayout.setVerticalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarTransacciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        lblEmpleados1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmpleados1.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados1.setText("DATOS DEL USUARIO");

        lblEmpleados2.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lblEmpleados2.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados2.setText("Nombre:");

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("Nombre:");

        lblEmpleados3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lblEmpleados3.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados3.setText("DNI:");

        lblDNIUsuario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblDNIUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblDNIUsuario.setText("Nombre:");

        lblEmpleados4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lblEmpleados4.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados4.setText("Correo:");

        lblCorreoUsuario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblCorreoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoUsuario.setText("Nombre:");

        lblDNIUsuario2.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lblDNIUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        lblDNIUsuario2.setText("S/.");

        lbLSaldo.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        lbLSaldo.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmpleados1)
                        .addContainerGap(495, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmpleados2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNombreUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmpleados4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCorreoUsuario)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDNIUsuario2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbLSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmpleados3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDNIUsuario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpleados1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpleados2)
                            .addComponent(lblNombreUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpleados4)
                            .addComponent(lblCorreoUsuario)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmpleados3)
                        .addComponent(lblDNIUsuario)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDNIUsuario2)
                            .addComponent(lbLSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelLayOut.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayOutLayout = new javax.swing.GroupLayout(PanelLayOut);
        PanelLayOut.setLayout(PanelLayOutLayout);
        PanelLayOutLayout.setHorizontalGroup(
            PanelLayOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        PanelLayOutLayout.setVerticalGroup(
            PanelLayOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelLayOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelLayOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTransaccionesActionPerformed
        PnlMostrarTransacciones panel = new PnlMostrarTransacciones(banco);
        mostrarPanel(panel);
    }//GEN-LAST:event_btnMostrarTransaccionesActionPerformed

    private void btnPagoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoServicioActionPerformed
        PnlPagoServicio panel = new PnlPagoServicio(banco);
        mostrarPanel(panel);
    }//GEN-LAST:event_btnPagoServicioActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        PnlDepositar panel = new PnlDepositar(banco);
        mostrarPanel(panel);
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        PnlRetirar panel = new PnlRetirar(banco);
        mostrarPanel(panel);
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        PnlTransferir panel = new PnlTransferir(banco);
        mostrarPanel(panel);
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login login = new Login(banco);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SetImageLabel(JLabel labelName, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelIzquierdo;
    private javax.swing.JPanel PanelLayOut;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnMostrarTransacciones;
    private javax.swing.JButton btnPagoServicio;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbLSaldo;
    private javax.swing.JLabel lblBienvenidoCliente;
    private javax.swing.JLabel lblCorreoUsuario;
    private javax.swing.JLabel lblDNIUsuario;
    private javax.swing.JLabel lblDNIUsuario2;
    private javax.swing.JLabel lblEmpleados1;
    private javax.swing.JLabel lblEmpleados2;
    private javax.swing.JLabel lblEmpleados3;
    private javax.swing.JLabel lblEmpleados4;
    private javax.swing.JLabel lblNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
