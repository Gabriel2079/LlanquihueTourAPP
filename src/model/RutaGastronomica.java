package model;

public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    // Copia los datos básicos del servicio general
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // Getter y Setter
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    // Ordena los datos para que se impriman bonito en la pantalla
    @Override
    public String toString() {
        return super.toString() + ", Número de Paradas: " + numeroDeParadas;
    }
}