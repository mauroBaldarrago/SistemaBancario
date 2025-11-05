import java.util.ArrayList;
public class Cuenta {
    /* Creando los atributos de la clase Cuenta */
    private String idCuenta;
    private String tipo;
    private double saldo;
    private ArrayList<Cliente> titulares;
    private ArrayList<Transaccion> movimientos;

    /* Constructor de Cuenta */
    public Cuenta(String idCuenta, String tipo, double saldo, ArrayList<Cliente> titulares){
        this.idCuenta = idCuenta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.titulares = titulares;
        this.movimientos = new ArrayList<>();
    }

    /* Getters y Setters */
    public String getIdCuenta() {return idCuenta;}
    public void setIdCuenta(String idCuenta) {this.idCuenta = idCuenta;}
    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public double consultarSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public ArrayList<Cliente> getTitulares() {return titulares;}
    public void setTitulares(ArrayList<Cliente> titulares) {this.titulares = titulares;}
    public ArrayList<Transaccion> getMovimientos() {return movimientos;}
    public void setMovimientos(ArrayList<Transaccion> movimientos) {this.movimientos = movimientos;}

    /* Método de depositar */
    public void depositar(Deposito deposito) {
        deposito.procesar();
        saldo += deposito.getMonto();
        movimientos.add(deposito);
    }

    /* Método de retirar */
    public void retirar(Retiro retiro) {
        if (saldo >= retiro.getMonto()) {
            retiro.procesar();
            saldo -= retiro.getMonto();
            movimientos.add(retiro);
        } else {
            System.out.println("No se puede efectuar el retiro, fondos insuficientes");
        }
    }
}
