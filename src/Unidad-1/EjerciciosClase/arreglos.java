package EjerciciosClase;
import java.util.Scanner;

public class arreglos {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese un numero:");
        int dato = scanner.nextInt();
        int [] numbers = {dato};
        System.out.println(numbers.length);
scanner.close();
    }
}
