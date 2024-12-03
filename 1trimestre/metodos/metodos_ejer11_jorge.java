/*11.Escriba un método llamado múltiplo que determine, para un par de enteros, si el segundo entero
es múltiplo del primero. El método debe tomar dos argumentos enteros y devolver true si el
segundo es múltiplo del primero, y false en caso contrario. [Sugerencia: utilice el operador residuo].
Incorpore este método en una aplicación que reciba como entrada una serie de pares de enteros y
determine si el segundo valor en cada par es un múltiplo del primero. */
import java.util.*;
public class metodos_ejer11_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        char continuar;

        System.out.println("Comprobador de múltiplos");

        do {
            // Solicitar el primer número
            System.out.print("Ingrese el primer número: ");
            int numero1 = teclado.nextInt();

            // Solicitar el segundo número
            System.out.print("Ingrese el segundo número: ");
            int numero2 = teclado.nextInt();

            // Verificar si el segundo número es múltiplo del primero
            if (esMultiplo(numero1, numero2)) {
                System.out.println(numero2 + " es múltiplo de " + numero1);
            } else {
                System.out.println(numero2 + " no es múltiplo de " + numero1);
            }

            // Preguntar si se desea continuar
            System.out.print("¿Desea verificar otro par de números? (s/n): ");
            continuar = teclado.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Fin del progama.");
    }
    public static boolean esMultiplo(int a, int b) {
        return b % a == 0;
    }
}
