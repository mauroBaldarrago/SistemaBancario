public class Retiro extends Transaccion{
    /* Constructor de Retiro (polimorfismo y heredación) */
    public Retiro(String idTransaccion, double monto, String fecha, Cliente cliente, Empleado empleado) {
        super(idTransaccion, monto, fecha, cliente, empleado);
    }

    /* Método "procesar" de Retiro (polimorfismo y heredación) */
    public void procesar() {
        System.out.println("Retiro realizado de " +getMonto()+ " por " +getCliente().getNombre());
    }

}
