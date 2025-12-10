package GUI.Paneles;
import Datos.EmpleadoDAO;
import Logica.*;
import javax.swing.JOptionPane;

public class PnlBuscarEmpleado extends javax.swing.JPanel {
    private Banco banco;
    
    public PnlBuscarEmpleado(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        idEmpleadoDBE = new javax.swing.JTextField();
        idEmpleadoBE = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nombresBE = new javax.swing.JLabel();
        apellidoBE = new javax.swing.JLabel();
        dniBE = new javax.swing.JLabel();
        cargoMDE = new javax.swing.JLabel();
        nombreMBE = new javax.swing.JLabel();
        apellidosMBE = new javax.swing.JLabel();
        cargoBE = new javax.swing.JLabel();
        dniMBE = new javax.swing.JLabel();
        enviarBE = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        TITULO.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR EMPLEADO");

        javax.swing.GroupLayout TITULOLayout = new javax.swing.GroupLayout(TITULO);
        TITULO.setLayout(TITULOLayout);
        TITULOLayout.setHorizontalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel3)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        TITULOLayout.setVerticalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        idEmpleadoBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 16)); // NOI18N
        idEmpleadoBE.setForeground(new java.awt.Color(50, 50, 50));
        idEmpleadoBE.setText("ID del empleado:");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del empleado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 102))); // NOI18N
        jPanel4.setToolTipText("");

        nombresBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        nombresBE.setForeground(new java.awt.Color(50, 50, 50));
        nombresBE.setText("Nombres:");

        apellidoBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        apellidoBE.setForeground(new java.awt.Color(50, 50, 50));
        apellidoBE.setText("Apellidos:");

        dniBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        dniBE.setForeground(new java.awt.Color(50, 50, 50));
        dniBE.setText("DNI:");

        cargoMDE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        nombreMBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        apellidosMBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        cargoBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        cargoBE.setForeground(new java.awt.Color(50, 50, 50));
        cargoBE.setText("Cargo:");

        dniMBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nombresBE)
                        .addGap(18, 18, 18)
                        .addComponent(nombreMBE, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniBE)
                            .addComponent(apellidoBE)
                            .addComponent(cargoBE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cargoMDE, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidosMBE, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(dniMBE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombresBE)
                            .addComponent(nombreMBE, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoBE)
                            .addComponent(apellidosMBE, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniMBE, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dniBE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cargoMDE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoBE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        enviarBE.setBackground(new java.awt.Color(0, 51, 102));
        enviarBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enviarBE.setForeground(new java.awt.Color(255, 255, 255));
        enviarBE.setText("Enviar datos");
        enviarBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(idEmpleadoBE, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idEmpleadoDBE, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enviarBE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEmpleadoBE)
                    .addComponent(idEmpleadoDBE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarBE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos() {
        nombreMBE.setText("---");
        apellidosMBE.setText("---");
        dniMBE.setText("---");
        cargoMDE.setText("---");
    }
    
    private void enviarBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBEActionPerformed
        String idBuscado = idEmpleadoDBE.getText().trim();
        if (idBuscado.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor ingrese un ID de Empleado.");
            return;
        }

        EmpleadoDAO dao = new EmpleadoDAO();
        Empleado encontrado = dao.buscarEmpleado(idBuscado);

        if (encontrado != null) {
            nombreMBE.setText(encontrado.getNombre());
            apellidosMBE.setText(encontrado.getApellido());
            dniMBE.setText(encontrado.getDni());
            if (cargoMDE != null) cargoMDE.setText(encontrado.getCargo());

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Empleado no encontrado en la Base de Datos.");
            limpiarCampos();
        }
    }//GEN-LAST:event_enviarBEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TITULO;
    private javax.swing.JLabel apellidoBE;
    private javax.swing.JLabel apellidosMBE;
    private javax.swing.JLabel cargoBE;
    private javax.swing.JLabel cargoMDE;
    private javax.swing.JLabel dniBE;
    private javax.swing.JLabel dniMBE;
    private javax.swing.JButton enviarBE;
    private javax.swing.JLabel idEmpleadoBE;
    private javax.swing.JTextField idEmpleadoDBE;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nombreMBE;
    private javax.swing.JLabel nombresBE;
    // End of variables declaration//GEN-END:variables
}
