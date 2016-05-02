package uni.sistemas.model;

public class Persona {

    // atributo
    String codigo;
    String nombre;
    double sueldo;
    // construcor

    public Persona(String codigo, String nombre, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // metodo
    public String MostrarDatos() {
        return "Codigo  :" + codigo
                + "\nNombre :" + nombre
                + "\nSueldo  :" + sueldo;
    }
}
