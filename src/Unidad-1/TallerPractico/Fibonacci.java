package TallerPractico;
public class Fibonacci {
    
    public static void main(String[] args) {
        long num1 = 0;
        long num2 = 1;
        System.out.print(num1 + ", " + num2);
        for (int i = 2; i < 50; i++) {
            long siguiente = num1 + num2;
            System.out.print(", " + siguiente);
            num1 = num2;
            num2 = siguiente;
        }
        System.out.println();
    }
}

