package ejer2_jorge;

public class main {
    public static void main(String[] args) {
        // Crear objeto Fecha
        Fecha fecha = new Fecha(12, 5, 2024);

        // Crear objeto Hora
        Hora hora = new Hora(10, 30);

        // Crear objeto Examen
        Examen examen = new Examen("Matemáticas", "Aula 101", fecha, hora);

        // Mostrar el examen
        System.out.println("Datos iniciales del examen:");
        System.out.println(examen);

        // Modificar fecha y hora originales
        fecha = new Fecha(1, 1, 2025);
        hora = new Hora(12, 45);

        // Comprobar que el examen no se altera
        System.out.println("\nExamen después de modificar los objetos Fecha y Hora originales:");
        System.out.println(examen);

        // Obtener y modificar la fecha y hora del examen
        Fecha fechaDelExamen = examen.getFecha();
        Hora horaDelExamen = examen.getHora();

        fechaDelExamen = new Fecha(15, 7, 2026);
        horaDelExamen = new Hora(14, 50);

        System.out.println("\nFecha y hora del examen modificados externamente:");
        System.out.println("Fecha: " + fechaDelExamen);
        System.out.println("Hora: " + horaDelExamen);

        // Modificar los datos del examen directamente
        examen.setFecha(new Fecha(20, 9, 2023));
        examen.setHora(new Hora(8, 15));

        System.out.println("\nExamen después de modificar los datos directamente:");
        System.out.println(examen);
    }
}