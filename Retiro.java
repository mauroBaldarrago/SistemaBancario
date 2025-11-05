public class Retiro extends Transaccion{

    public Retiro(String idTransaccion, double monto, String fecha, Cliente cliente, Empleado empleado) {
        super(idTransaccion, monto, fecha, cliente, empleado);
    }

    public void procesar() {
        System.out.println("Retiro realizado de " +getMonto()+ " por " +getCliente().getNombre());
    }

}
