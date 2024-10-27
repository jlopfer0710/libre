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
/*- Escriba una aplicación que reciba como entrada un código entero para un carácter y que muestre
el carácter correspondiente. */
public class Ejercicio_9 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Introduce el código entero");
        int codigo=teclado.nextInt();
        char carac=(char)codigo;
        System.out.println("El código: "+codigo+" le corresponde al carácter: "+carac);
    }
}
