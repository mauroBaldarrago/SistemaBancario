import java.util.ArrayList;
public class Banco {
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

    /* Método para registrar cliente */
    public void registrarCliente(Cliente cliente){
        Cliente c = buscarCliente(cliente.getIdCliente());
        if (c == null)
            clientes.add(cliente);
        else System.out.println("El cliente ya esta registrado");
    }

    /* Método para registrar empleado */
    public void registrarEmpleado(Empleado empleado){
        Empleado e = buscarEmpleado(empleado.getIdEmpleado());
        if (e == null)
            empleados.add(empleado);
        else System.out.println("El empleado ya esta registrado");
    }

    /* Método para crear cuenta */
    public void crearCuenta(Cuenta cuenta){
        Cuenta c = buscarCuenta(cuenta.getIdCuenta());
        if (c == null)
            cuentas.add(cuenta);
        else System.out.println("La cuenta ya esta registrada");
    }

    /* Método para hacer depósito */
    public void depositar(String idCuenta, String idDeposito, String fecha, double monto, Cliente cliente, Empleado empleado) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta != null) {
            Deposito deposito = new Deposito(idDeposito, monto, fecha, cliente, empleado);
            deposito.procesar(cuenta, monto, deposito);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    /* Método para hacer retiro */
    public void retirar(String idCuenta, String idRetiro, String fecha, double monto, Cliente cliente, Empleado empleado) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta != null) {
            Retiro retiro = new Retiro(idRetiro, monto, fecha, cliente, empleado);
            retiro.procesar(cuenta, monto, retiro);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    public void transferencia(String idCuenta1, String idCuenta2, String idTransaccion, String fecha, double monto, Cliente cliente1, Cliente cliente2, Empleado empleado) {
        Cuenta cuenta1 = buscarCuenta(idCuenta1);
        Cuenta cuenta2 = buscarCuenta(idCuenta2);
        if (cuenta1 != null && cuenta2 != null) {
            Transferencia transferencia = new Transferencia(idTransaccion, monto, fecha, cliente1, cliente2, empleado);
            transferencia.procesar(cuenta1, cuenta2, monto, transferencia);
        } else {
            System.out.println("Error en la transferencia");
        }
    }

    /* Método para mostrar las transacciones de una cuenta */
    public ArrayList<Transaccion> mostrarTransacciones(String idCuenta){
        Cuenta c = buscarCuenta(idCuenta);
        return c.getMovimientos();
    }

    /* Método para mostrar el saldo de una cuenta */
    public double mostrarSaldo(String idCuenta){
        Cuenta c = buscarCuenta(idCuenta);
        return c.consultarSaldo();
    }

    /* Método para realizar pago de servicio */
    public void pagarServicio(String idCuenta, String idPago, String fecha, double monto, Cliente cliente, Empleado empleado, String tipoServicio) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta == null) {
            System.out.println("Cuenta no encontrada.");
            return;
        }
        if (!Transaccion.validarFecha(fecha)) {
            System.out.println("El formato de fecha es inválido. Use dd/mm/aaaa.");
            return;
        }
        if (cuenta.consultarSaldo() < monto) {
            System.out.println("Saldo insuficiente para pagar el servicio: " + tipoServicio);
            return;
        }
        PagoServicio pago = new PagoServicio(idPago, monto, fecha, cliente, empleado, tipoServicio);
        pago.procesar(cuenta, monto, pago);
    }

    public void mostrarEmpleado(String idEmpleado){
        Empleado empleado=buscarEmpleado(idEmpleado);
        if (empleado!=null){
        empleado.mostrarDatos();
        }
        else System.out.println("El empleado no se encontró");
    }

    public void mostrarCliente(String idCliente){
        Cliente cliente=buscarCliente(idCliente);
        if (cliente!=null){
        cliente.mostrarDatos();
        }
        else System.out.println("El cliente no se encontró");
    }

    public void eliminarCliente(String idCliente){
        Cliente cliente=buscarCliente(idCliente);
        if (cliente != null){
        clientes.remove(cliente);
        System.out.println("Se elimino el cliente correctamente");
        }
        else System.out.println("El cliente no esta registrado");
    }

    public void eliminarCuenta(String idCuenta){
        Cuenta cuenta=buscarCuenta(idCuenta);
        if (cuenta != null){
        cuentas.remove(cuenta);
        System.out.println("Se elimino la cuenta correctamente");
        }
        else System.out.println("La cuenta no esta registrada");
    }

    public void eliminarEmpleado(String idEmpleado){
        Empleado empleado=buscarEmpleado(idEmpleado);
        if (empleado != null){
        empleados.remove(empleado);
        System.out.println("Se elimino el empleado correctamente");
        }
        else System.out.println("El empleado no esta registrado");
    }

}

