import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Banco {
    Scanner sc = new Scanner(System.in);
    /* Creando los Array List del gestor general */
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Admin> admins;
    private ArrayList<Cuenta> cuentas;
    private Usuario usuarioActual;

    /* Constructor de Banco */
    public Banco() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        admins = new ArrayList<>();
        cuentas = new ArrayList<>();
        usuarioActual = null;
    }

    /* MÉTODOS DE AUTENTICACIÓN */
    
    public Usuario iniciarSesion(String dni, String contrasena) {
        // Buscar en clientes
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni) && c.verificarContrasena(contrasena)) {
                usuarioActual = c;
                System.out.println("\nBienvenido Cliente: " + c.getNombre() + " " + c.getApellido());
                return c;
            }
        }

        // Buscar en empleados
        for (Empleado e : empleados) {
            if (e.getDni().equals(dni) && e.verificarContrasena(contrasena)) {
                usuarioActual = e;
                System.out.println("\nBienvenido Empleado: " + e.getNombre() + " " + e.getApellido());
                return e;
            }
        }

        // Buscar en administradores
        for (Admin a : admins) {
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

    /* Método para verificar permisos antes de ejecutar operaciones */
    public boolean verificarPermiso(String operacion) {
        if (usuarioActual == null) {
            System.out.println("\nError: Debe iniciar sesión primero");
            return false;
        }
        
        if (usuarioActual instanceof Admin) {
            return true;
        }
        
        if (usuarioActual instanceof Empleado) {
            switch(operacion) {
                case "REGISTRAR_CLIENTE":
                case "MOSTRAR_CLIENTE":
                case "ELIMINAR_CLIENTE":
                case "CREAR_CUENTA":
                case "AGREGAR_TITULAR":
                case "MOSTRAR_TRANSACCIONES":
                case "MOSTRAR_CUENTA":
                case "ELIMINAR_CUENTA":
                case "DEPOSITAR":
                case "RETIRAR":
                case "TRANSFERIR":
                case "PAGAR_SERVICIO":
                case "ELIMINAR_TITULAR":
                    return true;
                default:
                    System.out.println("\nError: No tiene permisos para esta operación");
                    return false;
            }
        }
        
        if (usuarioActual instanceof Cliente) {
            switch(operacion) {
                case "DEPOSITAR":
                case "RETIRAR":
                case "PAGAR_SERVICIO":
                case "MOSTRAR_TRANSACCIONES":
                case "MOSTRAR_SALDO":
                    return true;
                default:
                    System.out.println("\nError: No tiene permisos para esta operación");
                    return false;
            }
        }
        
        return false;
    }

    /* MÉTODOS PARA BUSCAR */
    public Cliente buscarCliente(String idCliente){
        for (Cliente c: clientes){
            if (c.getIdCliente().equals(idCliente)){
                return c;
            }
        }
        return null;
    }

    public Cuenta buscarCuenta(String idCuenta){
        for (Cuenta c: cuentas){
            if (c.getIdCuenta().equals(idCuenta)) {
                return c;
            }
        }
        return null;
    }

    public Empleado buscarEmpleado(String idEmpleado){
        for (Empleado e: empleados){
            if (e.getIdEmpleado().equals(idEmpleado)){
                return e;
            }
        }
        return null;
    }

    public Admin buscarAdmin(String idAdmin){
        for (Admin a: admins){
            if (a.getIdAdmin().equals(idAdmin)){
                return a;
            }
        }
        return null;
    }

    /* MÉTODOS PARA REGISTRAR USUARIOS (CON VALIDACIONES) */
    public void registrarCliente(Cliente cliente){
        Cliente c = buscarCliente(cliente.getIdCliente());
        if (c == null) {
            clientes.add(cliente);
            System.out.println("Cliente registrado correctamente");
        } else {
            System.out.println("El cliente ya está registrado");
        }
    }
    
    public void registrarClienteTeclado() {
        if (!verificarPermiso("REGISTRAR_CLIENTE")) return;
        
        System.out.println("\n--- REGISTRAR NUEVO CLIENTE ---");
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        if (!Validaciones.validarDNI(dni)){
            System.out.println("Error: Ingrese un DNI válido");
            return;
        }
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        if (!Validaciones.validarNombre(nombre)){
            System.out.println("Error: Ingrese un nombre válido");
            return;
        }
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        if (!Validaciones.validarNombre(apellido)){
            System.out.println("Error: Ingrese un apellido válido");
            return;
        }
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Celular: ");
        String celular = sc.nextLine();
        if (!Validaciones.validarCelular(celular)){
            System.out.println("Error: Ingrese un celular válido");
            return;
        }
        System.out.print("Email: ");
        String correo = sc.nextLine();
        if (!Validaciones.validarCorreo(correo)){
            System.out.println("Error: Ingrese un correo válido");
            return;
        }
        System.out.print("ID Cliente: ");
        String idCliente = sc.nextLine();
        if (!Validaciones.validarCodigoCliente(idCliente)){
            System.out.println("Error: Ingrese un ID válido");
            return;
        }
        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();
        if (!Validaciones.validarTexto(contrasena)){
            System.out.println("Error: Ingrese una contraseña válida");
            return;
        }
        
        Cliente nuevo = new Cliente(nombre, apellido, dni, direccion, celular, idCliente, correo, contrasena);
        Cliente c = buscarCliente(nuevo.getIdCliente());
        if (c == null) {
            clientes.add(nuevo);
            System.out.println("Cliente registrado correctamente");
        } else {
            System.out.println("El cliente ya está registrado");
        }
    }

    public void registrarEmpleado(Empleado empleado){
        Empleado e = buscarEmpleado(empleado.getIdEmpleado());
        if (e == null) {
            empleados.add(empleado);
            System.out.println("Empleado registrado correctamente");
        } else {
            System.out.println("El empleado ya está registrado");
        }
    }

    public void registrarEmpleadoTeclado(){
        if (!verificarPermiso("REGISTRAR_EMPLEADO")) return;
        
        System.out.println("\n--- REGISTRAR NUEVO EMPLEADO ---");
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        if (!Validaciones.validarDNI(dni)){
            System.out.println("Error: Ingrese un DNI válido");
            return;
        }
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        if (!Validaciones.validarNombre(nombre)){
            System.out.println("Error: Ingrese un nombre válido");
            return;
        }
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        if (!Validaciones.validarNombre(apellido)){
            System.out.println("Error: Ingrese un apellido válido");
            return;
        }
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Celular: ");
        String celular = sc.nextLine();
        if (!Validaciones.validarCelular(celular)){
            System.out.println("Error: Ingrese un celular válido");
            return;
        }
        System.out.print("ID Empleado: ");
        String idEmpleado = sc.nextLine();
        if (!Validaciones.validarCodigoEmpleado(idEmpleado)){
            System.out.println("Error: Ingrese un ID válido");
            return;
        }
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        if (!Validaciones.validarTexto(cargo)){
            System.out.println("Error: Ingrese un cargo válido");
            return;
        }
        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();
        if (!Validaciones.validarTexto(contrasena)){
            System.out.println("Error: Ingrese una contraseña válida");
            return;
        }
        
        Empleado nuevo = new Empleado(nombre, apellido, dni, direccion, celular, idEmpleado, cargo, contrasena);
        Empleado e = buscarEmpleado(nuevo.getIdEmpleado());
        if (e == null) {
            empleados.add(nuevo);
            System.out.println("Empleado registrado correctamente");
        } else {
            System.out.println("El empleado ya está registrado");
        }
    }

    public void registrarAdmin(Admin admin){
        Admin a = buscarAdmin(admin.getIdAdmin());
        if (a == null) {
            admins.add(admin);
            System.out.println("Administrador registrado correctamente");
        } else {
            System.out.println("El administrador ya está registrado");
        }
    }

    /* MÉTODOS PARA CREAR CUENTAS  */
    public void crearCuenta(Cuenta cuenta){
        Cuenta c = buscarCuenta(cuenta.getIdCuenta());
        if (c == null) {
            cuentas.add(cuenta);
            System.out.println("Cuenta creada correctamente");
        } else {
            System.out.println("La cuenta ya está registrada");
        }
    }

    public void crearCuentaTeclado() {
        if (!verificarPermiso("CREAR_CUENTA")) return;
        
        System.out.println("\n--- CREAR NUEVA CUENTA ---");
        System.out.print("ID Cuenta: ");
        String idCuenta = sc.nextLine();
        if (!Validaciones.validarCodigoCuenta(idCuenta)){
            System.out.println("Error: Ingrese un ID de cuenta válido (formato: CTA seguido de 8-10 dígitos)");
            return;
        }
        System.out.print("Tipo de cuenta (ahorro/corriente): ");
        String tipo = sc.nextLine();
        if (!Validaciones.validarTexto(tipo)){
            System.out.println("Error: Ingrese un tipo de cuenta válido");
            return;
        }
        System.out.print("Saldo inicial: ");
        double saldo;
        try {
            saldo = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un monto válido");
            sc.nextLine();
            return;
        }
        System.out.print("ID del cliente titular: ");
        String idTitular = sc.nextLine();
        Cliente titular = buscarCliente(idTitular);
        if (!Validaciones.validarObjeto(titular)){
            System.out.println("Error: Cliente no encontrado. No se puede crear la cuenta.");
            return;
        }

        ArrayList<Cliente> titulares = new ArrayList<>();
        titulares.add(titular);
        Cuenta nueva = new Cuenta(idCuenta, tipo, saldo, titulares);
        Cuenta c = buscarCuenta(nueva.getIdCuenta());
        if (c == null) {
            cuentas.add(nueva);
            System.out.println("Cuenta creada correctamente");
        } else {
            System.out.println("La cuenta ya está registrada");
        }
    }

    public void agregarTitular() {
        if (!verificarPermiso("AGREGAR_TITULAR")) return;
        
        System.out.println("\n--- Agregar Titular ---");
        System.out.print("ID de cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (!Validaciones.validarObjeto(cuenta)) {
            System.out.println("Error: Cuenta no encontrada");
            return;
        }
        System.out.print("ID del cliente a agregar como titular: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (!Validaciones.validarObjeto(cliente)) {
            System.out.println("Error: Cliente no encontrado");
            return;
        }
        ArrayList<Cliente> titulares = cuenta.getTitulares();
        if (titulares.contains(cliente)) {
            System.out.println("Error: El cliente ya es titular de esta cuenta");
            return;
        }
        titulares.add(cliente);
        System.out.println("Cliente " + cliente.getNombre() + " añadido como titular con éxito");
    }

    /* MÉTODOS PARA TRANSACCIONES */
    public void depositar() {
        if (!verificarPermiso("DEPOSITAR")) return;
        
        System.out.println("\n--- Depósito ---");
        System.out.print("ID del depósito: ");
        String idDeposito = sc.nextLine();
        System.out.print("ID de cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (!Validaciones.validarObjeto(cuenta)) {
            System.out.println("Error: Cuenta no encontrada");
            return;
        }
        
        System.out.print("ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (!Validaciones.validarObjeto(cliente)) {
            System.out.println("Error: Cliente no válido");
            return;
        }  
        Empleado empleado = null;
        if (usuarioActual instanceof Empleado) {
            empleado = (Empleado) usuarioActual;
        } else {
            System.out.print("ID del empleado (si aplica): ");
            String idEmpleado = sc.nextLine();
            empleado = buscarEmpleado(idEmpleado);
            if (!Validaciones.validarObjeto(empleado)) {
                System.out.println("Error: Empleado no válido");
                return;
            }
        }
        System.out.print("Monto a depositar: ");
        double monto;
        try {
            monto = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un monto válido");
            sc.nextLine();
            return;
        }
        if (!Validaciones.validarMontoDeposito(monto)) {
            System.out.println("Error: El monto debe estar entre 10 y 50,000");
            return;
        }
        Deposito deposito = new Deposito(idDeposito, monto, cliente, empleado);
        deposito.procesar(cuenta, monto, deposito);
    }

    public void retirar() {
        if (!verificarPermiso("RETIRAR")) return;
        System.out.println("\n--- Retiro ---");
        System.out.print("ID del retiro: ");
        String idRetiro = sc.nextLine();
        System.out.print("ID de cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (!Validaciones.validarObjeto(cuenta)) {
            System.out.println("Error: Cuenta no encontrada");
            return;
        }
        System.out.print("ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (!Validaciones.validarObjeto(cliente)) {
            System.out.println("Error: Cliente no válido");
            return;
        }
        
        Empleado empleado = null;
        if (usuarioActual instanceof Empleado) {
            empleado = (Empleado) usuarioActual;
        } else {
            System.out.print("ID del empleado (si aplica): ");
            String idEmpleado = sc.nextLine();
            empleado = buscarEmpleado(idEmpleado);
            if (!Validaciones.validarObjeto(empleado)) {
                System.out.println("Error: Empleado no válido");
                return;
            }
        }
        
        System.out.print("Monto a retirar: ");
        double monto;
        try {
            monto = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un monto válido");
            sc.nextLine();
            return;
        }
        if (!Validaciones.validarMontoRetiro(monto)) {
            System.out.println("Error: El monto debe estar entre 10 y 5,000");
            return;
        }
        if (!Validaciones.validarSaldoSuficiente(cuenta, monto)) {
            System.out.println("Error: Saldo insuficiente para realizar el retiro");
            return;
        }
        
        Retiro retiro = new Retiro(idRetiro, monto, cliente, empleado);
        retiro.procesar(cuenta, monto, retiro);
    }

    public void transferir() {
        if (!verificarPermiso("TRANSFERIR")) return;
        
        System.out.println("\n--- Transferencia ---");
        System.out.print("ID de la transferencia: ");
        String idTransferencia = sc.nextLine();
        System.out.print("ID de su cuenta (origen): ");
        String idCuenta1 = sc.nextLine();
        System.out.print("ID de la cuenta destino: ");
        String idCuenta2 = sc.nextLine();
        if (!Validaciones.validarCuentasDiferentes(idCuenta1, idCuenta2)) {
            System.out.println("Error: No puede transferir a la misma cuenta");
            return;
        }
        Cuenta cuenta1 = buscarCuenta(idCuenta1);
        if (!Validaciones.validarObjeto(cuenta1)) {
            System.out.println("Error: Cuenta origen no encontrada");
            return;
        }
        Cuenta cuenta2 = buscarCuenta(idCuenta2);
        if (!Validaciones.validarObjeto(cuenta2)) {
            System.out.println("Error: Cuenta destino no encontrada");
            return;
        }
        System.out.print("Su ID de cliente: ");
        String idCliente1 = sc.nextLine();
        Cliente cliente1 = buscarCliente(idCliente1);
        if (!Validaciones.validarObjeto(cliente1)) {
            System.out.println("Error: Cliente origen no válido");
            return;
        }
        System.out.print("ID del cliente destino: ");
        String idCliente2 = sc.nextLine();
        Cliente cliente2 = buscarCliente(idCliente2);
        if (!Validaciones.validarObjeto(cliente2)) {
            System.out.println("Error: Cliente destino no válido");
            return;
        }
        
        Empleado empleado = null;
        if (usuarioActual instanceof Empleado) {
            empleado = (Empleado) usuarioActual;
        } else {
            System.out.print("ID del empleado (si aplica): ");
            String idEmpleado = sc.nextLine();
            empleado = buscarEmpleado(idEmpleado);
            if (!Validaciones.validarObjeto(empleado)) {
                System.out.println("Error: Empleado no válido");
                return;
            }
        }
        
        System.out.print("Monto a transferir: ");
        double monto;
        try {
            monto = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un monto válido");
            sc.nextLine();
            return;
        }
        if (!Validaciones.validarMontoTransferencia(monto)) {
            System.out.println("Error: El monto debe estar entre 10 y 10,000");
            return;
        }
        if (!Validaciones.validarSaldoSuficiente(cuenta1, monto)) {
            System.out.println("Error: Saldo insuficiente en la cuenta origen");
            return;
        }
        Transferencia transferencia = new Transferencia(idTransferencia, monto, cliente1, cliente2, empleado);
        transferencia.procesar(cuenta1, cuenta2, monto, transferencia);
    }

    public void pagarServicio() {
        if (!verificarPermiso("PAGAR_SERVICIO")) return;
        
        System.out.println("\n--- Pago de Servicio ---");
        System.out.print("ID del pago: ");
        String idPago = sc.nextLine();

        System.out.print("ID de cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (!Validaciones.validarObjeto(cuenta)) {
            System.out.println("Error: Cuenta no encontrada");
            return;
        }
        System.out.print("ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (!Validaciones.validarObjeto(cliente)) {
            System.out.println("Error: Cliente no válido");
            return;
        }
        if (!cuenta.getTitulares().contains(cliente)) {
            System.out.println("Error: Cliente no titular");
            return;
        }
        
        Empleado empleado = null;
        if (usuarioActual instanceof Empleado) {
            empleado = (Empleado) usuarioActual;
        } else {
            System.out.print("ID del empleado (si aplica): ");
            String idEmpleado = sc.nextLine();
            empleado = buscarEmpleado(idEmpleado);
            if (!Validaciones.validarObjeto(empleado)) {
                System.out.println("Error: Empleado no válido");
                return;
            }
        }
        
        System.out.print("Tipo de servicio (luz, agua, internet, etc.): ");
        String tipoServicio = sc.nextLine();
        if (!Validaciones.validarTexto(tipoServicio)) {
            System.out.println("Error: Debe especificar el tipo de servicio");
            return;
        }
        System.out.print("Monto a pagar: ");
        double monto;
        try {
            monto = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un monto válido");
            sc.nextLine();
            return;
        }
        if (!Validaciones.validarMontoPositivo(monto)) {
            System.out.println("Error: El monto debe ser mayor a 0");
            return;
        }
        if (!Validaciones.validarSaldoSuficiente(cuenta, monto)) {
            System.out.println("Error: Saldo insuficiente para pagar el servicio: " + tipoServicio);
            return;
        }
        PagoServicio pagoServicio = new PagoServicio(idPago, monto, cliente, empleado, tipoServicio);
        pagoServicio.procesar(cuenta, monto, pagoServicio);
    }

    /* MÉTODOS PARA MOSTRAR Y ELIMINAR (CON VALIDACIONES) */
    public void mostrarTransacciones() {
        if (!verificarPermiso("MOSTRAR_TRANSACCIONES")) return;
        
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
        if (!verificarPermiso("MOSTRAR_SALDO")) return;
        
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
        } else {
            System.out.println("El empleado no se encontró");
        }
    }

    public void mostrarCliente() {
        if (!verificarPermiso("MOSTRAR_CLIENTE")) return;
        
        System.out.println("\n--- Datos del Cliente ---");
        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (Validaciones.validarObjeto(cliente)) {
            cliente.mostrarDatos();
        } else {
            System.out.println("El cliente no se encontró");
        }
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

    public void eliminarCliente() {
        System.out.println("\n--- Eliminar Cliente ---");
        System.out.print("Ingrese el ID del cliente a eliminar: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (Validaciones.validarObjeto(cliente)) {
            clientes.remove(cliente);
            System.out.println("Se eliminó el cliente correctamente");
        } else {
            System.out.println("El cliente no está registrado");
        }
    }

    public void eliminarCuenta() {
        System.out.println("\n--- Eliminar Cuenta ---");
        System.out.print("Ingrese el ID de la cuenta a eliminar: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (Validaciones.validarObjeto(cuenta)) {
            cuentas.remove(cuenta);
            System.out.println("Se eliminó la cuenta correctamente");
        } else {
            System.out.println("La cuenta no está registrada");
        }
    }

    public void eliminarEmpleado() {
        System.out.println("\n--- Eliminar Empleado ---");
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        String idEmpleado = sc.nextLine();
        Empleado empleado = buscarEmpleado(idEmpleado);
        if (Validaciones.validarObjeto(empleado)) {
            empleados.remove(empleado);
            System.out.println("Se eliminó el empleado correctamente");
        } else {
            System.out.println("El empleado no está registrado");
        }
    }

    public void eliminarTitular() {
        if (!verificarPermiso("ELIMINAR_TITULAR")) return;
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
        } else {
            System.out.println("\nError: No hay sesión iniciada.");
        }
    }
    
    public void mostrarListaClientes() {
        System.out.println("\n--- LISTA DE CLIENTES REGISTRADOS ---");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente c : clientes) {
            c.mostrarDatos();
            System.out.println("-------------------------");
        }
    }

    public void mostrarListaEmpleados() {
        System.out.println("\n--- LISTA DE EMPLEADOS REGISTRADOS ---");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        for (Empleado e : empleados) {
            e.mostrarDatos();
            System.out.println("-------------------------");
        }
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
        System.out.println("\n--- ESTADÍSTICAS DEL SISTEMA ---");
        System.out.println("Clientes totales: " + clientes.size());
        System.out.println("Empleados totales: " + empleados.size());
        System.out.println("Cuentas totales: " + cuentas.size());
    }

    /* MÉTODO PRINCIPAL DE EJECUCIÓN DEL MENÚ CON SWITCH */
    public void ejecutarMenuPrincipal() {
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
                Admin admin = (Admin) usuarioActual;     
                if (!admin.puedeRealizarOperacion(opcion)) { 
                    System.out.println("Opción no válida para un Administrador.");
                    continue;
                }
                switch (opcion) {
                    case 1 -> registrarClienteTeclado();
                    case 2 -> mostrarCliente();
                    case 3 -> mostrarListaClientes();
                    case 4 -> eliminarCliente();
                    case 5 -> registrarEmpleadoTeclado();
                    case 6 -> mostrarEmpleado();
                    case 7 -> mostrarListaEmpleados();
                    case 8 -> eliminarEmpleado();
                    case 9 -> crearCuentaTeclado();
                    case 10 -> agregarTitular();
                    case 11 -> mostrarTransacciones();
                    case 12 -> mostrarListaCuentas();
                    case 13 -> mostrarCuenta();
                    case 14 -> eliminarCuenta();
                    case 15 -> depositar();
                    case 16 -> retirar();
                    case 17 -> transferir();
                    case 18 -> pagarServicio();
                    case 19 -> mostrarEstadisticas();
                    case 20 -> { // Cerrar Sesión
                        cerrarSesion();
                        salir = true;
                    }
                    default -> System.out.println("Opción no válida.");
                }
                
            } else if (usuarioActual instanceof Empleado) {
                Empleado empleado = (Empleado) usuarioActual;               
                if (!empleado.puedeRealizarOperacion(opcion)) { 
                    System.out.println("Opción no válida para un Empleado.");
                    continue;
                }
                
                switch (opcion) {
                    case 1 -> registrarClienteTeclado();
                    case 2 -> mostrarCliente();
                    case 3 -> eliminarCliente();
                    case 4 -> crearCuentaTeclado();
                    case 5 -> agregarTitular();
                    case 6 -> mostrarTransacciones();
                    case 7 -> mostrarCuenta();
                    case 8 -> eliminarCuenta();
                    case 9 -> depositar();
                    case 10 -> retirar();
                    case 11 -> pagarServicio();
                    case 12 -> transferir();
                    case 13 -> {
                        cerrarSesion();
                        salir = true;
                    }
                    default -> System.out.println("Opción no válida.");
                }
                
            } else if (usuarioActual instanceof Cliente) {
                Cliente cliente = (Cliente) usuarioActual; 
                if (!cliente.puedeRealizarOperacion(opcion)) { 
                    System.out.println("Opción no válida para un Cliente.");
                    continue;
                }
                switch (opcion) {
                    case 1 -> depositar();
                    case 2 -> retirar();
                    case 3 -> pagarServicio();
                    case 4 -> mostrarTransacciones();
                    case 5 -> mostrarSaldo(); 
                    case 6 -> mostrarDatosUsuarioActual();
                    case 7 -> {
                        cerrarSesion();
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