package GUI;
import Logica.*;
import GUI.Paneles.*; 
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class MenuEmpleado extends javax.swing.JFrame {
    private Banco banco;
    private Empleado empleado;

    public MenuEmpleado(Banco banco, Empleado empleado) {
        this.banco = banco;
        this.empleado = empleado;
        initComponents();
        this.setLocationRelativeTo(null);
        
        // Configurar logo
        SetImageLabel(Logo, "src/GUI/imgs/LogoBanco.png");
        
        // Mostrar datos del empleado en los Labels
        // (Verifica que estos nombres coincidan con tu diseño, a veces son lblNombreUsuario, lblDNIUsuario, etc.)
        if (lblDNIUsuario != null) lblDNIUsuario.setText("Empleado: " + empleado.getNombre());
        if (lblDNIUsuario1 != null) lblDNIUsuario1.setText("Cargo: " + empleado.getCargo());
    }

    private void mostrarPanel(JPanel p) {
        p.setSize(PanelDerecho.getWidth(), PanelDerecho.getHeight());
        p.setLocation(0, 0);
        
        PanelDerecho.removeAll();
        PanelDerecho.add(p, BorderLayout.CENTER);
        PanelDerecho.revalidate();
        PanelDerecho.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        PanelIzquierdo = new javax.swing.JPanel();
        btnRegistrarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnConsultarCliente = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEliminarCuenta = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        btnAgregarTitular = new javax.swing.JButton();
        btnConsultarCuenta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnPagoServicio = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnConsultarTransacciones = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        btnEliminarTitular = new javax.swing.JButton();
        PanelDerecho = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblEmpleados1 = new javax.swing.JLabel();
        lblEmpleados2 = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblEmpleados3 = new javax.swing.JLabel();
        lblDNIUsuario = new javax.swing.JLabel();
        lblEmpleados4 = new javax.swing.JLabel();
        lblDNIUsuario1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelSuperior.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido, empleado [NOMBRE]");

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SISTEMA BANCARIO - EMPLEADO");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        PanelIzquierdo.setBackground(new java.awt.Color(153, 153, 153));

        btnRegistrarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarCliente.setText("- Registrar");
        btnRegistrarCliente.setActionCommand("");
        btnRegistrarCliente.setBorder(null);
        btnRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIENTES");

        btnConsultarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultarCliente.setText("- Consultar");
        btnConsultarCliente.setActionCommand("");
        btnConsultarCliente.setBorder(null);
        btnConsultarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        btnListarClientes.setBackground(new java.awt.Color(204, 204, 204));
        btnListarClientes.setText("- Listar");
        btnListarClientes.setActionCommand("");
        btnListarClientes.setBorder(null);
        btnListarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarCliente.setText("- Eliminar");
        btnEliminarCliente.setActionCommand("");
        btnEliminarCliente.setBorder(null);
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TRANSACCIONES");
        jLabel4.setToolTipText("");

        btnEliminarCuenta.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarCuenta.setText("- Eliminar");
        btnEliminarCuenta.setActionCommand("");
        btnEliminarCuenta.setBorder(null);
        btnEliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        btnCrearCuenta.setBackground(new java.awt.Color(204, 204, 204));
        btnCrearCuenta.setText("- Crear");
        btnCrearCuenta.setActionCommand("");
        btnCrearCuenta.setBorder(null);
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnAgregarTitular.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarTitular.setText("- Agregar titular");
        btnAgregarTitular.setActionCommand("");
        btnAgregarTitular.setBorder(null);
        btnAgregarTitular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTitularActionPerformed(evt);
            }
        });

        btnConsultarCuenta.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultarCuenta.setText("- Consultar");
        btnConsultarCuenta.setActionCommand("");
        btnConsultarCuenta.setBorder(null);
        btnConsultarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCuentaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CUENTAS");
        jLabel5.setToolTipText("");

        btnPagoServicio.setBackground(new java.awt.Color(204, 204, 204));
        btnPagoServicio.setText("- Servicios");
        btnPagoServicio.setActionCommand("");
        btnPagoServicio.setBorder(null);
        btnPagoServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoServicioActionPerformed(evt);
            }
        });

        btnDeposito.setBackground(new java.awt.Color(204, 204, 204));
        btnDeposito.setText("- Depósito");
        btnDeposito.setActionCommand("");
        btnDeposito.setBorder(null);
        btnDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnRetiro.setBackground(new java.awt.Color(204, 204, 204));
        btnRetiro.setText("- Retiro");
        btnRetiro.setActionCommand("");
        btnRetiro.setBorder(null);
        btnRetiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        btnTransferencia.setBackground(new java.awt.Color(204, 204, 204));
        btnTransferencia.setText("- Transferencia");
        btnTransferencia.setActionCommand("");
        btnTransferencia.setBorder(null);
        btnTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        btnConsultarTransacciones.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultarTransacciones.setText("- Transacciones");
        btnConsultarTransacciones.setActionCommand("");
        btnConsultarTransacciones.setBorder(null);
        btnConsultarTransacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTransaccionesActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cerrar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEliminarTitular.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTitular.setText("- Eliminar titular");
        btnEliminarTitular.setActionCommand("");
        btnEliminarTitular.setBorder(null);
        btnEliminarTitular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTitularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelIzquierdoLayout = new javax.swing.GroupLayout(PanelIzquierdo);
        PanelIzquierdo.setLayout(PanelIzquierdoLayout);
        PanelIzquierdoLayout.setHorizontalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdoLayout.createSequentialGroup()
                                .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdoLayout.createSequentialGroup()
                                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))))
                    .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdoLayout.createSequentialGroup()
                                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                            .addComponent(btnConsultarTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(btnAgregarTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelIzquierdoLayout.setVerticalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDerecho.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDerechoLayout = new javax.swing.GroupLayout(PanelDerecho);
        PanelDerecho.setLayout(PanelDerechoLayout);
        PanelDerechoLayout.setHorizontalGroup(
            PanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        PanelDerechoLayout.setVerticalGroup(
            PanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblEmpleados1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        lblEmpleados1.setText("DATOS DEL USUARIO");

        lblEmpleados2.setFont(new java.awt.Font("Segoe UI Variable", 2, 14)); // NOI18N
        lblEmpleados2.setText("Nombre:");

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblNombreUsuario.setText("Nombre:");

        lblEmpleados3.setFont(new java.awt.Font("Segoe UI Variable", 2, 14)); // NOI18N
        lblEmpleados3.setText("DNI:");

        lblDNIUsuario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblDNIUsuario.setText("Nombre:");

        lblEmpleados4.setFont(new java.awt.Font("Segoe UI Variable", 2, 14)); // NOI18N
        lblEmpleados4.setText("Correo:");

        lblDNIUsuario1.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblDNIUsuario1.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmpleados4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDNIUsuario1))
                            .addComponent(lblEmpleados1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmpleados2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombreUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmpleados3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDNIUsuario)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpleados1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpleados2)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblEmpleados3)
                    .addComponent(lblDNIUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpleados4)
                    .addComponent(lblDNIUsuario1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        mostrarPanel(new PnlRegistrarCliente(banco));
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login login = new Login(banco);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        mostrarPanel(new PnlBuscarCliente(banco));
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
        mostrarPanel(new PnlListaClientes(banco));
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        mostrarPanel(new PnlEliminarCliente(banco));
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        mostrarPanel(new PnlEliminarCuenta(banco));
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        mostrarPanel(new PnlCrearCuenta(banco));
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnAgregarTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTitularActionPerformed
        mostrarPanel(new PnlAgregarTitular(banco));
    }//GEN-LAST:event_btnAgregarTitularActionPerformed

    private void btnConsultarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCuentaActionPerformed
        mostrarPanel(new PnlBuscarCuenta(banco));
    }//GEN-LAST:event_btnConsultarCuentaActionPerformed

    private void btnPagoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoServicioActionPerformed
        mostrarPanel(new PnlAgregarTitular(banco));
    }//GEN-LAST:event_btnPagoServicioActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        mostrarPanel(new PnlAgregarTitular(banco));
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        mostrarPanel(new PnlAgregarTitular(banco));
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        mostrarPanel(new PnlAgregarTitular(banco));
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnConsultarTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTransaccionesActionPerformed
        mostrarPanel(new PnlMostrarTransacciones(banco));
    }//GEN-LAST:event_btnConsultarTransaccionesActionPerformed

    private void btnEliminarTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTitularActionPerformed
        mostrarPanel(new PnlEliminarTitular(banco));
    }//GEN-LAST:event_btnEliminarTitularActionPerformed

    private void SetImageLabel(JLabel labelName, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelDerecho;
    private javax.swing.JPanel PanelIzquierdo;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JButton btnAgregarTitular;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarCuenta;
    private javax.swing.JButton btnConsultarTransacciones;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnEliminarTitular;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnPagoServicio;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDNIUsuario;
    private javax.swing.JLabel lblDNIUsuario1;
    private javax.swing.JLabel lblEmpleados1;
    private javax.swing.JLabel lblEmpleados2;
    private javax.swing.JLabel lblEmpleados3;
    private javax.swing.JLabel lblEmpleados4;
    private javax.swing.JLabel lblNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
