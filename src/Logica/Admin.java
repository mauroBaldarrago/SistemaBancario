package Logica;
public class Admin extends Usuario{
    private String idAdmin;
    
    public Admin(String nombre, String apellido, String dni, String direccion, String celular, String contrasena, String idAdmin) {
        super(nombre, apellido, dni, direccion, celular, contrasena);
        this.idAdmin = idAdmin;
    }

    /* Getters y Setters */
    public String getIdAdmin() {return idAdmin;}
    public void setIdAdmin(String idAdmin) {this.idAdmin = idAdmin;}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Admin: " + idAdmin);
        System.out.println("Nivel de Acceso: COMPLETO");
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("\n=== PERMISOS DE ADMINISTRADOR (ACCESO COMPLETO) ===");
        System.out.println("\n--- ACCIONES PARA CLIENTE ---");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Mostrar Cliente");
        System.out.println("3. Consultar Lista de Clientes");
        System.out.println("4. Eliminar Cliente");
        
        System.out.println("\n--- ACCIONES PARA EMPLEADOS ---");
        System.out.println("5. Registrar Empleado");
        System.out.println("6. Mostrar Empleado");
        System.out.println("7. Mostrar Lista de Empleados");
        System.out.println("8. Eliminar Empleado");
        
        System.out.println("\n--- ACCIONES PARA CUENTA ---");
        System.out.println("9. Abrir Cuenta");
        System.out.println("10. Agregar Titular a Cuenta");
        System.out.println("11. Mostrar transacciones de Cuenta");
        System.out.println("12. Mostrar Lista de Cuentas");
        System.out.println("13. Mostrar Cuenta");
        System.out.println("14. Eliminar Cuenta");

        System.out.println("\n--- TRANSACCIONES ---");
        System.out.println("15. Realizar Depósito");
        System.out.println("16. Realizar Retiro");
        System.out.println("17. Realizar Transferencia");
        System.out.println("18. Pagar servicios");
        
        System.out.println("\n--- ADMINISTRACIÓN ---");
        System.out.println("19. Ver Estadísticas del Sistema");
        System.out.println("20. Cerrar Sesión");
    }
}