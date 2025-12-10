package Logica;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Banco {
    Scanner sc = new Scanner(System.in);
    /* Creando los Array List del gestor general */
    private GestorUsuarios gestorUsuarios;
    private ArrayList<Cuenta> cuentas;
    private Usuario usuarioActual;
    

    /* Constructor de Banco */
        public Banco() {
         gestorUsuarios = new GestorUsuarios();
         cuentas = new ArrayList<>();
         usuarioActual = null;

         cargarUsuariosDesdeBD(); // Carga desde la BD
     }


    /* MÉTODOS DE AUTENTICACIÓN */
    public Usuario iniciarSesion(String dni, String contrasena) {
        // Buscar en clientes
        for (Cliente c : gestorUsuarios.getClientes()) {
            if (c.getDni().equals(dni) && c.verificarContrasena(contrasena)) {
                usuarioActual = c;
                System.out.println("\nBienvenido Cliente: " + c.getNombre() + " " + c.getApellido());
                return c;
            }
        }
        // Buscar en empleados
        for (Empleado e : gestorUsuarios.getEmpleados()) {
            if (e.getDni().equals(dni) && e.verificarContrasena(contrasena)) {
                usuarioActual = e;
                System.out.println("\nBienvenido Empleado: " + e.getNombre() + " " + e.getApellido());
                return e;
            }
        }
        // Buscar en administradores
        for (Admin a : gestorUsuarios.getAdmins()) {
            if (a.getDni().equals(dni) && a.verificarContrasena(contrasena)) {
                usuarioActual = a;
                System.out.println("\nBienvenido Administrador: " + a.getNombre() + " " + a.getApellido());
                return a;
            }
        }
        System.out.println("\nError: DNI o contraseña incorrectos");
        return null;
    }

    public void cerrarSesion() {
        if (usuarioActual != null) {
            System.out.println("\nSesión cerrada. Hasta pronto, " + usuarioActual.getNombre());
            usuarioActual = null;
        }
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public boolean hayUsuarioAutenticado() {
        return usuarioActual != null;
    }

/* MÉTODOS PARA BUSCAR */
    // Buscar cliente
    public Cliente buscarCliente(String idCliente){
        return gestorUsuarios.buscarCliente(idCliente);
    }

    // Buscar cuenta
    public Cuenta buscarCuenta(String idCuenta){
        for (Cuenta c: cuentas){
            if (c.getIdCuenta().equals(idCuenta)) {
                return c;
            }
        }
        return null;
    }

    // Buscar empleado
    public Empleado buscarEmpleado(String idEmpleado){
        return gestorUsuarios.buscarEmpleado(idEmpleado);
    }

    // Buscar admin
    public Admin buscarAdmin(String idAdmin){
        return gestorUsuarios.buscarAdmin(idAdmin);
    }

/* MÉTODOS PARA REGISTRAR USUARIOS (CON VALIDACIONES) */
    // Cliente inicializado
    public void registrarCliente(Cliente cliente){
        gestorUsuarios.registrarCliente(cliente);
    }
    
    // Cliente teclado
    public void registrarClienteTeclado() {
        gestorUsuarios.registrarClienteTeclado();
    }

    // Empleado inicializado
    public void registrarEmpleado(Empleado empleado){
        gestorUsuarios.registrarEmpleado(empleado);
    }

    // Empleado teclado
    public void registrarEmpleadoTeclado(){
        gestorUsuarios.registrarEmpleadoTeclado();
    }

    // Admin inicializado
    public void registrarAdmin(Admin admin){
        gestorUsuarios.registrarAdmin(admin);
    }

    /* MÉTODOS PARA CREAR CUENTAS  */
    public void crearCuenta(Cuenta cuenta){
        Cuenta c = buscarCuenta(cuenta.getIdCuenta());
        if (c == null)
            cuentas.add(cuenta);
    }

    public void crearCuentaTeclado() {
        System.out.println("\n--- CREAR NUEVA CUENTA ---");
        
        String idCuenta;
        while (true) {
            System.out.print("ID Cuenta: ");
            idCuenta = sc.nextLine();
            if (Validaciones.validarCodigoCuenta(idCuenta)) {break;}
            System.out.println("Error: Ingrese un ID de cuenta válido (formato: CTA seguido de 8-10 dígitos)");
        }
        
        String tipo;
        while (true) {
            System.out.print("Tipo de cuenta (ahorro/corriente): ");
            tipo = sc.nextLine();
            if (Validaciones.validarTexto(tipo)) {break;}
            System.out.println("Error: Ingrese un tipo de cuenta válido");
        }

        double saldo;
        while (true) {
            System.out.print("Saldo inicial: ");
            try {
                saldo = sc.nextDouble();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un monto válido");
                sc.nextLine();
            }
        }
        
        Cliente titular;
        while (true) {
            System.out.print("ID del cliente titular: ");
            String idTitular = sc.nextLine();
            titular = buscarCliente(idTitular);
            if (Validaciones.validarObjeto(titular)) {break;}
            System.out.println("Error: Cliente no encontrado. Intente nuevamente.");
        }

        ArrayList<Cliente> titulares = new ArrayList<>();
        titulares.add(titular);
        Cuenta nueva = new Cuenta(idCuenta, tipo, saldo, titulares);
        Cuenta c = buscarCuenta(nueva.getIdCuenta());
        if (c == null) {
            cuentas.add(nueva);
            System.out.println("Cuenta creada correctamente");
        } else
            System.out.println("La cuenta ya está registrada");
    }

    public void agregarTitular() {
        System.out.println("\n--- Agregar Titular ---");
        
        Cuenta cuenta;
        while (true) {
            System.out.print("ID de cuenta: ");
            String idCuenta = sc.nextLine();
            cuenta = buscarCuenta(idCuenta);
            if (Validaciones.validarObjeto(cuenta)) {break;}
            System.out.println("Error: Cuenta no encontrada. Intente nuevamente.");
        }
        
        Cliente cliente;
        while (true) {
            System.out.print("ID del cliente a agregar como titular: ");
            String idCliente = sc.nextLine();
            cliente = buscarCliente(idCliente);
            if (!Validaciones.validarObjeto(cliente)) {
                System.out.println("Error: Cliente no encontrado. Intente nuevamente.");
                continue;
            }
            ArrayList<Cliente> titulares = cuenta.getTitulares();
            if (titulares.contains(cliente)) {
                System.out.println("Error: El cliente ya es titular de esta cuenta. Intente con otro cliente.");
                continue;
            }
            break;
        }
        ArrayList<Cliente> titulares = cuenta.getTitulares();
        titulares.add(cliente);
        System.out.println("Cliente " + cliente.getNombre() + " añadido como titular con éxito");
    }

    
    public void cargarUsuariosDesdeBD() {
    // Limpiamos listas actuales
    gestorUsuarios.getClientes().clear();
    gestorUsuarios.getEmpleados().clear();

    // Cargar clientes
    ClienteDAO clienteDAO = new ClienteDAO();
    gestorUsuarios.getClientes().addAll(clienteDAO.listarClientes());

    // Cargar empleados
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    gestorUsuarios.getEmpleados().addAll(empleadoDAO.listarEmpleados());
}

    /* MÉTODOS PARA TRANSACCIONES */
    public void depositar() {
        System.out.println("\n--- Depósito ---");
        System.out.print("ID del depósito: ");
        String idDeposito = sc.nextLine();
        
        Cuenta cuenta;
        while (true) {
            System.out.print("ID de cuenta: ");
            String idCuenta = sc.nextLine();
            cuenta = buscarCuenta(idCuenta);
            if (Validaciones.validarObjeto(cuenta)) {break;}
            System.out.println("Error: Cuenta no encontrada. Intente nuevamente.");
        }
        
        Cliente cliente;
        while (true) {
            System.out.print("ID del cliente: ");
            String idCliente = sc.nextLine();
            cliente = buscarCliente(idCliente);
            if (Validaciones.validarObjeto(cliente)) {break;}
            System.out.println("Error: Cliente no válido. Intente nuevamente.");
        }
        
        if (usuarioActual instanceof Cliente) {
            Cliente clienteActual = (Cliente) usuarioActual;
            if (!cuenta.getTitulares().contains(clienteActual)) {
                System.out.println("Error: No es titular de esta cuenta");
                return;
            }
        }
        Empleado empleado = null;
        if (usuarioActual instanceof Empleado) {
            empleado = (Empleado) usuarioActual;
        } else {
            while (true) {
                System.out.print("ID del empleado (si aplica): ");
                String idEmpleado = sc.nextLine();
                empleado = buscarEmpleado(idEmpleado);
                if (Validaciones.validarObjeto(empleado)) {break;}
                System.out.println("Error: Empleado no válido. Intente nuevamente.");
            }
        }
        
        double monto;
        while (true) {
            System.out.print("Monto a depositar: ");
            try {
                monto = sc.nextDouble();
                sc.nextLine();
                if (Validaciones.validarMontoDeposito(monto)) {break;}
                System.out.println("Error: El monto debe estar entre 10 y 50,000");
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un monto válido");
                sc.nextLine();
            }
        }
        Deposito deposito = new Deposito(idDeposito, monto, cliente, empleado);
        deposito.procesar(cuenta, monto, deposito);
    }

    public void retirar() {
        System.out.println("\n--- Retiro ---");
        System.out.print("ID del retiro: ");
        String idRetiro = sc.nextLine();
        
        Cuenta cuenta;
        while (true) {
            System.out.print("ID de cuenta: ");
            String idCuenta = sc.nextLine();
            cuenta = buscarCuenta(idCuenta);
            if (Validaciones.validarObjeto(cuenta)) {break;}
            System.out.println("Error: Cuenta no encontrada. Intente nuevamente.");
        }
        
        Cliente cliente;
        while (true) {
            System.out.print("ID del cliente: ");
            String idCliente = sc.nextLine();
            cliente = buscarCliente(idCliente);
            if (Validaciones.validarObjeto(cliente)) {break;}
            System.out.println("Error: Cliente no válido. Intente nuevamente.");
        }
        
        if (usuarioActual instanceof Cliente) {
            Cliente clienteActual = (Cliente) usuarioActual;
            if (!cuenta.getTitulares().contains(clienteActual)) {
                System.out.println("Error: No es titular de esta cuenta");
                return;
            }
        }
        Empleado empleado = null;
        if (usuarioActual instanceof Empleado)
            empleado = (Empleado) usuarioActual;
        else {
            while (true) {
                System.out.print("ID del empleado (si aplica): ");
                String idEmpleado = sc.nextLine();
                empleado = buscarEmpleado(idEmpleado);
                if (Validaciones.validarObjeto(empleado)) {break;}
                System.out.println("Error: Empleado no válido. Intente nuevamente.");
            }
        }
        
        double monto;
        while (true) {
            System.out.print("Monto a retirar: ");
            try {
                monto = sc.nextDouble();
                sc.nextLine();
                if (!Validaciones.validarMontoRetiro(monto)) {
                    System.out.println("Error: El monto debe estar entre 10 y 5,000");
                    continue;
                }
                if (!Validaciones.validarSaldoSuficiente(cuenta, monto)) {
                    System.out.println("Error: Saldo insuficiente para realizar el retiro");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un monto válido");
                sc.nextLine();
            }
        }
        
        Retiro retiro = new Retiro(idRetiro, monto, cliente, empleado);
        retiro.procesar(cuenta, monto, retiro);
    }

    public void transferir() {
        System.out.println("\n--- Transferencia ---");
        System.out.print("ID de la transferencia: ");
        String idTransferencia = sc.nextLine();

        Cuenta cuenta1;
        String idCuenta1;
        while (true) {
            System.out.print("ID de su cuenta (origen): ");
            idCuenta1 = sc.nextLine();
            cuenta1 = buscarCuenta(idCuenta1);
            if (Validaciones.validarObjeto(cuenta1)) {break;}
            System.out.println("Error: Cuenta origen no encontrada");
        }

        Cuenta cuenta2;
        String idCuenta2;
        while (true) {
            System.out.print("ID de la cuenta destino: ");
            idCuenta2 = sc.nextLine();
            cuenta2 = buscarCuenta(idCuenta2);
            if (!Validaciones.validarObjeto(cuenta2)) {
                System.out.println("Error: Cuenta destino no encontrada");
                continue;
            }
            if (!Validaciones.validarCuentasDiferentes(idCuenta1, idCuenta2)) {
                System.out.println("Error: No puede transferir a la misma cuenta");
                continue;
            }
            break;
        }

        Cliente cliente1;
        while (true) {
            System.out.print("Su ID de cliente: ");
            String idCliente1 = sc.nextLine();
            cliente1 = buscarCliente(idCliente1);
            if (Validaciones.validarObjeto(cliente1)) {break;}
            System.out.println("Error: Cliente origen no válido");
        }

        if (usuarioActual instanceof Cliente) {
        Cliente clienteActual = (Cliente) usuarioActual;
        if (!cuenta1.getTitulares().contains(clienteActual)) {
            System.out.println("Error: No es titular de esta cuenta");
            return;
        }
    }
        
        Empleado empleado = null;
        if (usuarioActual instanceof Empleado) {
            empleado = (Empleado) usuarioActual;
        } else {
            while (true) {
                System.out.print("ID del empleado (si aplica): ");
                String idEmpleado = sc.nextLine();
                empleado = buscarEmpleado(idEmpleado);
                if (Validaciones.validarObjeto(empleado)) {break;}
                System.out.println("Error: Empleado no válido");
            }
        }
        
        double monto;
        while (true) {
            System.out.print("Monto a transferir: ");
            try {
                monto = sc.nextDouble();
                sc.nextLine();
                if (Validaciones.validarSaldoSuficiente(cuenta1, monto)) {break;}
                System.out.println("Error: Saldo insuficiente en la cuenta origen");
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un monto válido");
                sc.nextLine();
            }
        }
        
        Transferencia transferencia = new Transferencia(idTransferencia, monto, cliente1, empleado);
        transferencia.procesar(cuenta1, cuenta2, monto, transferencia);
    }

    public void pagarServicio() {        
        System.out.println("\n--- Pago de Servicio ---");
        System.out.print("ID del pago: ");
        String idPago = sc.nextLine();

        Cuenta cuenta;
        while (true) {
            System.out.print("ID de cuenta: ");
            String idCuenta = sc.nextLine();
            cuenta = buscarCuenta(idCuenta);
            if (Validaciones.validarObjeto(cuenta)) {break;}
            System.out.println("Error: Cuenta no encontrada. Intente nuevamente.");
        }
        
        Cliente cliente;
        while (true) {
            System.out.print("ID del cliente: ");
            String idCliente = sc.nextLine();
            cliente = buscarCliente(idCliente);
            if (!Validaciones.validarObjeto(cliente)) {
                System.out.println("Error: Cliente no válido. Intente nuevamente.");
                continue;
            }
            if (!cuenta.getTitulares().contains(cliente)) {
                System.out.println("Error: Cliente no es titular de esta cuenta. Intente nuevamente.");
                continue;
            }
            break;
        }
        
        Empleado empleado = null;
        if (usuarioActual instanceof Empleado)
            empleado = (Empleado) usuarioActual;
        else {
            while (true) {
                System.out.print("ID del empleado (si aplica): ");
                String idEmpleado = sc.nextLine();
                empleado = buscarEmpleado(idEmpleado);
                if (Validaciones.validarObjeto(empleado)) {break;}
                System.out.println("Error: Empleado no válido. Intente nuevamente.");
            }
        }
        
        String tipoServicio;
        while (true) {
            System.out.print("Tipo de servicio (luz, agua, internet, etc.): ");
            tipoServicio = sc.nextLine();
            if (Validaciones.validarTexto(tipoServicio)) {break;}
            System.out.println("Error: Debe especificar el tipo de servicio");
        }
        
        double monto;
        while (true) {
            System.out.print("Monto a pagar: ");
            try {
                monto = sc.nextDouble();
                sc.nextLine();
                if (!Validaciones.validarMontoPositivo(monto)) {
                    System.out.println("Error: El monto debe ser mayor a 0");
                    continue;
                }
                if (!Validaciones.validarSaldoSuficiente(cuenta, monto)) {
                    System.out.println("Error: Saldo insuficiente para pagar el servicio: " + tipoServicio);
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un monto válido");
                sc.nextLine();
            }
        }
        
        PagoServicio pagoServicio = new PagoServicio(idPago, monto, cliente, empleado, tipoServicio);
        pagoServicio.procesar(cuenta, monto, pagoServicio);
    }

    /* MÉTODOS PARA MOSTRAR Y ELIMINAR (CON VALIDACIONES) */
    public void mostrarTransacciones() {        
        System.out.println("\n--- Historial de Transacciones ---");
        System.out.print("ID de cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (!Validaciones.validarObjeto(cuenta)) {
            System.out.println("Error: Cuenta no encontrada");
            return;
        }
        ArrayList<Transaccion> movimientos = cuenta.getMovimientos();
        if (movimientos.isEmpty()) {
            System.out.println("No hay transacciones registradas para esta cuenta");
            return;
        }
        System.out.println("Transacciones de la cuenta " + idCuenta + ":");
        for (Transaccion t : movimientos) {
            System.out.println("- " + t.getClass().getSimpleName() + "\n | Monto: S/. " + t.getMonto() + "\n | Fecha: " + t.getFecha() + "\n | ID: " + t.getIdTransaccion());
        }
    }

    public void mostrarSaldo() {        
        System.out.println("\n--- Consulta de Saldo ---");
        System.out.print("ID de cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (!Validaciones.validarObjeto(cuenta)) {
            System.out.println("Error: Cuenta no encontrada");
            return;
        }
        if (usuarioActual instanceof Cliente) {
            Cliente clienteActual = (Cliente) usuarioActual;
            if (!cuenta.getTitulares().contains(clienteActual)) {
                System.out.println("Error: No tiene permiso para consultar esta cuenta (No es titular).");
                return;
            }
        }
        System.out.println("Saldo actual: S/. " + cuenta.consultarSaldo());
    }

    public void mostrarEmpleado() {
        System.out.println("\n--- Datos del Empleado ---");
        System.out.print("Ingrese el ID del empleado: ");
        String idEmpleado = sc.nextLine();
        Empleado empleado = buscarEmpleado(idEmpleado);
        if (Validaciones.validarObjeto(empleado)) {
            empleado.mostrarDatos();
        } else
            System.out.println("El empleado no se encontró");
    }

    public void mostrarCliente() {        
        System.out.println("\n--- Datos del Cliente ---");
        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (Validaciones.validarObjeto(cliente)) {
            cliente.mostrarDatos();
        } else
            System.out.println("El cliente no se encontró");
    }

    public void mostrarCuenta() {
        System.out.println("\n--- Datos de la Cuenta ---");
        System.out.print("Ingrese el ID de la cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (!Validaciones.validarObjeto(cuenta)) {
            System.out.println("La cuenta no se encontró");
            return;
        }
        System.out.println("ID Cuenta: " + cuenta.getIdCuenta());
        System.out.println("Tipo: " + cuenta.getTipo());
        System.out.println("Saldo: S/. " + cuenta.consultarSaldo());
        System.out.println("Titulares:");
        for (Cliente t : cuenta.getTitulares()) {
            System.out.println("  - " + t.getNombre() + " " + t.getApellido() + " (ID: " + t.getIdCliente() + ")");
        }
    }

    // Eliminar cliente
    public void eliminarCliente() {
        gestorUsuarios.eliminarCliente();
    }

    // Eliminar empleado
    public void eliminarEmpleado() {
        gestorUsuarios.eliminarEmpleado();
    }

    public void eliminarCuenta() {
        System.out.println("\n--- Eliminar Cuenta ---");
        System.out.print("Ingrese el ID de la cuenta a eliminar: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (Validaciones.validarObjeto(cuenta)) {
            cuentas.remove(cuenta);
            System.out.println("Se eliminó la cuenta correctamente");
        } else
            System.out.println("La cuenta no está registrada");
    }

    public void eliminarTitular() {
        System.out.println("\n--- Eliminar Titular ---");
        System.out.print("ID de cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (!Validaciones.validarObjeto(cuenta)) {
            System.out.println("Error: Cuenta no encontrada");
            return;
        }
        System.out.print("ID del cliente titular a eliminar: ");
        String idCliente = sc.nextLine();
        Cliente titular = buscarCliente(idCliente);
        if (!Validaciones.validarObjeto(titular)) {
            System.out.println("Error: Cliente no encontrado");
            return;
        }
        ArrayList<Cliente> titulares = cuenta.getTitulares();
        if (!titulares.contains(titular)) {
            System.out.println("El titular no está registrado en la cuenta");
            return;
        }
        if (titulares.size() <= 1) {
            System.out.println("Error: No se puede eliminar el único titular de la cuenta");
            return;
        }
        titulares.remove(titular);
        System.out.println("Se eliminó el titular correctamente");
    }

    /* MÉTODOS AUXILIARES PARA EL NUEVO MENÚ */
    public void mostrarDatosUsuarioActual() {
        if (usuarioActual != null) {
            System.out.println("\n--- MIS DATOS DE USUARIO ---");
            usuarioActual.mostrarDatos();
        } else
            System.out.println("\nError: No hay sesión iniciada.");
    }
    
    // Mostrar listas completas
    public void mostrarListaClientes() {
        gestorUsuarios.mostrarListaClientes();
    }

    public void mostrarListaEmpleados() {
        gestorUsuarios.mostrarListaEmpleados();
    }

    public void mostrarListaCuentas() {
        System.out.println("\n--- LISTA DE CUENTAS REGISTRADAS ---");
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas registradas.");
            return;
        }
        for (Cuenta c : cuentas) {
            c.mostrarDatos();
            System.out.println("-------------------------");
        }
    }

    public void mostrarEstadisticas() {
        gestorUsuarios.mostrarEstadisticas();
        System.out.println("Cuentas totales: " + cuentas.size());
    }
    
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    public GestorUsuarios getGestorUsuarios() {
        return gestorUsuarios;
    }
}