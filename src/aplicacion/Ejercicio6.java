package aplicacion;

public class Ejercicio6 {
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main (String[] args) {
        int n = 7;
        System.out.println("Número " + n + " en la Sucesión de Fibonacci: " + Fibonacci(n));
    }
}