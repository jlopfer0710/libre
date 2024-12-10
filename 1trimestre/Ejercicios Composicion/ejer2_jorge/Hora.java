package ejer2_jorge;

public class Hora {
    private int hora;
    private int minuto;

    // Constructor
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    // Métodos getters
    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }

    // Método toString()
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}