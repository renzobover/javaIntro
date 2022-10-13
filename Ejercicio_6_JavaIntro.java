/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *Crear un programa que dado un numero determine si es par o impar.
 * @author renzo
 */
public class Ejercicio_6_JavaIntro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        if (num%2 == 0) {
            System.out.println("El numero es par.");}
        else{
            System.out.println("El numero no es par.");}
        
    }
}
