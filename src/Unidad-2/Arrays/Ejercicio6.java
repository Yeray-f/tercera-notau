import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] dias = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número del mes (1-12): ");
        int numMes = sc.nextInt();

        if (numMes < 1 || numMes > 12) {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        } else {
            System.out.println("El mes es " + meses[numMes - 1] + " y tiene " + dias[numMes - 1] + " días.");
        }

        sc.close();
    }
}
