/*12.Escriba un método llamado esPar que utilice el operador residuo (%) para determinar si un
entero dado es par. El método debe tomar un argumento entero y devolver true si el entero es par, y
false en caso contrario. Incorpore este método en una aplicación que reciba como entrada una
secuencia de enteros (uno a la vez), y que determine si cada uno es par o impar.
 */
import java.util.*;
public class metodos_ejer12_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        char continuar;

        System.out.println("Verificador de números pares e impares");

        do {
            // Solicitar un número al usuario
            System.out.print("Ingrese un número entero: ");
            int numero = teclado.nextInt();

            // Verificar si el número es par o impar
            if (esPar(numero)) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }

            // Preguntar si se desea ingresar otro número
            System.out.print("¿Desea verificar otro número? (s/n): ");
            continuar = teclado.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Fin del programa.");
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
