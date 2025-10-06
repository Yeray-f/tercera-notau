package Tallerlogica;
import java.util.Stack;

public class ValidarParentesis {

    public static boolean esValido(String s) {
      
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
           
            if (c == '(') {
                stack.push(c);
            }
            
            else if (c == ')') {
               
                if (stack.isEmpty()) {
                    return false;
                }
                
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
    
        System.out.println(esValido("()"));              
        System.out.println(esValido(")(()))"));         
        System.out.println(esValido("("));               
        System.out.println(esValido("(())((()())())"));  
    }
}
