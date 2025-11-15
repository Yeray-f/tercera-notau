public class PruebaPersona {
    public static void main(String[] args) {

        Persona p1 = new Persona("Fer", 17, 55.0, 1.60);

        p1.mostrarInformacion();

        p1.setEdad(18);
        p1.setPeso(56);

        p1.mostrarInformacion();
    }
}
