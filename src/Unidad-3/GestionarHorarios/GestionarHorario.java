package Unidad3.GestionarHoarios;
import java.util.ArrayList;

public class GestionarHorario {

    private ArrayList<Materia> materias;
    private ArrayList<Estudiante> estudiantes;

    public GestionarHorario() {
        materias = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void registrarMateria(Materia materia) {
        materias.add(materia);
        System.out.println("Materia registrada: " + materia.getNombre());
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante registrado: " + estudiante.getNombre());
    }

    public void inscribirMateria(Estudiante estudiante, Materia materia, String horario) {
        estudiante.inscribirMateria(materia, horario);
    }

    public void mostrarMaterias() {
        System.out.println("\nMATERIAS REGISTRADAS:");
        for (Materia m : materias) {
            System.out.println("- " + m.getNombre());
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("\nESTUDIANTES REGISTRADOS:");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre());
        }
    }
}

