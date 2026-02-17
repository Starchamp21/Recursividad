package aplicacion;

import java.util.stream.*;

public class Ejercicio1Stream {
    public static int sumarNaturales(int n) {
        return IntStream.range(1, n + 1).sum();
    }

    public static void main (String[] args) {
        int n = 7;
        System.out.println("Suma de números naturales: " + sumarNaturales(n));
    }
}