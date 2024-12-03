/*20.Se dice que un entero es primo si puede dividirse solamente por 1 y por si mismo. Por ejemplo,
2, 3, 5 y 7 son primos, pero 4, 6, 8 y 9 no.
a) Escriba un método que determine si un numero es primo.
b) Use este método en una aplicación que determine e imprima todos los números primos
menores que 10,000. .Cuantos números hasta 10,000 tiene que probar para asegurarse de
encontrar todos los números primos? */
import java.util.*;
public class metodos_ejer20_jorge {
    public static Scanner teclado= new Scanner(System.in);
    public static void main(String[] args) {
        int cantidadPrimos = 0;
        for (int i = 2; i < 10000; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
                cantidadPrimos++;
            }
        }

        System.out.printf("\nTotal de números primos menores que 10,000: %d\n", cantidadPrimos);

        int cantidadPruebas = 0;
        for (int i = 2; i < 10000; i++) {
            cantidadPruebas++;
        }
        System.out.printf("Cantidad de números probados hasta 10,000: %d\n", cantidadPruebas);
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
