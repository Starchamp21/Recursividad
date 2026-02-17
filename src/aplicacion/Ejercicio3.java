package aplicacion;

public class Ejercicio3 {
    public static int ProductoEscalar (int v1 [], int v2 [], int n) {
        if (n == 0) {
            return 0;
        }
        return v1[n - 1] * v2[n - 1] + ProductoEscalar(v1, v2, n - 1);
    }

    public static void main (String[] args) {
        int [] v1 = {1, 2, 3};
        int [] v2 = {4, 5, 6};
        System.out.println(ProductoEscalar(v1, v2, v1.length));
    }
}