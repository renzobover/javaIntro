/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 *números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * @author renzo
 */
public class Ejercicio_10_JavaIntro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor limite positivo: ");
        int num = leer.nextInt();
        int num2 = 0;
        int suma = 0;
        
        do {
            System.out.print("Ingrese mas numeros para sumarlos, hasta superar el limite: ");
            num2 = leer.nextInt();
            suma += num2;
        } while (suma <= num);
        System.out.println("Supero el limite. La suma es: " + suma);
    }
    
}
