/*6.- Un estacionamiento cobra una cuota mínima de 2.00€ por estacionarse hasta tres horas. El
estacionamiento cobra 0.50€ adicionales por cada hora o fracción que se pase de tres horas. El
cargo máximo para cualquier periodo dado de 24 horas es de 10.00€. Suponga que ningún
automóvil se estaciona durante mas de 24 horas a la vez. Escriba una aplicación que calcule y
muestre los pagos por estacionamiento para cada cliente que se haya estacionado ayer. Debe
introducir las horas de estacionamiento para cada cliente. El programa debe mostrar el pago para el
cliente actual y debe calcular y mostrar el total corriente de los recibos de ayer. El programa debe
utilizar el método calcularPagos para determinar el pago para cada cliente.
 */
import java.util.*;
public class metodos_ejer6_jorge{
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        double total=0.00;
        int cont_cliente=0;
        System.out.println("¿Cuántos clientes estacionaron ayer?");
        int clientes=teclado.nextInt();
        for(int i=1;i<=clientes;i++){
            System.out.println("Ingrese las horas estacionadas por el cliente "+i);
            double horas=teclado.nextDouble();
            double pago=calcularPagos(horas);
            System.out.println("El pago para el cliente "+i+" es de: "+pago+"€");
            total+=pago;
            cont_cliente++;
        }
        System.out.println("\nEl total de los pagos de ayer para "+cont_cliente+" es de: "+total+"€");
    }
    public static double calcularPagos(double horas){
        double pago;
        if(horas<=3){
            pago=2.00;
        }else{
            double horasExtra=horas-3;
            pago=2.00+(horasExtra*0.50);
        }
        if(pago>10.00){
            pago=10.00;
        }
        return pago;
    }
}