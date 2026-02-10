package aplicacion;

public class Ejercicio5 {
    public static int ContarDigitos (int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + ContarDigitos(n/10);
    }

    public static void main (String[] args) {
        int n = 123445667;
        System.out.println("Cantidad de dígitos del número " + n + ": " + ContarDigitos(n));
    }
}