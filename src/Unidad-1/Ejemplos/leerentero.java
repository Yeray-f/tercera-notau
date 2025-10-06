package Ejemplos;

import java.util.Scanner;

public class leerentero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("Número entero leído: " + numero);

        scanner.close();
    }
}
