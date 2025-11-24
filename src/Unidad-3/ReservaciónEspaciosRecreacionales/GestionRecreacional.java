package Unidad3.ReservaciónEspaciosRecreacionales;

import java.util.ArrayList;

public class GestionRecreacional {
    private ArrayList<EspacioRecreacional> espacios;

    public GestionRecreacional() {
        espacios = new ArrayList<>();
    }

    public void registrarEspacio(EspacioRecreacional espacio) {
        espacios.add(espacio);
        System.out.println("Espacio registrado: " + espacio.getNombre());
    }

    public EspacioRecreacional buscarEspacio(String nombre) {
        for (EspacioRecreacional e : espacios) {
            if (e.getNombre().equalsIgnoreCase(nombre)) return e;
        }
        return null;
    }

    public void mostrarDisponibilidad(String nombre) {
        EspacioRecreacional espacio = buscarEspacio(nombre);
        if (espacio != null) espacio.mostrarDisponibilidad();
        else System.out.println("No existe ese espacio.");
    }

    public boolean cancelarReserva(String nombreEspacio, String horario) {
        EspacioRecreacional e = buscarEspacio(nombreEspacio);
        if (e == null) return false;
        return e.cancelar(horario);
    }
}

