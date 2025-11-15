public class Ejercicio11 {
    public static void main(String[] args) {
        final int TAM = 5;
        int[][] diagonal = new int[TAM][TAM];

        cargarDiagonal(diagonal);
        mostrarMatriz(diagonal);
    }

    public static void cargarDiagonal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz con diagonal principal en 1 y el resto en 0:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
