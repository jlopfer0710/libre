/*22.Escriba una aplicación que simule el lanzamiento de monedas. Deje que el programa lance una
moneda cada vez que el usuario seleccione la opción del menú “Lanzar moneda”. Cuente el numero
de veces que aparezca cada uno de los lados de la moneda. Muestre los resultados. El programa
debe llamar a un método separado, llamado tirar, que no tome argumentos y devuelva false en caso
de cara, y true en caso de cruz. [Nota: si el programa simula en forma realista el lanzamiento de
monedas, cada lado de la moneda debe aparecer aproximadamente la mitad del tiempo.] */
import java.util.*;
public class metodos_ejer22_jorge {
    public static Scanner teclado= new Scanner(System.in);
    public static void main(String[] args) {
        int caras = 0;
        int cruces = 0;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Lanzar moneda");
            System.out.println("2. Ver resultados");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            
            int opcion = teclado.nextInt();

            if (opcion == 1) {
                boolean resultado = tirar();
                if (resultado) {
                    cruces++; 
                    System.out.println("Cruz");
                } else {
                    caras++;
                    System.out.println("Cara");
                }
            } else if (opcion == 2) {
                System.out.println("Resultados hasta ahora:");
                System.out.println("Número de caras: " + caras);
                System.out.println("Número de cruces: " + cruces);
            } else if (opcion == 3) {
                System.out.println("¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, selecciona nuevamente.");
            }
        }
    }
    public static boolean tirar() {
        Random random = new Random();
        return random.nextBoolean(); 
    }

}
