package Logica;
public class Cliente extends Usuario {
    /* Creando los atributos de la clase hija "Cliente" */
    private String idCliente;
    private String correo;
    private boolean activo;

    /* Constructor de Cliente (polimorfismo y heredación) */
    public Cliente(String nombre, String apellido, String dni, String direccion, String celular, String idCliente, String correo, String contrasena) {
        super(nombre, apellido, dni, direccion, celular, contrasena);
        this.idCliente = idCliente;
        this.correo = correo;
        this.activo = true;
    }
    public Cliente() {
        super("", "", "", "", "", "");
        this.idCliente = "";
        this.correo = "";
        this.activo = true;
    }

    /* Getters necesarios */
    public String getIdCliente() {return idCliente;}
    public String getCorreo() {return correo;}
    public String getDireccion() {return direccion;}
    public boolean isActivo() {return activo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setActivo(boolean activo) {this.activo = activo;}

    /* Método para mostrar los datos de Cliente (polimorfismo y heredación) */
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("Correo: " + correo);
        System.out.println("Activo: " + (activo ? "Sí" : "No"));
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("\n=== PERMISOS DE CLIENTE ===");
        System.out.println("1. Procesar Depósito");
        System.out.println("2. Procesar Retiro");
        System.out.println("3. Pagar servicios");
        System.out.println("4. Procesar Transferencia");       
        System.out.println("5. Mostrar Transacciones");
        System.out.println("6. Consultar Saldo");
        System.out.println("7. Mostrar mis Datos");
        System.out.println("8. Cerrar Sesión");
    }
}