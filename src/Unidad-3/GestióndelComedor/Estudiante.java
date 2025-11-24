package Unidad3.GestióndelComedor;


public class Estudiante {
    private String nombre;
    private String id;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public boolean seleccionarComida(Comida comida) {
        return comida.servir();
    }
}

