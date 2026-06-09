package br.com.fiap.infrastructure.repository;

import br.com.fiap.domain.entity.Envio;
import br.com.fiap.domain.repository.EnvioRepository;

import java.util.ArrayList;
import java.util.List;

public class EnvioRepositoryMock implements EnvioRepository {

    private List<Envio> envios = new ArrayList<>();

    @Override
    public void salvar(Envio envio) {
        envios.add(envio);
    }

    @Override
    public List<Envio> listar() {
        return envios;
    }

}