public class Validaciones {
    // Constructor
    public Validaciones() {}
    
    Banco banco = new Banco();
    //VALIDACIÓN BÁSICA
    /* Valida que no sea nulo o vacío */
    public static boolean validarTexto(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
    
    /* Valida que no sea nulo */
    public static boolean validarObjeto(Object objeto) {
        return objeto != null;
    }
    
    //VALIDACIONES DE PERSONA
    // Nombre: solo letras, espacios y acentos (mínimo 2 caracteres)
    public static boolean validarNombre(String nombre) {
        if (!validarTexto(nombre)) return false;
        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}");
    }
    
    // DNI: exactamente 8 dígitos
    public static boolean validarDNI(String dni) {
        if (!validarTexto(dni)) return false;
        return dni.matches("\\d{8}");
    }
    
    // Teléfono/Celular: 9 dígitos comenzando con 9
    public static boolean validarCelular(String celular) {
        if (!validarTexto(celular)) return false;
        return celular.matches("9\\d{8}");
    }
    
    // Correo: formato usuario@dominio.extension
    public static boolean validarCorreo(String correo) {
        if (!validarTexto(correo)) return false;
        return correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
    
    // Edad: entre 18 y 120 años
    public static boolean validarEdad(int edad) {
        return edad >= 18 && edad <= 120;
    }
    
    // Dirección: no vacía y al menos 5 caracteres
    public static boolean validarDireccion(String direccion) {
        if (!validarTexto(direccion)) return false;
        return direccion.trim().length() >= 5;
    }
    
    // VALIDACIONES DE CÓDIGOS
    // Código Cliente: CLI seguido de 3-6 dígitos (ej: CLI001, CLI123456)
    public static boolean validarCodigoCliente(String codigo) {
        if (!validarTexto(codigo)) return false;
        return codigo.toUpperCase().matches("CLI\\d{3,6}");
    }
    
    // Código Empleado: EMP seguido de 3-6 dígitos (ej: EMP001, EMP123456)
    public static boolean validarCodigoEmpleado(String codigo) {
        if (!validarTexto(codigo)) return false;
        return codigo.toUpperCase().matches("EMP\\d{3,6}");
    }
    
    // Código Cuenta: CTA seguido de 8-10 dígitos (ej: CTA00012345, CTA0001234567)
    public static boolean validarCodigoCuenta(String codigo) {
        if (!validarTexto(codigo)) return false;
        return codigo.toUpperCase().matches("CTA\\d{8,10}");
    }
    
    // ID Transacción: TXN seguido de números (ej: TXN001, TXN123456)
    public static boolean validarIdTransaccion(String id) {
        if (!validarTexto(id)) return false;
        return id.toUpperCase().matches("TXN\\d+");
    }
    
    // ==================== VALIDACIONES DE FECHA Y HORA ====================
    
    // Fecha: formato dd/MM/yyyy con valores válidos
    public static boolean validarFecha(String fecha) {
        if (!validarTexto(fecha)) return false;
        if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) return false;
        
        String[] partes = fecha.split("/");
        if (partes.length != 3) return false;
        
        // Validar que sean números válidos
        if (!partes[0].matches("\\d+") || !partes[1].matches("\\d+") ||
            !partes[2].matches("\\d+")) {
            return false;
        }
        
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);
        
        // Validar rangos
        if (dia < 1 || dia > 31) return false;
        if (mes < 1 || mes > 12) return false;
        if (anio < 2000 || anio > 2100) return false;
        
        // Validar días por mes
        if (mes == 2 && dia > 29) return false;
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) return false;
        
        return true;
    }
    
    // Hora: formato HH:mm:ss con valores válidos
    public static boolean validarHora(String hora) {
        if (!validarTexto(hora)) return false;
        if (!hora.matches("\\d{2}:\\d{2}:\\d{2}")) return false;
        
        String[] partes = hora.split(":");
        if (partes.length != 3) return false;
        
        // Validar que sean números válidos
        if (!partes[0].matches("\\d+") || !partes[1].matches("\\d+") ||
            !partes[2].matches("\\d+")) {
            return false;
        }
        
        int hh = Integer.parseInt(partes[0]);
        int mm = Integer.parseInt(partes[1]);
        int ss = Integer.parseInt(partes[2]);
        
        if (hh < 0 || hh > 23) return false;
        if (mm < 0 || mm > 59) return false;
        if (ss < 0 || ss > 59) return false;
        
        return true;
    }
    
    //VALIDACIONES DE MONTOS
    // Monto positivo
    public static boolean validarMontoPositivo(double monto) {
        return monto > 0;
    }
    
    // Depósito: entre 10 y 50,000
    public static boolean validarMontoDeposito(double monto) {
        return monto >= 10 && monto <= 50000;
    }
    
    // Retiro: entre 10 y 5,000
    public static boolean validarMontoRetiro(double monto) {
        return monto >= 10 && monto <= 5000;
    }
    
    // Transferencia: entre 10 y 10,000
    public static boolean validarMontoTransferencia(double monto) {
        return monto >= 10 && monto <= 10000;
    }
    
    // Saldo: no negativo y menor a 1,000,000
    public static boolean validarSaldo(double saldo) {
        return saldo >= 0 && saldo <= 1000000;
    }
    
    // Saldo suficiente para operación
    public static boolean validarSaldoSuficiente(Cuenta cuenta, double monto) {
        return cuenta != null && cuenta.consultarSaldo() >= monto;
    }
    
    //VALIDACIONES DE CUENTAS
    
    // Verifica que dos cuentas sean diferentes
    public static boolean validarCuentasDiferentes(String codigo1, String codigo2) {
        if (!validarTexto(codigo1) || !validarTexto(codigo2)) return false;
        return !codigo1.equalsIgnoreCase(codigo2);
    }
    
    // Verifica que la cuenta tenga saldo disponible
    public static boolean esCuentaValida(Cuenta cuenta) {
        return cuenta != null && validarSaldo(cuenta.consultarSaldo());
    }
    

}
