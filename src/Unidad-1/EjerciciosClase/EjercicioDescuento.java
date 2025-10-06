package EjerciciosClase;
public class EjercicioDescuento {
    public static void main(String[] args) throws Exception {
        double camiseta1 = 25;
        double camiseta2 = 30;
        System.out.println("El precio de la primera camiseta es: " + camiseta1);
        System.out.println("El precio de la segunda camiseta es: " + camiseta2);
        System.out.println("Si compra una camiseta, se aplicara un descuento del 15%");
        System.out.println("Ademas, por la compra de dos camisetas, se aplicara un descuento extra del 5%");
        double camiseta1descuento = camiseta1 - (camiseta1 * 0.15);
        double camiseta2descuento = camiseta2 - (camiseta2 * 0.15);
        System.out.println("El precio de la primera camiseta con descuento es: " + camiseta1descuento);
        System.out.println("El precio de la segunda camiseta con descuento es: " + camiseta2descuento);
        double descuentoextra = camiseta1descuento + camiseta2descuento - ((camiseta1descuento + camiseta2descuento) * 0.05);
        System.out.println("Si compra las dos camisetas, el precio total con descuento es: " + descuentoextra);
    }
}
