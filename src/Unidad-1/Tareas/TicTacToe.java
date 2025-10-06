package Tareas;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            char[][] tablero = {
                {' ', ' ', ' '}, //fila 0
                {' ', ' ', ' '}, //fila 1
                {' ', ' ', ' '}  //fila 2
            };

            System.out.println("¡Bienvenido al Tic Tac Toe!");
            System.out.print("Elige tu símbolo (X/O): ");
            char jugador = sc.next().toUpperCase().charAt(0);
            while (jugador != 'X' && jugador != 'O') {
                System.out.print("Símbolo inválido. Elige X u O: ");
                jugador = sc.next().toUpperCase().charAt(0);
            }

            char jugadorActual = jugador;
            boolean juegoTerminado = false;

            imprimirTableroConCoordenadas(tablero);

            while (!juegoTerminado) {
                System.out.println("Turno del jugador " + jugadorActual + ". Ingresa fila (0-2) y columna (0-2):");
                int fila = sc.nextInt();
                int col = sc.nextInt();

                if (fila < 0 || fila > 2 || col < 0 || col > 2) {
                    System.out.println("Posición inválida, intenta de nuevo.");
                    continue;
                }

                if (tablero[fila][col] != ' ') {
                    System.out.println("Esa casilla ya está ocupada. Intenta otra.");
                    continue;
                }

                tablero[fila][col] = jugadorActual;
                imprimirTableroConCoordenadas(tablero);

                if (verificarGanador(tablero, jugadorActual)) {
                    System.out.println("¡Felicidades! El jugador " + jugadorActual + " ha ganado.");
                    juegoTerminado = true;
                } else if (tableroLleno(tablero)) {
                    System.out.println("Empate. El tablero está lleno.");
                    juegoTerminado = true;
                } else {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            }

            System.out.print("¿Quieres jugar de nuevo? (S/N): ");
            char respuesta = sc.next().toUpperCase().charAt(0);
            jugarDeNuevo = (respuesta == 'S');
        }

        System.out.println("¡Gracias por jugar Tic Tac Toe!");
        sc.close();
    }

    // Tablero con coordenadas
    public static void imprimirTableroConCoordenadas(char[][] tablero) {
        System.out.println("    0   1   2 ");
        System.out.println("  -------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("  -------------");
        }
    }

    public static boolean verificarGanador(char[][] tablero, char jugador) {
        // Filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador)
                return true;
        }
        // Columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador)
                return true;
        }
        // Diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
            return true;
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)
            return true;

        return false;
    }

    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}
