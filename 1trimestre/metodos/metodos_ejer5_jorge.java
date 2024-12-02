/*5.- Escriba una aplicacion completa en Java que pida al usuario el radio de tipo double de una
esfera, y que llame al metodo volumenEsfera para calcular y mostrar el volumen de esa esfera.
Utilice la siguiente asignacion para calcular el volumen:
double volumen = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radio, 3 )*/
import java.util.*;
public class metodos_ejer5_jorge {
    public static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Introduce el radio de la esfera");
        double radio=teclado.nextDouble();
        double volumen=volumenEsfera(radio);
        System.out.printf("El volumen de la esfera con el radio: %.2f es %.2f\n",radio,volumen);
    }
    public static double volumenEsfera(double radio){
        return (4.0/3.0)*Math.PI*Math.pow(radio, 3);
    }
}
