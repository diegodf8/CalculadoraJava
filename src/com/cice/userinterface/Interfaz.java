package com.cice.userinterface;

import com.cice.logica.Logica;
import java.util.Scanner;

public class Interfaz {

    private Scanner sc = new Scanner(System.in);
    private int opcion = 0;
    private int numA = 0;
    private int numB = 0;
    private int resultado = 0;
    private Logica logica = new Logica();

    public void iniciar() {
        mostrarMenu();

    }

    private void mostrarMenu() {

        System.out.println("POO CALCULADORA");
        System.out.println("**************************");
        System.out.println("1.- SUMAR");
        System.out.println("2.- RESTAR");
        System.out.println("3.- MULTIPLICAR");
        System.out.println("4.- DIVIDIR");
        System.out.println("0.- SALIR");
        System.out.println("***************************");

        getOpcion();

    }

    private void getOpcion() {

        do {
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por utilizar la calculadora");
                    break;
                case 1:
                    getNumeros();
                    resultado = logica.sumar(numA, numB);
                    System.out.println("El resultado de la suma es: "+ resultado);
                    break;
                case 2:
                    getNumeros();
                    resultado = logica.restar(numA, numB);
                    System.out.println("El resultado de la resta es: "+  resultado);
                    break;
                case 3:
                    getNumeros();
                    resultado = logica.multiplicar(numA, numB);
                    System.out.println("El resultado de la multiplicación es: "+ resultado);
                    break;
                case 4:
                    getNumeros();
                    resultado = logica.dividir(numA, numB);
                    System.out.println("El resultado de la división es: "+ resultado);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 0);

    }

    private void getNumeros(){

        System.out.print("Introduce el primer operando: ");
        numA = sc.nextInt();
        System.out.print("Introduce el segundo operando: ");
        numB = sc.nextInt();


    }
}