import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int cantidad = leerVector(numeros);
        mostrarVector(numeros, cantidad);
    }

    public static int leerVector(int[] vector) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (contador < vector.length) {
            System.out.print("Ingrese un número (negativo para terminar): ");
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            vector[contador] = num;
            contador++;
        }

        sc.close();
        return contador;
    }

    public static void mostrarVector(int[] vector, int cantidad) {
        System.out.println("\nElementos introducidos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(vector[i]);
        }
    }
}


