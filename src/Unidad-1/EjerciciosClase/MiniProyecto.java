package EjerciciosClase;
import java.util.Scanner;
public class MiniProyecto {
    public static void main(String[] args)throws Exception {
        //Proyecto Mini: Desarrollar un programa en Java que calcule la media de tres números introducidos por el usuario y muestre el resultado.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double numero1 = teclado.nextInt();
        System.out.println("Escriba el segundo numero");
        double numero2 = teclado.nextInt();
        System.out.println("Escriba el tercer numero");
        double numero3 = teclado.nextInt();
        double prom = (numero1 + numero2 + numero3)/3;
        System.out.println("El promedio de sus numeros es de" + prom);
        teclado.close();
    }
}
