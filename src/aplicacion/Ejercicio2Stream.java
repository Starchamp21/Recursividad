package aplicacion;

import java.util.stream.*;

public class Ejercicio2Stream {
    public static void main (String[] args) {

        int n = 5;

        // Números de forma ascendente.
        IntStream.range(1, n + 1).forEach(x -> {
            System.out.println(x);
        });

        System.out.println("------------");

        // Números de forma descendente.
        IntStream.iterate(n, (x) -> {
            x -= 1; 
            return x;
        }).limit(n).forEach(x -> {
            System.out.println(x);
        });
    }
}