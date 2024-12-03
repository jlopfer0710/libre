/*26.Escriba una aplicación que juegue a “adivina el numero” de la siguiente manera: su programa
elige el numero a adivinar, seleccionando un entero aleatorio en el rango de 1 a 1000. La aplicación
muestra el indicador Adivine un número entre 1 y 1000. El jugador escribe su primer intento. Si la
respuesta del jugador es incorrecta, su programa debe mostrar el mensaje Demasiado alto. Intente
de nuevo. o Demasiado bajo. Intente de nuevo., para ayudar a que el jugador “se acerque” a la
respuesta correcta. El programa debe pedir al usuario que escriba su siguiente intento. Cuando el
usuario escriba la respuesta correcta, muestre el mensaje Felicidades. Adivino el numero! Y permita
que el usuario elija si desea jugar otra vez.  */
import java.util.*;
public class metodos_ejer26_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        String jugarOtraVez;

        do {
            jugar();
            System.out.print("¿Quieres jugar otra vez? (s/n): ");
            jugarOtraVez = teclado.next(); 
        } while (jugarOtraVez.equalsIgnoreCase("s"));  // Si el usuario quiere jugar nuevamente, repite

        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
    }
    public static void jugar() {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(1000) + 1;

        int intento;
        int intentos = 0;

        System.out.println("¡Adivina el número! Es un número entre 1 y 1000.");
        while (true) {
            System.out.print("Introduce tu intento: ");
            intento = teclado.nextInt();
            intentos++;

            if (intento < numeroAdivinar) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroAdivinar) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            }
        }
    }
}
