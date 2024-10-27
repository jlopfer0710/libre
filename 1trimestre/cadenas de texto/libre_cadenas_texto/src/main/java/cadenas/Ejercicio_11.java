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
/*Escriba sus propias versiones de los métodos de búsqueda indexOf y lastIndexOf de la clase
String.
*/
public class Ejercicio_11 {
    public static void main(String[]args){
        String frase="Hola muy buenas";
        System.out.println(lastIndexOf(frase,'a'));
        System.out.println(indexOf(frase,"muy"));
    }
    public static int lastIndexOf(String cadena,char caracter){
        for(int i=cadena.length()-1;i>=0;i--){
            if(cadena.charAt(i)==caracter){
                return i;
            }
        }
        return -1;
    } 
    public static int indexOf(String cadena,String subcadena){
        for(int i=cadena.length()-subcadena.length();i>=0;i--){
            if(cadena.substring(i,i+subcadena.length()).equals(subcadena)){
                return i;
            }
        }
        return-1;
    }
}

