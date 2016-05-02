package uni.sistemas.model;

import uni.sistemas.entity.Pedido;

public class PedidoModel {

    //constructor

    public PedidoModel() {
    }

    // metodo para procesar datos

    public void procesarDatos(Pedido p) {
        //variables
        double igv = p.getImporte() * 0.18;
        p.setImpuesto(igv);
        double tot = p.getImporte() + p.getImpuesto();
        p.setTotal(tot);
    }

}
