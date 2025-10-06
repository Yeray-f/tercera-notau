package Tallerlogica;
import java.util.ArrayList;
import java.util.HashMap;

public class ElementosPares {

    public static <T> ArrayList<T> elementosConCantidadPar(ArrayList<T> lista) {

        HashMap<T, Integer> contadorElementos = new HashMap<>();

        for (T elemento : lista) {
            contadorElementos.put(elemento, contadorElementos.getOrDefault(elemento, 0) + 1);
        }

        ArrayList<T> elementosPares = new ArrayList<>();

        for (T elemento : contadorElementos.keySet()) {
            if (contadorElementos.get(elemento) % 2 == 0) {
                elementosPares.add(elemento);
            }
        }

        return elementosPares;
    }

    public static void main(String[] args) {
        
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("A");
        lista1.add("C");
        lista1.add("C");
        lista1.add("C");
        lista1.add("C");
        System.out.println(elementosConCantidadPar(lista1)); // -> ["A", "C"]

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(1);
        lista2.add(2);
        System.out.println(elementosConCantidadPar(lista2)); // -> [1, 2]
    }
}
