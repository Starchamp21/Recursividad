package aplicacion;

import java.util.stream.*;

public class Stream1 {
    public static void main(String[] args) {

        int suma = IntStream.range(1, 11).reduce(0, (x, y) -> x + y);

        System.out.println("Suma: " + suma);

        long cantidad = IntStream.range(1, 11).count();

        System.out.println("Cantidad de elementos: " + cantidad);

        double media = (double) suma / cantidad;

        System.out.println("Media: " + media);
    }
}