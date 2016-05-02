package appdemo02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

    public static void main(String[] args) {
        // uso de libreria
        Date hoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha :" + formato.format(hoy));
    }

}
