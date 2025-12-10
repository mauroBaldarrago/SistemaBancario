package Logica;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransaccionDAO {

    // DEPOSITO
    public void depositar(int idCuenta, double monto) {
        String insert = "INSERT INTO transaccion(id_cuenta, tipo, monto) VALUES (?, 'DEPOSITO', ?)";
        String update = "UPDATE cuenta SET saldo = saldo + ? WHERE id_cuenta = ?";

        try (Connection con = ConexionBD.getConexion()) {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(insert);
            ps1.setInt(1, idCuenta);
            ps1.setDouble(2, monto);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(update);
            ps2.setDouble(1, monto);
            ps2.setInt(2, idCuenta);
            ps2.executeUpdate();

            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // RETIRO (con validación)
    public boolean retirar(int idCuenta, double monto) {
        CuentaDAO cuentaDAO = new CuentaDAO();
        double saldo = cuentaDAO.obtenerSaldo(idCuenta);

        if (monto > saldo) {
            return false; // NO permite retiro
        }

        String insert = "INSERT INTO transaccion(id_cuenta, tipo, monto) VALUES (?, 'RETIRO', ?)";
        String update = "UPDATE cuenta SET saldo = saldo - ? WHERE id_cuenta = ?";

        try (Connection con = ConexionBD.getConexion()) {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(insert);
            ps1.setInt(1, idCuenta);
            ps1.setDouble(2, monto);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(update);
            ps2.setDouble(1, monto);
            ps2.setInt(2, idCuenta);
            ps2.executeUpdate();

            con.commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // HISTORIAL
    public List<String> listarTransacciones(int idCuenta) {
        List<String> lista = new ArrayList<>();
        String sql = "SELECT tipo, monto, fecha FROM transaccion WHERE id_cuenta = ?";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCuenta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(rs.getString("tipo")
                        + " - " + rs.getDouble("monto")
                        + " - " + rs.getTimestamp("fecha"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
