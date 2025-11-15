public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void prestar() {
        prestado = true;
        System.out.println("El libro fue prestado.");
    }

    public void devolver() {
        prestado = false;
        System.out.println("El libro fue devuelto.");
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numPaginas);
        System.out.println("¿Prestado?: " + prestado);
    }
}
