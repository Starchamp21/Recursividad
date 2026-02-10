package aplicacion;

public class Ejercicio7 {
    public static boolean EstarOrdenada(String palabra) {
        if (palabra.length() <= 1) {
            return true;
        }
        
        if (palabra.charAt(0) > palabra.charAt(1)) {
            return false;
        }

        return EstarOrdenada(palabra.substring(1));
    }

    public static void main (String[] args) {
        System.out.println("Prueba 1: " + EstarOrdenada("abcdef")); // true.
        System.out.println("Prueba 2: " + EstarOrdenada("acb")); // false.
    }
}