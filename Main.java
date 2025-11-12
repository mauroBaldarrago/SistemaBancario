import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        // INICIALIZACIÓN DE DATOS
        Empleado empleado1 = new Empleado("Luis", "Pérez", "12345678", "Av. Central", "999999999", "EMP001", "Cajero", "emp123");
        banco.registrarEmpleado(empleado1);    
        Cliente cliente1 = new Cliente("Alejandro", "Mendoza", "32164255", "Av. Central", "999999999", "CLI001", "ajmendozap@email.com", "cli123");
        banco.registrarCliente(cliente1);
        Cliente cliente2 = new Cliente("María", "García", "45678912", 
            "Jr. Los Olivos 789", "965432178", "CLI002", "maria.garcia@email.com", "cli456");
        banco.registrarCliente(cliente2);       
        Admin admin1 = new Admin("Javier", "Solís", "00000000", "Av. Administrador", "900000000", "adm123", "ADM001");
        banco.registrarAdmin(admin1); 

        ArrayList<Cliente> titularesCuenta1 = new ArrayList<>();
        titularesCuenta1.add(cliente1);
        Cuenta cuenta1 = new Cuenta("CTA00000001", "ahorro", 5000.00, titularesCuenta1);
        banco.crearCuenta(cuenta1);
        ArrayList<Cliente> titularesCuenta2 = new ArrayList<>();
        titularesCuenta2.add(cliente2);
        Cuenta cuenta2 = new Cuenta("CTA00000002", "corriente", 12000.00, titularesCuenta2);
        banco.crearCuenta(cuenta2);

        System.out.println("\n=== BIENVENIDO AL SISTEMA BANCARIO ===");       
        int opcion = -1;
        do {
            if (banco.hayUsuarioAutenticado()) {
                banco.ejecutarMenuPrincipal();
            } else {
                System.out.println("\n--- INICIO DE SESIÓN ---");
                System.out.println("1. Iniciar Sesión");
                System.out.println("0. Salir del Sistema");
                System.out.print("Seleccione una opción: ");
                
                try {
                    opcion = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    sc.nextLine();
                    opcion = -1;
                    continue;
                }
                
                if (opcion == 1) {
                    System.out.print("Ingrese DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Ingrese Contraseña: ");
                    String contrasena = sc.nextLine();
                    banco.iniciarSesion(dni, contrasena);
                } else if (opcion != 0) {
                    System.out.println("Opción no válida.");
                }
            }
        } while (banco.hayUsuarioAutenticado() || opcion != 0);

        System.out.println("Gracias por usar el sistema.");
        sc.close();
    }
}
