public class PagoServicio extends Transaccion {

    private String tipoServicio; // luz, agua, internet, etc.

    /* Constructor */
    public PagoServicio(String idTransaccion, double monto, String fecha, Cliente cliente, Empleado empleado, String tipoServicio) {
        super(idTransaccion, monto, fecha, cliente, empleado);
        this.tipoServicio = tipoServicio;
    }

    /* Getter */
    public String getTipoServicio() { return tipoServicio; }

    /* Procesar pago */
    public void procesar(Cuenta cuenta, double monto, PagoServicio pagoServicio) {
        cuenta.setSaldo(cuenta.consultarSaldo()-monto);
        cuenta.agregarPago(pagoServicio);
        System.out.println("Pago del servicio '" + tipoServicio + "' realizado exitosamente por el monto de " + monto);
    }
}
