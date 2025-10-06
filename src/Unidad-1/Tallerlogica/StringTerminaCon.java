package Tallerlogica;
public class StringTerminaCon {
    public static boolean terminaCon(String str, String ending) {
        return str.endsWith(ending);
    }

    public static boolean terminaConManual(String str, String ending) {
        
        if (ending.length() > str.length()) {
            return false;
        }

        return str.substring(str.length() - ending.length()).equals(ending);
    }

    public static void main(String[] args) {
        
        System.out.println(terminaCon("abc", "bc"));     // true
        System.out.println(terminaCon("abc", "d"));      // false
        System.out.println(terminaCon("hola", "ola"));   // true
        System.out.println(terminaCon("hola", "hola"));  // true
        System.out.println(terminaCon("hola", ""));      // true

        System.out.println(terminaConManual("abc", "bc"));     // true
        System.out.println(terminaConManual("abc", "d"));      // false
        System.out.println(terminaConManual("hola", "ola"));   // true
        System.out.println(terminaConManual("hola", "hola"));  // true
        System.out.println(terminaConManual("hola", ""));      // true
    }
}
