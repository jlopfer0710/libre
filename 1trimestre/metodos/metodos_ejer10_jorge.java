/*10.- Defina un método llamado hipotenusa que calcule la longitud de la hipotenusa de un triangulo
rectángulo, cuando se proporcionen las longitudes de los otros dos lados. El método debe tomar dos
argumentos de tipo double y devolver la hipotenusa como un valor double. Incorpore este método
en una aplicación que lea los valores para lado1 y lado2, y que realice el calculo con el método
hipotenusa. Determine la longitud de la hipotenusa para cada uno de los triángulos siguientes: */
import java.util.*;
public class metodos_ejer10_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce el valor del lado 1: ");
        double lado1 = teclado.nextDouble();
        System.out.print("Introduce el valor del lado 2: ");
        double lado2 = teclado.nextDouble();

        double resultadoHipotenusa = hipotenusa(lado1, lado2);

        System.out.printf("La hipotenusa del triángulo con lados %.2f y %.2f es: %.2f\n", lado1, lado2, resultadoHipotenusa);
    }
    public static double hipotenusa(double lado1, double lado2) {
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    }
}
