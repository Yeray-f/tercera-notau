class Coche {
    String marca;
}

public class Cambiarobjetos {
    public static void main(String[] args) {
        // Ejemplo con tipo primitivo
        int velocidad = 80;
        cambiarVelocidad(velocidad);
        System.out.println("Velocidad después de cambiarVelocidad: " + velocidad);
        // Imprime 80, no cambia

        // Ejemplo con objeto
        Coche miCoche = new Coche();
        miCoche.marca = "Toyota";
        cambiarMarca(miCoche);
        System.out.println("Marca después de cambiarMarca: " + miCoche.marca);
        // Imprime Honda, sí cambia
    }

    public static void cambiarVelocidad(int velocidad) {
        velocidad = 120; // Solo cambia dentro del método
    }

    public static void cambiarMarca(Coche coche) {
        coche.marca = "Honda"; // Cambia el atributo del mismo objeto
    }
}

