package Logica;
public class Empleado extends Usuario {
    /* Creando los atributos de la clase hija "Empleado" */
    private String idEmpleado;
    private String cargo;
    private String correo;

    /* Constructor de Empleado (polimorfismo y heredación) */
    public Empleado(String nombre, String apellido, String dni, String direccion,
                    String celular, String idEmpleado, String cargo,
                    String correo, String contrasena) {

        super(nombre, apellido, dni, direccion, celular, contrasena);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.correo = correo;
    }


    /* Getters necesarios*/
    public String getIdEmpleado() {return idEmpleado;}
    public String getCargo() {return cargo;}
    public String getDireccion() {return direccion;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public String getCorreo() {return correo;}

    /* Método para mostrar la transacción realizada */
    public void procesarTransaccion(String transaccion, String cargo) {
        System.out.println("Procesando transacción: " + transaccion + " con cargo: " + cargo);
    }

    /* Método para mostrar el depósito */
    public void depositar(Cliente cliente, String cuenta, double monto) {
        System.out.println("Empleado " + nombre + " depositó " + monto + " en cuenta de " + cliente.getNombre());
    }

    /* Método para mostrar el retiro */
    public void retirar(String cuenta, double monto) {
        System.out.println("Empleado " + nombre + " retiró " + monto + " de la cuenta " + cuenta);
    }

    /* Método para mostrar los datos de Empleado (polimorfismo y heredación) */
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Cargo: " + cargo);
    }

    @Override
    public void mostrarPermisos(){
        System.out.println("\n=== PERMISOS DE EMPLEADO ===");
        System.out.println("\n--- ACCIONES PARA CLIENTE ---");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Mostrar Cliente");
        System.out.println("3. Eliminar Cliente");
        
        System.out.println("\n--- ACCIONES PARA CUENTA ---");
        System.out.println("4. Abrir Cuenta");
        System.out.println("5. Agregar Titular a Cuenta");
        System.out.println("6. Mostrar transacciones de Cuenta");
        System.out.println("7. Mostrar Cuenta");
        System.out.println("8. Eliminar Cuenta");
        
        System.out.println("\n--- TRANSACCIONES ---");
        System.out.println("9. Procesar Depósito");
        System.out.println("10. Procesar Retiro");
        System.out.println("11. Pagar servicios");
        System.out.println("12. Procesar Transferencia");
        System.out.println("\n13. Cerrar Sesión");    
    }
}