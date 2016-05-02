package uni.sistemas.libreria;

public class Operacion {

    //metodos sobrecargados
    public float Promedio(int n1, int n2) {
        return (n1 + n2) / 2.0f;
    }

    public float Promedio(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3.0f;
    }

    public float Promedio(int n1, int n2, int n3, int n4) {
        return (n1 + n2 + n3 + n4) / 4.0f;
    }

    public float Promedio(int n1, int n2, int n3, int n4, int n5) {
        return (n1 + n2 + n3 + n4 + n5) / 5.0f;
    }
}
