public class PruebaAuto {
    public static void main(String[] args) {

        Auto a = new Auto("Toyota", "Corolla");

        a.recargarCombustible(40);
        a.acelerar(80);
        a.mostrarEstado();
        a.frenar(50);
        a.mostrarEstado();
    }
}
