public class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String direccion;
    protected String celular;

    public Persona(String nombre, String apellido, String dni, String direccion, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Celular: " + celular);
    }
}