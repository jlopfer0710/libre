
/*2.- Escriba una aplicacion que pruebe si los ejemplos de las llamadas a los metodos de la clase Math
que se muestran la siguiente tabla realmente producen los resultados indicados.*/
import java.util.*;

public class metodos_ejer2_jorge {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;
        do {
            System.out.println("Elije entre las siguientes opciones para hacer un método de la clase Math\n");
            System.out.println(
                    "1.Valor absoluto de x\n2.Redondear x al entero más pequeño que no sea menor de x\n3.Coseno de x\n4.Método exponencial \n5.Redondea x al entero más grande que no sea nayor de X \n6.Logaritmo natural de x \n7.El valor más grande entre X e Y\n8.El valor más pequeño entre X e Y \n9.x elevado a la potencia y \n10.Seno trigonométrico de x \n11.Raíz cuadrada de x \n12.Tangente de x\n ");
            op = teclado.nextInt();
            switch (op) {
                case 0:
                    System.out.println("FIN.");
                    break;
                case 1:
                    System.out.println(Math.abs(23.7));
                    System.out.println(Math.abs(0.0));
                    System.out.println(Math.abs(-23.7));
                    break;
                case 2:
                    System.out.println(Math.ceil(9.2));
                    System.out.println(Math.ceil(-9.8));
                    break;
                case 3:
                    System.out.println(Math.cos(0.0));
                    break;
                case 4:
                    System.out.println(Math.exp(1.0));
                    System.out.println(Math.exp(2.0));
                    break;
                case 5:
                    System.out.println(Math.floor(9.2));
                    System.out.println(Math.floor(-9.8));
                    break;
                case 6:
                    System.out.println(Math.log(Math.E));
                    System.out.println(Math.log(Math.E*Math.E));
                    break;
                case 7:
                    System.out.println(Math.max(2.3, 12.7));
                    System.out.println(Math.max(-2.3, -12.7));
                    break;
                case 8:
                    System.out.println(Math.min(2.3, 12.7));
                    System.out.println(Math.min(-2.3, -12.7));
                    break;
                case 9:
                    System.out.println(Math.pow(2.0, 7.0));
                    System.out.println(Math.pow(9.0, 035));
                    
                    break;
                case 10:
                    System.out.println(Math.sin(0.0));
                    
                    break;
                case 11:
                    System.out.println(Math.sqrt(900.0));
                    break;
                case 12:
                    System.out.println(Math.tan(0.0));
                    break;
                default:
                    System.out.println("Fuera del rango de datos");
                    break;
            }
        } while (op != 0);
    }
}