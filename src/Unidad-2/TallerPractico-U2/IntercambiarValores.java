public class IntercambiarValores { 

    public static void intercambiar(int a, int b) {

        int temporal = a;
        a = b;
        b = temporal;

        System.out.println ("En intercambiar a = " + a + "y b = " + b);
    }

    public static void main(String[] args){
        int a = 5;
        int b = 10;

        System.out.println("Antes de intercambiar: a = " + a + ", b = " + b);
        intercambiar(a,b);
        System.out.println ("Despues de intercambiar a = " + a + ", b = " + b);
    }
}