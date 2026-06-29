package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    // Copia los datos básicos del servicio general
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // Getter y Setter
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    // Ordena los datos para que se impriman bonito en la pantalla
    @Override
    public String toString() {
        return super.toString() + ", Lugar Histórico: " + lugarHistorico;
    }
}