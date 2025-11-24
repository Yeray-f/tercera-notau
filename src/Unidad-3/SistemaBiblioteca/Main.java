package Unidad3.SistemaBiblioteca;

public class Main {
    public static void main(String[] args) {
        GestionBiblioteca gestion = new GestionBiblioteca();

        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "001");
        Libro libro2 = new Libro("1984", "George Orwell", "002");

        gestion.registrarLibro(libro1);
        gestion.registrarLibro(libro2);

        Usuario usuario1 = new Usuario("Maria", "U001", 2);
        gestion.registrarUsuario(usuario1);

        usuario1.prestarLibro(libro1);
        usuario1.prestarLibro(libro2);

        gestion.mostrarDisponibles();

        usuario1.devolverLibro(libro1);
        gestion.mostrarDisponibles();
    }
}
