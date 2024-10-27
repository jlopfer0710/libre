/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jorge López Fernández
 */
/*(Tiro de dados) Escriba una aplicación para simular el tiro de dos dados. La aplicación debe
utilizar un objeto de la clase Random una vez para tirar el primer dado, y de nuevo para tirar el
segundo dado. Después debe calcularse la suma de los dos valores. Cada dado puede mostrar un
valor entero del 1 al 6, por lo que la suma de los valores variara del 2 al 12, siendo 7 la suma mas
frecuente, mientras que 2 y 12 serán las sumas menos frecuentes. En la siguiente tabla se muestran
las 36 posibles combinaciones de los dos dados.
1 2 3 4 5 6
1 2 3 4 5 6 7
2 3 4 5 6 7 8
3 4 5 6 7 8 9
4 5 6 7 8 9 10
5 6 7 8 9 10 11
6 7 8 9 10 11 12
Su aplicación debe tirar los dados 36,000 veces. Utilice un array unidimensional para registrar el
numero de veces que aparezca cada una de las posibles sumas. Muestre los resultados en formato
tabular. Determine si los totales son razonables (es decir, hay seis formas de tirar un 7, por lo que
aproximadamente una sexta parte de los tiros deben ser 7).*/
import java.util.*;
public class Ejercicio_14 {
    public static void main(String[]args){
        Random random = new Random();
        int[] conteoSuma = new int[13]; 
        int lanzamientos = 36000;


        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = random.nextInt(6) + 1; 
            int dado2 = random.nextInt(6) + 1; 
            int suma = dado1 + dado2;          
            conteoSuma[suma]++;                
        }

  
        System.out.println("Suma\tFrecuencia\tProbabilidad (%)");
        for (int i = 2; i <= 12; i++) {
            double probabilidad = (double) conteoSuma[i] / lanzamientos * 100;
            System.out.printf("%d\t%d\t\t%.2f%%%n", i, conteoSuma[i], probabilidad);
        }
    }
}
