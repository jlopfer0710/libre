package cadenas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge López Fernández
 */
import java.util.*;
/*Escriba una aplicación que lea una línea de texto y que imprima sólo aquellas palabras que
comiencen con las letras "ED".
*/
public class Ejercicio_8 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Introduce la frase:");
        String frase=teclado.nextLine();
        String palabras[]=frase.split("\\s+");
        System.out.println("Palabras que comiencen con 'ED'");
        for(String palabra:palabras){
            if(palabra.toLowerCase().startsWith("ed")){
                System.out.println(palabra);
            }
        }
    }
}
