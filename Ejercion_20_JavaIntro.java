/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
 *suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
 *permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 *El programa deberá comprobar que los números introducidos son correctos, es decir,
 *están entre el 1 y el 9.
 * 2 7 6
 * 9 5 1
 * 4 3 8
 * @author renzo
 */
public class Ejercion_20_JavaIntro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz magica: ");  
        int tamaño = leer.nextInt();
        int[][] matriz = new int[tamaño][tamaño];
        RellenarMatriz(matriz,tamaño,leer);
        ComprobarMatriz(matriz,tamaño);
    }
    public static void RellenarMatriz(int[][] matriz, int tamaño, Scanner leer){
    for (int i = 0; i < tamaño; i++) {
            System.out.println("Fila " + (i+1));
            for (int j = 0; j < tamaño; j++) {
                System.out.print(" - ");
                matriz[i][j] = leer.nextInt();
            }
            
        }
    }
    
    public static void ComprobarMatriz(int[][]matriz, int tamaño){
    int s_filas, s_columnas, s_diagonal_p, s_diagonal_i;
    int c_filas, c_columnas, c_diagonal_p, c_diagonal_i, aux;
    aux = 0;
    s_diagonal_p = 0;
    s_diagonal_i = 0;
    c_filas = 0;
    c_columnas = 0;
    c_diagonal_p = 0;
    c_diagonal_i = 0;
    
        for (int i = 0; i < tamaño; i++) { //Suma de las filas.
            s_filas = 0;
            for (int j = 0; j < tamaño; j++) {
            s_filas += matriz[i][j];    
            }
            if (s_filas == 15) { //Si la fila suma 15, se suma el contador.
                c_filas++; 
            }
        }
        
        for (int i = 0; i < tamaño; i++) { //Suma de las columnas.
            s_columnas = 0;
            for (int j = 0; j < tamaño; j++) {
            s_columnas += matriz[i][j];    
            }
            if (s_columnas == 15) { //Si la columna suma 15, se suma el contador.
                c_columnas++;
            }
        }
        
        for (int i = 0; i < tamaño; i++) {
            s_diagonal_p += matriz[i][i];
        }
        if (s_diagonal_p == 15) { //Si la diagonal suma 15, se suma una sola vez el contador.
            c_diagonal_p++; 
        }
        
        for (int i = 0; i < tamaño; i++) {
            s_diagonal_i += matriz[i][tamaño-i-1];
        }
        if (s_diagonal_p == 15) { //Si la diagonal suma 15, se suma una sola vez el contador.
            c_diagonal_i++;
        }
        
        if ((c_diagonal_p == 1) && (c_diagonal_i == 1) && (c_columnas == c_filas)) { //Si los contadores de las diagonales = 1 y si los contadores de columnas y filas son iguales, entonces es magico. 
            System.out.println("El cuadrado es magico. So' un crack :)"); 
        }
        else{
            System.out.println("El cuadrado no es magico, suerte la prox broh ;)");}
    }
}
