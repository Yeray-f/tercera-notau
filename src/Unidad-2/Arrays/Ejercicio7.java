import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        leerVector(vector1, "primer");
        leerVector(vector2, "segundo");

        sumarVectores(vector1, vector2, vector3);

        System.out.println("\nResultado de la suma (vector3 = vector1 + vector2):");
        mostrarVector(vector3);
    }

    public static void leerVector(int[] vector, String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores del " + nombre + " vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void sumarVectores(int[] v1, int[] v2, int[] v3) {
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i] + v2[i];
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
