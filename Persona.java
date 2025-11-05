public class Persona {
    /* Creando los atributos de la clase padre "Persona" */
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String direccion;
    protected String celular;

    /* Constructor de Persona */
    public Persona(String nombre, String apellido, String dni, String direccion, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
    }

    /* Getters y Setters */
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public String getDni() {return dni;}
    public void setDni(String dni) {
        if (!validarDNI(dni)) {
            System.out.println("El formato de DNI es inválido");
            this.dni = null;
        }
        this.dni = dni;
    }
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public String getCelular() {return celular;}
    public void setCelular(String celular) {
        if (!validarCelular(celular)) {
            System.out.println("El formato de celular es inválido");
            this.celular = null;
        }
        this.celular = celular;
    }

    /* Validaciones */
    public static boolean validarDNI(String dni) {
        return dni.matches("^\\d{8}$");
    }
    public static boolean validarCelular(String numero) {
        return numero.matches("^9\\d{8}$");
    }
    
    /* Método para mostrar los datos de Persona */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Celular: " + celular);
    }
}