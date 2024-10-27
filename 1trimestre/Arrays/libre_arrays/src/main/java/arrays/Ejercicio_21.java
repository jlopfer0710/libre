/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jorge López Fernández
 */
/* Escriba una aplicación que utilice la generación de números aleatorios para crear enunciados.
Use cuatro arrays de cadenas llamados articulo, sustantivo, verbo y preposición. Cree una oración
seleccionando una palabra al azar de cada uno de los arrays, en el siguiente orden: articulo,
sustantivo, verbo, preposición., articulo y sustantivo. A medida que se elija cada palabra,
concaténela con las palabras anteriores en el enunciado. Las palabras deberán separarse mediante
espacios. Cuando se muestre el enunciado final, deberá empezar con una letra mayúscula y terminar
con un punto. El programa deberá generar 20 enunciados y mostrarlos en un área de texto.
El array de artículos debe contener los artículos "el", "un", "algún" y "ningún"; el array de
sustantivos deberá contener los sustantivos "niño", "niña", "perro", "ciudad" y "coche"; el array de
verbos deberá contener los verbos "condujo", "salto", "corrió", "camino" y "omitió"; el array de
preposiciones deberá contener las preposiciones "a", "desde", "encima de", "debajo de" y "sobre".*/
import java.util.*;
public class Ejercicio_21 {
    public static void main(String[]args){
     
        String[] articulos = {"el", "un", "algún", "ningún"};
        String[] sustantivos = {"niño", "niña", "perro", "ciudad", "coche"};
        String[] verbos = {"condujo", "saltó", "corrió", "caminó", "omitió"};
        String[] preposiciones = {"a", "desde", "encima de", "debajo de", "sobre"};

        Random random = new Random();
        String[] oraciones = new String[20];

        
        for (int i = 0; i < oraciones.length; i++) {
      
            String articulo = articulos[random.nextInt(articulos.length)];
            String sustantivo = sustantivos[random.nextInt(sustantivos.length)];
            String verbo = verbos[random.nextInt(verbos.length)];
            String preposicion = preposiciones[random.nextInt(preposiciones.length)];
            String articulo2 = articulos[random.nextInt(articulos.length)];
            String sustantivo2 = sustantivos[random.nextInt(sustantivos.length)];

          
            String oracion = String.format("%s %s %s %s %s %s.", 
                articulo.substring(0, 1).toUpperCase() + articulo.substring(1), 
                sustantivo,
                verbo,
                preposicion,
                articulo2,
                sustantivo2);

            oraciones[i] = oracion;
        }

        System.out.println("Oraciones generadas:");
        for (String oracion : oraciones) {
            System.out.println(oracion);
        }
    }
}
