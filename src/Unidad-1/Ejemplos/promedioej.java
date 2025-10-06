package Ejemplos;
public class promedioej {
    public static void main(String[] args) {
        double[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double suma = 0;

        for (double num : numeros) {
            suma += num;
        }

        double promedio = suma / numeros.length;

        System.out.println("suma = " + promedio);
    }
}
