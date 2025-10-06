package Tallerlogica;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Desarrollador {
    String firstName;
    String lastName;
    String country;
    String continent;
    int age;
    String language;

    public Desarrollador(String firstName, String lastName, String country, String continent, int age, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.continent = continent;
        this.age = age;
        this.language = language;
    }
}

public class Continentes {

    public static boolean continentesRepresentados(List<Desarrollador> desarrolladores) {
        Set<String> continentesNecesarios = new HashSet<>();
        continentesNecesarios.add("Africa");
        continentesNecesarios.add("Americas");
        continentesNecesarios.add("Asia");
        continentesNecesarios.add("Europe");
        continentesNecesarios.add("Oceania");

        Set<String> continentesEncontrados = new HashSet<>();

        for (Desarrollador dev : desarrolladores) {
            continentesEncontrados.add(dev.continent);
        }

        return continentesEncontrados.containsAll(continentesNecesarios);
    }

    public static int contarJSDesarrolladoresEuropa(List<Desarrollador> desarrolladores) {
        int contador = 0;
        for (Desarrollador dev : desarrolladores) {
            if (dev.language.equals("JavaScript") && dev.continent.equals("Europe")) {
                contador++;
            }
        }
        return contador;
    }

    public static void agregarSaludo(List<Desarrollador> desarrolladores) {
        for (Desarrollador dev : desarrolladores) {
            System.out.println("Hi " + dev.firstName + ", what do you like the most about " + dev.language + "?");
        }
    }

    public static Set<String> listarLenguajesRepresentados(List<Desarrollador> desarrolladores) {
        Set<String> lenguajes = new HashSet<>();
        for (Desarrollador dev : desarrolladores) {
            lenguajes.add(dev.language);
        }
        return lenguajes;
    }

    public static void main(String[] args) {
        List<Desarrollador> desarrolladores = new ArrayList<>();
        desarrolladores.add(new Desarrollador("Fatima", "A.", "Algeria", "Africa", 25, "JavaScript"));
        desarrolladores.add(new Desarrollador("Agustin", "M.", "Chile", "Americas", 37, "C"));
        desarrolladores.add(new Desarrollador("Jing", "X.", "China", "Asia", 39, "Ruby"));
        desarrolladores.add(new Desarrollador("Laia", "P.", "Andorra", "Europe", 55, "Ruby"));
        desarrolladores.add(new Desarrollador("Oliver", "Q.", "Australia", "Oceania", 65, "PHP"));

        System.out.println("¿Todos los continentes están representados? " + continentesRepresentados(desarrolladores));
        System.out.println("Cantidad de desarrolladores de JavaScript en Europa: " + contarJSDesarrolladoresEuropa(desarrolladores));
        agregarSaludo(desarrolladores);
        System.out.println("Lenguajes representados: " + listarLenguajesRepresentados(desarrolladores));
    }
}