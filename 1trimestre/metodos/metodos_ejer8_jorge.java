/*8.- Math.floor puede utilizarse para redondear un numero hasta un lugar decimal especifico. La
instrucción
y = Math.floor( x * 10 + 0.5 ) / 10;
redondea x en la posición de las décimas (es decir, la primera posición a la derecha del punto
decimal). La instrucción
y = Math.floor( x * 100 + 0.5 ) / 100;
redondea x en la posición de las centésimas (es decir, la segunda posición a la derecha del punto
decimal). Escriba una aplicación que defina cuatro métodos para redondear un numero x en varias
formas:
a) redondearAInteger( numero )
b) redondearADecimas( numero )
c) redondearACentesimas( numero )
d) redondearAMilesimas( numero )
Para cada valor leído, su programa debe mostrar el valor original, el numero redondeado al entero
mas cercano, el numero redondeado a la décima mas cercana, el numero redondeado a la centésima
mas cercana y el numero redondeado a la milésima mas cercana. */
import java.util.*;
public class metodos_ejer8_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("¿Cuántos números deseas redondear?");
        int cant=teclado.nextInt();
        for (int i = 1; i <= cant; i++) {
            System.out.print("Introduce el número " + i + " (valor tipo double): ");
            double numero = teclado.nextDouble();

            System.out.printf("Número original: %.4f\n", numero);
            System.out.printf("Número redondeado al entero más cercano: %.0f\n", redondearAInteger(numero));
            System.out.printf("Número redondeado a la décima más cercana: %.1f\n", redondearADecimas(numero));
            System.out.printf("Número redondeado a la centésima más cercana: %.2f\n", redondearACentesimas(numero));
            System.out.printf("Número redondeado a la milésima más cercana: %.3f\n", redondearAMilesimas(numero));
            System.out.println(); 
        }
    }
    public static double redondearAInteger(double numero){
        return Math.floor(numero+0.5);
    }
    public static double redondearADecimas(double numero){
        return Math.floor(numero*10+0.5)/10;
    }
    public static double redondearACentesimas(double numero) {
        return Math.floor(numero * 100 + 0.5) / 100;
    }
    public static double redondearAMilesimas(double numero) {
        return Math.floor(numero * 1000 + 0.5) / 1000;
    }
}
