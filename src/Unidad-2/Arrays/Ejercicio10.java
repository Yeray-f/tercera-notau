import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS];
        Scanner sc = new Scanner(System.in);

        cargarMatriz(sc, matriz);
        mostrarMatriz(matriz);
        sumarFilas(matriz);
        sumarColumnas(matriz);

        sc.close();
    }

    public static void cargarMatriz(Scanner sc, int[][] matriz) {
        System.out.println("Ingrese los valores para la matriz (5x5):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumarFilas(int[][] matriz) {
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }
    }

    public static void sumarColumnas(int[][] matriz) {
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }
    }
}

