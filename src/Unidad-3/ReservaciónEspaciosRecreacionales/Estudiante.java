package Unidad3.ReservaciónEspaciosRecreacionales;

public class Estudiante {
    private String nombre;
    private int id;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public boolean reservarEspacio(EspacioRecreacional espacio, String horario) {
        return espacio.reservar(horario);
    }

    public boolean cancelarReserva(EspacioRecreacional espacio, String horario) {
        return espacio.cancelar(horario);
    }

    public String getNombre() {
        return nombre;
    }
}

