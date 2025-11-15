import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        final int MAX = 50; // máximo de alumnos posibles
        String[] nombres = new String[MAX];
        int[] edades = new int[MAX];
        int cantidad = leerAlumnos(nombres, edades);

        System.out.println("\nAlumnos mayores de edad (18 años o más):");
        mostrarMayoresDeEdad(nombres, edades, cantidad);

        System.out.println("\nAlumno(s) con mayor edad:");
        mostrarMasMayores(nombres, edades, cantidad);
    }

    public static int leerAlumnos(String[] nombres, int[] edades) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (contador < nombres.length) {
            System.out.print("Ingrese el nombre del alumno (o * para terminar): ");
            String nombre = sc.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = sc.nextInt();
            sc.nextLine(); // limpiar salto de línea

            nombres[contador] = nombre;
            edades[contador] = edad;
            contador++;
        }
        sc.close();
        return contador;
    }

    public static void mostrarMayoresDeEdad(String[] nombres, int[] edades, int cantidad) {
        boolean hayMayores = false;
        for (int i = 0; i < cantidad; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " - " + edades[i] + " años");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("No hay alumnos mayores de edad.");
        }
    }

    public static void mostrarMasMayores(String[] nombres, int[] edades, int cantidad) {
        if (cantidad == 0) {
            System.out.println("No se ingresaron alumnos.");
            return;
        }

        int maxEdad = edades[0];
        for (int i = 1; i < cantidad; i++) {
            if (edades[i] > maxEdad) {
                maxEdad = edades[i];
            }
        }

        for (int i = 0; i < cantidad; i++) {
            if (edades[i] == maxEdad) {
                System.out.println(nombres[i] + " - " + edades[i] + " años");
            }
        }
    }
}
