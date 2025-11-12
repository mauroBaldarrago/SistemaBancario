public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String direccion;
    protected String celular;
    protected String contrasena; 
    protected boolean estado; 

    public Usuario(String nombre, String apellido, String dni, String direccion, String celular, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
        this.contrasena = contrasena;
        this.estado = true; 
    }
    
    /* Getters necesarios */
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni() { return dni; }
    public String getCelular() {return celular;}

    /* Método de autenticación */
    public boolean verificarContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }

    /* Métodos Polimórficos y Abstractos */
    public void mostrarDatos() {
        System.out.println("\n--- DATOS DEL USUARIO ---");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Celular: " + celular);
        System.out.println("Estado: " + (estado ? "Activo" : "Inactivo"));
    }
    
    public abstract void mostrarPermisos();

    public abstract boolean puedeRealizarOperacion(int opcion);
}