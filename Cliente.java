class Cliente extends Persona {
    private String idCliente;
    private String correo;
    private boolean activo;

    public Cliente(String nombre, String apellido, String dni, String direccion, String celular,
                   String idCliente, String correo, boolean activo) {
        super(nombre, apellido, dni, direccion, celular);
        this.idCliente = idCliente;
        this.correo = correo;
        this.activo = activo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("Correo: " + correo);
        System.out.println("Activo: " + activo);
    }
}