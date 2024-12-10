package ejer1_jorge;

public class fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor por defecto
    public fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2020;
    }

    // Constructor con parámetros
    public fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Métodos getters
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

    // Métodos setters
    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAnio(int anio) { this.anio = anio; }

    // Método toString()
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }

    // Método para comparar fechas
    public boolean esMayorQue(fecha f) {
        if (this.anio > f.anio) return true;
        if (this.anio == f.anio && this.mes > f.mes) return true;
        if (this.anio == f.anio && this.mes == f.mes && this.dia > f.dia) return true;
        return false;
    }
}
