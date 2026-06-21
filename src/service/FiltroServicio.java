package service;

import model.Tour;
import java.util.ArrayList;

public class FiltroServicio {

    public static void filtrarPorTipo(ArrayList<Tour> tours, String tipoBuscado) {
        System.out.println("=== BUSCANDO VIAJES QUE SEAN DE TIPO: " + tipoBuscado.toUpperCase() + " ===");
        boolean encontrado = false;

        for (Tour t : tours) {
            if (t.getTipo().equalsIgnoreCase(tipoBuscado)) {
                System.out.println(t);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours del tipo: " + tipoBuscado);
        }
    }
}