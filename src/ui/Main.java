package ui;

import data.GestorDatos;
import model.Tour;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Muestra los tours disponibles y los gastronomicos.
 */
public class Main {

    /**
     * Lee los tours, recorre la lista y aplica un filtro.
     */
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();

        try {
            ArrayList<Tour> tours =
                    gestor.cargarTours("resources/tours.txt");

            System.out.println("TODOS LOS TOURS");

            for (Tour tour : tours) {
                System.out.println(tour);
            }

            System.out.println("\nTOURS GASTRONOMICOS");

            for (Tour tour : tours) {
                if (tour.getTipo().equalsIgnoreCase("Gastronomico")) {
                    System.out.println(tour);
                }
            }

        } catch (IOException e) {
            System.out.println(
                    "No se pudo leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(
                    "Revisa los precios: deben ser numeros enteros.");
        }
    }
}