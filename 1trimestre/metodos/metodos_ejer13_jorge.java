/*13.Escriba un método llamado cuadradoDeAsteriscos que muestre un cuadrado relleno (el mismo
numero de filas y columnas) de asteriscos cuyo lado se especifique en el parámetro entero lado. Por
ejemplo, si lado es 4, el método debe mostrar:
****
****
****
****
Incorpore este método a una aplicación que lea un valor entero para el parámetro lado que teclea el
usuario, y despliegue los asteriscos con el método cuadradoDeAsteriscos.
 */
import java.util.*;
public class metodos_ejer13_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Ingrese el tamaño del lado del cuadrado (entero positivo): ");
        int lado = teclado.nextInt();
        if (lado > 0) {
            System.out.println("\nCuadrado generado:");
            cuadradoDeAsteriscos(lado);
        } else {
            System.out.println("El tamaño del lado debe ser un entero positivo.");
        }
    }
    public static void cuadradoDeAsteriscos(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
