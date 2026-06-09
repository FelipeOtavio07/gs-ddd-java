package br.com.fiap.domain.event;

public class EventoCargaCadastrada {

    private Long idCarga;

    public EventoCargaCadastrada(Long idCarga) {
        this.idCarga = idCarga;
    }

    public Long getIdCarga() {
        return idCarga;
    }

}
