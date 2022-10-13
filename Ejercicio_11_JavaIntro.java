/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
 * pantalla el siguiente menú:
 * MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
* El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 * @author renzo
 */
public class Ejercicio_11_JavaIntro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos.");
        System.out.print("1er numero: ");
        int num1 = leer.nextInt();
        System.out.print("2do numero: ");
        int num2 = leer.nextInt();
        int opcion;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
        opcion = leer.nextInt();
            switch (opcion) {
            
            case 1: int sumar = num1 + num2;
                    System.out.println("El resultado de la suma es: " + sumar);
            break;
            case 2: int restar = num1 - num2;
                    System.out.println("El resultado de la resta es: " + restar);
            break;
            case 3: int multiplicar = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + multiplicar);
            break; 
            case 4: double dividir = num1 / num2;
                    System.out.println("El resultado de la division es: " + dividir);
            break;
            default: 
                if (opcion == 5) {
                    System.out.println("Adios.");
                }
                else{
                System.out.println("Opcion no valida.");}
            } 
        } while(opcion != 5);
    }
    }

