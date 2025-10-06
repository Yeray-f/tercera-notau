package Tallerlogica;
public class LetrasporNumeros {
    public static String convert(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String cleanedStr = cleanString(input.toLowerCase());

        StringBuilder result = new StringBuilder();
        boolean firstNumber = true;

        for (char c : cleanedStr.toCharArray()) {
            if (Character.isLetter(c)) {
               
                if (!firstNumber) {
                    result.append(" ");
                }
                
                result.append(c - 'a' + 1);
                firstNumber = false;
            }
        }

        return result.toString();
    }

    private static String cleanString(String str) {
        
        str = str.replaceAll("[áàäâã]", "a")
                 .replaceAll("[éèëê]", "e")
                 .replaceAll("[íìïî]", "i")
                 .replaceAll("[óòöôõ]", "o")
                 .replaceAll("[úùüû]", "u")
                 .replaceAll("[ý]", "y")
                 .replaceAll("[ñ]", "n");

        str = str.replaceAll("[^a-z ]", "");

        return str.trim().replaceAll("\\\\s+", " ");
    }
}

