
package uni.sistemas.controller;

import uni.sistemas.entity.Pedido;
import uni.sistemas.model.PedidoModel;

public class PedidoController {
   // variable
    PedidoModel model;
    //constructor

    public PedidoController() {
        model=new PedidoModel();
    }
    
    // metodo de negocio
    public void calcularPedido(Pedido x){
        model.procesarDatos(x);
    }
    
    
}
