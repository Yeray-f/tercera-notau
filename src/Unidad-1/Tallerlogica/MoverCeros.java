package Tallerlogica;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoverCeros {

    public static List<Object> moverCeros(List<Object> input) {
        List<Object> resultado = new ArrayList<>();
        int contadorCeros = 0;

        for (Object elemento : input) {
            if (elemento instanceof Integer && ((Integer) elemento).intValue() == 0) {
                contadorCeros++;
            } else {
                resultado.add(elemento);
            }
        }

        for (int i = 0; i < contadorCeros; i++) {
            resultado.add(0); // autobox a Integer
        }

        return resultado;
    }

    public static void main(String[] args) {
        List<Object> input = new ArrayList<>(Arrays.asList(false, 1, 0, 1, 2, 0, 1, 3, "a"));
        List<Object> resultado = moverCeros(input);
        System.out.println(resultado);
    }
}
