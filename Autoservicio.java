public class Autoservicio {

    private String tipo;

    public Autoservicio(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void depositar(Cliente cliente, Cuenta cuenta, double monto, Empleado empleado, String fecha) {
        if (cuenta == null) {
            System.out.println("Cuenta no encontrada");
        }
        Deposito deposito = new Deposito(cuenta.getIdCuenta(), monto, fecha, cliente, empleado);
        cuenta.depositar(deposito);
    }

    public void retirar(Cliente cliente, Cuenta cuenta, double monto, Empleado empleado, String fecha) {
        if (cuenta == null) {
            System.out.println("Cuenta no encontradaa");
        }
        Retiro retiro = new Retiro(cuenta.getIdCuenta(), monto, fecha, cliente, empleado);
        cuenta.retirar(retiro);
    }

}
