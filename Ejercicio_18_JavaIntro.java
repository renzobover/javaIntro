/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 *traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
 *cambiando sus filas por columnas (o viceversa).
 * @author renzo
 */
public class Ejercicio_18_JavaIntro {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int[][] matriz1 = new int[4][4];
    int[][] matriz2 = new int[4][4];
    RellenarMatriz(matriz1);
        System.out.println("");
    TrasponerMatriz(matriz1,matriz2);
    }
    
    
    public static void RellenarMatriz(int[][] matriz1){
        System.out.println("Matriz Original");
    for (int i = 0; i < 4; i++) {
        System.out.println("");
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = (int) (Math.random()* 100);
                System.out.print(matriz1[i][j] + " - ");
            }
    }
        System.out.println("");
    }
    
    public static void TrasponerMatriz(int[][] matriz1, int[][]matriz2){
        System.out.println("Matriz Traspuesta");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = matriz1[j][i];
                System.out.print(matriz2[i][j] + " - ");
            }
        }
    }
}
