import java.util.ArrayList;
public class Cuenta {
    /* Creando los atributos de la clase Cuenta */
    private String idCuenta;
    private String tipo;
    private double saldo;
    private ArrayList<Cliente> titulares;
    private ArrayList<Transaccion> movimientos;
    private Tarjeta tarjeta;

    /* Constructor de Cuenta */
    public Cuenta(String idCuenta, String tipo, double saldo, ArrayList<Cliente> titulares){
        this.idCuenta = idCuenta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.titulares = titulares;
        this.movimientos = new ArrayList<>();
        String tipoTarjeta = (tipo != null && tipo.equalsIgnoreCase("ahorro")) ? "Débito" : "Crédito";
        this.tarjeta = new Tarjeta(tipoTarjeta);
    }

    /* Getters y Setters */
    public String getIdCuenta() { return idCuenta; }
    public void setIdCuenta(String idCuenta) { this.idCuenta = idCuenta; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double consultarSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public ArrayList<Cliente> getTitulares() { return titulares; }
    public void setTitulares(ArrayList<Cliente> titulares) { this.titulares = titulares; }
    public ArrayList<Transaccion> getMovimientos() { return movimientos; }
    public void agregarDeposito(Deposito objeto) { 
        movimientos.add(objeto);
    }
    public void agregarRetiro(Retiro objeto) { 
        movimientos.add(objeto);
    }
    public void agregarPago(PagoServicio objeto) { 
        movimientos.add(objeto);
    }
    public void agregarTransferencia(Transferencia objeto) { 
        movimientos.add(objeto);
    }

    /* Getter y Setter para la tarjeta */
    public Tarjeta getTarjeta() { return tarjeta; }
    public void setTarjeta(Tarjeta tarjeta) { this.tarjeta = tarjeta; }

}
