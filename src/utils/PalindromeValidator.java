package utils;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeValidator {
    public boolean esPalindromo(String texto) {
        Queue<Character> colaOriginal = new LinkedList<>();
        Queue<Character> colaInvertida = new LinkedList<>();
        Queue<Character> colaAuxiliar = new LinkedList<>();

        for (char character : texto.toCharArray()) {
            colaOriginal.offer(character);

            agregarInvertido(colaInvertida, colaAuxiliar, character);
        }

        return colaOriginal.equals(colaInvertida);
    }

    private void agregarInvertido(Queue<Character> invertida, Queue<Character> auxiliar, char character) {
        while (!invertida.isEmpty()) {
            auxiliar.offer(invertida.poll());
        }

        invertida.offer(character);

        while (!auxiliar.isEmpty()) {
            invertida.offer(auxiliar.poll());
        }
    }
}
