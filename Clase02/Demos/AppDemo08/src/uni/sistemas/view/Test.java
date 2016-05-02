/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.view;

import uni.sistemas.model.Operacion;

/**
 *
 * @author Alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // prueba
//        long resultado = Operacion.Fibonacci(10);
//        System.out.println("La serie es :" + resultado);
        
        for (long counter = 0; counter <= 10; counter++){
            System.out.println("Fibonacci de "+counter+" es: "+ Operacion.Fibonacci(counter));
        }

    }

}
