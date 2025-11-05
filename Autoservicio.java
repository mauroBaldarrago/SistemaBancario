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

    /* Método de depositar (de autoservicio)*/
    public void depositar(Cliente cliente, Cuenta cuenta, double monto, Empleado empleado, String fecha) {
        if (cuenta == null) {
            System.out.println("Cuenta no encontrada");
        }
        Deposito deposito = new Deposito(cuenta.getIdCuenta(), monto, fecha, cliente, empleado);
        cuenta.depositar(deposito);
    }

    /* Método de retirar (de autoservicio)*/
    public void retirar(Cliente cliente, Cuenta cuenta, double monto, Empleado empleado, String fecha) {
        if (cuenta == null) {
            System.out.println("Cuenta no encontradaa");
        }
        Retiro retiro = new Retiro(cuenta.getIdCuenta(), monto, fecha, cliente, empleado);
        cuenta.retirar(retiro);
    }
}