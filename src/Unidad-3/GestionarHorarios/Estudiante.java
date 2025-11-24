package Unidad3.GestionarHoarios;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int id;
    private ArrayList<String> materiasInscritas;
    private ArrayList<String> horariosOcupados;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.materiasInscritas = new ArrayList<>();
        this.horariosOcupados = new ArrayList<>();
    }

    public void inscribirMateria(Materia materia, String horario) {

        if (horariosOcupados.contains(horario)) {
            System.out.println("Ya tienes una materia en esa hora (" + horario + ")");
        } else {
            materiasInscritas.add(materia.getNombre() + " | " + horario);
            horariosOcupados.add(horario);
            System.out.println("Materia inscrita: " + materia.getNombre() + " en el horario (" + horario + ")");
        }
    }

    public void mostrarHorario() {
        System.out.println("\nHorario completo de: " + nombre);
        for (String info : materiasInscritas) {
            System.out.println(info);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
