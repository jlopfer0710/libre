/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jorge López Fernández
 */
/*12.- (Eliminación de duplicados) Use un array unidimensional para resolver el siguiente problema:
escriba una aplicación que reciba como entrada cinco números, cada uno de los cuales debe estar
entre 10 y 100. A medida que se lea cada numero, muéstrelo solamente si no es un duplicado de un
numero que ya se haya leído. Prepárese para el “peor caso”, en el que los cinco números son
diferentes. Use el array mas pequeño que sea posible para resolver este problema. Muestre el
conjunto completo de valores únicos introducidos, después de que el usuario introduzca cada nuevo
valor.*/
import java.util.*;
public class Ejercicio_12 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        int[] numerosUnicos = new int[5]; // Array de tamaño máximo posible
        int contador = 0; // Contador para la cantidad de números únicos

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número entre 10 y 100: ");
            int numero = teclado.nextInt();

            if (numero < 10 || numero > 100) {
                System.out.println("El número no está en el rango de 10 a 100. Intente nuevamente.");
                i--; 
                continue;
            }

            boolean esDuplicado = false;
            for (int j = 0; j < contador; j++) {
                if (numerosUnicos[j] == numero) {
                    esDuplicado = true;
                    break;
                }
            }

            if (!esDuplicado) {
                numerosUnicos[contador] = numero;
                contador++;
                System.out.print("Números únicos introducidos hasta ahora: ");
                for (int j = 0; j < contador; j++) {
                    System.out.print(numerosUnicos[j] + " ");
                }
                System.out.println();
            } else {
                System.out.println("El número " + numero + " es un duplicado. No se añadirá.");
            }
        }
    }
}
