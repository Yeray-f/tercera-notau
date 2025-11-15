import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] palabras = new String[5];
        String[] invertido = new String[5];
        leerVector(palabras);
        invertirVector(palabras, invertido);
        mostrarVector(invertido);
    }

    public static void leerVector(String[] vector) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            vector[i] = sc.nextLine();
        }
        sc.close();
    }

    public static void invertirVector(String[] original, String[] invertido) {
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }
    }

    public static void mostrarVector(String[] vector) {
        System.out.println("\nVector invertido:");
        for (String elemento : vector) {
            System.out.println(elemento);
        }
    }
}


