package Unidad3.ReservaciónEspaciosRecreacionales;

import java.util.ArrayList;

public class EspacioRecreacional {
    private String nombre;
    private String tipo;
    private int capacidad;
    private ArrayList<String> horariosDisponibles;
    private ArrayList<String> horariosReservados;
    private int reservasActuales;

    public EspacioRecreacional(String nombre, String tipo, int capacidad, ArrayList<String> horariosDisponibles) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.horariosDisponibles = horariosDisponibles;
        this.horariosReservados = new ArrayList<>();
        this.reservasActuales = 0;
    }

    public boolean reservar(String horario) {
        if (!horariosDisponibles.contains(horario)) return false;
        if (reservasActuales >= capacidad) return false;
        horariosDisponibles.remove(horario);
        horariosReservados.add(horario);
        reservasActuales++;
        return true;
    }

    public boolean cancelar(String horario) {
        if (!horariosReservados.contains(horario)) return false;
        horariosReservados.remove(horario);
        horariosDisponibles.add(horario);
        reservasActuales--;
        return true;
    }

    public void mostrarDisponibilidad() {
        System.out.println("Horarios disponibles para " + nombre + ":");
        for (String h : horariosDisponibles) System.out.println("- " + h);
    }

    public boolean estaDisponible(String horario) {
        return horariosDisponibles.contains(horario) && reservasActuales < capacidad;
    }

    public String getNombre() {
        return nombre;
    }
}

