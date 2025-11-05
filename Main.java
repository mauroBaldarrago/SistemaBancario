import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        Empleado empleadoBase = new Empleado("Luis", "Pérez", "12345678", "Av. Central", "999999999", "E001", "Cajero");
        banco.registrarEmpleado(empleadoBase);
        int opcion;
        do {
            System.out.println("\n===== MENÚ BANCO =====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Crear cuenta");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Mostrar transacciones");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Registro de Cliente ---");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Celular: ");
                    String celular = sc.nextLine();
                    System.out.print("ID Cliente: ");
                    String idCliente = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    Cliente nuevoCliente = new Cliente(nombre, apellido, dni, direccion, celular, idCliente, correo, true);
                    banco.registrarCliente(nuevoCliente);
                    System.out.println("Cliente registrado correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- Creación de Cuenta ---");
                    System.out.print("ID de cuenta: ");
                    String idCuenta = sc.nextLine();
                    System.out.print("Tipo de cuenta: ");
                    String tipo = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("ID del cliente titular: ");
                    String idTitular = sc.nextLine();
                    Cliente titular = banco.buscarCliente(idTitular);

                    if (titular != null) {
                        ArrayList<Cliente> titulares = new ArrayList<>();
                        titulares.add(titular);
                        Cuenta cuenta = new Cuenta(idCuenta, tipo, saldo, titulares);
                        banco.crearCuenta(cuenta);
                        System.out.println("Cuenta creada correctamente.");
                    } else {
                        System.out.println("Cliente no encontrado. No se pudo crear la cuenta.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Depósito ---");
                    System.out.print("ID de cuenta: ");
                    String idCtaDep = sc.nextLine();
                    System.out.print("ID del cliente: ");
                    String idCliDep = sc.nextLine();
                    System.out.print("Monto a depositar: ");
                    double montoDep = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fechaDep = sc.nextLine();

                    Cliente cliDep = banco.buscarCliente(idCliDep);
                    Cuenta ctaDep = banco.buscarCuenta(idCtaDep);

                    if (cliDep != null && ctaDep != null) {
                        banco.depositar(idCtaDep, fechaDep, montoDep, cliDep, empleadoBase);
                    } else {
                        System.out.println("Cliente o cuenta no encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Retiro ---");
                    System.out.print("ID de cuenta: ");
                    String idCtaRet = sc.nextLine();
                    System.out.print("ID del cliente: ");
                    String idCliRet = sc.nextLine();
                    System.out.print("Monto a retirar: ");
                    double montoRet = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fechaRet = sc.nextLine();

                    Cliente cliRet = banco.buscarCliente(idCliRet);
                    Cuenta ctaRet = banco.buscarCuenta(idCtaRet);

                    if (cliRet != null && ctaRet != null) {
                        banco.retirar(idCtaRet, fechaRet, montoRet, cliRet, empleadoBase);
                    } else {
                        System.out.println("Cliente o cuenta no encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Consulta de Saldo ---");
                    System.out.print("ID de cuenta: ");
                    String idSaldo = sc.nextLine();
                    Cuenta cuentaSaldo = banco.buscarCuenta(idSaldo);
                    if (cuentaSaldo != null) {
                        System.out.println("Saldo actual: " + banco.mostrarSaldo(idSaldo));
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Movimientos ---");
                    System.out.print("ID de cuenta: ");
                    String idMov = sc.nextLine();
                    Cuenta cuentaMov = banco.buscarCuenta(idMov);
                    if (cuentaMov != null) {
                        System.out.println("Transacciones de la cuenta:");
                        for (Transaccion t : banco.mostrarTransacciones(idMov)) {
                            System.out.println("- " + t.getClass().getSimpleName() + " de " + t.getMonto() + " (" + t.getFecha() + ")");
                        }
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println( "Opción no válida.");
            }

        } while (opcion != 7);

        sc.close();
    }
}
