public class Autoservicio {
    /* Creando el atributo de clase intermedia Autoservicio */
    private String tipo;

    /* Constructor de Autoservicio */
    public Autoservicio(String tipo) {
        this.tipo = tipo;
    }

    /* Getter necesario */
    public String getTipo() {
        return tipo;
    }

    /* Método de depositar (de autoservicio)
    public void depositar(String idCuenta, String idDeposito, String fecha, double monto, Cliente cliente, Empleado empleado) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta != null) {
            Deposito deposito = new Deposito(idDeposito, monto, fecha, cliente, empleado);
            deposito.procesar(cuenta, monto, deposito);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    public void retirar(String idCuenta, String idDeposito, String fecha, double monto, Cliente cliente, Empleado empleado) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta != null) {
            Retiro retiro = new Retiro(idCuenta, monto, fecha, cliente, empleado);
            retiro.procesar(cuenta, monto, retiro);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }
    */
}