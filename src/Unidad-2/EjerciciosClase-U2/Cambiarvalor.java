package Unidad2.Ejercicios;
public class Cambiarvalor {

    public static void main(String[] args) {
        int numero = 45;
        System.out.println("Antes de llamar a cambiarNumero: " + numero);

        cambiarNumero(numero);

        System.out.println("Después de llamar a cambiarNumero: " + numero); // seguirá siendo 45
    }

    public static void cambiarNumero(int n) {
        System.out.println("Dentro del método, valor recibido: " + n);
        n = 99; // cambiamos el valor dentro del método
        System.out.println("Dentro del método, valor cambiado: " + n);
    }
}


