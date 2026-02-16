package aplicacion;

import java.util.stream.*;

public class Stream2 {
    public static void main(String[] args) {

        int N = 10;

        // El rangeClosed(1, N) genera números desde 1 hasta N (incluido).
        // El .filter(n -> n % 2 != 0) hace que quede solo con los impares.
        // El .sum() los suma automáticamente.
        int sumaImpares = IntStream.rangeClosed(1, N).filter(n -> n % 2 != 0).sum();

        System.out.println("Suma de impares: " + sumaImpares);
    }
}