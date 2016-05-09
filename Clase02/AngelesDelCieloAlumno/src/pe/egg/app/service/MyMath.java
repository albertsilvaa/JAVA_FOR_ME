/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egg.app.service;

/**
 *
 * @author Alumno
 */
public final class MyMath {
    private MyMath(){
    }
    public static int factorial(int nfactorial)
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
  
  public static int mcd(int n1, int n2){
    int r=0;
      if(n1>n2){
        do{ 
        r=n1%n2;
        n1=n2;
        n2=r;
        }while(n2!=0);
               
    }else{
        do{ 
        r=n2%n1;
        n2=n1;
        n1=r;
        }while(n1!=0);
         n1=n2;      
    }
    return n1;
  }
  
  public static int mcm(int n1, int n2){
    int MCD=mcd(n1,n2);
    int r1=Math.max(n1,n2);
    int r2=Math.min(n1,n2);
    int MCM=(r1/MCD)*r2;
    
    return MCM;
  }
  
  public static int[] fibonacci(int n){
      int a=0;
      int b=1;
      int[] arreglo;
      arreglo =new int[n];
      if(n==1)
      {
          arreglo[0]=a+b;
      }else{     
          arreglo[0]=a+b;
          for(int d=1; d<n;d++){    
              
              arreglo[d]=arreglo[d-1]+a;                 
                a=arreglo[d-1];
                
                  
          //System.out.println("valor de b"+b);
            //  System.out.println("valor de a"+a);
      }}
    return arreglo;
  }
  
  public static boolean esPrimo(int n){
    int primo=0;
    boolean nprimo=false;
    if(n!=1){
      for(int i=1; i<=n;i++){
        if(n%i==0){
            primo++;
        }
        
    }}
      if(primo==2){
        nprimo=true;
        }else
        {nprimo=false;
        }
    return nprimo;
  }
   /* public static void main(String[] args)
    {
        MyMath a=new MyMath();
        System.out.println(a.factorial(6));
        
    }*/
}
