package GUI;
import Logica.*;
import GUI.Paneles.*;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuAdmin extends javax.swing.JFrame {
    private Banco banco;
    private Admin admin;
    
    public MenuAdmin(Banco banco, Admin admin) {
        this.banco = banco;
        this.admin = admin;
        initComponents();
        this.setLocationRelativeTo(null);
        SetImageLabel(Logo, "src/GUI/imgs/LogoBanco.png");
    }

    private void mostrarPanel(JPanel p, JPanel PanelLayOut) {
        p.setSize(PanelLayOut.getWidth(), PanelLayOut.getHeight());
        PanelLayOut.removeAll();
        PanelLayOut.add(p, java.awt.BorderLayout.CENTER);
        PanelLayOut.revalidate();
        PanelLayOut.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        tabClientes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        PanelLayOutClientes = new javax.swing.JPanel();
        PanelBotones3 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        btnEliminarCliente = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PanelLayOutEmpleados = new javax.swing.JPanel();
        PanelBotones2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnListarEmpleados = new javax.swing.JButton();
        btnConsultarEmpleado = new javax.swing.JButton();
        btnRegistrarEmpleado = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        PanelLayOutCuentas = new javax.swing.JPanel();
        PanelBotones1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEliminarCuenta = new javax.swing.JButton();
        btnConsultarCuenta = new javax.swing.JButton();
        btnEliminarTitular = new javax.swing.JButton();
        btnAgregarTitular = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        btnRetiro = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnConsultarTransacciones = new javax.swing.JButton();
        btnPagoServicio = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        PanelLayOutTransacciones = new javax.swing.JPanel();
        PanelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblEmpleados5 = new javax.swing.JLabel();
        lblEmpleados6 = new javax.swing.JLabel();
        lblNombreUsuario1 = new javax.swing.JLabel();
        lblEmpleados7 = new javax.swing.JLabel();
        lblDNIUsuario2 = new javax.swing.JLabel();
        lblEmpleados8 = new javax.swing.JLabel();
        lblDNIUsuario3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabClientes.setBackground(new java.awt.Color(255, 255, 255));
        tabClientes.setForeground(new java.awt.Color(50, 50, 50));
        tabClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabClientes.setMaximumSize(new java.awt.Dimension(100, 100));
        tabClientes.setPreferredSize(new java.awt.Dimension(50, 50));

        PanelLayOutClientes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayOutClientesLayout = new javax.swing.GroupLayout(PanelLayOutClientes);
        PanelLayOutClientes.setLayout(PanelLayOutClientesLayout);
        PanelLayOutClientesLayout.setHorizontalGroup(
            PanelLayOutClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelLayOutClientesLayout.setVerticalGroup(
            PanelLayOutClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        PanelBotones3.setBackground(new java.awt.Color(255, 255, 255));

        btnEliminarCliente.setBackground(new java.awt.Color(0, 51, 102));
        btnEliminarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setActionCommand("");
        btnEliminarCliente.setBorder(null);
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnListarClientes.setBackground(new java.awt.Color(0, 51, 102));
        btnListarClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnListarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnListarClientes.setText("Listar");
        btnListarClientes.setActionCommand("");
        btnListarClientes.setBorder(null);
        btnListarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        btnConsultarCliente.setBackground(new java.awt.Color(0, 51, 102));
        btnConsultarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarCliente.setText("Consultar");
        btnConsultarCliente.setActionCommand("");
        btnConsultarCliente.setBorder(null);
        btnConsultarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistrarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Registrar");
        btnRegistrarCliente.setActionCommand("");
        btnRegistrarCliente.setBorder(null);
        btnRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotones3Layout = new javax.swing.GroupLayout(PanelBotones3);
        PanelBotones3.setLayout(PanelBotones3Layout);
        PanelBotones3Layout.setHorizontalGroup(
            PanelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
            .addGroup(PanelBotones3Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotones3Layout.setVerticalGroup(
            PanelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotones3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListarClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelLayOutClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelBotones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelLayOutClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabClientes.addTab("CLIENTES", new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/icon_clientes.png")), jPanel1); // NOI18N

        PanelLayOutEmpleados.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayOutEmpleadosLayout = new javax.swing.GroupLayout(PanelLayOutEmpleados);
        PanelLayOutEmpleados.setLayout(PanelLayOutEmpleadosLayout);
        PanelLayOutEmpleadosLayout.setHorizontalGroup(
            PanelLayOutEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelLayOutEmpleadosLayout.setVerticalGroup(
            PanelLayOutEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        PanelBotones2.setBackground(new java.awt.Color(255, 255, 255));

        btnEliminarEmpleado.setBackground(new java.awt.Color(0, 51, 102));
        btnEliminarEmpleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("Eliminar");
        btnEliminarEmpleado.setActionCommand("");
        btnEliminarEmpleado.setBorder(null);
        btnEliminarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        btnListarEmpleados.setBackground(new java.awt.Color(0, 51, 102));
        btnListarEmpleados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnListarEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnListarEmpleados.setText("Listar");
        btnListarEmpleados.setActionCommand("");
        btnListarEmpleados.setBorder(null);
        btnListarEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmpleadosActionPerformed(evt);
            }
        });

        btnConsultarEmpleado.setBackground(new java.awt.Color(0, 51, 102));
        btnConsultarEmpleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarEmpleado.setText("Consultar");
        btnConsultarEmpleado.setActionCommand("");
        btnConsultarEmpleado.setBorder(null);
        btnConsultarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEmpleadoActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setText("Registrar");
        btnRegistrarEmpleado.setActionCommand("");
        btnRegistrarEmpleado.setBorder(null);
        btnRegistrarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotones2Layout = new javax.swing.GroupLayout(PanelBotones2);
        PanelBotones2.setLayout(PanelBotones2Layout);
        PanelBotones2Layout.setHorizontalGroup(
            PanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
            .addGroup(PanelBotones2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotones2Layout.setVerticalGroup(
            PanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotones2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnListarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelLayOutEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(PanelBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelLayOutEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabClientes.addTab("EMPLEADOS", new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/icon_empleados.png")), jPanel3); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        PanelLayOutCuentas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayOutCuentasLayout = new javax.swing.GroupLayout(PanelLayOutCuentas);
        PanelLayOutCuentas.setLayout(PanelLayOutCuentasLayout);
        PanelLayOutCuentasLayout.setHorizontalGroup(
            PanelLayOutCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        PanelLayOutCuentasLayout.setVerticalGroup(
            PanelLayOutCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        PanelBotones1.setBackground(new java.awt.Color(255, 255, 255));

        btnEliminarCuenta.setBackground(new java.awt.Color(0, 51, 102));
        btnEliminarCuenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuenta.setText("Eliminar");
        btnEliminarCuenta.setActionCommand("");
        btnEliminarCuenta.setBorder(null);
        btnEliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        btnConsultarCuenta.setBackground(new java.awt.Color(0, 51, 102));
        btnConsultarCuenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarCuenta.setText("Consultar");
        btnConsultarCuenta.setActionCommand("");
        btnConsultarCuenta.setBorder(null);
        btnConsultarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCuentaActionPerformed(evt);
            }
        });

        btnEliminarTitular.setBackground(new java.awt.Color(0, 51, 102));
        btnEliminarTitular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminarTitular.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTitular.setText("Eliminar titular");
        btnEliminarTitular.setActionCommand("");
        btnEliminarTitular.setBorder(null);
        btnEliminarTitular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTitularActionPerformed(evt);
            }
        });

        btnAgregarTitular.setBackground(new java.awt.Color(0, 51, 102));
        btnAgregarTitular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregarTitular.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarTitular.setText("Agregar titular");
        btnAgregarTitular.setActionCommand("");
        btnAgregarTitular.setBorder(null);
        btnAgregarTitular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTitularActionPerformed(evt);
            }
        });

        btnCrearCuenta.setBackground(new java.awt.Color(0, 51, 102));
        btnCrearCuenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("Crear");
        btnCrearCuenta.setToolTipText("");
        btnCrearCuenta.setActionCommand("");
        btnCrearCuenta.setBorder(null);
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotones1Layout = new javax.swing.GroupLayout(PanelBotones1);
        PanelBotones1.setLayout(PanelBotones1Layout);
        PanelBotones1Layout.setHorizontalGroup(
            PanelBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotones1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelBotones1Layout.setVerticalGroup(
            PanelBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotones1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnConsultarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTitular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarTitular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLayOutCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBotones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(PanelBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelLayOutCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabClientes.addTab("CUENTAS", new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/icon_cuentas.png")), jPanel4); // NOI18N

        PanelBotones.setBackground(new java.awt.Color(255, 255, 255));

        btnRetiro.setBackground(new java.awt.Color(0, 51, 102));
        btnRetiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRetiro.setForeground(new java.awt.Color(255, 255, 255));
        btnRetiro.setText("Retiro");
        btnRetiro.setActionCommand("");
        btnRetiro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
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
        btnTransferencia.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        btnTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        btnConsultarTransacciones.setBackground(new java.awt.Color(0, 51, 102));
        btnConsultarTransacciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultarTransacciones.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarTransacciones.setText("Transacciones");
        btnConsultarTransacciones.setActionCommand("");
        btnConsultarTransacciones.setBorder(null);
        btnConsultarTransacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTransaccionesActionPerformed(evt);
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
        btnDeposito.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        btnDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeposito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPagoServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelLayOutTransacciones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayOutTransaccionesLayout = new javax.swing.GroupLayout(PanelLayOutTransacciones);
        PanelLayOutTransacciones.setLayout(PanelLayOutTransaccionesLayout);
        PanelLayOutTransaccionesLayout.setHorizontalGroup(
            PanelLayOutTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelLayOutTransaccionesLayout.setVerticalGroup(
            PanelLayOutTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelLayOutTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelLayOutTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabClientes.addTab("TRANSACCIONES", new javax.swing.ImageIcon(getClass().getResource("/GUI/imgs/icon_transacciones.png")), jPanel5); // NOI18N

        PanelSuperior.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido, !");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema Bancario - Usuario administrador");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(160, 160, 160))))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        lblEmpleados5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmpleados5.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados5.setText("Estadísticas del Banco");

        lblEmpleados6.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lblEmpleados6.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados6.setText("Clientes:");

        lblNombreUsuario1.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblNombreUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario1.setText("Nombre:");

        lblEmpleados7.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lblEmpleados7.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados7.setText("Empleados:");

        lblDNIUsuario2.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblDNIUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        lblDNIUsuario2.setText("Nombre:");

        lblEmpleados8.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lblEmpleados8.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados8.setText("Cuentas:");

        lblDNIUsuario3.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lblDNIUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        lblDNIUsuario3.setText("Nombre:");

        jButton2.setBackground(new java.awt.Color(214, 37, 37));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpleados5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEmpleados6)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreUsuario1)
                        .addGap(40, 40, 40)
                        .addComponent(lblEmpleados8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDNIUsuario3)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmpleados7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDNIUsuario2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblEmpleados5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpleados6)
                            .addComponent(lblNombreUsuario1)
                            .addComponent(lblEmpleados8)
                            .addComponent(lblDNIUsuario3)
                            .addComponent(lblEmpleados7)
                            .addComponent(lblDNIUsuario2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        mostrarPanel(new PnlRegistrarCliente(banco), PanelLayOutClientes);
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login login = new Login(banco);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        mostrarPanel(new PnlBuscarCliente(banco), PanelLayOutClientes);
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
        mostrarPanel(new PnlListaClientes(banco), PanelLayOutClientes);
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        mostrarPanel(new PnlEliminarCliente(banco), PanelLayOutClientes);
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        mostrarPanel(new PnlEliminarEmpleado(banco), PanelLayOutEmpleados);
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        mostrarPanel(new PnlRegistrarEmpleado(banco), PanelLayOutEmpleados);
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnConsultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEmpleadoActionPerformed
        mostrarPanel(new PnlBuscarEmpleado(banco), PanelLayOutEmpleados);
    }//GEN-LAST:event_btnConsultarEmpleadoActionPerformed

    private void btnListarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmpleadosActionPerformed
        mostrarPanel(new PnlListaEmpleados(banco), PanelLayOutEmpleados);
    }//GEN-LAST:event_btnListarEmpleadosActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        mostrarPanel(new PnlEliminarCuenta(banco), PanelLayOutCuentas);
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        mostrarPanel(new PnlCrearCuenta(banco), PanelLayOutCuentas);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnConsultarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCuentaActionPerformed
        mostrarPanel(new PnlBuscarCuenta(banco), PanelLayOutCuentas);
    }//GEN-LAST:event_btnConsultarCuentaActionPerformed

    private void btnPagoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoServicioActionPerformed
        mostrarPanel(new PnlPagoServicio(banco), PanelLayOutTransacciones);
    }//GEN-LAST:event_btnPagoServicioActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        mostrarPanel(new PnlDepositar(banco), PanelLayOutTransacciones);
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        mostrarPanel(new PnlRetirar(banco), PanelLayOutTransacciones);
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        mostrarPanel(new PnlTransferir(banco), PanelLayOutTransacciones);
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnConsultarTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTransaccionesActionPerformed
        mostrarPanel(new PnlMostrarTransacciones(banco), PanelLayOutTransacciones);
    }//GEN-LAST:event_btnConsultarTransaccionesActionPerformed

    private void btnAgregarTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTitularActionPerformed
        mostrarPanel(new PnlAgregarTitular(banco), PanelLayOutCuentas);
    }//GEN-LAST:event_btnAgregarTitularActionPerformed

    private void btnEliminarTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTitularActionPerformed
        mostrarPanel(new PnlEliminarTitular(banco), PanelLayOutCuentas);
    }//GEN-LAST:event_btnEliminarTitularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelBotones1;
    private javax.swing.JPanel PanelBotones2;
    private javax.swing.JPanel PanelBotones3;
    private javax.swing.JPanel PanelLayOutClientes;
    private javax.swing.JPanel PanelLayOutCuentas;
    private javax.swing.JPanel PanelLayOutEmpleados;
    private javax.swing.JPanel PanelLayOutTransacciones;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JButton btnAgregarTitular;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarCuenta;
    private javax.swing.JButton btnConsultarEmpleado;
    private javax.swing.JButton btnConsultarTransacciones;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarTitular;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnListarEmpleados;
    private javax.swing.JButton btnPagoServicio;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblDNIUsuario2;
    private javax.swing.JLabel lblDNIUsuario3;
    private javax.swing.JLabel lblEmpleados5;
    private javax.swing.JLabel lblEmpleados6;
    private javax.swing.JLabel lblEmpleados7;
    private javax.swing.JLabel lblEmpleados8;
    private javax.swing.JLabel lblNombreUsuario1;
    private javax.swing.JTabbedPane tabClientes;
    // End of variables declaration//GEN-END:variables

    private void SetImageLabel(JLabel labelName, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
}
