package utils;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String signos) {

        Stack<Character> stack = new Stack<>();
        for (Character character : signos.toCharArray()) {
            /// character -> (
            /// character -> }
            /// 1 -> comprobar si es de apertura o cierre
            
            if (getIsApertura(character)) {
                // Ingresar a la pila
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ultimo = stack.pop(); // APERTURA
                // Último es del mismo tipo que el character?
                // mismoTipo = isTipoIgual(character, ultimo);
                // ultimo ( && character ) -> TRUE
                // ultimo [ && character ] -> TRUE 
                // ultimo { && character } -> TRUE 
                // ultimo ( && character } -> FALSE 
                if (!isTipoIgual(ultimo, character)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean getIsApertura(Character character) {
        if (character == '(' || character == '[' || character == '{') {
            return true;
        }
        return false;
    }

    private boolean isTipoIgual(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
            (apertura == '[' && cierre == ']') ||
            (apertura == '{' && cierre == '}');
    }
}