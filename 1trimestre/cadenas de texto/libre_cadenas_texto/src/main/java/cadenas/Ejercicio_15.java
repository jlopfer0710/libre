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
/*- (Protección de cheques) Para evitar la alteración de una cantidad en un cheque, la mayoría de
los sistemas computarizados que emiten cheques emplean una técnica llamada protección de
cheques. Los cheques diseñados para impresión por computadora contienen un número fijo de
espacios en los cuales la computadora puede imprimir una cantidad. Suponga que un cheque
contiene ocho espacios en blanco en los cuales la computadora puede imprimir la cantidad de un
cheque de nómina. Si la cantidad es grande, entonces se llenarán los ocho espacios. Por ejemplo:
1,230.60 (cantidad del cheque)
--------
12345678 (números de posición)
Por otra parte, si la cantidad es menor de $1,000, entonces varios espacios quedarían vacíos. Por
ejemplo:
99.87
--------
12345678
contiene tres espacios en blanco. Si se imprime un cheque con espacios en blanco, es más fácil para
alguien alterar la cantidad del cheque. Para evitar que se altere el cheque, muchos sistemas de
escritura de cheques insertan asteriscos al principio para proteger la cantidad, como se muestra a
continuación:
***99.87
--------
12345678
Escriba una aplicación que reciba como entrada una cantidad a imprimir sobre un cheque y que lo
escriba mediante el formato de protección de cheques, con asteriscos al principio si es necesario.
Suponga que existen nueve espacios disponibles para imprimir la cantidad.
*/
public class Ejercicio_15 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Introduce la cantidad a imprimir en el cheque: ");
        String cantidad=teclado.nextLine();
        String cantidadFormateada=cantidad.replace("$", "").trim();
        int longitudCantidad=cantidadFormateada.length();
        int espaciosDisponibles=9;
        int asteriscosNecesarios=espaciosDisponibles-longitudCantidad;
        StringBuilder resultado=new StringBuilder();
        for(int i=0;i<asteriscosNecesarios;i++){
            resultado.append('*');
        }
        resultado.append(cantidadFormateada);
        System.out.printf("Cantidad en formato protegido: %s%n",resultado.toString());
    }
}
