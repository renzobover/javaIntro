/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author renzo
 */
public class Ejercicio_17_JavaIntro {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el tamaño del vector: ");
    int tamaño = leer.nextInt();
    int[] vector = new int[tamaño];
    String[] vector2 = new String[tamaño];
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;
    int cont4 = 0;
    int cont5 = 0;
    RellenarVector(vector,tamaño);
        System.out.println("");
    ComprobarVector(vector,vector2,cont1,cont2,cont3,cont4,cont5,tamaño);   
    }
   
    public static void RellenarVector(int[] vector, int tamaño){
    for (int i = 0; i < tamaño-1; i++) {
            vector[i] = (int) (Math.random() * 100000 + 1);
            System.out.print(vector[i]);
            System.out.print(" - ");
    }
        
    }
    
    public static void ComprobarVector(int[] vector, String[] vector2, int cont1, int cont2, int cont3, int cont4, int cont5, int tamaño){
        for (int i = 0; i < tamaño-1; i++) {
            vector2[i] = String.valueOf(vector[i]);
            if (vector2[i].length() == 1) {
                cont1++;
            }
            if (vector2[i].length() == 2) {
                cont2++;
            }
            if (vector2[i].length() == 3) {
                cont3++;
            }
            if (vector2[i].length() == 4) {
                cont4++;
            }
            if (vector2[i].length() == 5) {
                cont5++;
            }
        }
        System.out.println(cont1 + " son de 1 digito.");
        System.out.println(cont2 + " son de 2 digito.");
        System.out.println(cont3 + " son de 3 digito.");
        System.out.println(cont4 + " son de 4 digito.");
        System.out.println(cont5 + " son de 5 digito.");
    }
}


