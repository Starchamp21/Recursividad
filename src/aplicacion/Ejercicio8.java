package aplicacion;

public class Ejercicio8 {
    public static boolean esPalindromo(String palabra) {
        if (palabra.length() <= 1) {
            return true;
        }
        
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        }

        return esPalindromo(palabra.substring(1, palabra.length() - 1));
    }

    public static void main (String[] args) {
        System.out.println("Prueba 1: " + esPalindromo("reconocer")); // true.
        System.out.println("Prueba 2: " + esPalindromo("java")); // false.
    }
}