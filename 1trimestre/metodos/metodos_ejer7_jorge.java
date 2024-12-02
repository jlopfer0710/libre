/*7.- Una aplicación del método Math.floor es redondear un valor al siguiente entero. La instrucción
y = Math.floor( x + 0.5 );
redondea el numero x al entero mas cercano y asigna el resultado a y. Escriba una aplicación que lea
valores double y que utilice la instrucción anterior para redondear cada uno de los números a su
entero mas cercano. Para cada numero procesado, muestre tanto el numero original como el
redondeado.
 */
import java.util.*;
public class metodos_ejer7_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("¿Cuántos números desea redondear?");
        int cantidad=teclado.nextInt();
        for(int i=1;i<=cantidad;i++){
            System.out.println("Introduce el "+i+" número (double)");
            double n=teclado.nextDouble();
            double n_redondeado=Math.floor(n+0.5);
            System.out.println("El número original es: "+n+" y el número redondeado es: "+n_redondeado);
        }
    }
}
