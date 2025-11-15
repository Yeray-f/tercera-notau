import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        final int CONDUCTORES = 3; // puedes cambiarlo
        final int DIAS = 7;

        String[] nombres = new String[CONDUCTORES];
        int[][] kms = new int[CONDUCTORES][DIAS];
        int[] total_kms = new int[CONDUCTORES];
        Scanner sc = new Scanner(System.in);

        leerConductores(sc, nombres, kms);
        calcularTotalKms(kms, total_kms);
        mostrarResultados(nombres, total_kms);

        sc.close();
    }

    public static void leerConductores(Scanner sc, String[] nombres, int[][] kms) {
        System.out.println("Registro de kilómetros por conductor:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("\nNombre del conductor " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            for (int j = 0; j < kms[i].length; j++) {
                System.out.print("Kilómetros del día " + (j + 1) + ": ");
                kms[i][j] = sc.nextInt();
            }
            sc.nextLine(); // limpiar el salto de línea
        }
    }

    public static void calcularTotalKms(int[][] kms, int[] total_kms) {
        for (int i = 0; i < kms.length; i++) {
            int suma = 0;
            for (int j = 0; j < kms[i].length; j++) {
                suma += kms[i][j];
            }
            total_kms[i] = suma;
        }
    }

    public static void mostrarResultados(String[] nombres, int[] total_kms) {
        System.out.println("\n--- Kilómetros totales por conductor ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " km");
        }
    }
}

