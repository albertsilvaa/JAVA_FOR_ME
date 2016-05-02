package uni.sistemas.controller;

import uni.sistemas.entity.Empleado;
import uni.sistemas.model.EmpleadoModel;

public class EmpleadoController {

    //variable de la clase empleadoModel
    EmpleadoModel model;
    //constructor

    public EmpleadoController() {
        //crea objeto
        model = new EmpleadoModel();
    }

    //metodo de negocio
    public String calcularSueldo(Empleado x) {
        model.procesarDatos(x);
        
        String boleta = "Nombre  :" + x.getNombre() + "\n"
                + "Dias Trab.  :" + x.getDias() + "\n"
                + "Horas Trab.  :" + x.getHoras() + "\n"
                + "Pago x Hora.  :" + x.getPago() + "\n"
                + "Total        :" + x.getTotal() + "\n"
                + "Renta(8%)  :" + x.getRenta() + "\n"
                + "Sueldo Neto  :" + x.getNeto() + "\n";
        return boleta;
    }

}
