package aplicacion;

import java.util.stream.*;

public class Ejercicio3Stream {
    public static int ProductoEscalar(int[] v1, int[] v2) {
        return IntStream.range(0, v1.length).map(i -> v1[i] * v2[i]).sum();
    }

    public static void main (String[] args) {
        int [] v1 = {1, 2, 3};
        int [] v2 = {4, 5, 6};
        System.out.println(ProductoEscalar(v1, v2));
    }
}