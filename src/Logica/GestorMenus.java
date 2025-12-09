package Logica;
import java.util.InputMismatchException;
import java.util.*;

public class GestorMenus {

    private Banco banco;
    Scanner sc = new Scanner(System.in);

    public GestorMenus (Banco banco){
        this.banco = banco;
    }

    /* MÉTODO PRINCIPAL DE EJECUCIÓN DEL MENÚ CON SWITCH */
    public void ejecutarMenuPrincipal(Usuario usuarioActual) {
        if (usuarioActual == null) return; 
        boolean salir = false;
        while (!salir) {
            usuarioActual.mostrarPermisos();
            System.out.print("Seleccione una opción: ");
            int opcion = -1;
            try {
                opcion = sc.nextInt();
                sc.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                sc.nextLine(); 
                continue;
            }
            
            if (usuarioActual instanceof Admin) {
                
                switch (opcion) {
                    case 1 -> banco.registrarClienteTeclado();
                    case 2 -> banco.mostrarCliente();
                    case 3 -> banco.mostrarListaClientes();
                    case 4 -> banco.eliminarCliente();
                    case 5 -> banco.registrarEmpleadoTeclado();
                    case 6 -> banco.mostrarEmpleado();
                    case 7 -> banco.mostrarListaEmpleados();
                    case 8 -> banco.eliminarEmpleado();
                    case 9 -> banco.crearCuentaTeclado();
                    case 10 -> banco.agregarTitular();
                    case 11 -> banco.mostrarTransacciones();
                    case 12 -> banco.mostrarListaCuentas();
                    case 13 -> banco.mostrarCuenta();
                    case 14 -> banco.eliminarCuenta();
                    case 15 -> banco.depositar();
                    case 16 -> banco.retirar();
                    case 17 -> banco.transferir();
                    case 18 -> banco.pagarServicio();
                    case 19 -> banco.mostrarEstadisticas();
                    case 20 -> { // Cerrar Sesión
                        banco.cerrarSesion();
                        salir = true;
                    }
                    default -> System.out.println("Opción no válida.");
                }
                
            } else if (usuarioActual instanceof Empleado) {
                
                switch (opcion) {
                    case 1 -> banco.registrarClienteTeclado();
                    case 2 -> banco.mostrarCliente();
                    case 3 -> banco.eliminarCliente();
                    case 4 -> banco.crearCuentaTeclado();
                    case 5 -> banco.agregarTitular();
                    case 6 -> banco.mostrarTransacciones();
                    case 7 -> banco.mostrarCuenta();
                    case 8 -> banco.eliminarCuenta();
                    case 9 -> banco.depositar();
                    case 10 -> banco.retirar();
                    case 11 -> banco.pagarServicio();
                    case 12 -> banco.transferir();
                    case 13 -> {
                        banco.cerrarSesion();
                        salir = true;
                    }
                    default -> System.out.println("Opción no válida.");
                }
                
            } else if (usuarioActual instanceof Cliente) {
                
                switch (opcion) {
                    case 1 -> banco.depositar();
                    case 2 -> banco.retirar();
                    case 3 -> banco.pagarServicio();
                    case 4 -> banco.transferir();
                    case 5 -> banco.mostrarTransacciones();
                    case 6 -> banco.mostrarSaldo(); 
                    case 7 -> banco.mostrarDatosUsuarioActual();
                    case 8 -> {
                        banco.cerrarSesion();
                        salir = true;
                    }
                    default -> System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Error: Tipo de usuario no reconocido.");
                salir = true;
            }
        }
    }
}
