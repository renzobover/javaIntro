/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
 *matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
 *signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
 *denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author renzo
 */
public class Ejercicio_19_JavaIntro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
    boolean verificacion = false;
    int cont = 0;
    int [][] matriz1 = {{0,-2,4},{2,0,2},{-4,-2,0}};
    int [][] matriz2 = {{0,2,-4},{-2,0,-2},{4,2,0}};
    
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("'" + matriz1[i][j] + "'" + " - "); 
            }
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz1[i][j] != -matriz2[i][j]) {
                    cont ++;
                }
                
            }
            
        }
        
        if (cont != 0) {
            System.out.println("La matriz NO es antisimetrica.");
        }
        else{
            System.out.println("La matriz ES antisimetrica");}
        
    }
}
