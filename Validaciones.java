public class Validaciones {
    
    /* Constructor privado para clase de utilidad estática */
    private Validaciones() {} 
    
    // VALIDACIÓN BÁSICA
    public static boolean validarTexto(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
    
    public static boolean validarObjeto(Object objeto) {
        return objeto != null;
    }
    
    // VALIDACIONES DE PERSONA
    public static boolean validarNombre(String nombre) {
        if (!validarTexto(nombre)) return false;
        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}");
    }
    
    public static boolean validarDNI(String dni) {
        if (!validarTexto(dni)) return false;
        return dni.matches("\\d{8}");
    }
    
    public static boolean validarCelular(String celular) {
        if (!validarTexto(celular)) return false;
        return celular.matches("9\\d{8}");
    }
    
    public static boolean validarCorreo(String correo) {
        if (!validarTexto(correo)) return false;
        return correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,4}$");
    }
    
    // VALIDACIONES DE CÓDIGOS
    public static boolean validarCodigoCliente(String id) {
        return id != null && id.matches("CLI\\d{3}"); 
    }

    public static boolean validarCodigoEmpleado(String id) {
        return id != null && id.matches("EMP\\d{3}"); 
    }
    
    public static boolean validarCodigoCuenta(String id) {
        return id != null && id.matches("CTA\\d{8,10}"); 
    }

    // VALIDACIONES DE MONTOS
    public static boolean validarMontoPositivo(double monto) {
        return monto > 0;
    }
    
    public static boolean validarMontoDeposito(double monto) {
        return monto >= 10 && monto <= 50000;
    }
    
    public static boolean validarMontoRetiro(double monto) {
        return monto >= 10 && monto <= 5000;
    }
    
    public static boolean validarMontoTransferencia(double monto) {
        return monto >= 10 && monto <= 10000;
    }
    
    public static boolean validarSaldoSuficiente(Cuenta cuenta, double monto) {
        return cuenta != null && cuenta.consultarSaldo() >= monto;
    }
    
    public static boolean validarCuentasDiferentes(String codigo1, String codigo2) {
        return !codigo1.equals(codigo2);
    }
}