package data;

import model.Destino;
import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {
    // Va a buscar los datos que están guardados en el archivo
    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        // Abre el archivo de texto de forma segura
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            // Va leyendo cada línea del archivo una por una
            while ((linea = br.readLine()) != null) {
                // Si no hay nada escrito en la línea, pasa a la siguiente
                if (linea.trim().isEmpty()) {
                    continue;
                }

                // Separa el texto por cada punto y coma
                String[] partes = linea.split(";");

                // Revisamos que la línea esté completa con sus 6 datos
                if (partes.length == 6) {
                    try {
                        String nombre = partes[0].trim();
                        String tipo = partes[1].trim();
                        int precio = Integer.parseInt(partes[2].trim());
                        int maxPasajero = Integer.parseInt(partes[3].trim());
                        String comuna = partes[4].trim();
                        String region = partes[5].trim();

                        // Conectamos los datos del destino con el viaje
                        Destino destino = new Destino(comuna, region);
                        Tour nuevoTour = new Tour(nombre, tipo, precio, maxPasajero, destino);
                        listaTours.add(nuevoTour);
                    } catch (NumberFormatException nfe) {
                        System.out.println("Error en formato numérico en la línea: " + linea);
                    }
                } else {
                    System.out.println("Línea ignorada (no tiene 6 columnas): " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return listaTours;
    }
}