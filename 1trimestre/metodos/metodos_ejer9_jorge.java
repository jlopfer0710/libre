/*9.- Escriba un método llamado enteroPotencia( base, exponente ) que devuelva el valor de
base exponente
Por ejemplo, enteroPotencia( 3, 4 ) calcula 34
 (o 3 * 3 * 3 * 3 ). Suponga que exponente es un entero
positivo distinto de cero y que base es un entero. El método enteroPotencia debe utilizar un ciclo for
o while para controlar el calculo. No utilice ningún método de la biblioteca de matemáticas.
Incorpore este método en una aplicación que lea valores enteros para base y exponente, y que
realice el calculo con el método enteroPotencia. Realice ahora el método enteroPotenciaRecursivo
que realizará el mismo cálculo pero de forma recursiva.
 */
import java.util.*;
public class metodos_ejer9_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();

        // Realizar los cálculos usando los dos métodos
        int resultadoIterativo = enteroPotencia(base, exponente);
        int resultadoRecursivo = enteroPotenciaRecursivo(base, exponente);

        // Mostrar los resultados
        System.out.println("Resultado con ciclo for (iterativo): " + resultadoIterativo);
        System.out.println("Resultado con recursión: " + resultadoRecursivo);
    }
    public static int enteroPotencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    public static int enteroPotenciaRecursivo(int base, int exponente) {
        if (exponente == 1) {
            return base;
        } else {
            return base * enteroPotenciaRecursivo(base, exponente - 1);
        }
    }
}
