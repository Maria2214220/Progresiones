package Modelo;

import java.util.Scanner;

public class ProgresionG {

static int termino1, difirencia;

public static void main(String[] args) {
// entrada
int termino1, razon, termino2;
int posicion;
int terminopos = 0;
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("INDICA EL PRIMER TERMINO ");
    termino1 = sc.nextInt();
    System.out.println("INDICA EL SEGUMDO TERMINO ");
    termino2 = sc.nextInt();
    // formula
    razon = (int) termino2 / termino1;
    
    System.out.println("para que posicion quieres calcular : ");
    posicion = sc.nextInt();
    // System.out.println(Math.pow(2,3));
}

terminopos = (int) (termino1 * Math.pow(razon, posicion - 1));

// terminopos = CalculaPosicion(posicion, termino1, difirencia);
System.out.println("el valor para la posicion : " + posicion + "resulta ser" + "" + terminopos);

System.out.println("el termino para la posicion n es : " + "resulta ser a{posicion n}=" + termino1 + "" + razon
+ "" + "(n-1)*" + razon);
}

public static int CalculaPosicion(int posicion, int termino1, int difirencia) {

if (posicion == 1) {
return termino1;

} else
return CalculaPosicion(posicion - 1, termino1, difirencia) + difirencia;
}

}