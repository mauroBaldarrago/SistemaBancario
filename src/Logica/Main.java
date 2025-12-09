package Logica;
import GUI.Login;
import java.util.*;
        
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        // ==== INICIALIZACIÓN DE DATOS ====
        Empleado empleado1 = new Empleado(
            "Luis", "Pérez", "12345678", "Av. Central", "999999999",
            "EMP001", "Cajero", "emp123"
        );
        banco.registrarEmpleado(empleado1);
        Cliente cliente1 = new Cliente(
            "Alejandro", "Mendoza", "32164255", "Av. Central", "999999999",
            "CLI001", "ajmendozap@email.com", "1"
        );
        banco.registrarCliente(cliente1);
        Cliente cliente2 = new Cliente(
            "María", "García", "45678912", "Jr. Los Olivos 789", "965432178", "CLI002", "maria.garcia@email.com", "cli456"
        );
        banco.registrarCliente(cliente2);
        Admin admin1 = new Admin(
            "Javier", "Solís", "00000000", "Av. Administrador", "900000000", "adm123", "ADM001"
        );
        banco.registrarAdmin(admin1);
        ArrayList<Cliente> titularesCuenta1 = new ArrayList<>();
        titularesCuenta1.add(cliente1);
        Cuenta cuenta1 = new Cuenta("CTA001", "ahorro", 5000.00, titularesCuenta1);
        banco.crearCuenta(cuenta1);
        ArrayList<Cliente> titularesCuenta2 = new ArrayList<>();
        titularesCuenta2.add(cliente2);
        Cuenta cuenta2 = new Cuenta("CTA002", "corriente", 12000.00, titularesCuenta2);
        banco.crearCuenta(cuenta2);
        
        // 3. Iniciar la ventana de Login pasándole el banco
        Login loginWindow = new Login(banco);
        loginWindow.setVisible(true);
    }
}