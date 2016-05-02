package uni.sistemas.model;

public class Docente extends Persona {

    //atributos
    private char categoria;
    private double sueldo;
    //constructor

    public Docente() {
    }

    public Docente(int id, String nombre, char sexo, int edad, char categoria) {
        super(id, nombre, sexo, edad);
        this.categoria = categoria;
    }
    //metodos get y set

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        switch (categoria) {
            case 'A':
                sueldo = 5000;
                break;
            case 'B':
                sueldo = 4000;
                break;
            case 'C':
                sueldo = 3000;
                break;
        }
        return sueldo;
    }

//    public void setSueldo(double sueldo) {
//        this.sueldo = sueldo;
//    }
    @Override
    public String toString() {
        return super.toString() + "\nCategoria=" + categoria + "\nSueldo=" + getSueldo();
    }

}
