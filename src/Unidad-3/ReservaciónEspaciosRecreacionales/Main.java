package Unidad3.ReservaciónEspaciosRecreacionales;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("Lunes 10am");
        horarios.add("Lunes 2pm");
        horarios.add("Martes 11am");

        EspacioRecreacional cancha = new EspacioRecreacional("Cancha Futbol", "Cancha", 2, horarios);

        GestionRecreacional gestion = new GestionRecreacional();
        gestion.registrarEspacio(cancha);

        Estudiante s1 = new Estudiante("Laura", 1001);
        Estudiante s2 = new Estudiante("Carlos", 1002);

        s1.reservarEspacio(cancha, "Lunes 10am");
        s2.reservarEspacio(cancha, "Lunes 2pm");

        gestion.mostrarDisponibilidad("Cancha Futbol");

        gestion.cancelarReserva("Cancha Futbol", "Lunes 10am");

        gestion.mostrarDisponibilidad("Cancha Futbol");
    }
}

