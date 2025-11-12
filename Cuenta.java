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

    public void mostrarDatos() {
        System.out.println("\n--- DATOS DE CUENTA ---");
        System.out.println("ID Cuenta: " + idCuenta);
        System.out.println("Tipo: " + tipo);
        System.out.printf("Saldo: S/. %.2f\n", consultarSaldo());
        System.out.print("Titulares: ");
        if (titulares.isEmpty()) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < titulares.size(); i++) {
                System.out.print(titulares.get(i).getNombre() + " " + titulares.get(i).getApellido() + " (ID: " + titulares.get(i).getIdCliente() + ")" + (i < titulares.size() - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }
    
    public void mostrarMovimientos() {
        if (movimientos.isEmpty()) {
            System.out.println("La cuenta " + idCuenta + " no tiene movimientos.");
            return;
        }
        System.out.println("\n--- MOVIMIENTOS DE LA CUENTA " + idCuenta + " ---");
        for (Transaccion t : movimientos) {
            t.mostrarDetalles(); 
        }
    }
}
