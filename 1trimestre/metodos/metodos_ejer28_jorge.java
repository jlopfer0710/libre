/*28.Escriba un método llamado distancia, para calcular la distancia entre dos puntos (x1, y1) y (x2,
y2). Todos los números y valores de retorno deben ser de tipo double. Incorpore este método en una
aplicación que permita al usuario introducir las coordenadas de los puntos. */
import java.util.*;
public class metodos_ejer28_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce las coordenadas del primer punto (x1, y1): ");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();

        System.out.print("Introduce las coordenadas del segundo punto (x2, y2): ");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        // Llamar al método distancia y mostrar el resultado
        double resultado = distancia(x1, y1, x2, y2);
        System.out.printf("La distancia entre los puntos es: %.2f%n", resultado);
    }
    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
