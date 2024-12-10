package ejer2_jorge;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Métodos getters
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

    // Método toString()
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
}