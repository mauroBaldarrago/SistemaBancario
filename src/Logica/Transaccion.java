package Logica;
import java.time.LocalDate;

public class Transaccion {
    /* Creando los atributos de la clase padre "Transacción" */
    protected String idTransaccion;
    protected double monto;
    protected LocalDate fecha;
    protected Cliente cliente;
    protected Empleado empleado;

    /* Constructor de Transacción */
    public Transaccion(String idTransaccion, double monto, Cliente cliente, Empleado empleado){
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.empleado = empleado;
    }

    /* Getters y Setters */
    public String getIdTransaccion() { return idTransaccion;}
    public void setIdTransaccion(String idTransaccion) { this.idTransaccion = idTransaccion; }
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
    public String getFecha() { return fecha.toString(); }
    public void procesar(Cuenta cuenta, int monto){}

    /* Método para mostrar los datos comunes de la transacción */
    public void mostrarDetalles() {
        String empleadoId = (empleado != null) ? empleado.getIdEmpleado() : "N/A (Autoservicio)";
        System.out.println("-------------------------------------");
        System.out.println("ID Transacción: " + idTransaccion);
        System.out.println("Monto: S/. " + monto);
        System.out.println("Fecha: " + fecha.toString());
        System.out.println("Cliente Principal: " + cliente.getNombre() + " " + cliente.getApellido() + " (DNI: " + cliente.getDni() + ")");
        System.out.println("Procesado por Empleado ID: " + empleadoId);
    }

    public void procesar(){}
}