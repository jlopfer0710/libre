/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Expresiones_regulares;

/**
 *
 * @author Jorge López Fernández
 */
/*Suponga que está desarrollando un programa en el que existe una variable de tipo
String llamada cadena. Realice las operaciones necesarias utilizando expresiones regulares para
realizar las comprobaciones que se describen a continuación:
1. Comprobar si el String cadena contiene exactamente el patrón (matches) “abc”
2. Comprobar si el String cadena contiene “abc”
3. Comprobar si el String cadena empieza por “abc”
4. Comprobar si el String cadena empieza por “abc” ó “Abc”
5. Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o
minúsculas y un máximo de 10.
6. Comprobar si el String cadena no empieza por un dígito
7. Comprobar si el String cadena no acaba con un dígito
8. Comprobar si el String cadena solo contienen los caracteres a ó b
9. Comprobar si el String cadena contiene un 1 y ese 1 no está seguido por un 2*/
public class Ejercicio_1 {

    public static void main(String[] args) {
       String cadena="Hola estoy aquí con un abceso";
       //1.Comprobar si el String cadena contiene exactamente el patrón(matches)"abc"
        System.out.println("1.Contiene exactamente 'abc': "+cadena.matches("abc"));
        //2.Comprobar si el String cadena contiene "abc"
        System.out.println("2.Contiene 'abc': "+cadena.matches(".*abc.*"));
        //Comprobar si el String cadena empieza por “abc”
        System.out.println("3.Empieza por 'abc': "+cadena.matches("^abc.*"));
        //Comprobar si el String cadena empieza por “abc” ó “Abc”
        System.out.println("4.Empieza por 'abc' o 'Abc': "+cadena.matches("^[aA]bc.*"));
        //Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
        System.out.println("5.Formado por 5 a 10 letras: "+cadena.matches("[a-zA-Z]{5,10}"));
        //Comprobar si el String cadena no empieza por un dígito
        System.out.println("6.No empieza por un dígito: "+!cadena.matches("^[0-9].*"));
        //Comprobar si el String cadena no acaba con un dígito
        System.out.println("7.No acaba con un dígito: "+!cadena.matches(".*[0-9]$"));
        //Comprobar si el String cadena solo contienen los caracteres a ó b
        System.out.println("Solo contiene 'a' ó 'b':"+cadena.matches("[ab].*"));
        //Comprobar si el String cadena contiene un 1 y ese 1 no está seguido por un 2
        System.out.println("Contiene un '1' que no está seguido por un '2': "+cadena.matches(".*1(?!2).*"));
    }
}
