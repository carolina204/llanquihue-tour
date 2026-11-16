package model;

/**
 * Representa un tour de la agencia.
 */
public class Tour {

    private String nombre;
    private String tipo;
    private int precio;

    /** Crea un tour con nombre, tipo y precio. */
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    /** Devuelve el nombre. */
    public String getNombre() {
        return nombre;
    }

    /** Cambia el nombre. */
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /** Devuelve el tipo. */
    public String getTipo() {
        return tipo;
    }

    /** Cambia el tipo. */
    public void setTipo(String nuevoTipo) {
        tipo = nuevoTipo;
    }

    /** Devuelve el precio. */
    public int getPrecio() {
        return precio;
    }

    /** Cambia el precio. */
    public void setPrecio(int nuevoPrecio) {
        precio = nuevoPrecio;
    }

    /** Devuelve los datos del tour como texto. */
    @Override
    public String toString() {
        return "Tour: " + nombre
                + ", Tipo: " + tipo
                + ", Precio: $" + precio;
    }
}