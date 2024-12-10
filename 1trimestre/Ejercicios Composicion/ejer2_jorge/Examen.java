package ejer2_jorge;

public class Examen {
    private String asignatura;
    private String aula;
    private Fecha fecha;
    private Hora hora;

    // Constructor
    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = new Fecha(fecha.getDia(), fecha.getMes(), fecha.getAnio()); // Crear una copia
        this.hora = new Hora(hora.getHora(), hora.getMinuto()); // Crear una copia
    }

    // Métodos getters
    public String getAsignatura() { return asignatura; }
    public String getAula() { return aula; }
    public Fecha getFecha() { 
        return new Fecha(fecha.getDia(), fecha.getMes(), fecha.getAnio()); // Retornar copia
    }
    public Hora getHora() { 
        return new Hora(hora.getHora(), hora.getMinuto()); // Retornar copia
    }

    // Métodos setters
    public void setFecha(Fecha fecha) {
        this.fecha = new Fecha(fecha.getDia(), fecha.getMes(), fecha.getAnio()); // Crear una copia
    }
    public void setHora(Hora hora) {
        this.hora = new Hora(hora.getHora(), hora.getMinuto()); // Crear una copia
    }

    // Método toString()
    public String toString() {
        return String.format("Asignatura: %s\nAula: %s\nFecha: %s\nHora: %s", 
                              asignatura, aula, fecha.toString(), hora.toString());
    }
}