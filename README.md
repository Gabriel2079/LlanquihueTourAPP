# Proyecto: LlanquihueTourApp

## ¿De qué se trata?
Este es un programa de computador hecho en Java para ayudar a la agencia de viajes "Llanquihue Tour". Sirve para leer una lista de paseos guardada en un bloc de notas (`.txt`), ordenar esa información en la memoria de la computadora y permitir buscar viajes automáticamente (por ejemplo, encontrar rápido solo los paseos de comida). Así, la agencia no tiene que hacer todo a mano y se evitan errores.

## ¿Cómo ordené las carpetas en el proyecto?
Para que el código no fuera un desorden, separé los archivos en 4 carpetas llamadas "paquetes":

* **app**: Adentro está `Main.java`, que es el archivo principal que hace arrancar y funcionar todo el sistema.
* **data**: Adentro está `GestorDatos.java`, que es el archivo que se encarga de abrir y leer el bloc de notas donde están los viajes.
* **model**: Aquí guardo las plantillas o moldes de los datos:
    * `Tour.java`: Guarda los datos básicos del viaje (su nombre, qué tipo es, cuánto cuesta y cuánta gente cabe).
    * `Destino.java`: Guarda el lugar (la comuna y la región). Este archivo lo metí dentro de los datos del tour para que queden conectados (a esto en programación le llamamos composición).
* **service**: Adentro está `FiltroServicio.java`, que es el archivo que hace el trabajo de buscar y filtrar los viajes para mostrarlos limpios en la pantalla.

## ¿Cómo hacer andar el programa?
Para probar el sistema en tu computadora, solo sigue estos pasos:

1. Abre el programa IntelliJ IDEA y carga el proyecto.
2. Revisa que el archivo de texto `tours.txt` esté metido en la carpeta llamada `resources`.
3. Ve a la carpeta `src`, busca la carpetita `app` y abre el archivo `Main.java`.
4. Haz clic en el botón verde de "Play" (Run) que está arriba a la derecha.
5. El programa va a leer el bloc de notas y te va a mostrar en la pantalla de abajo la lista de todos los viajes y, justo después, te dejará ordenados solo los que dicen "Gastronómico".
