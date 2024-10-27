/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadenas;

/**
 *
 * @author Jorge López Fernández
 */
/*- Escriba una aplicación que reciba como entrada una línea de texto y que la imprima dos veces;
una vez en letras mayúsculas y otra en letras minúsculas.*/
import java.util.*;
public class Ejercicio_4 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        String frase;
        System.out.println("Introduce la frase");
        frase=teclado.nextLine();
        System.out.println("Esta es la frase: "+frase);
        System.out.println("La frase en minúsucula es: "+frase.toLowerCase());
        System.out.println("La frase en mayúscula es: "+frase.toUpperCase());
    }
}
