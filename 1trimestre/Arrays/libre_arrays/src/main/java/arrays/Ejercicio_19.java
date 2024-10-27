/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jorge López Fernández
 */
/*(La criba de Eratóstenes) Un numero primo es cualquier entero mayor que 1, divisible solo por
si mismo y por el numero 1. La Criba de Eratostenes es un método para encontrar números primos,
el cual opera de la siguiente manera:
a) Cree un array del tipo primitivo boolean, con todos los elementos inicializados en true. Los
elementos del array con indices primos permanecerán como true. Cualquier otro elemento
del array eventualmente cambiara a false.
b) Empezando con el indice 2 del array, determine si un elemento dado es true. De ser así, itere
a través del resto del array y asigne false a todo elemento cuyo indice sea múltiplo del indice
del elemento que tiene el valor true. Después continue el proceso con el siguiente elemento
que tenga el valor true. Para el indice 2 del array, todos los elementos mas allá del elemento
2 en el array que tengan indices múltiplos de 2 (los indices 4, 6, 8, 10, etcétera) se
establecerán en false; para el indice 3 del array, todos los elementos mas allá del elemento 3
en el array que tengan indices múltiplos de 3 (los indices 6, 9, 12, 15, etcétera) se
establecerán en false; y así sucesivamente.
Cuando este proceso termine, los elementos del array que aun sean true indicaran que el indice es
un numero primo. Estos indices pueden mostrarse. Escriba una aplicación que utilice un array de
1000 elementos para determinar e imprimir los números primos entre 2 y 999. Ignore los elementos
0 y 1 del array.*/

public class Ejercicio_19 {
    public static void main(String[]args){
         int limite = 1000; 
        boolean[] esPrimo = new boolean[limite];


        for (int i = 2; i < limite; i++) {
            esPrimo[i] = true;
        }


        for (int i = 2; i * i < limite; i++) {
            if (esPrimo[i]) {
 
                for (int j = i * i; j < limite; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
        System.out.println("Números primos entre 2 y 999:");
        for (int i = 2; i < limite; i++) {
            if (esPrimo[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
