package aplicacion;

import java.util.stream.*;

public class Ejercicio6Stream {
    public static int Fibonacci(int N) {
        return Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0] + f[1]}).limit(N + 1).reduce((a, b) -> b).get()[0];
    }

    public static void main (String[] args) {
        int n = 7;
        System.out.println("Número " + n + " en la Sucesión de Fibonacci: " + Fibonacci(n));
    }
}