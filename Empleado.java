class Empleado extends Persona {
    private String idEmpleado;
    private String cargo;

    public Empleado(String nombre, String apellido, String dni, String direccion, String celular,
                    String idEmpleado, String cargo) {
        super(nombre, apellido, dni, direccion, celular);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public void procesarTransaccion(String transaccion, String cargo) {
        System.out.println("Procesando transacción: " + transaccion + " con cargo: " + cargo);
    }

    public void depositar(Cliente cliente, String cuenta, double monto) {
        System.out.println("Empleado " + nombre + " depositó " + monto + " en cuenta de " + cliente.nombre);
    }

    public void retirar(String cuenta, double monto) {
        System.out.println("Empleado " + nombre + " retiró " + monto + " de la cuenta " + cuenta);
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Cargo: " + cargo);
    }
}