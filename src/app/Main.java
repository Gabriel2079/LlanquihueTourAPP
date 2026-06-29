package app;

import data.GestorDatos;
import model.Tour;
import service.FiltroServicio;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crea el gestor para el archivo de texto
        GestorDatos gestor = new GestorDatos();

        // Ruta del TXT.
        String ruta = "resources/tours.txt";

        // Carga el archivo en la lista.
        ArrayList<Tour> todosLosTours = gestor.cargarTours(ruta);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" ¡MIRA TODOS LOS TOURS QUE TENEMOS DISPONIBLES! ");
        for (Tour t : todosLosTours) {
            System.out.println(t);
        }
        System.out.println("-------------------------------------------------------------------------------");

        // Manda a buscar los tours usando el filtro del paquete service
        FiltroServicio.filtrarPorTipo(todosLosTours,"Gastronómico");

        System.out.println("-------------------------------------------------------------------------------");

        // Imprime en pantalla la lista con los nuevos paseos
        data.GestorServicios nuevoGestor = new data.GestorServicios();
        nuevoGestor.ejecutarPrueba();
    }
}

