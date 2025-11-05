public class Deposito extends Transaccion{

    public Deposito(String idTransaccion, double monto, String fecha, Cliente cliente, Empleado empleado){
        super(idTransaccion, monto, fecha, cliente, empleado);
    }

    @Override
    public void procesar() {
        System.out.println("Depósito realizado de "+getMonto()+"por"+getCliente().getNombre());
    }
}
