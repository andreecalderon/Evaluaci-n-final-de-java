package view;

import java.time.LocalDate;

public class TareaView {
    private String Titulo;
    private String Descripción;
    private LocalDate FechaLimite;
    private String estado;

    public TareaView(String titulo, String descripción, String estado) {
    this.Titulo = Titulo;
    this.Descripción = Descripción;
    this.estado = estado;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String descripción) {
        this.Descripción = descripción;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
