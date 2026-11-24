package data;

import model.Destino;
import model.Operador;
import model.Tour;
import service.CatalogoTours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Lee los tours desde un archivo de texto.
 */
public class GestorDatos {

    /**
     * Carga los registros validos en un catalogo.
     */
    public CatalogoTours cargarTours(String ruta) throws IOException {
        CatalogoTours catalogo = new CatalogoTours();

        try (BufferedReader lector = Files.newBufferedReader(
                Path.of(ruta), StandardCharsets.UTF_8)) {

            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {
                numeroLinea++;

                if (linea.isBlank()) {
                    continue;
                }

                try {
                    String[] datos = linea.split(";", -1);

                    if (datos.length != 7) {
                        throw new IllegalArgumentException(
                                "Cada linea debe tener siete campos.");
                    }

                    int precio = Integer.parseInt(datos[2].trim());

                    Destino destino = new Destino(
                            datos[3], datos[4]);

                    Operador operador = new Operador(
                            datos[5], datos[6]);

                    Tour tour = new Tour(
                            datos[0], datos[1], precio,
                            destino, operador);

                    catalogo.agregar(tour);

                } catch (IllegalArgumentException e) {
                    System.out.println(
                            "Registro omitido en linea " + numeroLinea
                                    + ": " + e.getMessage());
                }
            }
        }

        return catalogo;
    }
}