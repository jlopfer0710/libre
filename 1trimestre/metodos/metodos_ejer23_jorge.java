/*23.Las computadoras están tomando un papel cada vez mas importante en la educación. Escriba
un programa que ayude a un estudiante de escuela primaria, para que aprenda a multiplicar. Use un
objeto Random para producir dos enteros positivos de un digito. El programa debe entonces mostrar
una pregunta al usuario, como:
¿Cuánto es 6 por 7?
El estudiante entonces debe escribir la respuesta. Luego, el programa debe verificar la respuesta del
estudiante. Si es correcta, dibuje la cadena "Muy bien!" y haga otra pregunta de multiplicación. Si
la respuesta es incorrecta, dibuje la cadena "No. Por favor intenta de nuevo." y deje que el
estudiante intente la misma pregunta varias veces, hasta que este correcta. Debe utilizarse un
método separado para generar cada pregunta nueva. Este método debe llamarse una vez cuando la
aplicación empiece a ejecutarse, y cada vez que el usuario responda correctamente a la pregunta. */
import java.util.*;
public class metodos_ejer23_jorge {
    public static Scanner teclado=new Scanner(System.in);
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
                System.out.println("¡Muy bien!");
                break;
            } else {
                System.out.println("No. Por favor, intenta de nuevo.");
            }
        }
    }
}
