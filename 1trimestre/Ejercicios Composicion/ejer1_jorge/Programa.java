package ejer1_jorge;
import java.util.Scanner;

public class Programa {
    public static persona[] leerPersonas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas personas quieres introducir? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        persona[] personas = new persona[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Código Postal: ");
            String codigoPostal = scanner.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();
            System.out.print("Fecha de nacimiento (día mes año): ");
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();
            int anio = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            personas[i] = new persona(nombre, direccion, codigoPostal, ciudad, new fecha(dia, mes, anio));
        }
        return personas;
    }

    public static void mostrar(persona[] personas) {
        for (persona persona : personas) {
            System.out.println(persona);
            System.out.println();
        }
    }

    public static int numeroDePersonas(persona[] personas) {
        return personas.length;
    }

    public static persona personaMayorEdad(persona[] personas) {
        persona mayor = personas[0];
        for (persona persona : personas) {
            if (persona.getFechaNacimiento().esMayorQue(mayor.getFechaNacimiento())) {
                mayor = persona;
            }
        }
        return mayor;
    }

    public static int cuantasPersonasVivenEn(persona[] personas, String ciudad) {
        int contador = 0;
        for (persona persona : personas) {
            if (persona.getCiudad().equalsIgnoreCase(ciudad)) {
                contador++;
            }
        }
        return contador;
    }

    public static int personasMayoresDeEdad(persona[] personas) {
        int contador = 0;
        for (persona persona : personas) {
            if (persona.esMayorDeEdad()) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        persona[] personas = leerPersonas();
        mostrar(personas);
        System.out.println("Número de personas: " + numeroDePersonas(personas));
        System.out.println("Persona de mayor edad: ");
        System.out.println(personaMayorEdad(personas));
        System.out.println("Número de personas mayores de edad: " + personasMayoresDeEdad(personas));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una ciudad para buscar cuántas personas viven allí: ");
        String ciudad = scanner.nextLine();
        System.out.println("Personas que viven en " + ciudad + ": " + cuantasPersonasVivenEn(personas, ciudad));
    }
}