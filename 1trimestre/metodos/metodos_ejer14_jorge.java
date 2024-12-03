/*14.Modifique el método creado en el ejercicio anterior para formar el cuadrado de cualquier
carácter que este contenido en el parámetro tipo carácter caracterRelleno. Por ejemplo, si lado es 5 y
caracterRelleno es “#”, el método debe imprimir
#####
#####
#####
#####
#####
 */
import java.util.*;
public class metodos_ejer14_jorge {
    public static Scanner teclado=new Scanner(System.in);    
    public static void main(String[]args){
        System.out.print("Ingrese el tamaño del lado del cuadrado (entero positivo): ");
        int lado = teclado.nextInt();
        System.out.print("Ingrese el carácter para rellenar el cuadrado: ");
        char caracterRelleno = teclado.next().charAt(0);
        if (lado > 0) {
            System.out.println("\nCuadrado generado:");
            cuadradoDeCaracteres(lado, caracterRelleno);
        } else {
            System.out.println("El tamaño del lado debe ser un entero positivo.");
        }
    }
    public static void cuadradoDeCaracteres(int lado, char caracterRelleno) {
        for (int i = 0; i < lado; i++) { 
            for (int j = 0; j < lado; j++) { 
                System.out.print(caracterRelleno);
            }
            System.out.println();   
        }
    }
}
