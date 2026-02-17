package aplicacion;

import java.util.stream.*;

public class Ejercicio9Stream {
    public static String decimalABinario(int n) {
        return IntStream.iterate(n, i -> i > 0, i -> i / 2).map(i -> i % 2).mapToObj(String::valueOf).collect(Collectors.collectingAndThen(Collectors.joining(), s -> new StringBuilder(s).reverse().toString()));
    }

    public static void main (String[] args) {
        int n = 10;
        System.out.println("El resultado del número decimal " + n + " a binario es: " + decimalABinario(n));
    }
}