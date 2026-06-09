package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Carga;

public class ServicoLogistica {

    public void enviarCarga(Carga carga) {
        carga.enviar();
    }

    public void receberCarga(Carga carga) {
        carga.receber();
    }

}