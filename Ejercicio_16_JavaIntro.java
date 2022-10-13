/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
 *usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 *numero y si se encuentra repetido
 * @author renzo
 */
public class Ejercicio_16_JavaIntro {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamaño = leer.nextInt();
        int pos = 0;
        int cont = 0;
        int[] vector = new int [tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * 5); //Genera numeros aleatorios entre 0 y 4.
            System.out.print(vector[i]);
            System.out.print(" - ");
        }
        System.out.println("");
    System.out.print("Ingrese un numero para buscar en el vector: ");
    int num = leer.nextInt();
        
        for (int i = 0; i < tamaño; i++) {
            if (vector[i] == num) {
                pos = (i + 1);
                System.out.println("Se encontró el numero en la posicion: " + pos);
            }
        }
        if (pos == 0) {
            System.out.println("No se encontro el numero.");
        }
    
        
        
    
    
    }
}
