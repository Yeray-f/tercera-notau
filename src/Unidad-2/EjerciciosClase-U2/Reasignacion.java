package Unidad2.Ejercicios;

class Persona {
    String nombre;
}

public class Reasignacion {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Carlos";

        System.out.println("Antes de cambiarReferencia: " + persona.nombre);
        cambiarReferencia(persona);
        System.out.println("Después de cambiarReferencia: " + persona.nombre);
    }

    public static void cambiarReferencia(Persona p) {
        p = new Persona(); // Se crea un nuevo objeto
        p.nombre = "Laura";
        System.out.println("Dentro del método, nombre: " + p.nombre);
    }
}
