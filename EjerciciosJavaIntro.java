/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *
 * @author renzo
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
public class EjerciciosJavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros, para luego sumarlos y mostrar el resultado: ");
        System.out.print("Numero 1: ");
        int num1 = leer.nextInt();
        System.out.print("Numero 2: ");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        System.out.println("La suma de ambos numeros es: " + suma);
    }
    
}
