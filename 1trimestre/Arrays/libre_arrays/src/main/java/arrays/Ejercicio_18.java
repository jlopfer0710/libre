/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jorge López Fernández
 */
/*- (Ocho reinas) Un enigma para los entusiastas del ajedrez es el problema de las Ocho reinas, el
cual pregunta lo siguiente: ¿es posible colocar ocho reinas en un tablero de ajedrez vacío, de tal
manera que ninguna “ataque” a cualquier otra (es decir, que no haya dos reinas en la misma fila, en
la misma columna o a lo largo de la misma diagonal)? Diseñe una aplicación que, probando todas
las posibilidades, determine si existe alguna combinación de posiciones en la que las ocho reinas
puedan estar en el tablero sin atacarse.
*/
import java.util.*;
public class Ejercicio_18 {
     private static final int TAMANO = 8; 
    private static int[] posiciones = new int[TAMANO];
    public static void main(String[]args){
        resolver(0);
    }
     private static void resolver(int fila) {
        if (fila == TAMANO) {
 
            imprimirTablero();
            return;
        }

        for (int col = 0; col < TAMANO; col++) {
            if (esSegura(fila, col)) {
                posiciones[fila] = col;                 
                resolver(fila + 1); 
            }
        }
    }

    private static boolean esSegura(int fila, int col) {
        for (int i = 0; i < fila; i++) {

            if (posiciones[i] == col || 
                posiciones[i] - i == col - fila || 
                posiciones[i] + i == col + fila) {
                return false; 
            }
        }
        return true; 
    }

    private static void imprimirTablero() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (posiciones[i] == j) {
                    System.out.print(" R "); 
                } else {
                    System.out.print(" . "); 
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
