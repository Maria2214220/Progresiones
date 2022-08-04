package Modelo;

import java.util.Scanner;

public class ProgresionA {
  public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
        int n,x,factorial=1;
        double sumaTotal=0;
        System.out.print("Ingrese N :");
        n=leer.nextInt();
        System.out.print("Ingrese X :");
        x=leer.nextInt();
    //la serie inicia en 0
       for (int i = 0; i <= n; i++) {
           if(i>=1){
        factorial=1;
    //calculando el factorial
    for (int j = 1; j <= i; j++) {
       factorial=factorial*j;      
      }  
  }
    sumaTotal=sumaTotal+(Math.pow(x, i))/factorial;
     }
    System.out.println("Suma Total de La Serie es:  "+sumaTotal);
  }
}
}