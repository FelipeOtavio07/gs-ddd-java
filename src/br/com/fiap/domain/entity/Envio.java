package br.com.fiap.domain.entity;

import java.time.LocalDateTime;

public class Envio {

    private Long id;
    private Carga carga;
    private LocalDateTime dataEnvio;

    public Envio(Long id, Carga carga) {
        this.id = id;
        this.carga = carga;
        this.dataEnvio = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Carga getCarga() {
        return carga;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

}