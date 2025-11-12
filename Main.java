import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        Empleado empleado1 = new Empleado("Luis", "Pérez", "12345678", "Av. Central", "999999999", "EMP001", "Cajero");
        banco.registrarEmpleado(empleado1);
        Cliente cliente1 = new Cliente("Alejandro", "Mendoza", "32164255", "Av. Central", "999999999", "CLI001", "ajmendozap", true);
        banco.registrarCliente(cliente1);
        Cliente cliente2 = new Cliente("María", "García", "45678912", 
            "Jr. Los Olivos 789", "965432178", "CLI002", "maria.garcia@email.com", true);
        banco.registrarCliente(cliente2);
        ArrayList<Cliente> titularesCuenta1 = new ArrayList<>();
        titularesCuenta1.add(cliente1);
        Cuenta cuenta1 = new Cuenta("CTA00000001", "ahorro", 5000.00, titularesCuenta1);
        banco.crearCuenta(cuenta1);
        ArrayList<Cliente> titularesCuenta2 = new ArrayList<>();
        titularesCuenta2.add(cliente2);
        Cuenta cuenta2 = new Cuenta("CTA00000002", "corriente", 10000.00, titularesCuenta2);
        banco.crearCuenta(cuenta2);

        int opcion;
        do {
            System.out.println("\n===== MENÚ BANCO =====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Crear cuenta");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Mostrar transacciones");
            System.out.println("7. Realizar pago");
            System.out.println("8. Realizar transferencia");
            System.out.println("9. Mostrar empleado");
            System.out.println("10. Mostrar cliente");
            System.out.println("11. Eliminar empleado");
            System.out.println("12. Eliminar cliente");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> banco.registrarClienteTeclado();
                case 2 -> banco.crearCuentaTeclado();
                case 3 -> banco.depositar();
                case 4 -> banco.retirar();
                case 5 -> banco.mostrarSaldo();
                case 6 -> banco.mostrarTransacciones();
                case 7 -> banco.pagarServicio();
                case 8 -> banco.transferir();
                case 9 -> banco.mostrarEmpleado();
                case 10 -> banco.mostrarCliente();
                case 11 -> banco.eliminarEmpleado();
                case 12 -> banco.eliminarCliente();
                case 13 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println( "Opción no válida.");
            }
        } while (opcion != 13);
    }
}
