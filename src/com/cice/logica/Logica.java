/* Contiene todos los métodos logicos la aplicación

*/
package com.cice.logica;

public class Logica {

    //Suma
    public int sumar(int numA, int numB){
        int resultado = 0;

        resultado = numA + numB;

        return resultado;
    }


    //Resta
    public int restar(int numA, int numB){
        int resultado = 0;

        resultado =  numA - numB;

        return resultado;
    }

    //Multiplicacion
    public int multiplicar (int numA, int numB){
        int resultado=0;

        resultado = numA * numB;

        return resultado;
    }

    //Division
    public int dividir (int numA, int numB){
        int resultado = 0;

        resultado = numA / numB;

        return  resultado;

    }


}
