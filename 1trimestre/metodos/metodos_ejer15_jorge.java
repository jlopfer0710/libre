/*15.Escriba una aplicación que pida al usuario el radio de un circulo y que utilice un método
llamado circuloArea para calcular e imprimir el área de ese circulo. */
import java.util.*;
public class metodos_ejer15_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Ingrese el radio del círculo: ");
        double radio = teclado.nextDouble();
        if (radio > 0) {
            double area = circuloArea(radio);
            System.out.printf("El área del círculo con radio %.2f es: %.2f\n", radio, area);
        } else {
            System.out.println("El radio debe ser un número positivo.");
        }
    }
    public static double circuloArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
