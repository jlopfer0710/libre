/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Jorge López Fernández
 */
/* (Ventas totales) Use un array bidimensional para resolver el siguiente problema: una compañía
tiene cuatro vendedores (1 a 4) que venden cinco productos distintos (1 a 5). Una vez al día, cada
vendedor pasa una nota por cada tipo de producto vendido. Cada nota contiene lo siguiente:
a) El numero del vendedor.
b) El numero del producto.
c) El valor total en euros de ese producto vendido en ese día.
Así, cada vendedor pasa entre 0 y 5 notas de venta por día. Suponga que esta disponible la
información sobre todas las notas del mes pasado. Escriba una aplicación que lea toda esta
información para las ventas del ultimo mes y que resuma las ventas totales por vendedor, por
producto. Todos los totales deben guardarse en el array bidimensional ventas.
Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular,
en donde cada columna represente a un vendedor especifico y cada fila represente a un producto.
Saque el total de cada fila para obtener las ventas totales de cada producto durante el ultimo mes.
Saque el total de cada columna para obtener las ventas totales de cada vendedor durante el ultimo
mes. Su impresión tabular debe incluir estos totales cruzados a la derecha de las filas totalizadas, y
en la parte inferior de las columnas totalizadas.
17.- (Gráficos de tortuga) El lenguaje Logo hizo famoso el concepto de los gráficos de tortuga.
Imagine a una tortuga mecánica que camina por todo el cuarto, bajo el control de una aplicación en
Java. La tortuga sostiene una pluma en una de dos posiciones, arriba o abajo. Mientras la pluma esta
abajo, la tortuga va trazando figuras */
import java.util.*;
public class Ejercicio_16 {
   static Scanner teclado=new Scanner(System.in);
   private static final int VENDEDOR_COUNT = 4;
   private static final int PRODUCTO_COUNT = 5;
   public static void main(String[]args){
        double[][] ventas = new double[PRODUCTO_COUNT][VENDEDOR_COUNT];
        for (int i = 0; i < VENDEDOR_COUNT; i++) {
            System.out.println("Vendedor " + (i + 1) + ":");
            for (int j = 0; j < PRODUCTO_COUNT; j++) {
                System.out.print("Ingrese el total vendido del producto " + (j + 1) + ": ");
                double total = teclado.nextDouble();
                ventas[j][i] += total;
            }
        }

        System.out.println("\nVentas Totales por Producto y Vendedor:");
        System.out.printf("%-12s", "Producto"); 
        for (int i = 0; i < VENDEDOR_COUNT; i++) {
            System.out.printf("Vendedor %d   ", (i + 1)); 
        }
        System.out.printf("%-12s\n", "Total");


        for (int j = 0; j < PRODUCTO_COUNT; j++) {
            System.out.printf("Producto %d   ", (j + 1));
            double totalPorProducto = 0; 
            for (int i = 0; i < VENDEDOR_COUNT; i++) {
                System.out.printf("%-12.2f", ventas[j][i]);
                totalPorProducto += ventas[j][i]; 
            }
            System.out.printf("%-12.2f\n", totalPorProducto);
        }


        System.out.printf("%-12s", "Total");
        for (int i = 0; i < VENDEDOR_COUNT; i++) {
            double totalPorVendedor = 0; 
            for (int j = 0; j < PRODUCTO_COUNT; j++) {
                totalPorVendedor += ventas[j][i]; 
            }
            System.out.printf("%-12.2f", totalPorVendedor);
        }
   }
}
