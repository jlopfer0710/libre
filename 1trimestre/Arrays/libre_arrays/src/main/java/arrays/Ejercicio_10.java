/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arrays;

/**
 *
 * @author Jorge López Fernández
 */
/* Utilice un array unidimensional para resolver el siguiente problema: una
compañía paga a sus vendedores por comisión. Los vendedores reciben 200€ por semana mas el 9%
de sus ventas totales de esa semana. Por ejemplo, un vendedor que acumule 5000€ en ventas en una
semana, recibirá 200€ mas el 9% de 5000€, un total de 650€. Escriba una aplicación (utilizando un
array de contadores) que, introduciéndole las ventas semanales de cada vendedor, determine
cuantos vendedores recibieron salarios en cada uno de los siguientes rangos (suponga que el salario
de cada vendedor se trunca a una cantidad entera):
a) 200-299 €
b) 300-399 €
c) 400-499 €
d) 500-599 €
e) 600-699 €
f) 700-799 €
g) 800-899 €
h) 900-999 €
i) 1000 € en adelante
Sintetice los resultados en formato tabular.
*/
import java.util.*;
public class Ejercicio_10 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        int[] rangosSalarios = new int[9]; // Array para contar los rangos de salarios

        while (true) {
            System.out.print("Ingrese las ventas semanales del vendedor (o -1 para finalizar): ");
            double ventas = teclado.nextDouble();

            if (ventas == -1) {
                break;
            }

            int salario = (int) (200 + 0.09 * ventas); 

         
            if (salario >= 1000) {
                rangosSalarios[8]++; 
            } else if (salario >= 900) {
                rangosSalarios[7]++;
            } else if (salario >= 800) {
                rangosSalarios[6]++;
            } else if (salario >= 700) {
                rangosSalarios[5]++;
            } else if (salario >= 600) {
                rangosSalarios[4]++;
            } else if (salario >= 500) {
                rangosSalarios[3]++;
            } else if (salario >= 400) {
                rangosSalarios[2]++;
            } else if (salario >= 300) {
                rangosSalarios[1]++;
            } else {
                rangosSalarios[0]++; 
            }
        }

        System.out.println("\nDistribución de salarios:");
        System.out.println("Rango de salario\tCantidad de vendedores");
        System.out.println("200-299 €\t\t" + rangosSalarios[0]);
        System.out.println("300-399 €\t\t" + rangosSalarios[1]);
        System.out.println("400-499 €\t\t" + rangosSalarios[2]);
        System.out.println("500-599 €\t\t" + rangosSalarios[3]);
        System.out.println("600-699 €\t\t" + rangosSalarios[4]);
        System.out.println("700-799 €\t\t" + rangosSalarios[5]);
        System.out.println("800-899 €\t\t" + rangosSalarios[6]);
        System.out.println("900-999 €\t\t" + rangosSalarios[7]);
        System.out.println("1000 € o más\t\t" + rangosSalarios[8]);
    }
}
