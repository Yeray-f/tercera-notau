public class PruebaCuenta {
    public static void main(String[] args) {

        CuentaBancaria c = new CuentaBancaria("Juan Pérez", 1000, "12345");

        c.mostrarInformacion();
        c.depositar(500);
        c.retirar(200);

        System.out.println("Saldo final: " + c.consultarSaldo());
    }
}
