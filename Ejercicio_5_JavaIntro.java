/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 *doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author renzo
 */
public class Ejercicio_5_JavaIntro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es: " + triple);
        System.out.println("La raiz cuadrada de " + num + " es: " + raiz);
    }
}
