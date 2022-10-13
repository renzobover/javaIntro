/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author renzo
 */
public class Ejercicio_15_JavaIntro {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int[] matriz = new int [100];
        for (int i = 0; i < 100; i++) {
           matriz[i] = i + 1; 
        }
    Intercambio(matriz);
    }

    public static void Intercambio(int matriz[]){
    for (int i = 100; i > 0; i--) {
        System.out.print(matriz[i-1]);
        System.out.print(" - ");
    }
}
}
