/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro;
import java.util.Scanner;
/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * @author renzo
 */
public class Ejercicio_12_JavaIntro {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese frases de 5 caracteres. Siendo el primero la 'X' y el ultimo una 'O'");
        int cont1 = 0; //Contador para los correctos
        int cont2 = 0; //Contador para los incorrectos
        do {
            System.out.print("Frase: ");
            palabra = leer.next();
            if (palabra.length() == 5) { //Si es de 5 caracteres, recien ahi se evaluan la primer y ultima letra.
                if ((palabra.endsWith("O")) && (palabra.startsWith("X"))) { //Si se cumple esta condicion se suma un contador
                   cont1 += 1; //Contador para los correctos
                }
                else {
                cont2 += 1;}
            }
            else{
                cont2 += 1; //Contador para los incorrectos
            }
            
        } while (!"&&&&&".equals(palabra)); //Mientras que palabra NO (por el signo !) sea igual a "&&&&&"
        
        System.out.println("Cantidad de formatos correctos: " + cont1);
        System.out.println("Cantidad de formatos incorrectos: " + cont2);
    }
}
