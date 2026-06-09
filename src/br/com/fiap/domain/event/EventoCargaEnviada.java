package br.com.fiap.domain.event;

public class EventoCargaEnviada {

    private Long idCarga;

    public EventoCargaEnviada(Long idCarga) {
        this.idCarga = idCarga;
    }

    public Long getIdCarga() {
        return idCarga;
    }

}