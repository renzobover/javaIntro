/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 *
 * @author renzo
 */
public class Ejercicio_14_JavaIntro {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Euros para convertirlos a otra moneda: ");
        int euros = leer.nextInt();
        double dolares = 1.28611;
        double libras = 0.86;
        double yenes = 129.852;
        double conversion = 0;
        boolean salir = true;
        
        
        do {
        System.out.println("Menu");
        System.out.println("1- Convertir a dolares: ");
        System.out.println("2- Convertir a yanes: ");
        System.out.println("3- Convertir a libras: ");
        System.out.print("Ingrese la opcion: ");
        int opcion = leer.nextInt();    
        
        
        switch (opcion) {
            case 1: conversion = euros * dolares; 
                salir = true;
                break;
            case 2: conversion = euros * yenes;
                salir = true;
                break;
            case 3: conversion = euros * libras; 
                salir = true;
                break;
            default:
                System.out.println("Opcion no valida...");
                salir = false;
                System.out.println("");
            
        }
        } while (true != salir);
       
        Mensaje(euros,dolares,libras,yenes,conversion);
    }
    public static void Mensaje(int euros, double dolares, double libras, double yenes, double conversion){
       System.out.println("La conversion es: " + conversion); 
    }
}
