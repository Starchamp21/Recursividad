package aplicacion;

import java.util.stream.*;

public class Ejercicio4Stream {
    public static int Potencia(int n, int m) {
        return IntStream.range(0, m).map(i -> n).reduce(1, (x, y) -> x * y);
    }

    public static void main (String[] args) {
        int n = 2;
        int m = 3;
        System.out.println(Potencia(n, m));
    }
}