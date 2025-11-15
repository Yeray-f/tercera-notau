public class PruebaRectangulo {
    public static void main(String[] args) {

        Rectangulo r = new Rectangulo(5, 4);

        r.mostrarDatos();
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
        System.out.println("¿Es cuadrado? " + r.esCuadrado());
    }
}
