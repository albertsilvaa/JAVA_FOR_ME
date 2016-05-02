package uni.sistemas.model;

public class Alumno extends Persona {

    //atributos
    private int promedio;
    private String estado;
    //constructor

    public Alumno() {
    }

    public Alumno(int id, String nombre, char sexo, int edad, int promedio) {
        super(id, nombre, sexo, edad);
        this.promedio = promedio;
    }
    // metodos get y set

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        if (promedio >= 14) {
            estado = "Aprobado";
        } else if (promedio >= 10 && promedio < 14) {
            estado = "Sustitutorio";
        } else {
            estado = "Desaprobado";
        }
        return estado;
    }

//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
    @Override
    public String toString() {
        return super.toString() + "\nPromedio=" + promedio + "\nEstado=" + getEstado();
    }

}
