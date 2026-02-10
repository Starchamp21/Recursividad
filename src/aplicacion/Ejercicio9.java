package aplicacion;

public class Ejercicio9 {
    public static String decimalAbinario (int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decimalAbinario(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("El resultado del número decimal " + n + " a binario es: " + decimalAbinario(n));
    }
}