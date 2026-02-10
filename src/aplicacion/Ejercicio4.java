package aplicacion;

public class Ejercicio4 {
    public static int Potencia (int n, int m) {
        if (m == 0) {
            return 1;
        }
        return n * Potencia(n, m - 1);
    }

    public static void main (String[] args) {
        int n = 7;
        int m = 4;
        System.out.println(Potencia(n, m));
    }
}