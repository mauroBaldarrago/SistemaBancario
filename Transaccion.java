public class Transaccion {
    
    private String idTransaccion;
    private double monto;
    private String fecha;
    private Cliente cliente;
    private Empleado empleado;

    public Transaccion(String idTransaccion, double monto, String fecha, Cliente cliente, Empleado empleado){
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public String getIdTransaccion() { return idTransaccion;}

    public void setIdTransaccion(String idTransaccion) { this.idTransaccion = idTransaccion; }

    public double getMonto() { return monto; }

    public void setMonto(double monto) { this.monto = monto; }

    public String getFecha() { return fecha; }

    public void setFecha(String fecha) { this.fecha = fecha; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Empleado getEmpleado() { return empleado; }

    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }

    public void procesar(){}
}
