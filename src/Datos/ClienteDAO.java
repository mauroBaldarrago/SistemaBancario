package Datos;
import Logica.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ClienteDAO {
    public Cliente login(String dni, String contrasena) {
        String sql = "SELECT * FROM cliente WHERE dni = ? AND contrasena = ? AND activo = 1";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, dni);
            ps.setString(2, contrasena);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Cliente(
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("dni"),
                    rs.getString("direccion"),
                    rs.getString("celular"),
                    rs.getString("id_cliente"),
                    rs.getString("correo"),
                    rs.getString("contrasena")
                );
            }
        } catch (Exception e) {
            System.out.println("Error login cliente: " + e.getMessage());
        }
        return null; 
    }
    
    public boolean registrarCliente(Cliente c) {
        String sql = "INSERT INTO cliente " +
                "(id_cliente, dni, nombre, apellido, direccion, celular, correo, contrasena, activo) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, c.getIdCliente());
            ps.setString(2, c.getDni());
            ps.setString(3, c.getNombre());
            ps.setString(4, c.getApellido());
            ps.setString(5, c.getDireccion());
            ps.setString(6, c.getCelular());
            ps.setString(7, c.getCorreo());
            ps.setString(8, c.getContrasena());
            ps.setBoolean(9, c.isActivo());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error DAO Cliente: " + e.getMessage());
            return false;
        }
    }
    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE activo = 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente(
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("dni"),
                    rs.getString("direccion"),
                    rs.getString("celular"),
                    rs.getString("id_cliente"),
                    rs.getString("correo"),
                    rs.getString("contrasena")
                );
                lista.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error listar clientes: " + e.getMessage());
        }
        return lista;
    }

    public Cliente buscarCliente(String idCliente) {
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
        Cliente c = null;

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, idCliente);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    c = new Cliente(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni"),
                        rs.getString("direccion"),
                        rs.getString("celular"),
                        rs.getString("id_cliente"),
                        rs.getString("correo"),
                        rs.getString("contrasena")
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar cliente: " + e.getMessage());
        }
        return c;
    }
    
    public boolean tieneCuentas(String idCliente) {
        String sql = "SELECT COUNT(*) FROM titular WHERE id_cliente = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idCliente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) { e.printStackTrace(); }
        return false;
    }

    public boolean eliminarCliente(String idCliente) {
        if (tieneCuentas(idCliente)) {
            System.out.println("No se puede eliminar: El cliente tiene cuentas asociadas.");
            return false; 
        }

        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, idCliente);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (Exception e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
            return false;
        }
    }
}