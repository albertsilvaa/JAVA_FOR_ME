/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.service;
import pe.egcc.model.PagoDto;

/**
 *
 * @author ALBERT
 */
public class PagoService {
   
    public void Procesar(PagoDto dto) {
    double ingreso=0;
    double renta=0;
    double neto=0;
    ingreso=(dto.getPagoxhoras()*dto.getHoras()*dto.getDias());
    
    if(ingreso>1500)
    {
        renta=ingreso*0.08;
        
    }else{ 
       renta=0;
    } 
    neto=ingreso-renta;
    System.out.println(neto);
    System.out.println(renta);
    dto.setIngresos(ingreso);
    dto.setRenta(renta);
    dto.setNeto(neto);
    
  }
}
