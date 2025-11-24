package Unidad3.GestióndelComedor;



public class Main {
    public static void main(String[] args) {
        GestionComedor g = new GestionComedor();

        Comida c1 = new Comida("Arroz con pollo", "estandar", 5);
        Comida c2 = new Comida("Ensalada", "vegetariana", 3);

        g.registrarComida(c1);
        g.registrarComida(c2);

        Estudiante e1 = new Estudiante("Ana", "001");

        g.registrarConsumo(e1, c1);
        g.mostrarDisponibilidad();
    }
}

