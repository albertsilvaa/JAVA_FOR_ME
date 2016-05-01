/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model;

/**
 *
 * @author ALBERT
 */
public class PagoDto {
   private int horas;
   private int dias;
   private double pagoxhoras;
   private  double ingresos;
   private  double renta;
   private  double neto;

   public PagoDto(double ingreso,double renta,double neto)
   {
       this.ingresos=ingreso;
       this.renta=renta;
       this.neto=neto;
   }
    public PagoDto(int a,int b,double c)
    {
      this.dias=a;
      this.horas=b;
      this.pagoxhoras=c;
              
    }
    

    public PagoDto() {
         //To change body of generated methods, choose Tools | Templates.
    }

 
   

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPagoxhoras() {
        return pagoxhoras;
    }

    public void setPagoxhoras(double pagoxhoras) {
        this.pagoxhoras = pagoxhoras;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
}
