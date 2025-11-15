import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        inicializarVector(numeros);
        System.out.println("Vector original:");
        mostrarVector(numeros);

        ordenarVector(numeros);
        System.out.println("\nVector ordenado de menor a mayor:");
        mostrarVector(numeros);
    }

    public static void inicializarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100) + 1; // valores del 1 al 100
        }
    }

    public static void ordenarVector(int[] vector) {
        Arrays.sort(vector);
    }

    public static void mostrarVector(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
