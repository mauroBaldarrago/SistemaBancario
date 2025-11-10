public class Tarjeta {
    private String tipo; // "Débito" o "Crédito"
    private String numeroTarjeta;

    /* Constructor */
    public Tarjeta(String tipo) {
        if (!validarTipoTarjeta(tipo)) {
            System.out.println("Tipo de tarjeta inválido. Se asignará como 'Desconocido'.");
            this.tipo = "Desconocido";
        } else {
            this.tipo = normalizarTipo(tipo);
        }
        this.numeroTarjeta = generarNumeroTarjeta();
    }

    /* Métodos de acceso */
    public String getTipo() { return tipo; }
    public String getNumeroTarjeta() { return numeroTarjeta; }

    /* Validar tipo */
    public static boolean validarTipoTarjeta(String tipo) {
        if (tipo == null) return false;
        String t = tipo.trim().toLowerCase();
        return t.equals("débito") || t.equals("debito") || t.equals("crédito") || t.equals("credito");
    }

    /* Normalizar tipo */
    private String normalizarTipo(String tipo) {
        String t = tipo.trim().toLowerCase();
        if (t.equals("débito") || t.equals("debito")) return "Débito";
        return "Crédito";
    }

    /* Mostrar beneficios */
    public void mostrarBeneficios() {
        if ("Débito".equalsIgnoreCase(tipo)) {
            System.out.println("Beneficios de Tarjeta Débito...");
        } else if ("Crédito".equalsIgnoreCase(tipo)) {
            System.out.println("Beneficios de Tarjeta Crédito...");
        } else {
            System.out.println("Sin beneficios disponibles (tipo desconocido).");
        }
    }

    /* Generar número aleatorio tipo real */
    public static String generarNumeroTarjeta() {
        String iin = "400000";
        StringBuilder sb = new StringBuilder(iin);
        for (int i = 0; i < 9; i++) {
            int d = (int) (Math.random() * 10);
            sb.append(d);
        }
        int check = calcularLuhnCheckDigit(sb.toString());
        sb.append(check);
        return sb.toString();
    }

    private static int calcularLuhnCheckDigit(String numSinCheck) {
        int sum = 0;
        boolean doble = true;
        for (int i = numSinCheck.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numSinCheck.charAt(i));
            if (doble) {
                digit *= 2;
                if (digit > 9) digit -= 9;
            }
            sum += digit;
            doble = !doble;
        }
        int mod = sum % 10;
        return (mod == 0) ? 0 : (10 - mod);
    }
}
