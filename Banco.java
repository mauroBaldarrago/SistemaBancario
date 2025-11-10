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
        else System.out.print("El cliente ya esta registrado");
    }

    /* Método para registrar empleado */
    public void registrarEmpleado(Empleado empleado){
        Empleado e = buscarEmpleado(empleado.getIdEmpleado());
        if (e == null)
            empleados.add(empleado);
        else System.out.print("El empleado ya esta registrado");
    }

    /* Método para crear cuenta */
    public void crearCuenta(Cuenta cuenta){
        Cuenta c = buscarCuenta(cuenta.getIdCuenta());
        if (c == null)
            cuentas.add(cuenta);
        else System.out.print("La cuenta ya esta registrada");
    }

    /* Método para hacer depósito */
    public void depositar(String idCuenta, String fecha, double monto, Cliente cliente, Empleado empleado) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta != null) {
            Deposito deposito = new Deposito(idCuenta, monto, fecha, cliente, empleado);
            cuenta.depositar(deposito);
            cuenta.getMovimientos().add(deposito);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    /* Método para hacer retiro */
    public void retirar(String idCuenta, String fecha, double monto, Cliente cliente, Empleado empleado) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta != null) {
            Retiro retiro = new Retiro(idCuenta, monto, fecha, cliente, empleado);
            cuenta.getMovimientos().add(retiro);
            cuenta.retirar(retiro);
        } else {
            System.out.println("Cuenta no encontrada");
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
    public void pagarServicio(String idCuenta, String fecha, double monto, Cliente cliente, Empleado empleado, String tipoServicio) {
        Cuenta cuenta = buscarCuenta(idCuenta);

        if (cuenta == null) {
            System.out.println("Cuenta no encontrada.");
            return;
        }

        /* Validar formato de fecha */
        if (!Transaccion.validarFecha(fecha)) {
            System.out.println("El formato de fecha es inválido. Use dd/mm/aaaa.");
            return;
        }

        /* Verificar saldo suficiente */
        if (cuenta.consultarSaldo() < monto) {
            System.out.println("Saldo insuficiente para pagar el servicio: " + tipoServicio);
            return;
        }

        /* Crear y registrar la transacción */
        PagoServicio pago = new PagoServicio(idCuenta, monto, fecha, cliente, empleado, tipoServicio);
        pago.procesar();

        /* Descontar el monto del saldo */
        cuenta.setSaldo(cuenta.consultarSaldo() - monto);

        /* Registrar el movimiento */
        cuenta.getMovimientos().add(pago);

        System.out.println("Pago del servicio '" + tipoServicio + "' realizado exitosamente por el monto de " + monto);
    }
}

