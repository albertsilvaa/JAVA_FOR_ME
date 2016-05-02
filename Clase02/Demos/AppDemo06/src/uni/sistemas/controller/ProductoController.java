package uni.sistemas.controller;

import uni.sistemas.entity.Producto;
import uni.sistemas.model.ProductoModel;

public class ProductoController {

    //variable de la clase ProductoModel

    ProductoModel model;
    //constructor

    public ProductoController() {
        model = new ProductoModel(); //crea objeto
    }

    //metodos de negocio
    public void ProductoRegistrar(Producto p) {
        model.registrar(p);
    }

    public Producto ProductoConsultar() {
        return model.consultar();
    }

    public void ProductoActualizaStock(int opcion, int cant) {
        model.modificaStock(opcion, cant);
    }

    public void ProductoActualizaPrecio(int opcion, double tasa) {
        model.modificaPrecio(opcion, tasa);
    }

}
