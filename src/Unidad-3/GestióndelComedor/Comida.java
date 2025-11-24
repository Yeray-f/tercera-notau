package Unidad3.GestióndelComedor;


import java.util.ArrayList;

public class Comida {
    private String nombre;
    private String tipo;
    private int disponibilidad;

    public Comida(String nombre, String tipo, int disponibilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
    }

    public boolean servir() {
        if (disponibilidad > 0) {
            disponibilidad--;
            return true;
        }
        return false;
    }

    public void reponer(int cantidad) {
        disponibilidad += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }
}
