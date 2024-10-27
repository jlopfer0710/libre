/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadenas;

/**
 *
 * @author Jorge López Fernández
 */
import java.util.*;
/*Escriba una aplicación que lea una línea de texto e imprima una tabla que indique el número de
palabras de una letra, de dos letras, de tres letras, etcétera, que aparezcan en el texto. Por ejemplo,
en la siguiente tabla se muestra la cuenta para la frase:
*/
public class Ejercicio_13 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Introduce la frase:");
        String frase=teclado.nextLine();
        String[]palabras=frase.split("\\s+");
        int[]cont_palabras=new int[100];
        for(String palabra:palabras){
            int longitud=palabra.length();
            if(longitud>0){
                cont_palabras[longitud]++;
            }
        }
         System.out.println("\nLongitud\tNúmero de palabras");
            System.out.println("-------------------------------");
            for(int i=1;i<cont_palabras.length;i++){
                if(cont_palabras[i]>0){
                    System.out.printf("%d\t\t%d\n",i,cont_palabras[i]);
                }
            }
    }
}
