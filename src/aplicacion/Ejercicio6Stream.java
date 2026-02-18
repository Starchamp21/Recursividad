package aplicacion;

import java.util.stream.*;
// import java.util.ArrayList;

public class Ejercicio6Stream {
    public static int Fibonacci(int N) {
        return Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0] + f[1]}).limit(N + 1).reduce((a, b) -> b).get()[0];
        /*
        ArrayList<Integer> memoria = new ArrayList<>();
        memoria.add(0); // (Posición - 2)

        // (x es el número anterior (Posición - 1))
        return Stream.iterate(1, (x) -> {
            int num = x + memoria.get(memoria.size() - 1);
            memoria.add(x);
            return num;
        }).limit(N);
        */
    }

    public static void main (String[] args) {
        int n = 7;
        System.out.println("Número " + n + " en la Sucesión de Fibonacci: " + Fibonacci(n));
    }
}