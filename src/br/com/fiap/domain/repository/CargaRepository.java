package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Carga;

import java.util.List;

public interface CargaRepository {

    void salvar(Carga carga);

    Carga buscarPorId(Long id);

    List<Carga> listar();

    void remover(Long id);

}