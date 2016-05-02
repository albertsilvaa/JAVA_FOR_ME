/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egg.service;

/**
 *
 * @author Alumno
 */
public final class MyMath {
    private MyMath(){
    }
    public int factorial(int nfactorial)
    { int rfactorial=1;
        int a=1;
        
        if(nfactorial>0){
        for (int i = 1; i <=nfactorial; i++) {
            a=a*i;
        } 
        rfactorial=a;
        }else{
        rfactorial=1;
        }
        
        return rfactorial;
    }
    
   /* public static void main(String[] args)
    {
        MyMath a=new MyMath();
        System.out.println(a.factorial(6));
        
    }*/
}
