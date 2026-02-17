package aplicacion;

import java.util.stream.*;

public class Ejercicio8Stream {
    public static boolean esPalindromo(String palabra) {
        return IntStream.range(0, palabra.length() / 2).allMatch(i -> palabra.charAt(i) == palabra.charAt(palabra.length() - 1 - i));
    }

    public static void main (String[] args) {
        System.out.println("Prueba 1: " + esPalindromo("reconocer")); // true.
        System.out.println("Prueba 2: " + esPalindromo("java")); // false.
    }
}