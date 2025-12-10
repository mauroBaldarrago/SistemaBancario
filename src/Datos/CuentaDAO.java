package Datos;
import java.sql.*;
import java.util.ArrayList;

public class CuentaDAO {
    public boolean crearCuenta(String idCuenta, String tipo) {
        String sql = "INSERT INTO cuenta(id_cuenta, tipo, saldo) VALUES (?, ?, 0)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idCuenta);
            ps.setString(2, tipo);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al crear cuenta: " + e.getMessage());
            return false;
        }
    }

    public boolean agregarTitular(String idCuenta, String idCliente) {
        String sql = "INSERT INTO titular(id_cuenta, id_cliente) VALUES (?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idCuenta);
            ps.setString(2, idCliente);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar titular: " + e.getMessage());
            return false;
        }
    }
    
    public double obtenerSaldo(String idCuenta) {
        String sql = "SELECT saldo FROM cuenta WHERE id_cuenta = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idCuenta);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) return rs.getDouble("saldo");
        } catch (Exception e) {}
        return 0.0;
    }
}