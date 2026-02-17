package aplicacion;

// import java.util.stream.*;

public class Ejercicio5Stream {
    public static long ContarDigitos(int n) {
        return String.valueOf(n).chars().count();
    }

    public static void main (String[] args) {
        int n = 123445667;
        System.out.println("Cantidad de dígitos del número " + n + ": " + ContarDigitos(n));
    }
}