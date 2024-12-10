package ejer5;

public class Comercial extends Empleado {
    private double comision;

    // Constructor
    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    // Getter y Setter de comision
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void plus() {
        // Aplicar el PLUS si tiene más de 30 años y comisión mayor de 200€
        if (edad > 30 && comision > 200) {
            salario += PLUS;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Comisión: " + comision;
    }
}
