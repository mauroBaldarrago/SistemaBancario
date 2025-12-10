package Datos;

public class TestConexion {
    public static void main(String[] args) {
        try {
            ConexionBD.getConexion();
            System.out.println("✅ Conexión exitosa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
