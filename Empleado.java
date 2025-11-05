class Empleado extends Persona {
    /* Creando los atributos de la clase hija "Empleado" */
    private String idEmpleado;
    private String cargo;

    /* Constructor de Empleado (polimorfismo y heredación) */
    public Empleado(String nombre, String apellido, String dni, String direccion, String celular, String idEmpleado, String cargo) {
        super(nombre, apellido, dni, direccion, celular);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    /* Getters necesarios*/
    public String getIdEmpleado() {return idEmpleado;}
    public String getCargo() {return cargo;}

    /* Método para mostrar la transacción realizada */
    public void procesarTransaccion(String transaccion, String cargo) {
        System.out.println("Procesando transacción: " + transaccion + " con cargo: " + cargo);
    }

    /* Método para mostrar el depósito */
    public void depositar(Cliente cliente, String cuenta, double monto) {
        System.out.println("Empleado " + nombre + " depositó " + monto + " en cuenta de " + cliente.nombre);
    }

    /* Método para mostrar el retiro */
    public void retirar(String cuenta, double monto) {
        System.out.println("Empleado " + nombre + " retiró " + monto + " de la cuenta " + cuenta);
    }

    /* Método para mostrar los datos de Empleado (polimorfismo y heredación) */
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Cargo: " + cargo);
    }
}