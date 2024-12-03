/*25.Los sistemas de instrucción asistida por computadora mas sofisticados supervisan el
rendimiento del estudiante durante cierto tiempo. La decisión de empezar un nuevo tema se basa a
menudo en el éxito del estudiante con los temas anteriores. Modifique el programa del ejercicio
anterior para contar el numero de respuestas correctas e incorrectas por parte del estudiante. Una
vez que el estudiante escriba 10 respuestas, su programa debe calcular el porcentaje de respuestas
correctas. Si este es menor del 75%, imprima Por favor pida ayuda adicional a su instructor y
reinicie el programa, para que otro estudiante pueda probarlo */
import java.util.*;
public class metodos_ejer25_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();

        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("Bienvenido al programa de multiplicación!");

        while (true) {
            generarPregunta(random, teclado, respuestasCorrectas, respuestasIncorrectas);
        }
    }
    public static void generarPregunta(Random random, Scanner scanner, int respuestasCorrectas, int respuestasIncorrectas) {
        int numero1 = random.nextInt(9) + 1;  
        int numero2 = random.nextInt(9) + 1;  

        int respuestaUsuario;
        System.out.println("¿Cuánto es " + numero1 + " por " + numero2 + "?");
        respuestaUsuario = scanner.nextInt();  

        if (respuestaUsuario == numero1 * numero2) {
            respuestasCorrectas++;
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
        } else {
            respuestasIncorrectas++;
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
        if (respuestasCorrectas + respuestasIncorrectas == 10) {
            double porcentajeCorrectas = (respuestasCorrectas / 10.0) * 100;
            System.out.println("\nHas respondido " + respuestasCorrectas + " de 10 preguntas correctamente.");
            System.out.println("Porcentaje de respuestas correctas: " + porcentajeCorrectas + "%");

            if (porcentajeCorrectas < 75) {
                System.out.println("\nPor favor pida ayuda adicional a su instructor.");
            }
            System.out.println("\nReiniciando el programa para otro estudiante...");
            respuestasCorrectas = 0;
            respuestasIncorrectas = 0;
        }
    }
}
