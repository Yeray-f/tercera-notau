package EjerciciosClase;
public class Variables {
    public static void main(String[] args) throws Exception {
        // Declara y asigna valores a variables
        int edad = 17;
        double altura = 1.67;
        char inicialNombre = 'Y';
        // Determina si es mayor de edad según la edad
        boolean esMayorDeEdad;
        if (edad >= 18) {
            esMayorDeEdad = true;
        } else {
            esMayorDeEdad = false;
        }
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial del nombre: " + inicialNombre);
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);
    }
}
