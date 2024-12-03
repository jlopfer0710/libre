/*21.Escriba un método que tome un valor entero y devuelva el numero con sus dígitos invertidos.
Por ejemplo, para el numero 7631, el método debe regresar 1367. Incorpore el método en una
aplicación que reciba como entrada un valor del usuario y muestre el resultado. Escribe de nuevo el
método de forma recursiva.
 */
import java.util.*;
public class metodos_ejer21_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();
        int resultado = invertirNumero(numero);
        System.out.println("El número invertido es: " + resultado);
    }
    public static int invertirNumero(int numero) {
        return invertirNumeroAux(numero, 0);
    }
    private static int invertirNumeroAux(int numero, int invertido) {
        if (numero == 0) {
            return invertido;
        } else {
            int digito = numero % 10; 
            invertido = invertido * 10 + digito;
            return invertirNumeroAux(numero / 10, invertido);
        }
    }
}
