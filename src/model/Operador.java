package model;

/**
 * Representa al responsable de realizar un tour.
 */
public class Operador {

    private String nombre;
    private String telefono;

    /** Crea un operador con nombre y telefono. */
    public Operador(String nombre, String telefono) {
        setNombre(nombre);
        setTelefono(telefono);
    }

    /** Devuelve el nombre del operador. */
    public String getNombre() {
        return nombre;
    }

    /** Cambia el nombre y evita valores vacios. */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre del operador es obligatorio.");
        }

        this.nombre = nombre.trim();
    }

    /** Devuelve el telefono. */
    public String getTelefono() {
        return telefono;
    }

    /** Cambia el telefono y valida su formato. */
    public void setTelefono(String telefono) {
        if (telefono == null
                || !telefono.trim().matches("\\+?[0-9]{8,15}")) {
            throw new IllegalArgumentException(
                    "El telefono debe tener entre 8 y 15 digitos.");
        }

        this.telefono = telefono.trim();
    }

    /** Devuelve los datos del operador. */
    @Override
    public String toString() {
        return nombre + ", Telefono: " + telefono;
    }
}