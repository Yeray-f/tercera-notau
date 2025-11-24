package Unidad3.SistemaBiblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String id;
    private ArrayList<Libro> librosPrestados;
    private int limitePrestamos;

    public Usuario(String nombre, String id, int limitePrestamos) {
        this.nombre = nombre;
        this.id = id;
        this.limitePrestamos = limitePrestamos;
        librosPrestados = new ArrayList<>();
    }

    public boolean prestarLibro(Libro libro) {
        if (librosPrestados.size() >= limitePrestamos) {
            return false;
        }
        if (!libro.isDisponible()) {
            return false;
        }
        libro.prestar();
        librosPrestados.add(libro);
        return true;
    }

    public boolean devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }
}

