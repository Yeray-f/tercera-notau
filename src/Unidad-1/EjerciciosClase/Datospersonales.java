package EjerciciosClase;
import java.util.Scanner;
public class Datospersonales {
    public static void main(String[] args) {
        //Crea un programa que pida al usuario su nombre, edad y altura, y luego imprima estos datos en la consola.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su altura (en metros): ");
        double altura = scanner.nextDouble();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        scanner.close();
    }
}