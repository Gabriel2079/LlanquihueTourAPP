package model;

public class Tour {
    private String nombre;
    private String tipo;
    private int precio;
    private int maxPasajeros;
    private Destino destino;

    public Tour(String nombre, String tipo, int precio, int maxPasajeros, Destino destino) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.maxPasajeros = maxPasajeros;
        this.destino = destino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMaxPasajeros() {
        return this.maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
    //mostrar la información ordenada
    @Override
    public String toString() {
        return "Tour: " + nombre + " | Tipo: " + tipo + " | Precio: $" + precio + " | Maximo de Pasajeros: " + maxPasajeros + " | Destino: " + destino;
    }
}