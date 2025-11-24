package Unidad3.GestióndelComedor;


import java.util.ArrayList;

public class GestionComedor {
    private ArrayList<Comida> comidas;

    public GestionComedor() {
        comidas = new ArrayList<>();
    }

    public void registrarComida(Comida comida) {
        comidas.add(comida);
    }

    public void mostrarDisponibilidad() {
        for (Comida c : comidas) {
            System.out.println(c.getNombre() + ": " + c.getDisponibilidad());
        }
    }

    public boolean registrarConsumo(Estudiante estudiante, Comida comida) {
        return estudiante.seleccionarComida(comida);
    }
}

