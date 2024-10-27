/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cadenas;

/**
 *
 * @author Jorge López Fernández
 */
import java.util.*;
public class Ejercicio_3 {
    /*- Escriba una aplicación que utilice el método compareTo de la clase String para comparar dos
cadenas introducidas por el usuario. Muestre si la primera cadena es menor, igual o mayor que la
segunda.*/
   static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
       String frase, frase2;
        System.out.println("Introduzca la primera frase:");
        frase=teclado.nextLine();
        System.out.println("Introduzca la segunda frase:");
        frase2=teclado.nextLine();
        if(frase.compareTo(frase2)<0){
            System.out.println("La frase: "+frase+" es menor que: "+frase2);
        }else if(frase.compareTo(frase2)==0){
            System.out.println("La frase: "+frase+" es igual: "+frase2);
        }else if(frase.compareTo(frase2)>=1){
            System.out.println("La frase: "+frase+" es igual: "+frase2);
        }
    }
}
