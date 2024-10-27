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
/*Modifique la aplicación anterior de manera que genere todos los posibles códigos de tres
dígitos en el rango de 000 a 255, y que intente imprimir los caracteres correspondientes.*/
public class Ejercicio_10 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Códigos numéricos y sus carácteres correspondientes: ");
        for(int cod=0;cod<=255;cod++){
            char carac=(char)cod;
            System.out.printf("%03d -> %c%n",cod,carac);
        }
    }
}
