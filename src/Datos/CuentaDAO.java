package Datos;
import Logica.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CuentaDAO {
    public boolean crearCuenta(String idCuenta, String tipo, double saldoInicial) {
        String sql = "INSERT INTO cuenta(id_cuenta, tipo, saldo) VALUES (?, ?, ?)";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, idCuenta);
            ps.setString(2, tipo);         
            ps.setDouble(3, saldoInicial); 
            
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
            System.out.println("Error al asignar titular (Posible duplicado o datos no existen): " + e.getMessage());
            return false;
        }
    }

    public double obtenerSaldo(String idCuenta) {
        String sql = "SELECT saldo FROM cuenta WHERE id_cuenta = ?";
        
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, idCuenta);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getDouble("saldo");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0.0; 
    }

    public ArrayList<String> listarCuentas() {
        ArrayList<String> lista = new ArrayList<>();
        String sql = "SELECT c.id_cuenta, c.tipo, c.saldo, cli.nombre, cli.apellido " +
                     "FROM cuenta c " +
                     "JOIN titular t ON c.id_cuenta = t.id_cuenta " +
                     "JOIN cliente cli ON t.id_cliente = cli.id_cliente " +
                     "ORDER BY c.id_cuenta";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String info = rs.getString("id_cuenta") + " - " +
                              rs.getString("tipo") + " - S/. " +
                              rs.getDouble("saldo") + " (" +
                              rs.getString("nombre") + " " + rs.getString("apellido") + ")";
                lista.add(info);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public Cuenta buscarCuenta(String idCuenta) {
        Cuenta cuentaEncontrada = null;
        String sqlCuenta = "SELECT * FROM cuenta WHERE id_cuenta = ?";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sqlCuenta)) {

            ps.setString(1, idCuenta);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cuentaEncontrada = new Cuenta(
                    rs.getString("id_cuenta"),
                    rs.getString("tipo"),
                    rs.getDouble("saldo"),
                    new ArrayList<>() 
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar cuenta: " + e.getMessage());
            return null; 
        }

        if (cuentaEncontrada != null) {
            String sqlTitulares = "SELECT c.* FROM cliente c " +
                                  "JOIN titular t ON c.id_cliente = t.id_cliente " +
                                  "WHERE t.id_cuenta = ?";

            try (Connection con = ConexionBD.getConexion();
                 PreparedStatement ps = con.prepareStatement(sqlTitulares)) {

                ps.setString(1, idCuenta);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Cliente titular = new Cliente(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni"),
                        rs.getString("direccion"),
                        rs.getString("celular"),
                        rs.getString("id_cliente"),
                        rs.getString("correo"),
                        rs.getString("contrasena")
                    );
                    cuentaEncontrada.getTitulares().add(titular);
                }
            } catch (SQLException e) {
                System.out.println("Error al buscar titulares: " + e.getMessage());
            }
        }
        return cuentaEncontrada;
    }
    
    public boolean eliminarCuenta(String idCuenta) {
        String sqlTransacciones = "DELETE FROM transaccion WHERE id_cuenta = ?";
        String sqlTitulares = "DELETE FROM titular WHERE id_cuenta = ?";
        String sqlCuenta = "DELETE FROM cuenta WHERE id_cuenta = ?";

        Connection con = null;
        try {
            con = ConexionBD.getConexion();
            con.setAutoCommit(false); 

            try (PreparedStatement ps1 = con.prepareStatement(sqlTransacciones)) {
                ps1.setString(1, idCuenta);
                ps1.executeUpdate();
            }

            try (PreparedStatement ps2 = con.prepareStatement(sqlTitulares)) {
                ps2.setString(1, idCuenta);
                ps2.executeUpdate();
            }

            try (PreparedStatement ps3 = con.prepareStatement(sqlCuenta)) {
                ps3.setString(1, idCuenta);
                int filasAfectadas = ps3.executeUpdate();

                if (filasAfectadas == 0) {
                    throw new SQLException("La cuenta no existe.");
                }
            }

            con.commit();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al eliminar cuenta: " + e.getMessage());
            try { if (con != null) con.rollback(); } catch (SQLException ex) {}
            return false;
        } finally {
            try { if (con != null) con.setAutoCommit(true); } catch (SQLException ex) {}
        }
    }
    
    public Cliente buscarTitularEnCuenta(String idCuenta, String idCliente) {
        String sql = "SELECT c.nombre, c.apellido FROM cliente c " +
                     "JOIN titular t ON c.id_cliente = t.id_cliente " +
                     "WHERE t.id_cuenta = ? AND t.id_cliente = ?";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, idCuenta);
            ps.setString(2, idCliente);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Cliente c = new Cliente();
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                return c;
            }
        } catch (Exception e) { e.printStackTrace(); }
        return null; 
    }

    public boolean eliminarTitular(String idCuenta, String idCliente) {
        if (contarTitulares(idCuenta) <= 1) {
            System.out.println("No se puede dejar la cuenta sin titulares. Elimine la cuenta completa.");
            return false;
        }

        String sql = "DELETE FROM titular WHERE id_cuenta = ? AND id_cliente = ?";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, idCuenta);
            ps.setString(2, idCliente);

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (Exception e) {
            System.out.println("Error al eliminar titular: " + e.getMessage());
            return false;
        }
    }

    public int contarTitulares(String idCuenta) {
        String sql = "SELECT COUNT(*) FROM titular WHERE id_cuenta = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idCuenta);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) return rs.getInt(1);
        } catch(Exception e){}
        return 0;
    }
}