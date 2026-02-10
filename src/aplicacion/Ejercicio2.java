package aplicacion;

public class Ejercicio2 {
    public static void Ascendente (int n) {
        if (n == 0) {
            return;
        }
        Ascendente (n - 1);
        System.out.println(n);
    }

    public static void Descendente (int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Descendente (n - 1);
    }

    public static void main (String[] args) {
        Ascendente(4);
        System.out.println("--------------");
        Descendente(4);
    }
}