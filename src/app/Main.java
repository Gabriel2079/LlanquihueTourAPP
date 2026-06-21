package app;

import data.GestorDatos;
import model.Tour;
import service.FiltroServicio;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crea
        GestorDatos gestor = new GestorDatos();

        // Ruta del  TXT.
        String ruta = "resources/tours.txt";

        // Carga el archivo en la lista.
        ArrayList<Tour> todosLosTours = gestor.cargarTours(ruta);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("=== ESTOS SON TODOS LOS TOURS QUE ENCONTRÉ ===");
        for (Tour t : todosLosTours) {
            System.out.println(t);
        }
        System.out.println("-------------------------------------------------------------------------------");

        // Manda a buscar los tours usando el filtro del paquete service
        FiltroServicio.filtrarPorTipo(todosLosTours, "Gastronómico");

        System.out.println("-------------------------------------------------------------------------------");
    }
}