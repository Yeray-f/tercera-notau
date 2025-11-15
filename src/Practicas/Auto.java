public class Auto {

    private String marca;
    private String modelo;
    private double velocidadActual;
    private double combustible;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
        this.combustible = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public void acelerar(double kmh) {
        velocidadActual += kmh;
        System.out.println("El auto " + marca + " " + modelo + " acelera a " + velocidadActual + " km/h.");
    }

    public void frenar(double kmh) {
        velocidadActual -= kmh;
        if (velocidadActual < 0) velocidadActual = 0;
        System.out.println("El auto frenó. Velocidad actual: " + velocidadActual + " km/h.");
    }

    public void recargarCombustible(double litros) {
        combustible += litros;
        System.out.println("Combustible restante: " + combustible + " L");
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Combustible: " + combustible + " L");
    }
}
