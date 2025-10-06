package Ejemplos;

import java.util.Scanner;

public class leerpalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.next();

        System.out.println("Palabra leída: " + palabra);

        scanner.close();
    }
}
