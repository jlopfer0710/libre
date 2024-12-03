/*19.Se dice que un numero entero es un número perfecto si sus factores, incluyendo 1 (pero no el
numero entero), al sumarse dan como resultado el numero entero. Por ejemplo, 6 es un numero
perfecto ya que 6 = 1 + 2 + 3. Escriba un método llamado perfecto que determine si el parámetro
numero es un numero perfecto. Use este método en una aplicación que determine y muestre todos
los números perfectos entre 1 y 1000. Imprima los factores de cada numero perfecto para confirmar
que el numero sea realmente perfecto. Ponga a prueba el poder de su computadora, evaluando
números mas grandes que 1000. Muestre los resultados.
 */
import java.util.*;
public class metodos_ejer19_jorge {
    public static Scanner teclado=new Scanner (System.in);
    public static void main(String[]args){
        for (int i = 1; i <= 1000; i++) {
            if (perfecto(i)) {
                System.out.printf("Número perfecto: %d\n\n", i);
            }
        }

        System.out.println("Poniendo a prueba números más grandes (hasta 10000):");

        // Buscar números perfectos entre 1001 y 10000
        for (int i = 1001; i <= 10000; i++) {
            if (perfecto(i)) {
                System.out.printf("Número perfecto: %d\n\n", i);
            }
        }
    }
    public static boolean perfecto(int numero) {
        int sumaFactores = 0;

        System.out.print("Factores de " + numero + ": ");
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                System.out.print(i + " "); 
                sumaFactores += i;
            }
        }

        System.out.println();
        return sumaFactores == numero;
    }
    
}
