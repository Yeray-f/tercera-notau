import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        final int PARTIDOS = 15;

        // Tablas
        String[][] equipos = new String[PARTIDOS][2];  // [partido][equipo]
        int[][] resultados = new int[PARTIDOS][2];     // [partido][goles]

        Scanner sc = new Scanner(System.in);

        System.out.println("=== GESTIÓN DE QUINIELA DE FÚTBOL ===\n");

        // Cargar nombres de equipos
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            System.out.print("  Nombre del equipo local: ");
            equipos[i][0] = sc.nextLine();
            System.out.print("  Nombre del equipo visitante: ");
            equipos[i][1] = sc.nextLine();
            System.out.println();
        }

        // Cargar resultados de cada partido
        System.out.println("=== Ingreso de resultados ===");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.println("Resultado del partido " + (i + 1) + " (" + equipos[i][0] + " vs " + equipos[i][1] + ")");
            System.out.print("  Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = sc.nextInt();
            System.out.print("  Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = sc.nextInt();
            System.out.println();
        }

        // Mostrar resumen de resultados
        System.out.println("\n=== RESULTADOS DE LA JORNADA ===");
        for (int i = 0; i < PARTIDOS; i++) {
            int golesLocal = resultados[i][0];
            int golesVisitante = resultados[i][1];

            System.out.print((i + 1) + ". " + equipos[i][0] + " " + golesLocal + " - " + golesVisitante + " " + equipos[i][1] + " → ");

            if (golesLocal > golesVisitante) {
                System.out.println("Ganó " + equipos[i][0]);
            } else if (golesVisitante > golesLocal) {
                System.out.println("Ganó " + equipos[i][1]);
            } else {
                System.out.println("Empate");
            }
        }

        sc.close();
    }
}

