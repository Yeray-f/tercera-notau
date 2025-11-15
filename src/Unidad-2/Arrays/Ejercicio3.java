import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] notas = new double[5];
        leerNotas(notas);
        mostrarNotas(notas);
        mostrarResultados(notas);
    }

    public static void leerNotas(double[] notas) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota " + (i + 1) + " (0 a 10): ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Intente nuevamente.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
        sc.close();
    }

    public static void mostrarNotas(double[] notas) {
        System.out.print("\nNotas ingresadas: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void mostrarResultados(double[] notas) {
        double suma = 0;
        double max = notas[0];
        double min = notas[0];

        for (double n : notas) {
            suma += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        double media = suma / notas.length;

        System.out.println("Nota media: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
    }
}
