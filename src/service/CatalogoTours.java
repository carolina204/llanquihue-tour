package service;

import model.Tour;
import java.util.ArrayList;

/**
 * Administra una coleccion de tours y permite buscar y filtrar.
 */
public class CatalogoTours {

    private final ArrayList<Tour> tours;

    /** Crea un catalogo vacio. */
    public CatalogoTours() {
        tours = new ArrayList<>();
    }

    /** Agrega un tour y evita nombres duplicados. */
    public void agregar(Tour tour) {
        if (tour == null) {
            throw new IllegalArgumentException(
                    "El tour no puede ser nulo.");
        }

        if (buscarPorNombre(tour.getNombre()) != null) {
            throw new IllegalArgumentException(
                    "Ya existe un tour con ese nombre.");
        }

        tours.add(tour);
    }

    /** Devuelve una copia de la lista de tours. */
    public ArrayList<Tour> listar() {
        return new ArrayList<>(tours);
    }

    /** Busca por nombre y devuelve null si no encuentra el tour. */
    public Tour buscarPorNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre de busqueda es obligatorio.");
        }

        for (Tour tour : tours) {
            if (tour.getNombre().equalsIgnoreCase(nombre.trim())) {
                return tour;
            }
        }

        return null;
    }

    /** Devuelve los tours del tipo indicado. */
    public ArrayList<Tour> filtrarPorTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException(
                    "El tipo es obligatorio.");
        }

        ArrayList<Tour> resultado = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase(tipo.trim())) {
                resultado.add(tour);
            }
        }

        return resultado;
    }

    /** Devuelve la cantidad de tours. */
    public int cantidad() {
        return tours.size();
    }

    /** Describe el catalogo como texto. */
    @Override
    public String toString() {
        return "Catalogo con " + cantidad() + " tours.";
    }
}