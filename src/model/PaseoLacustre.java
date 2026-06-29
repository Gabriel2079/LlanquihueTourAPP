package model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    // Copia los datos básicos del servicio general
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getter y Setter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    // Ordena los datos para que se impriman bonito en la pantalla
    @Override
    public String toString() {
        return super.toString() + ", Tipo de Embarcación: " + tipoEmbarcacion;
    }
}