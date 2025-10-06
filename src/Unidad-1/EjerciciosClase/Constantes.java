package EjerciciosClase;
public class Constantes {
    public static void main(String[] args) throws Exception {
        //Instrucción: Reescribe el siguiente fragmento de código usando constantes en lugar de valores mágicos:
        //double radio = 5;
        //double area = 3.14159 * radio * radio;
        final double RADIO = 1;
        final double PI = 3.14159;
        double area = PI * RADIO * RADIO;
        System.out.println(area);
    }
}