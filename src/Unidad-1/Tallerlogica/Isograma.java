package Tallerlogica;
public class Isograma {
    public static boolean isIsogram(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        str = removeAccents(str.toLowerCase());

        if (str.contains(" ")) {
            return false;
        }

        str = str.replaceAll("[^a-z]", "");

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
          
            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                return false;
            }
        }

        return true;
    }

    private static String removeAccents(String str) {
        return str.replaceAll("[áàäâã]", "a")
                 .replaceAll("[éèëê]", "e")
                 .replaceAll("[íìïî]", "i")
                 .replaceAll("[óòöôõ]", "o")
                 .replaceAll("[úùüû]", "u")
                 .replaceAll("[ý]", "y")
                 .replaceAll("[ñ]", "n");
    }
}

