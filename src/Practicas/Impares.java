public class Impares {
    public static void main(String[] args){
        for (int i = 0; i <= 100; i++) {
            
            if (i % 2 == 0) 
            
            continue; //Si es par se salta
            
            System.out.println("Numero impar: " +i);
        }
    }
    
}
