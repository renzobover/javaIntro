/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 *
 * @author renzo
 */
public class Ejercicio_13_JavaIntro {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Para hacer el cuadrado de asteriscos ingrese el tamaño: ");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i>0)&&(i<(num-1))&&(j>0)&&(j<(num-1))) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                             
            }
            System.out.println("");   
        }
    }
}
