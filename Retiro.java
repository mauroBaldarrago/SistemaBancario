public class Retiro extends Transaccion{
    /* Constructor de Retiro (polimorfismo y heredación) */
    public Retiro(String idTransaccion, double monto, Cliente cliente, Empleado empleado) {
        super(idTransaccion, monto, cliente, empleado);
    }

    /* Método "procesar" de Retiro (polimorfismo y heredación) */
        public void procesar(Cuenta cuenta, double monto, Retiro retiro) {
        cuenta.setSaldo(cuenta.consultarSaldo()-monto);
        cuenta.agregarRetiro(retiro);
        System.out.println("Se retiró correctamente el monto");
    }
}