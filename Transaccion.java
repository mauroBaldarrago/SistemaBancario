public class Transaccion {
    /* Creando los atributos de la clase padre "Transacción" */
    private String idTransaccion;
    private double monto;
    private String fecha;
    private Cliente cliente;
    private Empleado empleado;

    /* Constructor de Transacción */
    public Transaccion(String idTransaccion, double monto, String fecha, Cliente cliente, Empleado empleado){
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    /* Getters y Setters */
    public String getIdTransaccion() { return idTransaccion;}
    public void setIdTransaccion(String idTransaccion) { this.idTransaccion = idTransaccion; }
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { 
        if (!validarFecha(fecha)) {
            System.out.println("El formato de fecha es inválido");
            this.fecha = null;
        }
        this.fecha = fecha; 
    }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }
    public void procesar(){}

    /* Validaciones */
    public static boolean validarFecha(String fecha) {
        return fecha.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");
    }
}
