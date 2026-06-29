package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    // Prepara y muestra los servicios turísticos en la consola
    public void ejecutarPrueba() {
        System.out.println(" ¡BIENVENIDOS A LLANQUIHUE TOUR! - NUESTROS SERVICIOS \n");

        // Creamos dos ejemplos de rutas gastronómicas
        RutaGastronomica ruta1 = new RutaGastronomica("Sabores de Frutillar", 4, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Circuito Asado Patagónico", 6, 3);

        // Creamos dos ejemplos de paseos en lancha o lago
        PaseoLacustre paseo1 = new PaseoLacustre("Navegación Lago Llanquihue", 2, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Aventura en Kayak Volcán Osorno", 3, "Kayak Doble");

        // Creamos dos ejemplos de excursiones culturales
        ExcursionCultural excursion1 = new ExcursionCultural("Ruta Colonos Alemanes", 5, "Museo Colonial Alemán");
        ExcursionCultural excursion2 = new ExcursionCultural("Vestigios de Puerto Varas", 3, "Iglesia Sagrado Corazón de Jesús");

        // Imprime la lista de cada servicio en la consola
        System.out.println("[Ruta Gastronómica 1] " + ruta1);
        System.out.println("[Ruta Gastronómica 2] " + ruta2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("[Paseo Lacustre 1]    " + paseo1);
        System.out.println("[Paseo Lacustre 2]    " + paseo2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("[Excursión Cultural 1] " + excursion1);
        System.out.println("[Excursión Cultural 2] " + excursion2);
    }
}