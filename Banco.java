import java.util.ArrayList;
import java.util.Scanner;
public class Banco {
    Scanner sc = new Scanner(System.in);
    /* Creando los Array List del gestor general */
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cuenta> cuentas;

    /* Constructor de Banco */
    public Banco() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        cuentas = new ArrayList<>();
    }

    /* Método para buscar cliente */
    public Cliente buscarCliente(String idCliente){
        for (Cliente c: clientes){
            if (c.getIdCliente().equals(idCliente)){
                return c;
            }
        }
        return null;
    }

    /* Método para buscar cuenta */
    public Cuenta buscarCuenta(String idCuenta){
        for (Cuenta c: cuentas){
            if (c.getIdCuenta().equals(idCuenta)) {
                return c;
            }
        }
        return null;
    }

    /* Método para buscar empleado */
    public Empleado buscarEmpleado(String idEmpleado){
        for (Empleado e: empleados){
            if (e.getIdEmpleado().equals(idEmpleado)){
                return e;
            }
        }
        return null;
    }

    /* Métodos para registrar cliente */
    public void registrarCliente(Cliente cliente){
        Cliente c = buscarCliente(cliente.getIdCliente());
        if (c == null)
            clientes.add(cliente);
        else System.out.println("El cliente ya esta registrado");
    }
    
    public void registrarClienteTeclado() {
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
        if (!Validaciones.validarDireccion(direccion)){
            System.out.println("Error: Ingrese una dirección válido");
            return;
        }
        System.out.print("Celular: ");
        String celular = sc.nextLine();
        if (!Validaciones.validarCelular(celular)){
            System.out.println("Error: Ingrese un celular válido");
            return;
        }
        System.out.print("Email: ");
        String correo = sc.nextLine();
        if (!Validaciones.validarCorreo(correo)){
            System.out.println("Error: Ingrese un celular válido");
            return;
        }
        System.out.print("ID Cliente: ");
        String idCliente = sc.nextLine();
        if (!Validaciones.validarCodigoCliente(idCliente)){
            System.out.println("Error: Ingrese un ID válido");
            return;
        }
        Cliente nuevo = new Cliente(nombre, apellido, dni, direccion, celular, idCliente, correo, true);
        Cliente c = buscarCliente(nuevo.getIdCliente());
        if (c == null) {
            clientes.add(nuevo);
            System.out.println("Cliente registrado correctamente");
        } else
            System.out.println("El cliente ya está registrado");
    }

    /* Métodos para registrar empleado */
    public void registrarEmpleado(Empleado empleado){
        Empleado e = buscarEmpleado(empleado.getIdEmpleado());
        if (e == null)
            empleados.add(empleado);
        else System.out.println("El empleado ya esta registrado");
    }

    public void registrarEmpleadoTeclado(){
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
        if (!Validaciones.validarDireccion(direccion)){
            System.out.println("Error: Ingrese una dirección válida");
            return;
        }
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
        Empleado nuevo = new Empleado(nombre, apellido, dni, direccion, celular, idEmpleado, cargo);
        Empleado e = buscarEmpleado(nuevo.getIdEmpleado());
        if (e == null) {
            empleados.add(nuevo);
            System.out.println("Empleado registrado correctamente");
        } 
        else 
            System.out.println("El empleado ya está registrado");
    }

    /* Métodos para crear cuenta */
    public void crearCuenta(Cuenta cuenta){
        Cuenta c = buscarCuenta(cuenta.getIdCuenta());
        if (c == null)
            cuentas.add(cuenta);
        else System.out.println("La cuenta ya esta registrada");
    }

    public void crearCuentaTeclado() {
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
    } catch (Exception e) {
        System.out.println("Error: Ingrese un monto válido");
        sc.nextLine();
        return;
    }
    if (!Validaciones.validarSaldo(saldo)){
        System.out.println("Error: El saldo debe estar entre 0 y 1,000,000");
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
    } 
    else
        System.out.println("La cuenta ya está registrada");
}

    /* Método para agregar titulares */
    public void agregarTitular() {
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

    /* Método para hacer depósito */
    public void depositar() {
        System.out.println("\n--- Depósito ---");
        System.out.print("ID del depósito: ");
        String idDeposito = sc.nextLine();
        if (!Validaciones.validarIdTransaccion(idDeposito)) {
            System.out.println("Error: ID de transacción inválido");
            return;
        }
        System.out.print("ID de cuenta: ");
        String idCuenta = sc.nextLine();
        Cuenta cuenta = buscarCuenta(idCuenta);
        System.out.print("ID del cliente: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (!Validaciones.validarObjeto(cliente)) {
            System.out.println("Error: Cliente no válido");
            return;
        }
        System.out.print("ID del empleado: ");
        String idEmpleado = sc.nextLine();
        Empleado empleado = buscarEmpleado(idEmpleado);
        if (!Validaciones.validarObjeto(empleado)) {
            System.out.println("Error: Empleado no válido");
            return;
        }
        System.out.print("Monto a depositar: ");
        double monto = sc.nextDouble();
        if (!Validaciones.validarMontoDeposito(monto)) {
            System.out.println("Error: El monto debe estar entre 10 y 50,000");
            return;
        }
        sc.nextLine();
        if (Validaciones.validarObjeto(cuenta)) {
            Deposito deposito = new Deposito(idDeposito, monto, cliente, empleado);
            deposito.procesar(cuenta, monto, deposito);
        } else 
            System.out.println("Cuenta no encontrada");
    }

    /* Método para hacer retiro */
    public void retirar() {
        System.out.println("\n--- Retiro ---");
        System.out.print("ID del retiro: ");
        String idRetiro = sc.nextLine();
        if (!Validaciones.validarIdTransaccion(idRetiro)) {
            System.out.println("Error: ID de transacción inválido");
            return;
        }
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
        System.out.print("ID del empleado: ");
        String idEmpleado = sc.nextLine();
        Empleado empleado = buscarEmpleado(idEmpleado);
        if (!Validaciones.validarObjeto(empleado)) {
            System.out.println("Error: Empleado no válido");
            return;
        }
        System.out.print("Monto a retirar: ");
        double monto;
        try {
            monto = sc.nextDouble();
            sc.nextLine();
        } catch (Exception e) {
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

    /* Método para hacer transferencia */
    public void transferir() {
        System.out.println("\n--- Transferencia ---");
        System.out.print("ID de la transferencia: ");
        String idTransferencia = sc.nextLine();
        if (!Validaciones.validarIdTransaccion(idTransferencia)) {
            System.out.println("Error: ID de transacción inválido");
            return;
        }
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
        System.out.print("ID del empleado: ");
        String idEmpleado = sc.nextLine();
        Empleado empleado = buscarEmpleado(idEmpleado);
        if (!Validaciones.validarObjeto(empleado)) {
            System.out.println("Error: Empleado no válido");
            return;
        }
        System.out.print("Monto a transferir: ");
        double monto;
        try {
            monto = sc.nextDouble();
            sc.nextLine();
        } catch (Exception e) {
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

    /* Método para mostrar las transacciones de una cuenta */
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

    /* Método para mostrar el saldo de una cuenta */
    public void mostrarSaldo() {
    System.out.println("\n--- Consulta de Saldo ---");
    System.out.print("ID de cuenta: ");
    String idCuenta = sc.nextLine();
    Cuenta cuenta = buscarCuenta(idCuenta);
    if (!Validaciones.validarObjeto(cuenta)) {
        System.out.println("Error: Cuenta no encontrada");
        return;
    }
    System.out.println("Saldo actual: S/. " + cuenta.consultarSaldo());
}

    /* Método para realizar pago de servicio */
    public void pagarServicio() {
    System.out.println("\n--- Pago de Servicio ---");
    System.out.print("ID del pago: ");
    String idPago = sc.nextLine();
    if (!Validaciones.validarIdTransaccion(idPago)) {
        System.out.println("Error: ID de pago inválido");
        return;
    }
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
    System.out.print("ID del empleado: ");
    String idEmpleado = sc.nextLine();
    Empleado empleado = buscarEmpleado(idEmpleado);
    if (!Validaciones.validarObjeto(empleado)) {
        System.out.println("Error: Empleado no válido");
        return;
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
    } catch (Exception e) {
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
    PagoServicio pago = new PagoServicio(idPago, monto, cliente, empleado, tipoServicio);
    pago.procesar(cuenta, monto, pago);
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
        System.out.println("Tarjeta asociada:");
        System.out.println("  - Tipo: " + cuenta.getTarjeta().getTipo());
        System.out.println("  - Número: " + cuenta.getTarjeta().getNumeroTarjeta());
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
}