/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jroge López Fernández
 */
/*- (Gráficos de tortuga) El lenguaje Logo hizo famoso el concepto de los gráficos de tortuga.
Imagine a una tortuga mecánica que camina por todo el cuarto, bajo el control de una aplicación en
Java. La tortuga sostiene una pluma en una de dos posiciones, arriba o abajo. Mientras la pluma esta
abajo, la tortuga va trazando figuras a medida que se va moviendo, y mientras la pluma esta arriba,
la tortuga se mueve alrededor libremente, sin trazar nada. En este problema usted simulara la
operación de la tortuga y creara un bloc de dibujo computarizado.
Utilice un array de 20 por 20 llamado piso, que se inicialice con ceros. Lea los comandos que
introduzca el usuario. Lleve el registro de la posición actual de la tortuga en todo momento, y si la
pluma se encuentra arriba o abajo. Suponga que la tortuga siempre empieza en la posición (0, 0) del
piso, con su pluma hacia arriba. El conjunto de comandos de la tortuga que su aplicación debe
procesar se muestra en la siguiente figura:
Comando Significado
1 Pluma arriba
2 Pluma abajo
3 Girar a la derecha
4 Girar a la izquierda
5
10
Avanzar hacia delante 10 espacios
(cambiar 10 por el número de espacios deseados)
6 Imprimir el array de 20 por 20
9 Fin
Suponga que la tortuga se encuentra en algún lado cerca del centro del piso. El siguiente
“programa” dibuja e imprime un cuadrado de 12 por 12, dejando la pluma en posición levantada:
2
5
12
4
5
12
4
5
12
4
5
12
1
6
9
A medida que la tortuga se vaya desplazando con la pluma hacia abajo, asigne 1 a los elementos
apropiados del array piso. Cuando se de el comando 6 (imprimir el array), siempre que haya un 1 en
el array muestre un asterisco o cualquier carácter que usted elija. Siempre que haya un 0, muestre
un carácter en blanco.*/
import java.util.*;
public class Ejercicio_17 {
    static Scanner teclado=new Scanner(System.in);
     private static final int TAMANO = 20;
    private static int[][] piso = new int[TAMANO][TAMANO];
    private static int posX = 0; 
    private static int posY = 0; 
    private static boolean plumaAbajo = false; 
    private static int direccion = 0; 
    public static void main(String[]args){
        int comando;
        do {
            System.out.println("Introduce un comando (1- Pluma arriba, 2- Pluma abajo, "
                    + "3- Girar a la derecha, 4- Girar a la izquierda, "
                    + "5- Avanzar, 6- Imprimir el array, 9- Fin): ");
            comando = teclado.nextInt();

            switch (comando) {
                case 1:
                    plumaAbajo = false; 
                    break;
                case 2:
                    plumaAbajo = true; 
                    break;
                case 3:
                    girarDerecha();
                    break;
                case 4:
                    girarIzquierda(); 
                    break;
                case 5:
                    System.out.print("¿Cuántos espacios desea avanzar? ");
                    int espacios = teclado.nextInt();
                    avanzar(espacios);
                    break;
                case 6:
                    imprimirPiso();
                    break;
                case 9:
                    System.out.println("Fin del programa."); 
                    break;
                default:
                    System.out.println("Comando no válido.");
            }
        } while (comando != 9);
    }
     private static void girarDerecha() {
        direccion = (direccion + 1) % 4;
    }
    private static void girarIzquierda() {
        direccion = (direccion + 3) % 4; 
    }

    private static void avanzar(int espacios) {
        for (int i = 0; i < espacios; i++) {
       
            switch (direccion) {
                case 0: 
                    if (posY > 0) posY--;
                    break;
                case 1:
                    if (posX < TAMANO - 1) posX++;
                    break;
                case 2: 
                    if (posY < TAMANO - 1) posY++;
                    break;
                case 3:
                    if (posX > 0) posX--;
                    break;
            }
   
            if (plumaAbajo) {
                piso[posY][posX] = 1;
            }
        }
    }

    private static void imprimirPiso() {
        System.out.println("Estado del piso:");
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (piso[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
