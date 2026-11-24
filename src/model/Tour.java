package model;

/**
 * Representa un tour con su destino y operador.
 */
public class Tour {

    private String nombre;
    private String tipo;
    private int precio;
    private Destino destino;
    private Operador operador;

    /** Crea un tour y valida sus datos. */
    public Tour(String nombre, String tipo, int precio,
                Destino destino, Operador operador) {
        setNombre(nombre);
        setTipo(tipo);
        setPrecio(precio);
        setDestino(destino);
        setOperador(operador);
    }

    /** Devuelve el nombre. */
    public String getNombre() {
        return nombre;
    }

    /** Cambia el nombre y evita valores vacios. */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre del tour es obligatorio.");
        }
        this.nombre = nombre.trim();
    }

    /** Devuelve el tipo. */
    public String getTipo() {
        return tipo;
    }

    /** Cambia el tipo y evita valores vacios. */
    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException(
                    "El tipo de tour es obligatorio.");
        }
        this.tipo = tipo.trim();
    }

    /** Devuelve el precio. */
    public int getPrecio() {
        return precio;
    }

    /** Cambia el precio y exige un valor positivo. */
    public void setPrecio(int precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException(
                    "El precio debe ser mayor que cero.");
        }
        this.precio = precio;
    }

    /** Devuelve el destino. */
    public Destino getDestino() {
        return destino;
    }

    /** Cambia el destino y comprueba que exista. */
    public void setDestino(Destino destino) {
        if (destino == null) {
            throw new IllegalArgumentException(
                    "El destino es obligatorio.");
        }
        this.destino = destino;
    }

    /** Devuelve el operador. */
    public Operador getOperador() {
        return operador;
    }

    /** Cambia el operador y comprueba que exista. */
    public void setOperador(Operador operador) {
        if (operador == null) {
            throw new IllegalArgumentException(
                    "El operador es obligatorio.");
        }
        this.operador = operador;
    }

    /** Devuelve todos los datos del tour. */
    @Override
    public String toString() {
        return "Tour: " + nombre
                + ", Tipo: " + tipo
                + ", Precio: $" + precio
                + ", Destino: " + destino
                + ", Operador: " + operador;
    }
}