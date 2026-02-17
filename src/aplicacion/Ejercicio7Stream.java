package aplicacion;

import java.util.stream.*;

public class Ejercicio7Stream {
    public static boolean estaOrdenada(String palabra) {
        return IntStream.range(0, palabra.length() - 1).allMatch(i -> palabra.charAt(i) <= palabra.charAt(i + 1));
    }

    public static void main (String[] args) {
        System.out.println("Prueba 1: " + estaOrdenada("abcdef")); // true.
        System.out.println("Prueba 2: " + estaOrdenada("acb")); // false.
    }
}