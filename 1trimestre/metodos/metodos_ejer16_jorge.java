/*16. Escriba segmentos de programas que realicen cada una de las siguientes tareas:
a) Calcular la parte entera del cociente, cuando el entero a se divide entre el entero b.
b) Calcular el residuo entero cuando el entero a se divide entre el entero b.
c) Utilizar las piezas de los programas desarrollados en las partes (a) y (b) para escribir un
método llamado mostrarDigitos, que reciba un entero entre 1 y 99999, y que lo muestre
como una secuencia de dígitos, separando cada par de dígitos por dos espacios. Por ejemplo,
el entero 4562 debe aparecer como
4 5 6 2
d) Incorpore el método desarrollado en la parte (c) en una aplicación que reciba como entrada
un entero y que llame al método mostrarDigitos, pasandole a este método el entero
introducido. Muestre los resultados. */
import java.util.*;
public class metodos_ejer16_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Ingrese un número entre 1 y 99999: ");
        int numero = teclado.nextInt();
        mostrarDigitos(numero);
        System.out.print("Ingrese dos números para calcular el cociente y el residuo.\nNúmero 1: ");
        int a = teclado.nextInt();
        System.out.print("Número 2: ");
        int b = teclado.nextInt();

        if (b != 0) {
            System.out.println("Cociente: " + calcularCociente(a, b));
            System.out.println("Residuo: " + calcularResiduo(a, b));
        } else {
            System.out.println("El divisor no puede ser 0.");
        }
    }
    public static int calcularCociente(int a, int b) {
        return a / b;
    }
    public static int calcularResiduo(int a, int b) {
        return a % b;
    }
    public static void mostrarDigitos(int numero) {
        if (numero < 1 || numero > 99999) {
            System.out.println("El número debe estar entre 1 y 99999.");
            return;
        }
        String numeroStr = String.valueOf(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.print(numeroStr.charAt(i));
            if (i < numeroStr.length() - 1) { 
                System.out.print("  "); 
            }
        }
        System.out.println();
    }
    
    
}
