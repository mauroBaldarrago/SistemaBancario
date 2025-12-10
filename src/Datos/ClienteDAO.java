package Datos;
import Logica.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ClienteDAO {

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

}

