package aplicacion;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println(sumarNaturales(7));
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