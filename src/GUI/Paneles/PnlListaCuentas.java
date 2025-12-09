package GUI.Paneles;
import Logica.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PnlListaCuentas extends javax.swing.JPanel {
    private Banco banco;
    private DefaultTableModel modelo;
    public PnlListaCuentas(Banco banco) {
        initComponents();
        this.banco = banco;
        configurarTabla();
        llenarTabla();
    }
    private void configurarTabla() {
        // Definimos las columnas que queremos ver
        String[] columnas = {"ID Cuenta", "Tipo", "Saldo", "Titulares"};
        
        // Inicializamos el modelo (la estructura de datos de la tabla)
        modelo = new DefaultTableModel(null, columnas) {
            // Esto hace que las celdas no sean editables al hacer doble clic
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1.setModel(modelo);
    }
    
    public void llenarTabla() {
        // Limpiar la tabla antes de llenar (para no duplicar si actualizas)
        modelo.setRowCount(0);
        
        // Obtener la lista de cuentas del banco
        ArrayList<Cuenta> listaCuentas = banco.getCuentas();
        
        // Recorrer y llenar
        for (Cuenta c : listaCuentas) {
            
            // TRUCO: Convertir la lista de titulares a un String bonito
            StringBuilder titularesTexto = new StringBuilder();
            for (Cliente titular : c.getTitulares()) {
                if (titularesTexto.length() > 0) {
                    titularesTexto.append(", "); // Separador
                }
                titularesTexto.append(titular.getNombre()).append(" ").append(titular.getApellido());
            }
            
            // Crear la fila
            Object[] fila = {
                c.getIdCuenta(),
                c.getTipo(),         // Ahorro, Corriente, etc.
                "S/. " + c.consultarSaldo(),
                titularesTexto.toString() // La lista convertida a texto
            };
            
            // Añadir al modelo
            modelo.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LISTADO DE CUENTAS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
