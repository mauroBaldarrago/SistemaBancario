package Logica;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorUsuarios {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Admin> admins;

    public GestorUsuarios() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        admins = new ArrayList<>();
    }

    // Cliente inicializado
    public void registrarCliente(Cliente cliente){
        Cliente c = buscarCliente(cliente.getIdCliente());
        if (c == null) 
            clientes.add(cliente);
    }

    // Cliente teclado
    public void registrarClienteTeclado() {
        System.out.println("\n--- REGISTRAR NUEVO CLIENTE ---");
        
        String dni;
        while (true) {
            System.out.print("DNI: ");
            dni = sc.nextLine();
            if (Validaciones.validarDNI(dni)) {break;}
            System.out.println("Error: Ingrese un DNI válido (8 dígitos)");
        }
        
        String nombre;
        while (true) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            if (Validaciones.validarNombre(nombre)) {break;}
            System.out.println("Error: Ingrese un nombre válido (solo letras, 2-50 caracteres)");
        }
        
        String apellido;
        while (true) {
            System.out.print("Apellido: ");
            apellido = sc.nextLine();
            if (Validaciones.validarNombre(apellido)) {break;}
            System.out.println("Error: Ingrese un apellido válido (solo letras, 2-50 caracteres)");
        }
        
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        
        String celular;
        while (true) {
            System.out.print("Celular: ");
            celular = sc.nextLine();
            if (Validaciones.validarCelular(celular)) {break;}
            System.out.println("Error: Ingrese un celular válido (9 dígitos, debe empezar con 9)");
        }
        
        String correo;
        while (true) {
            System.out.print("Email: ");
            correo = sc.nextLine();
            if (Validaciones.validarCorreo(correo)) {break;}
            System.out.println("Error: Ingrese un correo válido (formato: usuario@dominio.com)");
        }
        
        String idCliente;
        while (true) {
            System.out.print("ID Cliente: ");
            idCliente = sc.nextLine();
            if (Validaciones.validarCodigoCliente(idCliente)) {break;}
            System.out.println("Error: Ingrese un ID válido (formato: CLI seguido de 3 dígitos)");
        }
        
        String contrasena;
        while (true) {
            System.out.print("Contraseña: ");
            contrasena = sc.nextLine();
            if (Validaciones.validarTexto(contrasena)) {break;}
            System.out.println("Error: Ingrese una contraseña válida (no puede estar vacía)");
        }
        
        Cliente nuevo = new Cliente(nombre, apellido, dni, direccion, celular, idCliente, correo, contrasena);
        Cliente c = buscarCliente(nuevo.getIdCliente());
        if (c == null) {
            clientes.add(nuevo);
            System.out.println("Cliente registrado correctamente");
        } else
            System.out.println("El cliente ya está registrado");
    }

    // Empleado inicializado
    public void registrarEmpleado(Empleado empleado){
        Empleado e = buscarEmpleado(empleado.getIdEmpleado());
        if (e == null)
            empleados.add(empleado);
    }

    // Empleado teclado
    public void registrarEmpleadoTeclado(){
        System.out.println("\n--- REGISTRAR NUEVO EMPLEADO ---");
        
        String dni;
        while (true) {
            System.out.print("DNI: ");
            dni = sc.nextLine();
            if (Validaciones.validarDNI(dni)) {break;}
            System.out.println("Error: Ingrese un DNI válido (8 dígitos)");
        }
        
        String nombre;
        while (true) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            if (Validaciones.validarNombre(nombre)) {break;}
            System.out.println("Error: Ingrese un nombre válido (solo letras, 2-50 caracteres)");
        }
        
        String apellido;
        while (true) {
            System.out.print("Apellido: ");
            apellido = sc.nextLine();
            if (Validaciones.validarNombre(apellido)) {break;}
            System.out.println("Error: Ingrese un apellido válido (solo letras, 2-50 caracteres)");
        }
        
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        
        String celular;
        while (true) {
            System.out.print("Celular: ");
            celular = sc.nextLine();
            if (Validaciones.validarCelular(celular)) {break;}
            System.out.println("Error: Ingrese un celular válido (9 dígitos, debe empezar con 9)");
        }
        
        String idEmpleado;
        while (true) {
            System.out.print("ID Empleado: ");
            idEmpleado = sc.nextLine();
            if (Validaciones.validarCodigoEmpleado(idEmpleado)) {break;}
            System.out.println("Error: Ingrese un ID válido (formato: EMP seguido de 3 dígitos)");
        }
        
        String cargo;
        while (true) {
            System.out.print("Cargo: ");
            cargo = sc.nextLine();
            if (Validaciones.validarTexto(cargo)) {break;}
            System.out.println("Error: Ingrese un cargo válido (no puede estar vacío)");
        }
        
        String correo;
            while (true) {
                System.out.print("Correo: ");
                correo = sc.nextLine();
                if (Validaciones.validarCorreo(correo)) {
                    break;
                }
                System.out.println("Error: Ingrese un correo válido (ej: ejemplo@dominio.com)");
            }

        String contrasena;
        while (true) {
            System.out.print("Contraseña: ");
            contrasena = sc.nextLine();
            if (Validaciones.validarTexto(contrasena)) {break;}
            System.out.println("Error: Ingrese una contraseña válida (no puede estar vacía)");
        }
        
        Empleado nuevo = new Empleado(nombre, apellido, dni, direccion, celular, idEmpleado, cargo, correo, contrasena);
        Empleado e = buscarEmpleado(nuevo.getIdEmpleado());
        if (e == null) {
            empleados.add(nuevo);
            System.out.println("Empleado registrado correctamente");
        } else
            System.out.println("El empleado ya está registrado");
    }

    // Admin inicializado
    public void registrarAdmin(Admin admin){
        Admin a = buscarAdmin(admin.getIdAdmin());
        if (a == null)
            admins.add(admin);
    }

    /* MÉTODOS PARA ELIMINAR USUARIOS */
    //Eliminar cliente
    public void eliminarCliente() {
        System.out.println("\n--- Eliminar Cliente ---");
        System.out.print("Ingrese el ID del cliente a eliminar: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarCliente(idCliente);
        if (Validaciones.validarObjeto(cliente)) {
            clientes.remove(cliente);
            System.out.println("Se eliminó el cliente correctamente");
        } else
            System.out.println("El cliente no está registrado");
    }

    //Eliminar empleado
    public void eliminarEmpleado() {
        System.out.println("\n--- Eliminar Empleado ---");
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        String idEmpleado = sc.nextLine();
        Empleado empleado = buscarEmpleado(idEmpleado);
        if (Validaciones.validarObjeto(empleado)) {
            empleados.remove(empleado);
            System.out.println("Se eliminó el empleado correctamente");
        } else
            System.out.println("El empleado no está registrado");
    }

    /* MÉTODOS PARA BUSCAR */
    // Buscar cliente
    public Cliente buscarCliente(String idCliente){
        for (Cliente c: clientes){
            if (c.getIdCliente().equals(idCliente)){
                return c;
            }
        }
        return null;
    }

    // Buscar empleado
    public Empleado buscarEmpleado(String idEmpleado){
        for (Empleado e: empleados){
            if (e.getIdEmpleado().equals(idEmpleado)){
                return e;
            }
        }
        return null;
    }

    // Buscar admin
    public Admin buscarAdmin(String idAdmin){
        for (Admin a: admins){
            if (a.getIdAdmin().equals(idAdmin)){
                return a;
            }
        }
        return null;
    }

    // Estadísticas del sistema
    public void mostrarEstadisticas() {
        System.out.println("\n--- ESTADÍSTICAS DEL SISTEMA ---");
        System.out.println("Clientes totales: " + clientes.size());
        System.out.println("Empleados totales: " + empleados.size());
    }

    // Mostrar listas completas
    public void mostrarListaClientes() {
        System.out.println("\n--- LISTA DE CLIENTES REGISTRADOS ---");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente c : clientes) {
            c.mostrarDatos();
            System.out.println("-------------------------");
        }
    }

    public void mostrarListaEmpleados() {
        System.out.println("\n--- LISTA DE EMPLEADOS REGISTRADOS ---");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        for (Empleado e : empleados) {
            e.mostrarDatos();
            System.out.println("-------------------------");
        }
    }

    /* GETTERS */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public ArrayList<Admin> getAdmins() {
        return admins;
    }
}