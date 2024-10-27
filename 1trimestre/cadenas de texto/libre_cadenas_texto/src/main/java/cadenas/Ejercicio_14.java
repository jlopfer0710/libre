/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadenas;

/**
 *
 * @author Jorge López Fernández
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*(Impresión de fechas en varios formatos) Las fechas se imprimen en varios formatos comunes.
Dos de los formatos más utilizados son:
25/05/2020 y 25 de abril de 2020
Escriba una aplicación que lea una fecha en el primer formato e imprima dicha fecha en el segundo
formato*/
public class Ejercicio_14 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]ags){
        System.out.print("Introduce una fecha en formato dd/MM/yyyy: ");
        String fechaEntrada = teclado.nextLine();

        try {
            // Definir el formato de entrada
            SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
            // Parsear la fecha ingresada
            Date fecha = formatoEntrada.parse(fechaEntrada);

            // Definir el formato de salida
            SimpleDateFormat formatoSalida = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
            // Formatear la fecha para la salida
            String fechaSalida = formatoSalida.format(fecha);

            // Imprimir la fecha en el nuevo formato
            System.out.println("Fecha en formato 'dd de mes de yyyy': " + fechaSalida);
        } catch (ParseException e) {
            // Manejar el caso de una fecha ingresada incorrectamente
            System.out.println("Formato de fecha inválido. Por favor, use el formato dd/MM/yyyy.");
        }
    }
}
