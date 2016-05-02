package uni.sistemas.model;

public class Hijo extends Padre {

    //constructor

    public Hijo() {
        super();//ejecuta el contructor del padre
        System.out.println("Android es un SO para moviles");
    }

    //metodo

    @Override
    public void Mensaje() {
        fecha="16/03/2016";        
        super.Mensaje();
        System.out.println("Android Studio es un IDE para desarrollar aplicaciones para moviles.");
    }

}
