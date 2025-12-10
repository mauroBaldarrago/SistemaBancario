package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TransaccionDAO {
    
    public ArrayList<String[]> listarTransacciones(String idCuenta) {
    ArrayList<String[]> historial = new ArrayList<>();
    
    // Ordenamos por fecha descendente (lo más reciente primero)
    String sql = "SELECT * FROM transaccion WHERE id_cuenta = ? ORDER BY fecha DESC";

    try (Connection con = ConexionBD.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, idCuenta);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String tipo = rs.getString("tipo");
            String detalle = "---";
            
            if ("TRANSFERENCIA".equalsIgnoreCase(tipo)) {
                String destino = rs.getString("cuenta_destino");
                detalle = (destino != null) ? "A cuenta: " + destino : "---";
            } 
            else if ("PAGO_SERVICIO".equalsIgnoreCase(tipo)) {
                String servicio = rs.getString("nombre_servicio");
                detalle = (servicio != null) ? "Servicio: " + servicio : "---";
            }

            String[] fila = {
                rs.getString("id_transaccion"),   
                rs.getString("fecha"),            
                tipo,                              
                "S/. " + rs.getDouble("monto"),    
                detalle                           
            };
            
            historial.add(fila);
        }

    } catch (Exception e) {
        System.out.println("Error al listar transacciones: " + e.getMessage());
    }
    return historial;
}
    
    private boolean verificarSaldoSuficiente(String idCuenta, double monto) {
        String sql = "SELECT saldo FROM cuenta WHERE id_cuenta = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, idCuenta);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                double saldoActual = rs.getDouble("saldo");
                return saldoActual >= monto;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }

    public boolean depositar(String idTransaccion, String idCuenta, double monto) {
        String sqlInsert = "INSERT INTO transaccion(id_transaccion, id_cuenta, tipo, monto) VALUES (?, ?, 'DEPOSITO', ?)";
        String sqlUpdate = "UPDATE cuenta SET saldo = saldo + ? WHERE id_cuenta = ?";

        Connection con = null;
        try {
            con = ConexionBD.getConexion();
            con.setAutoCommit(false); 

            try (PreparedStatement ps1 = con.prepareStatement(sqlInsert)) {
                ps1.setString(1, idTransaccion); 
                ps1.setString(2, idCuenta);
                ps1.setDouble(3, monto);
                ps1.executeUpdate();
            }

            try (PreparedStatement ps2 = con.prepareStatement(sqlUpdate)) {
                ps2.setDouble(1, monto);
                ps2.setString(2, idCuenta);
                if (ps2.executeUpdate() == 0) {
                    throw new SQLException("La cuenta no existe.");
                }
            }

            con.commit(); 
            return true;

        } catch (SQLException e) {
            System.out.println("Error en Depósito: " + e.getMessage());
            try { if (con != null) con.rollback(); } catch (SQLException ex) {} // Deshacer si falló
            return false;
        } finally {
            try { if (con != null) con.setAutoCommit(true); } catch (SQLException ex) {}
        }
    }

    public boolean retirar(String idTransaccion, String idCuenta, double monto) {
        // Primero verificamos si tiene plata
        if (!verificarSaldoSuficiente(idCuenta, monto)) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        String sqlInsert = "INSERT INTO transaccion(id_transaccion, id_cuenta, tipo, monto) VALUES (?, ?, 'RETIRO', ?)";
        String sqlUpdate = "UPDATE cuenta SET saldo = saldo - ? WHERE id_cuenta = ?";

        Connection con = null;
        try {
            con = ConexionBD.getConexion();
            con.setAutoCommit(false);

            try (PreparedStatement ps1 = con.prepareStatement(sqlInsert)) {
                ps1.setString(1, idTransaccion);
                ps1.setString(2, idCuenta);
                ps1.setDouble(3, monto);
                ps1.executeUpdate();
            }

            try (PreparedStatement ps2 = con.prepareStatement(sqlUpdate)) {
                ps2.setDouble(1, monto);
                ps2.setString(2, idCuenta);
                ps2.executeUpdate();
            }

            con.commit();
            return true;

        } catch (SQLException e) {
            System.out.println("Error en Retiro: " + e.getMessage());
            try { if (con != null) con.rollback(); } catch (SQLException ex) {}
            return false;
        } finally {
            try { if (con != null) con.setAutoCommit(true); } catch (SQLException ex) {}
        }
    }

    public boolean transferir(String idTransaccion, String cuentaOrigen, String cuentaDestino, double monto) {
        if (!verificarSaldoSuficiente(cuentaOrigen, monto)) return false;

        String sqlResta = "UPDATE cuenta SET saldo = saldo - ? WHERE id_cuenta = ?";
        String sqlSuma  = "UPDATE cuenta SET saldo = saldo + ? WHERE id_cuenta = ?";
        String sqlHist  = "INSERT INTO transaccion(id_transaccion, id_cuenta, tipo, monto, cuenta_destino) VALUES (?, ?, 'TRANSFERENCIA', ?, ?)";

        Connection con = null;
        try {
            con = ConexionBD.getConexion();
            con.setAutoCommit(false);

            try (PreparedStatement ps1 = con.prepareStatement(sqlResta)) {
                ps1.setDouble(1, monto);
                ps1.setString(2, cuentaOrigen);
                if (ps1.executeUpdate() == 0) throw new SQLException("Cuenta origen no existe.");
            }

            try (PreparedStatement ps2 = con.prepareStatement(sqlSuma)) {
                ps2.setDouble(1, monto);
                ps2.setString(2, cuentaDestino);
                if (ps2.executeUpdate() == 0) throw new SQLException("Cuenta destino no existe.");
            }

            try (PreparedStatement ps3 = con.prepareStatement(sqlHist)) {
                ps3.setString(1, idTransaccion);
                ps3.setString(2, cuentaOrigen);
                ps3.setDouble(3, monto);
                ps3.setString(4, cuentaDestino); 
                ps3.executeUpdate();
            }

            con.commit();
            return true;

        } catch (SQLException e) {
            System.out.println("Error en Transferencia: " + e.getMessage());
            try { if (con != null) con.rollback(); } catch (SQLException ex) {}
            return false;
        } finally {
            try { if (con != null) con.setAutoCommit(true); } catch (SQLException ex) {}
        }
    }

    public boolean pagarServicio(String idTransaccion, String idCuenta, String nombreServicio, double monto) {
        if (!verificarSaldoSuficiente(idCuenta, monto)) return false;

        String sqlUpdate = "UPDATE cuenta SET saldo = saldo - ? WHERE id_cuenta = ?";
        String sqlInsert = "INSERT INTO transaccion(id_transaccion, id_cuenta, tipo, monto, nombre_servicio) VALUES (?, ?, 'PAGO_SERVICIO', ?, ?)";

        Connection con = null;
        try {
            con = ConexionBD.getConexion();
            con.setAutoCommit(false);

            try (PreparedStatement ps1 = con.prepareStatement(sqlUpdate)) {
                ps1.setDouble(1, monto);
                ps1.setString(2, idCuenta);
                if (ps1.executeUpdate() == 0) throw new SQLException("Cuenta no existe.");
            }

            try (PreparedStatement ps2 = con.prepareStatement(sqlInsert)) {
                ps2.setString(1, idTransaccion);
                ps2.setString(2, idCuenta);
                ps2.setDouble(3, monto);
                ps2.setString(4, nombreServicio); 
                ps2.executeUpdate();
            }

            con.commit();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Pago Servicio: " + e.getMessage());
            try { if (con != null) con.rollback(); } catch (SQLException ex) {}
            return false;
        } finally {
            try { if (con != null) con.setAutoCommit(true); } catch (SQLException ex) {}
        }
    } 
}