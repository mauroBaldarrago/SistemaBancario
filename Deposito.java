public class Deposito extends Transaccion{
    /* Constructor de Deposito (polimorfismo y heredación) */
    public Deposito(String idTransaccion, double monto, String fecha, Cliente cliente, Empleado empleado){
        super(idTransaccion, monto, fecha, cliente, empleado);
    }

    /* Método "procesar" de Deposito (polimorfismo y heredación) */
    public void procesar(Cuenta cuenta, double monto, Deposito deposito) {
        cuenta.setSaldo(cuenta.consultarSaldo()+monto);
        cuenta.agregarDeposito(deposito);
        System.out.println("Se despositó correctamente el monto");
    }
}
