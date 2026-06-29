# LlanquihueTourApp - Sistema Llanquihue Tour

##  ¿De qué se trata este proyecto?
Este proyecto lo armé para digitalizar la forma en que trabaja la agencia de turismo **Llanquihue Tour**. 

El sistema hace dos cosas principales:
1. **Manejo de datos antiguos (Semana 5):** Lee de forma automática un archivo de texto (`tours.txt`) con los viajes disponibles, los organiza según su destino (comuna y región) y tiene un buscador para filtrar rápidamente (por ejemplo, buscar sólo los tours "Gastronómicos").
2. **Nueva estructura de servicios (Semana 6):** Organiza de manera inteligente los diferentes tipos de actividades que ofrece la agencia (Rutas Gastronómicas, Paseos Lacustres y Excursiones Culturales) usando herencia en Java. Esto permite que compartan datos básicos como el nombre y la duración, pero manteniendo sus detalles únicos (como el número de paradas o el tipo de embarcación).

---

## Organización del código (Paquetes)
Para que el proyecto sea ordenado y fácil de entender, dividí el código en estas carpetas:

* **`app`:** Es el punto de partida. Aquí está el archivo `Main.java` que ejecuta todo el programa y muestra los resultados en la consola.
* **`data`:** Aquí está el cerebro de los datos. Contiene `GestorDatos.java` (que abre el archivo de texto) y `GestorServicios.java` (que crea los ejemplos de prueba con los nuevos paseos de esta semana).
* **`model`:** Aquí guardo las plantillas de los objetos: `Tour`, `Destino`, `ServicioTuristico`, `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.
* **`service`:** Contiene las herramientas de búsqueda, como el filtro para separar los viajes por su tipo.

---

## ¿Cómo hacerlo funcionar?

### 1. Requisitos
* Tener Java instalado (JDK 17 o superior).
* Usar un editor como IntelliJ IDEA.

### 2. El archivo de texto
Asegúrate de tener la carpeta `resources` y dentro de ella el archivo `tours.txt` separado por puntos y comas (`;`), por ejemplo:
```text
Tour Ruta del Curanto;Gastronómico;45000;12;Frutillar;Región de Los Lagos
Navegación Volcán;Lacustre;35000;20;Puerto Varas;Región de Los Lagos
Sendero Alerce Andino;Cultural;25000;15;Puerto Montt;Región de Los Lagos
