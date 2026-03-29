package aplicacion;

import java.util.stream.*;
/* import java.time.Duration;
import java.time.LocalDateTime; */

public class Ejercicio1Stream {
    public static int sumarNaturales(int n) {
        return IntStream.range(1, n + 1).sum();
    }

    public static void main (String[] args) {
        int n = 7;
        /* LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fin = LocalDateTime.now(); */

        System.out.println("Suma de números naturales: " + sumarNaturales(n));
        /* System.out.println("Tiempo ejecución: " + Duration.between(inicio, fin).toMillis() + " ms");
        System.out.println("Fecha y hora de inicio: " + inicio);
        System.out.println("Fecha y hora de fin: " + fin); */
    }
}