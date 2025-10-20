public class AcomuladorConSuma {
//Sumar numeros desde 1 a 100
    public static void main(String[] args) {
        
        int suma = 0;
        
        for (int i = 0; i <= 100; i++) {
            suma += i;
            
        }

        System.out.println("La suma es: " + suma);
    }
}