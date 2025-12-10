package Datos;
import Logica.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmpleadoDAO {
    public void registrarEmpleado(Empleado e) {
        String sql = "INSERT INTO empleado "
           + "(id_empleado, dni, nombre, apellido, direccion, celular, correo, cargo, contrasena, activo) "
           + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, e.getIdEmpleado());
            ps.setString(2, e.getDni());
            ps.setString(3, e.getNombre());
            ps.setString(4, e.getApellido());
            ps.setString(5, e.getDireccion());
            ps.setString(6, e.getCelular());
            ps.setString(7, e.getCorreo());
            ps.setString(8, e.getCargo());
            ps.setString(9, e.getContrasena());
            ps.setBoolean(10, true);


            ps.executeUpdate();

        } catch (Exception ex) {
            throw new RuntimeException("Error al registrar empleado");
        }
    }
    public List<Empleado> listarEmpleados() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT id_empleado, dni, nombre, apellido, direccion, celular, correo, cargo, contrasena FROM empleado";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Empleado e = new Empleado(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni"),
                        rs.getString("direccion"),
                        rs.getString("celular"),
                        rs.getString("id_empleado"),
                        rs.getString("cargo"),
                        rs.getString("correo"),
                        rs.getString("contrasena")
                );
                lista.add(e);
            }

        } catch (Exception ex) {
            throw new RuntimeException("Error al listar empleados");
        }

        return lista;
    }
    
    public Empleado login(String dni, String contrasena) {
        String sql = "SELECT id_empleado, dni, nombre, apellido, direccion, celular, correo, cargo, contrasena " +
                     "FROM empleado WHERE dni = ? AND contrasena = ? AND activo = 1";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, dni);
            ps.setString(2, contrasena);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Empleado(
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("dni"),
                    rs.getString("direccion"),
                    rs.getString("celular"),
                    rs.getString("id_empleado"),
                    rs.getString("cargo"),
                    rs.getString("correo"),
                    rs.getString("contrasena")
                );
            }

        } catch (Exception ex) {
            throw new RuntimeException("Error al hacer login de empleado: " + ex.getMessage());
        }
        return null;
    }

    public Empleado buscarEmpleado(String idEmpleado) {
        String sql = "SELECT * FROM empleado WHERE id_empleado = ?";
        Empleado emp = null;

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, idEmpleado);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    emp = new Empleado(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni"),
                        rs.getString("direccion"),
                        rs.getString("celular"),
                        rs.getString("id_empleado"),
                        rs.getString("cargo"),
                        rs.getString("correo"),
                        rs.getString("contrasena")
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar empleado: " + e.getMessage());
        }
        return emp;
    }
    
    public boolean eliminarEmpleado(String idEmpleado) {
        String sql = "DELETE FROM empleado WHERE id_empleado = ?";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, idEmpleado);
            int filasAfectadas = ps.executeUpdate();

            return filasAfectadas > 0; // Devuelve true si borró a alguien

        } catch (Exception e) {
            System.out.println("Error al eliminar empleado: " + e.getMessage());
            return false;
        }
    }
}