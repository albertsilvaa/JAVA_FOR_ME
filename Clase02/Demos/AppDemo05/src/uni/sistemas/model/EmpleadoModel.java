package uni.sistemas.model;

import uni.sistemas.entity.Empleado;

public class EmpleadoModel {

    //constructor
    public EmpleadoModel() {

    }

    // metodo para procesar datos
    public void procesarDatos(Empleado e) {
        //variables
        double tot = e.getDias() * e.getHoras() * e.getPago();
        e.setTotal(tot);
        if (e.getTotal() > 1500) {
            e.setRenta(tot * 0.08);
        } else {
            e.setRenta(0);
        }
        e.setNeto(e.getTotal() - e.getRenta());
    }

}
