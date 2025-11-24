public class PruebaPerson {
    public static void main(String[] args) {
    
        Person persona1 = new Person("Lina", 20, 60.0, 1.65);

        persona1.mostrarInformacion();

        persona1.setEdad(22);
        persona1.setPeso(62.0);

        System.out.println("\nDespués de actualizar algunos datos:");
        persona1.mostrarInformacion();

        Person persona2 = new Person("Carlos", 16, 55.0, 1.70);
        System.out.println("\nInformación de la segunda persona:");
        persona2.mostrarInformacion();
    }
}
