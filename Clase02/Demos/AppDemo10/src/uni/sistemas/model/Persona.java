
package uni.sistemas.model;

public class Persona {
    //atributos
    private int id;
    private String nombre;
    private char sexo;
    private int edad;
    //constructor

    public Persona() {
    }

    public Persona(int id, String nombre, char sexo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
    // metodos get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Codigo=" + id + "\nNombre=" + nombre + "\n Sexo=" + sexo + "\n Edad=" + edad ;
    }
    
    
    
}
