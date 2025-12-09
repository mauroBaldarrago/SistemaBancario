package GUI.Paneles;
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

        jPanel2 = new javax.swing.JPanel();
        TITULO = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        idEmpleadoDBE = new javax.swing.JTextField();
        idEmpleadoBE = new javax.swing.JLabel();
        enviarBE = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nombresBE = new javax.swing.JLabel();
        apellidoBE = new javax.swing.JLabel();
        dniBE = new javax.swing.JLabel();
        cargoMDE = new javax.swing.JLabel();
        nombreMBE = new javax.swing.JLabel();
        apellidosMBE = new javax.swing.JLabel();
        cargoBE = new javax.swing.JLabel();
        dniMBE = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        TITULO.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR EMPLEADO");

        javax.swing.GroupLayout TITULOLayout = new javax.swing.GroupLayout(TITULO);
        TITULO.setLayout(TITULOLayout);
        TITULOLayout.setHorizontalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TITULOLayout.setVerticalGroup(
            TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITULOLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        idEmpleadoBE.setFont(new java.awt.Font("Segoe UI Variable", 3, 16)); // NOI18N
        idEmpleadoBE.setText("ID DEL EMPLEADO:");

        enviarBE.setBackground(new java.awt.Color(204, 204, 204));
        enviarBE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enviarBE.setText("Enviar datos");
        enviarBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBEActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del empleado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        nombresBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        nombresBE.setText("Nombres:");

        apellidoBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        apellidoBE.setText("Apellidos:");

        dniBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        dniBE.setText("DNI:");

        cargoMDE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        nombreMBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        apellidosMBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N

        cargoBE.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
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
                        .addContainerGap(15, Short.MAX_VALUE))
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
                            .addComponent(nombreMBE, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoBE)
                            .addComponent(apellidosMBE, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniMBE, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dniBE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cargoMDE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoBE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(idEmpleadoBE, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idEmpleadoDBE, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(enviarBE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEmpleadoBE)
                    .addComponent(idEmpleadoDBE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviarBE)
                .addGap(12, 12, 12))
        );

        Salir.setBackground(new java.awt.Color(204, 204, 204));
        Salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(120, 120, 120))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        idEmpleadoDBE.setText("");
        limpiarCampos();
    }//GEN-LAST:event_SalirActionPerformed

    private void limpiarCampos() {
        nombreMBE.setText("---");
        apellidosMBE.setText("---");
        dniMBE.setText("---");
        cargoMDE.setText("---");
    }
    
    private void enviarBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBEActionPerformed
        String idBuscado = idEmpleadoDBE.getText().trim();

        if (idBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID de Empleado.");
            return;
        }

        Empleado encontrado = null;
        for (Empleado e : banco.getGestorUsuarios().getEmpleados()) {
            if (e.getIdEmpleado().equalsIgnoreCase(idBuscado)) {
                encontrado = e;
                break;
            }
        }

        if (encontrado != null) {
            nombreMBE.setText(encontrado.getNombre());
            apellidosMBE.setText(encontrado.getApellido());
            dniMBE.setText(encontrado.getDni());
            
            // Nota: cargoMDE parece ser la etiqueta para mostrar el cargo según tu diseño
            cargoMDE.setText(encontrado.getCargo()); 
        } else {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            limpiarCampos();
        }
    }//GEN-LAST:event_enviarBEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
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
