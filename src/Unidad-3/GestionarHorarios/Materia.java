package Unidad3.GestionarHoarios;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private ArrayList<String> horariosDisponibles;

    public Materia(String nombre, String codigo, int creditos, ArrayList<String> horariosDisponibles) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;

        this.horariosDisponibles = new ArrayList<>();
        if (horariosDisponibles != null) {
            this.horariosDisponibles.addAll(horariosDisponibles);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarHorario(String horario) {
        horariosDisponibles.add(horario);
    }

    public void mostrarHorariosDisponibles() {
        System.out.println("Horarios disponibles para: " + nombre);
        for (String i : horariosDisponibles) {
            System.out.println(i);
        }
    }

    public ArrayList<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }
}

