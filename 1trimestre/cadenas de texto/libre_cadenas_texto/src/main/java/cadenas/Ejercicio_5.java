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
/*- Escriba una aplicación que reciba como entrada una línea de texto y un carácter de búsqueda, y
que utilice el método indexOf de la clase String para determinar el número de ocurrencias de ese
carácter en el texto.*/
public class Ejercicio_5 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        int contador=0,posicion;
        System.out.println("Introduce una frase:");
        String frase=teclado.nextLine();
        System.out.println("Introduce un carácter de busqueda");
        char carac=teclado.next().charAt(0);
        posicion=frase.indexOf(carac);
        while(posicion!=-1){
            contador++;
            posicion=frase.indexOf(carac,posicion+1);
        }
        System.out.println("El carácter "+carac+" aparece "+contador+" veces en la frase");
    }
}
