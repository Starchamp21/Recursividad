package aplicacion;
/* import java.time.Duration;
import java.time.LocalDateTime; */

public class Ejercicio1 {
    public static void main(String[] args) {
        /* LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fin = LocalDateTime.now(); */

        System.out.println(sumarNaturales(7));
        /* System.out.println("Tiempo ejecución: " + Duration.between(inicio, fin).toMillis() + " ms");
        System.out.println("Fecha y hora de inicio: " + inicio);
        System.out.println("Fecha y hora de fin: " + fin); */
    }   

    public static int sumarNaturales(int n) {
        // Condición base y de parada.
        if (n == 1) {
            return 1;
        }
        // Caso base que no para.
        return n + sumarNaturales(n - 1);
    }
}