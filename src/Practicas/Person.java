public class Person {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    public Person(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Mayor de edad: " + esMayorDeEdad());
    }
}
