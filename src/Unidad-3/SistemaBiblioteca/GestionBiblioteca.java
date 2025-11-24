package Unidad3.SistemaBiblioteca;

import java.util.ArrayList;

public class GestionBiblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public GestionBiblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorID(String id) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public void mostrarDisponibles() {
        for (Libro l : libros) {
            if (l.isDisponible()) {
                System.out.println(l.getTitulo());
            }
        }
    }
}

