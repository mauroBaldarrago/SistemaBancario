package Datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CuentaDAO {

    public void crearCuenta(int idCliente) {
        String sql = "INSERT INTO cuenta(id_cliente, saldo) VALUES (?, 0)";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCliente);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> listarCuentas() {
        List<String> lista = new ArrayList<>();
        String sql = "SELECT id_cuenta, saldo FROM cuenta";

        try (Connection con = ConexionBD.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add("Cuenta " + rs.getInt("id_cuenta")
                        + " - Saldo: " + rs.getDouble("saldo"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public double obtenerSaldo(int idCuenta) {
        String sql = "SELECT saldo FROM cuenta WHERE id_cuenta = ?";
        double saldo = 0;

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCuenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) saldo = rs.getDouble("saldo");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return saldo;
    }
}
