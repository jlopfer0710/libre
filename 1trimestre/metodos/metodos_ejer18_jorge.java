/*18.Escriba un método llamado minimo3 que devuelva el menor de tres números de punto flotante.
Use el método Math.min para implementar minimo3. Incorpore el método en una aplicación que
reciba como entrada tres valores por parte del usuario, determine el valor menor y muestre el
resultado.
 */
import java.util.*;
public class metodos_ejer18_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Ingrese el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = teclado.nextDouble();

        double menor = minimo3(num1, num2, num3);
        System.out.printf("El menor de los tres números es: %.2f\n", menor);
    }
    public static double minimo3(double num1, double num2, double num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}
