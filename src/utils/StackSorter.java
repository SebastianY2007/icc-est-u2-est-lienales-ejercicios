package utils;

import java.util.Stack;

public class StackSorter {

    public void ordenar(Stack<Integer> stack) {
        Stack<Integer> tmpStack = new Stack<>();

        while (!stack.isEmpty()) {
            int tmp = stack.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                stack.push(tmpStack.pop());
            }

            tmpStack.push(tmp);
        }

        while (!tmpStack.isEmpty()) {
            stack.push(tmpStack.pop());
        }
    }

    public void mostrarStack(Stack<Integer> stack) {
        Stack<Integer> auxiliar = new Stack<>();

        System.out.print("Output: (tope) ");
        
        while (!stack.isEmpty()) {
            int valor = stack.pop();
            System.out.print(valor);
            
            auxiliar.push(valor);
            
            if (!stack.isEmpty()) {
                System.out.print(" -> ");
            }
        }
        System.out.println(); 

        while (!auxiliar.isEmpty()) {
            stack.push(auxiliar.pop());
        }
    }
}