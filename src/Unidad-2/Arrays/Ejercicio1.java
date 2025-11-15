import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        inicializarVector(vector_numeros);
        mostrarVector(vector_numeros);
    }

    public static void inicializarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10) + 1;
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int numero : vector) {
            System.out.println("Número: " + numero + " | Cuadrado: " + cuadrado(numero) + " | Cubo: " + cubo(numero));
        }
    }

    public static int cuadrado(int n) {
        return n * n;
    }

    public static int cubo(int n) {
        return n * n * n;
    }
}
