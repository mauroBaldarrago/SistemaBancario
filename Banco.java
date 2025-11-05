import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cuenta> cuentas;

    public Banco() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        cuentas = new ArrayList<>();
    }

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

    public void registrarCliente(Cliente cliente){
        Cliente c = buscarCliente(cliente.getIdCliente());
        if (c == null)
            clientes.add(cliente);
        else System.out.print("El cliente ya esta registrado");
    }

    public void registrarEmpleado(Empleado empleado){
        Empleado e = buscarEmpleado(empleado.getIdEmpleado());
        if (e == null)
            empleados.add(empleado);
        else System.out.print("El empleado ya esta registrado");
    }

    public void crearCuenta(Cuenta cuenta){
        Cuenta c = buscarCuenta(cuenta.getIdCuenta());
        if (c == null)
            cuentas.add(cuenta);
        else System.out.print("La cuenta ya esta registrada");
    }

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

    public ArrayList<Transaccion> mostrarTransacciones(String idCuenta){
        Cuenta c = buscarCuenta(idCuenta);
        return c.getMovimientos();
    }

    public double mostrarSaldo(String idCuenta){
        Cuenta c = buscarCuenta(idCuenta);
        return c.consultarSaldo();
    }

}
