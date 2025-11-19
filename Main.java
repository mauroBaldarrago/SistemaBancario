import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        // ==== MENÚ PRINCIPAL DEL SISTEMA ====
        System.out.println("\n=== BIENVENIDO AL SISTEMA BANCARIO ===");

        boolean salir = false;
        while (!salir) {
            if (banco.hayUsuarioAutenticado()) {
                // Si ya inició sesión, ejecuta su menú según el tipo de usuario
                banco.ejecutarMenuPrincipal();
            } else {
                System.out.println("\n--- INICIO DE SESIÓN ---");
                System.out.println("1. Iniciar Sesión");
                System.out.println("0. Salir del Sistema");
                System.out.print("Seleccione una opción: ");

                int opcion;
                try {
                    opcion = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    continue;
                }

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese DNI: ");
                        String dni = sc.nextLine().trim();
                        System.out.print("Ingrese Contraseña: ");
                        String contrasena = sc.nextLine().trim();

                        // Intentar iniciar sesión
                        if (banco.iniciarSesion(dni, contrasena) == null) {
                            System.out.println("DNI o contraseña incorrectos. Inténtelo nuevamente.");
                        }
                    }

                    case 0 -> {
                        salir = true;
                        System.out.println("Gracias por usar el sistema bancario. ¡Hasta pronto!");
                    }

                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
        sc.close();
    }
}