import java.util.Stack;
import utils.PalindromeValidator;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        runSingValidator();
        
        System.out.println();
        runStackSorter();
        
        System.out.println();
        runPalindromeValidator();
    }

    private static void runSingValidator() {
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}"; 
        String cadena2 = "{[(])}"; 

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
    }

    private static void runStackSorter() {
        StackSorter sorter = new StackSorter();
        
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Input: (tope) " + stack);

        sorter.ordenar(stack);
        
        sorter.mostrarStack(stack); 
    }

    private static void runPalindromeValidator() {
        PalindromeValidator validador = new PalindromeValidator();
        
        String input1 = "ana";
        String input2 = "radar";
        String input3 = "java";

        System.out.println("Input: '" + input1 + "' | Es palindromo? " + validador.esPalindromo(input1));
        System.out.println("Input: '" + input2 + "' | Es palindromo? " + validador.esPalindromo(input2));
        System.out.println("Input: '" + input3 + "' | Es palindromo? " + validador.esPalindromo(input3));
    }
}