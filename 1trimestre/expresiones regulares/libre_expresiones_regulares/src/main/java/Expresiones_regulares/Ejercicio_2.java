/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones_regulares;

/**
 *
 * @author Jorge López Fernández
 */
/* Realice, mediante el uso de expresiones regulares un método que valide los siguientes formatos: Los distintos métodos deben devolver true si la cadena de texto que se le pasa por parámetro tiene el formato que estamos validando (diferente en cada apartado) o false si no lo tiene. 
1) Validar un número entero. 
2) Validar un número entero positivo. 
3) Validar un número entero negativo. 
4) Validar DNI, 8 números y una letra al final. 
5) Validar una IP. 
6) Validar una matricula de un coche con formato 0000XXX 
7) Validar un número binario. 
8) Validar un número octal. 
9) Validar un número hexadecimal. 
10) Validar numero real. 
11) Validar numero real positivo. 
12) Validar numero real negativo. 
13) Validar numero real con x decimales. 
14) Validar numero real positivo con x decimales. 
15) Validar numero real negativo con x decimales. 
16) Validar una fecha con formato dd/mm/aaaa 
17) Validar un nombre, incluyendo nombres compuestos. 
18) Validar un email. 
19) Valida un nombre de usuario en twitter, empieza por @ y puede contener letras mayusculas y minusculas, numeros, guiones y guiones bajos. 
20) Validar ISBN de 13 digitos, siempre empieza en 978 o 979.*/
import java.util.*;
public class Ejercicio_2 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[]args){
        String frase="";
        int eleccion=1;
        do{
            System.out.println("¿Qué desea hacer?:\n0.Salir \n1.Validar un número entero. \n2.Validar un número entero positivo. "
                    + "\n3.Validar un número entero negativo. \n4.Validar DNI, 8 números y una letra al final.\n5.Validar una IP. "
                    + "\n6.Validar una matricula de un coche con formato 0000XXX \n7.Validar un número binario."
                    + "\n8.Validar un número octal. \n9.Validar un número hexadecimal. \n10.Validar numero real. \n11.Validar numero real positivo. "
                    + "\n12.Validar numero real negativo. \n13.Validar numero real con x decimales. \n14.Validar numero real positivo con x decimales. "
                    + "\n15.Validar numero real negativo con x decimales. \n16.Validar una fecha con formato dd/mm/aaaa \n17.Validar un nombre, incluyendo nombres compuestos."
                    + "\n18.Validar un email. \n19.alida un nombre de usuario en twitter, empieza por @ y puede contener letras mayusculas y minusculas, numeros, guiones y guiones bajos. "
                    + "\n20.Validar ISBN de 13 digitos, siempre empieza en 978 o 979.");
                    eleccion=teclado.nextInt();
                    switch(eleccion){
                        case 0->{
                            System.out.println("Fin del programa.");
                        }
                        case 1->{
                            teclado.nextLine();
                            System.out.println("Introduce un número entero: ");
                            frase=teclado.nextLine();
                            System.out.println(validarEntero(frase));
                        }
                        case 2->{
                            teclado.nextLine();
                            System.out.println("Introduce un número entero positivo: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarEnteroPos(frase));
                        }
                        case 3->{
                            teclado.nextLine();
                            System.out.println("Introduce un número entero negativo: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarEnteroNeg(frase));
                        }
                        case 4->{
                            teclado.nextLine();
                            System.out.println("Introduce un DNI: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarDNI(frase));
                        }
                        case 5->{
                            teclado.nextLine();
                            System.out.println("Introduce una IP válida: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarIP(frase));
                        }
                        case 6->{
                            teclado.nextLine();
                            System.out.println("Introduce una matrícula válida: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarMatricula(frase));
                        }
                        case 7->{
                            teclado.nextLine();
                            System.out.println("Introduce un número binario: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarBinario(frase));
                        }
                        case 8->{
                            teclado.nextLine();
                            System.out.println("Introduce un número octal: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarOctal(frase));
                        }
                        case 9->{
                            teclado.nextLine();
                            System.out.println("Introduce un número hexadecimal: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarHexadecimal(frase));
                        }
                        case 10->{
                            teclado.nextLine();
                            System.out.println("Introduce un número real: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarReal(frase));
                        }
                        case 11->{
                            teclado.nextLine();
                            System.out.println("Introduce un número real positivo: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarRealPos(frase));
                        }
                        case 12->{
                            teclado.nextLine();
                            System.out.println("Introduce un número rel negativo: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarRealNeg(frase));
                        }
                        case 13->{
                            teclado.nextLine();
                            System.out.println("Introduce un número real con x decimales: ");                 
                            frase=teclado.nextLine();
                            System.out.println("Introduce los decimales que tiene");
                            eleccion=teclado.nextInt();
                            System.out.println(validarRealDec(frase,eleccion));
                        }
                        case 14->{
                            teclado.nextLine();
                            System.out.println("Introduce un número real positivo con x decimales: ");                 
                            frase=teclado.nextLine();
                            System.out.println("Introduce los decimales que tiene");
                            eleccion=teclado.nextInt();
                            System.out.println(validarRealPosDec(frase,eleccion));
                        }
                        case 15->{
                            teclado.nextLine();
                            System.out.println("Introduce un número real negativo con x decimales: ");                 
                            frase=teclado.nextLine();
                            System.out.println("Introduce los decimales que tiene");
                            eleccion=teclado.nextInt();
                            System.out.println(validarRealNegDec(frase,eleccion));
                        }
                        case 16->{
                            teclado.nextLine();
                            System.out.println("Introduce una fecha con formato dd/mm/aaaa: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarFecha(frase));
                        }
                        case 17->{
                            teclado.nextLine();
                            System.out.println("Introduce un nombre: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarFecha(frase));
                        }
                        case 18->{
                            teclado.nextLine();
                            System.out.println("Introduce un email: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarEmail(frase));
                        }
                        case 19->{
                            teclado.nextLine();
                            System.out.println("Introduce un usuario de Twitter: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarUserX(frase));
                        }
                        case 20->{
                            teclado.nextLine();
                            System.out.println("Introduce un ISBN: ");                 
                            frase=teclado.nextLine();
                            System.out.println(validarISBN(frase));
                        }
                        
                    }
        }while(eleccion!=0);
    }
    public static boolean validarEntero(String frase){
        return frase.matches("-?\\d+");
    }
    public static boolean validarEnteroPos(String frase){
        return frase.matches("\\d+");
    }
    public static boolean validarEnteroNeg(String frase){
        return frase.matches("-\\d+");
    }
    public static boolean validarDNI(String frase){
        return frase.matches("\\d+{8}[A-Za-z]");
    }
    public static boolean validarIP(String frase){
        return frase.matches("((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)");
    }
    public static boolean validarMatricula(String frase){
        return frase.matches("\\d{4}[A-Z]{3}");
    }
    public static boolean validarBinario(String frase){
        return frase.matches("[01]+");
    }
    public static boolean validarOctal(String frase){
        return frase.matches("[0-7]+");
    }
    public static boolean validarHexadecimal(String frase){
        return frase.matches("[0-9A-Fa-f]+");
    }
    public static boolean validarReal(String frase){
        return frase.matches("-?\\d*\\.\\d+");
    }
    public static boolean validarRealPos(String frase){
        return frase.matches("\\d*\\.\\d+");
    }
    public static boolean validarRealNeg(String frase){
        return frase.matches("-\\d*\\.\\d+");
    }
    public static boolean validarRealDec(String frase,int x){
        return frase.matches("-?\\d*\\.\\d{" + x + "}");
    }
    public static boolean validarRealPosDec(String frase,int x){
        return frase.matches("-\\d*\\.\\d{" + x + "}");
    }
    public static boolean validarRealNegDec(String frase, int x){
        return frase.matches("-\\d*\\.\\d{" + x + "}");
    }
    public static boolean validarFecha(String frase){
        return frase.matches("(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/\\d{4}");
    }
    public static boolean validarNombreComp(String frase){
        return frase.matches("[A-Za-zÁÉÍÓÚáéíóúñÑ]+(\\s[A-Za-zÁÉÍÓÚáéíóúñÑ]+)*");
    }
    public static boolean validarEmail(String frase){
        return frase.matches("[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}");
    }
    public static boolean validarUserX(String frase){
        return frase.matches("@[A-Za-z0-9-_]+");
    }
    public static boolean validarISBN(String frase){
        return frase.matches("97[89]\\d{10}");
    }


}