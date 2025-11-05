public class Deposito extends Transaccion{
    /* Constructor de Deposito (polimorfismo y heredación) */
    public Deposito(String idTransaccion, double monto, String fecha, Cliente cliente, Empleado empleado){
        super(idTransaccion, monto, fecha, cliente, empleado);
    }

    /* Método "procesar" de Deposito (polimorfismo y heredación) */
    @Override
    public void procesar() {
        System.out.println("Depósito realizado de "+getMonto()+" por "+getCliente().getNombre());
    }
}
