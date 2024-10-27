/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadenas.Ejercicio_16;

/**
 *
 * @author Jorge López Fernández
 */
/*(Clave Morse) Quizá el más famoso de todos los esquemas de codificación es el código Morse,
desarrollado por Samuel Morse en 1832 para usarlo con el sistema telegráfico. El código Morse
asigna una serie de puntos y guiones a cada letra del alfabeto, cada dígito y algunos caracteres
especiales (tales como el punto, la coma, los dos puntos y el punto y coma). En los sistemas
orientados a sonidos, el punto representa un sonido corto y el guión representa un sonido largo.
Otras representaciones de puntos y guiones se utilizan en los sistemas orientados a luces y sistemas
de señalización con banderas. La separación entre palabras se indica mediante un espacio o,
simplemente, con la ausencia de un punto o un guión. En un sistema orientado a sonidos, un espacio
se indica por un tiempo breve durante el cual no se transmite sonido alguno.
Escriba una aplicación que lea una frase en español y que codifique la frase en clave Morse.
Además, escriba una aplicación que lea una frase en código Morse y que la convierta en su
equivalente en español. Use un espacio en blanco entre cada letra en clave Morse, y tres espacios en
blanco entre cada palabra en clave Morse.*/
import java.util.*;
public class Ejercicio_16_traducir_a_español {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        final char[] letras = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
        'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', 
        '4', '5', '6', '7', '8', '9', '.', ',', ':', ';', ' '
    };
         final String[] morse = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", 
        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", 
        "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", 
        "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-.-.-", 
        "--..--", "---...", "-.-.-.", " "
    };
          System.out.print("Introduce una frase en código Morse: ");
        String input = teclado.nextLine();

        StringBuilder decodedMessage = new StringBuilder();
        String[] morseWords = input.split(" {3}"); // Separar palabras por tres espacios en blanco

        for (String morseWord : morseWords) {
            String[] morseLetters = morseWord.split(" "); // Separar letras por un espacio en blanco
            for (String morseLetter : morseLetters) {
                for (int i = 0; i < morse.length; i++) {
                    if (morseLetter.equals(morse[i])) {
                        decodedMessage.append(letras[i]); // Agregar la letra decodificada
                        break;
                    }
                }
            }
            decodedMessage.append(" "); // Agregar espacio entre palabras
        }

        System.out.println("Frase decodificada: " + decodedMessage.toString().trim());
    }
}
