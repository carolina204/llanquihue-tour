package ui;

import data.GestorDatos;
import model.Tour;
import service.CatalogoTours;

import java.io.IOException;
import java.util.Scanner;

/**
 * Muestra los tours y permite buscar por nombre.
 */
public class Main {

    /** Ejecuta la carga, el filtro y la busqueda. */
    public static void main(String[] args) {
        String ruta = args.length > 0
                ? args[0] : "resources/tours.txt";

        GestorDatos gestor = new GestorDatos();

        try {
            CatalogoTours catalogo = gestor.cargarTours(ruta);

            System.out.println("LLANQUIHUE TOUR");
            System.out.println(catalogo);

            System.out.println("\nTODOS LOS TOURS");
            for (Tour tour : catalogo.listar()) {
                System.out.println(tour);
            }

            System.out.println("\nTOURS GASTRONOMICOS");
            for (Tour tour :
                    catalogo.filtrarPorTipo("Gastronomico")) {
                System.out.println(tour);
            }

            try (Scanner teclado = new Scanner(System.in)) {
                System.out.print(
                        "\nEscribe el nombre del tour a buscar: ");

                String nombre = teclado.nextLine();
                Tour encontrado =
                        catalogo.buscarPorNombre(nombre);

                if (encontrado == null) {
                    System.out.println("No se encontro ese tour.");
                } else {
                    System.out.println("\nRESULTADO DE LA BUSQUEDA");
                    System.out.println(encontrado);
                }
            }

        } catch (IOException e) {
            System.out.println(
                    "No se pudo leer el archivo: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Dato incorrecto: " + e.getMessage());
        }
    }
}