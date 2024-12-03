/*24.- El uso de las computadoras en la educación. se conoce como instrucción asistida por
computadora (CAI, por sus siglas en ingles). Un problema que se desarrolla en los entornos CAI es
la fatiga de los estudiantes. Este problema puede eliminarse si se varia el dialogo de la computadora
para mantener la atención del estudiante. Modifique el programa del ejercicio anterior de manera
que los diversos comentarios se impriman para cada respuesta correcta e incorrecta, de la siguiente
manera:
Contestaciones a una respuesta correcta:
Muy bien!
Excelente!
Buen trabajo!
Sigue así!
Contestaciones a una respuesta incorrecta:
No. Por favor intenta de nuevo.
Incorrecto. Intenta una vez mas.
No te rindas!
No. Sigue intentando.
Use la generación de números aleatorios para elegir un numero entre 1 y 4 que se utilice para
seleccionar una contestación apropiada a cada respuesta. Use una instrucción switch para emitir las
contestaciones.
 */
import java.util.*;
public class metodos_ejer24_jorge {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de multiplicación!");
        while (true) {
            generarPregunta();
        }
    }
    public static void generarPregunta() {
        Random random = new Random();
        int numero1 = random.nextInt(9) + 1;
        int numero2 = random.nextInt(9) + 1; 
        int respuestaUsuario;
        System.out.println("¿Cuánto es " + numero1 + " por " + numero2 + "?");
        while (true) {
            respuestaUsuario = teclado.nextInt(); 
            if (respuestaUsuario == numero1 * numero2) {
                int respuestaCorrecta = random.nextInt(4) + 1;
                switch (respuestaCorrecta) {
                    case 1:
                        System.out.println("¡Muy bien!");
                        break;
                    case 2:
                        System.out.println("¡Excelente!");
                        break;
                    case 3:
                        System.out.println("¡Buen trabajo!");
                        break;
                    case 4:
                        System.out.println("¡Sigue así!");
                        break;
                }
                break; 
            } else {
                int respuestaIncorrecta = random.nextInt(4) + 1; 
                switch (respuestaIncorrecta) {
                    case 1:
                        System.out.println("No. Por favor, intenta de nuevo.");
                        break;
                    case 2:
                        System.out.println("Incorrecto. Intenta una vez más.");
                        break;
                    case 3:
                        System.out.println("No te rindas!");
                        break;
                    case 4:
                        System.out.println("No. Sigue intentando.");
                        break;
                }
            }
        }
    }
}
