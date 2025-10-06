package EjerciciosClase;
public class EjercicioBanco {
    public static void main(String[] args) throws Exception {
        double saldo = 1000;
        final double RETIRO = 200;
        //Un mes tiene 4 semanas por lo que se realizara el retiro 4 veces
        saldo = saldo - (RETIRO * 4);
        System.out.println("El saldo final de la cuenta es: " + saldo);
    }
}