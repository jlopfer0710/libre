/*27.- Modifique el programa del ejercicio anterior para contar el numero de intentos que haga el
jugador. Si el numero es 10 o menos, imprima el mensaje O ya sabia usted el secreto, o tuvo suerte!
Si el jugador adivina el numero en 10 intentos, imprima el mensaje Aja! Sabía usted el secreto! Si el
jugador hace mas de 10 intentos, imprima el mensaje Debería haberlo hecho mejor! .Por que no se
deben requerir mas de 10 intentos? Bueno, en cada “buen intento”, el jugador debe poder eliminar
la mitad de los números, después la mitad de los números restantes, y así en lo sucesivo.
 */
import java.util.*;
public class metodos_ejer27_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        String jugarOtraVez;

        do {
            jugar();
            System.out.print("¿Quieres jugar otra vez? (s/n): ");
            jugarOtraVez = teclado.next();

        } while (jugarOtraVez.equalsIgnoreCase("s"));

        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
    }
    public static void jugar() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = random.nextInt(1000) + 1;

        int intento;
        int intentos = 0;
        int limiteInferior = 1;
        int limiteSuperior = 1000;

        System.out.println("¡Adivina el número! Es un número entre 1 y 1000.");
        while (true) {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroAdivinar) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
                limiteInferior = intento + 1;
            } else if (intento > numeroAdivinar) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
                limiteSuperior = intento - 1;
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            }
            if (intentos > 10) {
                System.out.println("¡Debería haberlo hecho mejor! No se deben requerir más de 10 intentos.");
                break;
            }
        }
        if (intentos <= 10 && intentos > 0) {
            if (intentos <= 5) {
                System.out.println("¡O ya sabía usted el secreto, o tuvo suerte!");
            } else if (intentos == 10) {
                System.out.println("¡Aja! Sabía usted el secreto!");
            }
        }
    }
}
