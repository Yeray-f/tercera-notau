package Tareas;
import java.util.Scanner;

public class TicTacToe3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            // Crear tablero 3D 3x3x3
            char[][][] tablero = new char[3][3][3];
            for (int nivel = 0; nivel < 3; nivel++) {
                for (int fila = 0; fila < 3; fila++) {
                    for (int col = 0; col < 3; col++) {
                        tablero[nivel][fila][col] = ' ';
                    }
                }
            }

            System.out.println("¡Bienvenido al Tic Tac Toe 3D!");
            System.out.print("Elige tu símbolo (X/O): ");
            char jugador = sc.next().toUpperCase().charAt(0);
            while (jugador != 'X' && jugador != 'O') {
                System.out.print("Símbolo inválido. Elige X u O: ");
                jugador = sc.next().toUpperCase().charAt(0);
            }

            char jugadorActual = jugador;
            
            boolean juegoTerminado = false;

            imprimirTablero3D(tablero);

            while (!juegoTerminado) {
                System.out.println("Turno del jugador " + jugadorActual + ". Ingresa nivel (0-2), fila (0-2) y columna (0-2):");
                int nivel = sc.nextInt();
                int fila = sc.nextInt();
                int col = sc.nextInt();

                if (nivel < 0 || nivel > 2 || fila < 0 || fila > 2 || col < 0 || col > 2) {
                    System.out.println("Posición inválida, intenta de nuevo.");
                    continue;
                }

                if (tablero[nivel][fila][col] != ' ') {
                    System.out.println("Esa casilla ya está ocupada. Intenta otra.");
                    continue;
                }

                tablero[nivel][fila][col] = jugadorActual;
                imprimirTablero3D(tablero);

                if (verificarGanador3D(tablero, jugadorActual)) {
                    System.out.println("¡Felicidades! El jugador " + jugadorActual + " ha ganado.");
                    juegoTerminado = true;
                } else if (tableroLleno3D(tablero)) {
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

        System.out.println("¡Gracias por jugar Tic Tac Toe 3D!");
        sc.close();
    }

    public static void imprimirTablero3D(char[][][] tablero) {
        for (int nivel = 0; nivel < 3; nivel++) {
            System.out.println("Nivel " + nivel + ":");
            System.out.println("    0   1   2 ");
            System.out.println("  -------------");
            for (int fila = 0; fila < 3; fila++) {
                System.out.print(fila + " | ");
                for (int col = 0; col < 3; col++) {
                    System.out.print(tablero[nivel][fila][col] + " | ");
                }
                System.out.println();
                System.out.println("  -------------");
            }
            System.out.println();
        }
    }

    public static boolean tableroLleno3D(char[][][] tablero) {
        for (int nivel = 0; nivel < 3; nivel++) {
            for (int fila = 0; fila < 3; fila++) {
                for (int col = 0; col < 3; col++) {
                    if (tablero[nivel][fila][col] == ' ') return false;
                }
            }
        }
        return true;
    }

    public static boolean verificarGanador3D(char[][][] tablero, char jugador) {
        // Revisar filas y columnas en cada nivel
        for (int nivel = 0; nivel < 3; nivel++) {
            for (int i = 0; i < 3; i++) {
                if (tablero[nivel][i][0] == jugador && tablero[nivel][i][1] == jugador && tablero[nivel][i][2] == jugador)
                    return true; // fila
                if (tablero[nivel][0][i] == jugador && tablero[nivel][1][i] == jugador && tablero[nivel][2][i] == jugador)
                    return true; // columna
            }
            // diagonales de cada nivel
            if (tablero[nivel][0][0] == jugador && tablero[nivel][1][1] == jugador && tablero[nivel][2][2] == jugador)
                return true;
            if (tablero[nivel][0][2] == jugador && tablero[nivel][1][1] == jugador && tablero[nivel][2][0] == jugador)
                return true;
        }

        // Revisar columnas a través de niveles
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                if (tablero[0][fila][col] == jugador && tablero[1][fila][col] == jugador && tablero[2][fila][col] == jugador)
                    return true;
            }
        }

        // Revisar diagonales a través de niveles
        if (tablero[0][0][0] == jugador && tablero[1][1][1] == jugador && tablero[2][2][2] == jugador)
            return true;
        if (tablero[0][0][2] == jugador && tablero[1][1][1] == jugador && tablero[2][2][0] == jugador)
            return true;
        if (tablero[0][2][0] == jugador && tablero[1][1][1] == jugador && tablero[2][0][2] == jugador)
            return true;
        if (tablero[0][2][2] == jugador && tablero[1][1][1] == jugador && tablero[2][0][0] == jugador)
            return true;

        return false;

    }
}
