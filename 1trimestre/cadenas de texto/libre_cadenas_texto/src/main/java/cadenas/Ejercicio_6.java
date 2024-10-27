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
/* Escriba una aplicación con base en el programa del ejercicio anterior, que reciba como entrada
una línea de texto y utilice el método indexOf de la clase String para determinar el número total de
ocurrencias de cada letra del alfabeto en ese texto. Las letras mayúsculas y minúsculas deben
contarse como una sola. Imprima los valores en formato tabular.*/
public class Ejercicio_6 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String []args){
        System.out.println("Introduce una frase");
        String frase=teclado.nextLine();
        frase=frase.toLowerCase();
        int[]cont_letras=new int[26];
        for(char letra='a';letra<='z';letra++){
            int contador=0;
            int posicion=frase.indexOf(letra);
            while(posicion!=-1){
                contador++;
                posicion=frase.indexOf(letra,posicion+1);
            }
            cont_letras[letra-'a']=contador;
            System.out.println("\nLetra\tOcurrencias");
            System.out.println("----------------------");
            for(char c='a';c<='z';c++){
                System.out.println(c+"\t"+cont_letras[c-'a']);
            }
        }
    }
}
