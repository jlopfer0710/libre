/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jorge López Fernández
 */
/*- (Simulación: la tortuga y la liebre) En este problema usted recreara la clásica carrera de la
tortuga y la liebre. Utilizara la generación de números aleatorios para desarrollar una simulación de
este memorable suceso.
Nuestros competidores empezaran la carrera en la posición 1 de 70 posiciones. Cada posición
representa a una posible posición a lo largo del curso de la carrera. La linea de meta se encuentra en
la posición 70. El primer competidor en llegar a la posición 70 recibirá una cubeta llena con
zanahorias y lechuga frescas. El recorrido se abre paso hasta la cima de una resbalosa montaña, por
lo que ocasionalmente los competidores pierden terreno.
Un reloj hace tictac una vez por segundo. Con cada tic del reloj, su aplicación debe ajustar la
posición de los animales de acuerdo con las reglas de la siguiente tabla. Use variables para llevar el
registro de las posiciones de los animales (los números son del 1 al 70). Empiece con cada animal
en la posición 1 (la “puerta de inicio”). Si un animal se resbala hacia la izquierda antes de la
posición 1, regréselo a la posición 1.
Genere los porcentajes en la figura de movimientos siguiente produciendo un entero aleatorio i en el
rango 1 ≤ i ≤ 10. Para la tortuga, realice un “paso pesado rápido” cuando 1 ≤ i ≤ 5, un “resbalón”
cuando 6 ≤ i ≤ 7 o un “paso pesado lento” cuando 8 ≤ i ≤ 10. Utilice una técnica similar para mover
a la liebre.
Animal Tipo de movimiento Porcentaje del tiempo Movimiento actual
TortugaPaso pesado rápido 50 % 3 posiciones a la derecha
Resbalón 20 % 6 posiciones a la izquierda
Paso pesado lento 30 % 1 posición a la derecha
Liebre Dormir 20 % Ningún movimiento
Gran salto 20 % 9 posiciones a la derecha
Gran resbalón 10 % 12 posiciones a la izquierda
Pequeño salto 30 % 1 posición a la derecha
Pequeño resbalón 20 % 2 posiciones a la izquierda
Empiece la carrera imprimiendo el mensaje
PUM!!!
Y ARRANCAN!!!
Luego, para cada tic del reloj (es decir, cada repetición de un ciclo) imprima una linea de 70
posiciones, mostrando la letra T en la posición de la tortuga y la letra H en la posición de la liebre.
En ocasiones los competidores se encontraran en la misma posición. En este caso, la tortuga muerde
a la liebre y su aplicación debe imprimir OUCH!!! empezando en esa posición. Todas las posiciones
de impresión distintas de la T, la H o el mensaje OUCH!!! (en caso de un empate) deben estar en
blanco.
Después de imprimir cada linea, compruebe si uno de los animales ha llegado o se ha pasado de la
posición 70. De ser así, imprima quien fue el ganador y termine la simulación. Si la tortuga gana,
imprima LA TORTUGA GANA!!! YAY!!! Si la liebre gana, imprima La liebre gana. Que mal. Si
ambos animales ganan en el mismo tic del reloj, tal vez usted quiera favorecer a la tortuga (la mas
débil) o tal vez quiera imprimir Es un empate. Si ninguno de los dos animales gana, ejecute el ciclo
de nuevo para simular el siguiente tic del reloj. Cuando este listo para ejecutar su aplicación, reúna
a un grupo de aficionados para que vean la carrera. !Se sorprenderá al ver lo participativa que puede
ser su audiencia!*/
import java.util.*;
public class Ejercicio_20 {
    public static void main(String[]args){
        int posicionTortuga = 1; 
        int posicionLiebre = 1;  
        final int META = 70;   
        Random random = new Random();

        System.out.println("PUM!!! Y ARRANCAN!!!\n");

        while (posicionTortuga < META && posicionLiebre < META) {
            int iTortuga = random.nextInt(10) + 1;
            int iLiebre = random.nextInt(10) + 1;

            if (iTortuga <= 5) { 
                posicionTortuga += 3;
            } else if (iTortuga <= 7) {
                posicionTortuga -= 6;
            } else { 
                posicionTortuga += 1;
            }

            if (iLiebre <= 2) {
            } else if (iLiebre <= 4) { 
                posicionLiebre += 9;
            } else if (iLiebre == 5) { 
                posicionLiebre -= 12;
            } else if (iLiebre <= 7) { 
                posicionLiebre += 1;
            } else { 
                posicionLiebre -= 2;
            }

            if (posicionTortuga < 1) {
                posicionTortuga = 1;
            }
            if (posicionLiebre < 1) {
                posicionLiebre = 1;
            }

            imprimirEstadoCarrera(posicionTortuga, posicionLiebre);

            if (posicionTortuga >= META && posicionLiebre >= META) {
                System.out.println("Es un empate!");
                break;
            } else if (posicionTortuga >= META) {
                System.out.println("LA TORTUGA GANA!!! YAY!!!");
                break;
            } else if (posicionLiebre >= META) {
                System.out.println("La liebre gana. Que mal.");
                break;
            }
        }
    }
    public static void imprimirEstadoCarrera(int posicionTortuga, int posicionLiebre) {
        for (int i = 1; i <= 70; i++) {
            if (i == posicionTortuga && i == posicionLiebre) {
                System.out.print("OUCH!!!");
            } else if (i == posicionTortuga) {
                System.out.print("T");
            } else if (i == posicionLiebre) {
                System.out.print("H");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(); 
    }
}
