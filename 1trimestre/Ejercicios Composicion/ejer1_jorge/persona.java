package ejer1_jorge;
import java.util.Calendar;

public class persona {
    private String nombre;
    private String direccion;
    private String codigoPostal;
    private String ciudad;
    private fecha fechaNacimiento;

    // Constructor por defecto
    public persona() {
        this.nombre = "";
        this.direccion = "";
        this.codigoPostal = "";
        this.ciudad = "";
        this.fechaNacimiento = new fecha();
    }

    // Constructor con parámetros
    public persona(String nombre, String direccion, String codigoPostal, String ciudad, fecha fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(String codigoPostal) { this.codigoPostal = codigoPostal; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public fecha getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(fecha fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    // Método toString()
    public String toString() {
        return String.format(
            "Nombre: %s\nFecha Nacimiento: %s\nDirección: %s\n%s %s",
            nombre, fechaNacimiento.toString(), direccion, codigoPostal, ciudad
        );
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        Calendar hoy = Calendar.getInstance();
        int anioActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH) + 1;
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);

        fecha fechaActual = new fecha(diaActual, mesActual, anioActual);
        return fechaNacimiento.esMayorQue(new fecha(1, 1, anioActual - 18));
    }
}