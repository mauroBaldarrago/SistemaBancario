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
    @Override
    public void procesar() {
        System.out.println("Procesando pago del servicio: " + tipoServicio);
    }
}
