package Tareas;
import java.util.Scanner;

public class maquillaje {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos maquillajes desea agregar?");
        int n = scanner.nextInt();

        String[] lista = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del maquillaje " + (i + 1));
            lista[i] = scanner.next();

        }

        System.out.println("Los maquillajes ingresados son: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + lista[i]);

        }
    scanner.close();
    }
}
