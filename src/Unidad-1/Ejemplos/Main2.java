public class Main2 {
    public static void main(String[] args) {
        double[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double promedio;
        double suma = 0;

        for (int contador = 0; contador < numeros.length; contador++) {
            suma = suma + numeros[contador];
        }

        promedio = suma / 10;

        System.out.println("suma = " + promedio);
    }
}
