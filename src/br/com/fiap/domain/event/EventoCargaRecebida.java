package br.com.fiap.domain.event;

public class EventoCargaRecebida {

    private Long idCarga;

    public EventoCargaRecebida(Long idCarga) {
        this.idCarga = idCarga;
    }

    public Long getIdCarga() {
        return idCarga;
    }

}