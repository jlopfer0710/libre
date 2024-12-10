package ejer5;

public class Repartidor extends Empleado {
    private String zona;

    // Constructor
    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    // Getter y Setter de zona
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public void plus() {
        // Aplicar el PLUS si tiene menos de 25 años y reparte en la "zona 3"
        if (edad < 25 && "zona 3".equals(zona)) {
            salario += PLUS;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Zona: " + zona;
    }
}

