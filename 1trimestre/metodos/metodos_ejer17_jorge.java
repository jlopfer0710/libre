/*17.- Implemente los siguientes métodos enteros:
a) El método centígrados que devuelve la equivalencia en grados centígrados de una
temperatura en grados fahrenheit, utilizando el calculo
centígrados = 5.0 / 9.0 * ( fahrenheit – 32 );
b) El método fahrenheit que devuelve la equivalencia en grados fahrenheit de una temperatura
en grados centígrados, utilizando el calculo
fahrenheit = 9.0 / 5.0 * centígrados + 32;
c) Utilice los métodos de las partes (a) y (b) para escribir una aplicación que permita al
usuario, ya sea escribir una temperatura en grados fahrenheit y mostrar su equivalente en
grados centígrados, o escribir una temperatura en grados centígrados y mostrar su
equivalente en grados fahrenheit.
 */
import java.util.*;
public class metodos_ejer17_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        int opcion;

        System.out.println("Conversor de Temperaturas");
        System.out.println("1. Convertir Fahrenheit a Centígrados");
        System.out.println("2. Convertir Centígrados a Fahrenheit");
        System.out.print("Seleccione una opción (1 o 2): ");
        opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
            double fahrenheit = teclado.nextDouble();
            double centigrados = centigrados(fahrenheit);
            System.out.printf("La temperatura en grados Centígrados es: %.2f°C\n", centigrados);
        } else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en grados Centígrados: ");
            double centigrados = teclado.nextDouble();
            double fahrenheit = fahrenheit(centigrados);
            System.out.printf("La temperatura en grados Fahrenheit es: %.2f°F\n", fahrenheit);
        } else {
            System.out.println("Opción inválida. Por favor, seleccione 1 o 2.");
        }
    }
    public static double centigrados(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
    public static double fahrenheit(double centigrados) {
        return 9.0 / 5.0 * centigrados + 32;
    }
}
