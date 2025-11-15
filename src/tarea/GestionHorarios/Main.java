package GestionHorarios;
public class Main {
    public static void main(String[] args) {

        GestionarHorario gestion = new GestionarHorario();

        Materia m1 = new Materia("Matemáticas", "MAT101", 3, null);
        Materia m2 = new Materia("Historia", "HIS102", 2, null);

        m1.agregarHorario("Lunes 8am");
        m1.agregarHorario("Miércoles 10am");

        m2.agregarHorario("Martes 9am");
        m2.agregarHorario("Jueves 8am");

        gestion.registrarMateria(m1);
        gestion.registrarMateria(m2);

        Estudiante e1 = new Estudiante("Laura", 101);
        Estudiante e2 = new Estudiante("Carlos", 102);

        gestion.registrarEstudiante(e1);
        gestion.registrarEstudiante(e2);

        gestion.inscribirMateria(e1, m1, "Lunes 8am");
        gestion.inscribirMateria(e1, m2, "Martes 9am");

        gestion.inscribirMateria(e1, m2, "Lunes 8am");

        e1.mostrarHorario();
    }
}



