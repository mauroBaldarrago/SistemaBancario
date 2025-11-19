public class Deposito extends Transaccion{
    /* Constructor de Deposito (polimorfismo y heredación) */
    public Deposito(String idTransaccion, double monto, Cliente cliente, Empleado empleado){
        super(idTransaccion, monto, cliente, empleado);
    }

    /* Método "procesar" de Deposito (polimorfismo y heredación) */
    public void procesar(Cuenta cuenta, double monto, Deposito deposito) {
        cuenta.setSaldo(cuenta.consultarSaldo()+monto);
        cuenta.agregarDeposito(deposito);
        System.out.println("Se depósito correctamente el monto");
    }
}