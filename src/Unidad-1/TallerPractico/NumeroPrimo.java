package TallerPractico;
public class NumeroPrimo {
    
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int numero = 29;
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
        
        System.out.println("Primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}

