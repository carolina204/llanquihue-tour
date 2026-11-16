package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Lee los tours desde un archivo de texto.
 */
public class GestorDatos {

    /**
     * Lee el archivo y devuelve una lista de tours.
     */
    public ArrayList<Tour> cargarTours(String ruta)
            throws IOException {

        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader lector = Files.newBufferedReader(
                Path.of(ruta), StandardCharsets.UTF_8)) {

            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);

                Tour tour = new Tour(nombre, tipo, precio);
                tours.add(tour);
            }
        }

        return tours;
    }
}