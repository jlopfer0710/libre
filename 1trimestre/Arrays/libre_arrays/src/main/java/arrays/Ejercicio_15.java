/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jorge López Fernández
 */
 /*(Sistema de reservas de una aerolínea) Una pequeña aerolínea acaba de comprar una
computadora para su nuevo sistema de reservas automatizado. Se le ha pedido a usted que
desarrolle el nuevo sistema. Usted escribirá una aplicación para asignar asientos en cada vuelo del
único avión de la aerolínea (capacidad: 10 asientos).
Su aplicación debe mostrar las siguientes alternativas: Por favor escriba 1 para Primera Clase y Por
favor escriba 2 para Económico. Si el usuario escribe 1, su aplicación debe asignarle un asiento en
la sección de primera clase (asientos 1 a 5). Si el usuario escribe 2, su aplicación debe asignarle un
asiento en la sección económica (asientos 6 a 10). Su aplicación deberá entonces imprimir una
tarjeta de embarque, indicando el numero de asiento de la persona y si se encuentra en la sección de
primera clase o clase económica del avión.
Use un array unidimensional del tipo primitivo boolean para representar la tabla de asientos del
avión. Inicialice todos los elementos del array con false para indicar que todos los asientos están
vacíos. A medida que se asigne cada asiento, establezca los elementos correspondientes del array
en true para indicar que ese asiento ya no esta disponible.
Su aplicación nunca deberá asignar un asiento que ya haya sido asignado. Cuando este llena la
sección económica, su programa deberá preguntar a la persona si acepta ser colocada en la sección
de primera clase (y viceversa). Si la persona acepta, haga la asignación de asiento apropiada. Si no
acepta, imprima el mensaje "El próximo vuelo sale en 3 horas".*/
import java.util.*;
public class Ejercicio_15 {
    static Scanner teclado=new Scanner(System.in);
    private static final int CAPACIDAD = 10;
    private static final int PRIMERA_CLASE = 1;
    private static final int ECONOMICA = 2;
    public static void main(String[]args){
        boolean[] asientos = new boolean[CAPACIDAD];
        while (true) {
            System.out.println("Por favor escriba 1 para Primera Clase o 2 para Económico:");
            int eleccion = teclado.nextInt();

            if (eleccion == PRIMERA_CLASE) {
                if (!asignarAsiento(asientos, 0, 4, "Primera Clase")) {
                    System.out.println("La Primera Clase está llena. ¿Acepta ser colocado en Económico? (s/n)");
                    if (teclado.next().equalsIgnoreCase("s")) {
                        if (!asignarAsiento(asientos, 5, 9, "Económico")) {
                            System.out.println("El próximo vuelo sale en 3 horas.");
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                    }
                }
            } else if (eleccion == ECONOMICA) {
                if (!asignarAsiento(asientos, 5, 9, "Económico")) {
   
                    System.out.println("La clase Económica está llena. ¿Acepta ser colocado en Primera Clase? (s/n)");
                    if (teclado.next().equalsIgnoreCase("s")) {
                        if (!asignarAsiento(asientos, 0, 4, "Primera Clase")) {
                            System.out.println("El próximo vuelo sale en 3 horas.");
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                    }
                }
            } else {
                System.out.println("Selección inválida. Intente nuevamente.");
            }
        }
    }
     public static boolean asignarAsiento(boolean[] asientos, int inicio, int fin, String clase) {
        for (int i = inicio; i <= fin; i++) {
            if (!asientos[i]) { 
                asientos[i] = true;
                System.out.println("Asiento asignado en " + clase + ". Número de asiento: " + (i + 1));
                return true;
            }
        }
        return false;
    }
}
