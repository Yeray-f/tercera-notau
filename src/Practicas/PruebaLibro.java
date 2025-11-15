public class PruebaLibro {
    public static void main(String[] args) {

        Libro l = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 400);

        l.mostrarInformacion();
        l.prestar();
        System.out.println("¿Está prestado? " + l.estaPrestado());
        l.devolver();
        System.out.println("¿Está prestado? " + l.estaPrestado());
    }
}

