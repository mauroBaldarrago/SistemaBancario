package Datos;

import Logica.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO {
    public Admin login(String dni, String contrasena) {
        String sql = "SELECT * FROM administrador WHERE dni = ? AND contrasena = ? AND activo = 1";
        
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, dni);
            ps.setString(2, contrasena);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Admin(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni"),
                        rs.getString("direccion"),
                        rs.getString("celular"),
                        rs.getString("contrasena"),
                        rs.getString("id_admin")
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Error en Login de Admin: " + e.getMessage());
        }
        return null;
    }

    public boolean registrarAdmin(Admin a) {
        String sql = "INSERT INTO administrador (id_admin, dni, nombre, apellido, direccion, celular, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, a.getIdAdmin());
            ps.setString(2, a.getDni());
            ps.setString(3, a.getNombre());
            ps.setString(4, a.getApellido());
            ps.setString(5, a.getDireccion());
            ps.setString(6, a.getCelular());
            ps.setString(7, a.getContrasena());
            
            ps.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println("Error al registrar Admin: " + e.getMessage());
            return false;
        }
    }
}