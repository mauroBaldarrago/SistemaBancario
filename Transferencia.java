public class Transferencia extends Transaccion{
    private Cliente cliente2;

    public Transferencia(String idTransaccion, double monto, Cliente cliente1, Cliente cliente2, Empleado empleado){
        super(idTransaccion, monto, cliente1, empleado);
        this.cliente2 = cliente2;
    } 

    public void procesar(Cuenta cuenta1, Cuenta cuenta2, double monto, Transferencia transferencia){
        cuenta1.setSaldo(cuenta1.consultarSaldo()-monto);
        cuenta2.setSaldo(cuenta2.consultarSaldo()+monto);
        cuenta1.agregarTransferencia(transferencia);
        cuenta2.agregarTransferencia(transferencia);
        System.out.println("Se transfirió correctamente el monto");
    }
} 