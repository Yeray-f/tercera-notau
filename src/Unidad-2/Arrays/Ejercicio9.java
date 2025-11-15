import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        final int DIAS = 5;
        double[] tempMin = new double[DIAS];
        double[] tempMax = new double[DIAS];
        Scanner sc = new Scanner(System.in);

        leerTemperaturas(sc, tempMin, tempMax);
        mostrarMediaDiaria(tempMin, tempMax);
        mostrarDiaMenorTemperatura(tempMin);
        buscarPorTemperaturaMaxima(sc, tempMax);

        sc.close();
    }

    public static void leerTemperaturas(Scanner sc, double[] min, double[] max) {
        for (int i = 0; i < min.length; i++) {
            System.out.println("\nDía " + (i + 1) + ":");
            System.out.print("Temperatura mínima: ");
            min[i] = sc.nextDouble();
            System.out.print("Temperatura máxima: ");
            max[i] = sc.nextDouble();
        }
    }

    public static void mostrarMediaDiaria(double[] min, double[] max) {
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < min.length; i++) {
            double media = (min[i] + max[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media + " °C");
        }
    }

    public static void mostrarDiaMenorTemperatura(double[] min) {
        double menor = min[0];
        for (int i = 1; i < min.length; i++) {
            if (min[i] < menor) {
                menor = min[i];
            }
        }

        System.out.println("\nDía(s) con menor temperatura mínima (" + menor + " °C):");
        for (int i = 0; i < min.length; i++) {
            if (min[i] == menor) {
                System.out.println("Día " + (i + 1));
            }
        }
    }

    public static void buscarPorTemperaturaMaxima(Scanner sc, double[] max) {
        System.out.print("\nIngrese una temperatura máxima para buscar: ");
        double buscada = sc.nextDouble();

        boolean encontrada = false;
        for (int i = 0; i < max.length; i++) {
            if (max[i] == buscada) {
                System.out.println("Coincide con el día " + (i + 1));
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Ningún día tiene esa temperatura máxima.");
        }
    }
}
