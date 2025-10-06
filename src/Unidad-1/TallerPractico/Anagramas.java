package TallerPractico;
import java.util.Arrays;
import java.util.Scanner;

public class Anagramas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palabra1;
        String palabra2;
        char letrasPalabra1[];
        char letrasPalabra2[];
        String respuesta = " ";


        System.out.println("Ingresar la palabra 1:");
        palabra1 = sc.nextLine();
        System.out.println("Ingresar la palabra 2: ");
        palabra2 = sc.nextLine();
        palabra1 = palabra1.toLowerCase().trim(); // Pasar a minusculas
        palabra2 = palabra2.toLowerCase().trim(); // toUpperCase a mayusculas
        

        int cantidadLetras1 = palabra1.length();
        int cantidadLetras2 = palabra2.length();
        
        if (cantidadLetras1 != cantidadLetras2) {
            respuesta = "No son un anagrama";
        } else {
            letrasPalabra1 = new char[cantidadLetras1]; 
            letrasPalabra2 = new char[cantidadLetras2];
            for (int i = 0; i < cantidadLetras1; i++) {
                letrasPalabra1[i] = palabra1.charAt(i) ; // Da las poscicion de la letra

                letrasPalabra2 [i] = palabra2.charAt(i); // conviertir la palabra en un char
            }
            Arrays.sort(letrasPalabra1); //Ordenar
            Arrays.sort(letrasPalabra2); //Ordenar
            int contador = 0;

          for (int i = 0; i < cantidadLetras1; i++) {
            if (letrasPalabra1[i] == letrasPalabra2[i]) {
                contador ++;
            }
            
          }
          if (contador == cantidadLetras1) {

            respuesta = "Es un anagrama";
            
          } else {
            respuesta = "No es un anagrama"; 
          }
            
        }

        System.out.println(respuesta);
    

        sc.close();
    }
}