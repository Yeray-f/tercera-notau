public class Ejercicio12 {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 15;
        int[][] marco = new int[FILAS][COLUMNAS];

        cargarMarco(marco);
        mostrarMatriz(marco);
    }

    public static void cargarMarco(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = 1; // bordes
                } else {
                    matriz[i][j] = 0; // interior
                }
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz con marco de 1 y interior de 0:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
