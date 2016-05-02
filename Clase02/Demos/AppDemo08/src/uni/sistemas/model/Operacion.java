package uni.sistemas.model;

public class Operacion {

    //metodos sobrecargados
    public static float Promedio(int n1, int n2) {
        return (n1 + n2) / 2.0f;
    }

    public static float Promedio(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3.0f;
    }

    public static float Promedio(int n1, int n2, int n3, int n4) {
        return (n1 + n2 + n3 + n4) / 4.0f;
    }

    public static float Promedio(int n1, int n2, int n3, int n4, int n5) {
        return (n1 + n2 + n3 + n4 + n5) / 5.0f;
    }

    public static long Fibonacci(long n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

}
