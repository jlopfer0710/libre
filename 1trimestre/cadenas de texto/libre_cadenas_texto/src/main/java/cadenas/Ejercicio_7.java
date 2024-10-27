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
/*Escriba una aplicación que lea una línea de texto y que imprima sólo aquellas palabras que
comiencen con la letra "b"*/
public class Ejercicio_7 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Introduce una frase");
        String frase=teclado.nextLine();
        String []palabras=frase.split("\\s+");
        System.out.println("Palabras que comienzan con la letra b");
        for(String palabra:palabras){
            if(palabra.toLowerCase().startsWith("b")){
                System.out.println(palabra);
            }
        }
    }
}
