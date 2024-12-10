package ejer5;

public class main {
    public static void main(String[] args) {
        // Crear empleados
        Comercial comercial1 = new Comercial("Juan", 35, 1500, 250);
        Comercial comercial2 = new Comercial("Maria", 28, 1200, 150);
        Repartidor repartidor1 = new Repartidor("Pedro", 24, 1000, "zona 3");
        Repartidor repartidor2 = new Repartidor("Ana", 26, 1100, "zona 1");

        // Aplicar el PLUS
        comercial1.plus();
        comercial2.plus();
        repartidor1.plus();
        repartidor2.plus();

        // Mostrar resultados
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(repartidor1);
        System.out.println(repartidor2);
    }
}
