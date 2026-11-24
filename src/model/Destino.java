package model;

/**
 * Representa el lugar donde se realiza un tour.
 */
public class Destino {

    private String nombre;
    private String comuna;
    /**
     * Crea un destino con nombre y comuna.
     */
    public Destino(String nombre, String comuna) {
        if (nombre == null || nombre.isBlank()
                || comuna == null || comuna.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre y la comuna son obligatorios.");
        }

        this.nombre = nombre.trim();
        this.comuna = comuna.trim();
    }
    /**
     * Devuelve el nombre del destino.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre, evitando valores vacios.
     */
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre == null || nuevoNombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre del destino es obligatorio.");
        }

        nombre = nuevoNombre.trim();
    }
    /**
     * Devuelve la comuna del destino.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Cambia la comuna, evitando valores vacios.
     */
    public void setComuna(String nuevaComuna) {
        if (nuevaComuna == null || nuevaComuna.isBlank()) {
            throw new IllegalArgumentException(
                    "La comuna es obligatoria.");
        }

        comuna = nuevaComuna.trim();
    }
    /**
     * Devuelve el destino como texto.
     */
    @Override
    public String toString() {
        return nombre + ", Comuna: " + comuna;
    }
}