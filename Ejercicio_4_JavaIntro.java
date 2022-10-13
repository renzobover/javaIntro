/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author renzo
 */
public class Ejercicio_4_JavaIntro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados para convertirlos en Fahrenheit");
        System.out.print("Grados: ");
        int grados = leer.nextInt();
        double far = 32 + (9 * grados / 5);
        System.out.println("En Fahrenheit: " + far);
    }
}
