package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Envio;

import java.util.List;

public interface EnvioRepository {

    void salvar(Envio envio);

    List<Envio> listar();

}