/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * @author renzo
 */
public class Ejercicio_3_JavaIntro {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase, y se transformaran las letras en minusculas y mayusculas.");
        System.out.print("Frase: ");
        String frase = leer.next();
        
        String f_minusculas = frase.toLowerCase();
        System.out.println("Frase en minusculas: " + f_minusculas);
        String f_mayusculas = frase.toUpperCase();
        System.out.println("Frase en mayusculas: " + f_mayusculas);
        
    }
}
