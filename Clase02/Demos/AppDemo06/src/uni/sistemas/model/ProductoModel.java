package uni.sistemas.model;

import uni.sistemas.entity.Producto;

public class ProductoModel {

    // variable de la clase Producto
    Producto pro;

    //constructor
    public ProductoModel() {
        pro = new Producto();
    }

    //metodos para procesar datos
    public void registrar(Producto x) {
        pro = x;
    }

    public Producto consultar() {
        return pro;
    }

    public void modificaStock(int opcion, int cant) {
        switch (opcion) {
            case 1: //aumento
                pro.setStock(pro.getStock() + cant);
                break;
            case 0: //disminuir
                pro.setStock(pro.getStock() - cant);
                break;
        }
    }

    public void modificaPrecio(int opcion, double tasa) {
        switch (opcion) {
            case 1: //aumento
                pro.setPrecio(pro.getPrecio() + pro.getPrecio() * tasa / 100);
                break;
            case 0: //disminuir
                pro.setPrecio(pro.getPrecio() - pro.getPrecio() * tasa / 100);
                break;
        }
    }

}
