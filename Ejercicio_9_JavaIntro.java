/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;

/**
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 *es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
 *diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
 *la función Substring y equals() de Java.
 * @author renzo
 */
public class Ejercicio_9_JavaIntro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase o palabra: ");
        String frase = leer.next();
        String letra = frase.substring(0,0);
        if (frase.startsWith("A")) {
            System.out.println("Correcto.");
        }
        else{
            System.out.println("Incorrecto.");}
    }
}
