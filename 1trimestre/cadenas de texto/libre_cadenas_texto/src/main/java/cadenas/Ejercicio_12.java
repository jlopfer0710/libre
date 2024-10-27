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
/* Escriba una aplicación que lea una línea de texto desde el teclado e imprima una tabla que
indique el número de ocurrencias de cada letra del alfabeto en el texto. Por ejemplo, la frase:
*/
public class Ejercicio_12 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Intoduce una frase");
        String frase=teclado.nextLine();
        frase=frase.toLowerCase();
        int[] cont_letras=new int[26];
        for(int i=0;i<frase.length();i++){
            char letra=frase.charAt(i);
            if(letra>='a'&&letra<='z'){
                cont_letras[letra-'a']++;
            }
        }
        System.out.println("\nLetra\tOcurrencias");
        System.out.println("---------------------");
        for(char letra='a';letra<='z';letra++){
            System.out.printf("%c\t%d\n",letra, cont_letras[letra-'a']);
        }
    }
}
