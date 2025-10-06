package Tallerlogica;
import java.util.ArrayList;
import java.util.List;

public class Transformador {
    public static class InputData {
        private String[] nombres;
        private int[] edades;

        public InputData(String[] nombres, int[] edades) {
            this.nombres = nombres;
            this.edades = edades;
        }
    }

    public static class OutputData {
        private String id;
        private String nombre;
        private int edad;

        public OutputData(String id, String nombre, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "{ id: \"" + id + "\", nombre: \"" + nombre + "\", edad: " + edad + " }";
        }
    }

    public static List<OutputData> transform(InputData data) {
        List<OutputData> result = new ArrayList<>();

        if (data.nombres.length != data.edades.length) {
            throw new IllegalArgumentException("Los arrays de nombres y edades deben tener la misma longitud");
        }

        for (int i = 0; i < data.nombres.length; i++) {
            result.add(new OutputData(
                String.valueOf(i + 1),
                data.nombres[i],
                data.edades[i]
            ));
        }

        return result;
    }

    public static void main(String[] args) {

        InputData data = new InputData(
            new String[]{"Bruno", "Andrea"},
            new int[]{20, 19}
        );

        List<OutputData> output = transform(data);

        System.out.println("[");
        for (int i = 0; i < output.size(); i++) {
            System.out.print("  " + output.get(i));
            if (i < output.size() - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("]");

        InputData emptyData = new InputData(new String[]{}, new int[]{});
        List<OutputData> emptyOutput = transform(emptyData);
        System.out.println("\nDatos vacíos:");
        System.out.println(emptyOutput);

        InputData singleData = new InputData(
            new String[]{"Carlos"},
            new int[]{25}
        );
        List<OutputData> singleOutput = transform(singleData);
        System.out.println("\nUn solo elemento:");
        System.out.println(singleOutput);
    }
}
