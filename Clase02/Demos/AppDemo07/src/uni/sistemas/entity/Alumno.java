
package uni.sistemas.entity;

public class Alumno {
    //atributos
    private String nombre;
    private String curso;
    //constructor

    public Alumno() {
    }

    public Alumno(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
    }
    //metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
